package com.chenyi.criminalintent;

import java.util.UUID;

/**
 * Created by 译 on 2016/8/15.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        this.mId = mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public UUID getId() {

        return mId;
    }

    public void setId(UUID mId) {
        this.mId = mId;
    }
}
