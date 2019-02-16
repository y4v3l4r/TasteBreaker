package com.yarency.android.tastebreaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openLofiActivity(View view) {

        Intent i = new Intent(this, LofiActivity.class);
        startActivity(i);
    }
    public void openRockActivity(View view){
        Intent i = new Intent(this, RockActivity.class);
        startActivity(i);
    }
    public void openHipHopActivity(View view) {
        Intent i = new Intent(this, HipHopActivity.class);
        startActivity(i);
    }
    public void openOldiesActivity(View view) {
        Intent i = new Intent(this, OldiesActivity.class);
        startActivity(i);
    }
}

