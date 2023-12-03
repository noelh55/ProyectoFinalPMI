package com.example.proyectofinalpmi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class AjustesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);
        getSupportFragmentManager() .beginTransaction() .replace(R.id.contenedorAjuste, new Fragment_Ajustes()).commit();
    }
}