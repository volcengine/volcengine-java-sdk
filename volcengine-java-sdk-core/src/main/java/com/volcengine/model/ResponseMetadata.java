package com.volcengine.model;

import com.google.gson.annotations.SerializedName;

/**
 * @Author: xuyaming@bytedance.com
 * @Date: 2022/3/18 15:20
 */
public class ResponseMetadata {
    @SerializedName("RequestId")
    private String requestId;
    @SerializedName("Action")
    private String action;
    @SerializedName("Version")
    private String version;
    @SerializedName("Service")
    private String service;
    @SerializedName("Region")
    private String region;
    @SerializedName("Error")
    private Error error;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
