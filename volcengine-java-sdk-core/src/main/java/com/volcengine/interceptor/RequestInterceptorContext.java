package com.volcengine.interceptor;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.volcengine.Pair;
import com.volcengine.ProgressRequestBody;
import com.volcengine.sign.ServiceInfo;

import java.util.List;
import java.util.Map;

public class RequestInterceptorContext {
    private String schema;
    private String host;
    private String path;
    private String method;
    private List<Pair> queryParams;
    private Map<String, String> headerParams;
    private RequestBody requestBody;
    private String[] authNames;
    private ProgressRequestBody.ProgressRequestListener progressRequestListener;
    private boolean isCommon;

    private ServiceInfo serviceInfo;
    private Request request;

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<Pair> getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(List<Pair> queryParams) {
        this.queryParams = queryParams;
    }

    public Map<String, String> getHeaderParams() {
        return headerParams;
    }

    public void setHeaderParams(Map<String, String> headerParams) {
        this.headerParams = headerParams;
    }

    public RequestBody getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(RequestBody requestBody) {
        this.requestBody = requestBody;
    }

    public String[] getAuthNames() {
        return authNames;
    }

    public void setAuthNames(String[] authNames) {
        this.authNames = authNames;
    }

    public ProgressRequestBody.ProgressRequestListener getProgressRequestListener() {
        return progressRequestListener;
    }

    public void setProgressRequestListener(ProgressRequestBody.ProgressRequestListener progressRequestListener) {
        this.progressRequestListener = progressRequestListener;
    }

    public boolean isCommon() {
        return isCommon;
    }

    public void setCommon(boolean common) {
        isCommon = common;
    }

    public ServiceInfo getServiceInfo() {
        return serviceInfo;
    }

    public void setServiceInfo(ServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
