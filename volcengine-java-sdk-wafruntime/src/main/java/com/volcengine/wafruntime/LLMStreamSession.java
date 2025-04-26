package com.volcengine.wafruntime;
import com.volcengine.waf.model.CheckLLMResponseStreamResponse;

/**
 * 表示一个流会话的类，包含流缓冲区、流发送长度和消息 ID 等信息。
 */
public class LLMStreamSession {
    // 流缓冲区，用于存储流数据
    private String streamBuf;
    // 流发送的长度
    private int streamSendLen;
    // 消息的唯一标识符
    private String msgID;
    // 存储默认响应体
    private CheckLLMResponseStreamResponse defaultBody;

    /**
     * 默认构造方法，初始化成员变量为默认值。
     */
    public LLMStreamSession() {
        this.streamBuf = "";
        this.streamSendLen = 0;
        this.msgID = "";
        this.defaultBody = null;
    }

    /**
     * 构造方法，允许在创建对象时初始化所有成员变量。
     *
     * @param streamBuf     流缓冲区的初始值
     * @param streamSendLen 流发送长度的初始值
     * @param msgID         消息 ID 的初始值
     * @param defaultBody   默认响应体的初始值
     */
    public LLMStreamSession(String streamBuf, int streamSendLen, String msgID, CheckLLMResponseStreamResponse defaultBody) {
        this.streamBuf = streamBuf;
        this.streamSendLen = streamSendLen;
        this.msgID = msgID;
        this.defaultBody = defaultBody;
    }

    /**
     * 获取流缓冲区的值。
     *
     * @return 流缓冲区的值
     */
    public String getStreamBuf() {
        return streamBuf;
    }

    /**
     * 设置流缓冲区的值。
     *
     * @param streamBuf 要设置的流缓冲区的值
     */
    public void setStreamBuf(String streamBuf) {
        this.streamBuf = streamBuf;
    }

    /**
     * 获取流发送长度的值。
     *
     * @return 流发送长度的值
     */
    public int getStreamSendLen() {
        return streamSendLen;
    }

    /**
     * 设置流发送长度的值。
     *
     * @param streamSendLen 要设置的流发送长度的值
     */
    public void setStreamSendLen(int streamSendLen) {
        this.streamSendLen = streamSendLen;
    }

    /**
     * 获取消息 ID 的值。
     *
     * @return 消息 ID 的值
     */
    public String getMsgID() {
        return msgID;
    }

    /**
     * 设置消息 ID 的值。
     *
     * @param msgID 要设置的消息 ID 的值
     */
    public void setMsgID(String msgID) {
        this.msgID = msgID;
    }

    /**
     * 获取默认响应体。
     *
     * @return 默认响应体
     */
    public CheckLLMResponseStreamResponse getDefaultBody() {
        return defaultBody;
    }

    /**
     * 设置默认响应体。
     *
     * @param defaultBody 要设置的默认响应体
     */
    public void setDefaultBody(CheckLLMResponseStreamResponse defaultBody) {
        this.defaultBody = defaultBody;
    }

    /**
     * 向流缓冲区追加一个字符串，并更新流发送长度。
     * 如果 defaultBody 不为空，也可以在这里进行相关操作
     *
     * @param str 要追加的字符串
     */
    public void appendStreamBuf(String str) {
        if (str != null) {
            this.streamBuf += str;
            this.streamSendLen += str.length();
        }
    }

    /**
     * 重写 toString 方法，返回对象的字符串表示形式。
     *
     * @return 对象的字符串表示形式
     */
    @Override
    public String toString() {
        return "LLMStreamSession{" +
                "streamBuf='" + streamBuf + '\'' +
                ", streamSendLen=" + streamSendLen +
                ", msgID='" + msgID + '\'' +
                ", defaultBody=" + defaultBody +
                '}';
    }
}