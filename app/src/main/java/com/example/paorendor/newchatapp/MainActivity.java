package com.example.paorendor.newchatapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.paorendor.newchatapp.extras.SplashActivity;

public class MainActivity extends SplashActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    public int setTimeInSeconds() {
        return 3;
    }

    @Override
    public void init() {

    }

    @Override
    public void done() {

        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();

    }
}
