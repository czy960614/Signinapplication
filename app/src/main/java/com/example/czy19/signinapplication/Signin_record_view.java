package com.example.czy19.signinapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by czy19 on 2016/11/29.
 */

public class Signin_record_view extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.signin_record_view);
        ImageButton signin_record_view_title_return=(ImageButton)findViewById(R.id.signin_record_view_title_return);
        Button signin_record_view_title_edit=(Button)findViewById(R.id.signin_record_view_title_edit);
        signin_record_view_title_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Signin_record_view.this,MainActivity.class);
                startActivity(intent);
            }
        });
        signin_record_view_title_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Signin_record_view.this,Signin_record.class);
                startActivity(intent);
            }
        });
    }
}
