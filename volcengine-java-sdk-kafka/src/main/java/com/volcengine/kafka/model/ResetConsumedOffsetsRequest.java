/*
 * kafka
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.kafka.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.kafka.model.ResetOffsetsInfoForResetConsumedOffsetsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ResetConsumedOffsetsRequest
 */



public class ResetConsumedOffsetsRequest {
  @SerializedName("GroupId")
  private String groupId = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("ResetOffsetsInfo")
  private List<ResetOffsetsInfoForResetConsumedOffsetsInput> resetOffsetsInfo = null;

  public ResetConsumedOffsetsRequest groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public ResetConsumedOffsetsRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ResetConsumedOffsetsRequest resetOffsetsInfo(List<ResetOffsetsInfoForResetConsumedOffsetsInput> resetOffsetsInfo) {
    this.resetOffsetsInfo = resetOffsetsInfo;
    return this;
  }

  public ResetConsumedOffsetsRequest addResetOffsetsInfoItem(ResetOffsetsInfoForResetConsumedOffsetsInput resetOffsetsInfoItem) {
    if (this.resetOffsetsInfo == null) {
      this.resetOffsetsInfo = new ArrayList<ResetOffsetsInfoForResetConsumedOffsetsInput>();
    }
    this.resetOffsetsInfo.add(resetOffsetsInfoItem);
    return this;
  }

   /**
   * Get resetOffsetsInfo
   * @return resetOffsetsInfo
  **/
  @Valid
  @Schema(description = "")
  public List<ResetOffsetsInfoForResetConsumedOffsetsInput> getResetOffsetsInfo() {
    return resetOffsetsInfo;
  }

  public void setResetOffsetsInfo(List<ResetOffsetsInfoForResetConsumedOffsetsInput> resetOffsetsInfo) {
    this.resetOffsetsInfo = resetOffsetsInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetConsumedOffsetsRequest resetConsumedOffsetsRequest = (ResetConsumedOffsetsRequest) o;
    return Objects.equals(this.groupId, resetConsumedOffsetsRequest.groupId) &&
        Objects.equals(this.instanceId, resetConsumedOffsetsRequest.instanceId) &&
        Objects.equals(this.resetOffsetsInfo, resetConsumedOffsetsRequest.resetOffsetsInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, instanceId, resetOffsetsInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetConsumedOffsetsRequest {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    resetOffsetsInfo: ").append(toIndentedString(resetOffsetsInfo)).append("\n");
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
