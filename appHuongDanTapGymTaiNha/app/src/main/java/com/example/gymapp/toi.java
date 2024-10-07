package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class toi extends AppCompatActivity {
    TextView home,discover, pt, lichtrinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toi);
        home = findViewById(R.id.tv_home);
        discover = findViewById(R.id.tv_discover);
        pt = findViewById(R.id.tv_pt);
        lichtrinh = findViewById(R.id.tv_lichtrinh);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, trangchu.class);
                startActivity(intent);
            }
        });
        discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, fragment_discover.class);
                startActivity(intent);
            }
        });
        lichtrinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, fragment_lichtrinh.class);
                startActivity(intent);
            }
        });
        TextView tv_hosotoi = findViewById(R.id.tv_hosotoi);
        tv_hosotoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, toi_hoso.class);
                startActivity(intent);
            }
        });
        TextView tv_favorite = findViewById(R.id.textView2);
        tv_favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, toi_favorite.class);
                startActivity(intent);
            }
        });
        TextView tv_practice = findViewById(R.id.textView4);
        tv_practice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, toi_practice.class);
                startActivity(intent);
            }
        });
        TextView tv_setting = findViewById(R.id.textView5);
        tv_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, toi_setting.class);
                startActivity(intent);
            }
        });

        TextView tv_language = findViewById(R.id.textView6);
        tv_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, toi_language.class);
                startActivity(intent);
            }
        });
       TextView tv_suppost = findViewById(R.id.textView8);
        tv_suppost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, thongtinnhom.class);
                startActivity(intent);
            }
        });
        View tv_discover = findViewById(R.id.tv_pt);
        tv_discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscoverIntent = new Intent(toi.this, fragment_trangpt1.class);
                startActivity(ctdiscoverIntent);
            }
        });
    }
}