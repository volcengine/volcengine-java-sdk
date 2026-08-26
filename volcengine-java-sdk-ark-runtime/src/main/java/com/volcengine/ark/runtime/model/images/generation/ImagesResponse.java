package com.volcengine.ark.runtime.model.images.generation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ImagesResponse {

    @JsonProperty("model")
    private String model;

    @JsonProperty("created")
    private Integer created;

    @JsonProperty("data")
    private List<Image> data;

    @JsonProperty("usage")
    private Usage usage;

    @JsonProperty("error")
    private Error error;

    @JsonProperty("tools")
    private List<GenerateImagesRequest.ContentGenerationTool> tools;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public List<Image> getData() {
        return data;
    }

    public void setData(List<Image> data) {
        this.data = data;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public List<GenerateImagesRequest.ContentGenerationTool> getTools() {
        return this.tools;
    }

    public void setTools(List<GenerateImagesRequest.ContentGenerationTool> tools) {
        this.tools = tools;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Image {

        @JsonProperty("url")
        private String url;

        @JsonProperty("b64_json")
        private String b64Json;

        @JsonProperty("size")
        private String size;

        @JsonProperty("output_format")
        private String outputFormat;

        @JsonProperty("z_index")
        private Integer zIndex;

        @JsonProperty("bounding_box")
        private BoundingBox boundingBox;

        @JsonProperty("name")
        private String name;

        @JsonProperty("description")
        private String description;

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

        public String getOutputFormat() {
            return outputFormat;
        }

        public void setOutputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
        }

        public Integer getZIndex() {
            return zIndex;
        }

        public void setZIndex(Integer zIndex) {
            this.zIndex = zIndex;
        }

        public BoundingBox getBoundingBox() {
            return boundingBox;
        }

        public void setBoundingBox(BoundingBox boundingBox) {
            this.boundingBox = boundingBox;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "Image{" +
                    "url=" + url +
                    "b64Json=" + b64Json +
                    "size=" + size +
                    "outputFormat=" + outputFormat +
                    "zIndex=" + zIndex +
                    "boundingBox=" + boundingBox +
                    "name=" + name +
                    "description=" + description +
                    '}';
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BoundingBox {

        @JsonProperty("absolute")
        private List<Integer> absolute;

        @JsonProperty("normalized")
        private List<Integer> normalized;

        public List<Integer> getAbsolute() {
            return absolute;
        }

        public void setAbsolute(List<Integer> absolute) {
            this.absolute = absolute;
        }

        public List<Integer> getNormalized() {
            return normalized;
        }

        public void setNormalized(List<Integer> normalized) {
            this.normalized = normalized;
        }

        @Override
        public String toString() {
            return "BoundingBox{" +
                    "absolute=" + absolute +
                    ", normalized=" + normalized +
                    '}';
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Usage {

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class ToolUsage {

            @JsonProperty("web_search")
            private Integer webSearch;

            public Integer getWebSearch() {
                return webSearch;
            }

            public void setWebSearch(Integer webSearch) {
                this.webSearch = webSearch;
            }

            @Override
            public String toString() {
                return "ToolUsage{" +
                        "webSearch=" + webSearch +
                        '}';
            }
        }

        @JsonProperty("generated_images")
        private Integer generatedImages;

        @JsonProperty("input_images")
        private Integer inputImages;

        public Integer getInputImages() {
            return inputImages;
        }

        public void setInputImages(Integer inputImages) {
            this.inputImages = inputImages;
        }

        public Integer getGeneratedImages() {
            return generatedImages;
        }

        public void setGeneratedImages(Integer generatedImages) {
            this.generatedImages = generatedImages;
        }

        @JsonProperty("output_tokens")
        private Integer outputTokens;

        public Integer getOutputTokens() {
            return outputTokens;
        }

        public void setOutputTokens(Integer outputTokens) {
            this.outputTokens = outputTokens;
        }

        @JsonProperty("total_tokens")
        private Integer totalTokens;

        public Integer getTotalTokens() {
            return totalTokens;
        }

        public void setTotalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
        }

        @JsonProperty("tool_usage")
        private ToolUsage toolUsage;

        public ToolUsage getToolUsage() {
            return toolUsage;
        }

        public void setToolUsage(ToolUsage toolUsage) {
            this.toolUsage = toolUsage;
        }

        @Override
        public String toString() {
            return "Usage{" +
                    "inputImages=" + inputImages +
                    "generatedImages=" + generatedImages +
                    "outputTokens=" + outputTokens +
                    "totalTokens=" + totalTokens +
                    "toolUsage=" + toolUsage +
                    '}';
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Error {

        @JsonProperty("code")
        private String code;

        @JsonProperty("message")
        private String message;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return "Error{" +
                    "code=" + code +
                    "message=" + message +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ImagesResponse{" +
                "model='" + model + '\'' +
                "created=" + created +
                "data=" + data +
                "usage=" + usage +
                "error=" + error +
                "tools=" + tools +
                '}';
    }

    public static class Builder {
        private String model;
        private Integer created;
        private List<Image> data;
        private Usage usage;
        private Error error;
        private List<GenerateImagesRequest.ContentGenerationTool> tools;

        private Builder() {
        }

        public ImagesResponse.Builder model(String model) {
            this.model = model;
            return this;
        }

        public ImagesResponse.Builder created(Integer created) {
            this.created = created;
            return this;
        }

        public ImagesResponse.Builder data(List<Image> data) {
            this.data = data;
            return this;
        }

        public ImagesResponse.Builder usage(Usage usage) {
            this.usage = usage;
            return this;
        }

        public ImagesResponse.Builder error(Error error) {
            this.error = error;
            return this;
        }

        public ImagesResponse.Builder tools(List<GenerateImagesRequest.ContentGenerationTool> tools) {
            this.tools = tools;
            return this;
        }

        public ImagesResponse build() {
            ImagesResponse imagesResponse = new ImagesResponse();
            imagesResponse.setModel(model);
            imagesResponse.setCreated(created);
            imagesResponse.setData(data);
            imagesResponse.setUsage(usage);
            imagesResponse.setError(error);
            imagesResponse.setTools(tools);
            return imagesResponse;
        }
    }
}
