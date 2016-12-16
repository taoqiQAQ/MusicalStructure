package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到显示正在播放 类别的视图
        TextView play = (TextView) findViewById(R.id.play);
        //在该视图上设置一个点击监听器
        play.setOnClickListener(new View.OnClickListener() {
            //当点击正在播放 类别时，将执行此方法中的代码。
            @Override
            public void onClick(View view) {
                //创建一个新意图以打开{@link PlayActivity}
                Intent playIntent = new Intent(MainActivity.this, PlayActivity.class);
                //启动新的Activity
                startActivity(playIntent);
            }
        });

        //找到显示音乐人 类别的视图
        TextView people = (TextView) findViewById(R.id.people);
        //在该视图上设置一个点击监听器
        people.setOnClickListener(new View.OnClickListener() {
            //当点击正音乐人 类别时，将执行此方法中的代码。
            @Override
            public void onClick(View view) {
                //创建一个新意图以打开{@link PeopleActivity}
                Intent peopleIntent = new Intent(MainActivity.this, PeopleActivity.class);
                //启动新的Activity
                startActivity(peopleIntent);
            }
        });

        //找到显示正在播放 类别的视图
        TextView aibum = (TextView) findViewById(R.id.aibum);
        //在该视图上设置一个点击监听器
        aibum.setOnClickListener(new View.OnClickListener() {
            //当点击正在播放 类别时，将执行此方法中的代码。
            @Override
            public void onClick(View view) {
                //创建一个新意图以打开{@link PlayActivity}
                Intent aibumIntent = new Intent(MainActivity.this, AibumActivity.class);
                //启动新的Activity
                startActivity(aibumIntent);
            }
        });

        //找到显示正在播放 类别的视图
        TextView list = (TextView) findViewById(R.id.list);
        //在该视图上设置一个点击监听器
        list.setOnClickListener(new View.OnClickListener() {
            //当点击正在播放 类别时，将执行此方法中的代码。
            @Override
            public void onClick(View view) {
                //创建一个新意图以打开{@link PlayActivity}
                Intent listIntent = new Intent(MainActivity.this, ListActivity.class);
                //启动新的Activity
                startActivity(listIntent);
            }
        });
    }
}
