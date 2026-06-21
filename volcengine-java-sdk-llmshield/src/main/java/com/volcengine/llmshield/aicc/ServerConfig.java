package com.volcengine.llmshield.aicc;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ServerConfig {
    @SerializedName("tks_url")
    public String tksUrl = null;

    @SerializedName("tks_app_id")
    public String tksAppId = null;

    @SerializedName("tks_ring_id")
    public String tksRingId = null;

    @SerializedName("tks_key_id")
    public String tksKeyId = null;

    @SerializedName("pcc_login_url")
    public String pccLoginUrl = null;

    @SerializedName("pcc_app_id")
    public String pccAppId = null;

    @SerializedName("pcc_password")
    public String pccPassword = null;

    @SerializedName("service_id")
    public String serviceId = null;

    @SerializedName("bytedance_pcc_info")
    public String bytedancePccInfo = "";

    @SerializedName("need_evidence")
    public boolean needEvidence = true;

    @SerializedName("attest_gpu")
    public boolean attestGpu = true;

    @SerializedName("bytedance_top_info")
    public String bytedanceTopInfo = "";

    @SerializedName("refresh_interval")
    public Float refreshInterval = null;

    public static ServerConfig fromJson(String json) {
        // Closing StringReader is no-op.
        return fromJson(new StringReader(json));
    }

    public static ServerConfig fromJson(Reader reader) {
        // Method is not frequently called, so repeatedly instantiating Gson is not a problem.
        // It is user's responsibility to pass in good JSON, so JSON exceptions are not handled.
        return new Gson().fromJson(reader, ServerConfig.class);
    }

    public static ServerConfig fromFile(Path path) throws IOException {
        try (InputStream stream = Files.newInputStream(path)) {
            return fromJson(new InputStreamReader(stream));
        }
    }

    TopInfo parseTopInfo() {
        TopInfo info = TopInfo.deserialize(new StringReader(bytedanceTopInfo));
        if (info.url.isEmpty()) {
            if (tksUrl == null) {
                throw new IllegalArgumentException("TKS url is null");
            }
            info.url = tksUrl;
        }
        if (!info.url.startsWith("http:") && !info.url.startsWith("https:")) {
            info.url = "https://" + info.url;
        }
        return info;
    }
}
