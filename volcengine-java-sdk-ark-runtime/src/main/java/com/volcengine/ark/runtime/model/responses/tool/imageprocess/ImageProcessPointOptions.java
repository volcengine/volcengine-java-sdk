package com.volcengine.ark.runtime.model.responses.tool.imageprocess;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImageProcessPointOptions {
    @JsonProperty("type")
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ImageProcessPointOptions{" +
                "type='" + type + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String type;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ImageProcessPointOptions build() {
            ImageProcessPointOptions imageProcessPointOptions = new ImageProcessPointOptions();
            imageProcessPointOptions.setType(type);
            return imageProcessPointOptions;
        }
    }
}