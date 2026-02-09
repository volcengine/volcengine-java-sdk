package com.volcengine.feature.rds.auth;

import com.volcengine.ApiClient;
import com.volcengine.endpoint.DefaultEndpointProvider;
import com.volcengine.sign.Credentials;
import com.volcengine.sign.VolcstackSign;

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
     * Extracts credentials, region, and disableSSL from the ApiClient, similar to Go SDK's Config.
     *
     * @param apiClient  ApiClient containing Credentials, Region, and DisableSSL settings
     * @param dbUser     Database user account
     * @param instanceId Database instance ID
     * @param expires    Expiration time in seconds, defaults to 900 seconds (15 minutes) if &lt;= 0
     * @return Presigned URL string that can be used as the authorization token for database connection
     * @throws Exception if parameters are invalid or signing fails
     */
    public static String buildAuthToken(
            ApiClient apiClient,
            String dbUser,
            String instanceId,
            int expires
    ) throws Exception {
        if (apiClient == null) {
            throw new IllegalArgumentException("apiClient must not be null");
        }
        return buildAuthToken(apiClient.getCredentials(), apiClient.getRegion(),
                dbUser, instanceId, expires, apiClient.getDisableSSL());
    }

    /**
     * Generate an authorization token for database connection (used as password).
     * Uses HTTPS by default.
     *
     * @param credentials Credentials containing AccessKey and SecretKey for signing
     * @param region      Region, e.g., "cn-beijing"
     * @param dbUser      Database user account
     * @param instanceId  Database instance ID
     * @param expires     Expiration time in seconds, defaults to 900 seconds (15 minutes) if &lt;= 0
     * @return Presigned URL string that can be used as the authorization token for database connection
     * @throws Exception if parameters are invalid or signing fails
     */
    public static String buildAuthToken(
            Credentials credentials,
            String region,
            String dbUser,
            String instanceId,
            int expires
    ) throws Exception {
        return buildAuthToken(credentials, region, dbUser, instanceId, expires, false);
    }

    /**
     * Generate an authorization token for database connection (used as password).
     *
     * @param credentials Credentials containing AccessKey and SecretKey for signing
     * @param region      Region, e.g., "cn-beijing"
     * @param dbUser      Database user account
     * @param instanceId  Database instance ID
     * @param expires     Expiration time in seconds, defaults to 900 seconds (15 minutes) if &lt;= 0
     * @param disableSSL  If true, use http:// scheme; otherwise use https://
     * @return Presigned URL string that can be used as the authorization token for database connection
     * @throws Exception if parameters are invalid or signing fails
     */
    public static String buildAuthToken(
            Credentials credentials,
            String region,
            String dbUser,
            String instanceId,
            int expires,
            boolean disableSSL
    ) throws Exception {
        // Parameter validation
        if (credentials == null ||
                StringUtils.isEmpty(credentials.getAccessKey()) ||
                StringUtils.isEmpty(credentials.getSecretKey())) {
            throw new IllegalArgumentException("credentials must not be null and must contain valid access key and secret key");
        }

        if (StringUtils.isEmpty(region)) {
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

        // Build regional endpoint
        String endpoint = DefaultEndpointProvider.getRegionalEndpoint(SERVICE_NAME, region);

        // Build query parameters
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("Action", ACTION);
        queryParams.put("Version", VERSION);
        queryParams.put("X-Expires", String.valueOf(expires));
        queryParams.put("DBUser", dbUser);
        queryParams.put("InstanceId", instanceId);

        // Create signature object
        VolcstackSign sign = new VolcstackSign(credentials);
        sign.setRegion(region);
        sign.setService(SERVICE_NAME);
        sign.setMethod("GET");

        // Generate presigned URL with host signing
        Map<String, String> presignedParams = sign.presign(queryParams, endpoint);

        // Build complete URL
        String scheme = disableSSL ? "http" : "https";
        return buildUrl(scheme, endpoint, presignedParams);
    }

    /**
     * Build complete URL with scheme, host, and query parameters.
     *
     * @param scheme          URL scheme ("http" or "https")
     * @param endpoint        Host endpoint (e.g., "rds-mysql.cn-beijing.volcengineapi.com")
     * @param presignedParams Presigned query parameters
     * @return Complete URL string
     */
    private static String buildUrl(String scheme, String endpoint, Map<String, String> presignedParams) {
        StringBuilder url = new StringBuilder();
        url.append(scheme).append("://").append(endpoint).append("?");

        // Sort parameter keys
        List<String> keys = new ArrayList<>(presignedParams.keySet());
        Collections.sort(keys);

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = presignedParams.get(key);
            url.append(key).append("=").append(value);
            if (i < keys.size() - 1) {
                url.append("&");
            }
        }

        return url.toString();
    }
}
