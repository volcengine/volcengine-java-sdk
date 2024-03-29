/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.autoscaling.model;

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
 * CompleteLifecycleActivityResponse
 */


public class CompleteLifecycleActivityResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("LifecycleActivityId")
  private String lifecycleActivityId = null;

  public CompleteLifecycleActivityResponse instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public CompleteLifecycleActivityResponse lifecycleActivityId(String lifecycleActivityId) {
    this.lifecycleActivityId = lifecycleActivityId;
    return this;
  }

   /**
   * Get lifecycleActivityId
   * @return lifecycleActivityId
  **/
  @Schema(description = "")
  public String getLifecycleActivityId() {
    return lifecycleActivityId;
  }

  public void setLifecycleActivityId(String lifecycleActivityId) {
    this.lifecycleActivityId = lifecycleActivityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteLifecycleActivityResponse completeLifecycleActivityResponse = (CompleteLifecycleActivityResponse) o;
    return Objects.equals(this.instanceId, completeLifecycleActivityResponse.instanceId) &&
        Objects.equals(this.lifecycleActivityId, completeLifecycleActivityResponse.lifecycleActivityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, lifecycleActivityId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteLifecycleActivityResponse {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    lifecycleActivityId: ").append(toIndentedString(lifecycleActivityId)).append("\n");
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
