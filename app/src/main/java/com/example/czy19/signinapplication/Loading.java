package com.example.czy19.signinapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by czy19 on 2016/11/21.
 */

public class Loading extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);
        Button loading_confirm=(Button)findViewById(R.id.loading_confirm);
        loading_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Loading.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
