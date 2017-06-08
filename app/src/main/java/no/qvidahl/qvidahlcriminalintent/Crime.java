package no.qvidahl.qvidahlcriminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Thomas on 14.03.2017.
 *
 */

class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    void setSolved(boolean solved) {
        mSolved = solved;
    }

    Crime() {
        // Generate unique ID
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public String getTitle() {
        return mTitle;
    }

    void setTitle(String title) {
        mTitle = title;
    }

    public UUID getId() {
        return mId;
    }
}
