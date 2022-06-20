package com.example.mobilehotelgroup2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

/**
 * @author ASUS
 */
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnList = findViewById(R.id.btnList);
        btnList.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intent);
        });

        Button btnInput = findViewById(R.id.btnInput);
        btnInput.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, InputKamarActivity.class);
            startActivity(intent);
        });
    }
}