package com.bytedance.jeddak_secure_channel;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import org.jspecify.annotations.Nullable;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ClientConfig {
    public static final String RA_TYPE_LOCAL = "local";
    public static final String RA_TYPE_TCA = "tca";

    @SerializedName("ra_url")
    public String raUrl = "";

    @SerializedName("ra_type")
    public String raType = RA_TYPE_TCA;

    @SerializedName("ra_service_name")
    public String raServiceName = "";

    @SerializedName("ra_uid")
    public String raUid = "";

    @SerializedName("ra_key_negotiation")
    public boolean raKeyNegotiation = true;

    @SerializedName("ra_need_token")
    public boolean raNeedToken = true;

    @SerializedName("ra_policy_id")
    public String raPolicyId = "";

    @SerializedName("bytedance_top_info")
    public String bytedanceTopInfo = "";

    @SerializedName("attest_interval")
    public @Nullable Float attestInterval = null;

    @SerializedName("pub_key_path")
    public @Nullable String pubKeyPath = null;

    // We have introduced package-wide @NullMarked annotation, so all arguments are assumed non-null
    // unless otherwise marked.
    public static ClientConfig fromJson(String json) {
        // Closing StringReader is no-op.
        return fromJson(new StringReader(json));
    }

    public static ClientConfig fromJson(Reader reader) {
        // Method is not frequently called, so repeatedly instantiating Gson is not a problem.
        // It is user's responsibility to pass in good JSON, so JSON exceptions are not handled.
        return new Gson().fromJson(reader, ClientConfig.class);
    }

    public static ClientConfig fromFile(Path path) throws IOException {
        try (InputStream stream = Files.newInputStream(path)) {
            return fromJson(new InputStreamReader(stream));
        }
    }

    TopInfo parseTopInfo() {
        TopInfo info = TopInfo.deserialize(new StringReader(bytedanceTopInfo));
        // If url field is absent, read from ClientConfig.raUrl (for backward compatibility).
        if (info.url.isEmpty()) {
            info.url = raUrl;
        }
        if (!info.url.startsWith("http:") && !info.url.startsWith("https:")) {
            info.url = "https://" + info.url;
        }
        return info;
    }
}
