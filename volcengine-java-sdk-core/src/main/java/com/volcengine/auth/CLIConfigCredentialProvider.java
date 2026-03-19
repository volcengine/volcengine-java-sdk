package com.volcengine.auth;

import com.volcengine.ApiException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class CLIConfigCredentialProvider implements Provider {

    private static final String PROVIDER_NAME = "CLIConfigCredentialProvider";

    private final String profileName;
    private volatile CredentialValue credentialValue;
    private volatile Provider delegate;

    public CLIConfigCredentialProvider() {
        this(null);
    }

    public CLIConfigCredentialProvider(String profileName) {
        this.profileName = profileName;
    }

    @Override
    public boolean isExpired() {
        if (delegate != null) {
            return delegate.isExpired();
        }
        return false;
    }

    @Override
    public void refresh() throws ApiException {
        if (delegate != null) {
            delegate.refresh();
        }
    }

    @Override
    public CredentialValue retrieve() throws ApiException {
        if (delegate != null) {
            return delegate.retrieve();
        }
        if (credentialValue != null) {
            return credentialValue;
        }
        return loadFromConfig();
    }

    private CredentialValue loadFromConfig() throws ApiException {
        Path configPath = resolveConfigPath();

        if (!Files.exists(configPath)) {
            throw new ApiException(PROVIDER_NAME + ": config file not found: " + configPath);
        }

        String content;
        try {
            content = new String(Files.readAllBytes(configPath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new ApiException(PROVIDER_NAME + ": failed to read config file: " + configPath + " - " + e.getMessage());
        }

        Gson gson = new Gson();
        Type mapType = new TypeToken<Map<String, Object>>() {}.getType();
        Map<String, Object> configMap;
        try {
            configMap = gson.fromJson(content, mapType);
        } catch (Exception e) {
            throw new ApiException(PROVIDER_NAME + ": failed to parse config JSON: " + e.getMessage());
        }

        if (configMap == null) {
            throw new ApiException(PROVIDER_NAME + ": config file is empty or invalid");
        }

        String profile = resolveProfile(configMap);

        @SuppressWarnings("unchecked")
        Map<String, Object> profiles = (Map<String, Object>) configMap.get("profiles");
        if (profiles == null) {
            throw new ApiException(PROVIDER_NAME + ": 'profiles' section not found in config");
        }

        @SuppressWarnings("unchecked")
        Map<String, Object> profileData = (Map<String, Object>) profiles.get(profile);
        if (profileData == null) {
            throw new ApiException(PROVIDER_NAME + ": profile '" + profile + "' not found in config");
        }

        String mode = getStringValue(profileData, "mode");
        if (mode == null) {
            mode = "";
        }

        switch (mode) {
            case "":
            case "AK": {
                String ak = getStringValue(profileData, "access-key");
                String sk = getStringValue(profileData, "secret-key");
                String sessionToken = getStringValue(profileData, "session-token");

                if (isNullOrEmpty(ak) || isNullOrEmpty(sk)) {
                    throw new ApiException(PROVIDER_NAME + ": access-key and secret-key not found in profile '" + profile + "'");
                }

                credentialValue = new CredentialValue(ak, sk, sessionToken, PROVIDER_NAME);
                return credentialValue;
            }
            case "StsToken": {
                String ak = getStringValue(profileData, "access-key");
                String sk = getStringValue(profileData, "secret-key");
                String sessionToken = getStringValue(profileData, "session-token");

                if (isNullOrEmpty(ak) || isNullOrEmpty(sk) || isNullOrEmpty(sessionToken)) {
                    throw new ApiException(PROVIDER_NAME + ": access-key, secret-key and session-token are all required for StsToken mode in profile '" + profile + "'");
                }

                credentialValue = new CredentialValue(ak, sk, sessionToken, PROVIDER_NAME);
                return credentialValue;
            }
            case "RamRoleArn": {
                String ak = getStringValue(profileData, "access-key");
                String sk = getStringValue(profileData, "secret-key");
                String roleName = getStringValue(profileData, "role-name");
                String accountId = getStringValue(profileData, "account-id");

                if (isNullOrEmpty(ak) || isNullOrEmpty(sk)) {
                    throw new ApiException(PROVIDER_NAME + ": access-key and secret-key are required for RamRoleArn mode in profile '" + profile + "'");
                }
                if (isNullOrEmpty(roleName) || isNullOrEmpty(accountId)) {
                    throw new ApiException(PROVIDER_NAME + ": role-name and account-id are required for RamRoleArn mode in profile '" + profile + "'");
                }

                delegate = new StsAssumeRoleProvider(ak, sk, roleName, accountId);
                return delegate.retrieve();
            }
            case "OIDC": {
                String oidcTokenFile = getStringValue(profileData, "oidc-token-file");
                String roleTrn = getStringValue(profileData, "role-trn");

                if (isNullOrEmpty(oidcTokenFile) || isNullOrEmpty(roleTrn)) {
                    throw new ApiException(PROVIDER_NAME + ": oidc-token-file and role-trn are required for OIDC mode in profile '" + profile + "'");
                }

                delegate = new OidcCredentialProvider(roleTrn, null, oidcTokenFile, null, null);
                return delegate.retrieve();
            }
            case "EcsRole": {
                String roleName = getStringValue(profileData, "role-name");

                delegate = EcsRoleCredentialProvider.create(roleName);
                return delegate.retrieve();
            }
            default:
                throw new ApiException(PROVIDER_NAME + ": unsupported mode: " + mode);
        }
    }

    private Path resolveConfigPath() {
        String envPath = System.getenv("VOLCENGINE_CLI_CONFIG_FILE");
        if (!isNullOrEmpty(envPath)) {
            return Paths.get(envPath);
        }
        String home = System.getProperty("user.home");
        return Paths.get(home, ".volcengine", "config.json");
    }

    private String resolveProfile(Map<String, Object> configMap) {
        // Priority: constructor param > env var > "current" field in config
        if (!isNullOrEmpty(profileName)) {
            return profileName;
        }
        String envProfile = System.getenv("VOLCENGINE_PROFILE");
        if (!isNullOrEmpty(envProfile)) {
            return envProfile;
        }
        String fallbackProfile = System.getenv("VOLCSTACK_PROFILE");
        if (!isNullOrEmpty(fallbackProfile)) {
            return fallbackProfile;
        }
        Object current = configMap.get("current");
        if (current instanceof String && !((String) current).isEmpty()) {
            return (String) current;
        }
        return "default";
    }

    private static String getStringValue(Map<String, Object> map, String key) {
        Object value = map.get(key);
        if (value instanceof String) {
            String s = (String) value;
            return s.isEmpty() ? null : s;
        }
        return null;
    }

    private static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }
}
