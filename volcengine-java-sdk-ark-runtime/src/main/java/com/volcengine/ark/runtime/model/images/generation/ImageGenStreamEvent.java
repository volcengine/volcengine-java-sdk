package com.volcengine.ark.runtime.model.images.generation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

/**
 * Emitted when streaming image generation events.
 * Contains two situations:
 * - partial image
 * - completed
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageGenStreamEvent {
    /**
     * The type of image generating event.
     */
    private String type;

    /**
     * The model used to generate the images.
     */
    private String model;

    /**
     * The URL of the generated image.
     */
    private String url;

    /**
     * The Base 64 encoded string of the generated image.
     */
    @JsonProperty("b64_json")
    private String b64Json;

    /**
     * The size of the generated image.
     */
    private String size;

    /**
     * The error body, if applicable.
     */
    private Error error;

    /**
     * The usage information for the generation of images.
     */
    private Usage usage;

    /**
     * The index of the image.
     */
    @JsonProperty("image_index")
    private int imageIndex;

    /**
     * The Unix timestamp when the image was generated.
     */
    @JsonProperty("created_at")
    private long createdAt;

    // Getters and setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getB64Json() {
        return b64Json;
    }

    public void setB64Json(String b64Json) {
        this.b64Json = b64Json;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    public int getImageIndex() {
        return imageIndex;
    }

    public void setImageIndex(int imageIndex) {
        this.imageIndex = imageIndex;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "ImageGenGeneratingEvent{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", url=" + url +
                ", b64Json=" + b64Json +
                ", size=" + size +
                ", error=" + error +
                ", usage=" + usage +
                ", imageIndex=" + imageIndex +
                ", createdAt=" + createdAt +
                '}';
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Usage {
        /**
         * The number of images generated.
         */
        private int generatedImages;

        public int getGeneratedImages() {
            return generatedImages;
        }

        public void setGeneratedImages(int generatedImages) {
            this.generatedImages = generatedImages;
        }

        @Override
        public String toString() {
            return "Usage{" +
                    "generatedImages=" + generatedImages +
                    '}';
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Error {
        /**
         * The reason for failed image generation.
         */
        private String message;

        /**
         * The error code for failed image generation.
         */
        private String code;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        @Override
        public String toString() {
            return "Error{" +
                    "message='" + message + '\'' +
                    ", code='" + code + '\'' +
                    '}';
        }
    }
}

