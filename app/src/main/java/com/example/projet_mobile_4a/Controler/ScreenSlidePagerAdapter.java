package com.example.projet_mobile_4a.Controler;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.projet_mobile_4a.View.CalendrierFragment;

public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
    private static final int NUM_PAGES = 3;
    public ScreenSlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new CalendrierFragment();
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }
}