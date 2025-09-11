package com.volcengine.ark.runtime.model.responses.tool.imageprocess;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImageProcessAction {
    @JsonProperty("type")
    private String type;

    @JsonProperty("result_image_url")
    private String resultImageUrl;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResultImageUrl() {
        return resultImageUrl;
    }

    public void setResultImageUrl(String resultImageUrl) {
        this.resultImageUrl = resultImageUrl;
    }

    @Override
    public String toString() {
        return "ImageProcessAction{" +
                "type='" + type + '\'' +
                ", resultImageUrl='" + resultImageUrl + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String type;
        private String resultImageUrl;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder resultImageUrl(String resultImageUrl) {
            this.resultImageUrl = resultImageUrl;
            return this;
        }

        public ImageProcessAction build() {
            ImageProcessAction imageProcessAction = new ImageProcessAction();
            imageProcessAction.setType(type);
            imageProcessAction.setResultImageUrl(resultImageUrl);
            return imageProcessAction;
        }
    }
}