package com.volcengine.ark.runtime.utils;

import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.*;


import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class KeyAgreementUtil {
    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    private static final String HKDF_ALGORITHM = "HmacSHA256";

    /**
     * 会话令牌数据容器类
     * 包含加密密钥、随机数和会话令牌
     */
    public static class SessionData {
        private final byte[] cryptoKey;
        private final byte[] cryptoNonce;
        private final String sessionToken;

        public SessionData(byte[] cryptoKey, byte[] cryptoNonce, String sessionToken) {
            this.cryptoKey = cryptoKey;
            this.cryptoNonce = cryptoNonce;
            this.sessionToken = sessionToken;
        }

        public byte[] getCryptoKey() {
            return cryptoKey;
        }

        public byte[] getCryptoNonce() {
            return cryptoNonce;
        }

        public String getSessionToken() {
            return sessionToken;
        }
    }

    public static SessionData generateEciesKeyPair(PublicKey publicKey) throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "BC");
        ECParameterSpec ecSpec = ((java.security.interfaces.ECPublicKey) publicKey).getParams();
        keyPairGenerator.initialize(ecSpec);

        KeyPair ephemeralKeyPair = keyPairGenerator.generateKeyPair();
        PrivateKey peerPrivateKey = ephemeralKeyPair.getPrivate();

        javax.crypto.KeyAgreement keyAgreement = javax.crypto.KeyAgreement.getInstance("ECDH", "BC");
        keyAgreement.init(peerPrivateKey);
        keyAgreement.doPhase(publicKey, true);
        byte[] dh = keyAgreement.generateSecret();

        int length = 32 + 12;
        byte[] buf = KeyAgreementUtil.hkdf(dh, null, null, length);
        byte[] cryptoKey = Arrays.copyOfRange(buf, 0, 32);
        byte[] cryptoNonce = Arrays.copyOfRange(buf, 32, length);

        java.security.interfaces.ECPublicKey ephemeralPublicKey = (java.security.interfaces.ECPublicKey) ephemeralKeyPair.getPublic();
        byte[] token = marshalEcPublicKey(ephemeralPublicKey);
        String sessionToken = Base64.getEncoder().encodeToString(token);

        return new SessionData(cryptoKey, cryptoNonce, sessionToken);
    }

    public static byte[] hkdf(byte[] sharedSecret, byte[] salt, byte[] info, int length)
            throws GeneralSecurityException {
        Mac hmacExtract = Mac.getInstance(HKDF_ALGORITHM);
        if (salt == null) {
            salt = new byte[32];
        }
        SecretKeySpec saltKey = new SecretKeySpec(salt, HKDF_ALGORITHM);
        hmacExtract.init(saltKey);
        byte[] prk = hmacExtract.doFinal(sharedSecret);

        Mac hmacExpand = Mac.getInstance(HKDF_ALGORITHM);
        SecretKeySpec prkKey = new SecretKeySpec(prk, HKDF_ALGORITHM);
        hmacExpand.init(prkKey);

        byte[] result = new byte[length];
        byte[] t = new byte[0];
        int pos = 0;

        while (pos < length) {
            hmacExpand.update(t);
            hmacExpand.update(info);
            hmacExpand.update((byte) (pos / 32 + 1));
            t = hmacExpand.doFinal();

            int copyLen = Math.min(t.length, length - pos);
            System.arraycopy(t, 0, result, pos, copyLen);
            pos += copyLen;
        }

        return result;
    }

    public static byte[] marshalEcPublicKey(java.security.interfaces.ECPublicKey publicKey) {
        try {
            ECPoint point = publicKey.getW();
            BigInteger x = point.getAffineX();
            BigInteger y = point.getAffineY();

            byte[] xBytes = toUnsignedBigEndian(x, 32);
            byte[] yBytes = toUnsignedBigEndian(y, 32);

            byte[] result = new byte[1 + 32 + 32];
            result[0] = 0x04;
            System.arraycopy(xBytes, 0, result, 1, 32);
            System.arraycopy(yBytes, 0, result, 33, 32);

            return result;

        } catch (Exception e) {
            throw new RuntimeException("Failed to marshal EC public key", e);
        }
    }


    public static byte[] toUnsignedBigEndian(BigInteger value, int length) {
        byte[] bytes = value.toByteArray();
        byte[] result = new byte[length];

        if (bytes.length > length) {
            System.arraycopy(bytes, bytes.length - length, result, 0, length);
        } else if (bytes.length < length) {
            System.arraycopy(bytes, 0, result, length - bytes.length, bytes.length);
        } else {
            System.arraycopy(bytes, 0, result, 0, length);
        }

        return result;
    }


    public static boolean decryptValidate(String ciphertext) {
        try {
            byte[] cipherBytes = ciphertext.getBytes(StandardCharsets.UTF_8);
            byte[] cipherB64Bytes = Base64.getDecoder().decode(ciphertext);

            double left = (double) cipherBytes.length / 4;
            double middle = (double) cipherB64Bytes.length / 3;
            double right = (double) cipherBytes.length / 4 - 1;

            return left >= middle && middle >= right;
        } catch (Exception e) {
            return false;
        }
    }


    public static String decryptStringWithKey(byte[] key, byte[] nonce, String encryptedContent) {
        try {
            String content;
            try {
                content = aesGcmDecryptBase64String(key, nonce, encryptedContent);
            } catch (Exception e) {
                content = "";
            }

            if (content.isEmpty() || !decryptValidate(encryptedContent)) {
                content = aesGcmDecryptBase64List(key, nonce, encryptedContent);
            }

            return content;

        } catch (Exception e) {
            return "";
        }
    }

    public static String encryptStringWithKey(byte[] key, byte[] nonce, String plaintext) {
        try {
            Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
            GCMParameterSpec parameterSpec = new javax.crypto.spec.GCMParameterSpec(128, nonce);
            SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(key, "AES");

            cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, secretKeySpec, parameterSpec);
            byte[] encryptedData = cipher.doFinal(plaintext.getBytes(StandardCharsets.UTF_8));

            String result = Base64.getEncoder().encodeToString(encryptedData);
            return result;
        } catch (Exception e) {
            throw new RuntimeException("Failed to encrypt data", e);
        }
    }


    public static String aesGcmDecryptBase64String(byte[] key, byte[] nonce, String ciphertext) {
        try {
            String cleaned = ciphertext.replaceAll("\\s", "");

            StringBuilder cleanedBuilder = new StringBuilder(cleaned);
            while (cleanedBuilder.length() % 4 != 0) {
                cleanedBuilder.append("=");
            }
            cleaned = cleanedBuilder.toString();

            byte[] cipherBytes = Base64.getDecoder().decode(cleaned);

            return aesGcmDecrypt(key, nonce, cipherBytes);

        } catch (Exception e) {
            throw new RuntimeException("Base64字符串解密失败: " + e.getMessage(), e);
        }
    }


    public static String aesGcmDecrypt(byte[] key, byte[] iv, byte[] cipherBytes) throws GeneralSecurityException {
        try {
            Cipher decryptor = Cipher.getInstance("AES/GCM/NoPadding", "BC");
            GCMParameterSpec spec = new GCMParameterSpec(128, iv);
            decryptor.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key, "AES"), spec);

            byte[] decrypted = decryptor.doFinal(cipherBytes);
            return new String(decrypted, StandardCharsets.UTF_8);

        } catch (Exception e) {
            throw new GeneralSecurityException("AES-GCM解密失败", e);
        }
    }

    public static String aesGcmDecryptBase64List(byte[] key, byte[] nonce, String ciphertext) {
        List<String> result = new ArrayList<>();

        List<String> base64Array = extractBase64Blocks(ciphertext);

        for (String b64 : base64Array) {
            try {
                String decrypted = aesGcmDecryptBase64String(key, nonce, b64);
                result.add(decrypted);
            } catch (Exception e) {
                String cornerCaseResult = decryptCornerCase(key, nonce, b64);
                result.add(cornerCaseResult);
            }
        }

        return String.join("", result);
    }


    public static List<String> extractBase64Blocks(String ciphertext) {
        List<String> blocks = new ArrayList<>();

        String base64Pattern = "(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{4})";
        Pattern pattern = Pattern.compile(base64Pattern);
        Matcher matcher = pattern.matcher(ciphertext);

        while (matcher.find()) {
            String block = matcher.group();
            if (!block.isEmpty()) {
                blocks.add(block);
            }
        }

        return blocks;
    }


    private static String decryptCornerCase(byte[] key, byte[] nonce, String data) {
        for (int i = 20; i < data.length(); i += 4) {
            try {
                String decrypted = aesGcmDecryptBase64String(key, nonce, data.substring(0, i + 4));
                if (i + 4 == data.length()) {
                    return decrypted;
                }
                return decrypted + decryptCornerCase(key, nonce, data.substring(i + 4));
            } catch (Exception e) {
                continue;
            }
        }
        return "";
    }
}