/*
 * storage_ebs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.storageebs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.storageebs.model.TagForDescribeSnapshotGroupsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SnapshotForDescribeSnapshotGroupsOutput
 */



public class SnapshotForDescribeSnapshotGroupsOutput {
  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ImageId")
  private String imageId = null;

  @SerializedName("Progress")
  private Integer progress = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RetentionDays")
  private Integer retentionDays = null;

  @SerializedName("SnapshotGroupId")
  private String snapshotGroupId = null;

  @SerializedName("SnapshotId")
  private String snapshotId = null;

  @SerializedName("SnapshotName")
  private String snapshotName = null;

  @SerializedName("SnapshotType")
  private String snapshotType = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeSnapshotGroupsOutput> tags = null;

  @SerializedName("VolumeId")
  private String volumeId = null;

  @SerializedName("VolumeKind")
  private String volumeKind = null;

  @SerializedName("VolumeName")
  private String volumeName = null;

  @SerializedName("VolumeSize")
  private Long volumeSize = null;

  @SerializedName("VolumeStatus")
  private String volumeStatus = null;

  @SerializedName("VolumeType")
  private String volumeType = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public SnapshotForDescribeSnapshotGroupsOutput creationTime(String creationTime) {
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

  public SnapshotForDescribeSnapshotGroupsOutput description(String description) {
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

  public SnapshotForDescribeSnapshotGroupsOutput imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @Schema(description = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public SnapshotForDescribeSnapshotGroupsOutput progress(Integer progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @Schema(description = "")
  public Integer getProgress() {
    return progress;
  }

  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  public SnapshotForDescribeSnapshotGroupsOutput projectName(String projectName) {
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

  public SnapshotForDescribeSnapshotGroupsOutput retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

   /**
   * Get retentionDays
   * @return retentionDays
  **/
  @Schema(description = "")
  public Integer getRetentionDays() {
    return retentionDays;
  }

  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }

  public SnapshotForDescribeSnapshotGroupsOutput snapshotGroupId(String snapshotGroupId) {
    this.snapshotGroupId = snapshotGroupId;
    return this;
  }

   /**
   * Get snapshotGroupId
   * @return snapshotGroupId
  **/
  @Schema(description = "")
  public String getSnapshotGroupId() {
    return snapshotGroupId;
  }

  public void setSnapshotGroupId(String snapshotGroupId) {
    this.snapshotGroupId = snapshotGroupId;
  }

  public SnapshotForDescribeSnapshotGroupsOutput snapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

   /**
   * Get snapshotId
   * @return snapshotId
  **/
  @Schema(description = "")
  public String getSnapshotId() {
    return snapshotId;
  }

  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  public SnapshotForDescribeSnapshotGroupsOutput snapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
    return this;
  }

   /**
   * Get snapshotName
   * @return snapshotName
  **/
  @Schema(description = "")
  public String getSnapshotName() {
    return snapshotName;
  }

  public void setSnapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
  }

  public SnapshotForDescribeSnapshotGroupsOutput snapshotType(String snapshotType) {
    this.snapshotType = snapshotType;
    return this;
  }

   /**
   * Get snapshotType
   * @return snapshotType
  **/
  @Schema(description = "")
  public String getSnapshotType() {
    return snapshotType;
  }

  public void setSnapshotType(String snapshotType) {
    this.snapshotType = snapshotType;
  }

  public SnapshotForDescribeSnapshotGroupsOutput status(String status) {
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

  public SnapshotForDescribeSnapshotGroupsOutput tags(List<TagForDescribeSnapshotGroupsOutput> tags) {
    this.tags = tags;
    return this;
  }

  public SnapshotForDescribeSnapshotGroupsOutput addTagsItem(TagForDescribeSnapshotGroupsOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeSnapshotGroupsOutput>();
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
  public List<TagForDescribeSnapshotGroupsOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeSnapshotGroupsOutput> tags) {
    this.tags = tags;
  }

  public SnapshotForDescribeSnapshotGroupsOutput volumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

   /**
   * Get volumeId
   * @return volumeId
  **/
  @Schema(description = "")
  public String getVolumeId() {
    return volumeId;
  }

  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }

  public SnapshotForDescribeSnapshotGroupsOutput volumeKind(String volumeKind) {
    this.volumeKind = volumeKind;
    return this;
  }

   /**
   * Get volumeKind
   * @return volumeKind
  **/
  @Schema(description = "")
  public String getVolumeKind() {
    return volumeKind;
  }

  public void setVolumeKind(String volumeKind) {
    this.volumeKind = volumeKind;
  }

  public SnapshotForDescribeSnapshotGroupsOutput volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

   /**
   * Get volumeName
   * @return volumeName
  **/
  @Schema(description = "")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }

  public SnapshotForDescribeSnapshotGroupsOutput volumeSize(Long volumeSize) {
    this.volumeSize = volumeSize;
    return this;
  }

   /**
   * Get volumeSize
   * @return volumeSize
  **/
  @Schema(description = "")
  public Long getVolumeSize() {
    return volumeSize;
  }

  public void setVolumeSize(Long volumeSize) {
    this.volumeSize = volumeSize;
  }

  public SnapshotForDescribeSnapshotGroupsOutput volumeStatus(String volumeStatus) {
    this.volumeStatus = volumeStatus;
    return this;
  }

   /**
   * Get volumeStatus
   * @return volumeStatus
  **/
  @Schema(description = "")
  public String getVolumeStatus() {
    return volumeStatus;
  }

  public void setVolumeStatus(String volumeStatus) {
    this.volumeStatus = volumeStatus;
  }

  public SnapshotForDescribeSnapshotGroupsOutput volumeType(String volumeType) {
    this.volumeType = volumeType;
    return this;
  }

   /**
   * Get volumeType
   * @return volumeType
  **/
  @Schema(description = "")
  public String getVolumeType() {
    return volumeType;
  }

  public void setVolumeType(String volumeType) {
    this.volumeType = volumeType;
  }

  public SnapshotForDescribeSnapshotGroupsOutput zoneId(String zoneId) {
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
    SnapshotForDescribeSnapshotGroupsOutput snapshotForDescribeSnapshotGroupsOutput = (SnapshotForDescribeSnapshotGroupsOutput) o;
    return Objects.equals(this.creationTime, snapshotForDescribeSnapshotGroupsOutput.creationTime) &&
        Objects.equals(this.description, snapshotForDescribeSnapshotGroupsOutput.description) &&
        Objects.equals(this.imageId, snapshotForDescribeSnapshotGroupsOutput.imageId) &&
        Objects.equals(this.progress, snapshotForDescribeSnapshotGroupsOutput.progress) &&
        Objects.equals(this.projectName, snapshotForDescribeSnapshotGroupsOutput.projectName) &&
        Objects.equals(this.retentionDays, snapshotForDescribeSnapshotGroupsOutput.retentionDays) &&
        Objects.equals(this.snapshotGroupId, snapshotForDescribeSnapshotGroupsOutput.snapshotGroupId) &&
        Objects.equals(this.snapshotId, snapshotForDescribeSnapshotGroupsOutput.snapshotId) &&
        Objects.equals(this.snapshotName, snapshotForDescribeSnapshotGroupsOutput.snapshotName) &&
        Objects.equals(this.snapshotType, snapshotForDescribeSnapshotGroupsOutput.snapshotType) &&
        Objects.equals(this.status, snapshotForDescribeSnapshotGroupsOutput.status) &&
        Objects.equals(this.tags, snapshotForDescribeSnapshotGroupsOutput.tags) &&
        Objects.equals(this.volumeId, snapshotForDescribeSnapshotGroupsOutput.volumeId) &&
        Objects.equals(this.volumeKind, snapshotForDescribeSnapshotGroupsOutput.volumeKind) &&
        Objects.equals(this.volumeName, snapshotForDescribeSnapshotGroupsOutput.volumeName) &&
        Objects.equals(this.volumeSize, snapshotForDescribeSnapshotGroupsOutput.volumeSize) &&
        Objects.equals(this.volumeStatus, snapshotForDescribeSnapshotGroupsOutput.volumeStatus) &&
        Objects.equals(this.volumeType, snapshotForDescribeSnapshotGroupsOutput.volumeType) &&
        Objects.equals(this.zoneId, snapshotForDescribeSnapshotGroupsOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, description, imageId, progress, projectName, retentionDays, snapshotGroupId, snapshotId, snapshotName, snapshotType, status, tags, volumeId, volumeKind, volumeName, volumeSize, volumeStatus, volumeType, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotForDescribeSnapshotGroupsOutput {\n");
    
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
    sb.append("    snapshotGroupId: ").append(toIndentedString(snapshotGroupId)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
    sb.append("    snapshotType: ").append(toIndentedString(snapshotType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
    sb.append("    volumeKind: ").append(toIndentedString(volumeKind)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
    sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
    sb.append("    volumeStatus: ").append(toIndentedString(volumeStatus)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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
