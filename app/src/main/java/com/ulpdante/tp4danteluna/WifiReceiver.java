package com.ulpdante.tp4danteluna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class WifiReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        boolean modoWifi = intent.getBooleanExtra("connected", false);
        if(modoWifi){
            Intent intentLlamada = new Intent(Intent.ACTION_CALL);
            intentLlamada.setData(Uri.parse("tel:" + "2664553747"));
            intentLlamada.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentLlamada);
        }else{
            Toast.makeText(context, "Sin wifi", Toast.LENGTH_SHORT).show();
        }

    }
}