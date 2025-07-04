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
 * ListQueuesRequest
 */



public class ListQueuesRequest {
  @SerializedName("MaxResults")
  private Integer maxResults = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("QueueDisplayNamePrefix")
  private String queueDisplayNamePrefix = null;

  public ListQueuesRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * minimum: 1
   * maximum: 100
   * @return maxResults
  **/
 @Min(1) @Max(100)  @Schema(description = "")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public ListQueuesRequest nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @Schema(description = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public ListQueuesRequest queueDisplayNamePrefix(String queueDisplayNamePrefix) {
    this.queueDisplayNamePrefix = queueDisplayNamePrefix;
    return this;
  }

   /**
   * Get queueDisplayNamePrefix
   * @return queueDisplayNamePrefix
  **/
  @Schema(description = "")
  public String getQueueDisplayNamePrefix() {
    return queueDisplayNamePrefix;
  }

  public void setQueueDisplayNamePrefix(String queueDisplayNamePrefix) {
    this.queueDisplayNamePrefix = queueDisplayNamePrefix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListQueuesRequest listQueuesRequest = (ListQueuesRequest) o;
    return Objects.equals(this.maxResults, listQueuesRequest.maxResults) &&
        Objects.equals(this.nextToken, listQueuesRequest.nextToken) &&
        Objects.equals(this.queueDisplayNamePrefix, listQueuesRequest.queueDisplayNamePrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, nextToken, queueDisplayNamePrefix);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListQueuesRequest {\n");
    
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    queueDisplayNamePrefix: ").append(toIndentedString(queueDisplayNamePrefix)).append("\n");
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
