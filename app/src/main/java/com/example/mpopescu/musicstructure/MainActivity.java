package com.example.mpopescu.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView seventysHits = findViewById(R.id._70s_hits);
        seventysHits.setOnClickListener(view -> startActivity(
                new Intent(MainActivity.this, SeventysHitsActivity.class)
        ));

        TextView eightysHits = findViewById(R.id._80s_hits);
        eightysHits.setOnClickListener(view -> startActivity(
                new Intent(MainActivity.this, EightysHitsActivity.class)
        ));

        TextView ninetysHits = findViewById(R.id._90s_hits);
        ninetysHits.setOnClickListener(view -> startActivity(
                new Intent(MainActivity.this, NinetysHitsActivity.class)
        ));

        TextView oosHits = findViewById(R.id._00s_hits);
        oosHits.setOnClickListener(view -> startActivity(
                new Intent(MainActivity.this, OosHitsActivity.class)
        ));
    }
}
