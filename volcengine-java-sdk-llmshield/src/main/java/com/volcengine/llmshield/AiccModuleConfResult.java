package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

// AICC 模块配置结果结构
public class AiccModuleConfResult {
    private static final ObjectMapper MAPPER = new ObjectMapper()
            .enable(SerializationFeature.INDENT_OUTPUT);

    @JsonProperty("PccUrl")
    private String pccUrl;

    @JsonProperty("AccID")
    private String accID;

    @JsonProperty("ServerID")
    private String serverID;

    @JsonProperty("ServerName")
    private String serverName;

    @JsonProperty("TrnInfo")
    private String trnInfo;

    public String getPccUrl() {
        return pccUrl;
    }

    public void setPccUrl(String pccUrl) {
        this.pccUrl = pccUrl;
    }

    public String getAccID() {
        return accID;
    }

    public void setAccID(String accID) {
        this.accID = accID;
    }

    public String getServerID() {
        return serverID;
    }

    public void setServerID(String serverID) {
        this.serverID = serverID;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getTrnInfo() {
        return trnInfo;
    }

    public void setTrnInfo(String trnInfo) {
        this.trnInfo = trnInfo;
    }

    @Override
    public String toString() {
        try {
            return MAPPER.writeValueAsString(this);
        } catch (Exception e) {
            return super.toString();
        }
    }
}
