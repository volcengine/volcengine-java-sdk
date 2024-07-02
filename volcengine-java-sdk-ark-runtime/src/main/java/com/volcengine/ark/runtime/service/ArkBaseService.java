package com.volcengine.ark.runtime.service;


import java.time.Duration;


/**
 * The interface ark service.
 */
public abstract class ArkBaseService {

    static final String BASE_URL = "https://ark.cn-beijing.volces.com";
    static final String BASE_REGION = "cn-beijing";
    static final Duration DEFAULT_TIMEOUT = Duration.ofMinutes(10);
    String apiKey = "";
    String ak = "";
    String sk = "";

}
