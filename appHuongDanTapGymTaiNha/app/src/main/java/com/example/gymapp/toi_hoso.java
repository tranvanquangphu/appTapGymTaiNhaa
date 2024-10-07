package com.example.gymapp;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class toi_hoso extends AppCompatActivity {
    EditText editText;
    TextView back;
    EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toi_hoso);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToAnotherActivity();
            }
        });
    }

    public void navigateToAnotherActivity() {
        Intent intent = new Intent(toi_hoso.this, toi.class);
        startActivity(intent);
    }
}