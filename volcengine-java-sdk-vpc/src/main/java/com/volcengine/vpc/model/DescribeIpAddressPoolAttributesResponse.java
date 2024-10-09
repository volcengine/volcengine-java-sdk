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
import com.volcengine.vpc.model.TagForDescribeIpAddressPoolAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeIpAddressPoolAttributesResponse
 */



public class DescribeIpAddressPoolAttributesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("CidrBlocks")
  private List<String> cidrBlocks = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ISP")
  private String ISP = null;

  @SerializedName("IpAddressPoolId")
  private String ipAddressPoolId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("OverdueTime")
  private String overdueTime = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeIpAddressPoolAttributesOutput> tags = null;

  @SerializedName("TotalIpCount")
  private Integer totalIpCount = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("UsedIpCount")
  private Integer usedIpCount = null;

  public DescribeIpAddressPoolAttributesResponse businessStatus(String businessStatus) {
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

  public DescribeIpAddressPoolAttributesResponse cidrBlocks(List<String> cidrBlocks) {
    this.cidrBlocks = cidrBlocks;
    return this;
  }

  public DescribeIpAddressPoolAttributesResponse addCidrBlocksItem(String cidrBlocksItem) {
    if (this.cidrBlocks == null) {
      this.cidrBlocks = new ArrayList<String>();
    }
    this.cidrBlocks.add(cidrBlocksItem);
    return this;
  }

   /**
   * Get cidrBlocks
   * @return cidrBlocks
  **/
  @Schema(description = "")
  public List<String> getCidrBlocks() {
    return cidrBlocks;
  }

  public void setCidrBlocks(List<String> cidrBlocks) {
    this.cidrBlocks = cidrBlocks;
  }

  public DescribeIpAddressPoolAttributesResponse creationTime(String creationTime) {
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

  public DescribeIpAddressPoolAttributesResponse deletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
    return this;
  }

   /**
   * Get deletedTime
   * @return deletedTime
  **/
  @Schema(description = "")
  public String getDeletedTime() {
    return deletedTime;
  }

  public void setDeletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
  }

  public DescribeIpAddressPoolAttributesResponse description(String description) {
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

  public DescribeIpAddressPoolAttributesResponse ISP(String ISP) {
    this.ISP = ISP;
    return this;
  }

   /**
   * Get ISP
   * @return ISP
  **/
  @Schema(description = "")
  public String getISP() {
    return ISP;
  }

  public void setISP(String ISP) {
    this.ISP = ISP;
  }

  public DescribeIpAddressPoolAttributesResponse ipAddressPoolId(String ipAddressPoolId) {
    this.ipAddressPoolId = ipAddressPoolId;
    return this;
  }

   /**
   * Get ipAddressPoolId
   * @return ipAddressPoolId
  **/
  @Schema(description = "")
  public String getIpAddressPoolId() {
    return ipAddressPoolId;
  }

  public void setIpAddressPoolId(String ipAddressPoolId) {
    this.ipAddressPoolId = ipAddressPoolId;
  }

  public DescribeIpAddressPoolAttributesResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DescribeIpAddressPoolAttributesResponse overdueTime(String overdueTime) {
    this.overdueTime = overdueTime;
    return this;
  }

   /**
   * Get overdueTime
   * @return overdueTime
  **/
  @Schema(description = "")
  public String getOverdueTime() {
    return overdueTime;
  }

  public void setOverdueTime(String overdueTime) {
    this.overdueTime = overdueTime;
  }

  public DescribeIpAddressPoolAttributesResponse projectName(String projectName) {
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

  public DescribeIpAddressPoolAttributesResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DescribeIpAddressPoolAttributesResponse status(String status) {
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

  public DescribeIpAddressPoolAttributesResponse tags(List<TagForDescribeIpAddressPoolAttributesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public DescribeIpAddressPoolAttributesResponse addTagsItem(TagForDescribeIpAddressPoolAttributesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeIpAddressPoolAttributesOutput>();
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
  public List<TagForDescribeIpAddressPoolAttributesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeIpAddressPoolAttributesOutput> tags) {
    this.tags = tags;
  }

  public DescribeIpAddressPoolAttributesResponse totalIpCount(Integer totalIpCount) {
    this.totalIpCount = totalIpCount;
    return this;
  }

   /**
   * Get totalIpCount
   * @return totalIpCount
  **/
  @Schema(description = "")
  public Integer getTotalIpCount() {
    return totalIpCount;
  }

  public void setTotalIpCount(Integer totalIpCount) {
    this.totalIpCount = totalIpCount;
  }

  public DescribeIpAddressPoolAttributesResponse updateTime(String updateTime) {
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

  public DescribeIpAddressPoolAttributesResponse usedIpCount(Integer usedIpCount) {
    this.usedIpCount = usedIpCount;
    return this;
  }

   /**
   * Get usedIpCount
   * @return usedIpCount
  **/
  @Schema(description = "")
  public Integer getUsedIpCount() {
    return usedIpCount;
  }

  public void setUsedIpCount(Integer usedIpCount) {
    this.usedIpCount = usedIpCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeIpAddressPoolAttributesResponse describeIpAddressPoolAttributesResponse = (DescribeIpAddressPoolAttributesResponse) o;
    return Objects.equals(this.businessStatus, describeIpAddressPoolAttributesResponse.businessStatus) &&
        Objects.equals(this.cidrBlocks, describeIpAddressPoolAttributesResponse.cidrBlocks) &&
        Objects.equals(this.creationTime, describeIpAddressPoolAttributesResponse.creationTime) &&
        Objects.equals(this.deletedTime, describeIpAddressPoolAttributesResponse.deletedTime) &&
        Objects.equals(this.description, describeIpAddressPoolAttributesResponse.description) &&
        Objects.equals(this.ISP, describeIpAddressPoolAttributesResponse.ISP) &&
        Objects.equals(this.ipAddressPoolId, describeIpAddressPoolAttributesResponse.ipAddressPoolId) &&
        Objects.equals(this.name, describeIpAddressPoolAttributesResponse.name) &&
        Objects.equals(this.overdueTime, describeIpAddressPoolAttributesResponse.overdueTime) &&
        Objects.equals(this.projectName, describeIpAddressPoolAttributesResponse.projectName) &&
        Objects.equals(this.requestId, describeIpAddressPoolAttributesResponse.requestId) &&
        Objects.equals(this.status, describeIpAddressPoolAttributesResponse.status) &&
        Objects.equals(this.tags, describeIpAddressPoolAttributesResponse.tags) &&
        Objects.equals(this.totalIpCount, describeIpAddressPoolAttributesResponse.totalIpCount) &&
        Objects.equals(this.updateTime, describeIpAddressPoolAttributesResponse.updateTime) &&
        Objects.equals(this.usedIpCount, describeIpAddressPoolAttributesResponse.usedIpCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessStatus, cidrBlocks, creationTime, deletedTime, description, ISP, ipAddressPoolId, name, overdueTime, projectName, requestId, status, tags, totalIpCount, updateTime, usedIpCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeIpAddressPoolAttributesResponse {\n");
    
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    cidrBlocks: ").append(toIndentedString(cidrBlocks)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ISP: ").append(toIndentedString(ISP)).append("\n");
    sb.append("    ipAddressPoolId: ").append(toIndentedString(ipAddressPoolId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overdueTime: ").append(toIndentedString(overdueTime)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    totalIpCount: ").append(toIndentedString(totalIpCount)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    usedIpCount: ").append(toIndentedString(usedIpCount)).append("\n");
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
