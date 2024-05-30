package com.volcengine.ark.runtime;

public class Const {

    public static final String ACCESS_KEY = "VOLC_ACCESSKEY";
    public static final String SECRET_KEY = "VOLC_SECRETKEY";
    public static final String CLIENT_REQUEST_HEADER = "X-Client-Request-Id";
    public static final String SERVER_REQUEST_HEADER = "X-Request-Id";
    public static final String REQUEST_MODEL = "X-Request-Model";
    public static final Integer DEFAULT_MANDATORY_REFRESH_TIMEOUT = 10 * 60;  // 10 min
    public static final Integer DEFAULT_ADVISORY_REFRESH_TIMEOUT = 30 * 60;  // 30 min
    public static final Integer DEFAULT_STS_TIMEOUT = 7 * 24 * 60 * 60;  // 7 days
}
