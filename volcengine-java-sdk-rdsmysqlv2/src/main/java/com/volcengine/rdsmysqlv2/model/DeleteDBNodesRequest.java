/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

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
 * DeleteDBNodesRequest
 */



public class DeleteDBNodesRequest {
  @SerializedName("DBNodeIds")
  private List<String> dbNodeIds = null;

  @SerializedName("EstimateOnly")
  private Boolean estimateOnly = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("RequestSource")
  private String requestSource = null;

  @SerializedName("SpecifiedSwitchEndTime")
  private String specifiedSwitchEndTime = null;

  @SerializedName("SpecifiedSwitchStartTime")
  private String specifiedSwitchStartTime = null;

  @SerializedName("SwitchType")
  private String switchType = null;

  public DeleteDBNodesRequest dbNodeIds(List<String> dbNodeIds) {
    this.dbNodeIds = dbNodeIds;
    return this;
  }

  public DeleteDBNodesRequest addDbNodeIdsItem(String dbNodeIdsItem) {
    if (this.dbNodeIds == null) {
      this.dbNodeIds = new ArrayList<String>();
    }
    this.dbNodeIds.add(dbNodeIdsItem);
    return this;
  }

   /**
   * Get dbNodeIds
   * @return dbNodeIds
  **/
  @Schema(description = "")
  public List<String> getDbNodeIds() {
    return dbNodeIds;
  }

  public void setDbNodeIds(List<String> dbNodeIds) {
    this.dbNodeIds = dbNodeIds;
  }

  public DeleteDBNodesRequest estimateOnly(Boolean estimateOnly) {
    this.estimateOnly = estimateOnly;
    return this;
  }

   /**
   * Get estimateOnly
   * @return estimateOnly
  **/
  @Schema(description = "")
  public Boolean isEstimateOnly() {
    return estimateOnly;
  }

  public void setEstimateOnly(Boolean estimateOnly) {
    this.estimateOnly = estimateOnly;
  }

  public DeleteDBNodesRequest instanceId(String instanceId) {
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

  public DeleteDBNodesRequest requestSource(String requestSource) {
    this.requestSource = requestSource;
    return this;
  }

   /**
   * Get requestSource
   * @return requestSource
  **/
  @Schema(description = "")
  public String getRequestSource() {
    return requestSource;
  }

  public void setRequestSource(String requestSource) {
    this.requestSource = requestSource;
  }

  public DeleteDBNodesRequest specifiedSwitchEndTime(String specifiedSwitchEndTime) {
    this.specifiedSwitchEndTime = specifiedSwitchEndTime;
    return this;
  }

   /**
   * Get specifiedSwitchEndTime
   * @return specifiedSwitchEndTime
  **/
  @Schema(description = "")
  public String getSpecifiedSwitchEndTime() {
    return specifiedSwitchEndTime;
  }

  public void setSpecifiedSwitchEndTime(String specifiedSwitchEndTime) {
    this.specifiedSwitchEndTime = specifiedSwitchEndTime;
  }

  public DeleteDBNodesRequest specifiedSwitchStartTime(String specifiedSwitchStartTime) {
    this.specifiedSwitchStartTime = specifiedSwitchStartTime;
    return this;
  }

   /**
   * Get specifiedSwitchStartTime
   * @return specifiedSwitchStartTime
  **/
  @Schema(description = "")
  public String getSpecifiedSwitchStartTime() {
    return specifiedSwitchStartTime;
  }

  public void setSpecifiedSwitchStartTime(String specifiedSwitchStartTime) {
    this.specifiedSwitchStartTime = specifiedSwitchStartTime;
  }

  public DeleteDBNodesRequest switchType(String switchType) {
    this.switchType = switchType;
    return this;
  }

   /**
   * Get switchType
   * @return switchType
  **/
  @Schema(description = "")
  public String getSwitchType() {
    return switchType;
  }

  public void setSwitchType(String switchType) {
    this.switchType = switchType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDBNodesRequest deleteDBNodesRequest = (DeleteDBNodesRequest) o;
    return Objects.equals(this.dbNodeIds, deleteDBNodesRequest.dbNodeIds) &&
        Objects.equals(this.estimateOnly, deleteDBNodesRequest.estimateOnly) &&
        Objects.equals(this.instanceId, deleteDBNodesRequest.instanceId) &&
        Objects.equals(this.requestSource, deleteDBNodesRequest.requestSource) &&
        Objects.equals(this.specifiedSwitchEndTime, deleteDBNodesRequest.specifiedSwitchEndTime) &&
        Objects.equals(this.specifiedSwitchStartTime, deleteDBNodesRequest.specifiedSwitchStartTime) &&
        Objects.equals(this.switchType, deleteDBNodesRequest.switchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbNodeIds, estimateOnly, instanceId, requestSource, specifiedSwitchEndTime, specifiedSwitchStartTime, switchType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDBNodesRequest {\n");
    
    sb.append("    dbNodeIds: ").append(toIndentedString(dbNodeIds)).append("\n");
    sb.append("    estimateOnly: ").append(toIndentedString(estimateOnly)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    requestSource: ").append(toIndentedString(requestSource)).append("\n");
    sb.append("    specifiedSwitchEndTime: ").append(toIndentedString(specifiedSwitchEndTime)).append("\n");
    sb.append("    specifiedSwitchStartTime: ").append(toIndentedString(specifiedSwitchStartTime)).append("\n");
    sb.append("    switchType: ").append(toIndentedString(switchType)).append("\n");
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
