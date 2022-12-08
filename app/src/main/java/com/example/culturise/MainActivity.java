package com.example.culturise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;

import com.example.culturise.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Button activityOfTheDayButton;
    private ImageButton flagButton;

//    private RecyclerView flagRecyclerView;

//    private int images[] = { R.drawable.flag_japan, R.drawable.flag_japan, R.drawable.flag_japan,
//            R.drawable.flag_japan, R.drawable.flag_japan, R.drawable.flag_japan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle("Culturise");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        flagRecyclerView.findViewById(R.id.flagRecyclerView);
//
//        MyAdapter myAdapter = new MyAdapter(this, images);
//        flagRecyclerView.setAdapter(myAdapter);
//        flagRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        createFlagButtons();
        buttonEventListener();
        showBottomNav();
    }

    private void createFlagButtons() {
        flagButton = (ImageButton) findViewById(R.id.flagButton0);
        flagButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void buttonEventListener() {
        activityOfTheDayButton = (Button) findViewById(R.id.home_aotd_button);
        activityOfTheDayButton.setOnClickListener(new View.OnClickListener() {
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

    private void openFlagButton(int index) {
        if (index == 1) {

        }
    }

    private void showBottomNav() {
        BottomNavigationView navView = findViewById(R.id.nav_view);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_favorites, R.id.navigation_settings)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }
}