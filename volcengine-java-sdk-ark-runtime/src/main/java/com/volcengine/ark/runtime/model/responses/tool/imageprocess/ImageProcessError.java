package com.volcengine.ark.runtime.model.responses.tool.imageprocess;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImageProcessError {
    @JsonProperty("message")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ImageProcessError{" +
                "message='" + message + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String message;

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public ImageProcessError build() {
            ImageProcessError imageProcessError = new ImageProcessError();
            imageProcessError.setMessage(message);
            return imageProcessError;
        }
    }
}