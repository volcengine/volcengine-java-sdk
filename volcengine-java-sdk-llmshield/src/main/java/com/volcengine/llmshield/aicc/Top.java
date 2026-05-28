package com.bytedance.jeddak_secure_channel;

import com.google.gson.JsonObject;

import org.jspecify.annotations.Nullable;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

enum Top {
    ;

    static JsonObject requestTop(
            TopInfo topInfo, String action, @Nullable Map<String, String> extraHeaders, byte[] body)
            throws IOException {
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
            if (extraHeaders != null) {
                for (Map.Entry<String, String> entry : extraHeaders.entrySet()) {
                    connection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }

            connection.setDoOutput(true);
            connection.getOutputStream().write(body);

            return Utils.responseJson(connection);
        } finally {
            connection.disconnect();
        }
    }

    private static Map<String, String> buildTopHeaders(TopInfo topInfo, URL url, byte[] body) {
        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);
        String nowDateTime = now.format(DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'"));
        String nowDate = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));

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
                .append(url.getPath())
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
}
