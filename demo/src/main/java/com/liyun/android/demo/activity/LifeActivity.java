package com.liyun.android.demo.activity;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.liyun.android.demo.R;

public class LifeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_edittext);
        Log.e("mytag", "Activity onCreate...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("mytag", "Activity onStart...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("mytag", "Activity onResume...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("mytag", "Activity onPause...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("mytag", "Activity onStop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("mytag", "Activity onDestroy...");
    }
}
