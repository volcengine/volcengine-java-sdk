package com.volcengine.llmshield;
import com.fasterxml.jackson.annotation.JsonProperty;

// 生成请求类
public class GenerateStreamV2Request {
    @JsonProperty("MsgID")
    private String msgID;

    public String getMsgID() {
        return msgID;
    }

    public void setMsgID(String msgID) {
        this.msgID = msgID;
    }
}
















