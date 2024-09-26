/*
 * privatelink
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.privatelink.model;

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
 * DescribePrivateLinkGatewaysRequest
 */



public class DescribePrivateLinkGatewaysRequest {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("PrivateLinkGatewayIds")
  private List<String> privateLinkGatewayIds = null;

  @SerializedName("PrivateLinkGatewayName")
  private String privateLinkGatewayName = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public DescribePrivateLinkGatewaysRequest pageNumber(Integer pageNumber) {
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

  public DescribePrivateLinkGatewaysRequest pageSize(Integer pageSize) {
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

  public DescribePrivateLinkGatewaysRequest privateLinkGatewayIds(List<String> privateLinkGatewayIds) {
    this.privateLinkGatewayIds = privateLinkGatewayIds;
    return this;
  }

  public DescribePrivateLinkGatewaysRequest addPrivateLinkGatewayIdsItem(String privateLinkGatewayIdsItem) {
    if (this.privateLinkGatewayIds == null) {
      this.privateLinkGatewayIds = new ArrayList<String>();
    }
    this.privateLinkGatewayIds.add(privateLinkGatewayIdsItem);
    return this;
  }

   /**
   * Get privateLinkGatewayIds
   * @return privateLinkGatewayIds
  **/
  @Schema(description = "")
  public List<String> getPrivateLinkGatewayIds() {
    return privateLinkGatewayIds;
  }

  public void setPrivateLinkGatewayIds(List<String> privateLinkGatewayIds) {
    this.privateLinkGatewayIds = privateLinkGatewayIds;
  }

  public DescribePrivateLinkGatewaysRequest privateLinkGatewayName(String privateLinkGatewayName) {
    this.privateLinkGatewayName = privateLinkGatewayName;
    return this;
  }

   /**
   * Get privateLinkGatewayName
   * @return privateLinkGatewayName
  **/
  @Schema(description = "")
  public String getPrivateLinkGatewayName() {
    return privateLinkGatewayName;
  }

  public void setPrivateLinkGatewayName(String privateLinkGatewayName) {
    this.privateLinkGatewayName = privateLinkGatewayName;
  }

  public DescribePrivateLinkGatewaysRequest vpcId(String vpcId) {
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

  public DescribePrivateLinkGatewaysRequest zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribePrivateLinkGatewaysRequest describePrivateLinkGatewaysRequest = (DescribePrivateLinkGatewaysRequest) o;
    return Objects.equals(this.pageNumber, describePrivateLinkGatewaysRequest.pageNumber) &&
        Objects.equals(this.pageSize, describePrivateLinkGatewaysRequest.pageSize) &&
        Objects.equals(this.privateLinkGatewayIds, describePrivateLinkGatewaysRequest.privateLinkGatewayIds) &&
        Objects.equals(this.privateLinkGatewayName, describePrivateLinkGatewaysRequest.privateLinkGatewayName) &&
        Objects.equals(this.vpcId, describePrivateLinkGatewaysRequest.vpcId) &&
        Objects.equals(this.zoneId, describePrivateLinkGatewaysRequest.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, privateLinkGatewayIds, privateLinkGatewayName, vpcId, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribePrivateLinkGatewaysRequest {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    privateLinkGatewayIds: ").append(toIndentedString(privateLinkGatewayIds)).append("\n");
    sb.append("    privateLinkGatewayName: ").append(toIndentedString(privateLinkGatewayName)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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