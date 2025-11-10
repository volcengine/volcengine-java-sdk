package com.volcengine.ark.runtime.model.files;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public  class PreprocessConfigs {
    public PreprocessConfigs() {
    }

    @JsonProperty(value = "video")
    private Video video;

    public static PreprocessConfigs.PreprocessConfigsBuilder builder() {
        return new PreprocessConfigs.PreprocessConfigsBuilder();
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public static final class PreprocessConfigsBuilder {
        private Video video;

        private PreprocessConfigsBuilder() {
        }

        public static PreprocessConfigsBuilder aPreprocessConfigs() {
            return new PreprocessConfigsBuilder();
        }

        public PreprocessConfigsBuilder video(Video video) {
            this.video = video;
            return this;
        }

        public PreprocessConfigs build() {
            PreprocessConfigs preprocessConfigs = new PreprocessConfigs();
            preprocessConfigs.setVideo(video);
            return preprocessConfigs;
        }
    }
}
