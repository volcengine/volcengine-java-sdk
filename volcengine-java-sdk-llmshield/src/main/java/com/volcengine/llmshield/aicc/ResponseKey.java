package com.bytedance.jeddak_secure_channel;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public final class ResponseKey {
    private final AesKey key;

    private final Usage usage;

    ResponseKey(AesKey key, Usage usage) {
        this.key = key;
        this.usage = usage;
    }

    /// Get wrapped AES key.
    /// The user is responsible for keeping the key secure!
    public byte[] getKeyDangerous() {
        return key.getEncoded();
    }

    public NonceSource getNonceSource() {
        return key.getNonceSource();
    }

    public void setUserProvidedNonce(byte[] nonce) {
        key.setNonceSource(new NonceSource.UserProvided(nonce));
    }

    public void removeUserProvidedNonce() {
        key.setNonceSource(new NonceSource.Random());
    }

    /// For server use.
    public String encrypt(String response) {
        return encrypt(response.getBytes(StandardCharsets.UTF_8));
    }

    /// For server use.
    public String encrypt(byte[] response) {
        return encrypt(ByteBuffer.wrap(response));
    }

    /// For server use.
    public String encrypt(ByteBuffer response) {
        if (usage != Usage.Encrypt) {
            throw new UnsupportedOperationException();
        }
        AesKey.EncryptResult result = key.encrypt(response);

        EncryptedMessage message =
                new EncryptedMessage(result.nonce, result.mac, null, result.ciphertext);
        return message.serialize();
    }

    /// For server use.
    public String encrypt(InputStream source, OutputStream sink) throws IOException {
        if (usage != Usage.Encrypt) {
            throw new UnsupportedOperationException();
        }
        AesKey.EncryptResult result = key.encrypt(source, sink);

        EncryptedMessage message = new EncryptedMessage(result.nonce, result.mac, null, null);
        return message.serialize();
    }

    /// For server use.
    public String encrypt(File input, File output) throws IOException {
        try (InputStream source = Files.newInputStream(input.toPath())) {
            try (OutputStream sink = Files.newOutputStream(output.toPath())) {
                return encrypt(source, sink);
            }
        }
    }

    /// For client use.
    public ByteBuffer decryptBytes(String response) {
        return decryptBytes(new StringReader(response));
    }

    /// For client use.
    public ByteBuffer decryptBytes(Reader response) {
        if (usage != Usage.Decrypt) {
            throw new UnsupportedOperationException();
        }
        EncryptedMessage message = EncryptedMessage.deserialize(response);
        if (message.ciphertext == null) {
            throw new IllegalArgumentException();
        }
        return key.decrypt(message.nonce, message.ciphertext, message.mac);
    }

    /// Decrypts the encrypted response as UTF-8 string.
    /// For client use.
    public String decryptString(String response) {
        return decryptString(new StringReader(response));
    }

    /// Decrypts the encrypted response as UTF-8 string.
    /// For client use.
    public String decryptString(Reader response) {
        ByteBuffer bytes = decryptBytes(response);
        // The buffer returned by decryptBytes() is guaranteed to have a valid backing array.
        return Utils.bytesToString(bytes);
    }

    /// For client use.
    public void decrypt(String response, InputStream source, OutputStream sink) throws IOException {
        decrypt(new StringReader(response), source, sink);
    }

    /// For client use.
    public void decrypt(Reader response, InputStream source, OutputStream sink) throws IOException {
        if (usage != Usage.Decrypt) {
            throw new UnsupportedOperationException();
        }
        EncryptedMessage message = EncryptedMessage.deserialize(response);
        if (message.ciphertext != null) {
            throw new IllegalArgumentException();
        }
        key.decrypt(message.nonce, message.mac, source, sink);
    }

    /// For client use.
    public void decrypt(String response, File input, File output) throws IOException {
        try (InputStream source = Files.newInputStream(input.toPath())) {
            try (OutputStream sink = Files.newOutputStream(output.toPath())) {
                decrypt(new StringReader(response), source, sink);
            }
        }
    }

    public Usage getUsage() {
        return usage;
    }

    public enum Usage {
        /// For server use.
        Encrypt,
        /// For client use.
        Decrypt
    }
}
