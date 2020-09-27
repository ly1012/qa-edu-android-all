package com.liyun.android.demo.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.liyun.android.demo.R;

public class SeekBarActivity extends AppCompatActivity {

    private TextView textView;
    private SeekBar seekBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);
        initView();     //初始化布局和控件，比如 findViewById
        initData();     //初始化数据，比如给控件设置初始数据
        initAction();   //初始化监听器，比如各种 Listener
    }

    private void initView(){
        textView = findViewById(R.id.progress1);
        seekBar = findViewById(R.id.seekbar1);
    }

    private void initData(){
        //设置显示文本的默认值
        textView.setText(String.valueOf(seekBar.getProgress()));
    }

    private void initAction(){

        //SeekBar 监听
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            //SeekBar 进度变化过程中的事件
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // mytag 为自定义的日志层级
                Log.e("mytag","onProgressChanged -> " + fromUser + " -> " + progress);
                textView.setText(String.valueOf(progress));
            }

            //SeekBar 进度变化开始时的事件
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.e("mytag","onStartTrackingTouch");
            }

            //SeekBar 进度变化结束时的事件
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.e("mytag","onStopTrackingTouch");
            }
        });

    }
}
