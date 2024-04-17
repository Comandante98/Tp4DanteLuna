package com.ulpdante.tp4danteluna.ui.slideshow;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class Dialogo {

    public static void dialogoSalida(Activity activity){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Esta seguro que quiere salir?");
        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                activity.finishAndRemoveTask();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog ad = builder.create();
        ad.show();
    }
}
