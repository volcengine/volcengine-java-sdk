package com.volcengine.ark.runtime.interceptor;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.ark.ArkApi;
import com.volcengine.ark.model.GetApiKeyRequest;
import com.volcengine.ark.model.GetApiKeyResponse;
import com.volcengine.ark.runtime.Const;
import com.volcengine.ark.runtime.exception.ArkException;
import com.volcengine.sign.Credentials;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.BiFunction;

public class EndpointStsAuthenticationInterceptor implements Interceptor {

    private final String ak;
    private final String sk;
    private Map<String, EndpointStsTokenInfo> endpointStsTokens;
    private final Integer advisoryRefreshTimeout = Const.DEFAULT_ADVISORY_REFRESH_TIMEOUT;
    private final Integer mandatoryRefreshTimeout = Const.DEFAULT_MANDATORY_REFRESH_TIMEOUT;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final ArkApi volcClient;

    public EndpointStsAuthenticationInterceptor(String ak, String sk) {
        Objects.requireNonNull(ak, "Ak token required");
        Objects.requireNonNull(sk, "Sk token required");
        this.ak = ak;
        this.sk = sk;
        this.endpointStsTokens = new ConcurrentHashMap<>();

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak,sk))
                .setRegion("cn-beijing");
        ArkApi arkApi = new ArkApi(apiClient);
        this.volcClient = arkApi;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        String model = request.header(Const.REQUEST_MODEL);

        Request newRequest = chain.request()
                .newBuilder()
                .header("Authorization", "Bearer " + getEndpointStsToken(model))
                .build();
        return chain.proceed(newRequest);
    }

    private String getEndpointStsToken(String endpointId) {
        refresh(endpointId);

        EndpointStsTokenInfo tokenInfo = this.endpointStsTokens.get(endpointId);
        if (tokenInfo == null) {
            return "";
        }
        return tokenInfo.getToken();
    }

    private void refresh(String endpointId) {
        if (!need_refresh(endpointId, this.advisoryRefreshTimeout)) {
            return;
        }

        if (lock.writeLock().tryLock()) {
            if (!need_refresh(endpointId, this.advisoryRefreshTimeout)) {
                return;
            }

            try {
                boolean isMandatoryRefresh = need_refresh(endpointId, this.mandatoryRefreshTimeout);
                protectedRefresh(endpointId, isMandatoryRefresh);
            } finally {
                lock.writeLock().unlock();
            }
        } else if (need_refresh(endpointId, this.mandatoryRefreshTimeout)) {
            try {
                lock.writeLock().lock();
                if (!need_refresh(endpointId, this.mandatoryRefreshTimeout)) {
                    return;
                }
                protectedRefresh(endpointId, true);
            } finally {
                lock.writeLock().unlock();
            }
        }
    }

    private boolean need_refresh(String endpointId, Integer refresh_in) {
        EndpointStsTokenInfo tokenInfo = this.endpointStsTokens.get(endpointId);
        if (tokenInfo == null) {
            return true;
        }

        return tokenInfo.getExpiredTime() - System.currentTimeMillis() / 1000 < refresh_in;
    }

    private void protectedRefresh(String endpointId, boolean isMandatory) {
        this.endpointStsTokens.compute(endpointId, new BiFunction<String, EndpointStsTokenInfo, EndpointStsTokenInfo>() {
            @Override
            public EndpointStsTokenInfo apply(String s, EndpointStsTokenInfo stringIntegerPair) {
                try {
                    EndpointStsTokenInfo tokenInfo = getToken(s, Const.DEFAULT_STS_TIMEOUT);
                    return tokenInfo;
                } catch (ApiException e) {
                    if (isMandatory) {
                        throw new RuntimeException(e);
                    }
                    return null;
                }
            }
        });
    }

    private EndpointStsTokenInfo getToken(String endpointId, Integer ttl) throws ApiException {
        if (ttl < this.advisoryRefreshTimeout * 2) {
            throw new ArkException("ttl should not be under " + this.advisoryRefreshTimeout * 2 + " seconds.");
        }

        GetApiKeyRequest r = new GetApiKeyRequest();
        r.durationSeconds(ttl);
        r.resourceType("endpoint");
        List<String> list = new ArrayList<>();
        list.add(endpointId);
        r.resourceIds(list);

        GetApiKeyResponse response = this.volcClient.getApiKey(r);
        return new EndpointStsTokenInfo(response.getApiKey(), response.getExpiredTime());
    }

    public static class EndpointStsTokenInfo {
        private String token;
        private Integer expiredTime;

        public EndpointStsTokenInfo(String token, Integer expiredTime) {
            this.token = token;
            this.expiredTime = expiredTime;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public Integer getExpiredTime() {
            return expiredTime;
        }

        public void setExpiredTime(Integer expiredTime) {
            this.expiredTime = expiredTime;
        }
    }
}
