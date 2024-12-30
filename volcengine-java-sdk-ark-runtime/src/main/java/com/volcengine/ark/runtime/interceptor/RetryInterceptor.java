package com.volcengine.ark.runtime.interceptor;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.io.InterruptedIOException;

import static com.volcengine.ark.runtime.Const.*;
import static java.lang.Math.random;

public class RetryInterceptor implements Interceptor {

    private final int retryTimes;
    private final double INITIAL_RETRY_DELAY = 0.5;
    private final double MAX_RETRY_DELAY = 8.0;

    public RetryInterceptor(int retryTimes) {
        this.retryTimes = retryTimes;
    }

    @Override
    public Response intercept(Chain chain) throws RuntimeException, InterruptedIOException {
        Request request = chain.request();

        int requestRetryTimes = getRetryTimes(request);

        Response response = null;
        int tryCount = 0;
        boolean shouldRetry;
        Exception exception;
        do {
            if (response != null) {
                response.close();
            }
            exception = null;

            try {
                response = chain.proceed(request);
                shouldRetry = response.code() >= 500 || response.code() == 429;
            } catch (Exception e) {
                shouldRetry = true;
                exception = e;
            }

            tryCount++;
            if (!(shouldRetry && tryCount <= requestRetryTimes)) {
                break;
            }

            try {
                double interval = retryInterval(requestRetryTimes, requestRetryTimes - tryCount) * 1000;
                Thread.sleep(Math.round(interval));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } while (true);

        if (response != null) {
            return response;
        }
        throw new RuntimeException(exception);
    }

    public double retryInterval(int max, int remain) {
        double nbRetries = Math.min(max - remain, MAX_RETRY_DELAY/INITIAL_RETRY_DELAY);
        double sleepSeconds = Math.min(INITIAL_RETRY_DELAY * Math.pow(2.0, nbRetries), MAX_RETRY_DELAY);
        double jitter = 1 - 0.25 * random();
        return sleepSeconds * jitter;
    }

    public int getRetryTimes(Request request) {
        String path = request.url().encodedPath();
        if (path.equals(BATCH_CHAT_PATH)) {
            return MAX_RETRY_TIMES;
        }
        return retryTimes;
    }
}

