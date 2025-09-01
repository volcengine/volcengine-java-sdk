package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

// 审核请求结构
public class ModerateV2Request {
    @JsonProperty("Message")
    private MessageV2 message;  // 审核内容

    @JsonProperty("MsgID")
    private String msgID;       // 绑定流式送检会话的id

    @JsonProperty("UseStream")
    private long useStream;     // 0:不使用流式一次性审核，1:使用流式

    @JsonProperty("Scene")
    private String scene;       // 场景 @tpl=select @enums=SCENE

    @JsonProperty("History")
    private List<MessageV2> history;  // 历史消息

    // 深拷贝构造方法：接收另一个ModerateV2Request实例，复制所有内容（包括引用类型的深度拷贝）
    public ModerateV2Request(ModerateV2Request other) {
        // 基本类型/字符串：直接赋值（字符串是不可变的，无需深拷贝）
        this.msgID = other.msgID;
        this.useStream = other.useStream;
        this.scene = other.scene;

        // MessageV2：如果不为null，调用其深拷贝构造方法
        if (other.message != null) {
            this.message = new MessageV2(other.message); // 假设MessageV2有深拷贝构造方法
        }

        // List<MessageV2>：新建List并对每个元素深拷贝
        if (other.history != null) {
            this.history = new ArrayList<>();
            for (MessageV2 msg : other.history) {
                this.history.add(new MessageV2(msg)); // 假设MessageV2有深拷贝构造方法
            }
        }
    }

    // 无参构造方法（保留，方便JSON反序列化等场景）
    public ModerateV2Request() {}
    // Getters and Setters
    public MessageV2 getMessage() {
        return message;
    }

    public void setMessage(MessageV2 message) {
        this.message = message;
    }

    public String getMsgID() {
        return msgID;
    }

    public void setMsgID(String msgID) {
        this.msgID = msgID;
    }

    public long getUseStream() {
        return useStream;
    }

    public void setUseStream(long useStream) {
        this.useStream = useStream;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public List<MessageV2> getHistory() {
        return history;
    }

    public void setHistory(List<MessageV2> history) {
        this.history = history;
    }
    // 追加单条历史消息
    public ModerateV2Request appendHistory(MessageV2 message) {
        if (this.history == null) {
            this.history = new ArrayList<>();
        }
        this.history.add(message);
        return this; // 支持链式调用
    }
}
