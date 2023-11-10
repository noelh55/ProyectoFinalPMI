package com.example.proyectofinalpmi.ui.users;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.proyectofinalpmi.R;
import com.example.proyectofinalpmi.databinding.FragmentAddusersgroupsBinding;
import com.example.proyectofinalpmi.databinding.FragmentProfileBinding;
import com.example.proyectofinalpmi.databinding.FragmentUsersBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class UsersAddGroupFragment extends Fragment {

    private FragmentAddusersgroupsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        UsersViewModel galleryViewModel =
                new ViewModelProvider(this).get(UsersViewModel.class);

        binding = FragmentAddusersgroupsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textuseraddg;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}