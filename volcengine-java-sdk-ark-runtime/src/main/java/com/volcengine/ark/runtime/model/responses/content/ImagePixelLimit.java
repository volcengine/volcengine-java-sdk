package com.volcengine.ark.runtime.model.responses.content;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImagePixelLimit {
    @JsonProperty("max_pixels")
    private Long maxPixels;

    @JsonProperty("min_pixels")
    private Long minPixels;

    public Long getMaxPixels() {
        return maxPixels;
    }

    public void setMaxPixels(Long maxPixels) {
        this.maxPixels = maxPixels;
    }

    public Long getMinPixels() {
        return minPixels;
    }

    public void setMinPixels(Long minPixels) {
        this.minPixels = minPixels;
    }

    @Override
    public String toString() {
        return "ImagePixelLimit{" +
                "maxPixels=" + maxPixels +
                ", minPixels=" + minPixels +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long maxPixels;
        private Long minPixels;

        public Builder maxPixels(Long maxPixels) {
            this.maxPixels = maxPixels;
            return this;
        }

        public Builder minPixels(Long minPixels) {
            this.minPixels = minPixels;
            return this;
        }

        public ImagePixelLimit build() {
            ImagePixelLimit imagePixelLimit = new ImagePixelLimit();
            imagePixelLimit.setMaxPixels(maxPixels);
            imagePixelLimit.setMinPixels(minPixels);
            return imagePixelLimit;
        }
    }
}