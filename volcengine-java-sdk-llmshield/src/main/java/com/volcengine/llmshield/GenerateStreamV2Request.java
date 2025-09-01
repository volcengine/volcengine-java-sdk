package com.volcengine.llmshield;
import com.fasterxml.jackson.annotation.JsonProperty;

// 生成请求类
public class GenerateStreamV2Request {
    @JsonProperty("MsgID")
    private String msgID;

    @JsonProperty("UseStream")
    private boolean useStream;

    public String getMsgID() {
        return msgID;
    }

    public void setMsgID(String msgID) {
        this.msgID = msgID;
    }

    public boolean isUseStream() {
        return useStream;
    }

    public void setUseStream(boolean useStream) {
        this.useStream = useStream;
    }
}
















