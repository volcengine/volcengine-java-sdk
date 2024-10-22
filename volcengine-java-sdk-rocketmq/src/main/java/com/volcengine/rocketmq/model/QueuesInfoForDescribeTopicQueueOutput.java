/*
 * rocketmq
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rocketmq.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * QueuesInfoForDescribeTopicQueueOutput
 */



public class QueuesInfoForDescribeTopicQueueOutput {
  @SerializedName("EndOffset")
  private Integer endOffset = null;

  @SerializedName("LastUpdateTimestamp")
  private Long lastUpdateTimestamp = null;

  @SerializedName("MessageCount")
  private Integer messageCount = null;

  @SerializedName("QueueId")
  private String queueId = null;

  @SerializedName("StartOffset")
  private Integer startOffset = null;

  public QueuesInfoForDescribeTopicQueueOutput endOffset(Integer endOffset) {
    this.endOffset = endOffset;
    return this;
  }

   /**
   * Get endOffset
   * @return endOffset
  **/
  @Schema(description = "")
  public Integer getEndOffset() {
    return endOffset;
  }

  public void setEndOffset(Integer endOffset) {
    this.endOffset = endOffset;
  }

  public QueuesInfoForDescribeTopicQueueOutput lastUpdateTimestamp(Long lastUpdateTimestamp) {
    this.lastUpdateTimestamp = lastUpdateTimestamp;
    return this;
  }

   /**
   * Get lastUpdateTimestamp
   * @return lastUpdateTimestamp
  **/
  @Schema(description = "")
  public Long getLastUpdateTimestamp() {
    return lastUpdateTimestamp;
  }

  public void setLastUpdateTimestamp(Long lastUpdateTimestamp) {
    this.lastUpdateTimestamp = lastUpdateTimestamp;
  }

  public QueuesInfoForDescribeTopicQueueOutput messageCount(Integer messageCount) {
    this.messageCount = messageCount;
    return this;
  }

   /**
   * Get messageCount
   * @return messageCount
  **/
  @Schema(description = "")
  public Integer getMessageCount() {
    return messageCount;
  }

  public void setMessageCount(Integer messageCount) {
    this.messageCount = messageCount;
  }

  public QueuesInfoForDescribeTopicQueueOutput queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }

   /**
   * Get queueId
   * @return queueId
  **/
  @Schema(description = "")
  public String getQueueId() {
    return queueId;
  }

  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  public QueuesInfoForDescribeTopicQueueOutput startOffset(Integer startOffset) {
    this.startOffset = startOffset;
    return this;
  }

   /**
   * Get startOffset
   * @return startOffset
  **/
  @Schema(description = "")
  public Integer getStartOffset() {
    return startOffset;
  }

  public void setStartOffset(Integer startOffset) {
    this.startOffset = startOffset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueuesInfoForDescribeTopicQueueOutput queuesInfoForDescribeTopicQueueOutput = (QueuesInfoForDescribeTopicQueueOutput) o;
    return Objects.equals(this.endOffset, queuesInfoForDescribeTopicQueueOutput.endOffset) &&
        Objects.equals(this.lastUpdateTimestamp, queuesInfoForDescribeTopicQueueOutput.lastUpdateTimestamp) &&
        Objects.equals(this.messageCount, queuesInfoForDescribeTopicQueueOutput.messageCount) &&
        Objects.equals(this.queueId, queuesInfoForDescribeTopicQueueOutput.queueId) &&
        Objects.equals(this.startOffset, queuesInfoForDescribeTopicQueueOutput.startOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endOffset, lastUpdateTimestamp, messageCount, queueId, startOffset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueuesInfoForDescribeTopicQueueOutput {\n");
    
    sb.append("    endOffset: ").append(toIndentedString(endOffset)).append("\n");
    sb.append("    lastUpdateTimestamp: ").append(toIndentedString(lastUpdateTimestamp)).append("\n");
    sb.append("    messageCount: ").append(toIndentedString(messageCount)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    startOffset: ").append(toIndentedString(startOffset)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
