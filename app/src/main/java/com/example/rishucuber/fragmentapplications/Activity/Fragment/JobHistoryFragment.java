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

public class JobHistoryFragment extends Fragment {
    private static final int count = 10;
    static boolean isshow = false, button;
    ArrayList<JobInformation> data;
    private RecyclerView recyclerView;
    private JobAdapter adapter;

    public JobHistoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /** Inflating the layout for this fragment **/
        View v = inflater.inflate(R.layout.fragment_job_history, null);
        /*Creating an object of Arraylist*/

        data = new ArrayList<>();
        recyclerView = (RecyclerView) v.findViewById(R.id.jobHistoryRecyclerView);
        /* Creating an object of Recycler View Adapter*/
        adapter = new JobAdapter(getActivity(), getData(), isshow);
        /*set adapter to the recyclerView*/
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return v;
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

    private boolean getValue() {
        button = false;
        return button;
    }
}
