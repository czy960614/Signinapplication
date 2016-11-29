package com.example.czy19.signinapplication;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by czy19 on 2016/11/21.
 */

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    protected void onDestory(){
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
