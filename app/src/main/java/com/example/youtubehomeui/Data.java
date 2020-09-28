package com.example.youtubehomeui;

public class Data {
    int thumbnailImage;
    String videoDuration;
    int profileImage;
    String title;
    String channelName;
    String views;
    String releaseTime;

    public Data(int thumbnailImage, String videoDuration, int profileImage, String title, String channelName, String views, String releaseTime) {
        this.thumbnailImage = thumbnailImage;
        this.videoDuration = videoDuration;
        this.profileImage = profileImage;
        this.title = title;
        this.channelName = channelName;
        this.views = views;
        this.releaseTime = releaseTime;
    }

    public int getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(int thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    public String getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(String videoDuration) {
        this.videoDuration = videoDuration;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }
}
