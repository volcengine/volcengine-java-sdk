/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

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
 * TLSAccessLogForDescribeLoadBalancerAttributesOutput
 */



public class TLSAccessLogForDescribeLoadBalancerAttributesOutput {
  @SerializedName("Enabled")
  private Boolean enabled = null;

  @SerializedName("ProjectId")
  private String projectId = null;

  @SerializedName("TopicId")
  private String topicId = null;

  public TLSAccessLogForDescribeLoadBalancerAttributesOutput enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public TLSAccessLogForDescribeLoadBalancerAttributesOutput projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @Schema(description = "")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public TLSAccessLogForDescribeLoadBalancerAttributesOutput topicId(String topicId) {
    this.topicId = topicId;
    return this;
  }

   /**
   * Get topicId
   * @return topicId
  **/
  @Schema(description = "")
  public String getTopicId() {
    return topicId;
  }

  public void setTopicId(String topicId) {
    this.topicId = topicId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TLSAccessLogForDescribeLoadBalancerAttributesOutput tlSAccessLogForDescribeLoadBalancerAttributesOutput = (TLSAccessLogForDescribeLoadBalancerAttributesOutput) o;
    return Objects.equals(this.enabled, tlSAccessLogForDescribeLoadBalancerAttributesOutput.enabled) &&
        Objects.equals(this.projectId, tlSAccessLogForDescribeLoadBalancerAttributesOutput.projectId) &&
        Objects.equals(this.topicId, tlSAccessLogForDescribeLoadBalancerAttributesOutput.topicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, projectId, topicId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TLSAccessLogForDescribeLoadBalancerAttributesOutput {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
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
