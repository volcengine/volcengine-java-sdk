package com.volcengine.ark.runtime.interceptor;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.StringUtil;
import com.volcengine.ark.ArkApi;
import com.volcengine.ark.model.GetApiKeyRequest;
import com.volcengine.ark.model.GetApiKeyResponse;
import com.volcengine.ark.runtime.Const;
import com.volcengine.ark.runtime.exception.ArkException;
import com.volcengine.sign.Credentials;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.BiFunction;

public class ArkResourceStsAuthenticationInterceptor implements Interceptor {

    private final String ak;
    private final String sk;
    // cacheKey = resourceType/resourceId
    private Map<String, ArkResourceStsTokenInfo> resourceStsTokens;
    private final Integer advisoryRefreshTimeout = Const.DEFAULT_ADVISORY_REFRESH_TIMEOUT;
    private final Integer mandatoryRefreshTimeout = Const.DEFAULT_MANDATORY_REFRESH_TIMEOUT;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final ArkApi volcClient;

    public ArkResourceStsAuthenticationInterceptor(String ak, String sk, String region) {
        Objects.requireNonNull(ak, "Ak token required");
        Objects.requireNonNull(sk, "Sk token required");
        this.ak = ak;
        this.sk = sk;
        this.resourceStsTokens = new ConcurrentHashMap<>();

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);
        ArkApi arkApi = new ArkApi(apiClient);
        this.volcClient = arkApi;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        String requestResourceType = getRequestResourceType(request);
        String requestResourceId = getRequestResourceId(request);

        if (request.url().url().getPath().contains("contents/generations")) {
            throw new ArkException("content generation currently does not support ak&sk authentication, use api_key instead.");
        }

        Request newRequest = chain.request()
                .newBuilder()
                .header("Authorization", "Bearer " + getResourceStsToken(requestResourceType, requestResourceId))
                .build();
        return chain.proceed(newRequest);
    }

    private String getRequestResourceType(Request request) {
        if (StringUtils.isNotBlank(request.header(Const.REQUEST_BOT))) {
            return Const.RESOURCE_TYPE_BOT;
        }
        return Const.RESOURCE_TYPE_ENDPOINT;
    }

    private String getRequestResourceId(Request request) {
        if (StringUtils.isNotBlank(request.header(Const.REQUEST_BOT))) {
            return request.header(Const.REQUEST_BOT);
        }
        return request.header(Const.REQUEST_MODEL);
    }

    private String getResourceStsToken(String resourceType, String resourceId) {
        refresh(resourceType, resourceId);

        ArkResourceStsTokenInfo tokenInfo = this.resourceStsTokens.get(getResourceKey(resourceType, resourceId));
        if (tokenInfo == null) {
            return "";
        }
        return tokenInfo.getToken();
    }

    private void refresh(String resourceType, String resourceId) {
        if (!need_refresh(resourceType, resourceId, this.advisoryRefreshTimeout)) {
            return;
        }

        if (lock.writeLock().tryLock()) {
            if (!need_refresh(resourceType, resourceId, this.advisoryRefreshTimeout)) {
                return;
            }

            try {
                boolean isMandatoryRefresh = need_refresh(resourceType, resourceId, this.mandatoryRefreshTimeout);
                protectedRefresh(resourceType, resourceId, isMandatoryRefresh);
            } finally {
                lock.writeLock().unlock();
            }
        } else if (need_refresh(resourceType, resourceId, this.mandatoryRefreshTimeout)) {
            try {
                lock.writeLock().lock();
                if (!need_refresh(resourceType, resourceId, this.mandatoryRefreshTimeout)) {
                    return;
                }
                protectedRefresh(resourceType, resourceId, true);
            } finally {
                lock.writeLock().unlock();
            }
        }
    }

    private boolean need_refresh(String resourceType, String resourceId, Integer refresh_in) {
        ArkResourceStsTokenInfo tokenInfo = this.resourceStsTokens.get(getResourceKey(resourceType, resourceId));
        if (tokenInfo == null) {
            return true;
        }

        return tokenInfo.getExpiredTime() - System.currentTimeMillis() / 1000 < refresh_in;
    }

    private void protectedRefresh(String resourceType, String resourceId, boolean isMandatory) {
        this.resourceStsTokens.compute(getResourceKey(resourceType, resourceId), new BiFunction<String, ArkResourceStsTokenInfo, ArkResourceStsTokenInfo>() {
            @Override
            public ArkResourceStsTokenInfo apply(String s, ArkResourceStsTokenInfo stringIntegerPair) {
                try {
                    ArkResourceStsTokenInfo tokenInfo = getToken(resourceType, resourceId, Const.DEFAULT_STS_TIMEOUT);
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

    private ArkResourceStsTokenInfo getEndpointToken(String endpointId, Integer ttl) throws ApiException {
        return getToken("endpoint", endpointId, ttl);
    }

    private ArkResourceStsTokenInfo getToken(String resourceType, String resourceId, Integer ttl) throws ApiException {
        if (ttl < this.advisoryRefreshTimeout * 2) {
            throw new ArkException("ttl should not be under " + this.advisoryRefreshTimeout * 2 + " seconds.");
        }

        GetApiKeyRequest r = new GetApiKeyRequest();
        r.durationSeconds(ttl);
        r.resourceType(resourceType);
        List<String> list = new ArrayList<>();
        list.add(resourceId);
        r.resourceIds(list);

        GetApiKeyResponse response = this.volcClient.getApiKey(r);
        return new ArkResourceStsTokenInfo(response.getApiKey(), response.getExpiredTime());
    }

    private String getResourceKey(String resourceType, String resourceId) {
        return resourceType + "/" + resourceId;
    }

    public static class ArkResourceStsTokenInfo {
        private String token;
        private Integer expiredTime;

        public ArkResourceStsTokenInfo(String token, Integer expiredTime) {
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
