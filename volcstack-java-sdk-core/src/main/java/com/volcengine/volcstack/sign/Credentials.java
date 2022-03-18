package com.volcengine.volcstack.sign;

/**
 * @Author: xuyaming@bytedance.com
 * @Date: 2022/3/18 13:12
 */
public class Credentials {
    private String accessKey;
    private String secretKey;

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

    public static Credentials getEnvCredentials() {
        Credentials credentials = new Credentials();
        credentials.accessKey = System.getenv("VOLCSTACK_ACCESS_KEY");
        credentials.secretKey = System.getenv("VOLCSTACK_SECRET_KEY");
        return credentials;
    }

    public static Credentials getCredentials(String accessKey, String secretKey) {
        Credentials credentials = new Credentials();
        credentials.accessKey = accessKey;
        credentials.secretKey = secretKey;
        return credentials;
    }
}
