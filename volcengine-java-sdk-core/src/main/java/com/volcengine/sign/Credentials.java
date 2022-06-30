package com.volcengine.sign;

/**
 * @Author: xuyaming@bytedance.com
 * @Date: 2022/3/18 13:12
 */
public class Credentials {
    private String accessKey;
    private String secretKey;
    private String sessionToken;

    private Credentials() {
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public static Credentials getEnvCredentials() {
        Credentials credentials = new Credentials();
        credentials.accessKey = System.getenv("Volcengine_ACCESS_KEY");
        credentials.secretKey = System.getenv("Volcengine_SECRET_KEY");
        credentials.sessionToken = System.getenv("Volcengine_SESSION_TOKEN");
        return credentials;
    }

    public static Credentials getCredentials(String accessKey, String secretKey) {
        return getCredentials(accessKey,secretKey,"");
    }

    public static Credentials getCredentials(String accessKey, String secretKey,String sessionToken) {
        Credentials credentials = new Credentials();
        credentials.accessKey = accessKey;
        credentials.secretKey = secretKey;
        credentials.sessionToken = sessionToken;
        return credentials;
    }
}
