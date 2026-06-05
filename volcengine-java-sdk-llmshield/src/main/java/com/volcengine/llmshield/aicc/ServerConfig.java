package com.volcengine.llmshield.aicc;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import org.jspecify.annotations.Nullable;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ServerConfig {
    @SerializedName("tks_url")
    public @Nullable String tksUrl = null;

    @SerializedName("tks_app_id")
    public @Nullable String tksAppId = null;

    @SerializedName("tks_ring_id")
    public @Nullable String tksRingId = null;

    @SerializedName("tks_key_id")
    public @Nullable String tksKeyId = null;

    @SerializedName("pcc_login_url")
    public @Nullable String pccLoginUrl = null;

    @SerializedName("pcc_app_id")
    public @Nullable String pccAppId = null;

    @SerializedName("pcc_password")
    public @Nullable String pccPassword = null;

    @SerializedName("service_id")
    public @Nullable String serviceId = null;

    @SerializedName("bytedance_pcc_info")
    public String bytedancePccInfo = "";

    @SerializedName("need_evidence")
    public boolean needEvidence = true;

    @SerializedName("attest_gpu")
    public boolean attestGpu = true;

    @SerializedName("bytedance_top_info")
    public String bytedanceTopInfo = "";

    @SerializedName("refresh_interval")
    public @Nullable Float refreshInterval = null;

    // We have introduced package-wide @NullMarked annotation, so all arguments are assumed non-null
    // unless otherwise marked.
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
