package com.example.kila0.project;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Welcome extends AppCompatActivity {
    public int y = 0;
    public int x = 0;
    public int count = 0;
    public int speed = 0;
    public boolean flag1 = true;
    public boolean flag2 = true;
    public boolean flag3 = true;
    public boolean flag4 = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //设置字体
        final TextView icon_word = (TextView) findViewById(R.id.welcome_icon_word);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/Serendity.ttf");
        icon_word.setTypeface(typeface);

        //初始图标位置
        final ImageView icon_pic = (ImageView) findViewById(R.id.welcome_icon_pic);
        icon_pic.layout(290,200,350,350);
        x = 290;
        y = 200;
        final Intent localIntent = new Intent(Welcome.this, MainPage.class);
        Timer timer = new Timer();
        TimerTask tast = new TimerTask() {
            @Override
            public void run() {
                startActivity(localIntent);
                finish();
            }
        };
        timer.schedule(tast, 3000);
        handler.post(runnable);
        //finish();
    }

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            final ImageView icon_pic = (ImageView) findViewById(R.id.welcome_icon_pic);

            if(flag1){
                if(x>=50){
                    x = x-10;
                    y = y+10;
                    icon_pic.layout(x,y,x+350,y+350);
                    if(x==50){
                        flag1 = false;
                    }
                }
            }
            else if(flag2){
                if(x<=530){
                    x = x+10;
                    icon_pic.layout(x,y,x+350,y+350);
                    if(x==530){
                        flag2 = false;
                    }
                }
            }
            else if(flag3){
                if(x>=290){
                    x = x-10;
                    y = y-10;
                    icon_pic.layout(x,y,x+350,y+350);
                    if(x==290){
                        flag3 = false;
                    }
                }
            }
            if(flag3) handler.post(this);

        }
    };
}
