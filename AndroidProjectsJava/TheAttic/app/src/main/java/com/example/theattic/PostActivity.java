package com.example.theattic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PostActivity extends AppCompatActivity {

    private ImageButton imageBtn;
    private EditText textTitle;
    private EditText textDesc;
    private Button postBtn;

    private FirebaseAuth mAuth;
    private DatabaseReference mDatabaseUsers;
    private DatabaseReference databaseRef;
    private FirebaseUser mCurrentUser;
    private StorageReference mStorageRef;
    private Uri uri = null;

    private final static int GALLERY_REQUEST_CODE = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_post);
        Toolbar  toolbar  =  findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        postBtn  =  findViewById(R.id.postBtn);
        textDesc  =  findViewById(R.id.textDesc);
        textTitle  =  findViewById(R.id.textTitle);

        mStorageRef = FirebaseStorage.getInstance().getReference();
        databaseRef = FirebaseDatabase.getInstance().getReference().child("Posts");
        mAuth = FirebaseAuth.getInstance();
        mCurrentUser  =  mAuth.getCurrentUser();
        mDatabaseUsers = FirebaseDatabase.getInstance().getReference().child("Users").child(mCurrentUser.getUid());

        imageBtn  =  findViewById(R.id.imgBtn);
        imageBtn.setOnClickListener(new  View.OnClickListener()  {
            @Override
            public void onClick(View view) {
                Intent  galleryIntent  =  new  Intent(Intent.ACTION_GET_CONTENT);
                galleryIntent.setType("image/*");
                startActivityForResult(galleryIntent,  GALLERY_REQUEST_CODE);
            }
        });
        postBtn.setOnClickListener(new  View.OnClickListener()  {
            @Override
            public void onClick(View view) {
                Toast.makeText(PostActivity.this,  "POSTING...",  Toast.LENGTH_LONG).show();

                final String PostTitle = textTitle.getText().toString().trim();
                final String PostDesc = textDesc.getText().toString().trim();


                java.util.Calendar calendar   =   Calendar.getInstance(); SimpleDateFormat currentDate= new SimpleDateFormat("dd-MM-yyyy");
                final  String  saveCurrentDate=currentDate.format(calendar.getTime());

                java.util.Calendar calendar1 = Calendar.getInstance(); SimpleDateFormat currentTime= new SimpleDateFormat("HH:mm");
                final  String    saveCurrentTime=currentTime.format(calendar1.getTime());

                if (!TextUtils.isEmpty(PostDesc) && !TextUtils.isEmpty(PostTitle)) {

                    StorageReference filepath = mStorageRef.child("post_images").child(uri.getLastPathSegment());
                    filepath.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>()  {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            if (taskSnapshot.getMetadata() != null) {
                            if (taskSnapshot.getMetadata().getReference() != null) {
                                Task<Uri> result = taskSnapshot.getStorage().getDownloadUrl();
                                result.addOnSuccessListener(new  OnSuccessListener<Uri>()  { @Override
                                public void onSuccess(Uri uri) {
                final String imageUrl = uri.toString();

                                    Toast.makeText(getApplicationContext(), "Successfully Uploaded",  Toast.LENGTH_SHORT).show();

                                    final DatabaseReference newPost = databaseRef.push();

                                    mDatabaseUsers.addValueEventListener(new  ValueEventListener()  {
                                        @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {
                                        newPost.child("title").setValue(PostTitle);
                                        newPost.child("desc").setValue(PostDesc); newPost.child("postImage").setValue(imageUrl); newPost.child("uid").setValue(mCurrentUser.getUid()); newPost.child("time").setValue(saveCurrentTime);
                                        newPost.child("date").setValue(saveCurrentDate);
                                    };


                                @Override
                                public void onCancelled(@NonNull DatabaseError databaseError) {

                                }
                            });
                            }
                        });
                    }
                }
            }
        });
        }

    }
});
}
    @Override
// image from gallery result
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == GALLERY_REQUEST_CODE && resultCode == RESULT_OK){
//get the image selected by the user
            uri = data.getData();
//set the image
            imageBtn.setImageURI(uri);
        }
    }

}
