package com.example.proyectofinalpmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtUsuario, edtPassword;
    Button btnRegistrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtPassword = (EditText) findViewById(R.id.edtUsuario);
        btnRegistrarse = (Button) findViewById(R.id.btnRegistrarse);

    }
}