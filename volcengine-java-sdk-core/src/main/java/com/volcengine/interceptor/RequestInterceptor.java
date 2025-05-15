package com.volcengine.interceptor;

import com.volcengine.ApiException;

public interface RequestInterceptor {
    String name();
    InterceptorContext intercept(InterceptorContext context) throws ApiException;
}