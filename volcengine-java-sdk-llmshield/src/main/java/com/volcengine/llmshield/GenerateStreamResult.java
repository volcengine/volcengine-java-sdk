package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

// 生成结果类
// 忽略值为null的字段
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenerateStreamResult {
    // 优化内容，isFinished为true时为空
    @JsonProperty("Message")
    private MessageV2 message;

    // 标识是否结束
    @JsonProperty("IsFinished")
    private boolean isFinished;

    // 总结信息，isFinished为true时有值
//    @JsonProperty("Summarize")
//    private GenerateSummarizeV2 summarize;

    // 无参构造函数（JSON反序列化需要）
    public GenerateStreamResult() {}

    // Getter 和 Setter 方法
    public MessageV2 getMessage() {
        return message;
    }

    public void setMessage(MessageV2 message) {
        this.message = message;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

//    public GenerateSummarizeV2 getSummarize() {
//        return summarize;
//    }
//
//    public void setSummarize(GenerateSummarizeV2 summarize) {
//        this.summarize = summarize;
//    }
}
