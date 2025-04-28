package com.volcengine.auth;

public class CredentialValue {
    private String ak;
    private String sk;
    private String sessionToken;
    private String providerName;

    public CredentialValue(String ak, String sk, String sessionToken, String providerName) {
        this.ak = ak;
        this.sk = sk;
        this.sessionToken = sessionToken;
        this.providerName = providerName;
    }

    public String getAk() {
        return ak;
    }

    public String getSk() {
        return sk;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
}