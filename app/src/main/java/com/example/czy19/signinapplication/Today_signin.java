package com.example.czy19.signinapplication;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by czy19 on 2016/11/26.
 */

public class Today_signin extends Activity {
    private Calendar cal;
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.today_sign_content);
        cal=Calendar.getInstance();
        year=cal.get(Calendar.YEAR);
        month=cal.get(Calendar.MONTH)+1;
        day=cal.get(Calendar.DAY_OF_MONTH);
        hour=cal.get(Calendar.HOUR_OF_DAY);
        minute=cal.get(Calendar.MINUTE);
        ImageButton todaysign_title_return=(ImageButton)findViewById(R.id.todaysign_title_return);
        Button button_signin=(Button)findViewById(R.id.button_signin);
        todaysign_title_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Today_signin.this,MainActivity.class);
                startActivity(intent);
            }
        });
        button_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Today_signin.this,"您于"+year+"年"+month+"月"+day+"日"+" "+hour+":"+minute+"签到",Toast.LENGTH_LONG).show();
            }
        });
    }
}
