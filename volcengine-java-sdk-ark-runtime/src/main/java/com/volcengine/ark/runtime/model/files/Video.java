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

    @JsonProperty(value = "model")
    private String model;

    @JsonProperty(value = "max_video_tokens")
    private Long maxVideoTokens;

    @JsonProperty(value = "min_frame_tokens")
    private Long minFrameTokens;

    @JsonProperty(value = "max_frame_tokens")
    private Long maxFrameTokens;

    @JsonProperty(value = "min_frames")
    private Long minFrames;

    public Double getFps() {
        return fps;
    }

    public void setFps(Double fps) {
        this.fps = fps;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getMaxVideoTokens() {
        return maxVideoTokens;
    }

    public void setMaxVideoTokens(Long maxVideoTokens) {
        this.maxVideoTokens = maxVideoTokens;
    }

    public Long getMinFrameTokens() {
        return minFrameTokens;
    }

    public void setMinFrameTokens(Long minFrameTokens) {
        this.minFrameTokens = minFrameTokens;
    }

    public Long getMaxFrameTokens() {
        return maxFrameTokens;
    }

    public void setMaxFrameTokens(Long maxFrameTokens) {
        this.maxFrameTokens = maxFrameTokens;
    }

    public Long getMinFrames() {
        return minFrames;
    }

    public void setMinFrames(Long minFrames) {
        this.minFrames = minFrames;
    }

    public Video() {
    }

    @Override
    public String toString() {
        return "Video{" +
                "fps=" + fps +
                ", model='" + model + '\'' +
                ", maxVideoTokens=" + maxVideoTokens +
                ", minFrameTokens=" + minFrameTokens +
                ", maxFrameTokens=" + maxFrameTokens +
                ", minFrames=" + minFrames +
                '}';
    }

    public static VideoBuilder builder() {
        return new VideoBuilder();
    }

    public static final class VideoBuilder {
        private Double fps;
        private String model;
        private Long maxVideoTokens;
        private Long minFrameTokens;
        private Long maxFrameTokens;
        private Long minFrames;

        private VideoBuilder() {
        }

        public static VideoBuilder aVideo() {
            return new VideoBuilder();
        }

        public VideoBuilder fps(Double fps) {
            this.fps = fps;
            return this;
        }

        public VideoBuilder model(String model) {
            this.model = model;
            return this;
        }

        public VideoBuilder maxVideoTokens(Long maxVideoTokens) {
            this.maxVideoTokens = maxVideoTokens;
            return this;
        }

        public VideoBuilder minFrameTokens(Long minFrameTokens) {
            this.minFrameTokens = minFrameTokens;
            return this;
        }

        public VideoBuilder maxFrameTokens(Long maxFrameTokens) {
            this.maxFrameTokens = maxFrameTokens;
            return this;
        }

        public VideoBuilder minFrames(Long minFrames) {
            this.minFrames = minFrames;
            return this;
        }

        public Video build() {
            Video video = new Video();
            video.setFps(fps);
            video.setModel(model);
            video.setMaxVideoTokens(maxVideoTokens);
            video.setMinFrameTokens(minFrameTokens);
            video.setMaxFrameTokens(maxFrameTokens);
            video.setMinFrames(minFrames);
            return video;
        }
    }
}
