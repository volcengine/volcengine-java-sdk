/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vpn.model.TagFilterForDescribeVpnGatewaysInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeVpnGatewaysRequest
 */


public class DescribeVpnGatewaysRequest {
  @SerializedName("IpAddress")
  private String ipAddress = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("TagFilters")
  private List<TagFilterForDescribeVpnGatewaysInput> tagFilters = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("VpnGatewayIds")
  private List<String> vpnGatewayIds = null;

  @SerializedName("VpnGatewayName")
  private String vpnGatewayName = null;

  public DescribeVpnGatewaysRequest ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @Schema(description = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public DescribeVpnGatewaysRequest pageNumber(Integer pageNumber) {
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

  public DescribeVpnGatewaysRequest pageSize(Integer pageSize) {
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

  public DescribeVpnGatewaysRequest projectName(String projectName) {
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

  public DescribeVpnGatewaysRequest subnetId(String subnetId) {
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

  public DescribeVpnGatewaysRequest tagFilters(List<TagFilterForDescribeVpnGatewaysInput> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }

  public DescribeVpnGatewaysRequest addTagFiltersItem(TagFilterForDescribeVpnGatewaysInput tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<TagFilterForDescribeVpnGatewaysInput>();
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
  public List<TagFilterForDescribeVpnGatewaysInput> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<TagFilterForDescribeVpnGatewaysInput> tagFilters) {
    this.tagFilters = tagFilters;
  }

  public DescribeVpnGatewaysRequest vpcId(String vpcId) {
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

  public DescribeVpnGatewaysRequest vpnGatewayIds(List<String> vpnGatewayIds) {
    this.vpnGatewayIds = vpnGatewayIds;
    return this;
  }

  public DescribeVpnGatewaysRequest addVpnGatewayIdsItem(String vpnGatewayIdsItem) {
    if (this.vpnGatewayIds == null) {
      this.vpnGatewayIds = new ArrayList<String>();
    }
    this.vpnGatewayIds.add(vpnGatewayIdsItem);
    return this;
  }

   /**
   * Get vpnGatewayIds
   * @return vpnGatewayIds
  **/
  @Schema(description = "")
  public List<String> getVpnGatewayIds() {
    return vpnGatewayIds;
  }

  public void setVpnGatewayIds(List<String> vpnGatewayIds) {
    this.vpnGatewayIds = vpnGatewayIds;
  }

  public DescribeVpnGatewaysRequest vpnGatewayName(String vpnGatewayName) {
    this.vpnGatewayName = vpnGatewayName;
    return this;
  }

   /**
   * Get vpnGatewayName
   * @return vpnGatewayName
  **/
  @Schema(description = "")
  public String getVpnGatewayName() {
    return vpnGatewayName;
  }

  public void setVpnGatewayName(String vpnGatewayName) {
    this.vpnGatewayName = vpnGatewayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeVpnGatewaysRequest describeVpnGatewaysRequest = (DescribeVpnGatewaysRequest) o;
    return Objects.equals(this.ipAddress, describeVpnGatewaysRequest.ipAddress) &&
        Objects.equals(this.pageNumber, describeVpnGatewaysRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeVpnGatewaysRequest.pageSize) &&
        Objects.equals(this.projectName, describeVpnGatewaysRequest.projectName) &&
        Objects.equals(this.subnetId, describeVpnGatewaysRequest.subnetId) &&
        Objects.equals(this.tagFilters, describeVpnGatewaysRequest.tagFilters) &&
        Objects.equals(this.vpcId, describeVpnGatewaysRequest.vpcId) &&
        Objects.equals(this.vpnGatewayIds, describeVpnGatewaysRequest.vpnGatewayIds) &&
        Objects.equals(this.vpnGatewayName, describeVpnGatewaysRequest.vpnGatewayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, pageNumber, pageSize, projectName, subnetId, tagFilters, vpcId, vpnGatewayIds, vpnGatewayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVpnGatewaysRequest {\n");
    
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    vpnGatewayIds: ").append(toIndentedString(vpnGatewayIds)).append("\n");
    sb.append("    vpnGatewayName: ").append(toIndentedString(vpnGatewayName)).append("\n");
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
