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
 * AttachInstancesResponse
 */


public class AttachInstancesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("ScalingActivityId")
  private String scalingActivityId = null;

  public AttachInstancesResponse scalingActivityId(String scalingActivityId) {
    this.scalingActivityId = scalingActivityId;
    return this;
  }

   /**
   * Get scalingActivityId
   * @return scalingActivityId
  **/
  @Schema(description = "")
  public String getScalingActivityId() {
    return scalingActivityId;
  }

  public void setScalingActivityId(String scalingActivityId) {
    this.scalingActivityId = scalingActivityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachInstancesResponse attachInstancesResponse = (AttachInstancesResponse) o;
    return Objects.equals(this.scalingActivityId, attachInstancesResponse.scalingActivityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scalingActivityId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachInstancesResponse {\n");
    
    sb.append("    scalingActivityId: ").append(toIndentedString(scalingActivityId)).append("\n");
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
