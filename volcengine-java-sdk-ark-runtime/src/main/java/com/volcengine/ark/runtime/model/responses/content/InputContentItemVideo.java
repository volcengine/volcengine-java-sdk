package com.volcengine.ark.runtime.model.responses.content;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

public class InputContentItemVideo extends InputContentItem {

    @JsonProperty("video_url")
    private String videoUrl;

    @JsonProperty("file_id")
    private String fileId;

    @JsonProperty("fps")
    private Float fps;

    public InputContentItemVideo() {
        super(ResponsesConstants.CONTENT_ITEM_TYPE_INPUT_VIDEO);
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Float getFps() {
        return fps;
    }

    public void setFps(Float fps) {
        this.fps = fps;
    }

    @Override
    public String toString() {
        return "InputContentItemVideo{" +
                "type='" + getType() + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", fileId='" + fileId + '\'' +
                ", fps=" + fps +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String videoUrl;
        private String fileId;
        private Float fps;

        public Builder type(String type) {
            return this;
        }

        public Builder videoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }

        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        public Builder fps(Float fps) {
            this.fps = fps;
            return this;
        }

        public InputContentItemVideo build() {
            InputContentItemVideo responsesContentItemVideo = new InputContentItemVideo();
            responsesContentItemVideo.setVideoUrl(videoUrl);
            responsesContentItemVideo.setFileId(fileId);
            responsesContentItemVideo.setFps(fps);
            return responsesContentItemVideo;
        }
    }
}