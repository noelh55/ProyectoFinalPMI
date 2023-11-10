package com.example.proyectofinalpmi.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;


import com.example.proyectofinalpmi.databinding.FragmentProfileEditBinding;

public class ProfileEditFragment extends Fragment {

    private FragmentProfileEditBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ProfileEditViewModel profileEditViewModel =
                new ViewModelProvider(this).get(ProfileEditViewModel.class);

        binding = FragmentProfileEditBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textEdit;
        profileEditViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
         return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}