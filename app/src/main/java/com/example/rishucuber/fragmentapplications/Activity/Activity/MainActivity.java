package com.example.rishucuber.fragmentapplications.Activity.Activity;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rishucuber.fragmentapplications.Activity.Fragment.JobFragment;
import com.example.rishucuber.fragmentapplications.R;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, android.view.View.OnClickListener {

    TextView mPayment, mJobHis, emContact, mHehp, mLogout;
    ImageView mImageViewHam;
    private DrawerLayout mDrawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        mImageViewHam.setImageResource(R.drawable.btn_menu);
        mImageViewHam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.openDrawer(GravityCompat.START);

            }
        });

        mJobHis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                JobFragment hello = new JobFragment();
                fragmentTransaction.add(R.id.content_frame, hello, "HELLO");
                fragmentTransaction.commit();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // The action bar home/up action should open or close the drawer.

        if (item.getItemId() == android.R.id.home)
            mDrawer.openDrawer(GravityCompat.START);
        return true;


    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    private void init() {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nvView);
        View headerview = navigationView.getHeaderView(0);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        mPayment = (TextView) headerview.findViewById(R.id.payment);
        mJobHis = (TextView) headerview.findViewById(R.id.jobhis);
        emContact = (TextView) headerview.findViewById(R.id.emcontact);
        mHehp = (TextView) headerview.findViewById(R.id.help);
        mLogout = (TextView) headerview.findViewById(R.id.logout);
        mImageViewHam = (ImageView) findViewById(R.id.iv_button);

    }
}
