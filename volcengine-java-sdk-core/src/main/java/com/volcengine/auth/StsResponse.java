package com.volcengine.auth;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.volcengine.ApiException;
import com.volcengine.ErrorUtils;
import com.volcengine.ResponseDetails;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/** A single STS attempt, retained after closing the response stream. */
final class StsResponse {
    final ResponseDetails details;
    final String body;
    private final boolean simpleError;

    StsResponse(ResponseDetails details, String body) {
        this(details, body, false);
    }

    StsResponse(ResponseDetails details, String body, boolean simpleError) {
        this.details = details;
        this.body = body;
        this.simpleError = simpleError;
    }

    static StsResponse read(InputStream stream, ResponseDetails metadata) throws ApiException {
        return read(stream, metadata, false);
    }

    static StsResponse read(InputStream stream, ResponseDetails metadata, boolean simpleError) throws ApiException {
        return read(stream, metadata, simpleError, -1);
    }

    static StsResponse read(InputStream stream, ResponseDetails metadata, boolean simpleError,
                            long expectedLength) throws ApiException {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        try (InputStream input = stream) {
            if (input != null) {
                byte[] chunk = new byte[8192];
                int count;
                while ((count = input.read(chunk)) != -1) bytes.write(chunk, 0, count);
            }
            if (expectedLength >= 0 && bytes.size() != expectedLength) {
                throw new EOFException("STS Content-Length " + expectedLength
                        + " differs from received bytes " + bytes.size());
            }
        } catch (IOException cause) {
            StsResponse response = captured(metadata, bytes.toByteArray(), false, simpleError);
            throw response.error("Failed to read STS response", cause, "ReadError");
        }
        return captured(metadata, bytes.toByteArray(), true, simpleError);
    }

    private static StsResponse captured(ResponseDetails metadata, byte[] bytes, boolean complete, boolean simpleError) {
        String body = new String(bytes, StandardCharsets.UTF_8);
        return new StsResponse(new ResponseDetails(metadata.getStatusCode(), metadata.getStatus(),
                metadata.getProto(), ErrorUtils.requestId(body, null, metadata.getHeaders()),
                metadata.getHeaders(), bytes, true, complete), body, simpleError);
    }

    ApiException error(String message, Throwable cause, String code) {
        return ErrorUtils.responseError(message, cause, code, body, null, details, simpleError);
    }

    Map<String, Object> parse(String provider, String action) throws ApiException {
        if (body == null || body.trim().isEmpty()) {
            throw error(provider + ": " + action + " returned empty response", null, "UnknownError");
        }
        Map<String, Object> result;
        try {
            result = new Gson().fromJson(body, new TypeToken<Map<String, Object>>() {}.getType());
        } catch (RuntimeException cause) {
            throw error(provider + ": failed to parse " + action + " response", cause, "SerializationError");
        }
        if (result == null) throw error(provider + ": " + action + " returned null response", null, "UnknownError");
        if (ErrorUtils.hasBusinessError(body)) {
            throw error(provider + ": " + action + " returned error", null, null);
        }
        return result;
    }

    Map<String, Object> credentials(Map<String, Object> response) throws ApiException {
        Object result = response.get("Result");
        Object credentials = result instanceof Map ? ((Map<?, ?>) result).get("Credentials") : null;
        if (!(credentials instanceof Map)) {
            throw error("STS response missing credentials", null, "InvalidCredentials");
        }
        @SuppressWarnings("unchecked")
        Map<String, Object> value = (Map<String, Object>) credentials;
        return value;
    }

    String required(Map<String, Object> credentials, String field) throws ApiException {
        Object value = credentials.get(field);
        if (!(value instanceof String) || ((String) value).trim().isEmpty()) {
            throw error("STS response missing or invalid " + field, null, "InvalidCredentials");
        }
        return (String) value;
    }
}
