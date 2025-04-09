package com.volcengine.auth;

import com.volcengine.*;
import com.volcengine.sign.Credentials;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public class StsAssumeRoleProvider implements Provider {
    private String accessKey;
    private String securityKey;
    private String roleName;
    private String accountId;
    private String host = "sts.volcengineapi.com";
    private String region = "cn-north-1";
    private String schema = "https";
    //STS 请求过期时间
    private int timeout = 30;
    //STS过期时间，单位秒
    private int durationSeconds = 3600;

    private int expireBufferSeconds = 60;

    private CredentialValue credentialValue;

    private long expirationTime;

    private ApiClient apiClient;


    public StsAssumeRoleProvider(String accessKey, String securityKey, String roleName, String accountId) {
        this.accessKey = accessKey;
        this.securityKey = securityKey;
        this.roleName = roleName;
        this.accountId = accountId;
        this.apiClient = new ApiClient()
                .setEndpoint(this.host)
                .setCredentials(Credentials.getCredentials(accessKey, securityKey))
                .setRegion(this.region);
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        this.apiClient.getCredentials().setAccessKey(accessKey);
    }

    public String getSecurityKey() {
        return securityKey;
    }

    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
        this.apiClient.getCredentials().setSecretKey(securityKey);

    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
        this.apiClient.setEndpoint(host);
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
        this.apiClient.setRegion(region);
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
        this.apiClient.setDisableSSL(schema.equals("https"));
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public int getExpireBufferSeconds() {
        return expireBufferSeconds;
    }

    public void setExpireBufferSeconds(int expireBufferSeconds) {
        this.expireBufferSeconds = expireBufferSeconds;
    }

    public CredentialValue getCredentialValue() {
        return credentialValue;
    }

    public void setCredentialValue(CredentialValue credentialValue) {
        this.credentialValue = credentialValue;
    }

    public long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(long expirationTime) {
        this.expirationTime = expirationTime;
    }

    public CredentialValue retrieve() throws ApiException {
        if (isExpired()) {
            refresh();
        }
        return credentialValue;
    }

    public boolean isExpired() {
        return System.currentTimeMillis() / 1000 > expirationTime;
    }

    public void refresh() throws ApiException {
        UniversalApi api = new UniversalApi(apiClient);
        UniversalRequest request = new UniversalRequest("sts", "AssumeRole", "2018-01-01", HttpMethod.GET, ContentType.Default);
        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("DurationSeconds", this.durationSeconds);
        requestMap.put("RoleSessionName", UUID.randomUUID().toString());
        requestMap.put("RoleTrn", String.format("trn:iam::%s:role/%s", accountId, roleName));
        long now = System.currentTimeMillis() / 1000;
        ApiResponse<Map<String, Object>> apiResponse = api.doCallWithHttpInfo(request, requestMap);
        if (apiResponse.getStatusCode() == 200) {
            Map<String, Object> responseData = apiResponse.getData();
            try {
                if (responseData != null) {
                    if (responseData.get("ResponseMetadata") != null) {
                        Map<String, Object> responseMetadata = (Map<String, Object>) responseData.get("ResponseMetadata");
                        if (responseMetadata.get("Error") != null) {
                            throw new ApiException("StsAssumeRole request return Error");
                        }
                    }
                    if (responseData.get("Result") != null) {
                        Map<String, Object> resultMap = (Map<String, Object>) responseData.get("Result");
                        Object credentials = resultMap.get("Credentials");
                        Map<String, Object> credentialMap = (Map<String, Object>) credentials;
                        String accessKey = (String) credentialMap.get("AccessKeyId");
                        String secretAccessKey = (String) credentialMap.get("SecretAccessKey");
                        String sessionToken = (String) credentialMap.get("SessionToken");
                        this.credentialValue = new CredentialValue(accessKey, secretAccessKey, sessionToken, "StsCredentialProvider");
                        this.expirationTime = now + durationSeconds - expireBufferSeconds;
                        return;
                    } else {
                        throw new ApiException("StsAssumeRole request return Error");

                    }
                }
            } catch (Exception e) {
                throw new ApiException("StsAssumeRole Provider Error", apiResponse.getStatusCode(),
                        apiResponse.getHeaders(), this.apiClient.getJSON().serialize(apiResponse.getData()));
            }

        }
        throw new ApiException("StsAssumeRole Provider Error", apiResponse.getStatusCode(),
                apiResponse.getHeaders(), this.apiClient.getJSON().serialize(apiResponse.getData()));

    }
}
