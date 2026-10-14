package com.jeancarlo.stepcounter.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jeancarlo.stepcounter.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Step 4: permission flow + service binding.
    }
}
