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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeNotificationConfigurationsRequest
 */


public class DescribeNotificationConfigurationsRequest {
  @SerializedName("ScalingGroupIds")
  private List<String> scalingGroupIds = null;

  public DescribeNotificationConfigurationsRequest scalingGroupIds(List<String> scalingGroupIds) {
    this.scalingGroupIds = scalingGroupIds;
    return this;
  }

  public DescribeNotificationConfigurationsRequest addScalingGroupIdsItem(String scalingGroupIdsItem) {
    if (this.scalingGroupIds == null) {
      this.scalingGroupIds = new ArrayList<String>();
    }
    this.scalingGroupIds.add(scalingGroupIdsItem);
    return this;
  }

   /**
   * Get scalingGroupIds
   * @return scalingGroupIds
  **/
  @Schema(description = "")
  public List<String> getScalingGroupIds() {
    return scalingGroupIds;
  }

  public void setScalingGroupIds(List<String> scalingGroupIds) {
    this.scalingGroupIds = scalingGroupIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest = (DescribeNotificationConfigurationsRequest) o;
    return Objects.equals(this.scalingGroupIds, describeNotificationConfigurationsRequest.scalingGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scalingGroupIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeNotificationConfigurationsRequest {\n");
    
    sb.append("    scalingGroupIds: ").append(toIndentedString(scalingGroupIds)).append("\n");
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
