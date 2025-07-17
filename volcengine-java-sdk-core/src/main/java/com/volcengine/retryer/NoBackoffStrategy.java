package com.volcengine.retryer;

/**
 * A backoff strategy that implements no delay between retries.
 */
public class NoBackoffStrategy extends BackoffStrategy{
    @Override
    public long computeDelay(int retryCount) {
        return 0;
    }
}
