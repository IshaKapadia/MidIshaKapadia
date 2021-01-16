package com.example.timetableapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TuesdayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuesday);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MSG);

        TextView textView = findViewById(R.id.tuesdayText);
        textView.setText(message);
    }
}