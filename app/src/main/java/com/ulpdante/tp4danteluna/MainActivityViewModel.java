package com.ulpdante.tp4danteluna;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {


    private MutableLiveData<Boolean> incorrecto;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);

    }

    public MutableLiveData<Boolean> getIncorrecto() {
        if(incorrecto == null){
            incorrecto = new MutableLiveData<>();
        }
        return incorrecto;
    }

    public void login(String usuario, String contraseña){
        String user = "dante";
        String contra = "123";
            if (usuario.equals(user) && contraseña.equals(contra)){
                Intent intent = new Intent(getApplication(), SegundaActivity.class);
                intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                getApplication().startActivity(intent);
            }else{
                incorrecto.setValue(false);
            }
    }


}
