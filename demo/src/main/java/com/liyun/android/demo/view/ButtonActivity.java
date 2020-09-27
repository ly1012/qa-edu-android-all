package com.liyun.android.demo.view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.liyun.android.demo.R;

// 绑定点击事件：方法三（implements View.OnClickListener）
public class ButtonActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_button);

        // 绑定点击事件：方法二（在页面加载时绑定事件）
        button2 = findViewById(R.id.button_2);
        button2.setOnClickListener(
                (view) -> Toast.makeText(ButtonActivity.this,"按钮二被点击",Toast.LENGTH_SHORT).show());

        // 绑定点击事件：方法三（implements View.OnClickListener）
        button3 = findViewById(R.id.button_3);
        button3.setOnClickListener(this);
    }

    // 绑定点击事件：方法一（layout onClick 属性绑定函数，通过反射实现）
    public void showTips(View view){
        Toast toast = Toast.makeText(this, "按钮一被点击",Toast.LENGTH_SHORT);
        // Toast 居中显示
        toast.setGravity(Gravity.TOP, 0 ,0);
        toast.show();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("我是标题");
        builder.setMessage("今天学习了吗？");
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setCancelable(false);
        //也可以将按钮放在 View 里，给按钮绑定事件
        View view1 = View.inflate(this, R.layout.activity_alert_textview, null);
        builder.setView(view1);
        //右侧-右边，Positive 是积极、正面的意思
        builder.setPositiveButton("确定",
                (dialog, which) -> Toast.makeText(ButtonActivity.this,"你点击了确定",Toast.LENGTH_SHORT).show());
        //右侧-左边，Negative 是消极、负面的意思
        builder.setNegativeButton("取消",
                (dialog, which) -> Toast.makeText(ButtonActivity.this,"你点击了取消",Toast.LENGTH_SHORT).show());
        //左侧，Neutral 是中立的意思
        builder.setNeutralButton("是啥",
                (dialog, which) -> Toast.makeText(ButtonActivity.this,"你点击了啥",Toast.LENGTH_SHORT).show());
        builder.show();
    }

    // 绑定点击事件：方法三（implements View.OnClickListener）
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_3:
                Toast.makeText(this, "按钮三被点击",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
    }
}