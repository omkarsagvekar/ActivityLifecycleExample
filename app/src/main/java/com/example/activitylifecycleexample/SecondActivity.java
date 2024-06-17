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

import com.example.activitylifecycleexample.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    public static final String TAG = "Message";
    ActivitySecondBinding binding;
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Second Activity onCreate");
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        view = binding.getRoot();
        setContentView(view);

        binding.btnGoToFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Second Activity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Second Activity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Second Activity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Second Activity onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Second Activity onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Second Activity onDestroy");
    }
}