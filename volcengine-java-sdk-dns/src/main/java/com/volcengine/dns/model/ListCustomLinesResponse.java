/*
 * dns
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dns.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.dns.model.CustomerLineForListCustomLinesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListCustomLinesResponse
 */



public class ListCustomLinesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CustomerLines")
  private List<CustomerLineForListCustomLinesOutput> customerLines = null;

  @SerializedName("IPSegmentCount")
  private Integer ipSegmentCount = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public ListCustomLinesResponse customerLines(List<CustomerLineForListCustomLinesOutput> customerLines) {
    this.customerLines = customerLines;
    return this;
  }

  public ListCustomLinesResponse addCustomerLinesItem(CustomerLineForListCustomLinesOutput customerLinesItem) {
    if (this.customerLines == null) {
      this.customerLines = new ArrayList<CustomerLineForListCustomLinesOutput>();
    }
    this.customerLines.add(customerLinesItem);
    return this;
  }

   /**
   * Get customerLines
   * @return customerLines
  **/
  @Valid
  @Schema(description = "")
  public List<CustomerLineForListCustomLinesOutput> getCustomerLines() {
    return customerLines;
  }

  public void setCustomerLines(List<CustomerLineForListCustomLinesOutput> customerLines) {
    this.customerLines = customerLines;
  }

  public ListCustomLinesResponse ipSegmentCount(Integer ipSegmentCount) {
    this.ipSegmentCount = ipSegmentCount;
    return this;
  }

   /**
   * Get ipSegmentCount
   * @return ipSegmentCount
  **/
  @Schema(description = "")
  public Integer getIpSegmentCount() {
    return ipSegmentCount;
  }

  public void setIpSegmentCount(Integer ipSegmentCount) {
    this.ipSegmentCount = ipSegmentCount;
  }

  public ListCustomLinesResponse pageNumber(Integer pageNumber) {
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

  public ListCustomLinesResponse pageSize(Integer pageSize) {
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

  public ListCustomLinesResponse totalCount(Integer totalCount) {
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
    ListCustomLinesResponse listCustomLinesResponse = (ListCustomLinesResponse) o;
    return Objects.equals(this.customerLines, listCustomLinesResponse.customerLines) &&
        Objects.equals(this.ipSegmentCount, listCustomLinesResponse.ipSegmentCount) &&
        Objects.equals(this.pageNumber, listCustomLinesResponse.pageNumber) &&
        Objects.equals(this.pageSize, listCustomLinesResponse.pageSize) &&
        Objects.equals(this.totalCount, listCustomLinesResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerLines, ipSegmentCount, pageNumber, pageSize, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCustomLinesResponse {\n");
    
    sb.append("    customerLines: ").append(toIndentedString(customerLines)).append("\n");
    sb.append("    ipSegmentCount: ").append(toIndentedString(ipSegmentCount)).append("\n");
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
