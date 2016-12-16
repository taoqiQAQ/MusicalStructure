package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AibumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aibum);
        TextView play = (TextView) findViewById(R.id.zzbf);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(AibumActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });
        TextView people = (TextView) findViewById(R.id.yyr);
        people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent peopleIntent = new Intent(AibumActivity.this, PeopleActivity.class);
                startActivity(peopleIntent);
            }
        });
        TextView list = (TextView) findViewById(R.id.lb);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(AibumActivity.this, ListActivity.class);
                startActivity(listIntent);
            }
        });
    }
}
