package com.volcengine.llmshield.aicc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

final class ClientSessionKey {
    private final RSAPublicKey serverPublicKey;

    private ClientSessionKey(RSAPublicKey serverPublicKey) {
        this.serverPublicKey = serverPublicKey;
    }

    static ClientSessionKey load(String serverKeyPem) {
        KeySpec keySpec = new X509EncodedKeySpec(Utils.pemToDer(serverKeyPem, "PUBLIC KEY"));

        RSAPublicKey key;
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            key = (RSAPublicKey) keyFactory.generatePublic(keySpec);
        } catch (NoSuchAlgorithmException e) {
            // The algorithms are supposed to be supported, so these exceptions should not happen.
            throw new UnsupportedOperationException(e);
        } catch (InvalidKeySpecException e) {
            // Invalid input.
            throw new IllegalArgumentException(e);
        }

        return new ClientSessionKey(key);
    }

    /// @return The encrypted message (containing ciphertext and encryption key), and the key for
    /// decrypting response.
    EncryptResult encryptWithResponse(ByteBuffer plaintext) {
        AesKey symmetricKey = AesKey.generate();

        AesKey.EncryptResult result = symmetricKey.encrypt(plaintext);

        return toEncryptResult(symmetricKey, result);
    }

    /// @return The encrypted message (containing encryption key but not ciphertext), and the key
    /// for decrypting response.
    EncryptResult encryptWithResponse(InputStream source, OutputStream sink) throws IOException {
        AesKey symmetricKey = AesKey.generate();

        AesKey.EncryptResult result = symmetricKey.encrypt(source, sink);

        return toEncryptResult(symmetricKey, result);
    }

    private EncryptResult toEncryptResult(AesKey symmetricKey, AesKey.EncryptResult result) {
        // The protocol demands we use RSA with OAEP padding and SHA-256 hash.
        OAEPParameterSpec params =
                new OAEPParameterSpec(
                        "SHA-256",
                        "MGF1",
                        new MGF1ParameterSpec("SHA-256"),
                        PSource.PSpecified.DEFAULT);
        byte[] encryptedKey;
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPPadding");
            cipher.init(Cipher.ENCRYPT_MODE, serverPublicKey, params);
            encryptedKey = cipher.doFinal(symmetricKey.getEncoded());

        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            // The algorithms are supposed to be supported, so these exceptions should not happen.
            throw new UnsupportedOperationException(e);
        } catch (InvalidKeyException
                | InvalidAlgorithmParameterException
                | IllegalBlockSizeException
                | BadPaddingException e) {
            // These exceptions imply program bug.
            throw new RuntimeException(e);
        }

        EncryptedMessage message =
                new EncryptedMessage(
                        result.nonce, result.mac, ByteBuffer.wrap(encryptedKey), result.ciphertext);

        ResponseKey responseKey = new ResponseKey(symmetricKey, ResponseKey.Usage.Decrypt);
        return new EncryptResult(message.serialize(), responseKey);
    }
}
