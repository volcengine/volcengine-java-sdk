package com.volcengine.ark.runtime.interceptor;

import com.volcengine.ark.runtime.utils.ModelBreaker;
import okhttp3.*;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.ConcurrentHashMap;

import static com.volcengine.ark.runtime.Const.*;

public class BatchInterceptor implements Interceptor  {

    private final ConcurrentHashMap<String, ModelBreaker> modelBreakerMap;

    public BatchInterceptor() {
        this.modelBreakerMap = new ConcurrentHashMap<>();
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        HttpUrl url = request.url();
        if (!url.encodedPath().equals(BATCH_CHAT_PATH)) {
            return chain.proceed(request);
        }
        String endpoint = request.header(REQUEST_MODEL);
        try {
            waitModelForRetryAfter(endpoint);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Response response = chain.proceed(chain.request());
        String retryAfter = response.header(RETRY_AFTER);
        if (retryAfter != null && !retryAfter.isEmpty()) {
            try {
                int delay = Integer.parseInt(retryAfter);
                setModelForRetryAfter(endpoint, Duration.ofSeconds(delay));
            } catch (NumberFormatException e) {
                // 无效的RetryAfter Header. 跳过
            }
        }
        return response;
    }
    private void waitModelForRetryAfter(String model) throws InterruptedException {
        ModelBreaker breaker = this.getModelBreaker(model);
        while (!breaker.Allow()){
            Duration duration = breaker.GetAllowedDuration();
            if (duration.getSeconds() > 0) {
                Thread.sleep(duration.toMillis());
            }
        }
    }

    private void setModelForRetryAfter(String model, Duration duration) {
        ModelBreaker breaker = this.getModelBreaker(model);
        breaker.Reset(duration);
    }

    private ModelBreaker getModelBreaker(String model){
        ModelBreaker breaker;
        if (this.modelBreakerMap.containsKey(model)) {
            breaker = this.modelBreakerMap.get(model);
        } else {
            breaker = new ModelBreaker();
            this.modelBreakerMap.put(model, breaker);
        }
        return breaker;
    }

}
