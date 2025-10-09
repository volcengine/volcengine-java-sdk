package com.volcengine.retryer;

import com.volcengine.ApiException;
import com.volcengine.ApiResponse;

import java.util.HashSet;
import java.util.Set;

public abstract class RetryCondition {
    protected Set<String> retryErrorCodes = new HashSet<>();

    public abstract boolean shouldRetry(ApiResponse response, ApiException apiException);

    public Set<String> getRetryErrorCodes() {
        return retryErrorCodes;
    }

    public void addRetryErrorCode(String retryErrorCode) {
        this.retryErrorCodes.add(retryErrorCode);
    }

    public void addRetryErrorCodes(Set<String> retryErrorCodes) {
        this.retryErrorCodes.addAll(retryErrorCodes);
    }

}
