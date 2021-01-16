package com.example.timetableapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String MSG = "com.example.TimeTableApp.ORDER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mondayTt(View view)
    {
        Toast.makeText (this, "Please Wait,Showing Monday's Schedule..", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MondayActivity.class);
        String message="Monday's Schedule:";
        intent.putExtra(MSG, message);
        startActivity(intent);
    }
    public void tuesdayTt(View view)
    {
        Toast.makeText (this, "Please Wait,Showing Tuesday's Schedule..", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,TuesdayActivity.class);
        String message="Tuesday's Schedule:";
        intent.putExtra(MSG, message);
        startActivity(intent);
    }
    public void wednesdayTt(View view)
    {
        Toast.makeText (this, "Please Wait,Showing Wednesday's Schedule..", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,WednesdayActivity.class);
        String message="Wednesday's Schedule:";
        intent.putExtra(MSG, message);
        startActivity(intent);
    }
    public void thursdayTt(View view)
    {
        Toast.makeText (this, "Please Wait,Showing Thursday's Schedule..", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,ThursdayActivity.class);
        String message="Thursday's Schedule:";
        intent.putExtra(MSG, message);
        startActivity(intent);
    }
    public void fridayTt(View view)
    {
        Toast.makeText (this, "Please Wait,Showing Friday's Schedule..", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,FridayActivity.class);
        String message="Friday's Schedule:";
        intent.putExtra(MSG, message);
        startActivity(intent);
    }
    public void saturdayTt(View view)
    {
        Toast.makeText (this, "Please Wait,Showing Saturday's Schedule..", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,SaturdayActivity.class);
        String message="Saturday's Schedule:";
        intent.putExtra(MSG, message);
        startActivity(intent);
    }
}