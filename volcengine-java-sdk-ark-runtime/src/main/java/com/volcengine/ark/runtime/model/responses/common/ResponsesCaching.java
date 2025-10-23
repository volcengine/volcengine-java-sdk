package com.volcengine.ark.runtime.model.responses.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponsesCaching {
    @JsonProperty("type")
    private String type;


    @JsonProperty("prefix")
    private Boolean prefix;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getPrefix() {
        return prefix;
    }

    public void setPrefix(Boolean prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ResponsesCaching{");
        sb.append("type='").append(type).append('\'');
        if (prefix != null) {
            sb.append(", prefix=").append(prefix);
        }
        sb.append('}');
        return sb.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String type;
        private Boolean prefix;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder prefix(Boolean prefix) {
            this.prefix = prefix;
            return this;
        }

        public ResponsesCaching build() {
            ResponsesCaching responsesCaching = new ResponsesCaching();
            responsesCaching.setType(type);
            responsesCaching.setPrefix(prefix);
            return responsesCaching;
        }
    }
}