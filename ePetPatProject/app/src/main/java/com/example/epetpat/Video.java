package com.example.epetpat;

import android.net.Uri;
import android.widget.VideoView;

import java.io.Serializable;

public class Video implements Serializable {
    private String videoTitle;
    private String video;

    public Video(String videoTitle, String video) {
        this.videoTitle = videoTitle;
        this.video = video;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
