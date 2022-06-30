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
 * DescribeSecurityGroupsRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T20:18:16.579539+08:00[Asia/Shanghai]")
public class DescribeSecurityGroupsRequest {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("SecurityGroupIds")
  private List<String> securityGroupIds = null;

  @SerializedName("SecurityGroupNames")
  private List<String> securityGroupNames = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public DescribeSecurityGroupsRequest pageNumber(Integer pageNumber) {
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

  public DescribeSecurityGroupsRequest pageSize(Integer pageSize) {
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

  public DescribeSecurityGroupsRequest securityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public DescribeSecurityGroupsRequest addSecurityGroupIdsItem(String securityGroupIdsItem) {
    if (this.securityGroupIds == null) {
      this.securityGroupIds = new ArrayList<String>();
    }
    this.securityGroupIds.add(securityGroupIdsItem);
    return this;
  }

   /**
   * Get securityGroupIds
   * @return securityGroupIds
  **/
  @Schema(description = "")
  public List<String> getSecurityGroupIds() {
    return securityGroupIds;
  }

  public void setSecurityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
  }

  public DescribeSecurityGroupsRequest securityGroupNames(List<String> securityGroupNames) {
    this.securityGroupNames = securityGroupNames;
    return this;
  }

  public DescribeSecurityGroupsRequest addSecurityGroupNamesItem(String securityGroupNamesItem) {
    if (this.securityGroupNames == null) {
      this.securityGroupNames = new ArrayList<String>();
    }
    this.securityGroupNames.add(securityGroupNamesItem);
    return this;
  }

   /**
   * Get securityGroupNames
   * @return securityGroupNames
  **/
  @Schema(description = "")
  public List<String> getSecurityGroupNames() {
    return securityGroupNames;
  }

  public void setSecurityGroupNames(List<String> securityGroupNames) {
    this.securityGroupNames = securityGroupNames;
  }

  public DescribeSecurityGroupsRequest vpcId(String vpcId) {
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
    DescribeSecurityGroupsRequest describeSecurityGroupsRequest = (DescribeSecurityGroupsRequest) o;
    return Objects.equals(this.pageNumber, describeSecurityGroupsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeSecurityGroupsRequest.pageSize) &&
        Objects.equals(this.securityGroupIds, describeSecurityGroupsRequest.securityGroupIds) &&
        Objects.equals(this.securityGroupNames, describeSecurityGroupsRequest.securityGroupNames) &&
        Objects.equals(this.vpcId, describeSecurityGroupsRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, securityGroupIds, securityGroupNames, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSecurityGroupsRequest {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
    sb.append("    securityGroupNames: ").append(toIndentedString(securityGroupNames)).append("\n");
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
