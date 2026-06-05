package com.volcengine.llmshield.aicc;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example {
    static final String SERVER_URL = "http://localhost:8080";

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: jeddak_secure_channel.Example <path/to/client_config>");
            return;
        }
        ClientConfig config = ClientConfig.fromFile(Paths.get(args[0]));
        try (Client client = new Client(config)) {
            client.attestServer();

            testStringEncryption(client, "Hello, World!");

            testFileEncryption(client, new File("test-input"), new File("test-output"));
        }
    }

    static void testStringEncryption(Client client, String message) throws IOException {
        EncryptResult encrypted = client.encryptWithResponse(message);

        URL url = URI.create(SERVER_URL + "/request_example_2").toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        String response;
        try {
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "text/plain");

            connection.setDoOutput(true);
            connection
                    .getOutputStream()
                    .write(encrypted.ciphertext.getBytes(StandardCharsets.UTF_8));

            Reader responseBody =
                    new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8);
            response = encrypted.responseKey.decryptString(responseBody);
        } finally {
            connection.disconnect();
        }
        System.out.println(response);
    }

    static void testFileEncryption(Client client, File input, File output) throws IOException {
        EncryptResult encrypted = client.encryptWithResponse(input, output);

        URL url = URI.create(SERVER_URL + "/request_example_3").toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        String response;
        try {
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "text/plain");
            connection.setRequestProperty("X-File-Enc-Key", encrypted.ciphertext);

            connection.setDoOutput(true);
            try (InputStream encryptedStream = Files.newInputStream(output.toPath())) {
                byte[] buffer = new byte[1024];
                int encryptedLen;
                while ((encryptedLen = encryptedStream.read(buffer)) != -1) {
                    connection.getOutputStream().write(buffer, 0, encryptedLen);
                }
            }

            Reader responseBody =
                    new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8);
            response = new BufferedReader(responseBody).readLine();
        } finally {
            connection.disconnect();
        }
        System.out.println(response);
    }
}
