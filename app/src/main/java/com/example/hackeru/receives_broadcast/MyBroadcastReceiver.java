package com.example.hackeru.receives_broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by hackeru on 17/04/2016.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent){
        int INT_2 = intent.getIntExtra("INT_2", 0);

        Toast.makeText(context, Integer.toString(INT_2), Toast.LENGTH_LONG).show();
    }
}
