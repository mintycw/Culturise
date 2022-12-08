package com.example.culturise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActivityOfTheDay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_of_the_day);

        getSupportActionBar().setTitle("Activiteit van de dag!");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}