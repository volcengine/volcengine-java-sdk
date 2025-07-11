/*
 * aiotvideo
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.aiotvideo.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.aiotvideo.model.GBMediaForGetLocalDownloadOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetLocalDownloadResponse
 */



public class GetLocalDownloadResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("GBMedias")
  private List<GBMediaForGetLocalDownloadOutput> gbMedias = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public GetLocalDownloadResponse gbMedias(List<GBMediaForGetLocalDownloadOutput> gbMedias) {
    this.gbMedias = gbMedias;
    return this;
  }

  public GetLocalDownloadResponse addGbMediasItem(GBMediaForGetLocalDownloadOutput gbMediasItem) {
    if (this.gbMedias == null) {
      this.gbMedias = new ArrayList<GBMediaForGetLocalDownloadOutput>();
    }
    this.gbMedias.add(gbMediasItem);
    return this;
  }

   /**
   * Get gbMedias
   * @return gbMedias
  **/
  @Valid
  @Schema(description = "")
  public List<GBMediaForGetLocalDownloadOutput> getGbMedias() {
    return gbMedias;
  }

  public void setGbMedias(List<GBMediaForGetLocalDownloadOutput> gbMedias) {
    this.gbMedias = gbMedias;
  }

  public GetLocalDownloadResponse pageNumber(Integer pageNumber) {
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

  public GetLocalDownloadResponse pageSize(Integer pageSize) {
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

  public GetLocalDownloadResponse totalCount(Integer totalCount) {
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
    GetLocalDownloadResponse getLocalDownloadResponse = (GetLocalDownloadResponse) o;
    return Objects.equals(this.gbMedias, getLocalDownloadResponse.gbMedias) &&
        Objects.equals(this.pageNumber, getLocalDownloadResponse.pageNumber) &&
        Objects.equals(this.pageSize, getLocalDownloadResponse.pageSize) &&
        Objects.equals(this.totalCount, getLocalDownloadResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gbMedias, pageNumber, pageSize, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLocalDownloadResponse {\n");
    
    sb.append("    gbMedias: ").append(toIndentedString(gbMedias)).append("\n");
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
