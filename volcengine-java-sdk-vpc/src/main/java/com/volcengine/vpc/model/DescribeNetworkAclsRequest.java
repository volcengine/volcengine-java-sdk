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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeNetworkAclsRequest
 */


public class DescribeNetworkAclsRequest {
  @SerializedName("NetworkAclIds")
  private List<String> networkAclIds = null;

  @SerializedName("NetworkAclName")
  private String networkAclName = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public DescribeNetworkAclsRequest networkAclIds(List<String> networkAclIds) {
    this.networkAclIds = networkAclIds;
    return this;
  }

  public DescribeNetworkAclsRequest addNetworkAclIdsItem(String networkAclIdsItem) {
    if (this.networkAclIds == null) {
      this.networkAclIds = new ArrayList<String>();
    }
    this.networkAclIds.add(networkAclIdsItem);
    return this;
  }

   /**
   * Get networkAclIds
   * @return networkAclIds
  **/
  @Schema(description = "")
  public List<String> getNetworkAclIds() {
    return networkAclIds;
  }

  public void setNetworkAclIds(List<String> networkAclIds) {
    this.networkAclIds = networkAclIds;
  }

  public DescribeNetworkAclsRequest networkAclName(String networkAclName) {
    this.networkAclName = networkAclName;
    return this;
  }

   /**
   * Get networkAclName
   * @return networkAclName
  **/
  @Schema(description = "")
  public String getNetworkAclName() {
    return networkAclName;
  }

  public void setNetworkAclName(String networkAclName) {
    this.networkAclName = networkAclName;
  }

  public DescribeNetworkAclsRequest pageNumber(Integer pageNumber) {
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

  public DescribeNetworkAclsRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * maximum: 100
   * @return pageSize
  **/
 @Max(100)  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeNetworkAclsRequest projectName(String projectName) {
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

  public DescribeNetworkAclsRequest subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @Schema(description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public DescribeNetworkAclsRequest vpcId(String vpcId) {
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
    DescribeNetworkAclsRequest describeNetworkAclsRequest = (DescribeNetworkAclsRequest) o;
    return Objects.equals(this.networkAclIds, describeNetworkAclsRequest.networkAclIds) &&
        Objects.equals(this.networkAclName, describeNetworkAclsRequest.networkAclName) &&
        Objects.equals(this.pageNumber, describeNetworkAclsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeNetworkAclsRequest.pageSize) &&
        Objects.equals(this.projectName, describeNetworkAclsRequest.projectName) &&
        Objects.equals(this.subnetId, describeNetworkAclsRequest.subnetId) &&
        Objects.equals(this.vpcId, describeNetworkAclsRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkAclIds, networkAclName, pageNumber, pageSize, projectName, subnetId, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeNetworkAclsRequest {\n");
    
    sb.append("    networkAclIds: ").append(toIndentedString(networkAclIds)).append("\n");
    sb.append("    networkAclName: ").append(toIndentedString(networkAclName)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
