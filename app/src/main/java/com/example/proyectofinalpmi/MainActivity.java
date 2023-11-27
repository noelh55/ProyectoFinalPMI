package com.example.proyectofinalpmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUsuario, edtPassword;
    Button btnRegistrarse, btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtPassword = (EditText) findViewById(R.id.edtUsuario);
        btnRegistrarse = (Button) findViewById(R.id.btnRegistrarse);
        btnIniciar = (Button) findViewById(R.id.btnIniciar);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = edtUsuario.getText().toString();
                String password = edtPassword.getText().toString();

                if (TextUtils.isEmpty(usuario) || TextUtils.isEmpty(password)) {
                    // Mostrar un mensaje de error si algún campo está vacío
                    Toast.makeText(MainActivity.this, "Ingrese usuario y contraseña", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, ActivityMenu.class);
                    startActivity(intent);
                }
            }
        });

        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = edtUsuario.getText().toString();
                String password = edtPassword.getText().toString();

                if (TextUtils.isEmpty(usuario) || TextUtils.isEmpty(password)) {
                    // Mostrar un mensaje de error si algún campo está vacío
                    Toast.makeText(MainActivity.this, "Ingrese usuario y contraseña", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, ActivityRegistrarse.class);
                    startActivity(intent);
                }

            }
        });
    }
}
