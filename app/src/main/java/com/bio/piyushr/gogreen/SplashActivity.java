package com.bio.piyushr.gogreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        callToSplashScreen();
    }

    private void callToSplashScreen() {

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 100ms
                Toast.makeText(SplashActivity.this, "check", Toast.LENGTH_SHORT).show();
                startHomeScreen();
            }
        }, 1500);

    }

    private void startHomeScreen() {

        Intent intent = new Intent(SplashActivity.this, HomeScreenActivity.class);
        startActivity(intent);

    }
}
