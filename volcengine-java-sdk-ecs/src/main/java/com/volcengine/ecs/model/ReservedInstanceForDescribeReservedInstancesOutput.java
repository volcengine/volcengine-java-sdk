/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.ecs.model.TagForDescribeReservedInstancesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ReservedInstanceForDescribeReservedInstancesOutput
 */



public class ReservedInstanceForDescribeReservedInstancesOutput {
  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ExpiredAt")
  private String expiredAt = null;

  @SerializedName("HpcClusterId")
  private String hpcClusterId = null;

  @SerializedName("InstanceCount")
  private Integer instanceCount = null;

  @SerializedName("InstanceTypeId")
  private String instanceTypeId = null;

  @SerializedName("OfferingType")
  private String offeringType = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("ReservedInstanceId")
  private String reservedInstanceId = null;

  @SerializedName("ReservedInstanceName")
  private String reservedInstanceName = null;

  @SerializedName("Scope")
  private String scope = null;

  @SerializedName("StartAt")
  private String startAt = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SupportModify")
  private String supportModify = null;

  @SerializedName("Tags")
  private List<TagForDescribeReservedInstancesOutput> tags = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public ReservedInstanceForDescribeReservedInstancesOutput createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ReservedInstanceForDescribeReservedInstancesOutput description(String description) {
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

  public ReservedInstanceForDescribeReservedInstancesOutput expiredAt(String expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

   /**
   * Get expiredAt
   * @return expiredAt
  **/
  @Schema(description = "")
  public String getExpiredAt() {
    return expiredAt;
  }

  public void setExpiredAt(String expiredAt) {
    this.expiredAt = expiredAt;
  }

  public ReservedInstanceForDescribeReservedInstancesOutput hpcClusterId(String hpcClusterId) {
    this.hpcClusterId = hpcClusterId;
    return this;
  }

   /**
   * Get hpcClusterId
   * @return hpcClusterId
  **/
  @Schema(description = "")
  public String getHpcClusterId() {
    return hpcClusterId;
  }

  public void setHpcClusterId(String hpcClusterId) {
    this.hpcClusterId = hpcClusterId;
  }

  public ReservedInstanceForDescribeReservedInstancesOutput instanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
    return this;
  }

   /**
   * Get instanceCount
   * @return instanceCount
  **/
  @Schema(description = "")
  public Integer getInstanceCount() {
    return instanceCount;
  }

  public void setInstanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
  }

  public ReservedInstanceForDescribeReservedInstancesOutput instanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
    return this;
  }

   /**
   * Get instanceTypeId
   * @return instanceTypeId
  **/
  @Schema(description = "")
  public String getInstanceTypeId() {
    return instanceTypeId;
  }

  public void setInstanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
  }

  public ReservedInstanceForDescribeReservedInstancesOutput offeringType(String offeringType) {
    this.offeringType = offeringType;
    return this;
  }

   /**
   * Get offeringType
   * @return offeringType
  **/
  @Schema(description = "")
  public String getOfferingType() {
    return offeringType;
  }

  public void setOfferingType(String offeringType) {
    this.offeringType = offeringType;
  }

  public ReservedInstanceForDescribeReservedInstancesOutput projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public ReservedInstanceForDescribeReservedInstancesOutput regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  @Schema(description = "")
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public ReservedInstanceForDescribeReservedInstancesOutput reservedInstanceId(String reservedInstanceId) {
    this.reservedInstanceId = reservedInstanceId;
    return this;
  }

   /**
   * Get reservedInstanceId
   * @return reservedInstanceId
  **/
  @Schema(description = "")
  public String getReservedInstanceId() {
    return reservedInstanceId;
  }

  public void setReservedInstanceId(String reservedInstanceId) {
    this.reservedInstanceId = reservedInstanceId;
  }

  public ReservedInstanceForDescribeReservedInstancesOutput reservedInstanceName(String reservedInstanceName) {
    this.reservedInstanceName = reservedInstanceName;
    return this;
  }

   /**
   * Get reservedInstanceName
   * @return reservedInstanceName
  **/
  @Schema(description = "")
  public String getReservedInstanceName() {
    return reservedInstanceName;
  }

  public void setReservedInstanceName(String reservedInstanceName) {
    this.reservedInstanceName = reservedInstanceName;
  }

  public ReservedInstanceForDescribeReservedInstancesOutput scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Schema(description = "")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public ReservedInstanceForDescribeReservedInstancesOutput startAt(String startAt) {
    this.startAt = startAt;
    return this;
  }

   /**
   * Get startAt
   * @return startAt
  **/
  @Schema(description = "")
  public String getStartAt() {
    return startAt;
  }

  public void setStartAt(String startAt) {
    this.startAt = startAt;
  }

  public ReservedInstanceForDescribeReservedInstancesOutput status(String status) {
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

  public ReservedInstanceForDescribeReservedInstancesOutput supportModify(String supportModify) {
    this.supportModify = supportModify;
    return this;
  }

   /**
   * Get supportModify
   * @return supportModify
  **/
  @Schema(description = "")
  public String getSupportModify() {
    return supportModify;
  }

  public void setSupportModify(String supportModify) {
    this.supportModify = supportModify;
  }

  public ReservedInstanceForDescribeReservedInstancesOutput tags(List<TagForDescribeReservedInstancesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public ReservedInstanceForDescribeReservedInstancesOutput addTagsItem(TagForDescribeReservedInstancesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeReservedInstancesOutput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForDescribeReservedInstancesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeReservedInstancesOutput> tags) {
    this.tags = tags;
  }

  public ReservedInstanceForDescribeReservedInstancesOutput zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservedInstanceForDescribeReservedInstancesOutput reservedInstanceForDescribeReservedInstancesOutput = (ReservedInstanceForDescribeReservedInstancesOutput) o;
    return Objects.equals(this.createdAt, reservedInstanceForDescribeReservedInstancesOutput.createdAt) &&
        Objects.equals(this.description, reservedInstanceForDescribeReservedInstancesOutput.description) &&
        Objects.equals(this.expiredAt, reservedInstanceForDescribeReservedInstancesOutput.expiredAt) &&
        Objects.equals(this.hpcClusterId, reservedInstanceForDescribeReservedInstancesOutput.hpcClusterId) &&
        Objects.equals(this.instanceCount, reservedInstanceForDescribeReservedInstancesOutput.instanceCount) &&
        Objects.equals(this.instanceTypeId, reservedInstanceForDescribeReservedInstancesOutput.instanceTypeId) &&
        Objects.equals(this.offeringType, reservedInstanceForDescribeReservedInstancesOutput.offeringType) &&
        Objects.equals(this.projectName, reservedInstanceForDescribeReservedInstancesOutput.projectName) &&
        Objects.equals(this.regionId, reservedInstanceForDescribeReservedInstancesOutput.regionId) &&
        Objects.equals(this.reservedInstanceId, reservedInstanceForDescribeReservedInstancesOutput.reservedInstanceId) &&
        Objects.equals(this.reservedInstanceName, reservedInstanceForDescribeReservedInstancesOutput.reservedInstanceName) &&
        Objects.equals(this.scope, reservedInstanceForDescribeReservedInstancesOutput.scope) &&
        Objects.equals(this.startAt, reservedInstanceForDescribeReservedInstancesOutput.startAt) &&
        Objects.equals(this.status, reservedInstanceForDescribeReservedInstancesOutput.status) &&
        Objects.equals(this.supportModify, reservedInstanceForDescribeReservedInstancesOutput.supportModify) &&
        Objects.equals(this.tags, reservedInstanceForDescribeReservedInstancesOutput.tags) &&
        Objects.equals(this.zoneId, reservedInstanceForDescribeReservedInstancesOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, expiredAt, hpcClusterId, instanceCount, instanceTypeId, offeringType, projectName, regionId, reservedInstanceId, reservedInstanceName, scope, startAt, status, supportModify, tags, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservedInstanceForDescribeReservedInstancesOutput {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
    sb.append("    hpcClusterId: ").append(toIndentedString(hpcClusterId)).append("\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    instanceTypeId: ").append(toIndentedString(instanceTypeId)).append("\n");
    sb.append("    offeringType: ").append(toIndentedString(offeringType)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    reservedInstanceId: ").append(toIndentedString(reservedInstanceId)).append("\n");
    sb.append("    reservedInstanceName: ").append(toIndentedString(reservedInstanceName)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    supportModify: ").append(toIndentedString(supportModify)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
