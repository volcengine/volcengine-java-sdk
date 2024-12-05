package com.volcengine.ark.runtime.service;


import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


/**
 * The interface ark service.
 */
public abstract class ArkBaseService {

    public static final String BASE_URL = "https://ark.cn-beijing.volces.com";
    public static final String BASE_REGION = "cn-beijing";
    public static final Duration DEFAULT_TIMEOUT = Duration.ofMinutes(10);
    public static final Duration DEFAULT_CONNECT_TIMEOUT = Duration.ofMinutes(1);
}
