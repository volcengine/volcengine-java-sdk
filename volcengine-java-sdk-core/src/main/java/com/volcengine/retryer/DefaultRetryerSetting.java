package com.volcengine.retryer;

import java.util.HashSet;
import java.util.Set;

public class DefaultRetryerSetting {
    public static final boolean DEFAULT_AUTO_RETRY_ENABLED = true;
    public static final int DEFAULT_MAX_RETRIES = 3;
    public static final int DEFAULT_MIN_RETRY_DELAY_MS = 300;
    public static final int DEFAULT_MAX_RETRY_DELAY_MS = 300 * 1000;
    public static final BackoffStrategy DEFAULT_BACKOFF_STRATEGY = new ExponentialWithRandomJitterBackoffStrategy(DEFAULT_MIN_RETRY_DELAY_MS, DEFAULT_MAX_RETRY_DELAY_MS);
    public static final Set<String> DEFAULT_RETRY_ERROR_CODES = new HashSet<>();
    public static final DefaultRetryCondition DEFAULT_RETRY_CONDITION = new DefaultRetryCondition(DEFAULT_RETRY_ERROR_CODES);
    public static final Retryer DEFAULT_RETRYER = new Retryer(DEFAULT_MAX_RETRIES, DEFAULT_BACKOFF_STRATEGY, DEFAULT_RETRY_CONDITION);
}
