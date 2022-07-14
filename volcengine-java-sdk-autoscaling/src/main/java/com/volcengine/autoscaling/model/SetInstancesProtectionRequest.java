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
 * SetInstancesProtectionRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:22:44.255986+08:00[Asia/Shanghai]")
public class SetInstancesProtectionRequest {
  @SerializedName("InstanceIds")
  private List<String> instanceIds = null;

  @SerializedName("ProtectedFromScaleIn")
  private Boolean protectedFromScaleIn = null;

  @SerializedName("ScalingGroupId")
  private String scalingGroupId = null;

  public SetInstancesProtectionRequest instanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
    return this;
  }

  public SetInstancesProtectionRequest addInstanceIdsItem(String instanceIdsItem) {
    if (this.instanceIds == null) {
      this.instanceIds = new ArrayList<String>();
    }
    this.instanceIds.add(instanceIdsItem);
    return this;
  }

   /**
   * Get instanceIds
   * @return instanceIds
  **/
  @Schema(description = "")
  public List<String> getInstanceIds() {
    return instanceIds;
  }

  public void setInstanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
  }

  public SetInstancesProtectionRequest protectedFromScaleIn(Boolean protectedFromScaleIn) {
    this.protectedFromScaleIn = protectedFromScaleIn;
    return this;
  }

   /**
   * Get protectedFromScaleIn
   * @return protectedFromScaleIn
  **/
  @Schema(description = "")
  public Boolean isProtectedFromScaleIn() {
    return protectedFromScaleIn;
  }

  public void setProtectedFromScaleIn(Boolean protectedFromScaleIn) {
    this.protectedFromScaleIn = protectedFromScaleIn;
  }

  public SetInstancesProtectionRequest scalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
    return this;
  }

   /**
   * Get scalingGroupId
   * @return scalingGroupId
  **/
  @Schema(description = "")
  public String getScalingGroupId() {
    return scalingGroupId;
  }

  public void setScalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetInstancesProtectionRequest setInstancesProtectionRequest = (SetInstancesProtectionRequest) o;
    return Objects.equals(this.instanceIds, setInstancesProtectionRequest.instanceIds) &&
        Objects.equals(this.protectedFromScaleIn, setInstancesProtectionRequest.protectedFromScaleIn) &&
        Objects.equals(this.scalingGroupId, setInstancesProtectionRequest.scalingGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceIds, protectedFromScaleIn, scalingGroupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetInstancesProtectionRequest {\n");
    
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
    sb.append("    protectedFromScaleIn: ").append(toIndentedString(protectedFromScaleIn)).append("\n");
    sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
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
