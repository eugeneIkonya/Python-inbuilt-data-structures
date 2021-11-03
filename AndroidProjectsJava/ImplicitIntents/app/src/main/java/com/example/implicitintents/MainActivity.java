package com.example.implicitintents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    private EditText websiteEditText;
    private EditText locationEditText;
    private EditText shareEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        websiteEditText = (EditText)findViewById(R.id.website_edittext);
        locationEditText = (EditText)findViewById(R.id.location_edittext);
        shareEditText = (EditText)findViewById(R.id.share_edittext);
    }

    public void openWebsite(View view) {
        String url = websiteEditText.getText().toString();
        Uri webpage = Uri.parse(url);
        Intent webIntent = new Intent(Intent.ACTION_VIEW,webpage);
        if(webIntent.resolveActivity(getPackageManager()) != null ) {
            startActivity(webIntent);
        }else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void openLocation(View view) {
        String location = locationEditText.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q=" + location);
        Intent locationIntent = new Intent(Intent.ACTION_VIEW, addressUri);
        if (locationIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(locationIntent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");

        }

    }
    public void shareText(View view) {
        String txt = shareEditText.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Share text with")
                .setText(txt)
                .startChooser();
    }
}