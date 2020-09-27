package com.liyun.android.demo.view;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.liyun.android.demo.R;

public class SwitchActivity extends AppCompatActivity {

    private TextView textView;
    private Switch aSwitch;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);
        initView();
        initData();
        initAction();
    }

    private void initView() {
        textView = findViewById(R.id.switch_text_1);
        aSwitch = findViewById(R.id.switch1);
    }

    private void initData() {
        String text = String.valueOf(aSwitch.isChecked() ? aSwitch.getTextOn() : aSwitch.getTextOff());
        textView.setText(text);
    }

    private void initAction() {
        aSwitch.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            String text = String.valueOf(aSwitch.isChecked() ? aSwitch.getTextOn() : aSwitch.getTextOff());
            textView.setText(text);
        });
    }
}
