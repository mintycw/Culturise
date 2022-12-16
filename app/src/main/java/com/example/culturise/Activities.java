package com.example.culturise;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;;import java.util.ArrayList;

public class Activities extends AppCompatActivity {

    private String m_Title = "Country";

    private ArrayList<Activity> activityList;
    private RecyclerView recyclerView;

    String culture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_activities);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.activitiesRecyclerView);
        activityList = new ArrayList<>();

        getData();
        setData();

        setUserInfo();
        SetAdapter();
    }

    private void getData() {
        if (getIntent().hasExtra("culture")) {
            culture = getIntent().getStringExtra("culture");
        }
    }

    private void setData() {
        getSupportActionBar().setTitle(culture);

    }

    private void SetAdapter() {
        recyclerAdapter adapter = new recyclerAdapter(activityList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setUserInfo() {
        activityList.add(new Activity("Restuaranten"));
        activityList.add(new Activity("Winkels"));
        activityList.add(new Activity("Cursussen"));
    }
}

