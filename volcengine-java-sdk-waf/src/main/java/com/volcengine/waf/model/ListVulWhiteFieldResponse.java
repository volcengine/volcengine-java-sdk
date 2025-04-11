/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.waf.model.DataForListVulWhiteFieldOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListVulWhiteFieldResponse
 */



public class ListVulWhiteFieldResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Count")
  private Integer count = null;

  @SerializedName("CurrentPage")
  private Integer currentPage = null;

  @SerializedName("Data")
  private List<DataForListVulWhiteFieldOutput> data = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public ListVulWhiteFieldResponse count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(description = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ListVulWhiteFieldResponse currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

   /**
   * Get currentPage
   * @return currentPage
  **/
  @Schema(description = "")
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public ListVulWhiteFieldResponse data(List<DataForListVulWhiteFieldOutput> data) {
    this.data = data;
    return this;
  }

  public ListVulWhiteFieldResponse addDataItem(DataForListVulWhiteFieldOutput dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<DataForListVulWhiteFieldOutput>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Valid
  @Schema(description = "")
  public List<DataForListVulWhiteFieldOutput> getData() {
    return data;
  }

  public void setData(List<DataForListVulWhiteFieldOutput> data) {
    this.data = data;
  }

  public ListVulWhiteFieldResponse pageSize(Integer pageSize) {
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

  public ListVulWhiteFieldResponse totalCount(Integer totalCount) {
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
    ListVulWhiteFieldResponse listVulWhiteFieldResponse = (ListVulWhiteFieldResponse) o;
    return Objects.equals(this.count, listVulWhiteFieldResponse.count) &&
        Objects.equals(this.currentPage, listVulWhiteFieldResponse.currentPage) &&
        Objects.equals(this.data, listVulWhiteFieldResponse.data) &&
        Objects.equals(this.pageSize, listVulWhiteFieldResponse.pageSize) &&
        Objects.equals(this.totalCount, listVulWhiteFieldResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, currentPage, data, pageSize, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListVulWhiteFieldResponse {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
