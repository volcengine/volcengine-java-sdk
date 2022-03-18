package com.volcengine.volcstack.sign;

import com.squareup.okhttp.RequestBody;
import com.volcengine.volcstack.Pair;
import com.volcengine.volcstack.auth.Authentication;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.*;

/**
 * @Author: xuyaming@bytedance.com
 * @Date: 2022/3/18 13:13
 */
public class VolcstackSign implements Authentication {


    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, RequestBody requestBody) {
        Map<String, String> params = new HashMap<>();
        for (Pair p: queryParams) {
            params.put(p.getName(),p.getValue());
        }
        try {
            signRequest(params,headerParams);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Credentials credentials;
    private String region;
    private String service;
    private String method;

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public VolcstackSign() {
    }

    public VolcstackSign(Credentials credentials){
        this.credentials = credentials;
    }

    private void signRequest( Map<String, String> queryParams, Map<String, String> headerParams)throws Exception{
        List<String> listHeaderKeys = new ArrayList<>(headerParams.keySet());
        List<String> listParamKeys = new ArrayList<>(queryParams.keySet());
        Collections.sort(listHeaderKeys);
        Collections.sort(listParamKeys);

        //
        String service = this.service;
        String region = this.region;
        String ak = this.credentials.getAccessKey();
        String sk = this.credentials.getSecretKey();

        //1.
        StringBuilder canonicalRequest = new StringBuilder();
        String httpRequestMethod = this.method;
        canonicalRequest.append(httpRequestMethod);
        canonicalRequest.append("\n");
        String canonicalURI = "/";
        canonicalRequest.append(canonicalURI);
        canonicalRequest.append("\n");
        String payload = "";
        StringBuilder canonicalQueryString= new StringBuilder();
        for (String key:listParamKeys){
            canonicalQueryString.append(key);
            canonicalQueryString.append("=");
            canonicalQueryString.append(URLEncoder.encode(queryParams.get(key), "UTF-8"));
            canonicalQueryString.append("&");
        }
        canonicalRequest.append(canonicalQueryString.substring(0,canonicalQueryString.length()-1));
        canonicalRequest.append("\n");

        StringBuilder canonicalHeaders = new StringBuilder("");
        StringBuilder signedHeaders = new StringBuilder("");
        for (String key:listHeaderKeys){
            canonicalHeaders.append(key.toLowerCase());
            canonicalHeaders.append(":");
            canonicalHeaders.append(headerParams.get(key));
            canonicalHeaders.append("\n");
            signedHeaders.append(key.toLowerCase());
            signedHeaders.append(";");
        }

        canonicalRequest.append(canonicalHeaders);
        canonicalRequest.append("\n");
        canonicalRequest.append(signedHeaders.substring(0,signedHeaders.length()-1));
        canonicalRequest.append("\n");
        canonicalRequest.append(getSHA256(payload));


        //2
        StringBuilder credentialScope = new StringBuilder("");
        credentialScope.append(headerParams.get("X-Date").substring(0,8));
        credentialScope.append("/");
        credentialScope.append(region);
        credentialScope.append("/");
        credentialScope.append(service);
        credentialScope.append("/request");
        StringBuilder stringToSign = new StringBuilder("");
        stringToSign.append("HMAC-SHA256");
        stringToSign.append("\n");
        stringToSign.append(headerParams.get("X-Date"));
        stringToSign.append("\n");
        stringToSign.append(credentialScope);
        stringToSign.append("\n");
        stringToSign.append(getSHA256(canonicalRequest.toString()));


        //3
        byte[] signingkeyByte= getHmacSHA256("request",getHmacSHA256(
                service,getHmacSHA256(
                        region,getHmacSHA256(
                                headerParams.get("X-Date").substring(0,8),sk.getBytes(StandardCharsets.UTF_8)))));
        String signature = getHmacSHA256Hex(stringToSign.toString(),signingkeyByte);
        StringBuilder authorization = new StringBuilder();
        authorization.append("HMAC-SHA256 Credential=");
        authorization.append(ak);
        authorization.append("/");
        authorization.append(credentialScope);
        authorization.append(", ");
        authorization.append("SignedHeaders=");
        authorization.append(signedHeaders.substring(0,signedHeaders.length()-1));
        authorization.append(", ");
        authorization.append("Signature=");
        authorization.append(signature);

        headerParams.put("Authorization",authorization.toString());
    }

    private String getSHA256(String str)throws Exception{
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
        return byte2Hex(messageDigest.digest());
    }

    private byte[] getHmacSHA256(String str,byte[] key)throws Exception{
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(key, "HmacSHA256");
        sha256_HMAC.init(secret_key);
        return sha256_HMAC.doFinal(str.getBytes(StandardCharsets.UTF_8));
    }

    private String getHmacSHA256Hex(String str,byte[] key)throws Exception{
        return byte2Hex(getHmacSHA256(str,key));
    }


    private String byte2Hex(byte[] bytes){
        StringBuilder sb = new StringBuilder();
        for(byte aByte:bytes){
            String temp = Integer.toHexString(aByte & 0xFF);
            if(temp.length() == 1){
                sb.append("0");
            }
            sb.append(temp);
        }
        return sb.toString();
    }
}

