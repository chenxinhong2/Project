package com.example.kila0.project;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class user_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);
        //改变字体
        final TextView user_name = (TextView) findViewById(R.id.user_name);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/Debby.ttf");
        user_name.setTypeface(typeface);


    }
}
