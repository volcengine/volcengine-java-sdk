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
 * DescribeHaVipsRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T19:55:25.796697+08:00[Asia/Shanghai]")
public class DescribeHaVipsRequest {
  @SerializedName("HaVipIds")
  private List<String> haVipIds = null;

  @SerializedName("HaVipName")
  private String haVipName = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public DescribeHaVipsRequest haVipIds(List<String> haVipIds) {
    this.haVipIds = haVipIds;
    return this;
  }

  public DescribeHaVipsRequest addHaVipIdsItem(String haVipIdsItem) {
    if (this.haVipIds == null) {
      this.haVipIds = new ArrayList<String>();
    }
    this.haVipIds.add(haVipIdsItem);
    return this;
  }

   /**
   * Get haVipIds
   * @return haVipIds
  **/
  @Schema(description = "")
  public List<String> getHaVipIds() {
    return haVipIds;
  }

  public void setHaVipIds(List<String> haVipIds) {
    this.haVipIds = haVipIds;
  }

  public DescribeHaVipsRequest haVipName(String haVipName) {
    this.haVipName = haVipName;
    return this;
  }

   /**
   * Get haVipName
   * @return haVipName
  **/
  @Schema(description = "")
  public String getHaVipName() {
    return haVipName;
  }

  public void setHaVipName(String haVipName) {
    this.haVipName = haVipName;
  }

  public DescribeHaVipsRequest ipAddress(String ipAddress) {
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

  public DescribeHaVipsRequest pageNumber(Integer pageNumber) {
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

  public DescribeHaVipsRequest pageSize(Integer pageSize) {
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

  public DescribeHaVipsRequest status(String status) {
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

  public DescribeHaVipsRequest subnetId(String subnetId) {
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

  public DescribeHaVipsRequest vpcId(String vpcId) {
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
    DescribeHaVipsRequest describeHaVipsRequest = (DescribeHaVipsRequest) o;
    return Objects.equals(this.haVipIds, describeHaVipsRequest.haVipIds) &&
        Objects.equals(this.haVipName, describeHaVipsRequest.haVipName) &&
        Objects.equals(this.ipAddress, describeHaVipsRequest.ipAddress) &&
        Objects.equals(this.pageNumber, describeHaVipsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeHaVipsRequest.pageSize) &&
        Objects.equals(this.status, describeHaVipsRequest.status) &&
        Objects.equals(this.subnetId, describeHaVipsRequest.subnetId) &&
        Objects.equals(this.vpcId, describeHaVipsRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(haVipIds, haVipName, ipAddress, pageNumber, pageSize, status, subnetId, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeHaVipsRequest {\n");
    
    sb.append("    haVipIds: ").append(toIndentedString(haVipIds)).append("\n");
    sb.append("    haVipName: ").append(toIndentedString(haVipName)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
