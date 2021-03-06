package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by bnb003 on 17/08/2017.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    public Crime() {
// Generate unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }
    public String getTitle() {
        return mTitle;
    }
    public void setTitle(String title) {
        mTitle = title;
    }

}
