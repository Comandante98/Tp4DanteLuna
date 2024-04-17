package com.ulpdante.tp4danteluna.ui.home;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class LlamadaViewModel extends AndroidViewModel {

    private  MutableLiveData<Boolean> error;

    public LlamadaViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<Boolean> getError() {
        if(error == null){
            error = new MutableLiveData<>();
        }
        return error;
    }


    public void llamar(String num){
        if(num.length() == 10){
            Intent intentLlamada = new Intent(Intent.ACTION_CALL);
            intentLlamada.setData(Uri.parse("tel:" + num));
            intentLlamada.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            getApplication().startActivity(intentLlamada);
        }else{
           error.setValue(false);
        }
    }

}