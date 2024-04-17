package com.ulpdante.tp4danteluna.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.ulpdante.tp4danteluna.R;
import com.ulpdante.tp4danteluna.databinding.FragmentGalleryBinding;

public class FotoFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FotoViewModel fotoViewModel =
                new ViewModelProvider(this).get(FotoViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final ImageView fotoPerfil = binding.ivFoto;
        fotoPerfil.setImageResource(R.drawable.foto);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}