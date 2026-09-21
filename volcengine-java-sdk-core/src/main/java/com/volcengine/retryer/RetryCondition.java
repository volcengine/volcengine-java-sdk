package com.volcengine.retryer;

import com.volcengine.ApiException;
import com.volcengine.ApiResponse;

import java.util.HashSet;
import java.util.Set;

public abstract class RetryCondition implements Cloneable {
    protected Set<String> retryErrorCodes = new HashSet<>();

    /**
     * Copy this condition, preserving its runtime type and independently copying
     * the retry error codes. Subclasses with additional mutable reference fields
     * should override this method, call {@code super.copy()}, and copy those
     * fields on the result.
     */
    public RetryCondition copy() {
        try {
            RetryCondition copy = (RetryCondition) super.clone();
            copy.retryErrorCodes = retryErrorCodes == null ? null : new HashSet<String>(retryErrorCodes);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

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
