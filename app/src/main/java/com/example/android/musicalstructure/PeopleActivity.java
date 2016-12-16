package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PeopleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);
        TextView play = (TextView) findViewById(R.id.zzbf);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(PeopleActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });
        TextView aibum = (TextView) findViewById(R.id.zj);

        aibum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aibumIntent = new Intent(PeopleActivity.this, AibumActivity.class);
                startActivity(aibumIntent);
            }
        });
        TextView list = (TextView) findViewById(R.id.lb);

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(PeopleActivity.this, ListActivity.class);
                startActivity(listIntent);
            }
        });
    }
}
