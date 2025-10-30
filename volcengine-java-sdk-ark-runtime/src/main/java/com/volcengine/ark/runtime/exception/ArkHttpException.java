package com.volcengine.ark.runtime.exception;

import com.google.gson.Gson;

public class ArkHttpException extends RuntimeException {
    public static Integer INTERNAL_SERVICE_CODE = 500;

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
        return super.getMessage();
    }

    @Override
    public String toString() {
        return "ArkHttpException{" +
                "statusCode=" + statusCode +
                ", message='" + super.getMessage() + '\'' +
                ", code='" + code + '\'' +
                ", param='" + param + '\'' +
                ", type='" + type + '\'' +
                ", requestId='" + requestId + '\'' +
                '}';
    }
}
