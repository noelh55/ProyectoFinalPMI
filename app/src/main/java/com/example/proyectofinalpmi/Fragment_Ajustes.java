package com.example.proyectofinalpmi;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class Fragment_Ajustes extends PreferenceFragmentCompat {

    public Fragment_Ajustes() {
        // Required empty public constructor
    }

    @Override
    public void onCreatePreferences(Bundle bundle, String key) {
        setPreferencesFromResource(R.xml.preference, key);
    }
}