package com.volcengine.retryer;
import com.volcengine.ApiException;
import com.volcengine.ApiResponse;

public class Retryer {
    private int numMaxRetries;
    private BackoffStrategy backoffStrategy;
    private RetryCondition retryCondition;

    public Retryer(int maxRetries, BackoffStrategy backoffStrategy, RetryCondition retryCondition) {
        this.numMaxRetries = maxRetries;
        this.backoffStrategy = backoffStrategy;
        this.retryCondition = retryCondition;
    }

    public boolean shouldRetry(ApiResponse response, int retryCount, ApiException apiException) {
        return retryCount < numMaxRetries && retryCondition.shouldRetry(response, apiException);
    }

    public long getBackoffDelay(int retryCount) throws ApiException {
        if (retryCount >= numMaxRetries) {
            throw new ApiException("Retry count exceeds maximum allowed retries.");
        }
        return backoffStrategy.computeDelay(retryCount);
    }

    public int getNumMaxRetries() {
        return numMaxRetries;
    }

    public void setNumMaxRetries(int numMaxRetries) {
        this.numMaxRetries = numMaxRetries;
    }

    public BackoffStrategy getBackoffStrategy() {
        return backoffStrategy;
    }

    public void setBackoffStrategy(BackoffStrategy backoffStrategy) throws ApiException {
        if (backoffStrategy == null) {
            throw new ApiException("BackoffStrategy cannot be null.");
        }
        this.backoffStrategy = backoffStrategy;
    }

    public RetryCondition getRetryCondition() {
        return retryCondition;
    }

    public void setRetryCondition(RetryCondition retryCondition) throws ApiException {
        if (retryCondition == null) {
            throw new ApiException("RetryCondition cannot be null.");
        }
        this.retryCondition = retryCondition;
    }
}
