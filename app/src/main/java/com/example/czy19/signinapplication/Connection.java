package com.example.czy19.signinapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by czy19 on 2016/11/26.
 */

public class Connection extends Activity {

    private String[] data={"张三","李四","王五"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connection);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(
                Connection.this,android.R.layout.simple_list_item_1,data);
        ListView connextion_listview=(ListView)findViewById(R.id.connextion_listview);
        connextion_listview.setAdapter(adapter);
    }
}
