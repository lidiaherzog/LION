package com.example.lidiaherzog.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LearnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Learn");
    }
}
