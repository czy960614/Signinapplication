package com.example.czy19.signinapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by czy19 on 2016/11/26.
 */

public class Signin_record extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.signin_record);
        ImageButton signin_record_title_return=(ImageButton)findViewById(R.id.signin_record_title_return);
        Button signin_record_title_edit=(Button)findViewById(R.id.signin_record_title_edit);
        signin_record_title_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Signin_record.this,MainActivity.class);
                startActivity(intent);
            }
        });
        signin_record_title_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Signin_record.this,Signin_record_view.class);
                startActivity(intent);
            }
        });
    }
}
