package com.volcengine.retryer;

import java.util.concurrent.ThreadLocalRandom;

/**
 * An exponential backoff strategy with random jitter.
 *     The delay is calculated as: base + ThreadLocalRandom.current().nextDouble(0, base),
 *     capped by maxRetryDelayMs.
 *     This effectively means the delay is a random value between base and 2*base,
 *     then capped by maxRetryDelayMs.
 */
public class ExponentialWithRandomJitterBackoffStrategy extends ExponentialBackoffStrategy{

    public ExponentialWithRandomJitterBackoffStrategy() {
        super();
    }

    protected ExponentialWithRandomJitterBackoffStrategy(long minRetryDelayMs, long maxRetryDelayMs) {
        super(minRetryDelayMs, maxRetryDelayMs);
    }

    @Override
    public long computeDelay(int retryCount) {
        long baseDelay = super.computeDelay(retryCount);
        long jitter = baseDelay + ThreadLocalRandom.current().nextLong(0, baseDelay);
        return (long) Math.min(jitter, maxRetryDelayMs);
    }
}
