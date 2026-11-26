package com.volcengine.interceptor;

import com.squareup.okhttp.Response;
import com.volcengine.ApiException;

import java.lang.reflect.Type;

public class DeserializedResponseInterceptor implements ResponseInterceptor {

    public final static String name = "volcengine-deserialized-response-interceptor";

    @Override
    public String name() {
        return name;
    }

    @Override
    public InterceptorContext intercept(InterceptorContext context) throws ApiException {
        Response response = context.getResponseContext().getOriginalResponse();
        Type returnType = context.getResponseContext().getReturnType();
        boolean common = context.getResponseContext().isCommon();
        com.volcengine.ResponseDetails[] snapshot = new com.volcengine.ResponseDetails[1];
        context.getResponseContext().setResponseDetails(null);
        Object data = context.getApiClient().handleResponseWithDetails(response, returnType, snapshot, common);
        context.getResponseContext().setResponseDetails(snapshot[0]);
        context.getResponseContext().setData(data);
        return null;
    }
}
