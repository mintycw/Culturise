package com.example.culturise;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.culturise.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding m_Binding;
    private Button m_ActivityOfTheDayButton;

    RecyclerView flagRecycler;

    String cultures[];
    int images[] = {R.drawable.flag_china, R.drawable.flag_japan, R.drawable.flag_turkey, R.drawable.flag_italy, R.drawable.flag_spain};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        m_Binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(m_Binding.getRoot());

        getSupportActionBar().setTitle("Culturise");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        buttonEventListener();
        showBottomNav();

        flagRecycler = findViewById(R.id.FlagRecyclerView);

        cultures = getResources().getStringArray(R.array.cultures);

        FlagAdapter flagAdapter = new FlagAdapter(this, cultures, images);
        flagRecycler.setAdapter(flagAdapter);
        flagRecycler.setLayoutManager(new LinearLayoutManager(this));

    }

    private void buttonEventListener() {
        m_ActivityOfTheDayButton = (Button) findViewById(R.id.HomeAotdButton);
        m_ActivityOfTheDayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityOfTheDay();
            }
        });
    }

    private void openActivityOfTheDay() {
        Intent intent = new Intent(this, ActivityOfTheDay.class);
        startActivity(intent);
    }

    private void showBottomNav() {
        BottomNavigationView navView = findViewById(R.id.nav_view);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_favorites, R.id.navigation_settings)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupWithNavController(m_Binding.navView, navController);
    }
}