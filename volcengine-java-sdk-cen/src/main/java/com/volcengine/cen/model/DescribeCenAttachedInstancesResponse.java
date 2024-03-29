/*
 * cen
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cen.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cen.model.AttachedInstanceForDescribeCenAttachedInstancesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeCenAttachedInstancesResponse
 */


public class DescribeCenAttachedInstancesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AttachedInstances")
  private List<AttachedInstanceForDescribeCenAttachedInstancesOutput> attachedInstances = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeCenAttachedInstancesResponse attachedInstances(List<AttachedInstanceForDescribeCenAttachedInstancesOutput> attachedInstances) {
    this.attachedInstances = attachedInstances;
    return this;
  }

  public DescribeCenAttachedInstancesResponse addAttachedInstancesItem(AttachedInstanceForDescribeCenAttachedInstancesOutput attachedInstancesItem) {
    if (this.attachedInstances == null) {
      this.attachedInstances = new ArrayList<AttachedInstanceForDescribeCenAttachedInstancesOutput>();
    }
    this.attachedInstances.add(attachedInstancesItem);
    return this;
  }

   /**
   * Get attachedInstances
   * @return attachedInstances
  **/
  @Valid
  @Schema(description = "")
  public List<AttachedInstanceForDescribeCenAttachedInstancesOutput> getAttachedInstances() {
    return attachedInstances;
  }

  public void setAttachedInstances(List<AttachedInstanceForDescribeCenAttachedInstancesOutput> attachedInstances) {
    this.attachedInstances = attachedInstances;
  }

  public DescribeCenAttachedInstancesResponse pageNumber(Integer pageNumber) {
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

  public DescribeCenAttachedInstancesResponse pageSize(Integer pageSize) {
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

  public DescribeCenAttachedInstancesResponse requestId(String requestId) {
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

  public DescribeCenAttachedInstancesResponse totalCount(Integer totalCount) {
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
    DescribeCenAttachedInstancesResponse describeCenAttachedInstancesResponse = (DescribeCenAttachedInstancesResponse) o;
    return Objects.equals(this.attachedInstances, describeCenAttachedInstancesResponse.attachedInstances) &&
        Objects.equals(this.pageNumber, describeCenAttachedInstancesResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeCenAttachedInstancesResponse.pageSize) &&
        Objects.equals(this.requestId, describeCenAttachedInstancesResponse.requestId) &&
        Objects.equals(this.totalCount, describeCenAttachedInstancesResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachedInstances, pageNumber, pageSize, requestId, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCenAttachedInstancesResponse {\n");
    
    sb.append("    attachedInstances: ").append(toIndentedString(attachedInstances)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
