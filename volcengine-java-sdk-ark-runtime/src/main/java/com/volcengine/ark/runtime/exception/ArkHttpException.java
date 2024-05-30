package com.volcengine.ark.runtime.exception;

import com.google.gson.Gson;

public class ArkHttpException extends RuntimeException {

    public final int statusCode;

    public final String code;

    public final String param;

    public final String type;

    public final String requestId;

    public ArkHttpException(ArkAPIError error, Exception parent, int statusCode, String requestId) {
        super(error.error.message, parent);
        this.statusCode = statusCode;
        this.code = error.error.code;
        this.param = error.error.param;
        this.type = error.error.type;
        this.requestId = requestId;
    }

    public String getMessage() {
        return new Gson().toJson(this);
    }

    @Override
    public String toString() {
        return "ArkHttpException{" +
                "statusCode=" + statusCode +
                ", code='" + code + '\'' +
                ", param='" + param + '\'' +
                ", type='" + type + '\'' +
                ", requestId='" + requestId + '\'' +
                '}';
    }
}
