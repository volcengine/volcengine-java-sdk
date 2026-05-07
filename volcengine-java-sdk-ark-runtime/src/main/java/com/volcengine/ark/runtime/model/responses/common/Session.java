package com.volcengine.ark.runtime.model.responses.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Session {

    @JsonProperty("id")
    private String id;

    public Session() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Session{" +
                "id='" + id + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String id;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Session build() {
            Session session = new Session();
            session.setId(id);
            return session;
        }
    }
}
