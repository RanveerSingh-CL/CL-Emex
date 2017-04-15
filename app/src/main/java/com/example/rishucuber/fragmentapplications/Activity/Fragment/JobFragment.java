package com.example.rishucuber.fragmentapplications.Activity.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rishucuber.fragmentapplications.Activity.Adapter.PagerAdapter;
import com.example.rishucuber.fragmentapplications.R;

public class JobFragment extends Fragment {
    PagerAdapter mCustomPagerAdapter;
    ViewPager mViewPager;
    TextView tab1, tab2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /** Inflating the layout for this fragment **/
        View v = inflater.inflate(R.layout.fragment_job, null);
        tab1 = (TextView) v.findViewById(R.id.tab1);
        tab2 = (TextView) v.findViewById(R.id.tab2);
        tab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        mCustomPagerAdapter = new PagerAdapter(getFragmentManager(), getActivity());

        mViewPager = (ViewPager) v.findViewById(R.id.pager);
        mViewPager.setAdapter(mCustomPagerAdapter);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 0) {
                    tab2.setBackgroundResource(R.color.colorPrimaryDark);
                    tab1.setBackgroundResource(R.color.colorPrimary);

                } else {
                    tab1.setBackgroundResource(R.color.colorPrimaryDark);
                    tab2.setBackgroundResource(R.color.colorPrimary);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        return v;
    }


}