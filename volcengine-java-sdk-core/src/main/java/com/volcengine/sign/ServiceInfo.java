package com.volcengine.sign;

/**
 * xuyaming@bytedance.com
 * 2022/3/18 14:08
 */
public class ServiceInfo {
    private String serviceName;
    private String method;

    public ServiceInfo(String serviceName, String method) {
        this.serviceName = serviceName;
        this.method = method;
    }

    public ServiceInfo() {
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
