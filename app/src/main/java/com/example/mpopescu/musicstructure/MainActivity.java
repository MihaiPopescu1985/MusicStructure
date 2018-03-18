/**
 * Music Structure app made for Udacity Android Basics by Google Nanodegree Program
 * <p>
 * I've used song list from www.billboard.com
 * This app also implements a click that direct the user to the specific web pages
 */

package com.example.mpopescu.musicstructure;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;

public class MainActivity extends AppCompatActivity {

    private int[] tabNames = {R.string._70s_text_view,
            R.string._80s_text_view,
            R.string._90s_text_view,
            R.string._00s_text_view};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new HitsFragmentPagerAdapter(getSupportFragmentManager()));

        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        for (int i = 0; i < tabNames.length; i++)
            tabLayout.getTabAt(i).setText(tabNames[i]);
    }
}
