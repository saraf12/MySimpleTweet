package com.codepath.apps.mysimpletweets.models;


import org.json.JSONException;
import org.json.JSONObject;

public class User {
    // List attributes
    private String name;
    private long uid;
    private String screenName;
    private String profileImageUrl;
    private String taglines;
    private int followersCount;
    private int followingsCount;

    public String getName() {
        return name;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public long getUid() {
        return uid;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getTaglines() {
        return taglines;
    }

    public int getFriendsCount() {
        return followingsCount;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    // deserialize the user json => User
    public static User fromJSON(JSONObject json) {
        User u = new User();
        // Extract and fill the values
        try {
            u.name = json.getString("name");
            u.uid = json.getLong("id");
            u.screenName = json.getString("screen_name");
            u.profileImageUrl = json.getString("profile_image_url");
            u.taglines = json.getString("description");
            u.followersCount = json.getInt("followers_count");
            u.followingsCount = json.getInt("friends_count");


        } catch (JSONException e) {
            e.printStackTrace();
        }
        //Return a user
        return u;
    }
}
