package com.gzeinnumer.arraylistexamplekt;

import android.util.Log;

import java.util.ArrayList;

public class LoopingExample {

    private static final String TAG = "LoopingExample";

    public void looping(){
        ArrayList<String> list = new ArrayList<>();

        list.add("Data 1");
        list.add("Data 2");
        list.add("Data 3");

        for (String d: list){
            Log.d(TAG, "looping: "+d);
        }
    }
}
