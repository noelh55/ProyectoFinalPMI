package com.example.proyectofinalpmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class ActivityBuscarU extends AppCompatActivity {

    private LinearLayout menuLayout;
    private FrameLayout mainContent;
    private Button toggleMenuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_u);

        menuLayout = findViewById(R.id.menuLayout);
        mainContent = findViewById(R.id.mainContent);
        toggleMenuButton = findViewById(R.id.toggleMenuButton);

        toggleMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (menuLayout.getVisibility() == View.VISIBLE) {
                    menuLayout.setVisibility(View.GONE);
                } else {
                    menuLayout.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}