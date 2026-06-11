package com.volcengine.llmshield.aicc;

import org.jspecify.annotations.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.time.Instant;
import java.util.Arrays;
import java.util.Objects;

import javax.crypto.*;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

final class ServerSessionKey {
    private final RSAPrivateKey privateKey;

    /// If null, then always valid.
    private final @Nullable Instant notAfter;

    private ServerSessionKey(RSAPrivateKey privateKey, @Nullable Instant notAfter) {
        this.privateKey = privateKey;
        this.notAfter = notAfter;
    }

    static ServerSessionKey load(String keyPem, @Nullable Instant notAfter) {
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
        return notAfter == null || !Instant.now().isAfter(notAfter);
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
        OAEPParameterSpec params =
                new OAEPParameterSpec(
                        "SHA-256",
                        "MGF1",
                        new MGF1ParameterSpec("SHA-256"),
                        PSource.PSpecified.DEFAULT);
        ByteBuffer result = ByteBuffer.allocate(512);
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPPadding");
            cipher.init(Cipher.DECRYPT_MODE, privateKey, params);
            cipher.doFinal(message.key, result);

        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            // The algorithms are supposed to be supported, so these exceptions should not happen.
            throw new UnsupportedOperationException(e);
        } catch (IllegalBlockSizeException | BadPaddingException e) {
            // Invalid message.
            throw new IllegalArgumentException(e);
        } catch (InvalidKeyException
                | InvalidAlgorithmParameterException
                | ShortBufferException e) {
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
