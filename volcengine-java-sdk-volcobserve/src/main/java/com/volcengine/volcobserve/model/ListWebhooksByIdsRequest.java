/*
 * volc_observe
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcobserve.model;

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
 * ListWebhooksByIdsRequest
 */



public class ListWebhooksByIdsRequest {
  @SerializedName("Asc")
  private Boolean asc = null;

  @SerializedName("Ids")
  private List<String> ids = null;

  @SerializedName("OrderBy")
  private String orderBy = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public ListWebhooksByIdsRequest asc(Boolean asc) {
    this.asc = asc;
    return this;
  }

   /**
   * Get asc
   * @return asc
  **/
  @Schema(description = "")
  public Boolean isAsc() {
    return asc;
  }

  public void setAsc(Boolean asc) {
    this.asc = asc;
  }

  public ListWebhooksByIdsRequest ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public ListWebhooksByIdsRequest addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<String>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  @Schema(description = "")
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  public ListWebhooksByIdsRequest orderBy(String orderBy) {
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

  public ListWebhooksByIdsRequest pageNumber(Integer pageNumber) {
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

  public ListWebhooksByIdsRequest pageSize(Integer pageSize) {
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

  public ListWebhooksByIdsRequest totalCount(Integer totalCount) {
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
    ListWebhooksByIdsRequest listWebhooksByIdsRequest = (ListWebhooksByIdsRequest) o;
    return Objects.equals(this.asc, listWebhooksByIdsRequest.asc) &&
        Objects.equals(this.ids, listWebhooksByIdsRequest.ids) &&
        Objects.equals(this.orderBy, listWebhooksByIdsRequest.orderBy) &&
        Objects.equals(this.pageNumber, listWebhooksByIdsRequest.pageNumber) &&
        Objects.equals(this.pageSize, listWebhooksByIdsRequest.pageSize) &&
        Objects.equals(this.totalCount, listWebhooksByIdsRequest.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asc, ids, orderBy, pageNumber, pageSize, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListWebhooksByIdsRequest {\n");
    
    sb.append("    asc: ").append(toIndentedString(asc)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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
