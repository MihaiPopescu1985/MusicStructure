package com.example.mpopescu.musicstructure;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class HitsFragmentPagerAdapter extends FragmentPagerAdapter {

    public HitsFragmentPagerAdapter(FragmentManager fm) {

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new SeventysHitsFragment();
            case 1:
                return new EightysHitsFragment();
            case 2:
                return new NinetysHitsFragment();
            case 3:
                return new OosHitsFragment();
            default:
                return new SeventysHitsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
