package com.volcengine.llmshield.aicc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

import javax.crypto.*;

final class ServerSessionKey {
    private final RSAPrivateKey privateKey;

    /// If null, then always valid.
    private final Date notAfter;

    private ServerSessionKey(RSAPrivateKey privateKey, Date notAfter) {
        this.privateKey = privateKey;
        this.notAfter = notAfter == null ? null : new Date(notAfter.getTime());
    }

    static ServerSessionKey load(String keyPem, Date notAfter) {
        KeySpec keySpec =
                new PKCS8EncodedKeySpec(
                        Utils.pkcs1ToPkcs8(Utils.pemToDer(keyPem, "RSA PRIVATE KEY")));

        RSAPrivateKey key;
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            key = (RSAPrivateKey) keyFactory.generatePrivate(keySpec);
        } catch (NoSuchAlgorithmException e) {
            // The algorithms are supposed to be supported, so these exceptions should not happen.
            throw new UnsupportedOperationException(e);
        } catch (InvalidKeySpecException e) {
            // Invalid input.
            throw new IllegalArgumentException(e);
        }

        return new ServerSessionKey(key, notAfter);
    }

    boolean isValid() {
        Date expiresAt = notAfter == null ? null : new Date(notAfter.getTime());
        return expiresAt == null || !new Date().after(expiresAt);
    }

    DecryptResult decryptWithResponse(EncryptedMessage message) {
        if (message.ciphertext == null) {
            throw new IllegalArgumentException();
        }
        AesKey key = symmetricKeyFromMessage(message);

        ByteBuffer plaintext = key.decrypt(message.nonce, message.ciphertext, message.mac);

        ResponseKey responseKey = new ResponseKey(key, ResponseKey.Usage.Encrypt);
        return new DecryptResult(plaintext, responseKey);
    }

    ResponseKey decryptWithResponse(EncryptedMessage message, InputStream source, OutputStream sink)
            throws IOException {
        if (message.ciphertext != null) {
            throw new IllegalArgumentException();
        }
        AesKey key = symmetricKeyFromMessage(message);

        key.decrypt(message.nonce, message.mac, source, sink);

        return new ResponseKey(key, ResponseKey.Usage.Encrypt);
    }

    private AesKey symmetricKeyFromMessage(EncryptedMessage message) {
        // The protocol demands we use RSA with OAEP padding and SHA-256 hash.
        if (message.key == null) {
            throw new IllegalArgumentException();
        }
        ByteBuffer result = ByteBuffer.allocate(512);
        try {
            // Keep RSA-OAEP-SHA256 unchanged; CryptoCompat only selects a Java 7 capable provider.
            Cipher cipher = CryptoCompat.newRsaOaepSha256Cipher(Cipher.DECRYPT_MODE, privateKey);
            cipher.doFinal(message.key, result);

        } catch (IllegalBlockSizeException | BadPaddingException e) {
            // Invalid message.
            throw new IllegalArgumentException(e);
        } catch (ShortBufferException e) {
            // These exceptions imply program bug.
            throw new RuntimeException(e);
        }
        if (result.position() != AesKey.KEY_LEN) {
            throw new IllegalArgumentException();
        }
        result.flip();
        return AesKey.from(Utils.unwrapBytesBuffer(result));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServerSessionKey that = (ServerSessionKey) o;
        return Arrays.equals(privateKey.getEncoded(), that.privateKey.getEncoded());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(privateKey);
    }
}
