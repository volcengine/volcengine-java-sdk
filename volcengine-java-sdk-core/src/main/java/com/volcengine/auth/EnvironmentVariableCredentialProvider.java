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
        String ak = getEnvWithFallback("VOLCSTACK_ACCESS_KEY_ID", "VOLCENGINE_ACCESS_KEY", "VOLCSTACK_ACCESS_KEY");
        String sk = getEnvWithFallback("VOLCSTACK_SECRET_ACCESS_KEY", "VOLCENGINE_SECRET_KEY", "VOLCSTACK_SECRET_KEY");
        String token = getEnvWithFallback("VOLCSTACK_SESSION_TOKEN", "VOLCENGINE_SESSION_TOKEN");

        if (isNullOrEmpty(ak) || isNullOrEmpty(sk)) {
            throw new ApiException(PROVIDER_NAME + ": required environment variables VOLCSTACK_ACCESS_KEY_ID and "
                    + "VOLCSTACK_SECRET_ACCESS_KEY are not set");
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
