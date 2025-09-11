package com.volcengine.ark.runtime.model.responses.tool.websearch;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Action {
    @JsonProperty("query")
    private String query;

    @JsonProperty("type")
    private String type;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Action{" +
                "query='" + query + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String query;
        private String type;

        public Builder query(String query) {
            this.query = query;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Action build() {
            Action action = new Action();
            action.setQuery(query);
            action.setType(type);
            return action;
        }
    }
}