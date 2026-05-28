package com.bytedance.jeddak_secure_channel;

import org.jspecify.annotations.Nullable;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Client implements AutoCloseable {
    public final ClientConfig config;

    private final @Nullable ScheduledExecutorService attestExecutor;
    private final @Nullable ScheduledFuture<?> attestFuture;

    private @Nullable ClientSessionKey sessionKey = null;

    public Client(ClientConfig config) {
        this(config, null);
    }

    public Client(ClientConfig config, @Nullable ScheduledExecutorService attestExecutor) {
        this.config = config;

        if (config.attestInterval != null) {
            ScheduledExecutorService executor;
            if (attestExecutor == null) {
                executor = Executors.newSingleThreadScheduledExecutor();
                this.attestExecutor = executor;
            } else {
                executor = attestExecutor;
                this.attestExecutor = null; // Not owned
            }

            attestFuture =
                    executor.scheduleAtFixedRate(
                            () -> {
                                try {
                                    this.attestServer();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            },
                            0,
                            (long) (config.attestInterval * 1000),
                            TimeUnit.MILLISECONDS);
        } else {
            this.attestExecutor = null;
            this.attestFuture = null;
        }
    }

    @Override
    public void close() {
        ScheduledFuture<?> future = attestFuture;
        if (future != null) {
            future.cancel(true);
        }

        ScheduledExecutorService executor = attestExecutor;
        if (executor != null) {
            executor.shutdown();
        }
    }

    public void attestServer() throws IOException {
        attestServer(null);
    }

    public void attestServer(@Nullable String token) throws IOException {
        if (config.pubKeyPath != null) {
            String publicPem = new String(Files.readAllBytes(Paths.get(config.pubKeyPath)));
            System.err.println("read pub key success, pub_key=" + publicPem);
            this.sessionKey = ClientSessionKey.load(publicPem);
            return;
        }
        System.err.println("Client attesting server");
        this.sessionKey = Ra.attestServer(token, config);
    }

    public String encrypt(String plaintext) {
        return encryptWithResponse(plaintext).ciphertext;
    }

    public String encrypt(byte[] plaintext) {
        return encryptWithResponse(plaintext).ciphertext;
    }

    public String encrypt(ByteBuffer plaintext) {
        return encryptWithResponse(plaintext).ciphertext;
    }

    public String encrypt(InputStream source, OutputStream sink) throws IOException {
        return encryptWithResponse(source, sink).ciphertext;
    }

    public String encrypt(File input, File output) throws IOException {
        return encryptWithResponse(input, output).ciphertext;
    }

    public EncryptResult encryptWithResponse(String plaintext) {
        return encryptWithResponse(plaintext.getBytes(StandardCharsets.UTF_8));
    }

    public EncryptResult encryptWithResponse(byte[] plaintext) {
        return encryptWithResponse(ByteBuffer.wrap(plaintext));
    }

    public EncryptResult encryptWithResponse(ByteBuffer plaintext) {
        ClientSessionKey sessionKey = this.sessionKey;
        if (sessionKey == null) {
            throw new IllegalStateException();
        }

        return sessionKey.encryptWithResponse(plaintext);
    }

    public EncryptResult encryptWithResponse(InputStream source, OutputStream sink)
            throws IOException {
        ClientSessionKey sessionKey = this.sessionKey;
        if (sessionKey == null) {
            throw new IllegalStateException();
        }

        return sessionKey.encryptWithResponse(source, sink);
    }

    public EncryptResult encryptWithResponse(File input, File output) throws IOException {
        try (InputStream source = Files.newInputStream(input.toPath())) {
            try (OutputStream sink = Files.newOutputStream(output.toPath())) {
                return encryptWithResponse(source, sink);
            }
        }
    }
}
