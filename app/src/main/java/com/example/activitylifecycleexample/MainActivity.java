package com.example.activitylifecycleexample;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "Message";
    com.example.activitylifecycleexample.databinding.ActivityMainBinding binding;
    View view;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "First Activity onCreate");
        binding = com.example.activitylifecycleexample.databinding.ActivityMainBinding.inflate(getLayoutInflater());
        view = binding.getRoot();
        setContentView(view);


        binding.btnOpenSecondActivity.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, SecondActivity.class));
        });

        binding.btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count += 1;
                binding.tvCount.setText("" + count);
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "First Activity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "First Activity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "First Activity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "First Activity onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "First Activity onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "First Activity onDestroy");
    }
}