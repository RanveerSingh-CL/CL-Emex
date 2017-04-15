package com.example.rishucuber.fragmentapplications.Activity.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.rishucuber.fragmentapplications.Activity.Model.JobInformation;
import com.example.rishucuber.fragmentapplications.R;

import java.util.Collections;
import java.util.List;

;

/**
 * Created by rishucuber on 7/4/17.
 */

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.MyViewHolder> {
    List<JobInformation> data = Collections.emptyList();
    Context context;
    private boolean isshown;

    public JobAdapter(Context context, List<JobInformation> data, boolean isshown) {
        this.data = data;
        this.context = context;
        this.isshown = isshown;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_row, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        JobInformation current = data.get(position);
        holder.date.setText(current.getmDate());
        holder.distance.setText(current.getmDistance());
        holder.name.setText(current.getmName());
        holder.addressone.setText(current.getmAddress());
        holder.addresstwo.setText(current.getmAddressTwo());
        holder.stateone.setText(current.getmState());
        holder.ridetime.setText(current.getmTime());
        holder.amount.setText(current.getmAmount());


        if (isshown) {
            holder.paymentrow.setVisibility(View.GONE);
            holder.addresstwo.setVisibility(View.GONE);
            holder.statetwo.setVisibility(View.GONE);
            holder.simpleView.setVisibility(View.GONE);
            holder.verticalView.setVisibility(View.GONE);
            holder.redDot.setVisibility(View.GONE);
            holder.greenDot.setVisibility(View.GONE);
            holder.subsGreenDot.setVisibility(View.VISIBLE);
        } else {
            holder.paymentrow.setVisibility(View.VISIBLE);
            holder.addresstwo.setVisibility(View.VISIBLE);
            holder.statetwo.setVisibility(View.VISIBLE);
            holder.simpleView.setVisibility(View.VISIBLE);
            holder.verticalView.setVisibility(View.VISIBLE);
            holder.redDot.setVisibility(View.VISIBLE);
            holder.subsGreenDot.setVisibility(View.GONE);
            holder.greenDot.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView date, name, addressone, addresstwo, ridetime, amount, distance, stateone, statetwo;
        LinearLayout paymentrow, templay;
        View simpleView, verticalView, redDot, greenDot, subsGreenDot;

        public MyViewHolder(final View itemView) {
            super(itemView);
            date = (TextView) itemView.findViewById(R.id.date);
            distance = (TextView) itemView.findViewById(R.id.distance);
            name = (TextView) itemView.findViewById(R.id.dname);
            addressone = (TextView) itemView.findViewById(R.id.addressone);
            stateone = (TextView) itemView.findViewById(R.id.stateone);
            addresstwo = (TextView) itemView.findViewById(R.id.addresstwo);
            statetwo = (TextView) itemView.findViewById(R.id.statetwo);
            ridetime = (TextView) itemView.findViewById(R.id.rideTime);
            amount = (TextView) itemView.findViewById(R.id.amount);
            paymentrow = (LinearLayout) itemView.findViewById(R.id.payment_row);
            simpleView = itemView.findViewById(R.id.simple_view);
            verticalView = itemView.findViewById(R.id.vertical_view);
            redDot = itemView.findViewById(R.id.red_dot);
            greenDot = itemView.findViewById(R.id.green_dot);
            subsGreenDot = itemView.findViewById(R.id.subs_green_dot);


        }
    }


}
