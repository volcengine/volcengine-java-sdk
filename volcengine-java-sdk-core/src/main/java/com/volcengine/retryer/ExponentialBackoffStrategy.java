package com.volcengine.retryer;

/**
 * A backoff strategy that increases the delay exponentially with each retry.
 * The delay is calculated as: Math.min(minRetryDelayMs * Math.pow(2, retryCount), maxRetryDelayMs)
 */
public class ExponentialBackoffStrategy extends BackoffStrategy{

    public ExponentialBackoffStrategy() {

    }

    protected ExponentialBackoffStrategy(long minRetryDelayMs, long maxRetryDelayMs) {
        this.minRetryDelayMs = minRetryDelayMs;
        this.maxRetryDelayMs = maxRetryDelayMs;
    }

    @Override
    public long computeDelay(int retryCount) {
        double delay = minRetryDelayMs * Math.pow(2, retryCount);
        return (long) Math.min(delay, maxRetryDelayMs);
    }

}
