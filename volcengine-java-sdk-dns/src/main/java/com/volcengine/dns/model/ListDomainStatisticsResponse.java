/*
 * dns
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dns.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.dns.model.DataForListDomainStatisticsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListDomainStatisticsResponse
 */



public class ListDomainStatisticsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Data")
  private List<DataForListDomainStatisticsOutput> data = null;

  @SerializedName("Page")
  private Integer page = null;

  @SerializedName("Size")
  private Integer size = null;

  @SerializedName("Total")
  private Integer total = null;

  public ListDomainStatisticsResponse data(List<DataForListDomainStatisticsOutput> data) {
    this.data = data;
    return this;
  }

  public ListDomainStatisticsResponse addDataItem(DataForListDomainStatisticsOutput dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<DataForListDomainStatisticsOutput>();
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
  public List<DataForListDomainStatisticsOutput> getData() {
    return data;
  }

  public void setData(List<DataForListDomainStatisticsOutput> data) {
    this.data = data;
  }

  public ListDomainStatisticsResponse page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @Schema(description = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public ListDomainStatisticsResponse size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public ListDomainStatisticsResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDomainStatisticsResponse listDomainStatisticsResponse = (ListDomainStatisticsResponse) o;
    return Objects.equals(this.data, listDomainStatisticsResponse.data) &&
        Objects.equals(this.page, listDomainStatisticsResponse.page) &&
        Objects.equals(this.size, listDomainStatisticsResponse.size) &&
        Objects.equals(this.total, listDomainStatisticsResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, page, size, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDomainStatisticsResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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