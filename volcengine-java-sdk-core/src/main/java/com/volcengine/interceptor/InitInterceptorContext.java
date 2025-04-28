package com.volcengine.interceptor;

import com.squareup.okhttp.Call;
import com.volcengine.ApiClient;
import com.volcengine.ProgressRequestBody;
import com.volcengine.Pair;
import com.volcengine.endpoint.EndpointResolver;
import com.volcengine.sign.ServiceInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InitInterceptorContext {
    private String path;
    private String method;
    private List<Pair> queryParams;
    private List<Pair> collectionQueryParams;
    private Object body;
    private Map<String, String> headerParams;
    private Map<String, Object> formParams;
    private String[] authNames;
    private ProgressRequestBody.ProgressRequestListener progressRequestListener;
    private boolean isCommon;

    public InitInterceptorContext() {
    }

    private InitInterceptorContext(Builder builder) {
        this.path = builder.path;
        this.method = builder.method;
        this.queryParams = builder.queryParams;
        this.collectionQueryParams = builder.collectionQueryParams;
        this.body = builder.body;
        this.headerParams = builder.headerParams;
        this.formParams = builder.formParams;
        this.authNames = builder.authNames;
        this.progressRequestListener = builder.progressRequestListener;
        this.isCommon = builder.isCommon;
    }

    public static class Builder {
        private String path;
        private String method;
        private List<Pair> queryParams = new ArrayList<>();
        private List<Pair> collectionQueryParams = new ArrayList<>();
        private Object body;
        private Map<String, String> headerParams = new HashMap<>();
        private Map<String, Object> formParams = new HashMap<>();
        private String[] authNames;
        private ProgressRequestBody.ProgressRequestListener progressRequestListener;
        private boolean isCommon;


        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public Builder method(String method) {
            this.method = method;
            return this;
        }

        public Builder queryParams(List<Pair> queryParams) {
            this.queryParams = queryParams;
            return this;
        }

        public Builder collectionQueryParams(List<Pair> collectionQueryParams) {
            this.collectionQueryParams = collectionQueryParams;
            return this;
        }

        public Builder body(Object body) {
            this.body = body;
            return this;
        }

        public Builder headerParams(Map<String, String> headerParams) {
            this.headerParams = headerParams;
            return this;
        }

        public Builder formParams(Map<String, Object> formParams) {
            this.formParams = formParams;
            return this;
        }

        public Builder authNames(String[] authNames) {
            this.authNames = authNames;
            return this;
        }

        public Builder progressRequestListener(ProgressRequestBody.ProgressRequestListener progressRequestListener) {
            this.progressRequestListener = progressRequestListener;
            return this;
        }

        public Builder isCommon(boolean isCommon) {
            this.isCommon = isCommon;
            return this;
        }

        public InitInterceptorContext build() {
            return new InitInterceptorContext(this);
        }
    }

    // Getter 方法
    public String getPath() {
        return path;
    }

    public String getMethod() {
        return method;
    }

    public List<Pair> getQueryParams() {
        return queryParams;
    }

    public List<Pair> getCollectionQueryParams() {
        return collectionQueryParams;
    }

    public Object getBody() {
        return body;
    }

    public Map<String, String> getHeaderParams() {
        return headerParams;
    }

    public Map<String, Object> getFormParams() {
        return formParams;
    }

    public String[] getAuthNames() {
        return authNames;
    }

    public ProgressRequestBody.ProgressRequestListener getProgressRequestListener() {
        return progressRequestListener;
    }

    public boolean isCommon() {
        return isCommon;
    }


    public void setPath(String path) {
        this.path = path;
    }


    public void setMethod(String method) {
        this.method = method;
    }

    public void setQueryParams(List<Pair> queryParams) {
        this.queryParams = queryParams;
    }

    public void setCollectionQueryParams(List<Pair> collectionQueryParams) {
        this.collectionQueryParams = collectionQueryParams;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public void setHeaderParams(Map<String, String> headerParams) {
        this.headerParams = headerParams;
    }

    public void setFormParams(Map<String, Object> formParams) {
        this.formParams = formParams;
    }

    public void setAuthNames(String[] authNames) {
        this.authNames = authNames;
    }

    public void setProgressRequestListener(ProgressRequestBody.ProgressRequestListener progressRequestListener) {
        this.progressRequestListener = progressRequestListener;
    }

    public void setCommon(boolean common) {
        isCommon = common;
    }

}
