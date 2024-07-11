/*
 * transitrouter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.transitrouter.model;

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
 * TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput
 */



public class TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput {
  @SerializedName("ActionResult")
  private String actionResult = null;

  @SerializedName("ApplyAsPathValues")
  private List<Integer> applyAsPathValues = null;

  @SerializedName("AsPathOperateMode")
  private String asPathOperateMode = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DestinationResourceIds")
  private List<String> destinationResourceIds = null;

  @SerializedName("DestinationResourceTypes")
  private List<String> destinationResourceTypes = null;

  @SerializedName("IpPrefixes")
  private List<String> ipPrefixes = null;

  @SerializedName("Priority")
  private Integer priority = null;

  @SerializedName("SourceResourceIds")
  private List<String> sourceResourceIds = null;

  @SerializedName("SourceResourceTypes")
  private List<String> sourceResourceTypes = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("TransitRouterRoutePolicyEntryId")
  private String transitRouterRoutePolicyEntryId = null;

  @SerializedName("TransitRouterRoutePolicyTableId")
  private String transitRouterRoutePolicyTableId = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput actionResult(String actionResult) {
    this.actionResult = actionResult;
    return this;
  }

   /**
   * Get actionResult
   * @return actionResult
  **/
  @Schema(description = "")
  public String getActionResult() {
    return actionResult;
  }

  public void setActionResult(String actionResult) {
    this.actionResult = actionResult;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput applyAsPathValues(List<Integer> applyAsPathValues) {
    this.applyAsPathValues = applyAsPathValues;
    return this;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput addApplyAsPathValuesItem(Integer applyAsPathValuesItem) {
    if (this.applyAsPathValues == null) {
      this.applyAsPathValues = new ArrayList<Integer>();
    }
    this.applyAsPathValues.add(applyAsPathValuesItem);
    return this;
  }

   /**
   * Get applyAsPathValues
   * @return applyAsPathValues
  **/
  @Schema(description = "")
  public List<Integer> getApplyAsPathValues() {
    return applyAsPathValues;
  }

  public void setApplyAsPathValues(List<Integer> applyAsPathValues) {
    this.applyAsPathValues = applyAsPathValues;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput asPathOperateMode(String asPathOperateMode) {
    this.asPathOperateMode = asPathOperateMode;
    return this;
  }

   /**
   * Get asPathOperateMode
   * @return asPathOperateMode
  **/
  @Schema(description = "")
  public String getAsPathOperateMode() {
    return asPathOperateMode;
  }

  public void setAsPathOperateMode(String asPathOperateMode) {
    this.asPathOperateMode = asPathOperateMode;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput destinationResourceIds(List<String> destinationResourceIds) {
    this.destinationResourceIds = destinationResourceIds;
    return this;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput addDestinationResourceIdsItem(String destinationResourceIdsItem) {
    if (this.destinationResourceIds == null) {
      this.destinationResourceIds = new ArrayList<String>();
    }
    this.destinationResourceIds.add(destinationResourceIdsItem);
    return this;
  }

   /**
   * Get destinationResourceIds
   * @return destinationResourceIds
  **/
  @Schema(description = "")
  public List<String> getDestinationResourceIds() {
    return destinationResourceIds;
  }

  public void setDestinationResourceIds(List<String> destinationResourceIds) {
    this.destinationResourceIds = destinationResourceIds;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput destinationResourceTypes(List<String> destinationResourceTypes) {
    this.destinationResourceTypes = destinationResourceTypes;
    return this;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput addDestinationResourceTypesItem(String destinationResourceTypesItem) {
    if (this.destinationResourceTypes == null) {
      this.destinationResourceTypes = new ArrayList<String>();
    }
    this.destinationResourceTypes.add(destinationResourceTypesItem);
    return this;
  }

   /**
   * Get destinationResourceTypes
   * @return destinationResourceTypes
  **/
  @Schema(description = "")
  public List<String> getDestinationResourceTypes() {
    return destinationResourceTypes;
  }

  public void setDestinationResourceTypes(List<String> destinationResourceTypes) {
    this.destinationResourceTypes = destinationResourceTypes;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput ipPrefixes(List<String> ipPrefixes) {
    this.ipPrefixes = ipPrefixes;
    return this;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput addIpPrefixesItem(String ipPrefixesItem) {
    if (this.ipPrefixes == null) {
      this.ipPrefixes = new ArrayList<String>();
    }
    this.ipPrefixes.add(ipPrefixesItem);
    return this;
  }

   /**
   * Get ipPrefixes
   * @return ipPrefixes
  **/
  @Schema(description = "")
  public List<String> getIpPrefixes() {
    return ipPrefixes;
  }

  public void setIpPrefixes(List<String> ipPrefixes) {
    this.ipPrefixes = ipPrefixes;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput priority(Integer priority) {
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

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput sourceResourceIds(List<String> sourceResourceIds) {
    this.sourceResourceIds = sourceResourceIds;
    return this;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput addSourceResourceIdsItem(String sourceResourceIdsItem) {
    if (this.sourceResourceIds == null) {
      this.sourceResourceIds = new ArrayList<String>();
    }
    this.sourceResourceIds.add(sourceResourceIdsItem);
    return this;
  }

   /**
   * Get sourceResourceIds
   * @return sourceResourceIds
  **/
  @Schema(description = "")
  public List<String> getSourceResourceIds() {
    return sourceResourceIds;
  }

  public void setSourceResourceIds(List<String> sourceResourceIds) {
    this.sourceResourceIds = sourceResourceIds;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput sourceResourceTypes(List<String> sourceResourceTypes) {
    this.sourceResourceTypes = sourceResourceTypes;
    return this;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput addSourceResourceTypesItem(String sourceResourceTypesItem) {
    if (this.sourceResourceTypes == null) {
      this.sourceResourceTypes = new ArrayList<String>();
    }
    this.sourceResourceTypes.add(sourceResourceTypesItem);
    return this;
  }

   /**
   * Get sourceResourceTypes
   * @return sourceResourceTypes
  **/
  @Schema(description = "")
  public List<String> getSourceResourceTypes() {
    return sourceResourceTypes;
  }

  public void setSourceResourceTypes(List<String> sourceResourceTypes) {
    this.sourceResourceTypes = sourceResourceTypes;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput transitRouterRoutePolicyEntryId(String transitRouterRoutePolicyEntryId) {
    this.transitRouterRoutePolicyEntryId = transitRouterRoutePolicyEntryId;
    return this;
  }

   /**
   * Get transitRouterRoutePolicyEntryId
   * @return transitRouterRoutePolicyEntryId
  **/
  @Schema(description = "")
  public String getTransitRouterRoutePolicyEntryId() {
    return transitRouterRoutePolicyEntryId;
  }

  public void setTransitRouterRoutePolicyEntryId(String transitRouterRoutePolicyEntryId) {
    this.transitRouterRoutePolicyEntryId = transitRouterRoutePolicyEntryId;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput transitRouterRoutePolicyTableId(String transitRouterRoutePolicyTableId) {
    this.transitRouterRoutePolicyTableId = transitRouterRoutePolicyTableId;
    return this;
  }

   /**
   * Get transitRouterRoutePolicyTableId
   * @return transitRouterRoutePolicyTableId
  **/
  @Schema(description = "")
  public String getTransitRouterRoutePolicyTableId() {
    return transitRouterRoutePolicyTableId;
  }

  public void setTransitRouterRoutePolicyTableId(String transitRouterRoutePolicyTableId) {
    this.transitRouterRoutePolicyTableId = transitRouterRoutePolicyTableId;
  }

  public TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput transitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput = (TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput) o;
    return Objects.equals(this.actionResult, transitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput.actionResult) &&
        Objects.equals(this.applyAsPathValues, transitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput.applyAsPathValues) &&
        Objects.equals(this.asPathOperateMode, transitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput.asPathOperateMode) &&
        Objects.equals(this.creationTime, transitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput.creationTime) &&
        Objects.equals(this.description, transitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput.description) &&
        Objects.equals(this.destinationResourceIds, transitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput.destinationResourceIds) &&
        Objects.equals(this.destinationResourceTypes, transitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput.destinationResourceTypes) &&
        Objects.equals(this.ipPrefixes, transitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput.ipPrefixes) &&
        Objects.equals(this.priority, transitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput.priority) &&
        Objects.equals(this.sourceResourceIds, transitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput.sourceResourceIds) &&
        Objects.equals(this.sourceResourceTypes, transitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput.sourceResourceTypes) &&
        Objects.equals(this.status, transitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput.status) &&
        Objects.equals(this.transitRouterRoutePolicyEntryId, transitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput.transitRouterRoutePolicyEntryId) &&
        Objects.equals(this.transitRouterRoutePolicyTableId, transitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput.transitRouterRoutePolicyTableId) &&
        Objects.equals(this.updateTime, transitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionResult, applyAsPathValues, asPathOperateMode, creationTime, description, destinationResourceIds, destinationResourceTypes, ipPrefixes, priority, sourceResourceIds, sourceResourceTypes, status, transitRouterRoutePolicyEntryId, transitRouterRoutePolicyTableId, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransitRouterRoutePolicyEntryForDescribeTransitRouterRoutePolicyEntriesOutput {\n");
    
    sb.append("    actionResult: ").append(toIndentedString(actionResult)).append("\n");
    sb.append("    applyAsPathValues: ").append(toIndentedString(applyAsPathValues)).append("\n");
    sb.append("    asPathOperateMode: ").append(toIndentedString(asPathOperateMode)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destinationResourceIds: ").append(toIndentedString(destinationResourceIds)).append("\n");
    sb.append("    destinationResourceTypes: ").append(toIndentedString(destinationResourceTypes)).append("\n");
    sb.append("    ipPrefixes: ").append(toIndentedString(ipPrefixes)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    sourceResourceIds: ").append(toIndentedString(sourceResourceIds)).append("\n");
    sb.append("    sourceResourceTypes: ").append(toIndentedString(sourceResourceTypes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transitRouterRoutePolicyEntryId: ").append(toIndentedString(transitRouterRoutePolicyEntryId)).append("\n");
    sb.append("    transitRouterRoutePolicyTableId: ").append(toIndentedString(transitRouterRoutePolicyTableId)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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