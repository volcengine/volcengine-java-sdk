package com.volcengine;

/**
 * xuyaming@bytedance.com
 * 2022/12/23 15:38
 */
public enum ContentType {
    Default(""),ApplicationJSON("application/json"),FormUrlencoded("x-www-form-urlencoded");
    private final String type;
    private ContentType(String type){
        this.type =type;
    }
    public String GetType(){
        return this.type;
    }
}
