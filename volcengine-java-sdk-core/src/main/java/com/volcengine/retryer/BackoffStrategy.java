package com.volcengine.retryer;

/**
 *  Abstract base class for all backoff strategies.
 *  Defines the interface for computing retry delays.
 */
public abstract class BackoffStrategy implements Cloneable {
    protected long minRetryDelayMs;
    protected long maxRetryDelayMs;

    /**
     * Copy this strategy, preserving its runtime type and delay settings.
     * Subclasses with additional mutable reference fields should override this
     * method, call {@code super.copy()}, and copy those fields on the result.
     */
    public BackoffStrategy copy() {
        try {
            return (BackoffStrategy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

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
