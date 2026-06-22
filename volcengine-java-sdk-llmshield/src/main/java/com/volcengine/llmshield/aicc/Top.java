package com.volcengine.llmshield.aicc;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.format.DateTimeParseException;

enum Top {
    ;

    private static final Gson GSON = new Gson();
    private static final DateTimeFormatter ISO_OFFSET_DATE_TIME_FORMATTER =
            new DateTimeFormatterBuilder()
                    .parseCaseInsensitive()
                    .append(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
                    .toFormatter(Locale.ROOT);
    private static final Pattern BASIC_OFFSET_SUFFIX =
            Pattern.compile("([+-])(\\d{2})(\\d{2})?(\\d{2})?$");
    private static volatile StsCredentials cachedStsCredentials;
    private static volatile long cachedStsExpireTime;

    static class StsCredentials {
        @SerializedName("AccessKeyId")
        String accessKeyId;
        @SerializedName("SecretAccessKey")
        String secretAccessKey;
        @SerializedName("SessionToken")
        String sessionToken;
        @SerializedName("ExpiredTime")
        String expiredTime;
    }

    static class StsResult {
        @SerializedName("Credentials")
        StsCredentials credentials;
    }

    static class StsResponse {
        @SerializedName("Result")
        StsResult result;
    }

    static JsonObject requestTop(
            TopInfo topInfo, String action, Map<String, String> extraHeaders, byte[] body)
            throws IOException {
        extraHeaders = (extraHeaders == null) ? new HashMap<>() : extraHeaders;
        // 如果配置了aicc_saas_trn，先通过STS获取临时凭证
        if (topInfo.aiccSaasTrn != null && !topInfo.aiccSaasTrn.isEmpty()) {
            try {
                StsCredentials stsCred = getStsCredentials(topInfo);
                if (stsCred != null) {
                    topInfo.ak = stsCred.accessKeyId;
                    topInfo.sk = stsCred.secretAccessKey;
                    topInfo.stsToken = stsCred.sessionToken;
                    extraHeaders.put("X-Security-Token", stsCred.sessionToken);
                    extraHeaders.put("sts_token", stsCred.sessionToken);
                    if (topInfo.targetUid != null && !topInfo.targetUid.isEmpty()) {
                        extraHeaders.put("UID", topInfo.targetUid);
                    }
                }
            } catch (Exception e) {
                System.err.println("获取STS临时凭证失败: " + e.getMessage());
                throw new IOException("获取STS临时凭证失败", e);
            }
        }

        String query;
        try {
            query =
                    "Action="
                            + URLEncoder.encode(action, StandardCharsets.UTF_8.name())
                            + "&Version="
                            + URLEncoder.encode(topInfo.version, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            // Should not happen.
            throw new UnsupportedOperationException(e);
        }
        String urlString = topInfo.url + "/?" + query;
        URL url;
        try {
            url = URI.create(urlString).toURL();
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }

        Map<String, String> headers = Top.buildTopHeaders(topInfo, url, body);

        if (!topInfo.urlRewrite.isEmpty()) {
            try {
                url = URI.create(topInfo.urlRewrite + "?" + query).toURL();
            } catch (MalformedURLException e) {
                throw new IllegalArgumentException(e);
            }
            headers.put("Host", url.getHost());
        }

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        try {
            connection.setRequestMethod(topInfo.method);
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                connection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            for (Map.Entry<String, String> entry : extraHeaders.entrySet()) {
                connection.setRequestProperty(entry.getKey(), entry.getValue());
            }

            connection.setDoOutput(true);
            connection.getOutputStream().write(body);

            return Utils.responseJson(connection);
        } finally {
            connection.disconnect();
        }
    }

    /**
     * 通过STS AssumeRole获取临时凭证
     */
    private static StsCredentials getStsCredentials(TopInfo topInfo) throws Exception {
        long now = System.currentTimeMillis() / 1000;
        if (cachedStsCredentials != null && cachedStsExpireTime > now + 300) {
            return cachedStsCredentials;
        }

        String action = "AssumeRole";
        String version = "2018-01-01";
        String region = topInfo.region;
        String service = "sts";

        // 构造请求体
        Map<String, String> params = new TreeMap<>();
        params.put("DurationSeconds", "3600");
        params.put("RoleSessionName", "temp_");
        params.put("RoleTrn", topInfo.aiccSaasTrn);

        StringBuilder bodyBuilder = new StringBuilder();
        String sep = "";
        for (Map.Entry<String, String> entry : params.entrySet()) {
            bodyBuilder.append(sep)
                    .append(URLEncoder.encode(entry.getKey(), StandardCharsets.UTF_8.name()))
                    .append("=")
                    .append(URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8.name()));
            sep = "&";
        }
        byte[] body = bodyBuilder.toString().getBytes(StandardCharsets.UTF_8);

        // 构造URL
        String stsUrl = "https://sts.volcengineapi.com";
        String query = "Action=" + URLEncoder.encode(action, StandardCharsets.UTF_8.name())
                + "&Version=" + URLEncoder.encode(version, StandardCharsets.UTF_8.name());
        URL url = URI.create(stsUrl + "/?" + query).toURL();

        // 构造签名头
        Map<String, String> headers = buildStsHeaders(topInfo.ak, topInfo.sk, region, service, url, body);

        // 发送请求
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        try {
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                conn.setRequestProperty(entry.getKey(), entry.getValue());
            }
            conn.setDoOutput(true);
            conn.getOutputStream().write(body);

            int statusCode = conn.getResponseCode();
            if (statusCode != 200) {
                String errorResp = readAll(conn.getErrorStream() != null ? conn.getErrorStream() : conn.getInputStream());
                throw new IOException("STS请求失败，状态码: " + statusCode + ", 响应: " + errorResp);
            }

            String resp = readAll(conn.getInputStream());
            StsResponse stsResponse = GSON.fromJson(resp, StsResponse.class);
            if (stsResponse == null || stsResponse.result == null || stsResponse.result.credentials == null) {
                throw new IOException("STS响应格式错误: " + resp);
            }

            cachedStsCredentials = stsResponse.result.credentials;
            cachedStsExpireTime = parseIsoOffsetTime(stsResponse.result.credentials.expiredTime) / 1000;
            return cachedStsCredentials;
        } finally {
            conn.disconnect();
        }
    }

    private static String readAll(InputStream is) throws IOException {
        if (is == null) return "";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[8192];
        int n;
        while ((n = is.read(buffer)) != -1) {
            baos.write(buffer, 0, n);
        }
        return baos.toString(StandardCharsets.UTF_8.name());
    }

    /**
     * 构造STS请求的签名头
     */
    private static Map<String, String> buildStsHeaders(String ak, String sk, String region, String service, URL url, byte[] body) {
        Date now = new Date();
        String nowDateTime = formatUtc(now, "yyyyMMdd'T'HHmmss'Z'");
        String nowDate = formatUtc(now, "yyyyMMdd");

        String contentSha256 = sha256(body);

        Map<String, String> headers = new TreeMap<>();
        headers.put("Content-Type", "application/x-www-form-urlencoded");
        headers.put("Host", url.getHost());
        headers.put("X-Content-Sha256", contentSha256);
        headers.put("X-Date", nowDateTime);

        StringBuilder signedHeadersBuilder = new StringBuilder();
        String separator = "";
        for (String key : headers.keySet()) {
            signedHeadersBuilder.append(separator).append(key.toLowerCase(Locale.ROOT));
            separator = ";";
        }
        String signedHeaders = signedHeadersBuilder.toString();

        StringBuilder canonicalRequestBuilder = new StringBuilder();
        canonicalRequestBuilder
                .append("POST")
                .append('\n')
                .append("/")
                .append('\n')
                .append(url.getQuery())
                .append('\n');
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            canonicalRequestBuilder
                    .append(entry.getKey().toLowerCase(Locale.ROOT))
                    .append(':')
                    .append(entry.getValue())
                    .append('\n');
        }
        canonicalRequestBuilder
                .append('\n')
                .append(signedHeaders)
                .append('\n')
                .append(contentSha256);

        String hashedCanonicalRequest =
                sha256(canonicalRequestBuilder.toString().getBytes(StandardCharsets.UTF_8));

        String credentialScope = nowDate + '/' + region + '/' + service + "/request";
        String stringToSign = "HMAC-SHA256\n" + nowDateTime + '\n' + credentialScope + '\n' + hashedCanonicalRequest;

        String signature = hmacSha256(new String[]{sk, nowDate, region, service, "request", stringToSign});

        headers.put("Authorization",
                "HMAC-SHA256 Credential=" + ak + '/' + credentialScope
                        + ", SignedHeaders=" + signedHeaders
                        + ", Signature=" + signature);
        return headers;
    }

    private static Map<String, String> buildTopHeaders(TopInfo topInfo, URL url, byte[] body) {
        Date now = new Date();
        String nowDateTime = formatUtc(now, "yyyyMMdd'T'HHmmss'Z'");
        String nowDate = formatUtc(now, "yyyyMMdd");

        String contentSha256 = sha256(body);

        Map<String, String> headers = new TreeMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Host", url.getHost());
        headers.put("X-Content-Sha256", contentSha256);
        headers.put("X-Date", nowDateTime);

        StringBuilder signedHeadersBuilder = new StringBuilder();
        String sep = "";
        for (String key : headers.keySet()) {
            signedHeadersBuilder.append(sep).append(key.toLowerCase(Locale.ROOT));
            sep = ";";
        }
        String signedHeaders = signedHeadersBuilder.toString();

        StringBuilder canonicalRequestBuilder = new StringBuilder();
        canonicalRequestBuilder
                .append(topInfo.method)
                .append('\n')
                .append("/")
                .append('\n')
                .append(url.getQuery())
                .append('\n');
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            canonicalRequestBuilder
                    .append(entry.getKey().toLowerCase(Locale.ROOT))
                    .append(':')
                    .append(entry.getValue())
                    .append('\n');
        }
        canonicalRequestBuilder
                .append('\n')
                .append(signedHeaders)
                .append('\n')
                .append(contentSha256);

        String hashedCanonicalRequest =
                sha256(canonicalRequestBuilder.toString().getBytes(StandardCharsets.UTF_8));

        String credentialScope =
                nowDate + '/' + topInfo.region + '/' + topInfo.service + "/request";
        String stringToSign =
                "HMAC-SHA256\n"
                        + nowDateTime
                        + '\n'
                        + credentialScope
                        + '\n'
                        + hashedCanonicalRequest;

        String signature =
                hmacSha256(
                        new String[] {
                            topInfo.sk,
                            nowDate,
                            topInfo.region,
                            topInfo.service,
                            "request",
                            stringToSign
                        });

        headers.put(
                "Authorization",
                "HMAC-SHA256 Credential="
                        + topInfo.ak
                        + '/'
                        + credentialScope
                        + ", SignedHeaders="
                        + signedHeaders
                        + ", Signature="
                        + signature);
        return headers;
    }

    // Volcengine API gateway demands we use SHA-256.
    private static String sha256(byte[] data) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            return Utils.hex(digest.digest(data));
        } catch (NoSuchAlgorithmException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    // Volcengine API gateway demands we use HMAC-SHA-256.
    private static String hmacSha256(String[] data) {
        try {
            Mac hmac = Mac.getInstance("HmacSHA256");

            byte[] result = null;

            // Volcengine API gateway demands we use the digest as the next key for hashing multiple
            // fields.
            for (String d : data) {
                if (result == null) {
                    result = d.getBytes(StandardCharsets.UTF_8);
                } else {
                    result = hmac.doFinal(d.getBytes(StandardCharsets.UTF_8));
                }
                SecretKeySpec keySpec = new SecretKeySpec(result, "HmacSHA256");
                hmac.init(keySpec);
            }

            if (result == null) {
                throw new IllegalArgumentException("data is empty");
            }
            return Utils.hex(result);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    private static String formatUtc(Date date, String pattern) {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern, Locale.ROOT);
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        return formatter.format(date);
    }

    private static long parseIsoOffsetTime(String value) throws ParseException {
        String normalizedValue = normalizeIsoOffsetTime(value);
        try {
            return OffsetDateTime.parse(normalizedValue, ISO_OFFSET_DATE_TIME_FORMATTER)
                    .toInstant()
                    .toEpochMilli();
        } catch (DateTimeParseException e) {
            int errorIndex = e.getErrorIndex();
            throw new ParseException("Unparseable date: " + value, errorIndex >= 0 ? errorIndex : 0);
        }
    }

    private static String normalizeIsoOffsetTime(String value) {
        Matcher matcher = BASIC_OFFSET_SUFFIX.matcher(value);
        if (!matcher.find()) {
            return value;
        }
        String sign = matcher.group(1);
        String hours = matcher.group(2);
        String minutes = matcher.group(3);
        String seconds = matcher.group(4);
        StringBuilder normalizedOffset = new StringBuilder().append(sign).append(hours);
        if (minutes == null) {
            normalizedOffset.append(":00");
        } else {
            normalizedOffset.append(':').append(minutes);
            if (seconds != null) {
                normalizedOffset.append(':').append(seconds);
            }
        }
        return value.substring(0, matcher.start()) + normalizedOffset;
    }
}
