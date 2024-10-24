/*
 * storage_ebs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.storageebs.model;

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
 * DescribeVolumeTypeRequest
 */



public class DescribeVolumeTypeRequest {
  @SerializedName("Filter")
  private String filter = null;

  @SerializedName("OrderBy")
  private String orderBy = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ResourceClass")
  private String resourceClass = null;

  @SerializedName("VolumeTypeIds")
  private List<String> volumeTypeIds = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public DescribeVolumeTypeRequest filter(String filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Schema(description = "")
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public DescribeVolumeTypeRequest orderBy(String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @Schema(description = "")
  public String getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

  public DescribeVolumeTypeRequest pageNumber(Integer pageNumber) {
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

  public DescribeVolumeTypeRequest pageSize(Integer pageSize) {
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

  public DescribeVolumeTypeRequest resourceClass(String resourceClass) {
    this.resourceClass = resourceClass;
    return this;
  }

   /**
   * Get resourceClass
   * @return resourceClass
  **/
  @Schema(description = "")
  public String getResourceClass() {
    return resourceClass;
  }

  public void setResourceClass(String resourceClass) {
    this.resourceClass = resourceClass;
  }

  public DescribeVolumeTypeRequest volumeTypeIds(List<String> volumeTypeIds) {
    this.volumeTypeIds = volumeTypeIds;
    return this;
  }

  public DescribeVolumeTypeRequest addVolumeTypeIdsItem(String volumeTypeIdsItem) {
    if (this.volumeTypeIds == null) {
      this.volumeTypeIds = new ArrayList<String>();
    }
    this.volumeTypeIds.add(volumeTypeIdsItem);
    return this;
  }

   /**
   * Get volumeTypeIds
   * @return volumeTypeIds
  **/
  @Schema(description = "")
  public List<String> getVolumeTypeIds() {
    return volumeTypeIds;
  }

  public void setVolumeTypeIds(List<String> volumeTypeIds) {
    this.volumeTypeIds = volumeTypeIds;
  }

  public DescribeVolumeTypeRequest zoneId(String zoneId) {
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
    DescribeVolumeTypeRequest describeVolumeTypeRequest = (DescribeVolumeTypeRequest) o;
    return Objects.equals(this.filter, describeVolumeTypeRequest.filter) &&
        Objects.equals(this.orderBy, describeVolumeTypeRequest.orderBy) &&
        Objects.equals(this.pageNumber, describeVolumeTypeRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeVolumeTypeRequest.pageSize) &&
        Objects.equals(this.resourceClass, describeVolumeTypeRequest.resourceClass) &&
        Objects.equals(this.volumeTypeIds, describeVolumeTypeRequest.volumeTypeIds) &&
        Objects.equals(this.zoneId, describeVolumeTypeRequest.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, orderBy, pageNumber, pageSize, resourceClass, volumeTypeIds, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVolumeTypeRequest {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    resourceClass: ").append(toIndentedString(resourceClass)).append("\n");
    sb.append("    volumeTypeIds: ").append(toIndentedString(volumeTypeIds)).append("\n");
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
