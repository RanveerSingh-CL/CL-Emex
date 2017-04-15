package com.example.rishucuber.fragmentapplications.Activity.Model;

import java.io.Serializable;

/**
 * Created by rishucuber on 7/4/17.
 */

public class JobInformation implements Serializable {
    private String mName, mDate, mAddress, mState, mAddressTwo, mRideTime, mDistance, mAmount;


    public JobInformation(String mName, String mDate, String mAddress, String mState, String mDistance,
                          String mAddressTwo, String mRideTime, String mAmount) {
        this.mName = mName;
        this.mDate = mDate;
        this.mAddress = mAddress;
        this.mState = mState;
        this.mAddressTwo = mAddressTwo;
        this.mRideTime = mRideTime;
        this.mDistance = mDistance;
        this.mAmount = mAmount;


    }

    public String getmName() {
        return mName;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getmState() {
        return mState;
    }

    public String getmAddressTwo() {
        return mAddressTwo;
    }

    public String getmTime() {
        return mRideTime;
    }

    public String getmDistance() {
        return mDistance;
    }

    public String getmAmount() {
        return mAmount;
    }

}
