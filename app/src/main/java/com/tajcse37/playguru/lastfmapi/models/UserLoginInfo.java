package com.tajcse37.playguru.lastfmapi.models;

import com.google.gson.annotations.SerializedName;
import com.tajcse37.playguru.lastfmapi.LastFmClient;

/**
 * Created by christoph on 17.07.16.
 */
public class UserLoginInfo {
    private static final String SESSION = "session";

    @SerializedName(SESSION)
    public LastfmUserSession mSession;


}
