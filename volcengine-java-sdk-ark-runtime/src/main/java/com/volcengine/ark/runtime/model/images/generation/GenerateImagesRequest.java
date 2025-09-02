package com.volcengine.ark.runtime.model.images.generation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenerateImagesRequest {

    @JsonProperty("model")
    private String model;

    @JsonProperty("prompt")
    private String prompt;

    @JsonProperty("image")
    @JsonDeserialize(using = ImageDeserializer.class)
    private List<String> image;

    @JsonProperty("response_format")
    private String responseFormat;

    @JsonProperty("seed")
    private Integer seed;

    @JsonProperty("guidance_scale")
    private Double guidanceScale;

    @JsonProperty("size")
    private String size;

    @JsonProperty("watermark")
    private Boolean watermark;

    @JsonProperty("optimize_prompt")
    private Boolean optimizePrompt;

    @JsonProperty("sequential_image_generation")
    private String sequentialImageGeneration;

    @JsonProperty("sequential_image_generation_options")
    private SequentialImageGenerationOptions sequentialImageGenerationOptions;

    @JsonProperty("stream")
    private Boolean stream;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SequentialImageGenerationOptions {
        private Integer maxImages;

        public Integer getMaxImages() {
            return maxImages;
        }

        public void setMaxImages(Integer maxImages) {
            this.maxImages = maxImages;
        }

        @Override
        public String toString() {
            return "SequentialImageGenerationOptions{" +
                    "maxImages=" + maxImages +
                    '}';
        }
    }

    public GenerateImagesRequest() {
    }

    public GenerateImagesRequest(String model, String prompt, List<String> image, String responseFormat, Integer seed, Double guidanceScale, String size, Boolean watermark, String sequentialImageGeneration, SequentialImageGenerationOptions sequentialImageGenerationOptions, Boolean optimizePrompt, Boolean stream) {
        this.model = model;
        this.prompt = prompt;
        this.image = image;
        this.responseFormat = responseFormat;
        this.seed = seed;
        this.guidanceScale = guidanceScale;
        this.size = size;
        this.watermark = watermark;
        this.optimizePrompt = optimizePrompt;
        this.sequentialImageGeneration = sequentialImageGeneration;
        this.sequentialImageGenerationOptions = sequentialImageGenerationOptions;
        this.stream = stream;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrompt() {
        return this.prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public List<String> getImage() {
        return this.image;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : Collections.singletonList(image);
    }

    public String getResponseFormat() {
        return this.responseFormat;
    }

    public void setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
    }

    public Integer getSeed() {
        return this.seed;
    }

    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    public Double getGuidanceScale() {
        return this.guidanceScale;
    }

    public void setGuidanceScale(Double guidanceScale) {
        this.guidanceScale = guidanceScale;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Boolean getWatermark() {
        return this.watermark;
    }

    public void setWatermark(Boolean watermark) {
        this.watermark = watermark;
    }

    public Boolean getOptimizePrompt() {
        return this.optimizePrompt;
    }

    public void setOptimizePrompt(Boolean optimizePrompt) {
        this.optimizePrompt = optimizePrompt;
    }

    public Boolean getStream() {
        return this.stream;
    }

    public void setStream(Boolean stream) {
        this.stream = stream;
    }

    public SequentialImageGenerationOptions getSequentialImageGenerationOptions() {
        return this.sequentialImageGenerationOptions;
    }

    public void setSequentialImageGenerationOptions(SequentialImageGenerationOptions sequentialImageGenerationOptions) {
        this.sequentialImageGenerationOptions = sequentialImageGenerationOptions;
    }

    public String getSequentialImageGeneration() {
        return sequentialImageGeneration;
    }

    public void setSequentialImageGeneration(String sequentialImageGeneration) {
        this.sequentialImageGeneration = sequentialImageGeneration;
    }

    @Override
    public String toString() {
        return "GenerateImagesRequest{" +
                "model='" + model + '\'' +
                ", prompt=" + prompt +
                ", image=" + image +
                ", responseFormat=" + responseFormat +
                ", seed=" + seed +
                ", guidanceScale=" + guidanceScale +
                ", size=" + size +
                ", watermark=" + watermark +
                ", optimizePrompt=" + optimizePrompt +
                ", stream=" + stream +
                ", sequentialImageGeneration=" + sequentialImageGeneration +
                ", sequentialImageGenerationOptions=" + sequentialImageGenerationOptions +
                '}';
    }

    public static GenerateImagesRequest.Builder builder() {
        return new GenerateImagesRequest.Builder();
    }

    public static class Builder {
        private String model;
        private String prompt;
        @JsonDeserialize(using = ImageDeserializer.class)
        private List<String> image;
        private String responseFormat;
        private Integer seed;
        private Double guidanceScale;
        private String size;
        private Boolean watermark;
        private Boolean optimizePrompt;
        private String sequentialImageGeneration;

        private SequentialImageGenerationOptions sequentialImageGenerationOptions;

        private Boolean stream;

        private Builder() {
        }

        public GenerateImagesRequest.Builder model(String model) {
            this.model = model;
            return this;
        }

        public GenerateImagesRequest.Builder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }

        public GenerateImagesRequest.Builder image(List<String> image) {
            this.image = image;
            return this;
        }

        public GenerateImagesRequest.Builder image(String image) {
            this.image = image == null ? null : Collections.singletonList(image);
            return this;
        }

        public GenerateImagesRequest.Builder responseFormat(String responseFormat) {
            this.responseFormat = responseFormat;
            return this;
        }

        public GenerateImagesRequest.Builder seed(Integer seed) {
            this.seed = seed;
            return this;
        }

        public GenerateImagesRequest.Builder guidanceScale(Double guidanceScale) {
            this.guidanceScale = guidanceScale;
            return this;
        }

        public GenerateImagesRequest.Builder size(String size) {
            this.size = size;
            return this;
        }

        public GenerateImagesRequest.Builder watermark(Boolean watermark) {
            this.watermark = watermark;
            return this;
        }

        public GenerateImagesRequest.Builder optimizePrompt(Boolean optimizePrompt) {
            this.optimizePrompt = optimizePrompt;
            return this;
        }

        public GenerateImagesRequest.Builder sequentialImageGeneration(String sequentialImageGeneration) {
            this.sequentialImageGeneration = sequentialImageGeneration;
            return this;
        }

        public GenerateImagesRequest.Builder sequentialImageGenerationOptions(SequentialImageGenerationOptions sequentialImageGenerationOptions) {
            this.sequentialImageGenerationOptions = sequentialImageGenerationOptions;
            return this;
        }

        public GenerateImagesRequest.Builder stream(Boolean stream) {
            this.stream = stream;
            return this;
        }

        public GenerateImagesRequest build() {
            GenerateImagesRequest generateImagesRequest = new GenerateImagesRequest();
            generateImagesRequest.setModel(model);
            generateImagesRequest.setPrompt(prompt);
            generateImagesRequest.setImage(image);
            generateImagesRequest.setResponseFormat(responseFormat);
            generateImagesRequest.setSeed(seed);
            generateImagesRequest.setGuidanceScale(guidanceScale);
            generateImagesRequest.setSize(size);
            generateImagesRequest.setWatermark(watermark);
            generateImagesRequest.setOptimizePrompt(optimizePrompt);
            generateImagesRequest.setSequentialImageGeneration(sequentialImageGeneration);
            generateImagesRequest.setSequentialImageGenerationOptions(sequentialImageGenerationOptions);
            generateImagesRequest.setStream(stream);
            return generateImagesRequest;
        }
    }
}

class ImageDeserializer extends JsonDeserializer<List<String>> {
    @Override
    public List<String> deserialize(JsonParser p, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {

        JsonNode node = p.getCodec().readTree(p);

        // 如果是单个 string
        if (node.isTextual()) {
            return Collections.singletonList(node.asText());
        }

        // 如果是数组
        if (node.isArray()) {
            List<String> list = new ArrayList<>();
            for (JsonNode element : node) {
                list.add(element.asText());
            }
            return list;
        }

        // 其他情况（null、对象等）返回空
        return Collections.emptyList();
    }
}
