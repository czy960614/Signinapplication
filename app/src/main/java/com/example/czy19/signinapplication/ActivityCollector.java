package com.example.czy19.signinapplication;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by czy19 on 2016/11/21.
 */

public class ActivityCollector {
    public static List<Activity> activities=new ArrayList<Activity>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finishAll(){
        for (Activity activity:activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
