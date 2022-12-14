package com.xd.mnmlist.preferences;

import android.content.Context;
import android.util.AttributeSet;

import com.xd.mnmlist.preferences.SecureSettingsStore;

import com.android.settingslib.widget.MainSwitchPreference;

public class CustomSecureSettingMainSwitchPreference extends MainSwitchPreference {

    public CustomSecureSettingMainSwitchPreference(Context context, AttributeSet attrs,
            int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }

    public CustomSecureSettingMainSwitchPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }

    public CustomSecureSettingMainSwitchPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }

    public CustomSecureSettingMainSwitchPreference(Context context) {
        super(context);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }
}