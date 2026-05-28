package com.bytedance.jeddak_secure_channel;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;

enum Utils {
    ;

    static byte[] responseBytes(HttpURLConnection connection) throws IOException {
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        try {
            InputStream inputStream = connection.getInputStream();
            int len;
            byte[] buffer = new byte[1024];
            while ((len = inputStream.read(buffer)) != -1) {
                byteArray.write(buffer, 0, len);
            }
        } catch (IOException e) {
            printResponseError(connection);
            throw e;
        }
        return byteArray.toByteArray();
    }

    static JsonObject responseJson(HttpURLConnection connection) throws IOException {
        JsonObject results;
        try {
            Reader reader =
                    new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8);
            results = JsonParser.parseReader(reader).getAsJsonObject();
        } catch (IOException e) {
            printResponseError(connection);
            throw e;
        }

        return results.getAsJsonObject("Result");
    }

    private static void printResponseError(HttpURLConnection connection) throws IOException {
        System.err.println(connection.getResponseCode());
        InputStream errorStream = connection.getErrorStream();
        if (errorStream != null) {
            int errorLen;
            byte[] buffer = new byte[1024];
            while ((errorLen = errorStream.read(buffer)) != -1) {
                System.err.write(buffer, 0, errorLen);
            }
        }
    }

    static String hex(byte[] data) {
        final byte[] HEX_CHARS = "0123456789abcdef".getBytes(StandardCharsets.US_ASCII);
        byte[] hex = new byte[data.length * 2];
        for (int j = 0; j < data.length; ++j) {
            int v = data[j] & 0xFF;
            hex[j * 2] = HEX_CHARS[v >>> 4];
            hex[j * 2 + 1] = HEX_CHARS[v & 0xF];
        }
        return new String(hex, StandardCharsets.US_ASCII);
    }

    static byte[] unwrapBytesBuffer(ByteBuffer buffer) {
        byte[] copy = new byte[buffer.remaining()];
        buffer.get(copy);
        return copy;
    }

    static byte[] pemToDer(String pem, String header) {
        String contents =
                pem.replace("-----BEGIN " + header + "-----", "")
                        .replace("-----END " + header + "-----", "")
                        .replaceAll("\\s+", "");
        return Base64.getDecoder().decode(contents);
    }

    static byte[] pkcs1ToPkcs8(byte[] pkcs1) {
        // https://stackoverflow.com/a/76766993
        byte[] result = new byte[pkcs1.length + 26];
        System.arraycopy(
                Base64.getDecoder().decode("MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKY="),
                0,
                result,
                0,
                26);
        System.arraycopy(BigInteger.valueOf(result.length - 4).toByteArray(), 0, result, 2, 2);
        System.arraycopy(BigInteger.valueOf(pkcs1.length).toByteArray(), 0, result, 24, 2);
        System.arraycopy(pkcs1, 0, result, 26, pkcs1.length);
        return result;
    }

    static String keyToPem(Key key, String header) {
        String contents = Base64.getEncoder().encodeToString(key.getEncoded());
        StringBuilder sb = new StringBuilder();
        sb.append("-----BEGIN ").append(header).append("-----\n");
        for (int i = 0; i < contents.length(); i += 64) {
            sb.append(contents, i, Math.min(i + 64, contents.length())).append('\n');
        }
        sb.append("-----END ").append(header).append("-----\n");
        return sb.toString();
    }

    static String bytesToString(ByteBuffer bytes) {
        return new String(
                bytes.array(),
                bytes.arrayOffset() + bytes.position(),
                bytes.remaining(),
                StandardCharsets.UTF_8);
    }
}
