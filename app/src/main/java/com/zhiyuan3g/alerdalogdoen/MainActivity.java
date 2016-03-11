package com.zhiyuan3g.alerdalogdoen;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtshow= (EditText) findViewById(R.id.txtshow);
    }
    public void simple(View view){
        new AlertDialog.Builder(this)
                .setTitle("标题")
                .setIcon(R.drawable.bus)
                .setMessage("确认选择吗？")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        txtshow.setText("你点击了确定");
                    }
                }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                txtshow.setText("取消");
            }
        }).show();
    }

    String[] names={"1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1",};
    boolean[] sd={true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,};
    public void simplelist(View view){
        new AlertDialog.Builder(this)
                .setTitle("标题")
                .setIcon(R.drawable.bus)
                .setItems(names, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        txtshow.setText("您选择了" + names[which]);
                    }
                }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                txtshow.setText("您选择了确定");
            }
        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                txtshow.setText("您选择了取消");
            }
        }).show();
    }
    public void radiolist(View view){
        new AlertDialog.Builder(this)
                .setTitle("标题")
                .setIcon(R.drawable.bus)
                .setSingleChoiceItems(names, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        txtshow.setText("您选择了" + names[which]);
                    }
                }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                txtshow.setText("您选择了确定");
            }
        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                txtshow.setText("您选择了取消");
            }
        }).show();
    }
    public void chocekbox(View view){
        new AlertDialog.Builder(this)
                .setTitle("标题")
                .setIcon(R.drawable.bus)
                .setMultiChoiceItems(names, sd, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        sd[which]=isChecked;
                        txtshow.setText("您选择了"+names[which]);
                    }
                }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                txtshow.setText("您选择了确定");
            }
        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                txtshow.setText("您选择了取消");
            }
        }).show();
    }

}
