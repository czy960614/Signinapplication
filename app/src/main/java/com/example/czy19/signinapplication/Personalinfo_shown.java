package com.example.czy19.signinapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;

/**
 * Created by czy19 on 2016/11/21.
 */

public class Personalinfo_shown extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personalinfo_shown);
        Intent intent=getIntent();
        String gender_data=intent.getStringExtra("gender_data");
        TextView personalinfo_shown_gender=(TextView)findViewById(R.id.personalinfo_shown_gender);
        personalinfo_shown_gender.setText(gender_data);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.personalinfomation_edit, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.action_personalinfo:
                Intent intent1=new Intent(Personalinfo_shown.this,Personalinfo_edit.class);
                startActivity(intent1);
                break;
        }
        return true;
    }
}
