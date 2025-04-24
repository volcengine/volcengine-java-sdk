package com.volcengine.interceptor;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.volcengine.ApiException;

public class BuildRequestInterceptor implements RequestInterceptor {

    public final static String name = "volcengine-build-request-interceptor";

    @Override
    public String name() {
        return name;
    }

    @Override
    public InterceptorContext intercept(InterceptorContext context) throws ApiException {
        context.buildRequest();
        return context;
    }


}
