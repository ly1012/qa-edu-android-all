package com.liyun.android.demo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.liyun.android.demo.R;

public class SendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_byval_send);
    }

    public void jumpToNextActivity(View view){
        Intent intent = new Intent(this, ReceiveActivity.class);

        //传值方法一：直接传值
        intent.putExtra("key1","StringValue");
        intent.putExtra("key2",100);
        intent.putExtra("key3", 111.111);
        intent.putExtra("key4",true);
        intent.putExtra("key5", new int[]{1, 2, 3, 4, 5});

        //传值方法二：先打包到一个对象，再传值
        Bundle bundle = new Bundle();
        bundle.putString("key6","StringValueFromBundle");
        bundle.putInt("key7",200);
        bundle.putDouble("key8", 222.222);
        bundle.putBoolean("key9",true);
        bundle.putIntArray("key10", new int[]{6, 7, 8, 9, 10});



        //添加到子节点 bundle
        intent.putExtra("bundle", bundle);

        //更多知识点：
        //1. 传递实体类对象也是支持的，但实体类必须实现序列化接口。
        //赋值方式一：
        //intent.putExtra("student", student);
        //Student student = (Student) intent.getSerializableExtra("student");
        //赋值方式二：
        //bundle.putSerializable("student2",student2);
        //Student student2 = bundle.getSerializable("student2");

        //添加到根节点，即 bundle 里的 key 作为根节点 key，即 key 在第一级
        //intent.putExtras(bundle);

        //启动（下一个） Activity
        startActivity(intent);

        //如有必要，可以关闭当前 Activity，关闭后按返回键不会回到这个 Activity，因为已经被销毁了
        //finish();
    }

}
