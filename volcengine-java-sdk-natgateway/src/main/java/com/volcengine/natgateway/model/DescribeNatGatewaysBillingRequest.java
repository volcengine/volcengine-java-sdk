/*
 * natgateway
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.natgateway.model;

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
 * DescribeNatGatewaysBillingRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:41.250123+08:00[Asia/Shanghai]")
public class DescribeNatGatewaysBillingRequest {
  @SerializedName("NatGatewayIds")
  private List<String> natGatewayIds = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  public DescribeNatGatewaysBillingRequest natGatewayIds(List<String> natGatewayIds) {
    this.natGatewayIds = natGatewayIds;
    return this;
  }

  public DescribeNatGatewaysBillingRequest addNatGatewayIdsItem(String natGatewayIdsItem) {
    if (this.natGatewayIds == null) {
      this.natGatewayIds = new ArrayList<String>();
    }
    this.natGatewayIds.add(natGatewayIdsItem);
    return this;
  }

   /**
   * Get natGatewayIds
   * @return natGatewayIds
  **/
  @Schema(description = "")
  public List<String> getNatGatewayIds() {
    return natGatewayIds;
  }

  public void setNatGatewayIds(List<String> natGatewayIds) {
    this.natGatewayIds = natGatewayIds;
  }

  public DescribeNatGatewaysBillingRequest pageNumber(Integer pageNumber) {
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

  public DescribeNatGatewaysBillingRequest pageSize(Integer pageSize) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeNatGatewaysBillingRequest describeNatGatewaysBillingRequest = (DescribeNatGatewaysBillingRequest) o;
    return Objects.equals(this.natGatewayIds, describeNatGatewaysBillingRequest.natGatewayIds) &&
        Objects.equals(this.pageNumber, describeNatGatewaysBillingRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeNatGatewaysBillingRequest.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(natGatewayIds, pageNumber, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeNatGatewaysBillingRequest {\n");
    
    sb.append("    natGatewayIds: ").append(toIndentedString(natGatewayIds)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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