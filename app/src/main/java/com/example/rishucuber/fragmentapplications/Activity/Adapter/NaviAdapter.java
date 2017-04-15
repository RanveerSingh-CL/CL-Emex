package com.example.rishucuber.fragmentapplications.Activity.Adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rishucuber.fragmentapplications.Activity.Model.DataModel;
import com.example.rishucuber.fragmentapplications.R;

import java.util.ArrayList;


/**
 * Created by rishucuber on 13/4/17.
 */

//custom adapter class
public class NaviAdapter extends ArrayAdapter<DataModel> {
    Context context;
    ArrayList<DataModel> data;


    //CONSTRUCTOR


    public NaviAdapter(@NonNull Context context, @LayoutRes int resource, ArrayList<DataModel> data) {
        super(context, resource);
        this.data = data;
        this.context = context;
    }

    //getView Method
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        DataModel data = getItem(position);
        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.navigation_row, parent, false);

        }

        TextView textview = (TextView) convertView.findViewById(R.id.elementtv);
        ImageView imageview = (ImageView) convertView.findViewById(R.id.elementicon);

        // Populate the data into the template view using the data object

        textview.setText(data.getText());
        imageview.setImageResource(data.getImage());
        // Return the completed view to render on screen

        return convertView;

    }


}
