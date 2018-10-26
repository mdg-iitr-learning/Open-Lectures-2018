package io.github.dev_ritik.lively;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class TimePreferenceActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.prefs);
    }
}
