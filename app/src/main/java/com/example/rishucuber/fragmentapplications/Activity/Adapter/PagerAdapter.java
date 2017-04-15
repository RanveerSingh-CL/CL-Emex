package com.example.rishucuber.fragmentapplications.Activity.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.rishucuber.fragmentapplications.Activity.Fragment.JobHistoryFragment;
import com.example.rishucuber.fragmentapplications.Activity.Fragment.MissedJobFragment;


public class PagerAdapter extends FragmentPagerAdapter {

    protected Context mContext;

    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                JobHistoryFragment nFragB = new JobHistoryFragment();
                return nFragB;
            case 1:
                MissedJobFragment nFragA = new MissedJobFragment();
                return nFragA;

            default:
                return null;

        }

    }


    @Override
    public int getCount() {
        return 2;
    }

}