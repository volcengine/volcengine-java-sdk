package com.volcengine.auth;

import com.volcengine.ApiException;

public class EnvironmentVariableCredentialProvider implements Provider {

    private static final String PROVIDER_NAME = "EnvironmentVariableCredentialProvider";

    @Override
    public boolean isExpired() {
        return false;
    }

    @Override
    public void refresh() throws ApiException {
        // No-op: environment variable credentials do not expire.
    }

    @Override
    public CredentialValue retrieve() throws ApiException {
        String ak = getEnvWithFallback("VOLCENGINE_ACCESS_KEY", "VOLCSTACK_ACCESS_KEY_ID", "VOLCSTACK_ACCESS_KEY");
        String sk = getEnvWithFallback("VOLCENGINE_SECRET_KEY", "VOLCSTACK_SECRET_ACCESS_KEY", "VOLCSTACK_SECRET_KEY");
        String token = getEnvWithFallback("VOLCENGINE_SESSION_TOKEN", "VOLCSTACK_SESSION_TOKEN");

        if (isNullOrEmpty(ak) || isNullOrEmpty(sk)) {
            throw new ApiException(PROVIDER_NAME + ": required environment variables VOLCENGINE_ACCESS_KEY and "
                    + "VOLCENGINE_SECRET_KEY are not set");
        }

        return new CredentialValue(ak, sk, token, PROVIDER_NAME);
    }

    private static String getEnvWithFallback(String... names) {
        for (String name : names) {
            String value = System.getenv(name);
            if (value != null && !value.isEmpty()) {
                return value;
            }
        }
        return null;
    }

    private static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }
}
