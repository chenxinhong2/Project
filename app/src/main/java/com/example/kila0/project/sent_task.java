package com.example.kila0.project;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

public class sent_task extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sent_task);

        //把状态栏颜色变成绿色
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT){
            ViewGroup firstChildAtDecorView = ((ViewGroup) ((ViewGroup)getWindow().getDecorView()).getChildAt(0));
            View statusView = new View(this);
            ViewGroup.LayoutParams statusViewLp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                    getStatusBarHeight());
            statusView.setBackgroundColor(Color.rgb(50,206,50));
            firstChildAtDecorView.addView(statusView, 0, statusViewLp);
        }


    }
    //把状态栏颜色变成绿色
    private int getStatusBarHeight() {
        int resId = getResources().getIdentifier("status_bar_height","dimen","android");
        if(resId>0){
            return getResources().getDimensionPixelSize(resId);
        }
        return 0;
    }
}
