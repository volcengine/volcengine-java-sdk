package com.volcengine.interceptor;

import com.volcengine.ApiException;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class InterceptorChain {
    // 请求拦截器列表
    private List<RequestInterceptor> requestInterceptors = new ArrayList<>();
    // 响应拦截器列表
    private List<ResponseInterceptor> responseInterceptors = new ArrayList<>();

    // 检查是否为请求拦截器
    private static void checkRequestInterceptor(RequestInterceptor interceptor) {
        if (interceptor == null) {
            throw new IllegalArgumentException("interceptor is null");
        }
    }

    // 检查是否为响应拦截器
    private static void checkResponseInterceptor(ResponseInterceptor interceptor) {
        if (interceptor == null) {
            throw new IllegalArgumentException("interceptor is null");
        }
    }

    // 插入拦截器到链中
    private static <T> List<T> insertInterceptor(List<T> chain, T interceptor, String afterName) {
        if (StringUtils.isEmpty(afterName)) {
            chain.add(0, interceptor);
            return chain;
        }
        for (int i = 0; i < chain.size(); i++) {
            T current = chain.get(i);
            if (current instanceof RequestInterceptor) {
                RequestInterceptor reqInterceptor = (RequestInterceptor) current;
                if (reqInterceptor.name().equals(afterName)) {
                    chain.add(i + 1, interceptor);
                    return chain;
                }
            } else if (current instanceof ResponseInterceptor) {
                ResponseInterceptor respInterceptor = (ResponseInterceptor) current;
                if (respInterceptor.name().equals(afterName)) {
                    chain.add(i + 1, interceptor);
                    return chain;
                }
            }
        }
        throw new IllegalArgumentException("interceptor insert after name not found");
    }

    // 追加请求拦截器
    public InterceptorChain appendRequestInterceptor(RequestInterceptor interceptor) {
        checkRequestInterceptor(interceptor);
        requestInterceptors.add(interceptor);
        return this;
    }

    // 插入请求拦截器
    public InterceptorChain insertRequestInterceptor(RequestInterceptor interceptor, String afterName) {
        checkRequestInterceptor(interceptor);
        insertInterceptor(this.requestInterceptors, interceptor, afterName);
        return this;
    }

    // 追加响应拦截器
    public InterceptorChain appendResponseInterceptor(ResponseInterceptor interceptor) {
        checkResponseInterceptor(interceptor);
        responseInterceptors.add(interceptor);
        return this;
    }

    // 插入响应拦截器
    public InterceptorChain insertResponseInterceptor(ResponseInterceptor interceptor, String afterName) {
        checkResponseInterceptor(interceptor);
        insertInterceptor(responseInterceptors, interceptor, afterName);
        return this;
    }

    // 执行请求拦截器链
    public InterceptorContext executeRequest(InterceptorContext context) throws ApiException {
        for (RequestInterceptor interceptor : requestInterceptors) {
            context = interceptor.intercept(context);
        }
        return context;
    }

    // 执行响应拦截器链
    public InterceptorContext executeResponse(InterceptorContext context) throws ApiException {
        for (ResponseInterceptor interceptor : responseInterceptors) {
            context = interceptor.intercept(context);
        }
        return context;
    }


}





