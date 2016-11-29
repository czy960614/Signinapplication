package com.example.czy19.signinapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by czy19 on 2016/11/21.
 */

public class Personalinfo_edit extends AppCompatActivity {
    String [] gender_choose={"男","女"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personalinfo_edit);
        Button personalinfo_edit_confirm=(Button)findViewById(R.id.personalinfo_edit_confirm);
        TextView personalinfo_edit_gender=(TextView)findViewById(R.id.personalinfo_edit_gender);
        personalinfo_edit_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView personalinfo_edit_gender=(TextView)findViewById(R.id.personalinfo_edit_gender);
                Intent intent=new Intent(Personalinfo_edit.this,Personalinfo_shown.class);
                intent.putExtra("gender_data",personalinfo_edit_gender.getText());
                startActivity(intent);
            }
        });
        personalinfo_edit_gender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog_gender();
            }
        });
    }
    private void showDialog_gender(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("性别选择");
        builder.setIcon(R.drawable.gender_icon);
        builder.setSingleChoiceItems(gender_choose, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String str=gender_choose[which];
                TextView personalinfo_edit_gender=(TextView)findViewById(R.id.personalinfo_edit_gender);
                personalinfo_edit_gender.setText(str);
            }
        });
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                TextView personalinfo_edit_gender=(TextView)findViewById(R.id.personalinfo_edit_gender);
                personalinfo_edit_gender.setText("");
            }
        });
        AlertDialog dialog=builder.create();
        dialog.show();
    }
}
