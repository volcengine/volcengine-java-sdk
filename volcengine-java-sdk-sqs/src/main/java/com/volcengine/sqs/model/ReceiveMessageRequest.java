/*
 * sqs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.sqs.model;

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
 * ReceiveMessageRequest
 */



public class ReceiveMessageRequest {
  @SerializedName("MaxNumberOfMessages")
  private Integer maxNumberOfMessages = null;

  @SerializedName("QueueTrn")
  private String queueTrn = null;

  @SerializedName("WaitTimeSeconds")
  private Integer waitTimeSeconds = null;

  public ReceiveMessageRequest maxNumberOfMessages(Integer maxNumberOfMessages) {
    this.maxNumberOfMessages = maxNumberOfMessages;
    return this;
  }

   /**
   * Get maxNumberOfMessages
   * minimum: 1
   * maximum: 10
   * @return maxNumberOfMessages
  **/
 @Min(1) @Max(10)  @Schema(description = "")
  public Integer getMaxNumberOfMessages() {
    return maxNumberOfMessages;
  }

  public void setMaxNumberOfMessages(Integer maxNumberOfMessages) {
    this.maxNumberOfMessages = maxNumberOfMessages;
  }

  public ReceiveMessageRequest queueTrn(String queueTrn) {
    this.queueTrn = queueTrn;
    return this;
  }

   /**
   * Get queueTrn
   * @return queueTrn
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getQueueTrn() {
    return queueTrn;
  }

  public void setQueueTrn(String queueTrn) {
    this.queueTrn = queueTrn;
  }

  public ReceiveMessageRequest waitTimeSeconds(Integer waitTimeSeconds) {
    this.waitTimeSeconds = waitTimeSeconds;
    return this;
  }

   /**
   * Get waitTimeSeconds
   * minimum: 0
   * maximum: 20
   * @return waitTimeSeconds
  **/
 @Min(0) @Max(20)  @Schema(description = "")
  public Integer getWaitTimeSeconds() {
    return waitTimeSeconds;
  }

  public void setWaitTimeSeconds(Integer waitTimeSeconds) {
    this.waitTimeSeconds = waitTimeSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiveMessageRequest receiveMessageRequest = (ReceiveMessageRequest) o;
    return Objects.equals(this.maxNumberOfMessages, receiveMessageRequest.maxNumberOfMessages) &&
        Objects.equals(this.queueTrn, receiveMessageRequest.queueTrn) &&
        Objects.equals(this.waitTimeSeconds, receiveMessageRequest.waitTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxNumberOfMessages, queueTrn, waitTimeSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiveMessageRequest {\n");
    
    sb.append("    maxNumberOfMessages: ").append(toIndentedString(maxNumberOfMessages)).append("\n");
    sb.append("    queueTrn: ").append(toIndentedString(queueTrn)).append("\n");
    sb.append("    waitTimeSeconds: ").append(toIndentedString(waitTimeSeconds)).append("\n");
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
