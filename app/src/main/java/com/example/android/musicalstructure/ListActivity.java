package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        TextView play = (TextView) findViewById(R.id.zzbf);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(ListActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });
        TextView people = (TextView) findViewById(R.id.yyr);
        people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent peopleIntent = new Intent(ListActivity.this, PeopleActivity.class);
                startActivity(peopleIntent);
            }
        });
        TextView aibum = (TextView) findViewById(R.id.zj);
        aibum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aibumIntent = new Intent(ListActivity.this, AibumActivity.class);
                startActivity(aibumIntent);
            }
        });
    }
}
