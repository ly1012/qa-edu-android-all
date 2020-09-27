package com.liyun.android.demo.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.liyun.android.demo.R;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview);

        //设置图片来源，方法二：代码的优先级高于 XML 属性，可以看到图片被代码替换了
        imageView = findViewById(R.id.image1);
        imageView.setImageResource(R.mipmap.sheep);
    }
}