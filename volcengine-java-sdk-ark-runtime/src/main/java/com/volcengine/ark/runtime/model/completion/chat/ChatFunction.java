package com.volcengine.ark.runtime.model.completion.chat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.volcengine.ark.runtime.utils.JacksonUtil;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChatFunction {

    /**
     * The name of the function being called.
     */
    String name;

    /**
     * A description of what the function does, used by the model to choose when and how to call the function.
     */
    String description;

    /**
     * The parameters the functions accepts.
     */
    @JsonProperty("parameters")
    JsonNode parameters;

    public <T> T getParameters(Class<T> cls) {
        return JacksonUtil.jsonNodeToCls(this.parameters, cls);
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

    public JsonNode getParameters() {
        return parameters;
    }

    public void setParameters(JsonNode parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "ChatFunction{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", parameters=" + parameters +
                '}';
    }

    public static class Builder {
        private String name;
        private String description;
        private JsonNode parameters;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder parameters(Object parameters) {
            this.parameters = JacksonUtil.clsToJsonNode(parameters);
            return this;
        }

        public ChatFunction build() {
            ChatFunction chatFunction = new ChatFunction();
            chatFunction.setName(name);
            chatFunction.setDescription(description);
            chatFunction.setParameters(parameters);
            return chatFunction;
        }
    }

}