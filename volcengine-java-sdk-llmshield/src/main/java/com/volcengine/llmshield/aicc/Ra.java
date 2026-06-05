package com.volcengine.llmshield.aicc;

import com.google.gson.*;

import org.jspecify.annotations.Nullable;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Map;
import java.util.TreeMap;

enum Ra {
    ;

    static ClientSessionKey attestServer(@Nullable String token, ClientConfig config)
            throws IOException {
        String serverPublicKey;
        if (config.raType.equals(ClientConfig.RA_TYPE_LOCAL)) {
            serverPublicKey = attestLocal(token, config);
        } else {
            serverPublicKey = attestTopTca(token, config);
        }

        return ClientSessionKey.load(serverPublicKey);
    }

    static String attestLocal(@Nullable String token, ClientConfig config) throws IOException {
        URL url = URI.create(config.raUrl).toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        try {
            JsonObject request = buildRaRequest(config);
            byte[] requestBody = new Gson().toJson(request).getBytes(StandardCharsets.UTF_8);

            connection.setRequestMethod("POST");
            if (token != null) {
                connection.setRequestProperty("Token", token);
            }
            connection.setRequestProperty("Nonce", generateNonce(3));
            connection.setRequestProperty("Content-Type", "application/json");

            connection.setDoOutput(true);
            connection.getOutputStream().write(requestBody);

            JsonObject raResults = Utils.responseJson(connection);

            return publicKeyWithRa(raResults);
        } finally {
            connection.disconnect();
        }
    }

    static String attestTopTca(@Nullable String token, ClientConfig config) throws IOException {
        TopInfo topInfo = config.parseTopInfo();

        JsonObject request = buildRaRequest(config);
        byte[] requestBody = new Gson().toJson(request).getBytes(StandardCharsets.UTF_8);

        Map<String, String> extraHeaders = new TreeMap<>();
        if (token != null) {
            extraHeaders.put("Token", token);
        }
        extraHeaders.put("UID", config.raUid);

        JsonObject raResults =
                Top.requestTop(topInfo, "GetAttestationBackend", extraHeaders, requestBody);

        return publicKeyWithRa(raResults);
    }

    private static JsonObject buildRaRequest(ClientConfig config) {
        JsonObject request = new JsonObject();
        request.addProperty("PolicyID", config.raPolicyId);
        request.addProperty("ServiceName", config.raServiceName);
        request.addProperty("KeyNegotiation", config.raKeyNegotiation);
        request.addProperty("Token", config.raNeedToken);
        request.addProperty("Nonce", generateNonce(8));
        return request;
    }

    private static String publicKeyWithRa(JsonObject raResults) {
        for (Map.Entry<String, JsonElement> raEntry : raResults.entrySet()) {
            JsonObject raInfo = raEntry.getValue().getAsJsonObject();
            if (checkRa(raInfo)) {
                System.err.println("RA success");
            }
            if (!raInfo.has("key_info")) {
                System.err.println("RA result does not contain key_info");
                continue;
            }

            return raInfo.getAsJsonObject("key_info").get("pub_key_info").getAsString();
        }
        throw new RuntimeException("Empty RA results");
    }

    private static boolean checkRa(JsonObject raInfo) {
        if (raInfo.has("evidence")) {
            try {
                JsonElement evidence = JsonParser.parseString(raInfo.get("evidence").getAsString());
//                System.err.println("RA evidence: " + evidence);
            } catch (RuntimeException e) {
                System.err.println("Bad RA evidence: " + e);
            }
        } else {
            System.err.println("No RA evidence");
        }
        if (!raInfo.has("token")) {
            System.err.println("No RA token");
            return false;
        }
        try {
            // If token is not of 'X.Y.Z' format, it is a bad token.
            String rawToken = raInfo.get("token").getAsString().split("\\.")[1];
            String tokenData =
                    new String(Base64.getUrlDecoder().decode(rawToken), StandardCharsets.UTF_8);
//            System.err.println("RA token data: " + tokenData);

            JsonObject tokenObject = JsonParser.parseString(tokenData).getAsJsonObject();
            boolean policyOk = !tokenObject.getAsJsonArray("policies_matched").isEmpty();
            return policyOk;
        } catch (RuntimeException e) {
            System.err.println("Bad RA token: " + e);
            return false;
        }
    }

    private static String generateNonce(int numBytes) {
        return Utils.hex(new SecureRandom().generateSeed(numBytes));
    }
}
