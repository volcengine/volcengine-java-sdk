package com.volcengine.ark.runtime.model.responses.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Error {
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
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String code;
        private String message;

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Error build() {
            Error error = new Error();
            error.setCode(code);
            error.setMessage(message);
            return error;
        }
    }
}