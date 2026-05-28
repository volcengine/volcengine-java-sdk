package com.bytedance.jeddak_secure_channel;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Locale;

public class ServerExample {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println(
                    "Usage: jeddak_secure_channel.ServerExample <path/to/client_config> <path/to/server_config>");
            return;
        }
        ClientConfig clientConfig = ClientConfig.fromFile(Paths.get(args[0]));
        ServerConfig serverConfig = ServerConfig.fromFile(Paths.get(args[1]));

        try (Client client = new Client(clientConfig)) {
            client.attestServer();

            try (Server server = new Server(serverConfig)) {
                server.importTksKey();

                testInterop(client, server, "Hello, World!");
            }
        }
    }

    static void testInterop(Client client, Server server, String message) {
        EncryptResult clientRequest = client.encryptWithResponse(message);

        DecryptResult serverDecrypted = server.decryptWithResponse(clientRequest.ciphertext);

        assert serverDecrypted.getString().equals(message);

        String rawResponse = serverDecrypted.getString().toUpperCase(Locale.ROOT);

        String serverResponse = serverDecrypted.responseKey.encrypt(rawResponse);

        String clientDecrypted = clientRequest.responseKey.decryptString(serverResponse);

        assert clientDecrypted.equals(rawResponse);
    }
}
