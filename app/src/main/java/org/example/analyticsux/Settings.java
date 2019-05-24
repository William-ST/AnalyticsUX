package org.example.analyticsux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;

public class Settings extends AppCompatActivity {

    private FirebaseAnalytics analytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        analytics = FirebaseAnalytics.getInstance(this);
    }

    public void diestroClic(View view) {
        analytics.setUserProperty("mano_usada", "diestro");
        finish();
    }

    public void zurdoClic(View view) {
        analytics.setUserProperty("mano_usada", "zurdo");
        finish();
    }
}
