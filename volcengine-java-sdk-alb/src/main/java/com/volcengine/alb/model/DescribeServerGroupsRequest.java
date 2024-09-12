/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.alb.model.TagFilterForDescribeServerGroupsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeServerGroupsRequest
 */



public class DescribeServerGroupsRequest {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("ServerGroupIds")
  private List<String> serverGroupIds = null;

  @SerializedName("ServerGroupNames")
  private List<String> serverGroupNames = null;

  @SerializedName("ServerGroupType")
  private String serverGroupType = null;

  @SerializedName("TagFilters")
  private List<TagFilterForDescribeServerGroupsInput> tagFilters = null;

  @SerializedName("VpcID")
  private String vpcID = null;

  public DescribeServerGroupsRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeServerGroupsRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeServerGroupsRequest projectName(String projectName) {
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

  public DescribeServerGroupsRequest serverGroupIds(List<String> serverGroupIds) {
    this.serverGroupIds = serverGroupIds;
    return this;
  }

  public DescribeServerGroupsRequest addServerGroupIdsItem(String serverGroupIdsItem) {
    if (this.serverGroupIds == null) {
      this.serverGroupIds = new ArrayList<String>();
    }
    this.serverGroupIds.add(serverGroupIdsItem);
    return this;
  }

   /**
   * Get serverGroupIds
   * @return serverGroupIds
  **/
  @Schema(description = "")
  public List<String> getServerGroupIds() {
    return serverGroupIds;
  }

  public void setServerGroupIds(List<String> serverGroupIds) {
    this.serverGroupIds = serverGroupIds;
  }

  public DescribeServerGroupsRequest serverGroupNames(List<String> serverGroupNames) {
    this.serverGroupNames = serverGroupNames;
    return this;
  }

  public DescribeServerGroupsRequest addServerGroupNamesItem(String serverGroupNamesItem) {
    if (this.serverGroupNames == null) {
      this.serverGroupNames = new ArrayList<String>();
    }
    this.serverGroupNames.add(serverGroupNamesItem);
    return this;
  }

   /**
   * Get serverGroupNames
   * @return serverGroupNames
  **/
  @Schema(description = "")
  public List<String> getServerGroupNames() {
    return serverGroupNames;
  }

  public void setServerGroupNames(List<String> serverGroupNames) {
    this.serverGroupNames = serverGroupNames;
  }

  public DescribeServerGroupsRequest serverGroupType(String serverGroupType) {
    this.serverGroupType = serverGroupType;
    return this;
  }

   /**
   * Get serverGroupType
   * @return serverGroupType
  **/
  @Schema(description = "")
  public String getServerGroupType() {
    return serverGroupType;
  }

  public void setServerGroupType(String serverGroupType) {
    this.serverGroupType = serverGroupType;
  }

  public DescribeServerGroupsRequest tagFilters(List<TagFilterForDescribeServerGroupsInput> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }

  public DescribeServerGroupsRequest addTagFiltersItem(TagFilterForDescribeServerGroupsInput tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<TagFilterForDescribeServerGroupsInput>();
    }
    this.tagFilters.add(tagFiltersItem);
    return this;
  }

   /**
   * Get tagFilters
   * @return tagFilters
  **/
  @Valid
  @Schema(description = "")
  public List<TagFilterForDescribeServerGroupsInput> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<TagFilterForDescribeServerGroupsInput> tagFilters) {
    this.tagFilters = tagFilters;
  }

  public DescribeServerGroupsRequest vpcID(String vpcID) {
    this.vpcID = vpcID;
    return this;
  }

   /**
   * Get vpcID
   * @return vpcID
  **/
  @Schema(description = "")
  public String getVpcID() {
    return vpcID;
  }

  public void setVpcID(String vpcID) {
    this.vpcID = vpcID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeServerGroupsRequest describeServerGroupsRequest = (DescribeServerGroupsRequest) o;
    return Objects.equals(this.pageNumber, describeServerGroupsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeServerGroupsRequest.pageSize) &&
        Objects.equals(this.projectName, describeServerGroupsRequest.projectName) &&
        Objects.equals(this.serverGroupIds, describeServerGroupsRequest.serverGroupIds) &&
        Objects.equals(this.serverGroupNames, describeServerGroupsRequest.serverGroupNames) &&
        Objects.equals(this.serverGroupType, describeServerGroupsRequest.serverGroupType) &&
        Objects.equals(this.tagFilters, describeServerGroupsRequest.tagFilters) &&
        Objects.equals(this.vpcID, describeServerGroupsRequest.vpcID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, projectName, serverGroupIds, serverGroupNames, serverGroupType, tagFilters, vpcID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeServerGroupsRequest {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    serverGroupIds: ").append(toIndentedString(serverGroupIds)).append("\n");
    sb.append("    serverGroupNames: ").append(toIndentedString(serverGroupNames)).append("\n");
    sb.append("    serverGroupType: ").append(toIndentedString(serverGroupType)).append("\n");
    sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
    sb.append("    vpcID: ").append(toIndentedString(vpcID)).append("\n");
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
