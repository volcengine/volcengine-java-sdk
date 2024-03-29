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
import com.volcengine.cen.model.CenBandwidthPackageForDescribeCenBandwidthPackagesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeCenBandwidthPackagesResponse
 */


public class DescribeCenBandwidthPackagesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CenBandwidthPackages")
  private List<CenBandwidthPackageForDescribeCenBandwidthPackagesOutput> cenBandwidthPackages = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeCenBandwidthPackagesResponse cenBandwidthPackages(List<CenBandwidthPackageForDescribeCenBandwidthPackagesOutput> cenBandwidthPackages) {
    this.cenBandwidthPackages = cenBandwidthPackages;
    return this;
  }

  public DescribeCenBandwidthPackagesResponse addCenBandwidthPackagesItem(CenBandwidthPackageForDescribeCenBandwidthPackagesOutput cenBandwidthPackagesItem) {
    if (this.cenBandwidthPackages == null) {
      this.cenBandwidthPackages = new ArrayList<CenBandwidthPackageForDescribeCenBandwidthPackagesOutput>();
    }
    this.cenBandwidthPackages.add(cenBandwidthPackagesItem);
    return this;
  }

   /**
   * Get cenBandwidthPackages
   * @return cenBandwidthPackages
  **/
  @Valid
  @Schema(description = "")
  public List<CenBandwidthPackageForDescribeCenBandwidthPackagesOutput> getCenBandwidthPackages() {
    return cenBandwidthPackages;
  }

  public void setCenBandwidthPackages(List<CenBandwidthPackageForDescribeCenBandwidthPackagesOutput> cenBandwidthPackages) {
    this.cenBandwidthPackages = cenBandwidthPackages;
  }

  public DescribeCenBandwidthPackagesResponse pageNumber(Integer pageNumber) {
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

  public DescribeCenBandwidthPackagesResponse pageSize(Integer pageSize) {
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

  public DescribeCenBandwidthPackagesResponse requestId(String requestId) {
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

  public DescribeCenBandwidthPackagesResponse totalCount(Integer totalCount) {
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
    DescribeCenBandwidthPackagesResponse describeCenBandwidthPackagesResponse = (DescribeCenBandwidthPackagesResponse) o;
    return Objects.equals(this.cenBandwidthPackages, describeCenBandwidthPackagesResponse.cenBandwidthPackages) &&
        Objects.equals(this.pageNumber, describeCenBandwidthPackagesResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeCenBandwidthPackagesResponse.pageSize) &&
        Objects.equals(this.requestId, describeCenBandwidthPackagesResponse.requestId) &&
        Objects.equals(this.totalCount, describeCenBandwidthPackagesResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cenBandwidthPackages, pageNumber, pageSize, requestId, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCenBandwidthPackagesResponse {\n");
    
    sb.append("    cenBandwidthPackages: ").append(toIndentedString(cenBandwidthPackages)).append("\n");
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
