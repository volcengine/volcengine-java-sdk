package com.volcengine.ark.runtime.model.files;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Video {
    public Video(Double fps) {
        this.fps = fps;
    }

    @JsonProperty(value = "fps")
    private Double fps;

    public Double getFps() {
        return fps;
    }

    public void setFps(Double fps) {
        this.fps = fps;
    }

    public Video() {
    }

    public static final class VideoBuilder {
        private Double fps;

        private VideoBuilder() {
        }

        public static VideoBuilder aVideo() {
            return new VideoBuilder();
        }

        public VideoBuilder fps(Double fps) {
            this.fps = fps;
            return this;
        }

        public Video build() {
            Video video = new Video();
            video.setFps(fps);
            return video;
        }
    }
}
