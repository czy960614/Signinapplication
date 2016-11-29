package com.example.czy19.signinapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by czy19 on 2016/11/21.
 */

public class Setting extends Activity {
    private String[] data={"语言","音量","消息通知","字体大小"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(
                Setting.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.main_setting);
        listView.setAdapter(adapter);
    }
}
