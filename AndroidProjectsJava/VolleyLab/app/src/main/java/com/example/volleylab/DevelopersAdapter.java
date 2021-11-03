package com.example.volleylab;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class DevelopersAdapter extends RecyclerView.Adapter<DevelopersAdapter.viewHolder> {

    private List<DeveloperList> developerList;
    private Context mContexet;

    public static final  String KEY_NAME ="name";
    public static final  String KEY_IMAGE ="image";
    public static final  String KEY_URL = "url";

    public DevelopersAdapter(List<DeveloperList> developerList, Context context){
        this.developerList = developerList;
        this.mContexet = context;
    }


    @NonNull
    @Override
    public DevelopersAdapter.viewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.developers_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull  DevelopersAdapter.viewHolder holder, int position) {
        final DeveloperList currentDeveloper = developerList.get(position);
        holder.login.setText(currentDeveloper.getLogin());
        holder.login.setText(currentDeveloper.getHtml_url());

        Picasso.with(mContexet)
                .load(currentDeveloper.getAvatar_url())
                .into(holder.avatar_url);

        holder.linearLayout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                DeveloperList developerList1 = developerList.get(position);
                Intent skipIntent = new Intent(v.getContext(),ProfileActivity.class);
                skipIntent.putExtra(KEY_NAME,developerList1.getLogin());
                skipIntent.putExtra(KEY_URL,developerList1.getHtml_url());
                skipIntent.putExtra(KEY_IMAGE,developerList1.getAvatar_url());
                v.getContext().startActivity(skipIntent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return developerList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        public TextView login;
        public ImageView avatar_url;
        public TextView html_url;
        public LinearLayout linearLayout;

        public viewHolder(@NonNull View itemView){
            super(itemView);

            login=itemView.findViewById(R.id.username);
            avatar_url = itemView.findViewById(R.id.imageView);
            html_url = itemView.findViewById(R.id.html_url);
            linearLayout = itemView.findViewById(R.id.linearLayout);

        }
    }
}
