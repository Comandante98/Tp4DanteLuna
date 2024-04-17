package com.ulpdante.tp4danteluna.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.ulpdante.tp4danteluna.databinding.FragmentHomeBinding;

public class LlamadaFragment extends Fragment {

    private FragmentHomeBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LlamadaViewModel llamadaViewModel =
                new ViewModelProvider(this).get(LlamadaViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.btLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = binding.etTel.getText().toString();
                llamadaViewModel.llamar(num);
            }
        });

        llamadaViewModel.getError().observe(getViewLifecycleOwner(), new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                Toast.makeText(getActivity(), "Ingrese un numero correcto", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}