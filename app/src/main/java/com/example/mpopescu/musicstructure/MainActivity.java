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

        seventysHits.setOnClickListener(view -> {
            Intent seventysIntent = new Intent(MainActivity.this, SeventysHitsActivity.class);
        startActivity(seventysIntent);});
    }
}
