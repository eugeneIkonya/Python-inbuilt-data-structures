package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.example.twoactivities.extra.REPLY";
    private EditText myReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        myReply = (EditText)findViewById(R.id.editText_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE).toString();
        TextView textView = (TextView)findViewById(R.id.text_message);
        textView.setText(message);
    }

    public void returnReply(View view) {
        String message = myReply.getText().toString();
        Intent intent = new Intent();
        intent.putExtra(EXTRA_REPLY,message);
        setResult(RESULT_OK,intent);
        finish();
    }
}