package com.volcengine;

import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import com.squareup.okhttp.Response;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/** Immutable HTTP snapshot. All mutable inputs and getter results are copied. */
public final class ResponseDetails {
    private final int statusCode;
    private final String status;
    private final String proto;
    private final String requestId;
    private final Map<String, List<String>> headers;
    private final byte[] body;
    private final boolean bodyCaptured;
    private final boolean bodyComplete;

    public ResponseDetails(int statusCode, String status, String proto, String requestId,
                           Map<String, List<String>> headers, byte[] body,
                           boolean bodyCaptured, boolean bodyComplete) {
        this.statusCode = statusCode;
        this.status = status;
        this.proto = proto;
        this.requestId = requestId == null ? "" : requestId;
        this.headers = copyHeaders(headers);
        this.body = body == null ? new byte[0] : body.clone();
        this.bodyCaptured = bodyCaptured;
        this.bodyComplete = bodyCaptured && bodyComplete;
    }

    static ResponseDetails capture(Response response, byte[] bytes, boolean captured, boolean complete) {
        return new ResponseDetails(response.code(), response.code() + " " + response.message(),
                response.protocol().toString(), ErrorUtils.requestId(null, null, response.headers().toMultimap()),
                response.headers().toMultimap(), bytes, captured, complete);
    }

    public ResponseDetails withRequestId(String id) {
        return new ResponseDetails(statusCode, status, proto, id, headers, body, bodyCaptured, bodyComplete);
    }

    public int getStatusCode() { return statusCode; }
    public String getStatus() { return status; }
    public String getProto() { return proto; }
    public String getRequestId() { return requestId; }
    public Map<String, List<String>> getHeaders() { return copyHeaders(headers); }
    public byte[] getBody() { return body.clone(); }
    public boolean isBodyCaptured() { return bodyCaptured; }
    public boolean isBodyComplete() { return bodyComplete; }

    private static Map<String, List<String>> copyHeaders(Map<String, List<String>> source) {
        Map<String, List<String>> copy = new LinkedHashMap<>();
        if (source != null) {
            for (Map.Entry<String, List<String>> entry : source.entrySet()) {
                copy.put(entry.getKey(), entry.getValue() == null ? null : new ArrayList<>(entry.getValue()));
            }
        }
        return copy;
    }

    JsonObject toJson() {
        JsonObject result = new JsonObject();
        result.addProperty("status_code", statusCode);
        if (status != null) result.addProperty("status", status);
        if (proto != null) result.addProperty("proto", proto);
        result.addProperty("request_id", requestId);
        result.add("headers", new Gson().toJsonTree(headers));
        result.addProperty("body_captured", bodyCaptured);
        result.addProperty("body_complete", bodyComplete);
        if (!bodyCaptured) {
            result.add("body", JsonNull.INSTANCE);
        } else {
            try {
                String text = StandardCharsets.UTF_8.newDecoder()
                        .onMalformedInput(CodingErrorAction.REPORT)
                        .onUnmappableCharacter(CodingErrorAction.REPORT)
                        .decode(ByteBuffer.wrap(body)).toString();
                result.addProperty("body", text);
                result.addProperty("body_encoding", "utf-8");
            } catch (CharacterCodingException e) {
                result.addProperty("body", Base64.getEncoder().encodeToString(body));
                result.addProperty("body_encoding", "base64");
            }
        }
        return result;
    }
}
