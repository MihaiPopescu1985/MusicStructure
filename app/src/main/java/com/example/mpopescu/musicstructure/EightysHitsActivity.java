package com.example.mpopescu.musicstructure;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 setContentView(R.layout.activity_category);
 getSupportFragmentManager().beginTransaction()
 .replace(R.id.container, new NumbersFragment())
 .commit();
 }
 }
 *
 */

public class EightysHitsActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new EightysHitsFragment())
                .commit();
    }
}
