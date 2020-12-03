package com.example.encryptedpreferencefragmentcompat

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        preferenceManager.preferenceDataStore = EncryptedPreferencesDataStore(requireContext())
        setPreferencesFromResource(R.xml.prefs, rootKey)
    }
}