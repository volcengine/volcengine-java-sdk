package com.volcengine.ark.runtime.model.responses.content;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

public class InputContentItemAudio extends InputContentItem {

    @JsonProperty("audio_url")
    private String audioUrl;

    @JsonProperty("file_id")
    private String fileId;

    public InputContentItemAudio() {
        super(ResponsesConstants.CONTENT_ITEM_TYPE_INPUT_AUDIO);
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Override
    public String toString() {
        return "InputContentItemAudio{" +
                "type='" + getType() + '\'' +
                ", audioUrl='" + audioUrl + '\'' +
                ", fileId='" + fileId + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String audioUrl;
        private String fileId;

        public Builder type(String type) {
            return this;
        }

        public Builder audioUrl(String audioUrl) {
            this.audioUrl = audioUrl;
            return this;
        }

        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        public InputContentItemAudio build() {
            InputContentItemAudio item = new InputContentItemAudio();
            item.setAudioUrl(audioUrl);
            item.setFileId(fileId);
            return item;
        }
    }
}
