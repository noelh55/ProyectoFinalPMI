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
import com.example.proyectofinalpmi.databinding.FragmentProfileBinding;
import com.example.proyectofinalpmi.databinding.FragmentUsersBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class UsersFragment extends Fragment {

    private FragmentUsersBinding binding;
    private FloatingActionButton btnAgregarUsuario;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        UsersViewModel galleryViewModel =
                new ViewModelProvider(this).get(UsersViewModel.class);

        binding = FragmentUsersBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textuser;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        btnAgregarUsuario = root.findViewById(R.id.btnAgregarUsuario);
        btnAgregarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Inicia la navegación hacia el fragment ProfileFragment
                Navigation.findNavController(view).navigate(R.id.action_nav_users_to_nav_usersadd);
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