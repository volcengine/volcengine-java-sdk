package com.volcengine.llmshield.aicc;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.jspecify.annotations.Nullable;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Server implements AutoCloseable {
    public final ServerConfig config;

    private final @Nullable ScheduledExecutorService refreshExecutor;
    private final @Nullable ScheduledFuture<?> refreshFuture;

    private final List<ServerSessionKey> sessionKeys;

    public Server(ServerConfig config) {
        this(config, null);
    }

    public Server(ServerConfig config, @Nullable ScheduledExecutorService refreshExecutor) {
        this.config = config;

        this.sessionKeys = new ArrayList<>();

        if (config.refreshInterval != null) {
            ScheduledExecutorService executor;
            if (refreshExecutor == null) {
                executor = Executors.newSingleThreadScheduledExecutor();
                this.refreshExecutor = executor;
            } else {
                executor = refreshExecutor;
                this.refreshExecutor = null; // Not owned
            }

            refreshFuture =
                    executor.scheduleAtFixedRate(
                            () -> {
                                try {
                                    this.updateTksKeyId();
                                    this.importTksKey();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            },
                            0,
                            (long) (config.refreshInterval * 1000),
                            TimeUnit.MILLISECONDS);
        } else {
            this.refreshExecutor = null;
            this.refreshFuture = null;
        }
    }

    @Override
    public void close() {
        ScheduledFuture<?> future = refreshFuture;
        if (future != null) {
            future.cancel(true);
        }

        ScheduledExecutorService executor = refreshExecutor;
        if (executor != null) {
            executor.shutdown();
        }
    }

    public void importTksKey() throws IOException {
        System.err.println("Importing TKS key");
        if (config.tksAppId == null || config.tksRingId == null || config.tksKeyId == null) {
            System.err.println("TKS config is null, skipping");
            return;
        }
        TopInfo topInfo = config.parseTopInfo();
        EpsInfo epsInfo = EpsInfo.fromConfig(config);

        ByteBuffer keyPem =
                Tks.exportKey(config.tksAppId, config.tksRingId, config.tksKeyId, topInfo, epsInfo);
        Instant notAfter = Instant.now().plus(Duration.ofDays(1));
        importKey(Utils.bytesToString(keyPem), notAfter);
    }

    public void updateTksKeyId() {
        if (config.tksAppId == null) {
            return;
        }
        TopInfo topInfo = config.parseTopInfo();
        String serviceId;
        if (config.serviceId != null) {
            serviceId = config.serviceId;
        } else {
            serviceId = System.getenv("JPCC_JCK_SERVICE_ID");
        }
        if (serviceId == null || serviceId.isEmpty()) {
            return;
        }

        System.err.println("Updating TKS key ID");

        JsonObject request = new JsonObject();
        request.addProperty("ServiceId", serviceId);
        request.addProperty("AccountId", config.tksAppId);
        byte[] requestBody = new Gson().toJson(request).getBytes(StandardCharsets.UTF_8);

        try {
            JsonObject keyResults = Top.requestTop(topInfo, "ListJscKey", null, requestBody);
            JsonArray keyList = keyResults.getAsJsonArray("KeyList");
            if (keyList.size() != 1) {
                System.err.println("None or multiple TKS keys listed");
                return;
            }

            JsonObject key = keyList.get(0).getAsJsonObject();
            config.tksRingId = key.get("RingID").getAsString();
            config.tksKeyId = key.get("KeyID").getAsString();
            System.err.println("New TKS key ID: " + config.tksKeyId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void importKey(String keyPem) {
        importKey(keyPem, null);
    }

    public void importKey(String keyPem, @Nullable Instant notAfter) {
        ServerSessionKey newKey = ServerSessionKey.load(keyPem, notAfter);
        synchronized (sessionKeys) {
            sessionKeys.removeIf(existing -> !existing.isValid());
            for (ServerSessionKey existing : sessionKeys) {
                if (existing.equals(newKey)) {
                    return;
                }
            }
            sessionKeys.add(newKey);
        }
    }

    public ByteBuffer decryptBytes(String message) {
        return decryptWithResponse(new StringReader(message)).getBytes();
    }

    public ByteBuffer decryptBytes(Reader message) {
        return decryptWithResponse(message).getBytes();
    }

    public String decryptString(String message) {
        return decryptWithResponse(new StringReader(message)).getString();
    }

    public String decryptString(Reader message) {
        return decryptWithResponse(message).getString();
    }

    public DecryptResult decryptWithResponse(String message) {
        return decryptWithResponse(new StringReader(message));
    }

    public DecryptResult decryptWithResponse(Reader message) {
        EncryptedMessage messageObject = EncryptedMessage.deserialize(message);
        if (messageObject.key == null || messageObject.ciphertext == null) {
            throw new IllegalArgumentException();
        }
        RuntimeException lastException = null;
        List<ServerSessionKey> sessionKeysCopy;
        synchronized (sessionKeys) {
            sessionKeysCopy = new ArrayList<>(sessionKeys);
        }

        for (ServerSessionKey key : sessionKeysCopy) {
            try {
                return key.decryptWithResponse(messageObject);
            } catch (RuntimeException e) {
                lastException = e;
//                System.err.println("decryptWithResponse failed, try again, key=" + key.toString());
                // If wrong session key, message is not modified, and we try next key.
                messageObject.nonce.position(0);
                messageObject.mac.position(0);
                messageObject.key.position(0);
                messageObject.ciphertext.position(0);
            }
        }

        //从TKS中获取最新的私钥试一下
        try {
            this.updateTksKeyId();
            this.importTksKey();
        } catch (IOException e) {
            e.printStackTrace();
        }
        synchronized (sessionKeys) {
            sessionKeysCopy = new ArrayList<>(sessionKeys);
        }

        System.out.println("jsc_test: after add key" + sessionKeys);

//        for (ServerSessionKey key : sessionKeysCopy) {
        for (int i = sessionKeysCopy.size() - 1; i >= 0; i--) {
            ServerSessionKey key = sessionKeysCopy.get(i);
            try {
                return key.decryptWithResponse(messageObject);
            } catch (RuntimeException e) {
                lastException = e;
//                System.err.println("decryptWithResponse failed after update, try again" + key);
                // If wrong session key, message is not modified, and we try next key.
                messageObject.nonce.position(0);
                messageObject.mac.position(0);
                messageObject.key.position(0);
                messageObject.ciphertext.position(0);
            }
        }
        if (lastException == null) {
            throw new IllegalStateException("No session key");
        } else {
            throw lastException;
        }
    }

    public ResponseKey decrypt(String message, InputStream source, OutputStream sink)
            throws IOException {
        return decrypt(new StringReader(message), source, sink);
    }

    public ResponseKey decrypt(Reader message, InputStream source, OutputStream sink)
            throws IOException {
        EncryptedMessage messageObject = EncryptedMessage.deserialize(message);
        if (messageObject.key == null || messageObject.ciphertext != null) {
            throw new IllegalArgumentException();
        }
        RuntimeException lastException = null;
        List<ServerSessionKey> sessionKeysCopy;
        synchronized (sessionKeys) {
            sessionKeysCopy = new ArrayList<>(sessionKeys);
        }
//        for (ServerSessionKey key : sessionKeysCopy) {
        for (int i = sessionKeysCopy.size() - 1; i >= 0; i--) {
            ServerSessionKey key = sessionKeysCopy.get(i);
            try {
                return key.decryptWithResponse(messageObject, source, sink);
            } catch (RuntimeException e) {
                lastException = e;
                System.err.println("Decrypt failed, try again" + e);
                // If wrong session key, source and sink are not modified, and we try next key.
                messageObject.nonce.position(0);
                messageObject.mac.position(0);
                messageObject.key.position(0);
            }
        }

        //从TKS中获取最新的私钥试一下
        try {
            this.updateTksKeyId();
            this.importTksKey();
        } catch (IOException e) {
            e.printStackTrace();
        }
        synchronized (sessionKeys) {
            sessionKeysCopy = new ArrayList<>(sessionKeys);
        }

//        System.out.println("jsc_test: after add key" + sessionKeys);

        for (ServerSessionKey key : sessionKeysCopy) {
            try {
                return key.decryptWithResponse(messageObject, source, sink);
            } catch (RuntimeException e) {
                lastException = e;
//                System.err.println("Decrypt failed after update, try again" + key);
                // If wrong session key, message is not modified, and we try next key.
                messageObject.nonce.position(0);
                messageObject.mac.position(0);
                messageObject.key.position(0);
                messageObject.ciphertext.position(0);
            }
        }

        if (lastException == null) {
            throw new IllegalStateException("No session key");
        } else {
            throw lastException;
        }
    }

    public ResponseKey decrypt(String message, File input, File output) throws IOException {
        try (InputStream source = Files.newInputStream(input.toPath())) {
            try (OutputStream sink = Files.newOutputStream(output.toPath())) {
                return decrypt(message, source, sink);
            }
        }
    }
}
