package no.qvidahl.qvidahlcriminalintent;

import java.util.UUID;

/**
 * Created by Thomas on 14.03.2017.
 */

public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        // Generate unique ID
        mId = UUID.randomUUID();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getId() {
        return mId;
    }
}
