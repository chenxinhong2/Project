package com.example.kila0.project;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
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

        EditText name = (EditText) findViewById(R.id.this_user_name);
        EditText school = (EditText) findViewById(R.id.this_user_school);
        EditText department = (EditText) findViewById(R.id.this_user_department);
        EditText phome = (EditText) findViewById(R.id.this_user_phome);
        EditText qq = (EditText) findViewById(R.id.this_user_qq);
        EditText wechat = (EditText) findViewById(R.id.this_user_wechat);

        Intent intent = getIntent();
        Bundle data = intent.getExtras();
        int which_code = data.getInt("click_code");
        if(which_code == 1){
            name.requestFocus();
        }else if(which_code == 2){
            school.requestFocus();
        }else if(which_code == 3){
            department.requestFocus();
        }else if(which_code == 4){
            phome.requestFocus();
        }else if(which_code == 5){
            qq.requestFocus();
        }else if(which_code == 6){
            wechat.requestFocus();
        }


    }
}
