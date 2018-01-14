package com.example.cslab.criminal;


import java.security.PublicKey;
import java.util.Date;
import java.util.UUID;

/**
 * Created by CSLab on 2018/1/14.
 */

public class Crime {
    private UUID mid;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        mid= UUID.randomUUID();
        mDate= new Date();
    }

    public UUID getMid() {
        return mid;
    }

    public void setMid(UUID mid) {
        this.mid = mid;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }
}
