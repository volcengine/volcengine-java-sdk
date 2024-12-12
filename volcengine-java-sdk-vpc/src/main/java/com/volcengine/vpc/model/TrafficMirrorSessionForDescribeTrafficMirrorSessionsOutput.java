/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vpc.model.TagForDescribeTrafficMirrorSessionsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput
 */



public class TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput {
  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("LockReason")
  private String lockReason = null;

  @SerializedName("PacketLength")
  private Integer packetLength = null;

  @SerializedName("Priority")
  private Integer priority = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeTrafficMirrorSessionsOutput> tags = null;

  @SerializedName("TrafficMirrorFilterId")
  private String trafficMirrorFilterId = null;

  @SerializedName("TrafficMirrorSessionId")
  private String trafficMirrorSessionId = null;

  @SerializedName("TrafficMirrorSessionName")
  private String trafficMirrorSessionName = null;

  @SerializedName("TrafficMirrorSourceIds")
  private List<String> trafficMirrorSourceIds = null;

  @SerializedName("TrafficMirrorTargetId")
  private String trafficMirrorTargetId = null;

  @SerializedName("VirtualNetworkId")
  private Integer virtualNetworkId = null;

  public TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput businessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
    return this;
  }

   /**
   * Get businessStatus
   * @return businessStatus
  **/
  @Schema(description = "")
  public String getBusinessStatus() {
    return businessStatus;
  }

  public void setBusinessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
  }

  public TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput createdAt(String createdAt) {
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

  public TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput description(String description) {
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

  public TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput lockReason(String lockReason) {
    this.lockReason = lockReason;
    return this;
  }

   /**
   * Get lockReason
   * @return lockReason
  **/
  @Schema(description = "")
  public String getLockReason() {
    return lockReason;
  }

  public void setLockReason(String lockReason) {
    this.lockReason = lockReason;
  }

  public TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput packetLength(Integer packetLength) {
    this.packetLength = packetLength;
    return this;
  }

   /**
   * Get packetLength
   * @return packetLength
  **/
  @Schema(description = "")
  public Integer getPacketLength() {
    return packetLength;
  }

  public void setPacketLength(Integer packetLength) {
    this.packetLength = packetLength;
  }

  public TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput priority(Integer priority) {
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

  public TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput projectName(String projectName) {
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

  public TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput status(String status) {
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

  public TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput tags(List<TagForDescribeTrafficMirrorSessionsOutput> tags) {
    this.tags = tags;
    return this;
  }

  public TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput addTagsItem(TagForDescribeTrafficMirrorSessionsOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeTrafficMirrorSessionsOutput>();
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
  public List<TagForDescribeTrafficMirrorSessionsOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeTrafficMirrorSessionsOutput> tags) {
    this.tags = tags;
  }

  public TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput trafficMirrorFilterId(String trafficMirrorFilterId) {
    this.trafficMirrorFilterId = trafficMirrorFilterId;
    return this;
  }

   /**
   * Get trafficMirrorFilterId
   * @return trafficMirrorFilterId
  **/
  @Schema(description = "")
  public String getTrafficMirrorFilterId() {
    return trafficMirrorFilterId;
  }

  public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
    this.trafficMirrorFilterId = trafficMirrorFilterId;
  }

  public TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput trafficMirrorSessionId(String trafficMirrorSessionId) {
    this.trafficMirrorSessionId = trafficMirrorSessionId;
    return this;
  }

   /**
   * Get trafficMirrorSessionId
   * @return trafficMirrorSessionId
  **/
  @Schema(description = "")
  public String getTrafficMirrorSessionId() {
    return trafficMirrorSessionId;
  }

  public void setTrafficMirrorSessionId(String trafficMirrorSessionId) {
    this.trafficMirrorSessionId = trafficMirrorSessionId;
  }

  public TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput trafficMirrorSessionName(String trafficMirrorSessionName) {
    this.trafficMirrorSessionName = trafficMirrorSessionName;
    return this;
  }

   /**
   * Get trafficMirrorSessionName
   * @return trafficMirrorSessionName
  **/
  @Schema(description = "")
  public String getTrafficMirrorSessionName() {
    return trafficMirrorSessionName;
  }

  public void setTrafficMirrorSessionName(String trafficMirrorSessionName) {
    this.trafficMirrorSessionName = trafficMirrorSessionName;
  }

  public TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput trafficMirrorSourceIds(List<String> trafficMirrorSourceIds) {
    this.trafficMirrorSourceIds = trafficMirrorSourceIds;
    return this;
  }

  public TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput addTrafficMirrorSourceIdsItem(String trafficMirrorSourceIdsItem) {
    if (this.trafficMirrorSourceIds == null) {
      this.trafficMirrorSourceIds = new ArrayList<String>();
    }
    this.trafficMirrorSourceIds.add(trafficMirrorSourceIdsItem);
    return this;
  }

   /**
   * Get trafficMirrorSourceIds
   * @return trafficMirrorSourceIds
  **/
  @Schema(description = "")
  public List<String> getTrafficMirrorSourceIds() {
    return trafficMirrorSourceIds;
  }

  public void setTrafficMirrorSourceIds(List<String> trafficMirrorSourceIds) {
    this.trafficMirrorSourceIds = trafficMirrorSourceIds;
  }

  public TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput trafficMirrorTargetId(String trafficMirrorTargetId) {
    this.trafficMirrorTargetId = trafficMirrorTargetId;
    return this;
  }

   /**
   * Get trafficMirrorTargetId
   * @return trafficMirrorTargetId
  **/
  @Schema(description = "")
  public String getTrafficMirrorTargetId() {
    return trafficMirrorTargetId;
  }

  public void setTrafficMirrorTargetId(String trafficMirrorTargetId) {
    this.trafficMirrorTargetId = trafficMirrorTargetId;
  }

  public TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput virtualNetworkId(Integer virtualNetworkId) {
    this.virtualNetworkId = virtualNetworkId;
    return this;
  }

   /**
   * Get virtualNetworkId
   * @return virtualNetworkId
  **/
  @Schema(description = "")
  public Integer getVirtualNetworkId() {
    return virtualNetworkId;
  }

  public void setVirtualNetworkId(Integer virtualNetworkId) {
    this.virtualNetworkId = virtualNetworkId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput trafficMirrorSessionForDescribeTrafficMirrorSessionsOutput = (TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput) o;
    return Objects.equals(this.businessStatus, trafficMirrorSessionForDescribeTrafficMirrorSessionsOutput.businessStatus) &&
        Objects.equals(this.createdAt, trafficMirrorSessionForDescribeTrafficMirrorSessionsOutput.createdAt) &&
        Objects.equals(this.description, trafficMirrorSessionForDescribeTrafficMirrorSessionsOutput.description) &&
        Objects.equals(this.lockReason, trafficMirrorSessionForDescribeTrafficMirrorSessionsOutput.lockReason) &&
        Objects.equals(this.packetLength, trafficMirrorSessionForDescribeTrafficMirrorSessionsOutput.packetLength) &&
        Objects.equals(this.priority, trafficMirrorSessionForDescribeTrafficMirrorSessionsOutput.priority) &&
        Objects.equals(this.projectName, trafficMirrorSessionForDescribeTrafficMirrorSessionsOutput.projectName) &&
        Objects.equals(this.status, trafficMirrorSessionForDescribeTrafficMirrorSessionsOutput.status) &&
        Objects.equals(this.tags, trafficMirrorSessionForDescribeTrafficMirrorSessionsOutput.tags) &&
        Objects.equals(this.trafficMirrorFilterId, trafficMirrorSessionForDescribeTrafficMirrorSessionsOutput.trafficMirrorFilterId) &&
        Objects.equals(this.trafficMirrorSessionId, trafficMirrorSessionForDescribeTrafficMirrorSessionsOutput.trafficMirrorSessionId) &&
        Objects.equals(this.trafficMirrorSessionName, trafficMirrorSessionForDescribeTrafficMirrorSessionsOutput.trafficMirrorSessionName) &&
        Objects.equals(this.trafficMirrorSourceIds, trafficMirrorSessionForDescribeTrafficMirrorSessionsOutput.trafficMirrorSourceIds) &&
        Objects.equals(this.trafficMirrorTargetId, trafficMirrorSessionForDescribeTrafficMirrorSessionsOutput.trafficMirrorTargetId) &&
        Objects.equals(this.virtualNetworkId, trafficMirrorSessionForDescribeTrafficMirrorSessionsOutput.virtualNetworkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessStatus, createdAt, description, lockReason, packetLength, priority, projectName, status, tags, trafficMirrorFilterId, trafficMirrorSessionId, trafficMirrorSessionName, trafficMirrorSourceIds, trafficMirrorTargetId, virtualNetworkId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrafficMirrorSessionForDescribeTrafficMirrorSessionsOutput {\n");
    
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lockReason: ").append(toIndentedString(lockReason)).append("\n");
    sb.append("    packetLength: ").append(toIndentedString(packetLength)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    trafficMirrorFilterId: ").append(toIndentedString(trafficMirrorFilterId)).append("\n");
    sb.append("    trafficMirrorSessionId: ").append(toIndentedString(trafficMirrorSessionId)).append("\n");
    sb.append("    trafficMirrorSessionName: ").append(toIndentedString(trafficMirrorSessionName)).append("\n");
    sb.append("    trafficMirrorSourceIds: ").append(toIndentedString(trafficMirrorSourceIds)).append("\n");
    sb.append("    trafficMirrorTargetId: ").append(toIndentedString(trafficMirrorTargetId)).append("\n");
    sb.append("    virtualNetworkId: ").append(toIndentedString(virtualNetworkId)).append("\n");
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
