package com.volcengine.feature.rds.auth;

import com.volcengine.sign.Credentials;
import com.volcengine.sign.VolcstackSign;

import org.apache.commons.lang.StringUtils;


import java.util.*;

/**
 * RDS MySQL database connection utility class
 */
public class ConnectUtils {

    private static final String SERVICE_NAME = "rds_mysql";
    private static final String ACTION = "ConnectDatabase";
    private static final String VERSION = "2022-01-01";
    private static final int DEFAULT_EXPIRES_SECONDS = 900; // 15 minutes

    /**
     * Generate an authorization token for database connection (used as password)
     *
     * @param credentials Credentials containing AccessKey and SecretKey for signing
     * @param region      Region, e.g., "cn-beijing"
     * @param dbUser      Database user account
     * @param instanceId  Database instance ID
     * @param expires     Expiration time in seconds, defaults to 900 seconds (15 minutes) if <= 0
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
        // Parameter validation
        if (credentials == null ||
                StringUtils.isEmpty(credentials.getAccessKey()) ||
                StringUtils.isEmpty(credentials.getSecretKey())) {
            throw new IllegalArgumentException("credentials must not be null and must contain valid access key and secret key");
        }

        if (StringUtils.isEmpty(region)) {
            throw new IllegalArgumentException("region must not be empty");
        }

        if (StringUtils.isEmpty(dbUser) || StringUtils.isEmpty(instanceId)) {
            throw new IllegalArgumentException("dbUser or instanceId must not be empty");
        }

        // Build query parameters
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("Action", ACTION);
        queryParams.put("Version", VERSION);
        queryParams.put("X-Expires", expires > 0 ? String.valueOf(expires) : String.valueOf(DEFAULT_EXPIRES_SECONDS));
        queryParams.put("DBUser", dbUser);
        queryParams.put("InstanceId", instanceId);

        // Create signature object
        VolcstackSign sign = new VolcstackSign(credentials);
        sign.setRegion(region);
        sign.setService(SERVICE_NAME);
        sign.setMethod("GET");

        // Generate presigned URL
        Map<String, String> presignedParams = sign.presign(queryParams);

        // Build complete URL
        return buildUrl(presignedParams);
    }

    /**
     * Build complete URL
     *
     * @param presignedParams Presigned query parameters
     * @return Complete URL string
     */
    private static String buildUrl(Map<String, String> presignedParams) {
        StringBuilder url = new StringBuilder();
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
