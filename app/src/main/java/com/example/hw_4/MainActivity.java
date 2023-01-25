package com.example.hw_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hw_4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.example.hw_4.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new BlankFragment()).commit();
        }
    }
}