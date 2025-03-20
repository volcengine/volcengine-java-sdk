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
import com.volcengine.kafka.model.TagForDescribeTopicsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TopicsInfoForDescribeTopicsOutput
 */



public class TopicsInfoForDescribeTopicsOutput {
  @SerializedName("CleanupPolicy")
  private List<String> cleanupPolicy = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("LogRetentionHours")
  private Integer logRetentionHours = null;

  @SerializedName("PartitionNumber")
  private Integer partitionNumber = null;

  @SerializedName("ReplicaNumber")
  private Integer replicaNumber = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeTopicsOutput> tags = null;

  @SerializedName("TopicName")
  private String topicName = null;

  @SerializedName("UsedStoragePercentageInInstance")
  private Double usedStoragePercentageInInstance = null;

  @SerializedName("UsedStorageSpaceInBytes")
  private Long usedStorageSpaceInBytes = null;

  public TopicsInfoForDescribeTopicsOutput cleanupPolicy(List<String> cleanupPolicy) {
    this.cleanupPolicy = cleanupPolicy;
    return this;
  }

  public TopicsInfoForDescribeTopicsOutput addCleanupPolicyItem(String cleanupPolicyItem) {
    if (this.cleanupPolicy == null) {
      this.cleanupPolicy = new ArrayList<String>();
    }
    this.cleanupPolicy.add(cleanupPolicyItem);
    return this;
  }

   /**
   * Get cleanupPolicy
   * @return cleanupPolicy
  **/
  @Schema(description = "")
  public List<String> getCleanupPolicy() {
    return cleanupPolicy;
  }

  public void setCleanupPolicy(List<String> cleanupPolicy) {
    this.cleanupPolicy = cleanupPolicy;
  }

  public TopicsInfoForDescribeTopicsOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public TopicsInfoForDescribeTopicsOutput description(String description) {
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

  public TopicsInfoForDescribeTopicsOutput logRetentionHours(Integer logRetentionHours) {
    this.logRetentionHours = logRetentionHours;
    return this;
  }

   /**
   * Get logRetentionHours
   * @return logRetentionHours
  **/
  @Schema(description = "")
  public Integer getLogRetentionHours() {
    return logRetentionHours;
  }

  public void setLogRetentionHours(Integer logRetentionHours) {
    this.logRetentionHours = logRetentionHours;
  }

  public TopicsInfoForDescribeTopicsOutput partitionNumber(Integer partitionNumber) {
    this.partitionNumber = partitionNumber;
    return this;
  }

   /**
   * Get partitionNumber
   * @return partitionNumber
  **/
  @Schema(description = "")
  public Integer getPartitionNumber() {
    return partitionNumber;
  }

  public void setPartitionNumber(Integer partitionNumber) {
    this.partitionNumber = partitionNumber;
  }

  public TopicsInfoForDescribeTopicsOutput replicaNumber(Integer replicaNumber) {
    this.replicaNumber = replicaNumber;
    return this;
  }

   /**
   * Get replicaNumber
   * @return replicaNumber
  **/
  @Schema(description = "")
  public Integer getReplicaNumber() {
    return replicaNumber;
  }

  public void setReplicaNumber(Integer replicaNumber) {
    this.replicaNumber = replicaNumber;
  }

  public TopicsInfoForDescribeTopicsOutput status(String status) {
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

  public TopicsInfoForDescribeTopicsOutput tags(List<TagForDescribeTopicsOutput> tags) {
    this.tags = tags;
    return this;
  }

  public TopicsInfoForDescribeTopicsOutput addTagsItem(TagForDescribeTopicsOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeTopicsOutput>();
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
  public List<TagForDescribeTopicsOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeTopicsOutput> tags) {
    this.tags = tags;
  }

  public TopicsInfoForDescribeTopicsOutput topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

   /**
   * Get topicName
   * @return topicName
  **/
  @Schema(description = "")
  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  public TopicsInfoForDescribeTopicsOutput usedStoragePercentageInInstance(Double usedStoragePercentageInInstance) {
    this.usedStoragePercentageInInstance = usedStoragePercentageInInstance;
    return this;
  }

   /**
   * Get usedStoragePercentageInInstance
   * @return usedStoragePercentageInInstance
  **/
  @Schema(description = "")
  public Double getUsedStoragePercentageInInstance() {
    return usedStoragePercentageInInstance;
  }

  public void setUsedStoragePercentageInInstance(Double usedStoragePercentageInInstance) {
    this.usedStoragePercentageInInstance = usedStoragePercentageInInstance;
  }

  public TopicsInfoForDescribeTopicsOutput usedStorageSpaceInBytes(Long usedStorageSpaceInBytes) {
    this.usedStorageSpaceInBytes = usedStorageSpaceInBytes;
    return this;
  }

   /**
   * Get usedStorageSpaceInBytes
   * @return usedStorageSpaceInBytes
  **/
  @Schema(description = "")
  public Long getUsedStorageSpaceInBytes() {
    return usedStorageSpaceInBytes;
  }

  public void setUsedStorageSpaceInBytes(Long usedStorageSpaceInBytes) {
    this.usedStorageSpaceInBytes = usedStorageSpaceInBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopicsInfoForDescribeTopicsOutput topicsInfoForDescribeTopicsOutput = (TopicsInfoForDescribeTopicsOutput) o;
    return Objects.equals(this.cleanupPolicy, topicsInfoForDescribeTopicsOutput.cleanupPolicy) &&
        Objects.equals(this.createTime, topicsInfoForDescribeTopicsOutput.createTime) &&
        Objects.equals(this.description, topicsInfoForDescribeTopicsOutput.description) &&
        Objects.equals(this.logRetentionHours, topicsInfoForDescribeTopicsOutput.logRetentionHours) &&
        Objects.equals(this.partitionNumber, topicsInfoForDescribeTopicsOutput.partitionNumber) &&
        Objects.equals(this.replicaNumber, topicsInfoForDescribeTopicsOutput.replicaNumber) &&
        Objects.equals(this.status, topicsInfoForDescribeTopicsOutput.status) &&
        Objects.equals(this.tags, topicsInfoForDescribeTopicsOutput.tags) &&
        Objects.equals(this.topicName, topicsInfoForDescribeTopicsOutput.topicName) &&
        Objects.equals(this.usedStoragePercentageInInstance, topicsInfoForDescribeTopicsOutput.usedStoragePercentageInInstance) &&
        Objects.equals(this.usedStorageSpaceInBytes, topicsInfoForDescribeTopicsOutput.usedStorageSpaceInBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanupPolicy, createTime, description, logRetentionHours, partitionNumber, replicaNumber, status, tags, topicName, usedStoragePercentageInInstance, usedStorageSpaceInBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicsInfoForDescribeTopicsOutput {\n");
    
    sb.append("    cleanupPolicy: ").append(toIndentedString(cleanupPolicy)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logRetentionHours: ").append(toIndentedString(logRetentionHours)).append("\n");
    sb.append("    partitionNumber: ").append(toIndentedString(partitionNumber)).append("\n");
    sb.append("    replicaNumber: ").append(toIndentedString(replicaNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    usedStoragePercentageInInstance: ").append(toIndentedString(usedStoragePercentageInInstance)).append("\n");
    sb.append("    usedStorageSpaceInBytes: ").append(toIndentedString(usedStorageSpaceInBytes)).append("\n");
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
