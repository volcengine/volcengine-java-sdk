/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.clb.model.TagFilterForDescribeNLBServerGroupsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeNLBServerGroupsRequest
 */



public class DescribeNLBServerGroupsRequest {
  @SerializedName("MaxResults")
  private Integer maxResults = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("ServerGroupIds")
  private List<String> serverGroupIds = null;

  @SerializedName("ServerGroupName")
  private String serverGroupName = null;

  @SerializedName("TagFilters")
  private List<TagFilterForDescribeNLBServerGroupsInput> tagFilters = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public DescribeNLBServerGroupsRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @Schema(description = "")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public DescribeNLBServerGroupsRequest nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @Schema(description = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public DescribeNLBServerGroupsRequest projectName(String projectName) {
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

  public DescribeNLBServerGroupsRequest serverGroupIds(List<String> serverGroupIds) {
    this.serverGroupIds = serverGroupIds;
    return this;
  }

  public DescribeNLBServerGroupsRequest addServerGroupIdsItem(String serverGroupIdsItem) {
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

  public DescribeNLBServerGroupsRequest serverGroupName(String serverGroupName) {
    this.serverGroupName = serverGroupName;
    return this;
  }

   /**
   * Get serverGroupName
   * @return serverGroupName
  **/
  @Schema(description = "")
  public String getServerGroupName() {
    return serverGroupName;
  }

  public void setServerGroupName(String serverGroupName) {
    this.serverGroupName = serverGroupName;
  }

  public DescribeNLBServerGroupsRequest tagFilters(List<TagFilterForDescribeNLBServerGroupsInput> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }

  public DescribeNLBServerGroupsRequest addTagFiltersItem(TagFilterForDescribeNLBServerGroupsInput tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<TagFilterForDescribeNLBServerGroupsInput>();
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
  public List<TagFilterForDescribeNLBServerGroupsInput> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<TagFilterForDescribeNLBServerGroupsInput> tagFilters) {
    this.tagFilters = tagFilters;
  }

  public DescribeNLBServerGroupsRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DescribeNLBServerGroupsRequest vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeNLBServerGroupsRequest describeNLBServerGroupsRequest = (DescribeNLBServerGroupsRequest) o;
    return Objects.equals(this.maxResults, describeNLBServerGroupsRequest.maxResults) &&
        Objects.equals(this.nextToken, describeNLBServerGroupsRequest.nextToken) &&
        Objects.equals(this.projectName, describeNLBServerGroupsRequest.projectName) &&
        Objects.equals(this.serverGroupIds, describeNLBServerGroupsRequest.serverGroupIds) &&
        Objects.equals(this.serverGroupName, describeNLBServerGroupsRequest.serverGroupName) &&
        Objects.equals(this.tagFilters, describeNLBServerGroupsRequest.tagFilters) &&
        Objects.equals(this.type, describeNLBServerGroupsRequest.type) &&
        Objects.equals(this.vpcId, describeNLBServerGroupsRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, nextToken, projectName, serverGroupIds, serverGroupName, tagFilters, type, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeNLBServerGroupsRequest {\n");
    
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    serverGroupIds: ").append(toIndentedString(serverGroupIds)).append("\n");
    sb.append("    serverGroupName: ").append(toIndentedString(serverGroupName)).append("\n");
    sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
