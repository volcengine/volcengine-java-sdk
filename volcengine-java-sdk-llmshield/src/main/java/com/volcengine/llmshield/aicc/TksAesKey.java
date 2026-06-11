package com.volcengine.llmshield.aicc;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class TksAesKey {
    private final AesKey key;

    TksAesKey(AesKey key) {
        this.key = key;
    }

    public static TksAesKey load(String appId, String ringId, String keyId, ServerConfig config)
            throws IOException {
        System.err.println("Importing TKS key");
        TopInfo topInfo = config.parseTopInfo();
        EpsInfo epsInfo = EpsInfo.fromConfig(config);

        ByteBuffer key = Tks.exportKey(appId, ringId, keyId, topInfo, epsInfo);
        return new TksAesKey(AesKey.from(Utils.unwrapBytesBuffer(key)));
    }

    public byte[] encrypt(String plaintext) {
        return encrypt(plaintext.getBytes(StandardCharsets.UTF_8));
    }

    public byte[] encrypt(byte[] plaintext) {
        return encrypt(ByteBuffer.wrap(plaintext));
    }

    public byte[] encrypt(ByteBuffer plaintext) {
        AesKey.EncryptResult result = key.encrypt(plaintext);

        assert result.ciphertext != null;
        ByteBuffer concatted =
                ByteBuffer.allocate(
                        result.nonce.remaining()
                                + result.ciphertext.remaining()
                                + result.mac.remaining());
        concatted.put(result.nonce);
        concatted.put(result.ciphertext);
        concatted.put(result.mac);
        return concatted.array();
    }

    public void encrypt(InputStream source, OutputStream sink) throws IOException {
        key.encrypt(source, sink, true);
    }

    public void encrypt(File input, File output) throws IOException {
        try (InputStream source = Files.newInputStream(input.toPath())) {
            try (OutputStream sink = Files.newOutputStream(output.toPath())) {
                encrypt(source, sink);
            }
        }
    }

    public byte[] decryptBytes(byte[] message) {
        return decryptBytes(ByteBuffer.wrap(message));
    }

    public byte[] decryptBytes(ByteBuffer message) {
        return Utils.unwrapBytesBuffer(decryptByteBuffer(message));
    }

    public String decryptString(byte[] message) {
        return decryptString(ByteBuffer.wrap(message));
    }

    public String decryptString(ByteBuffer message) {
        return Utils.bytesToString(decryptByteBuffer(message));
    }

    private ByteBuffer decryptByteBuffer(ByteBuffer message) {
        if (message.remaining() < AesKey.NONCE_LEN + AesKey.MAC_LEN) {
            throw new IllegalArgumentException("Message too short");
        }
        ByteBuffer nonce = message.duplicate();
        nonce.limit(nonce.position() + AesKey.NONCE_LEN);
        ByteBuffer ciphertext = message.duplicate();
        ciphertext.position(nonce.limit());
        ByteBuffer mac = ByteBuffer.allocate(0);

        return key.decrypt(nonce, ciphertext, mac);
    }

    public void decrypt(InputStream source, OutputStream sink) throws IOException {
        byte[] nonce = new byte[AesKey.NONCE_LEN];
        if (source.read(nonce) != nonce.length) {
            throw new IOException("Read message too short");
        }

        key.decrypt(ByteBuffer.wrap(nonce), ByteBuffer.allocate(0), source, sink);
    }

    public void decrypt(File input, File output) throws IOException {
        try (InputStream source = Files.newInputStream(input.toPath())) {
            try (OutputStream sink = Files.newOutputStream(output.toPath())) {
                decrypt(source, sink);
            }
        }
    }
}
