/*
 * vmp
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vmp.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vmp.model.FilterForListAlertsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListAlertsRequest
 */



public class ListAlertsRequest {
  @SerializedName("Desc")
  private Boolean desc = null;

  @SerializedName("Filter")
  private FilterForListAlertsInput filter = null;

  @SerializedName("Limit")
  private Long limit = null;

  @SerializedName("OrderBy")
  private String orderBy = null;

  @SerializedName("SearchAfter")
  private String searchAfter = null;

  public ListAlertsRequest desc(Boolean desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @Schema(description = "")
  public Boolean isDesc() {
    return desc;
  }

  public void setDesc(Boolean desc) {
    this.desc = desc;
  }

  public ListAlertsRequest filter(FilterForListAlertsInput filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Valid
  @Schema(description = "")
  public FilterForListAlertsInput getFilter() {
    return filter;
  }

  public void setFilter(FilterForListAlertsInput filter) {
    this.filter = filter;
  }

  public ListAlertsRequest limit(Long limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @Schema(description = "")
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public ListAlertsRequest orderBy(String orderBy) {
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

  public ListAlertsRequest searchAfter(String searchAfter) {
    this.searchAfter = searchAfter;
    return this;
  }

   /**
   * Get searchAfter
   * @return searchAfter
  **/
  @Schema(description = "")
  public String getSearchAfter() {
    return searchAfter;
  }

  public void setSearchAfter(String searchAfter) {
    this.searchAfter = searchAfter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAlertsRequest listAlertsRequest = (ListAlertsRequest) o;
    return Objects.equals(this.desc, listAlertsRequest.desc) &&
        Objects.equals(this.filter, listAlertsRequest.filter) &&
        Objects.equals(this.limit, listAlertsRequest.limit) &&
        Objects.equals(this.orderBy, listAlertsRequest.orderBy) &&
        Objects.equals(this.searchAfter, listAlertsRequest.searchAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desc, filter, limit, orderBy, searchAfter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAlertsRequest {\n");
    
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    searchAfter: ").append(toIndentedString(searchAfter)).append("\n");
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
