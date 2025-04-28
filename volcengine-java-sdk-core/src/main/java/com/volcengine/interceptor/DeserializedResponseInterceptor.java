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

        Object data = context.getApiClient().handleResponse(response, returnType, common);
        context.getResponseContext().setData(data);
        return null;
    }
}
