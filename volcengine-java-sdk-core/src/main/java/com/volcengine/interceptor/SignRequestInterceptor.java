package com.volcengine.interceptor;

import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.volcengine.ApiException;
import com.volcengine.Pair;
import com.volcengine.ProgressRequestBody;
import com.volcengine.auth.CredentialProvider;
import com.volcengine.auth.CredentialValue;
import com.volcengine.auth.OidcCredentialProvider;
import com.volcengine.auth.SamlCredentialProvider;
import com.volcengine.auth.StsAssumeRoleProvider;
import com.volcengine.sign.Credentials;
import com.volcengine.sign.ServiceInfo;
import com.volcengine.sign.VolcstackSign;
import okio.Buffer;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;

public class SignRequestInterceptor implements RequestInterceptor {

    public static String name = "volcengine-sign-request-interceptor";
    private static final String RETRY_INVOCATION_ID_HEADER = "X-Sdk-Invocation-Id";
    private static final String RETRY_ATTEMPT_HEADER = "X-Sdk-Request";

    @Override
    public String name() {
        return name;
    }

    @Override
    public InterceptorContext intercept(InterceptorContext context) throws ApiException {
        String path = context.getRequestContext().getPath();
        String method = context.getRequestContext().getMethod();
        Map<String, String> headerParams = context.getRequestContext().getHeaderParams();
        List<Pair> queryParams = context.getRequestContext().getQueryParams();
        ServiceInfo serviceInfo = context.getRequestContext().getServiceInfo();
        String[] authNames = context.getRequestContext().getAuthNames();
        RequestBody reqBody = context.getRequestContext().getRequestBody();

        setHeader(headerParams, RETRY_INVOCATION_ID_HEADER, context.getRequestContext().getInvocationId());
        setHeader(headerParams, RETRY_ATTEMPT_HEADER, String.format(
                "attempt=%d; max=%d",
                context.getRequestContext().getRetryCount() + 1,
                context.getRequestContext().getMaxAttempts()));

        //sign
        VolcstackSign volcengineSign = new VolcstackSign();
        if (context.getApiClient().getCredentials() != null) {
            volcengineSign.setCredentials(context.getApiClient().getCredentials());
        } else {
            CredentialProvider credentialProvider = context.getApiClient().getCredentialProvider();
            if (credentialProvider == null) {
                // No explicit credentials or provider set — use default credential chain
                credentialProvider = new com.volcengine.auth.CredentialProvider(
                    com.volcengine.auth.DefaultCredentialProvider.create()
                );
                context.getApiClient().setCredentialProvider(credentialProvider);
            }
            // When an STS/OIDC/SAML provider has no explicit proxyUrl, fall back to
            // the ApiClient's httpProxy/httpsProxy (and HTTP(S)_PROXY env) so the
            // credential-fetch request reuses the same proxy configuration as the
            // business API client. Explicit proxyUrl on the provider always wins.
            applyProxyFallback(credentialProvider, context.getApiClient());
            CredentialValue credentialValue = credentialProvider.get();
            if (credentialValue == null) {
                throw new ApiException("credentialProvider return null");
            }
            Credentials credentials = Credentials.getCredentials(credentialValue.getAk(), credentialValue.getSk(), credentialValue.getSessionToken());
            volcengineSign.setCredentials(credentials);
        }
        volcengineSign.setRegion(context.getApiClient().getRegion());
        volcengineSign.setService(serviceInfo.getServiceName());
        volcengineSign.setMethod(serviceInfo.getMethod().toUpperCase());

        if (volcengineSign.getCredentials() == null) {
            throw new RuntimeException("Credentials must set when ApiClient init");
        }
        if (StringUtils.isEmpty(volcengineSign.getCredentials().getAccessKey()) || StringUtils.isEmpty(volcengineSign.getCredentials().getSecretKey())) {
            throw new RuntimeException("AccessKey and SecretKey must set when ApiClient init Credentials");
        }
        if (StringUtils.isEmpty(volcengineSign.getRegion())) {
            throw new RuntimeException("Region must set when ApiClient init");
        }

        // Presigned branch
        if (context.getRequestContext().isPresigned()) {
            Map<String, String> queryParamsMap = new HashMap<>();
            for (Pair p : queryParams) {
                queryParamsMap.put(p.getName(), p.getValue());
            }

            String host = context.getRequestContext().getHost();
            try {
                Map<String, String> presignedParams = volcengineSign.presign(queryParamsMap, host);
                String presignedUrl = buildPresignedUrl(context.getRequestContext().getSchema(), host, presignedParams);
                context.getRequestContext().setPresignedUrl(presignedUrl);
            } catch (Exception e) {
                throw new ApiException(e);
            }
            return context;
        }

        // Normal sign branch
        final Buffer buffer = new Buffer();
        try {
            if (reqBody != null) {
                reqBody.writeTo(buffer);
            }
        } catch (IOException e) {
            throw new ApiException(e);
        }
        volcengineSign.applyToParams(queryParams, headerParams, buffer.readUtf8());

        ProgressRequestBody.ProgressRequestListener progressRequestListener = context.getInitInterceptorContext().getProgressRequestListener();

        //build final call
        StringBuilder url = new StringBuilder();
        url.append(context.getRequestContext().getSchema());
        url.append("://");
        url.append(context.getRequestContext().getHost());
        url.append(path);
        context.getApiClient().buildQueryParams(path, url, queryParams);

        final Request.Builder reqBuilder = new Request.Builder().url(url.toString());

        for (Map.Entry<String, String> param : headerParams.entrySet()) {
            reqBuilder.header(param.getKey(), context.getApiClient().parameterToString(param.getValue()));
        }
        //构建最终的请求Request
        Request request = null;

        if (progressRequestListener != null && reqBody != null) {
            ProgressRequestBody progressRequestBody = new ProgressRequestBody(reqBody, progressRequestListener);
            request = reqBuilder.method(method, progressRequestBody).build();
        } else {
            request = reqBuilder.method(method, reqBody).build();
        }
        context.getRequestContext().setRequest(request);
        return context;
    }

    /**
     * Fall back to the ApiClient's proxy configuration for STS/OIDC/SAML
     * providers that have no explicit proxyUrl. Mirrors the Go SDK behaviour
     * where NewSession transfers Config.HTTPProxy/HTTPSProxy to the credential
     * provider. Only fills the gap: an explicit proxyUrl on the provider is
     * left untouched.
     */
    private static void applyProxyFallback(CredentialProvider credentialProvider, com.volcengine.ApiClient apiClient) {
        if (credentialProvider == null || apiClient == null) {
            return;
        }
        Object provider = credentialProvider.getProvider();
        if (provider instanceof StsAssumeRoleProvider) {
            StsAssumeRoleProvider p = (StsAssumeRoleProvider) provider;
            if (StringUtils.isEmpty(p.getProxyUrl())) {
                p.setProxyUrl(apiClient.resolveCredsProxy());
            }
        } else if (provider instanceof OidcCredentialProvider) {
            OidcCredentialProvider p = (OidcCredentialProvider) provider;
            if (StringUtils.isEmpty(p.getProxyUrl())) {
                p.setProxyUrl(apiClient.resolveCredsProxy());
            }
        } else if (provider instanceof SamlCredentialProvider) {
            SamlCredentialProvider p = (SamlCredentialProvider) provider;
            if (StringUtils.isEmpty(p.getProxyUrl())) {
                p.setProxyUrl(apiClient.resolveCredsProxy());
            }
        }
    }

    private static void setHeader(Map<String, String> headers, String name, String value) {
        for (String key : new ArrayList<>(headers.keySet())) {
            if (key.equalsIgnoreCase(name)) {
                headers.remove(key);
            }
        }
        headers.put(name, value);
    }

    private static String buildPresignedUrl(String scheme, String host, Map<String, String> presignedParams) {
        StringBuilder url = new StringBuilder();
        if (StringUtils.isNotEmpty(scheme) && StringUtils.isNotEmpty(host)) {
            url.append(scheme).append("://").append(host).append("?");
        }

        List<String> keys = new ArrayList<>(presignedParams.keySet());
        Collections.sort(keys);

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = presignedParams.get(key);
            try {
                url.append(key)
                   .append("=")
                   .append(URLEncoder.encode(value, "UTF-8").replace("+", "%20"));
            } catch (UnsupportedEncodingException e) {
                url.append(key).append("=").append(value);
            }
            if (i < keys.size() - 1) {
                url.append("&");
            }
        }

        return url.toString();
    }
}
