package com.example.proyectofinalpmi;

import android.os.Bundle;

public class SettingsFragment extends PreferenceFragmentCompat{
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }

    private void setPreferencesFromResource(int preferences, String rootKey) {
    }
}
