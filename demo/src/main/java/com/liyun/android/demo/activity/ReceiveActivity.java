package com.liyun.android.demo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.liyun.android.demo.R;

import java.util.Arrays;

public class ReceiveActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_byval_receive);
        textView = findViewById(R.id.byval_receive1);

        Intent intent = getIntent();

        //传值方法一传过来的值
        String value1 = intent.getStringExtra("key1");
        int value2 = intent.getIntExtra("key2", 0);
        double value3 = intent.getDoubleExtra("key3", 1.00);
        boolean value4 = intent.getBooleanExtra("key4", true);
        int[] value5 = intent.getIntArrayExtra("key5");
        String text = String.format("v1: %s,\n v2: %s,\n v3: %s,\n v4: %s,\n v5: %s",value1, value2, value3, value4, Arrays.toString(value5));

        //【添加到子节点】对应：intent.putExtra("bundle", bundle);
        Bundle bundle = intent.getBundleExtra("bundle");
        //注意：有这句 get 和 没有这句 get，bundle.toString() 的结果是不一样的！！！值没有改变，只是打印内容不一样。
        String value6 = bundle.getString("key6");
        //所有传过来的值，手动拼接
        String text1 = text + "\n v6: " + value6 + "\n" + bundle.toString();
        textView.setText(text1);

        //【添加到根节点】所有传过来的值，获取全部
        //String text2 = intent.getExtras().toString();
        //textView.setText( text2);

    }
}
