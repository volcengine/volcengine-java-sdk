package com.volcengine.interceptor;

import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Response;

import java.lang.reflect.Type;

public class ResponseInterceptorContext {

    private Type returnType;

    private Response originalResponse;

    private Object data;

    private int HttpCode;

    private Headers headers;

    private boolean common;

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public Response getOriginalResponse() {
        return originalResponse;
    }

    public void setOriginalResponse(Response originalResponse) {
        this.originalResponse = originalResponse;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getHttpCode() {
        return HttpCode;
    }

    public void setHttpCode(int httpCode) {
        HttpCode = httpCode;
    }

    public Headers getHeaders() {
        return headers;
    }

    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    public boolean isCommon() {
        return common;
    }

    public void setCommon(boolean common) {
        this.common = common;
    }

}
