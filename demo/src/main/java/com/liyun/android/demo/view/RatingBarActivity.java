package com.liyun.android.demo.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.liyun.android.demo.R;

public class RatingBarActivity extends AppCompatActivity {

    private TextView textView;
    private RatingBar ratingBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingbar);
        initView();     //初始化布局和控件，比如 findViewById
        initData();     //初始化数据，比如给控件设置初始数据
        initAction();   //初始化监听器，比如各种 Listener
    }

    private void initView(){
        textView = findViewById(R.id.progress_rating);
        ratingBar = findViewById(R.id.ratingbar1);
    }

    private void initData(){
        //设置显示文本的默认值
        textView.setText(String.valueOf(ratingBar.getRating()));
    }

    private void initAction(){

        //RatingBar 监听
        ratingBar.setOnRatingBarChangeListener((ratingBar, progress, b) -> {
            // mytag 为自定义的日志层级
            Log.e("mytag","onRatingChanged -> " + b + " -> " + progress);
            textView.setText(String.valueOf(progress));
        });

    }
}
