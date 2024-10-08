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
import com.volcengine.privatelink.model.VpcEndpointServiceForDescribeVpcEndpointServicesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeVpcEndpointServicesResponse
 */



public class DescribeVpcEndpointServicesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  @SerializedName("VpcEndpointServices")
  private List<VpcEndpointServiceForDescribeVpcEndpointServicesOutput> vpcEndpointServices = null;

  public DescribeVpcEndpointServicesResponse pageNumber(Integer pageNumber) {
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

  public DescribeVpcEndpointServicesResponse pageSize(Integer pageSize) {
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

  public DescribeVpcEndpointServicesResponse requestId(String requestId) {
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

  public DescribeVpcEndpointServicesResponse totalCount(Integer totalCount) {
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

  public DescribeVpcEndpointServicesResponse vpcEndpointServices(List<VpcEndpointServiceForDescribeVpcEndpointServicesOutput> vpcEndpointServices) {
    this.vpcEndpointServices = vpcEndpointServices;
    return this;
  }

  public DescribeVpcEndpointServicesResponse addVpcEndpointServicesItem(VpcEndpointServiceForDescribeVpcEndpointServicesOutput vpcEndpointServicesItem) {
    if (this.vpcEndpointServices == null) {
      this.vpcEndpointServices = new ArrayList<VpcEndpointServiceForDescribeVpcEndpointServicesOutput>();
    }
    this.vpcEndpointServices.add(vpcEndpointServicesItem);
    return this;
  }

   /**
   * Get vpcEndpointServices
   * @return vpcEndpointServices
  **/
  @Valid
  @Schema(description = "")
  public List<VpcEndpointServiceForDescribeVpcEndpointServicesOutput> getVpcEndpointServices() {
    return vpcEndpointServices;
  }

  public void setVpcEndpointServices(List<VpcEndpointServiceForDescribeVpcEndpointServicesOutput> vpcEndpointServices) {
    this.vpcEndpointServices = vpcEndpointServices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeVpcEndpointServicesResponse describeVpcEndpointServicesResponse = (DescribeVpcEndpointServicesResponse) o;
    return Objects.equals(this.pageNumber, describeVpcEndpointServicesResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeVpcEndpointServicesResponse.pageSize) &&
        Objects.equals(this.requestId, describeVpcEndpointServicesResponse.requestId) &&
        Objects.equals(this.totalCount, describeVpcEndpointServicesResponse.totalCount) &&
        Objects.equals(this.vpcEndpointServices, describeVpcEndpointServicesResponse.vpcEndpointServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, requestId, totalCount, vpcEndpointServices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVpcEndpointServicesResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    vpcEndpointServices: ").append(toIndentedString(vpcEndpointServices)).append("\n");
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
