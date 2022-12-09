package com.example.culturise;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;;

public class Activities extends AppCompatActivity {

//    Bundle extras = getIntent().getExtras();
//    private String m_Culture = getIntent().getStringExtra("culture");
//    private String m_Title = getIntent().getStringExtra("title");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        if (extras != null) {
//            String m_Title = extras.getString("title");
//        }

        setContentView(R.layout.activity_activities);
//        switch (m_Layout) {
//            case "china":
//                setContentView(R.layout.activity_activities);
//                break;
//            case "japan":
//                setContentView(R.layout.fragment_activities_china);
//                break;
//        }
//        getSupportActionBar().setTitle(m_Title);
        getSupportActionBar().setTitle("test");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

