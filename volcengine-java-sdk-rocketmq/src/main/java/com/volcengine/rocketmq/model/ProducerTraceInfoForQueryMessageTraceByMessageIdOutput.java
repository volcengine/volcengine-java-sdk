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
 * ProducerTraceInfoForQueryMessageTraceByMessageIdOutput
 */



public class ProducerTraceInfoForQueryMessageTraceByMessageIdOutput {
  @SerializedName("MessageBornHost")
  private String messageBornHost = null;

  @SerializedName("MessageBornTimestamp")
  private Long messageBornTimestamp = null;

  @SerializedName("SendCostTimeMs")
  private Integer sendCostTimeMs = null;

  @SerializedName("SendStatus")
  private String sendStatus = null;

  public ProducerTraceInfoForQueryMessageTraceByMessageIdOutput messageBornHost(String messageBornHost) {
    this.messageBornHost = messageBornHost;
    return this;
  }

   /**
   * Get messageBornHost
   * @return messageBornHost
  **/
  @Schema(description = "")
  public String getMessageBornHost() {
    return messageBornHost;
  }

  public void setMessageBornHost(String messageBornHost) {
    this.messageBornHost = messageBornHost;
  }

  public ProducerTraceInfoForQueryMessageTraceByMessageIdOutput messageBornTimestamp(Long messageBornTimestamp) {
    this.messageBornTimestamp = messageBornTimestamp;
    return this;
  }

   /**
   * Get messageBornTimestamp
   * @return messageBornTimestamp
  **/
  @Schema(description = "")
  public Long getMessageBornTimestamp() {
    return messageBornTimestamp;
  }

  public void setMessageBornTimestamp(Long messageBornTimestamp) {
    this.messageBornTimestamp = messageBornTimestamp;
  }

  public ProducerTraceInfoForQueryMessageTraceByMessageIdOutput sendCostTimeMs(Integer sendCostTimeMs) {
    this.sendCostTimeMs = sendCostTimeMs;
    return this;
  }

   /**
   * Get sendCostTimeMs
   * @return sendCostTimeMs
  **/
  @Schema(description = "")
  public Integer getSendCostTimeMs() {
    return sendCostTimeMs;
  }

  public void setSendCostTimeMs(Integer sendCostTimeMs) {
    this.sendCostTimeMs = sendCostTimeMs;
  }

  public ProducerTraceInfoForQueryMessageTraceByMessageIdOutput sendStatus(String sendStatus) {
    this.sendStatus = sendStatus;
    return this;
  }

   /**
   * Get sendStatus
   * @return sendStatus
  **/
  @Schema(description = "")
  public String getSendStatus() {
    return sendStatus;
  }

  public void setSendStatus(String sendStatus) {
    this.sendStatus = sendStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProducerTraceInfoForQueryMessageTraceByMessageIdOutput producerTraceInfoForQueryMessageTraceByMessageIdOutput = (ProducerTraceInfoForQueryMessageTraceByMessageIdOutput) o;
    return Objects.equals(this.messageBornHost, producerTraceInfoForQueryMessageTraceByMessageIdOutput.messageBornHost) &&
        Objects.equals(this.messageBornTimestamp, producerTraceInfoForQueryMessageTraceByMessageIdOutput.messageBornTimestamp) &&
        Objects.equals(this.sendCostTimeMs, producerTraceInfoForQueryMessageTraceByMessageIdOutput.sendCostTimeMs) &&
        Objects.equals(this.sendStatus, producerTraceInfoForQueryMessageTraceByMessageIdOutput.sendStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageBornHost, messageBornTimestamp, sendCostTimeMs, sendStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProducerTraceInfoForQueryMessageTraceByMessageIdOutput {\n");
    
    sb.append("    messageBornHost: ").append(toIndentedString(messageBornHost)).append("\n");
    sb.append("    messageBornTimestamp: ").append(toIndentedString(messageBornTimestamp)).append("\n");
    sb.append("    sendCostTimeMs: ").append(toIndentedString(sendCostTimeMs)).append("\n");
    sb.append("    sendStatus: ").append(toIndentedString(sendStatus)).append("\n");
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
