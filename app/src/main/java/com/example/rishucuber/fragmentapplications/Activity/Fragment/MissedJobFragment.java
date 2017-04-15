package com.example.rishucuber.fragmentapplications.Activity.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rishucuber.fragmentapplications.Activity.Adapter.JobAdapter;
import com.example.rishucuber.fragmentapplications.Activity.Model.JobInformation;
import com.example.rishucuber.fragmentapplications.R;

import java.util.ArrayList;
import java.util.List;

public class MissedJobFragment extends Fragment {
    private static final int count = 10;
    static boolean isshow = true, button;
    ArrayList<JobInformation> data;
    private RecyclerView mRecyclerView;
    private JobAdapter mAdapter;

    public MissedJobFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /** Inflating the layout for this fragment **/
        View v = inflater.inflate(R.layout.fragment_missed_jobs, null);
        mRecyclerView = (RecyclerView) v.findViewById(R.id.missedJobsRecyclerView);

        data = new ArrayList<>();
        mAdapter = new JobAdapter(getActivity(), getData(), isshow);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        getValue();
        return v;
    }

    private boolean getValue() {
        button = true;
        return button;
    }

    private List<JobInformation> getData() {

        for (int i = 0; i < count; i++) {
            JobInformation job = new JobInformation("Driver Name: Suresh Kumar", "4 June, 2016 04:23",
                    "3846 W 38 Rd,Srishti Marg", "Mumbai", "5.6 K.m", getString(R.string.addtwo),
                    "20 min", getString(R.string.Rs) + " 1872");
            data.add(job);
        }
        return data;
    }


}
