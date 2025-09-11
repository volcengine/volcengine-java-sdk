package com.volcengine.ark.runtime.model.responses.tool;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FunctionToolChoice {
    @JsonProperty("type")
    private String type;

    @JsonProperty("name")
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FunctionToolChoice{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String type;
        private String name;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public FunctionToolChoice build() {
            FunctionToolChoice functionToolChoice = new FunctionToolChoice();
            functionToolChoice.setType(type);
            functionToolChoice.setName(name);
            return functionToolChoice;
        }
    }
}