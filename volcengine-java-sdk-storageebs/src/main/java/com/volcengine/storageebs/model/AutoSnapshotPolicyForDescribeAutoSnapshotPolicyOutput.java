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
import com.volcengine.storageebs.model.TagForDescribeAutoSnapshotPolicyOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput
 */



public class AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput {
  @SerializedName("AutoSnapshotPolicyId")
  private String autoSnapshotPolicyId = null;

  @SerializedName("AutoSnapshotPolicyName")
  private String autoSnapshotPolicyName = null;

  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("DestinationRegion")
  private String destinationRegion = null;

  @SerializedName("DestinationRetentionDays")
  private Integer destinationRetentionDays = null;

  @SerializedName("EnableCopy")
  private Boolean enableCopy = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RepeatDays")
  private Integer repeatDays = null;

  @SerializedName("RepeatWeekdays")
  private List<String> repeatWeekdays = null;

  @SerializedName("RetentionDays")
  private Integer retentionDays = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeAutoSnapshotPolicyOutput> tags = null;

  @SerializedName("TimePoints")
  private List<String> timePoints = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  @SerializedName("VolumeNums")
  private Integer volumeNums = null;

  public AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput autoSnapshotPolicyId(String autoSnapshotPolicyId) {
    this.autoSnapshotPolicyId = autoSnapshotPolicyId;
    return this;
  }

   /**
   * Get autoSnapshotPolicyId
   * @return autoSnapshotPolicyId
  **/
  @Schema(description = "")
  public String getAutoSnapshotPolicyId() {
    return autoSnapshotPolicyId;
  }

  public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
    this.autoSnapshotPolicyId = autoSnapshotPolicyId;
  }

  public AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput autoSnapshotPolicyName(String autoSnapshotPolicyName) {
    this.autoSnapshotPolicyName = autoSnapshotPolicyName;
    return this;
  }

   /**
   * Get autoSnapshotPolicyName
   * @return autoSnapshotPolicyName
  **/
  @Schema(description = "")
  public String getAutoSnapshotPolicyName() {
    return autoSnapshotPolicyName;
  }

  public void setAutoSnapshotPolicyName(String autoSnapshotPolicyName) {
    this.autoSnapshotPolicyName = autoSnapshotPolicyName;
  }

  public AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput createdAt(String createdAt) {
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

  public AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput destinationRegion(String destinationRegion) {
    this.destinationRegion = destinationRegion;
    return this;
  }

   /**
   * Get destinationRegion
   * @return destinationRegion
  **/
  @Schema(description = "")
  public String getDestinationRegion() {
    return destinationRegion;
  }

  public void setDestinationRegion(String destinationRegion) {
    this.destinationRegion = destinationRegion;
  }

  public AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput destinationRetentionDays(Integer destinationRetentionDays) {
    this.destinationRetentionDays = destinationRetentionDays;
    return this;
  }

   /**
   * Get destinationRetentionDays
   * minimum: -1
   * maximum: 65536
   * @return destinationRetentionDays
  **/
 @Min(-1) @Max(65536)  @Schema(description = "")
  public Integer getDestinationRetentionDays() {
    return destinationRetentionDays;
  }

  public void setDestinationRetentionDays(Integer destinationRetentionDays) {
    this.destinationRetentionDays = destinationRetentionDays;
  }

  public AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput enableCopy(Boolean enableCopy) {
    this.enableCopy = enableCopy;
    return this;
  }

   /**
   * Get enableCopy
   * @return enableCopy
  **/
  @Schema(description = "")
  public Boolean isEnableCopy() {
    return enableCopy;
  }

  public void setEnableCopy(Boolean enableCopy) {
    this.enableCopy = enableCopy;
  }

  public AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput projectName(String projectName) {
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

  public AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput repeatDays(Integer repeatDays) {
    this.repeatDays = repeatDays;
    return this;
  }

   /**
   * Get repeatDays
   * @return repeatDays
  **/
  @Schema(description = "")
  public Integer getRepeatDays() {
    return repeatDays;
  }

  public void setRepeatDays(Integer repeatDays) {
    this.repeatDays = repeatDays;
  }

  public AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput repeatWeekdays(List<String> repeatWeekdays) {
    this.repeatWeekdays = repeatWeekdays;
    return this;
  }

  public AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput addRepeatWeekdaysItem(String repeatWeekdaysItem) {
    if (this.repeatWeekdays == null) {
      this.repeatWeekdays = new ArrayList<String>();
    }
    this.repeatWeekdays.add(repeatWeekdaysItem);
    return this;
  }

   /**
   * Get repeatWeekdays
   * @return repeatWeekdays
  **/
  @Schema(description = "")
  public List<String> getRepeatWeekdays() {
    return repeatWeekdays;
  }

  public void setRepeatWeekdays(List<String> repeatWeekdays) {
    this.repeatWeekdays = repeatWeekdays;
  }

  public AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput retentionDays(Integer retentionDays) {
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

  public AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput status(String status) {
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

  public AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput tags(List<TagForDescribeAutoSnapshotPolicyOutput> tags) {
    this.tags = tags;
    return this;
  }

  public AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput addTagsItem(TagForDescribeAutoSnapshotPolicyOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeAutoSnapshotPolicyOutput>();
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
  public List<TagForDescribeAutoSnapshotPolicyOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeAutoSnapshotPolicyOutput> tags) {
    this.tags = tags;
  }

  public AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput timePoints(List<String> timePoints) {
    this.timePoints = timePoints;
    return this;
  }

  public AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput addTimePointsItem(String timePointsItem) {
    if (this.timePoints == null) {
      this.timePoints = new ArrayList<String>();
    }
    this.timePoints.add(timePointsItem);
    return this;
  }

   /**
   * Get timePoints
   * @return timePoints
  **/
  @Schema(description = "")
  public List<String> getTimePoints() {
    return timePoints;
  }

  public void setTimePoints(List<String> timePoints) {
    this.timePoints = timePoints;
  }

  public AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput volumeNums(Integer volumeNums) {
    this.volumeNums = volumeNums;
    return this;
  }

   /**
   * Get volumeNums
   * @return volumeNums
  **/
  @Schema(description = "")
  public Integer getVolumeNums() {
    return volumeNums;
  }

  public void setVolumeNums(Integer volumeNums) {
    this.volumeNums = volumeNums;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput autoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput = (AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput) o;
    return Objects.equals(this.autoSnapshotPolicyId, autoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput.autoSnapshotPolicyId) &&
        Objects.equals(this.autoSnapshotPolicyName, autoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput.autoSnapshotPolicyName) &&
        Objects.equals(this.createdAt, autoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput.createdAt) &&
        Objects.equals(this.destinationRegion, autoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput.destinationRegion) &&
        Objects.equals(this.destinationRetentionDays, autoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput.destinationRetentionDays) &&
        Objects.equals(this.enableCopy, autoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput.enableCopy) &&
        Objects.equals(this.projectName, autoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput.projectName) &&
        Objects.equals(this.repeatDays, autoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput.repeatDays) &&
        Objects.equals(this.repeatWeekdays, autoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput.repeatWeekdays) &&
        Objects.equals(this.retentionDays, autoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput.retentionDays) &&
        Objects.equals(this.status, autoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput.status) &&
        Objects.equals(this.tags, autoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput.tags) &&
        Objects.equals(this.timePoints, autoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput.timePoints) &&
        Objects.equals(this.updatedAt, autoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput.updatedAt) &&
        Objects.equals(this.volumeNums, autoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput.volumeNums);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoSnapshotPolicyId, autoSnapshotPolicyName, createdAt, destinationRegion, destinationRetentionDays, enableCopy, projectName, repeatDays, repeatWeekdays, retentionDays, status, tags, timePoints, updatedAt, volumeNums);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoSnapshotPolicyForDescribeAutoSnapshotPolicyOutput {\n");
    
    sb.append("    autoSnapshotPolicyId: ").append(toIndentedString(autoSnapshotPolicyId)).append("\n");
    sb.append("    autoSnapshotPolicyName: ").append(toIndentedString(autoSnapshotPolicyName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
    sb.append("    destinationRetentionDays: ").append(toIndentedString(destinationRetentionDays)).append("\n");
    sb.append("    enableCopy: ").append(toIndentedString(enableCopy)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    repeatDays: ").append(toIndentedString(repeatDays)).append("\n");
    sb.append("    repeatWeekdays: ").append(toIndentedString(repeatWeekdays)).append("\n");
    sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timePoints: ").append(toIndentedString(timePoints)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    volumeNums: ").append(toIndentedString(volumeNums)).append("\n");
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
