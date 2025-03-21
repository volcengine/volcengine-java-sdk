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
import com.volcengine.filenas.model.DirQuotaInfoForDescribeDirQuotasOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDirQuotasResponse
 */



public class DescribeDirQuotasResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("DirQuotaInfos")
  private List<DirQuotaInfoForDescribeDirQuotasOutput> dirQuotaInfos = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeDirQuotasResponse dirQuotaInfos(List<DirQuotaInfoForDescribeDirQuotasOutput> dirQuotaInfos) {
    this.dirQuotaInfos = dirQuotaInfos;
    return this;
  }

  public DescribeDirQuotasResponse addDirQuotaInfosItem(DirQuotaInfoForDescribeDirQuotasOutput dirQuotaInfosItem) {
    if (this.dirQuotaInfos == null) {
      this.dirQuotaInfos = new ArrayList<DirQuotaInfoForDescribeDirQuotasOutput>();
    }
    this.dirQuotaInfos.add(dirQuotaInfosItem);
    return this;
  }

   /**
   * Get dirQuotaInfos
   * @return dirQuotaInfos
  **/
  @Valid
  @Schema(description = "")
  public List<DirQuotaInfoForDescribeDirQuotasOutput> getDirQuotaInfos() {
    return dirQuotaInfos;
  }

  public void setDirQuotaInfos(List<DirQuotaInfoForDescribeDirQuotasOutput> dirQuotaInfos) {
    this.dirQuotaInfos = dirQuotaInfos;
  }

  public DescribeDirQuotasResponse pageNumber(Integer pageNumber) {
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

  public DescribeDirQuotasResponse pageSize(Integer pageSize) {
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

  public DescribeDirQuotasResponse totalCount(Integer totalCount) {
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
    DescribeDirQuotasResponse describeDirQuotasResponse = (DescribeDirQuotasResponse) o;
    return Objects.equals(this.dirQuotaInfos, describeDirQuotasResponse.dirQuotaInfos) &&
        Objects.equals(this.pageNumber, describeDirQuotasResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeDirQuotasResponse.pageSize) &&
        Objects.equals(this.totalCount, describeDirQuotasResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dirQuotaInfos, pageNumber, pageSize, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDirQuotasResponse {\n");
    
    sb.append("    dirQuotaInfos: ").append(toIndentedString(dirQuotaInfos)).append("\n");
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
