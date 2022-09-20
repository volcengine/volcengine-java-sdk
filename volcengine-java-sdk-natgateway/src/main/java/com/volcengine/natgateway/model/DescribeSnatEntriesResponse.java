/*
 * natgateway
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.natgateway.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.natgateway.model.SnatEntryForDescribeSnatEntriesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeSnatEntriesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-20T11:35:38.283928+08:00[Asia/Shanghai]")
public class DescribeSnatEntriesResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("SnatEntries")
  private List<SnatEntryForDescribeSnatEntriesOutput> snatEntries = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeSnatEntriesResponse pageNumber(Integer pageNumber) {
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

  public DescribeSnatEntriesResponse pageSize(Integer pageSize) {
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

  public DescribeSnatEntriesResponse requestId(String requestId) {
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

  public DescribeSnatEntriesResponse snatEntries(List<SnatEntryForDescribeSnatEntriesOutput> snatEntries) {
    this.snatEntries = snatEntries;
    return this;
  }

  public DescribeSnatEntriesResponse addSnatEntriesItem(SnatEntryForDescribeSnatEntriesOutput snatEntriesItem) {
    if (this.snatEntries == null) {
      this.snatEntries = new ArrayList<SnatEntryForDescribeSnatEntriesOutput>();
    }
    this.snatEntries.add(snatEntriesItem);
    return this;
  }

   /**
   * Get snatEntries
   * @return snatEntries
  **/
  @Valid
  @Schema(description = "")
  public List<SnatEntryForDescribeSnatEntriesOutput> getSnatEntries() {
    return snatEntries;
  }

  public void setSnatEntries(List<SnatEntryForDescribeSnatEntriesOutput> snatEntries) {
    this.snatEntries = snatEntries;
  }

  public DescribeSnatEntriesResponse totalCount(Integer totalCount) {
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
    DescribeSnatEntriesResponse describeSnatEntriesResponse = (DescribeSnatEntriesResponse) o;
    return Objects.equals(this.pageNumber, describeSnatEntriesResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeSnatEntriesResponse.pageSize) &&
        Objects.equals(this.requestId, describeSnatEntriesResponse.requestId) &&
        Objects.equals(this.snatEntries, describeSnatEntriesResponse.snatEntries) &&
        Objects.equals(this.totalCount, describeSnatEntriesResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, requestId, snatEntries, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSnatEntriesResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    snatEntries: ").append(toIndentedString(snatEntries)).append("\n");
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
