/*
 * fwcenter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.fwcenter.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.fwcenter.model.DataForDescribeNatFirewallControlPolicyOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeNatFirewallControlPolicyResponse
 */



public class DescribeNatFirewallControlPolicyResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Count")
  private Integer count = null;

  @SerializedName("Data")
  private List<DataForDescribeNatFirewallControlPolicyOutput> data = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeNatFirewallControlPolicyResponse count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(description = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public DescribeNatFirewallControlPolicyResponse data(List<DataForDescribeNatFirewallControlPolicyOutput> data) {
    this.data = data;
    return this;
  }

  public DescribeNatFirewallControlPolicyResponse addDataItem(DataForDescribeNatFirewallControlPolicyOutput dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<DataForDescribeNatFirewallControlPolicyOutput>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Valid
  @Schema(description = "")
  public List<DataForDescribeNatFirewallControlPolicyOutput> getData() {
    return data;
  }

  public void setData(List<DataForDescribeNatFirewallControlPolicyOutput> data) {
    this.data = data;
  }

  public DescribeNatFirewallControlPolicyResponse pageNumber(Integer pageNumber) {
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

  public DescribeNatFirewallControlPolicyResponse pageSize(Integer pageSize) {
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

  public DescribeNatFirewallControlPolicyResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeNatFirewallControlPolicyResponse describeNatFirewallControlPolicyResponse = (DescribeNatFirewallControlPolicyResponse) o;
    return Objects.equals(this.count, describeNatFirewallControlPolicyResponse.count) &&
        Objects.equals(this.data, describeNatFirewallControlPolicyResponse.data) &&
        Objects.equals(this.pageNumber, describeNatFirewallControlPolicyResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeNatFirewallControlPolicyResponse.pageSize) &&
        Objects.equals(this.totalCount, describeNatFirewallControlPolicyResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data, pageNumber, pageSize, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeNatFirewallControlPolicyResponse {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
