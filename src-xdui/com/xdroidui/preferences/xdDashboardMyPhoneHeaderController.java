/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xdroidui.preferences;

import android.app.settings.SettingsEnums;
import android.content.Context;
import android.text.TextUtils;
import android.os.Build;
import android.provider.Settings;

import androidx.fragment.app.Fragment;
import androidx.preference.Preference;
import com.android.settings.core.BasePreferenceController;

public class xdDashboardMyPhoneHeaderController extends BasePreferenceController {

    public xdDashboardMyPhoneHeaderController(Context context, String preferenceKey) {
        super(context, preferenceKey);
    }

    @Override
    public int getAvailabilityStatus() {
        return AVAILABLE;
    }

    @Override
    public CharSequence getSummary() {
        String mDeviceName = Settings.Global.getString(mContext.getContentResolver(), Settings.Global.DEVICE_NAME);
        if (mDeviceName == null) {
            mDeviceName = Build.MODEL;
        }
        return mDeviceName;
    }
}