/**
 * Music Structure app made for Udacity Android Basics by Google Nanodegree Program
 */


package com.example.mpopescu.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //On click, starts SeventysHitsActivity, passing a lambda expression to onClickListener
        TextView seventysHits = findViewById(R.id._70s_hits);
        seventysHits.setOnClickListener(view -> startActivity(
                new Intent(MainActivity.this, SeventysHitsActivity.class)
        ));

        //On click, starts EightysHitsActivity, passing a lambda expression to onClickListener
        TextView eightysHits = findViewById(R.id._80s_hits);
        eightysHits.setOnClickListener(view -> startActivity(
                new Intent(MainActivity.this, EightysHitsActivity.class)
        ));

        //On click, starts NinetysHitsActivity, passing a lambda expression to onClickListener
        TextView ninetysHits = findViewById(R.id._90s_hits);
        ninetysHits.setOnClickListener(view -> startActivity(
                new Intent(MainActivity.this, NinetysHitsActivity.class)
        ));

        //On click, starts OosHitsActivity, passing a lambda expression to onClickListener
        TextView oosHits = findViewById(R.id._00s_hits);
        oosHits.setOnClickListener(view -> startActivity(
                new Intent(MainActivity.this, OosHitsActivity.class)
        ));
    }
}
