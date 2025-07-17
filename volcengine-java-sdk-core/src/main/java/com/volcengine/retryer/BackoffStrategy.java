package com.volcengine.retryer;

/**
 *  Abstract base class for all backoff strategies.
 *  Defines the interface for computing retry delays.
 */
public abstract class BackoffStrategy {
    protected long minRetryDelayMs;
    protected long maxRetryDelayMs;

    public abstract long computeDelay(int retryCount);

    public long getMaxRetryDelayMs() {
        return maxRetryDelayMs;
    }

    public void setMaxRetryDelayMs(long maxRetryDelayMs) {
        this.maxRetryDelayMs = maxRetryDelayMs;
    }

    public long getMinRetryDelayMs() {
        return minRetryDelayMs;
    }

    public void setMinRetryDelayMs(long minRetryDelayMs) {
        this.minRetryDelayMs = minRetryDelayMs;
    }
}
