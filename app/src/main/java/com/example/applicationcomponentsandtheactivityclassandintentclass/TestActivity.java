package com.example.applicationcomponentsandtheactivityclassandintentclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void sendResult(View view) {
        if (view.getId()==R.id.button1){
            Intent intent=new Intent();
            intent.putExtra("status","I'm fine");
            setResult(RESULT_OK, intent);
            finish();
        }else {
            setResult(RESULT_CANCELED);
            finish();
        }
    }
}