/*
 * kafka
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.kafka.model;

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
 * MessageListForQueryMessageByTimestampOutput
 */



public class MessageListForQueryMessageByTimestampOutput {
  @SerializedName("CreateTime")
  private Long createTime = null;

  @SerializedName("Key")
  private String key = null;

  @SerializedName("Message")
  private String message = null;

  @SerializedName("MessageOffset")
  private Long messageOffset = null;

  @SerializedName("MessageSize")
  private Integer messageSize = null;

  @SerializedName("PartitionId")
  private Integer partitionId = null;

  @SerializedName("TopicName")
  private String topicName = null;

  public MessageListForQueryMessageByTimestampOutput createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public MessageListForQueryMessageByTimestampOutput key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public MessageListForQueryMessageByTimestampOutput message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public MessageListForQueryMessageByTimestampOutput messageOffset(Long messageOffset) {
    this.messageOffset = messageOffset;
    return this;
  }

   /**
   * Get messageOffset
   * @return messageOffset
  **/
  @Schema(description = "")
  public Long getMessageOffset() {
    return messageOffset;
  }

  public void setMessageOffset(Long messageOffset) {
    this.messageOffset = messageOffset;
  }

  public MessageListForQueryMessageByTimestampOutput messageSize(Integer messageSize) {
    this.messageSize = messageSize;
    return this;
  }

   /**
   * Get messageSize
   * @return messageSize
  **/
  @Schema(description = "")
  public Integer getMessageSize() {
    return messageSize;
  }

  public void setMessageSize(Integer messageSize) {
    this.messageSize = messageSize;
  }

  public MessageListForQueryMessageByTimestampOutput partitionId(Integer partitionId) {
    this.partitionId = partitionId;
    return this;
  }

   /**
   * Get partitionId
   * @return partitionId
  **/
  @Schema(description = "")
  public Integer getPartitionId() {
    return partitionId;
  }

  public void setPartitionId(Integer partitionId) {
    this.partitionId = partitionId;
  }

  public MessageListForQueryMessageByTimestampOutput topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

   /**
   * Get topicName
   * @return topicName
  **/
  @Schema(description = "")
  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageListForQueryMessageByTimestampOutput messageListForQueryMessageByTimestampOutput = (MessageListForQueryMessageByTimestampOutput) o;
    return Objects.equals(this.createTime, messageListForQueryMessageByTimestampOutput.createTime) &&
        Objects.equals(this.key, messageListForQueryMessageByTimestampOutput.key) &&
        Objects.equals(this.message, messageListForQueryMessageByTimestampOutput.message) &&
        Objects.equals(this.messageOffset, messageListForQueryMessageByTimestampOutput.messageOffset) &&
        Objects.equals(this.messageSize, messageListForQueryMessageByTimestampOutput.messageSize) &&
        Objects.equals(this.partitionId, messageListForQueryMessageByTimestampOutput.partitionId) &&
        Objects.equals(this.topicName, messageListForQueryMessageByTimestampOutput.topicName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, key, message, messageOffset, messageSize, partitionId, topicName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageListForQueryMessageByTimestampOutput {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageOffset: ").append(toIndentedString(messageOffset)).append("\n");
    sb.append("    messageSize: ").append(toIndentedString(messageSize)).append("\n");
    sb.append("    partitionId: ").append(toIndentedString(partitionId)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
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
