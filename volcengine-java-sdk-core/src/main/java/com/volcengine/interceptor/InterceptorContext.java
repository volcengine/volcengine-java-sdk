package com.volcengine.interceptor;

import com.google.gson.annotations.SerializedName;
import com.squareup.okhttp.*;
import com.squareup.okhttp.internal.http.HttpMethod;
import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.Pair;
import com.volcengine.ProgressRequestBody;
import com.volcengine.sign.ServiceInfo;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import okio.Buffer;


import java.util.List;
import java.util.Map;

public class InterceptorContext extends com.squareup.okhttp.Call {

    private ApiClient apiClient;

    public InitInterceptorContext initInterceptorContext;

    public RequestInterceptorContext requestContext;

    public ResponseInterceptorContext responseContext;

    public InterceptorContext(OkHttpClient client, Request originalRequest) {
        super(client, originalRequest);

        initInterceptorContext = new InitInterceptorContext();
        requestContext = new RequestInterceptorContext();
        responseContext = new ResponseInterceptorContext();
    }


    public InitInterceptorContext getInitInterceptorContext() {
        return initInterceptorContext;
    }

    public void setInitInterceptorContext(InitInterceptorContext initInterceptorContext) {
        this.initInterceptorContext = initInterceptorContext;
    }

    public ResponseInterceptorContext getResponseContext() {
        return responseContext;
    }

    public  void setResponseContext(ResponseInterceptorContext responseContext) {
        this.responseContext = responseContext;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public RequestInterceptorContext getRequestContext() {
        return requestContext;
    }

    public void setRequestContext(RequestInterceptorContext requestContext) {
        this.requestContext = requestContext;
    }


    public void buildRequest() throws ApiException {
        String path = this.getInitInterceptorContext().getPath();
        String method = this.getInitInterceptorContext().getMethod();
        List<Pair> queryParams = copy(this.getInitInterceptorContext().getQueryParams());
        List<Pair> collectionQueryParams = copy(this.getInitInterceptorContext().getCollectionQueryParams());
        Object body = this.getInitInterceptorContext().getBody();
        Map<String, String> headerParams = copy(this.getInitInterceptorContext().getHeaderParams());
        Map<String, Object> formParams = copy(this.getInitInterceptorContext().getFormParams());
        String[] authNames = this.getInitInterceptorContext().getAuthNames();
        boolean isCommon = this.getInitInterceptorContext().isCommon();

        ProgressRequestBody.ProgressRequestListener progressRequestListener = this.getInitInterceptorContext().getProgressRequestListener();

        this.apiClient.getDefaultContentType(headerParams);

        ServiceInfo serviceInfo = this.apiClient.addPairAndGetServiceInfo(path, queryParams, headerParams);
        //rebuild method
        method = serviceInfo.getMethod().toUpperCase();
        String truePath = this.apiClient.getTruePath(path, headerParams);
        String contentType = headerParams.get("Content-Type");
        StringBuilder bodyBuilder = new StringBuilder();
        FormEncodingBuilder formBuilder = new FormEncodingBuilder();

        try {
            this.apiClient.buildSimpleRequest(body, queryParams, headerParams, bodyBuilder, formBuilder, "", isCommon);
        } catch (Exception e) {
            throw new ApiException(e);
        }

        RequestBody reqBody;
        if (!HttpMethod.permitsRequestBody(method)) {
            reqBody = null;
        } else if ("application/x-www-form-urlencoded".equals(contentType)) {
            reqBody = formBuilder.build();

            // fix action & version
            queryParams.clear();
            this.apiClient.updateQueryParams(queryParams, path.split("/"));
        } else if ("multipart/form-data".equals(contentType)) {
            reqBody = this.apiClient.buildRequestBodyMultipart(formParams);
            // fix action & version
            queryParams.clear();
            this.apiClient.updateQueryParams(queryParams, path.split("/"));
        } else if (body == null) {
            if ("DELETE".equals(method)) {
                // allow calling DELETE without sending a request body
                reqBody = null;
            } else {
                // use an empty request body (for POST, PUT and PATCH)
                reqBody = RequestBody.create(MediaType.parse(contentType), "");
            }
            // fix action & version
            queryParams.clear();
            this.apiClient.updateQueryParams(queryParams, path.split("/"));
        } else {
            reqBody = this.apiClient.serialize(body, contentType);
            // fix action & version
            queryParams.clear();
            this.apiClient.updateQueryParams(queryParams, path.split("/"));
        }
        this.apiClient.processDefaultHeader(headerParams);
        this.getRequestContext().setQueryParams(queryParams);
        this.getRequestContext().setRequestBody(reqBody);
        this.getRequestContext().setProgressRequestListener(progressRequestListener);
        this.getRequestContext().setAuthNames(authNames);
        this.getRequestContext().setHeaderParams(headerParams);
        this.getRequestContext().setCommon(isCommon);
        this.getRequestContext().setPath(truePath);
        this.getRequestContext().setMethod(method);
        this.getRequestContext().setServiceInfo(serviceInfo);
    }

    public List<Pair> copy(List<Pair> list) {
        List<Pair> resultList = new ArrayList<>();
        if (list != null) {
            for (Pair p : list) {
                Pair cur = new Pair(p.getName(), p.getValue());
                resultList.add(cur);
            }
        }
        return resultList;
    }

    public <T> Map<String, T> copy(Map<String, T> map) {
        Map<String, T> resultMap = new HashMap<>();
        if (map != null) {
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                T value = entry.getValue();
                resultMap.put(key, value);
            }
        }
        return resultMap;
    }

}

