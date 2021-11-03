package com.example.a112448_sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class play extends AppCompatActivity {
    public static TextView topLeft1;
    public static TextView topLeft2;
    public static TextView topLeft3;
    public static TextView topLeft4;
    public static TextView topLeft5;
    public static TextView topLeft6;
    public static TextView topLeft7;
    public static TextView topLeft8;
    public static TextView topLeft9;

//    top middle box
    public static TextView topMiddle1;
    public static TextView topMiddle2;
    public static TextView topMiddle3;
    public static TextView topMiddle4;
    public static TextView topMiddle5;
    public static TextView topMiddle6;
    public static TextView topMiddle7;
    public static TextView topMiddle8;
    public static TextView topMiddle9;

//    top right box
    public static TextView topRight1;
    public static TextView topRight2;
    public static TextView topRight3;
    public static TextView topRight4;
    public static TextView topRight5;
    public static TextView topRight6;
    public static TextView topRight7;
    public static TextView topRight8;
    public static TextView topRight9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        //top left box
        topLeft1 = (TextView)findViewById(R.id.topLeft1);
        topLeft2 = (TextView)findViewById(R.id.topLeft2);
        topLeft3 = (TextView)findViewById(R.id.topLeft3);
        topLeft4 = (TextView)findViewById(R.id.topLeft4);
        topLeft5 = (TextView)findViewById(R.id.topLeft5);
        topLeft6 = (TextView)findViewById(R.id.topLeft5);
        topLeft7 = (TextView)findViewById(R.id.topLeft6);
        topLeft8 = (TextView)findViewById(R.id.topLeft7);
        topLeft9 = (TextView)findViewById(R.id.topLeft8);

//        top middle box
        topMiddle1 = (TextView)findViewById(R.id.topMiddle1);
        topMiddle2 = (TextView)findViewById(R.id.topMiddle2);
        topMiddle3 = (TextView)findViewById(R.id.topMiddle3);
        topMiddle4 = (TextView)findViewById(R.id.topMiddle4);
        topMiddle5 = (TextView)findViewById(R.id.topMiddle5);
        topMiddle6 = (TextView)findViewById(R.id.topMiddle6);
        topMiddle7 = (TextView)findViewById(R.id.topMiddle7);
        topMiddle8 = (TextView)findViewById(R.id.topMiddle8);
        topMiddle9 = (TextView)findViewById(R.id.topMiddle9);

//        top right box
        topMiddle1 = (TextView)findViewById(R.id.topMiddle1);
        topMiddle2 = (TextView)findViewById(R.id.topMiddle2);
        topMiddle3 = (TextView)findViewById(R.id.topMiddle3);
        topMiddle4 = (TextView)findViewById(R.id.topMiddle4);
        topMiddle5 = (TextView)findViewById(R.id.topMiddle5);
        topMiddle6 = (TextView)findViewById(R.id.topMiddle6);
        topMiddle7 = (TextView)findViewById(R.id.topMiddle7);
        topMiddle8 = (TextView)findViewById(R.id.topMiddle8);
        topMiddle9 = (TextView)findViewById(R.id.topMiddle9);

    }

    public void getPlaceId(View view,TextView place) {
        place.setBackgroundResource(R.drawable.selected_border);
    }
}