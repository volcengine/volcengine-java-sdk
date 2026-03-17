package com.volcengine.auth;

import com.volcengine.ApiException;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class SharedCredentialsProvider implements Provider {

    private static final String PROVIDER_NAME = "SharedCredentialsProvider";

    private final String profileName;
    private volatile CredentialValue credentialValue;

    public SharedCredentialsProvider() {
        this(null);
    }

    public SharedCredentialsProvider(String profileName) {
        this.profileName = profileName;
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    @Override
    public void refresh() throws ApiException {
        // No-op: shared credentials file provides static credentials.
    }

    @Override
    public CredentialValue retrieve() throws ApiException {
        if (credentialValue != null) {
            return credentialValue;
        }
        credentialValue = loadFromFile();
        return credentialValue;
    }

    private CredentialValue loadFromFile() throws ApiException {
        Path credentialsPath = resolveCredentialsPath();

        if (!Files.exists(credentialsPath)) {
            throw new ApiException(PROVIDER_NAME + ": credentials file not found: " + credentialsPath);
        }

        String profile = resolveProfile();
        Map<String, String> section = parseIniSection(credentialsPath, profile);

        if (section == null) {
            throw new ApiException(PROVIDER_NAME + ": profile '" + profile + "' not found in " + credentialsPath);
        }

        String ak = section.get("volcstack_access_key_id");
        String sk = section.get("volcstack_secret_access_key");
        String sessionToken = section.get("volcstack_session_token");

        if (isNullOrEmpty(ak) || isNullOrEmpty(sk)) {
            throw new ApiException(PROVIDER_NAME + ": volcstack_access_key_id and volcstack_secret_access_key "
                    + "not found in profile '" + profile + "'");
        }

        return new CredentialValue(ak, sk, sessionToken, PROVIDER_NAME);
    }

    private Path resolveCredentialsPath() {
        String envPath = System.getenv("VOLCSTACK_SHARED_CREDENTIALS_FILE");
        if (!isNullOrEmpty(envPath)) {
            return Paths.get(envPath);
        }
        String home = System.getProperty("user.home");
        return Paths.get(home, ".volcengine", "credentials");
    }

    private String resolveProfile() {
        // Priority: constructor param > env var > "default"
        if (!isNullOrEmpty(profileName)) {
            return profileName;
        }
        String envProfile = System.getenv("VOLCSTACK_PROFILE");
        if (!isNullOrEmpty(envProfile)) {
            return envProfile;
        }
        return "default";
    }

    /**
     * Simple INI parser that reads a specific section from a file.
     * Section headers are lines like [section_name].
     * Key-value pairs are lines like key = value.
     */
    private static Map<String, String> parseIniSection(Path filePath, String targetSection) throws ApiException {
        Map<String, String> result = null;
        String currentSection = null;

        try (BufferedReader reader = Files.newBufferedReader(filePath, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty() || line.startsWith("#") || line.startsWith(";")) {
                    continue;
                }
                if (line.startsWith("[") && line.endsWith("]")) {
                    currentSection = line.substring(1, line.length() - 1).trim();
                    if (currentSection.equals(targetSection) && result == null) {
                        result = new HashMap<>();
                    }
                    continue;
                }
                if (targetSection.equals(currentSection) && result != null) {
                    int eqIndex = line.indexOf('=');
                    if (eqIndex > 0) {
                        String key = line.substring(0, eqIndex).trim();
                        String value = line.substring(eqIndex + 1).trim();
                        result.put(key, value);
                    }
                }
            }
        } catch (IOException e) {
            throw new ApiException(PROVIDER_NAME + ": failed to read credentials file: " + filePath + " - " + e.getMessage());
        }

        return result;
    }

    private static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }
}
