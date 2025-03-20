/*
 * filenas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.filenas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.filenas.model.DataFlowForDescribeDataFlowsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDataFlowsResponse
 */



public class DescribeDataFlowsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("DataFlows")
  private List<DataFlowForDescribeDataFlowsOutput> dataFlows = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeDataFlowsResponse dataFlows(List<DataFlowForDescribeDataFlowsOutput> dataFlows) {
    this.dataFlows = dataFlows;
    return this;
  }

  public DescribeDataFlowsResponse addDataFlowsItem(DataFlowForDescribeDataFlowsOutput dataFlowsItem) {
    if (this.dataFlows == null) {
      this.dataFlows = new ArrayList<DataFlowForDescribeDataFlowsOutput>();
    }
    this.dataFlows.add(dataFlowsItem);
    return this;
  }

   /**
   * Get dataFlows
   * @return dataFlows
  **/
  @Valid
  @Schema(description = "")
  public List<DataFlowForDescribeDataFlowsOutput> getDataFlows() {
    return dataFlows;
  }

  public void setDataFlows(List<DataFlowForDescribeDataFlowsOutput> dataFlows) {
    this.dataFlows = dataFlows;
  }

  public DescribeDataFlowsResponse pageNumber(Integer pageNumber) {
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

  public DescribeDataFlowsResponse pageSize(Integer pageSize) {
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

  public DescribeDataFlowsResponse totalCount(Integer totalCount) {
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
    DescribeDataFlowsResponse describeDataFlowsResponse = (DescribeDataFlowsResponse) o;
    return Objects.equals(this.dataFlows, describeDataFlowsResponse.dataFlows) &&
        Objects.equals(this.pageNumber, describeDataFlowsResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeDataFlowsResponse.pageSize) &&
        Objects.equals(this.totalCount, describeDataFlowsResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataFlows, pageNumber, pageSize, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDataFlowsResponse {\n");
    
    sb.append("    dataFlows: ").append(toIndentedString(dataFlows)).append("\n");
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
