package com.example.applicationcomponentsandtheactivityclassandintentclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.AppLaunchChecker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Splash_screen extends AppCompatActivity {
 private final String TAG = Splash_screen.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        System.out.println(TAG + "Activity created");


        findViewById(R.id.imageView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Splash_screen.this,MainActivity.class);
                intent.putExtra("name", "Mohammad");
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println(TAG + "Activity started!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println(TAG + "Activity Resumed!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println(TAG + "Activity Paused!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println(TAG + "Activity Stopped!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println(TAG + "Activity Destroyed!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println(TAG + "Activity Restarted!");

    }
}