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
 * DeleteScalingPolicyRequest
 */


public class DeleteScalingPolicyRequest {
  @SerializedName("ScalingPolicyId")
  private String scalingPolicyId = null;

  public DeleteScalingPolicyRequest scalingPolicyId(String scalingPolicyId) {
    this.scalingPolicyId = scalingPolicyId;
    return this;
  }

   /**
   * Get scalingPolicyId
   * @return scalingPolicyId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getScalingPolicyId() {
    return scalingPolicyId;
  }

  public void setScalingPolicyId(String scalingPolicyId) {
    this.scalingPolicyId = scalingPolicyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteScalingPolicyRequest deleteScalingPolicyRequest = (DeleteScalingPolicyRequest) o;
    return Objects.equals(this.scalingPolicyId, deleteScalingPolicyRequest.scalingPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scalingPolicyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteScalingPolicyRequest {\n");
    
    sb.append("    scalingPolicyId: ").append(toIndentedString(scalingPolicyId)).append("\n");
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
