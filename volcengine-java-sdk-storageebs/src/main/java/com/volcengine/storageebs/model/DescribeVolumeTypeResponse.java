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
import com.volcengine.storageebs.model.VolumeTypeForDescribeVolumeTypeOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeVolumeTypeResponse
 */



public class DescribeVolumeTypeResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  @SerializedName("VolumeTypes")
  private List<VolumeTypeForDescribeVolumeTypeOutput> volumeTypes = null;

  public DescribeVolumeTypeResponse pageNumber(Integer pageNumber) {
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

  public DescribeVolumeTypeResponse pageSize(Integer pageSize) {
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

  public DescribeVolumeTypeResponse totalCount(Integer totalCount) {
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

  public DescribeVolumeTypeResponse volumeTypes(List<VolumeTypeForDescribeVolumeTypeOutput> volumeTypes) {
    this.volumeTypes = volumeTypes;
    return this;
  }

  public DescribeVolumeTypeResponse addVolumeTypesItem(VolumeTypeForDescribeVolumeTypeOutput volumeTypesItem) {
    if (this.volumeTypes == null) {
      this.volumeTypes = new ArrayList<VolumeTypeForDescribeVolumeTypeOutput>();
    }
    this.volumeTypes.add(volumeTypesItem);
    return this;
  }

   /**
   * Get volumeTypes
   * @return volumeTypes
  **/
  @Valid
  @Schema(description = "")
  public List<VolumeTypeForDescribeVolumeTypeOutput> getVolumeTypes() {
    return volumeTypes;
  }

  public void setVolumeTypes(List<VolumeTypeForDescribeVolumeTypeOutput> volumeTypes) {
    this.volumeTypes = volumeTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeVolumeTypeResponse describeVolumeTypeResponse = (DescribeVolumeTypeResponse) o;
    return Objects.equals(this.pageNumber, describeVolumeTypeResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeVolumeTypeResponse.pageSize) &&
        Objects.equals(this.totalCount, describeVolumeTypeResponse.totalCount) &&
        Objects.equals(this.volumeTypes, describeVolumeTypeResponse.volumeTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, totalCount, volumeTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVolumeTypeResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    volumeTypes: ").append(toIndentedString(volumeTypes)).append("\n");
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
