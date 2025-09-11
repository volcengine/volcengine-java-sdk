package com.volcengine.ark.runtime.model.responses.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponsesCaching {
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
        return "ResponsesCaching{" +
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

        public ResponsesCaching build() {
            ResponsesCaching responsesCaching = new ResponsesCaching();
            responsesCaching.setType(type);
            return responsesCaching;
        }
    }
}