package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        TextView people = (TextView) findViewById(R.id.yyr);
        people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent peopleIntent = new Intent(PlayActivity.this, PeopleActivity.class);
                startActivity(peopleIntent);
            }
        });
        TextView list = (TextView) findViewById(R.id.lb);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(PlayActivity.this, ListActivity.class);
                startActivity(listIntent);
            }
        });
        TextView aibum = (TextView) findViewById(R.id.yyr);
        aibum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aibumIntent = new Intent(PlayActivity.this, AibumActivity.class);
                startActivity(aibumIntent);
            }
        });
    }
}
