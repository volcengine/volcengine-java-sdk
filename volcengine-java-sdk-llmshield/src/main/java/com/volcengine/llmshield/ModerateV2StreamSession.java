package com.volcengine.llmshield;

public class ModerateV2StreamSession {
    private static final int LLM_STREAM_SEND_BASE_WINDOW_V2 = 10 ;
    private static final int LLM_STREAM_SEND_EXPONENT_V2 = 2 ;
    private ModerateV2Request request;
    private int streamSendLen = 0;
    private ModerateV2Response defaultOut = null;
    private int  currentSendWindow = LLM_STREAM_SEND_BASE_WINDOW_V2;


    // 获取请求
    public ModerateV2Request getRequest() {
        return this.request;
    }

    // 设置请求
    public void setRequest(ModerateV2Request request) {
        this.request = request;
        this.streamSendLen = request.getMessage().getContent().length();
    }

    // 获取未审核的内容长度
    public int getStreamSendLen() {
        return this.streamSendLen;
    }

    // 设置已审核的内容长度
    public void setStreamSendLen(int streamSendLen) {
        this.streamSendLen = streamSendLen;
    }

    // 获取发送窗口长度
    public int getCurrentSendWindow() {
        return this.currentSendWindow;
    }

    // 设置发送窗口长度
    public void setCurrentSendWindow(int currentSendWindow) {
        this.currentSendWindow = currentSendWindow;
    }
    // 窗口增长
    public  void growSendWindow(){
        this.currentSendWindow = currentSendWindow * LLM_STREAM_SEND_EXPONENT_V2;
    }

    // 获取默认输出
    public ModerateV2Response getDefaultOut() {
        return this.defaultOut;
    }

    /**
     * 设置默认输出结果，并在必要时同步消息ID（MsgID）
     * 当当前请求的MsgID为空时，使用默认输出结果中的MsgID进行填充
     *
     * @param defaultOut 默认输出结果
     */
    public void setDefaultOut(ModerateV2Response defaultOut) {

        // 若默认输出或其结果为空，则无需同步MsgID，直接返回
        if (defaultOut == null || defaultOut.getResult() == null) {
            return;
        }

        // 保存默认输出结果到成员变量
        this.defaultOut = defaultOut;


        // 仅当当前请求的MsgID为空时，才从默认输出结果中获取并设置
        String defaultMsgID = defaultOut.getResult().getMsgID();
        if (isBlank(this.request.getMsgID())) {
            this.request.setMsgID(defaultMsgID);
        }
    }

    /**
     * 判断字符串是否为null或空字符串
     *
     * @param str 待判断的字符串
     * @return 若为null或空则返回true，否则返回false
     */
    private boolean isBlank(String str) {
        return str == null || str.length() == 0;
    }

    public void appendRequestContent(ModerateV2Request request) {
        if (request == null) {
            return;
        }

        MessageV2 currentMessage = this.request.getMessage();
        if (currentMessage == null) {
            return;
        }

        MessageV2 requestMessage = request.getMessage();
        if (requestMessage == null) {
            return;
        }

        String currentContent = currentMessage.getContent() != null ? currentMessage.getContent() : "";
        String requestContent = requestMessage.getContent() != null ? requestMessage.getContent() : "";

        currentMessage.setContent(currentContent + requestContent);
        this.streamSendLen += requestContent.length();
        this.request.setUseStream(request.getUseStream());
    }
}

