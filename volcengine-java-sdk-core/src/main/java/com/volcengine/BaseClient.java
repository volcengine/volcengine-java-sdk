package com.volcengine;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.volcengine.interceptor.InitInterceptorContext;
import com.volcengine.interceptor.InterceptorContext;

import java.util.List;
import java.util.Map;

public abstract class BaseClient {
    public Call buildCall(String path, String method, List<Pair> queryParams, List<Pair> collectionQueryParams, Object body, Map<String, String> headerParams, Map<String, Object> formParams, String[] authNames, ProgressRequestBody.ProgressRequestListener progressRequestListener, boolean... isCommon) throws ApiException {
        InterceptorContext interceptorContext = new InterceptorContext(this.getOkHttpClient(), null);
        InitInterceptorContext requestInterceptorContext = new InitInterceptorContext.Builder()
                .path(path)
                .method(method)
                .queryParams(queryParams)
                .collectionQueryParams(collectionQueryParams)
                .body(body)
                .headerParams(headerParams)
                .formParams(formParams)
                .authNames(authNames)
                .progressRequestListener(progressRequestListener)
                .isCommon(false)
                .build();
        interceptorContext.setInitInterceptorContext(requestInterceptorContext);
        interceptorContext.setApiClient(this);
        return interceptorContext;
    }

    public abstract OkHttpClient getOkHttpClient();


}
