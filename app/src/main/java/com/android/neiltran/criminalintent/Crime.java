package com.android.neiltran.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by neil.tran on 11/2/2015.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }

    public void setSolved(boolean solved) {
        this.mSolved = solved;
    }

    public UUID getId() {
        return this.mId;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public Date getDate() {
        return this.mDate;
    }

    public boolean isSolved() {
        return this.mSolved;
    }
}
