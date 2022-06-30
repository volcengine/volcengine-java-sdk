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
 * DeleteLifecycleHookRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:12.731669+08:00[Asia/Shanghai]")
public class DeleteLifecycleHookRequest {
  @SerializedName("LifecycleHookId")
  private String lifecycleHookId = null;

  public DeleteLifecycleHookRequest lifecycleHookId(String lifecycleHookId) {
    this.lifecycleHookId = lifecycleHookId;
    return this;
  }

   /**
   * Get lifecycleHookId
   * @return lifecycleHookId
  **/
  @Schema(description = "")
  public String getLifecycleHookId() {
    return lifecycleHookId;
  }

  public void setLifecycleHookId(String lifecycleHookId) {
    this.lifecycleHookId = lifecycleHookId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteLifecycleHookRequest deleteLifecycleHookRequest = (DeleteLifecycleHookRequest) o;
    return Objects.equals(this.lifecycleHookId, deleteLifecycleHookRequest.lifecycleHookId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycleHookId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteLifecycleHookRequest {\n");
    
    sb.append("    lifecycleHookId: ").append(toIndentedString(lifecycleHookId)).append("\n");
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