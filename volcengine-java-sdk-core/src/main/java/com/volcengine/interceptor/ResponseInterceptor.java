package com.volcengine.interceptor;

import com.volcengine.ApiException;

public interface ResponseInterceptor {
    String name();
    InterceptorContext intercept(InterceptorContext context) throws ApiException;
}