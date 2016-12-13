package com.example.kila0.project;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
//        View v = findViewById(R.id.mainpage);
//        v.getBackground().setAlpha(30);

        /* top bar */


        /* search bar */
        EditText search = (EditText) findViewById(R.id.search);


        /* bottom tab */
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        TabLayout.Tab tab1 = tabLayout.newTab().setIcon(R.mipmap.classes);
        tabLayout.addTab(tab1);
        TabLayout.Tab tab2 = tabLayout.newTab().setText("主页").setIcon(R.mipmap.home_green);
        tabLayout.addTab(tab2,true);
        TabLayout.Tab tab3 = tabLayout.newTab().setIcon(R.mipmap.add);
        tabLayout.addTab(tab3);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int pos = tab.getPosition();
                if(pos==0)      tab.setText("类别").setIcon(R.mipmap.class_green);
                else if(pos==1)     tab.setText("主页").setIcon(R.mipmap.home_green);
                else    tab.setText("添加").setIcon(R.mipmap.add_green);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                int pos = tab.getPosition();
                if(pos==0)      tab.setText("").setIcon(R.mipmap.classes);
                if(pos==1)      tab.setText("").setIcon(R.mipmap.home);
                if(pos==2)      tab.setText("").setIcon(R.mipmap.add);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                int pos = tab.getPosition();
                if(pos==0)      tab.setIcon(R.mipmap.class_green);
                else if(pos==1)     tab.setIcon(R.mipmap.home_green);
                else    tab.setIcon(R.mipmap.add_green);
            }
        });
    }
}
