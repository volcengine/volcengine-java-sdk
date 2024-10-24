/*
 * rocketmq
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rocketmq.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeGroupsDetailResponse
 */



public class DescribeGroupsDetailResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("GroupId")
  private String groupId = null;

  @SerializedName("GroupType")
  private String groupType = null;

  @SerializedName("IsSubSame")
  private Boolean isSubSame = null;

  @SerializedName("MessageDelayTime")
  private String messageDelayTime = null;

  @SerializedName("MessageModel")
  private String messageModel = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("TotalConsumedRate")
  private String totalConsumedRate = null;

  @SerializedName("TotalDiff")
  private Integer totalDiff = null;

  public DescribeGroupsDetailResponse createTime(String createTime) {
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

  public DescribeGroupsDetailResponse description(String description) {
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

  public DescribeGroupsDetailResponse groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @Schema(description = "")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public DescribeGroupsDetailResponse groupType(String groupType) {
    this.groupType = groupType;
    return this;
  }

   /**
   * Get groupType
   * @return groupType
  **/
  @Schema(description = "")
  public String getGroupType() {
    return groupType;
  }

  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }

  public DescribeGroupsDetailResponse isSubSame(Boolean isSubSame) {
    this.isSubSame = isSubSame;
    return this;
  }

   /**
   * Get isSubSame
   * @return isSubSame
  **/
  @Schema(description = "")
  public Boolean isIsSubSame() {
    return isSubSame;
  }

  public void setIsSubSame(Boolean isSubSame) {
    this.isSubSame = isSubSame;
  }

  public DescribeGroupsDetailResponse messageDelayTime(String messageDelayTime) {
    this.messageDelayTime = messageDelayTime;
    return this;
  }

   /**
   * Get messageDelayTime
   * @return messageDelayTime
  **/
  @Schema(description = "")
  public String getMessageDelayTime() {
    return messageDelayTime;
  }

  public void setMessageDelayTime(String messageDelayTime) {
    this.messageDelayTime = messageDelayTime;
  }

  public DescribeGroupsDetailResponse messageModel(String messageModel) {
    this.messageModel = messageModel;
    return this;
  }

   /**
   * Get messageModel
   * @return messageModel
  **/
  @Schema(description = "")
  public String getMessageModel() {
    return messageModel;
  }

  public void setMessageModel(String messageModel) {
    this.messageModel = messageModel;
  }

  public DescribeGroupsDetailResponse status(String status) {
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

  public DescribeGroupsDetailResponse totalConsumedRate(String totalConsumedRate) {
    this.totalConsumedRate = totalConsumedRate;
    return this;
  }

   /**
   * Get totalConsumedRate
   * @return totalConsumedRate
  **/
  @Schema(description = "")
  public String getTotalConsumedRate() {
    return totalConsumedRate;
  }

  public void setTotalConsumedRate(String totalConsumedRate) {
    this.totalConsumedRate = totalConsumedRate;
  }

  public DescribeGroupsDetailResponse totalDiff(Integer totalDiff) {
    this.totalDiff = totalDiff;
    return this;
  }

   /**
   * Get totalDiff
   * @return totalDiff
  **/
  @Schema(description = "")
  public Integer getTotalDiff() {
    return totalDiff;
  }

  public void setTotalDiff(Integer totalDiff) {
    this.totalDiff = totalDiff;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeGroupsDetailResponse describeGroupsDetailResponse = (DescribeGroupsDetailResponse) o;
    return Objects.equals(this.createTime, describeGroupsDetailResponse.createTime) &&
        Objects.equals(this.description, describeGroupsDetailResponse.description) &&
        Objects.equals(this.groupId, describeGroupsDetailResponse.groupId) &&
        Objects.equals(this.groupType, describeGroupsDetailResponse.groupType) &&
        Objects.equals(this.isSubSame, describeGroupsDetailResponse.isSubSame) &&
        Objects.equals(this.messageDelayTime, describeGroupsDetailResponse.messageDelayTime) &&
        Objects.equals(this.messageModel, describeGroupsDetailResponse.messageModel) &&
        Objects.equals(this.status, describeGroupsDetailResponse.status) &&
        Objects.equals(this.totalConsumedRate, describeGroupsDetailResponse.totalConsumedRate) &&
        Objects.equals(this.totalDiff, describeGroupsDetailResponse.totalDiff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, description, groupId, groupType, isSubSame, messageDelayTime, messageModel, status, totalConsumedRate, totalDiff);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeGroupsDetailResponse {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    isSubSame: ").append(toIndentedString(isSubSame)).append("\n");
    sb.append("    messageDelayTime: ").append(toIndentedString(messageDelayTime)).append("\n");
    sb.append("    messageModel: ").append(toIndentedString(messageModel)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalConsumedRate: ").append(toIndentedString(totalConsumedRate)).append("\n");
    sb.append("    totalDiff: ").append(toIndentedString(totalDiff)).append("\n");
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