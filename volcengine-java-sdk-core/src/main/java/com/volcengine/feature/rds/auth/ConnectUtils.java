package com.volcengine.feature.rds.auth;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.Pair;
import com.volcengine.endpoint.ResolveEndpointOption;
import com.volcengine.endpoint.ResolvedEndpoint;
import com.volcengine.endpoint.StandardEndpointProvider;
import com.volcengine.interceptor.*;
import com.volcengine.sign.ServiceInfo;

import org.apache.commons.lang.StringUtils;

import java.util.*;

/**
 * RDS MySQL database connection utility class.
 * Generates a presigned URL that can be used as the authentication token (password) for database connections.
 */
public class ConnectUtils {

    private static final String SERVICE_NAME = "rds_mysql";
    private static final String ACTION = "ConnectDatabase";
    private static final String VERSION = "2022-01-01";
    private static final int DEFAULT_EXPIRES_SECONDS = 900; // 15 minutes

    /**
     * Generate an authorization token for database connection (used as password).
     * Aligned with Go SDK's BuildAuthToken implementation.
     *
     * @param apiClient  ApiClient containing Credentials, Region, DisableSSL, and UseDualStack settings
     * @param dbUser     Database user account
     * @param instanceId Database instance ID
     * @param expires    Expiration time in seconds, defaults to 900 seconds (15 minutes) if &lt;= 0
     * @return Presigned URL string that can be used as the authorization token for database connection
     * @throws ApiException if parameters are invalid or signing fails
     */
    public static String buildAuthToken(ApiClient apiClient, String dbUser, String instanceId, int expires) throws ApiException {
        // Parameter validation
        if (apiClient == null) {
            throw new IllegalArgumentException("apiClient must not be null");
        }

        if (StringUtils.isEmpty(apiClient.getRegion())) {
            throw new IllegalArgumentException("region must not be empty");
        }

        if (StringUtils.isEmpty(dbUser)) {
            throw new IllegalArgumentException("dbUser must not be empty");
        }

        if (StringUtils.isEmpty(instanceId)) {
            throw new IllegalArgumentException("instanceId must not be empty");
        }

        // Use default expires if <= 0
        if (expires <= 0) {
            expires = DEFAULT_EXPIRES_SECONDS;
        }

        // Resolve endpoint: prefer user-configured endpoint, fallback to StandardEndpointProvider
        String endpoint = getEndpoint(apiClient);

        // SSL handling, ResolveEndpointInterceptor dose not support this
        String schema = apiClient.getDisableSSL() ? "http" : "https";

        // Build InterceptorContext with presigned flag
        InterceptorContext context = new InterceptorContext(apiClient.getHttpClient(), null);
        context.setApiClient(apiClient);

        RequestInterceptorContext reqCtx = context.getRequestContext();
        reqCtx.setPresigned(true);
        reqCtx.setSchema(schema);
        reqCtx.setHost(endpoint);
        reqCtx.setMethod("GET");
        reqCtx.setServiceInfo(new ServiceInfo(SERVICE_NAME, "GET"));
        reqCtx.setHeaderParams(new HashMap<>());

        List<Pair> queryParams = new ArrayList<>();
        queryParams.add(new Pair("Action", ACTION));
        queryParams.add(new Pair("Version", VERSION));
        queryParams.add(new Pair("X-Expires", String.valueOf(expires)));
        queryParams.add(new Pair("DBUser", dbUser));
        queryParams.add(new Pair("InstanceId", instanceId));
        reqCtx.setQueryParams(queryParams);

        // Execute sign interceptor for presigning
        new SignRequestInterceptor().intercept(context);

        return reqCtx.getPresignedUrl();
    }

    /**
     * Resolve endpoint host from ApiClient.
     * If the user has configured a custom endpoint (via apiClient.setEndpoint), it takes priority.
     * Strips schema prefix if present to return pure host.
     * Falls back to StandardEndpointProvider for region-based resolution when no custom endpoint is set.
     *
     * @return endpoint host without schema
     */
    private static String getEndpoint(ApiClient apiClient) {
        if (StringUtils.isNotEmpty(apiClient.getEndpoint())) {
            String ep = apiClient.getEndpoint();
            if (ep.startsWith("https://")) {
                return ep.substring("https://".length());
            }
            if (ep.startsWith("http://")) {
                return ep.substring("http://".length());
            }
            return ep;
        }
        StandardEndpointProvider endpointProvider = new StandardEndpointProvider();
        ResolveEndpointOption option = new ResolveEndpointOption();
        option.setService(SERVICE_NAME);
        option.setRegion(apiClient.getRegion());
        option.setUseDualStack(apiClient.getUseDualStack());
        ResolvedEndpoint resolved = endpointProvider.endpointFor(option);
        return resolved.getEndpoint();
    }
}
