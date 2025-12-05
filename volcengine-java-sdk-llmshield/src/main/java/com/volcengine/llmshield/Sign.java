package com.volcengine.llmshield;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.util.EntityUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.net.URLEncoder;

/**
 * Copyright (year) Beijing Volcano Engine Technology Ltd.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class Sign {
    // 常量定义
    private static final String SERVICE_CODE_DEV = "llmshield_dev";
    private static final String SERVICE_CODE_ONLINE = "llmshield";

    private static final String VERSION = "2025-08-31";
    private static final BitSet URLENCODER = new BitSet(256);
    private static final String CONST_ENCODE = "0123456789ABCDEF";
    public static final Charset UTF_8 = StandardCharsets.UTF_8;
    // 默认 Content-Type（可根据实际需求调整，若请求体为 JSON 可改为 application/json）
    private static final String DEFAULT_CONTENT_TYPE = "application/json";

    private static boolean isModified = false; //记录是否已修改过
    private static String SERVICE = SERVICE_CODE_ONLINE;

    // 静态初始化 URL 编码允许的字符（复用原逻辑）
    static {
        int i;
        for (i = 97; i <= 122; ++i) {
            URLENCODER.set(i);
        }

        for (i = 65; i <= 90; ++i) {
            URLENCODER.set(i);
        }

        for (i = 48; i <= 57; ++i) {
            URLENCODER.set(i);
        }
        URLENCODER.set('-');
        URLENCODER.set('_');
        URLENCODER.set('.');
        URLENCODER.set('~');
    }

    public static synchronized void setServiceDev(boolean IsDev) {
        if (!isModified) {
            if (IsDev) {
                SERVICE = SERVICE_CODE_DEV;
            } else {
                SERVICE = SERVICE_CODE_ONLINE;
            }
            isModified = true;
        }
    }

    public static String getServiceCode() {
        return SERVICE;
    }

    /**
     * 核心加签方法：为 HttpPost 请求添加火山引擎 API 签名
     *
     * @param httpPost 待加签的 HttpPost 请求（需提前设置请求体，若有）
     * @param uri      请求的 URI（包含 host、path、query 参数，如 https://iam.volcengineapi.com/?Limit=1）
     * @param action   请求方法
     * @param ak       访问密钥 AK
     * @param sk       密钥 SK
     * @param region   地域（如 cn-beijing，需与 API 所属地域一致）
     * @throws Exception 加签过程中异常（如加密算法异常、请求体读取异常）
     */
    public void DoSignRequest(HttpPost httpPost, URI uri, String action, String ak, String sk,
                              String region) throws Exception{
        String method = httpPost.getMethod();
        String path = uri.getPath();
        String host = uri.getHost();

        byte[] body = EntityUtils.toByteArray(httpPost.getEntity());
        LocalDateTime date = LocalDateTime.now(ZoneId.of("GMT"));

        if (body == null) {
            body = new byte[0];
        }
        String xContentSha256 = hashSHA256(body);
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'");
        String xDate = sdf.format(date);
        String shortXDate = xDate.substring(0, 8);
        String contentType = DEFAULT_CONTENT_TYPE ;

        String signHeader = "host;x-date;x-content-sha256;content-type";


        String canonicalStringBuilder = method + "\n" +
                path + "\n" +
                "Action=" + action + "&Version=" + VERSION + "\n" +
                "host:" + host + "\n" +
                "x-date:" + xDate + "\n" +
                "x-content-sha256:" + xContentSha256 + "\n" +
                "content-type:" + contentType + "\n" +
                "\n" +
                signHeader + "\n" +
                xContentSha256;

//        System.out.println(canonicalStringBuilder);

        String hashcanonicalString = hashSHA256(canonicalStringBuilder.getBytes());
        String credentialScope = shortXDate + "/" + region + "/" + SERVICE + "/request";
        String signString = "HMAC-SHA256" + "\n" + xDate + "\n" + credentialScope + "\n" + hashcanonicalString;

        byte[] signKey = genSigningSecretKeyV4(sk, shortXDate, region, SERVICE);
        byte[] hmacBytes = hmacSHA256(signKey, signString);
        String signature = bytesToHex(hmacBytes);

        // 设置请求头
        httpPost.setHeader("X-Top-Service", SERVICE);
        httpPost.setHeader("X-Top-Region", region);
        httpPost.setHeader("Host", host);
        httpPost.setHeader("X-Date", xDate);
        httpPost.setHeader("X-Content-Sha256", xContentSha256);
        httpPost.setHeader("Content-Type", contentType);
        httpPost.setHeader("Authorization",
                "HMAC-SHA256 Credential=" + ak + "/" + credentialScope +
                        ", SignedHeaders=" + signHeader +
                        ", Signature=" + signature);
    }

    private String signStringEncoder(String source) {
        if (source == null) {
            return null;
        }
        StringBuilder buf = new StringBuilder(source.length());
        ByteBuffer bb = UTF_8.encode(source);
        while (bb.hasRemaining()) {
            int b = bb.get() & 255;
            if (URLENCODER.get(b)) {
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

    public static String hashSHA256(byte[] content) throws Exception {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            return bytesToHex(md.digest(content));

        } catch (Exception e) {
            throw new Exception(
                    "Unable to compute hash while signing request: "
                            + e.getMessage(), e);
        }
    }

    public static byte[] hmacSHA256(byte[] key, String content) throws Exception {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(key, "HmacSHA256"));
            return mac.doFinal(content.getBytes());
        } catch (Exception e) {
            throw new Exception(
                    "Unable to calculate a request signature: "
                            + e.getMessage(), e);
        }
    }

    private byte[] genSigningSecretKeyV4(String secretKey, String date, String region, String service) throws Exception {
        byte[] kDate = hmacSHA256((secretKey).getBytes(), date);
        byte[] kRegion = hmacSHA256(kDate, region);
        byte[] kService = hmacSHA256(kRegion, service);
        return hmacSHA256(kService, "request");
    }

    // 手动实现字节数组转十六进制字符串的工具方法
    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            // 将字节转为无符号整数（0~255）
            int value = b & 0xFF;
            // 转为十六进制字符串（不足两位补0）
            String hex = Integer.toHexString(value);
            if (hex.length() == 1) {
                sb.append('0'); // 补0，确保两位
            }
            sb.append(hex);
        }
        return sb.toString();
    }
}