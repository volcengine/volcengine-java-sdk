package com.volcengine.volcstack.sign;

import com.volcengine.volcstack.Pair;
import com.volcengine.volcstack.auth.Authentication;
import org.apache.commons.lang.StringUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author: xuyaming@bytedance.com
 * @Date: 2022/3/18 13:13
 */
public class VolcstackSign implements Authentication {

    private static final String CONST_ENCODE = "0123456789ABCDEF";
    private static final BitSet URL_ENCODER = new BitSet(256);

    static {
        int i;
        for (i = 97; i <= 122; ++i) {
            URL_ENCODER.set(i);
        }

        for (i = 65; i <= 90; ++i) {
            URL_ENCODER.set(i);
        }

        for (i = 48; i <= 57; ++i) {
            URL_ENCODER.set(i);
        }
        URL_ENCODER.set('-');
        URL_ENCODER.set('_');
        URL_ENCODER.set('.');
        URL_ENCODER.set('~');
    }

    private static class SignRequest {
        private StringBuilder canonicalRequest;
        private StringBuilder signedHeaders;
        private StringBuilder canonicalHeaders;
        private StringBuilder credentialScope;
        private StringBuilder stringToSign;
//        private StringBuilder authorization;
    }


    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, String payload) {
        Map<String, String> params = new HashMap<>();
        for (Pair p : queryParams) {
            params.put(p.getName(), p.getValue());
        }
        try {
            sign(params, headerParams,payload);
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

    public VolcstackSign(Credentials credentials) {
        this.credentials = credentials;
    }

    private List<String> sortParamKeys(Map<String, String> queryParams) {
        List<String> listParamKeys = new ArrayList<>(queryParams.keySet());
        Collections.sort(listParamKeys);
        return listParamKeys;
    }

    private List<String> sortHeaderKeys(Map<String, String> headerParams) {
        List<String> listHeaderKeys = new ArrayList<>(headerParams.keySet());
        Collections.sort(listHeaderKeys);
        return listHeaderKeys;
    }

    private void buildCredentialScope(Map<String, String> headerParams,SignRequest signRequest){
        StringBuilder credentialScope = new StringBuilder("");
        credentialScope.append(headerParams.get("X-Date").substring(0, 8));
        credentialScope.append("/");
        credentialScope.append(region);
        credentialScope.append("/");
        credentialScope.append(service);
        credentialScope.append("/request");
        signRequest.credentialScope = credentialScope;
    }

    private void buildStringToSign(Map<String, String> headerParams,SignRequest signRequest)throws Exception{
        StringBuilder stringToSign = new StringBuilder("");
        stringToSign.append("HMAC-SHA256");
        stringToSign.append("\n");
        stringToSign.append(headerParams.get("X-Date"));
        stringToSign.append("\n");
        stringToSign.append(signRequest.credentialScope);
        stringToSign.append("\n");
        stringToSign.append(getSHA256(signRequest.canonicalRequest.toString()));
        signRequest.stringToSign = stringToSign;
    }

    private void buildAuthorization(Map<String, String> headerParams,SignRequest signRequest)throws Exception{
        byte[] signingkeyByte = getHmacSHA256("request", getHmacSHA256(
                service, getHmacSHA256(
                        region, getHmacSHA256(
                                headerParams.get("X-Date").substring(0, 8), credentials.getSecretKey().getBytes(StandardCharsets.UTF_8)))));
        String signature = getHmacSHA256Hex(signRequest.stringToSign.toString(), signingkeyByte);
        StringBuilder authorization = new StringBuilder();

        authorization.append("HMAC-SHA256 Credential=");
        authorization.append(credentials.getAccessKey());
        authorization.append("/");
        authorization.append(signRequest.credentialScope);
        authorization.append(", ");
        authorization.append("SignedHeaders=");
        authorization.append(signRequest.signedHeaders.substring(0, signRequest.signedHeaders.length() - 1));
        authorization.append(", ");
        authorization.append("Signature=");
        authorization.append(signature);
        headerParams.put("Authorization", authorization.toString());
    }

    private void buildPayload(SignRequest signRequest, String payload) throws Exception {
        signRequest.canonicalRequest.append(signRequest.canonicalHeaders);
        signRequest.canonicalRequest.append("\n");
        signRequest.canonicalRequest.append(signRequest.signedHeaders.substring(0, signRequest.signedHeaders.length() - 1));
        signRequest.canonicalRequest.append("\n");
        signRequest.canonicalRequest.append(getSHA256(payload));
    }

    private void buildSignedHeaders(Map<String, String> headerParams, SignRequest signRequest) {
        //sort keys
        List<String> listHeaderKeys = sortHeaderKeys(headerParams);

        StringBuilder canonicalHeaders = new StringBuilder("");
        StringBuilder signedHeaders = new StringBuilder("");
        for (String key : listHeaderKeys) {
            canonicalHeaders.append(key.toLowerCase());
            canonicalHeaders.append(":");
            canonicalHeaders.append(headerParams.get(key));
            canonicalHeaders.append("\n");
            signedHeaders.append(key.toLowerCase());
            signedHeaders.append(";");
        }
        signRequest.canonicalHeaders = canonicalHeaders;
        signRequest.signedHeaders = signedHeaders;
    }

    private void initHeaders(Map<String,String> headerParams){
        if (!StringUtils.isEmpty(credentials.getSessionToken())){
            headerParams.put("X-Security-Token",credentials.getSessionToken());
        }
        if (!headerParams.containsKey("X-Date")) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
            sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
            headerParams.put("X-Date", sdf.format(new Date()));
        }
    }

    private void buildCanonicalRequest(Map<String, String> queryParams, SignRequest signRequest) throws Exception {
        //sort keys
        List<String> listParamKeys = sortParamKeys(queryParams);

        StringBuilder canonicalRequest = new StringBuilder();
        String httpRequestMethod = this.method;
        canonicalRequest.append(httpRequestMethod);
        canonicalRequest.append("\n");
        String canonicalURI = "/";
        canonicalRequest.append(canonicalURI);
        canonicalRequest.append("\n");
        StringBuilder canonicalQueryString = new StringBuilder();
        for (String key : listParamKeys) {
            canonicalQueryString.append(signStringEncoder(key));
            canonicalQueryString.append("=");
            canonicalQueryString.append(signStringEncoder(queryParams.get(key)));
            canonicalQueryString.append("&");
        }
        canonicalRequest.append(canonicalQueryString.substring(0, canonicalQueryString.length() - 1));
        canonicalRequest.append("\n");

        signRequest.canonicalRequest = canonicalRequest;
    }

    private void sign(Map<String, String> queryParams, Map<String, String> headerParams, String payload) throws Exception {

        SignRequest signRequest = new SignRequest();
        // initHeader
        initHeaders(headerParams);
        // step 1
        buildCanonicalRequest(queryParams, signRequest);
        buildSignedHeaders(headerParams,signRequest);
        buildPayload(signRequest,payload);

        // step 2
        buildCredentialScope(headerParams,signRequest);
        buildStringToSign(headerParams,signRequest);

        // step 3
        buildAuthorization(headerParams,signRequest);

    }

    private String getSHA256(String str) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
        return byte2Hex(messageDigest.digest());
    }

    private byte[] getHmacSHA256(String str, byte[] key) throws Exception {
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(key, "HmacSHA256");
        sha256_HMAC.init(secret_key);
        return sha256_HMAC.doFinal(str.getBytes(StandardCharsets.UTF_8));
    }

    private String getHmacSHA256Hex(String str, byte[] key) throws Exception {
        return byte2Hex(getHmacSHA256(str, key));
    }


    private String byte2Hex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte aByte : bytes) {
            String temp = Integer.toHexString(aByte & 0xFF);
            if (temp.length() == 1) {
                sb.append("0");
            }
            sb.append(temp);
        }
        return sb.toString();
    }

    private String signStringEncoder(String source) {
        if (source == null) {
            return null;
        }
        StringBuilder buf = new StringBuilder(source.length());
        ByteBuffer bb = StandardCharsets.UTF_8.encode(source);
        while (bb.hasRemaining()) {
            int b = bb.get() & 255;
            if (URL_ENCODER.get(b)) {
                buf.append((char) b);
            } else if (b == 32) {
                buf.append("%20");
            } else {
                buf.append("%");
                char hex1 = CONST_ENCODE.charAt(b >> 4);
                char hex2 = CONST_ENCODE.charAt(b & 15);
                buf.append(hex1);
                buf.append(hex2);
            }
        }

        return buf.toString();
    }
}

