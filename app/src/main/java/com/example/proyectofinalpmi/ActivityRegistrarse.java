package com.example.proyectofinalpmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ActivityRegistrarse extends AppCompatActivity {
    EditText edtNombres, edtApellidos, edtCorreo, edtTelefono, edtDni, edtFecha;
    Button btnRegistrarse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
        edtNombres = (EditText) findViewById(R.id.ArNombres);
        edtApellidos = (EditText) findViewById(R.id.ArApellidos);
        edtCorreo = (EditText) findViewById(R.id.ArCorreo);
        edtTelefono = (EditText) findViewById(R.id.ArTelefono);
        edtDni = (EditText) findViewById(R.id.ArDni);
        edtFecha = (EditText) findViewById(R.id.ArFecha);
        btnRegistrarse = (Button) findViewById(R.id.btnARegistrarse);
    }
}