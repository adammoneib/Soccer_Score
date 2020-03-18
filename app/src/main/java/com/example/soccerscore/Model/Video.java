package com.example.soccerscore.Model;

import com.google.gson.annotations.SerializedName;

public class Video {

    @SerializedName("title")
    String title;
    @SerializedName("url")
    String liveURL;
    @SerializedName("thumbnail")
    String thumbnailImage;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLiveURL() {
        return liveURL;
    }

    public void setLiveURL(String liveURL) {
        this.liveURL = liveURL;
    }

    public String getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }
}
