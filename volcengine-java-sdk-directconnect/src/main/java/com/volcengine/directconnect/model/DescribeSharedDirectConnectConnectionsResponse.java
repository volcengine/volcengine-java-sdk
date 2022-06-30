/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.directconnect.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.directconnect.model.SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeSharedDirectConnectConnectionsResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T19:55:09.552456+08:00[Asia/Shanghai]")
public class DescribeSharedDirectConnectConnectionsResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("SharedDirectConnectConnections")
  private List<SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput> sharedDirectConnectConnections = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeSharedDirectConnectConnectionsResponse pageNumber(Integer pageNumber) {
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

  public DescribeSharedDirectConnectConnectionsResponse pageSize(Integer pageSize) {
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

  public DescribeSharedDirectConnectConnectionsResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DescribeSharedDirectConnectConnectionsResponse sharedDirectConnectConnections(List<SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput> sharedDirectConnectConnections) {
    this.sharedDirectConnectConnections = sharedDirectConnectConnections;
    return this;
  }

  public DescribeSharedDirectConnectConnectionsResponse addSharedDirectConnectConnectionsItem(SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput sharedDirectConnectConnectionsItem) {
    if (this.sharedDirectConnectConnections == null) {
      this.sharedDirectConnectConnections = new ArrayList<SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput>();
    }
    this.sharedDirectConnectConnections.add(sharedDirectConnectConnectionsItem);
    return this;
  }

   /**
   * Get sharedDirectConnectConnections
   * @return sharedDirectConnectConnections
  **/
  @Valid
  @Schema(description = "")
  public List<SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput> getSharedDirectConnectConnections() {
    return sharedDirectConnectConnections;
  }

  public void setSharedDirectConnectConnections(List<SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput> sharedDirectConnectConnections) {
    this.sharedDirectConnectConnections = sharedDirectConnectConnections;
  }

  public DescribeSharedDirectConnectConnectionsResponse totalCount(Integer totalCount) {
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
    DescribeSharedDirectConnectConnectionsResponse describeSharedDirectConnectConnectionsResponse = (DescribeSharedDirectConnectConnectionsResponse) o;
    return Objects.equals(this.pageNumber, describeSharedDirectConnectConnectionsResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeSharedDirectConnectConnectionsResponse.pageSize) &&
        Objects.equals(this.requestId, describeSharedDirectConnectConnectionsResponse.requestId) &&
        Objects.equals(this.sharedDirectConnectConnections, describeSharedDirectConnectConnectionsResponse.sharedDirectConnectConnections) &&
        Objects.equals(this.totalCount, describeSharedDirectConnectConnectionsResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, requestId, sharedDirectConnectConnections, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSharedDirectConnectConnectionsResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    sharedDirectConnectConnections: ").append(toIndentedString(sharedDirectConnectConnections)).append("\n");
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
