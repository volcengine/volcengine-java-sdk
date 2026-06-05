package com.volcengine.llmshield.aicc;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

enum Eps {
    ;

    static byte[] getEvidence(String nonce, EpsInfo epsInfo) throws IOException {
        String urlString =
                epsInfo.url
                        + "/aa/evidence?pod_name="
                        + URLEncoder.encode(epsInfo.podName, StandardCharsets.UTF_8.toString())
                        + "&attest_gpu="
                        + epsInfo.attestGpu
                        + "&runtime_data="
                        + URLEncoder.encode(nonce, StandardCharsets.UTF_8.toString());
        URL url;
        try {
            url = URI.create(urlString).toURL();
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        try {
            return Utils.responseBytes(connection);
        } finally {
            connection.disconnect();
        }
    }
}
