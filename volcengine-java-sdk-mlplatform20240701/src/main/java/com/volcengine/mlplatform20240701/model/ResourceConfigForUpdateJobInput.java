/*
 * ml_platform20240701
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mlplatform20240701.model;

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
 * ResourceConfigForUpdateJobInput
 */



public class ResourceConfigForUpdateJobInput {
  @SerializedName("HoldingTimeSeconds")
  private Long holdingTimeSeconds = null;

  @SerializedName("MaxRuntimeSeconds")
  private Long maxRuntimeSeconds = null;

  @SerializedName("Priority")
  private Integer priority = null;

  public ResourceConfigForUpdateJobInput holdingTimeSeconds(Long holdingTimeSeconds) {
    this.holdingTimeSeconds = holdingTimeSeconds;
    return this;
  }

   /**
   * Get holdingTimeSeconds
   * @return holdingTimeSeconds
  **/
  @Schema(description = "")
  public Long getHoldingTimeSeconds() {
    return holdingTimeSeconds;
  }

  public void setHoldingTimeSeconds(Long holdingTimeSeconds) {
    this.holdingTimeSeconds = holdingTimeSeconds;
  }

  public ResourceConfigForUpdateJobInput maxRuntimeSeconds(Long maxRuntimeSeconds) {
    this.maxRuntimeSeconds = maxRuntimeSeconds;
    return this;
  }

   /**
   * Get maxRuntimeSeconds
   * @return maxRuntimeSeconds
  **/
  @Schema(description = "")
  public Long getMaxRuntimeSeconds() {
    return maxRuntimeSeconds;
  }

  public void setMaxRuntimeSeconds(Long maxRuntimeSeconds) {
    this.maxRuntimeSeconds = maxRuntimeSeconds;
  }

  public ResourceConfigForUpdateJobInput priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(description = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceConfigForUpdateJobInput resourceConfigForUpdateJobInput = (ResourceConfigForUpdateJobInput) o;
    return Objects.equals(this.holdingTimeSeconds, resourceConfigForUpdateJobInput.holdingTimeSeconds) &&
        Objects.equals(this.maxRuntimeSeconds, resourceConfigForUpdateJobInput.maxRuntimeSeconds) &&
        Objects.equals(this.priority, resourceConfigForUpdateJobInput.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holdingTimeSeconds, maxRuntimeSeconds, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceConfigForUpdateJobInput {\n");
    
    sb.append("    holdingTimeSeconds: ").append(toIndentedString(holdingTimeSeconds)).append("\n");
    sb.append("    maxRuntimeSeconds: ").append(toIndentedString(maxRuntimeSeconds)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
