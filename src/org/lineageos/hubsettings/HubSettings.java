/*
 * Copyright (C) 2023 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.hubsettings;

import android.content.Context;
import android.os.Bundle;

import androidx.preference.Preference;
import androidx.preference.PreferenceFragment;
import androidx.preference.PreferenceManager;

import org.lineageos.hubsettings.R;

public class HubSettings extends PreferenceFragment {
    private static final String TAG = HubSettings.class.getSimpleName();

    private Preference mAssistantPreference;

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.hubsettings);

        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getContext());

    }
}
