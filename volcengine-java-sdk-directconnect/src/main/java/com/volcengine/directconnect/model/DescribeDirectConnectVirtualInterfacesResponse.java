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
import com.volcengine.directconnect.model.VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDirectConnectVirtualInterfacesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:27.325524+08:00[Asia/Shanghai]")
public class DescribeDirectConnectVirtualInterfacesResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  @SerializedName("VirtualInterfaces")
  private List<VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput> virtualInterfaces = null;

  public DescribeDirectConnectVirtualInterfacesResponse pageNumber(Integer pageNumber) {
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

  public DescribeDirectConnectVirtualInterfacesResponse pageSize(Integer pageSize) {
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

  public DescribeDirectConnectVirtualInterfacesResponse requestId(String requestId) {
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

  public DescribeDirectConnectVirtualInterfacesResponse totalCount(Integer totalCount) {
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

  public DescribeDirectConnectVirtualInterfacesResponse virtualInterfaces(List<VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput> virtualInterfaces) {
    this.virtualInterfaces = virtualInterfaces;
    return this;
  }

  public DescribeDirectConnectVirtualInterfacesResponse addVirtualInterfacesItem(VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput virtualInterfacesItem) {
    if (this.virtualInterfaces == null) {
      this.virtualInterfaces = new ArrayList<VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput>();
    }
    this.virtualInterfaces.add(virtualInterfacesItem);
    return this;
  }

   /**
   * Get virtualInterfaces
   * @return virtualInterfaces
  **/
  @Valid
  @Schema(description = "")
  public List<VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput> getVirtualInterfaces() {
    return virtualInterfaces;
  }

  public void setVirtualInterfaces(List<VirtualInterfaceForDescribeDirectConnectVirtualInterfacesOutput> virtualInterfaces) {
    this.virtualInterfaces = virtualInterfaces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDirectConnectVirtualInterfacesResponse describeDirectConnectVirtualInterfacesResponse = (DescribeDirectConnectVirtualInterfacesResponse) o;
    return Objects.equals(this.pageNumber, describeDirectConnectVirtualInterfacesResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeDirectConnectVirtualInterfacesResponse.pageSize) &&
        Objects.equals(this.requestId, describeDirectConnectVirtualInterfacesResponse.requestId) &&
        Objects.equals(this.totalCount, describeDirectConnectVirtualInterfacesResponse.totalCount) &&
        Objects.equals(this.virtualInterfaces, describeDirectConnectVirtualInterfacesResponse.virtualInterfaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, requestId, totalCount, virtualInterfaces);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDirectConnectVirtualInterfacesResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    virtualInterfaces: ").append(toIndentedString(virtualInterfaces)).append("\n");
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