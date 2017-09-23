package com.example.katarzkubat.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

public class PointAdapter extends FragmentPagerAdapter {

    public PointAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CultureFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new OutdoorFragment();
        } else {
            return new MonumentsFragment();
        }
    }
        @Override
        public int getCount() {
            return 4;
        }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Culture";
            case 1:
                return "Food";
            case 2:
                return "Outdoor";
            case 3:
                return "Monuments";
        }
        return null;
    }

    }


