package com.volcengine;

/**
 * xuyaming@bytedance.com
 * 2022/12/23 15:34
 */
public enum HttpMethod {
    GET("GET"),HEAD("HEAD"),POST("POST"),PUT("PUT"),DELETE("DELETE");
    private final String method;
    private HttpMethod(String method){
        this.method = method;
    }

    public  String GetMethod(){
        return method;
    }
}
