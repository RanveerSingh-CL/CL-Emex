package com.example.rishucuber.fragmentapplications.Activity.Model;


/**
 * Created by rishucuber on 13/4/17.
 */

public class DataModel {
    private String text;
    private int image;

    //Constructor
    public DataModel(String text, int image) {
        this.text = text;
        this.image = image;
    }

    //private int images[] = {R.drawable.icon_networks,R.drawable.ico
    // n_payment_normal,R.drawable.icon_job_normal,R.drawable.icon_emergency_normal,R.drawable
    // .icon_help_normal,R.drawable.icon_logout_normal};
    public String getText() {
        return text;
    }

    public int getImage() {
        return image;
    }


}
