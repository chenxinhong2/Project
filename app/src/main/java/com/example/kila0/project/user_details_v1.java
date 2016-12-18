package com.example.kila0.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class user_details_v1 extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details_v1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //绑定actionbar和主界面
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        //绑定侧边栏
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    //自动生成的大概不用管
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    //自动生成的大概不用管
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.user_details_v1, menu);
        return true;
    }
    //自动生成的大概不用管
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_logout) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //在这个函数里面下面的分别是点击了侧边栏的各个项目 然后进行的操作
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.user_name_item) {
            // Handle the camera action
            Intent intent = new Intent(user_details_v1.this,user_details.class);
            Bundle bundle = new Bundle();
            bundle.putInt("click_code",1);
            intent.putExtras(bundle);
            startActivity(intent);
        } else if (id == R.id.user_school_item) {
            Intent intent = new Intent(user_details_v1.this,user_details.class);
            Bundle bundle = new Bundle();
            bundle.putInt("click_code",2);
            intent.putExtras(bundle);
            startActivity(intent);
        } else if (id == R.id.user_department_item) {
            Intent intent = new Intent(user_details_v1.this,user_details.class);
            Bundle bundle = new Bundle();
            bundle.putInt("click_code",3);
            intent.putExtras(bundle);
            startActivity(intent);
        } else if (id == R.id.user_phone_item) {
            Intent intent = new Intent(user_details_v1.this,user_details.class);
            Bundle bundle = new Bundle();
            bundle.putInt("click_code",4);
            intent.putExtras(bundle);
            startActivity(intent);
        } else if (id == R.id.user_qq_item) {
            Intent intent = new Intent(user_details_v1.this,user_details.class);
            Bundle bundle = new Bundle();
            bundle.putInt("click_code",5);
            intent.putExtras(bundle);
            startActivity(intent);
        } else if (id == R.id.user_wechat_item) {
            Intent intent = new Intent(user_details_v1.this,user_details.class);
            Bundle bundle = new Bundle();
            bundle.putInt("click_code",6);
            intent.putExtras(bundle);
            startActivity(intent);
        }else if (id == R.id.sent_task_item) {
            Intent intent = new Intent(user_details_v1.this,sent_task.class);
            Bundle bundle = new Bundle();
            bundle.putInt("click_code",7);
            intent.putExtras(bundle);
            startActivity(intent);
        }else if (id == R.id.received_task_item) {
            Intent intent = new Intent(user_details_v1.this,received_task.class);
            Bundle bundle = new Bundle();
            bundle.putInt("click_code",8);
            intent.putExtras(bundle);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
