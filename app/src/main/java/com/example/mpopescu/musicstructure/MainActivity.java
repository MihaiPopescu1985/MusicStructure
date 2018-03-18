/**
 * Music Structure app made for Udacity Android Basics by Google Nanodegree Program
 *
 * I've used song list from www.billboard.com
 * This app also implements a click that direct the user to the specific web pages
 *
 */

package com.example.mpopescu.musicstructure;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new HitsFragmentPagerAdapter(getSupportFragmentManager()));
    }
}
