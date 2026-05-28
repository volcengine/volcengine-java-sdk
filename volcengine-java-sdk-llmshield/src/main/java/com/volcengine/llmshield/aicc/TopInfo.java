package com.bytedance.jeddak_secure_channel;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.Reader;
import java.util.Map;

final class TopInfo {
    @SerializedName("ak")
    String ak = "";

    @SerializedName("sk")
    String sk = "";

    @SuppressWarnings("NotNullFieldNotInitialized")
    @SerializedName("service")
    String service;

    @SerializedName("region")
    String region = "cn-beijing";

    @SerializedName("method")
    String method = "POST";

    /**
     * @deprecated Specify action via {@link Top#requestTop(TopInfo, String, Map, byte[])} instead.
     */
    @SerializedName("action")
    @Deprecated()
    String action = "GetAttestationBackend";

    @SerializedName("version")
    String version = "2024-12-24";

    @SerializedName("url")
    String url = "";

    @SerializedName("url_rewrite")
    String urlRewrite = "";

    static TopInfo deserialize(Reader reader) {
        return new Gson().fromJson(reader, TopInfo.class);
    }
}
