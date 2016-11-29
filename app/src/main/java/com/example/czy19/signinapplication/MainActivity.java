package com.example.czy19.signinapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mainpage_todaysign=(Button)findViewById(R.id.mainpage_todaysign);
        Button mainpage_totalrecord=(Button) findViewById(R.id.mainpage_totalrecord);
        Button mainpage_notification=(Button)findViewById(R.id.mainpage_notification);
        Button mainpage_connection=(Button)findViewById(R.id.mainpage_connection);
        mainpage_todaysign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Today_signin.class);
                startActivity(intent);
            }
        });
        mainpage_totalrecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Signin_record.class);
                startActivity(intent);
            }
        });
        mainpage_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Notification.class);
                startActivity(intent);
            }
        });
        mainpage_connection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Connection.class);
                startActivity(intent);
            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       switch(item.getItemId()){
           case R.id.action_settings:
               Intent intent1=new Intent(MainActivity.this,Setting.class);
               startActivity(intent1);
               break;
           case R.id.action_nolification:
               Intent intent2=new Intent(MainActivity.this,Setting.class);
               startActivity(intent2);
               break;
           default:
       }
        return true;
    }

    private MenuItem takePhoto;
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.nav_setting:
                Intent intent1=new Intent(MainActivity.this,Setting.class);
                startActivity(intent1);
                break;
            case R.id.nav_camera:
                Intent intent2=new Intent(MainActivity.this,Camera.class);
                startActivity(intent2);
                break;
            case R.id.nav_personalinfo:
                Intent intent3=new Intent(MainActivity.this,Personalinfo_shown.class);
                startActivity(intent3);
                break;
            default:
        }
        return true;
//        int id = item.getItemId();
//        if (id == R.id.nav_personalinfo) {
//        } else if (id == R.id.nav_gallery) {
//        } else if (id == R.id.nav_camera) {
//        } else if (id == R.id.nav_setting) {
//        } else if (id == R.id.nav_share) {
//        }
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
//        return true;
    }
}
