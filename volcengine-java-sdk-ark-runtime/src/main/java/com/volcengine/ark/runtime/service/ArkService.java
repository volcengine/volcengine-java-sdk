package com.volcengine.ark.runtime.service;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.volcengine.ark.runtime.*;
import com.volcengine.ark.runtime.exception.ArkAPIError;
import com.volcengine.ark.runtime.exception.ArkHttpException;
import com.volcengine.ark.runtime.interceptor.AuthenticationInterceptor;
import com.volcengine.ark.runtime.interceptor.EndpointStsAuthenticationInterceptor;
import com.volcengine.ark.runtime.interceptor.RequestIdInterceptor;
import com.volcengine.ark.runtime.model.completion.chat.*;
import com.volcengine.ark.runtime.utils.ResponseBodyCallback;
import com.volcengine.ark.runtime.utils.SSE;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Single;
import okhttp3.Headers;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.HttpException;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

import java.io.IOException;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;


public class ArkService extends ArkBaseService implements ArkBaseServiceImpl {
    private static final ObjectMapper mapper = defaultObjectMapper();
    private final ArkApi api;
    private final ExecutorService executorService;

    public ArkService(final String apiKey) {
        this(apiKey, DEFAULT_TIMEOUT);
    }

    public ArkService(final String apiKey, final Duration timeout) {
        ObjectMapper mapper = defaultObjectMapper();
        OkHttpClient client = defaultApiKeyClient(apiKey, timeout);
        Retrofit retrofit = defaultRetrofit(client, mapper);

        this.api = retrofit.create(ArkApi.class);
        this.executorService = client.dispatcher().executorService();
    }

    public ArkService(final String ak, final String sk) {
        this(ak, sk, DEFAULT_TIMEOUT);
    }

    public ArkService(final String ak, final String sk, final Duration timeout) {
        ObjectMapper mapper = defaultObjectMapper();
        OkHttpClient client = defaultEndpointStsClient(ak, sk, timeout);
        Retrofit retrofit = defaultRetrofit(client, mapper);

        this.api = retrofit.create(ArkApi.class);
        this.executorService = client.dispatcher().executorService();
    }

    public ArkService(final ArkApi api) {
        this.api = api;
        this.executorService = null;
    }

    public ArkService(final ArkApi api, final ExecutorService executorService) {
        this.api = api;
        this.executorService = executorService;
    }

    public static ObjectMapper defaultObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper;
    }

    public static OkHttpClient defaultApiKeyClient(String apiKey, Duration timeout) {
        return new OkHttpClient.Builder()
                .addInterceptor(new AuthenticationInterceptor(apiKey))
                .addInterceptor(new RequestIdInterceptor())
                .connectionPool(new ConnectionPool(5, 1, TimeUnit.SECONDS))
                .readTimeout(timeout.toMillis(), TimeUnit.MILLISECONDS)
                .build();
    }

    public static OkHttpClient defaultEndpointStsClient(String ak, String sk, Duration timeout) {
        return new OkHttpClient.Builder()
                .addInterceptor(new EndpointStsAuthenticationInterceptor(ak, sk))
                .addInterceptor(new RequestIdInterceptor())
                .connectionPool(new ConnectionPool(5, 1, TimeUnit.SECONDS))
                .readTimeout(timeout.toMillis(), TimeUnit.MILLISECONDS)
                .build();
    }

    public static Retrofit defaultRetrofit(OkHttpClient client, ObjectMapper mapper) {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(JacksonConverterFactory.create(mapper))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public static <T> T execute(Single<T> apiCall) {
        try {
            T resp = apiCall.blockingGet();
            return resp;
        } catch (HttpException e) {
            String requestId = "";
            try {
                Headers headers = e.response().raw().request().headers();
                requestId = headers.get(Const.CLIENT_REQUEST_HEADER);
            } catch (Exception ignored) {

            }

            try {
                if (e.response() == null || e.response().errorBody() == null) {
                    throw e;
                }
                String errorBody = e.response().errorBody().string();

                ArkAPIError error = mapper.readValue(errorBody, ArkAPIError.class);
                throw new ArkHttpException(error, e, e.code(), requestId);
            } catch (IOException ex) {
                throw e;
            }
        }
    }

    public static Flowable<SSE> stream(Call<ResponseBody> apiCall) {
        return stream(apiCall, false);
    }

    public static Flowable<SSE> stream(Call<ResponseBody> apiCall, boolean emitDone) {
        return Flowable.create(emitter -> apiCall.enqueue(new ResponseBodyCallback(emitter, emitDone)), BackpressureStrategy.BUFFER);
    }

    public static <T> Flowable<T> stream(Call<ResponseBody> apiCall, Class<T> cl) {
        return stream(apiCall).map(sse -> mapper.readValue(sse.getData(), cl));
    }

    public ChatCompletionResult createChatCompletion(ChatCompletionRequest request) {
        return execute(api.createChatCompletion(request, request.getModel()));
    }

    public Flowable<ChatCompletionChunk> streamChatCompletion(ChatCompletionRequest request) {
        request.setStream(true);

        return stream(api.createChatCompletionStream(request, request.getModel()), ChatCompletionChunk.class);
    }

    public void shutdownExecutor() {
        Objects.requireNonNull(this.executorService, "executorService must be set in order to shut down");
        this.executorService.shutdown();
    }

}
