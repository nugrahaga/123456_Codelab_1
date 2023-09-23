package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "Hello World!");
        Log.e(LOG_TAG, "ERROR");
        Log.w(LOG_TAG, "WARNING");
        Log.i(LOG_TAG, "INFO");
        Log.v(LOG_TAG, "VERBOSE");
    }
}