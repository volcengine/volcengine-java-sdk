package com.volcengine.ark.runtime.service;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.volcengine.ark.runtime.*;
import com.volcengine.ark.runtime.exception.ArkAPIError;
import com.volcengine.ark.runtime.exception.ArkException;
import com.volcengine.ark.runtime.exception.ArkHttpException;
import com.volcengine.ark.runtime.interceptor.AuthenticationInterceptor;
import com.volcengine.ark.runtime.interceptor.ArkResourceStsAuthenticationInterceptor;
import com.volcengine.ark.runtime.interceptor.RequestIdInterceptor;
import com.volcengine.ark.runtime.interceptor.RetryInterceptor;
import com.volcengine.ark.runtime.model.bot.completion.chat.BotChatCompletionRequest;
import com.volcengine.ark.runtime.model.bot.completion.chat.BotChatCompletionResult;
import com.volcengine.ark.runtime.model.completion.chat.*;
import com.volcengine.ark.runtime.model.embeddings.EmbeddingRequest;
import com.volcengine.ark.runtime.model.embeddings.EmbeddingResult;
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
import retrofit2.http.HeaderMap;

import java.io.IOException;
import java.time.Duration;
import java.util.*;
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
        Retrofit retrofit = defaultRetrofit(client, mapper, BASE_URL);

        this.api = retrofit.create(ArkApi.class);
        this.executorService = client.dispatcher().executorService();
    }

    public ArkService(final String ak, final String sk) {
        this(ak, sk, DEFAULT_TIMEOUT);
    }

    public ArkService(final String ak, final String sk, final Duration timeout) {
        ObjectMapper mapper = defaultObjectMapper();
        OkHttpClient client = defaultResourceStsClient(ak, sk, timeout, BASE_REGION);
        Retrofit retrofit = defaultRetrofit(client, mapper, BASE_URL);

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

    public static OkHttpClient defaultResourceStsClient(String ak, String sk, Duration timeout, String region) {
        return new OkHttpClient.Builder()
                .addInterceptor(new ArkResourceStsAuthenticationInterceptor(ak, sk, region))
                .addInterceptor(new RequestIdInterceptor())
                .connectionPool(new ConnectionPool(5, 1, TimeUnit.SECONDS))
                .readTimeout(timeout.toMillis(), TimeUnit.MILLISECONDS)
                .build();
    }

    public static Retrofit defaultRetrofit(OkHttpClient client, ObjectMapper mapper, String baseUrl) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
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
        return execute(api.createChatCompletion(request, request.getModel(), new HashMap<>()));
    }

    public ChatCompletionResult createChatCompletion(ChatCompletionRequest request, Map<String, String> customHeaders) {
        return execute(api.createChatCompletion(request, request.getModel(), customHeaders));
    }

    public Flowable<ChatCompletionChunk> streamChatCompletion(ChatCompletionRequest request) {
        request.setStream(true);

        return stream(api.createChatCompletionStream(request, request.getModel(), new HashMap<>()), ChatCompletionChunk.class);
    }

    public Flowable<ChatCompletionChunk> streamChatCompletion(ChatCompletionRequest request, Map<String, String> customHeaders) {
        request.setStream(true);

        return stream(api.createChatCompletionStream(request, request.getModel(), customHeaders), ChatCompletionChunk.class);
    }

    public EmbeddingResult createEmbeddings(EmbeddingRequest request) {
        return execute(api.createEmbeddings(request, request.getModel(), new HashMap<>()));
    }

    public EmbeddingResult createEmbeddings(EmbeddingRequest request, Map<String, String> customHeaders) {
        return execute(api.createEmbeddings(request, request.getModel(), customHeaders));
    }

    @Override
    public BotChatCompletionResult createBotChatCompletion(BotChatCompletionRequest request) {
        return execute(api.createBotChatCompletion(request, request.getModel()));
    }

    @Override
    public Flowable<ChatCompletionChunk> streamBotChatCompletion(BotChatCompletionRequest request) {
        request.setStream(true);
        return stream(api.createBotChatCompletionStream(request, request.getModel()), ChatCompletionChunk.class);
    }

    public void shutdownExecutor() {
        Objects.requireNonNull(this.executorService, "executorService must be set in order to shut down");
        this.executorService.shutdown();
    }

    public static ArkService.Builder builder() {
        return new ArkService.Builder();
    }

    public static class Builder {
        private String ak;
        private String sk;
        private String apiKey;
        private String region = BASE_REGION;
        private String baseUrl = BASE_URL;
        private Duration timeout = DEFAULT_TIMEOUT;
        private int retryTimes = 0;

        public ArkService.Builder ak(String ak) {
            this.ak = ak;
            return this;
        }

        public ArkService.Builder sk(String sk) {
            this.sk = sk;
            return this;
        }

        public ArkService.Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public ArkService.Builder region(String region) {
            this.region = region;
            return this;
        }

        public ArkService.Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            if (!baseUrl.endsWith("/")) {
                this.baseUrl = baseUrl + "/";
            }
            return this;
        }

        public ArkService.Builder timeout(Duration timeout) {
            this.timeout = timeout;
            return this;
        }

        public ArkService.Builder retryTimes(int retryTimes) {
            this.retryTimes = retryTimes;
            return this;
        }

        public ArkService build() {
            ObjectMapper mapper = defaultObjectMapper();
            OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
            if (apiKey != null && apiKey.length() > 0) {
                clientBuilder.addInterceptor(new AuthenticationInterceptor(apiKey));
            } else if (ak != null && sk != null && ak.length() > 0 && sk.length() > 0) {
                clientBuilder.addInterceptor(new ArkResourceStsAuthenticationInterceptor(ak, sk, region));
            } else {
                throw new ArkException("missing api_key or ak&sk.");
            }

            OkHttpClient client = clientBuilder
                    .addInterceptor(new RequestIdInterceptor())
                    .addInterceptor(new RetryInterceptor(retryTimes))
                    .connectionPool(new ConnectionPool(5, 1, TimeUnit.SECONDS))
                    .readTimeout(timeout.toMillis(), TimeUnit.MILLISECONDS)
                    .build();
            Retrofit retrofit = defaultRetrofit(client, mapper, baseUrl);

            return new ArkService(
                    retrofit.create(ArkApi.class),
                    client.dispatcher().executorService()
            );
        }
    }
}
