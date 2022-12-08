package com.example.culturise;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class FlagActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_of_the_day);

        getSupportActionBar().setTitle("Activiteit van de dag!");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}