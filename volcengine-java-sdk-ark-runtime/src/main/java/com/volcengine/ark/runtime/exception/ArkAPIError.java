package com.volcengine.ark.runtime.exception;


public class ArkAPIError {

    ArkErrorDetails error;

    public ArkAPIError(ArkErrorDetails error) {
        this.error = error;
    }

    public ArkAPIError() {}

    public ArkErrorDetails getError() {
        return error;
    }

    public void setError(ArkErrorDetails error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "ArkAPIError{" +
                "error=" + error +
                '}';
    }

    public static class ArkErrorDetails {

        String message;

        String type;

        String param;

        String code;

        public ArkErrorDetails(String message, String type, String param, String code) {
            this.message = message;
            this.type = type;
            this.param = param;
            this.code = code;
        }

        public ArkErrorDetails(){}

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getParam() {
            return param;
        }

        public void setParam(String param) {
            this.param = param;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        @Override
        public String toString() {
            return "ArkErrorDetails{" +
                    "message='" + message + '\'' +
                    ", type='" + type + '\'' +
                    ", param='" + param + '\'' +
                    ", code='" + code + '\'' +
                    '}';
        }
    }
}
