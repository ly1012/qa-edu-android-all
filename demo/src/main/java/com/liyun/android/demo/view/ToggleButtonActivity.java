package com.liyun.android.demo.view;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.liyun.android.demo.R;

public class ToggleButtonActivity extends AppCompatActivity {

    private TextView textView;
    private ToggleButton toggleButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_togglebutton);
        initView();
        initData();
        initAction();
    }

    private void initView() {
        textView = findViewById(R.id.togglebutton_text_1);
        toggleButton = findViewById(R.id.togglebutton1);
    }

    private void initData() {
        String text = String.valueOf(toggleButton.isChecked() ? toggleButton.getTextOn() : toggleButton.getTextOff());
        textView.setText(text);
    }

    private void initAction() {
        toggleButton.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            String text = String.valueOf(toggleButton.isChecked() ? toggleButton.getTextOn() : toggleButton.getTextOff());
            textView.setText(text);
        });
    }
}
