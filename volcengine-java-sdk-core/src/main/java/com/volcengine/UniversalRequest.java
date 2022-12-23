package com.volcengine;

import javax.validation.constraints.NotEmpty;

/**
 * xuyaming@bytedance.com
 * 2022/12/23 15:33
 */
public class UniversalRequest {
    @NotEmpty
    private String serviceName;
    @NotEmpty
    private String action;
    @NotEmpty
    private String version;
    private HttpMethod httpMethod = HttpMethod.GET;
    private ContentType contentType = ContentType.Default;

    public UniversalRequest(String serviceName, String action, String version, HttpMethod httpMethod, ContentType contentType) {
        this.serviceName = serviceName;
        this.action = action;
        this.version = version;
        this.httpMethod = httpMethod;
        this.contentType = contentType;
    }

    public UniversalRequest() {
    }

    public UniversalRequest(String serviceName, String action, String version) {
        this.serviceName = serviceName;
        this.action = action;
        this.version = version;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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

    public HttpMethod getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(HttpMethod httpMethod) {
        this.httpMethod = httpMethod;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }
}
