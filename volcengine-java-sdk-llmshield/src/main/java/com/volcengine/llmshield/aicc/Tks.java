package com.volcengine.llmshield.aicc;

import at.favre.lib.hkdf.HKDF;

import com.google.gson.JsonObject;

import org.jspecify.annotations.Nullable;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.*;
import java.util.Base64;
import java.util.Map;
import java.util.TreeMap;

import javax.crypto.KeyAgreement;

enum Tks {
    ;

    private static final int NONCE_LEN = 32;

    static ByteBuffer exportKey(
            String appId, String ringId, String keyId, TopInfo topInfo, EpsInfo epsInfo)
            throws IOException {
        AttestedSession session = attest(appId, topInfo, epsInfo);

        JsonObject request = new JsonObject();
        request.addProperty("AppID", appId);
        request.addProperty("RingID", ringId);
        request.addProperty("KeyID", keyId);
        session.addToRequest(request);
        JsonObject response = requestTks(topInfo, "ExportTksKey", appId, request);

        byte[] encryptedKey = Base64.getDecoder().decode(response.get("Key").getAsString());
        return session.decrypt(encryptedKey);
    }

    private static AttestedSession attest(String appId, TopInfo topInfo, EpsInfo epsInfo)
            throws IOException {
        byte[] nonce = new byte[NONCE_LEN];
        SecureRandom random = new SecureRandom();
        random.nextBytes(nonce);

        JsonObject request = new JsonObject();
        request.addProperty("NonceUp", Utils.hex(nonce));
        request.addProperty("BiAuth", epsInfo.needEvidence);
        JsonObject response = requestTks(topInfo, "AttestTksSecurity", appId, request);

        return AttestedSession.fromAttestResponse(response, epsInfo);
    }

    private static JsonObject requestTks(
            TopInfo topInfo, String urlPath, String appId, JsonObject body) throws IOException {
        Map<String, String> extraHeaders = new TreeMap<>();
        extraHeaders.put("AppID", appId);
        return Top.requestTop(
                topInfo, urlPath, extraHeaders, body.toString().getBytes(StandardCharsets.UTF_8));
    }

    private static final class AttestedSession {
        final AesKey symmetricKey;
        final String clientPublicKey;
        final @Nullable JsonObject clientChallenge;
        final @Nullable String clientEvidence;

        AttestedSession(
                AesKey symmetricKey,
                String clientPublicKey,
                @Nullable JsonObject clientChallenge,
                @Nullable String clientEvidence) {
            this.symmetricKey = symmetricKey;
            this.clientPublicKey = clientPublicKey;
            this.clientChallenge = clientChallenge;
            this.clientEvidence = clientEvidence;
        }

        static AttestedSession fromAttestResponse(JsonObject response, EpsInfo epsInfo)
                throws IOException {
            ECPublicKey serverKey = serverKeyFromDhParam(response.get("DHParam").getAsString());

            KeyPair clientKeyPair = generateClientKey();

            byte[] sharedKey = deriveKey(serverKey, (ECPrivateKey) clientKeyPair.getPrivate());

            JsonObject clientChallenge;
            String clientEvidence;
            if (epsInfo.needEvidence && response.has("Challenge")) {
                clientChallenge = response.getAsJsonObject("Challenge");
                byte[] rawEvidence =
                        Eps.getEvidence(clientChallenge.get("NonceDown").getAsString(), epsInfo);
                clientEvidence = Base64.getEncoder().encodeToString(rawEvidence);
            } else {
                clientChallenge = null;
                clientEvidence = null;
            }

            String clientPublicKey = Utils.keyToPem(clientKeyPair.getPublic(), "EC PUBLIC KEY");

            return new AttestedSession(
                    AesKey.from(sharedKey),
                    Base64.getEncoder()
                            .encodeToString(clientPublicKey.getBytes(StandardCharsets.US_ASCII)),
                    clientChallenge,
                    clientEvidence);
        }

        private static ECPublicKey serverKeyFromDhParam(String serverDhParam) {
            String serverKeyPem =
                    new String(
                            Base64.getDecoder().decode(serverDhParam), StandardCharsets.US_ASCII);
            KeySpec serverKeySpec =
                    new X509EncodedKeySpec(Utils.pemToDer(serverKeyPem, "PUBLIC KEY"));

            try {
                KeyFactory keyFactory = KeyFactory.getInstance("EC");
                return (ECPublicKey) keyFactory.generatePublic(serverKeySpec);

            } catch (NoSuchAlgorithmException e) {
                // The algorithms are supposed to be supported, so these exceptions should not
                // happen.
                throw new UnsupportedOperationException(e);
            } catch (InvalidKeySpecException e) {
                // Invalid input.
                throw new IllegalArgumentException(e);
            }
        }

        private static KeyPair generateClientKey() {
            try {
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
                keyPairGenerator.initialize(new ECGenParameterSpec("secp384r1"));
                return keyPairGenerator.generateKeyPair();

            } catch (NoSuchAlgorithmException e) {
                // The algorithms are supposed to be supported, so these exceptions should not
                // happen.
                throw new UnsupportedOperationException(e);
            } catch (InvalidAlgorithmParameterException e) {
                // Invalid DH param.
                throw new IllegalArgumentException(e);
            }
        }

        private static byte[] deriveKey(ECPublicKey serverKey, ECPrivateKey clientKey) {
            byte[] sharedSecret;
            try {
                KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
                keyAgreement.init(clientKey);
                keyAgreement.doPhase(serverKey, true);
                sharedSecret = keyAgreement.generateSecret();

            } catch (NoSuchAlgorithmException e) {
                // The algorithms are supposed to be supported, so these exceptions should not
                // happen.
                throw new UnsupportedOperationException(e);
            } catch (InvalidKeyException e) {
                // Invalid input.
                throw new IllegalArgumentException(e);
            }

            // Derive key
            return HKDF.fromHmacSha256()
                    .extractAndExpand((byte[]) null, sharedSecret, null, AesKey.KEY_LEN);
        }

        void addToRequest(JsonObject request) {
            request.addProperty("DHParam", clientPublicKey);
            if (clientChallenge != null) {
                request.add("ClientChall", clientChallenge);
            }
            if (clientEvidence != null) {
                JsonObject evidence = new JsonObject();
                evidence.addProperty("TEEType", "coco");
                evidence.addProperty("Report", clientEvidence);
                request.add("RAEvidence", evidence);
            }
        }

        ByteBuffer decrypt(byte[] message) {
            ByteBuffer nonce = ByteBuffer.wrap(message, 0, AesKey.NONCE_LEN);
            ByteBuffer ciphertext =
                    ByteBuffer.wrap(
                            message,
                            AesKey.NONCE_LEN,
                            message.length - AesKey.NONCE_LEN - AesKey.MAC_LEN);
            ByteBuffer mac =
                    ByteBuffer.wrap(message, message.length - AesKey.MAC_LEN, AesKey.MAC_LEN);
            return symmetricKey.decrypt(nonce, ciphertext, mac);
        }
    }
}
