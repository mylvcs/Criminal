package com.nuaa.wmy.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by wmy on 2018/1/7.
 */

public class Crime {
    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

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

    public Crime(){
        mID =UUID.randomUUID();
        mDate = new Date();

    }

    public UUID getmID() {
        return mID;
    }
}
