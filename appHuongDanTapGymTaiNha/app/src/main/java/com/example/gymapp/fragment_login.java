package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fragment_login extends AppCompatActivity {
    TextView tv_godangki;
    Button btn_login;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_login);
        tv_godangki = findViewById(R.id.tv_taotaikhoan);
        btn_login = findViewById(R.id.btn_login);
        tv_godangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyendangkiIntent = new Intent(fragment_login.this, fragment_signin.class);
                startActivity(chuyendangkiIntent);
            }
        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyentrangchuIntent = new Intent(fragment_login.this, trangchu.class);
                startActivity(chuyentrangchuIntent);
            }
        });
    }
}