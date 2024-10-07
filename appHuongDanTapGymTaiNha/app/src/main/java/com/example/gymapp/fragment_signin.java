package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class fragment_signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_signin);
    }
    public void btnDate_click(View view){
        Calendar celandar = Calendar.getInstance();

        int year = celandar.get(Calendar.YEAR);
        int month = celandar.get(Calendar.MONTH);
        int day = celandar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        Toast.makeText(fragment_signin.this, String.format("Selected Date: %d/%d/%d", dayOfMonth, (month+1), year),
                                Toast.LENGTH_SHORT).show();
                    }
                },year,month,day);
        datePickerDialog.show();
    }
}