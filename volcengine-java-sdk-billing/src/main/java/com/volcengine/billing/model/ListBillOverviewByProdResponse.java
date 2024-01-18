/*
 * billing
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.billing.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.billing.model.ListForListBillOverviewByProdOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListBillOverviewByProdResponse
 */


public class ListBillOverviewByProdResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Limit")
  private Integer limit = null;

  @SerializedName("List")
  private List<ListForListBillOverviewByProdOutput> list = null;

  @SerializedName("Offset")
  private Integer offset = null;

  @SerializedName("Total")
  private Integer total = null;

  public ListBillOverviewByProdResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @Schema(description = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ListBillOverviewByProdResponse list(List<ListForListBillOverviewByProdOutput> list) {
    this.list = list;
    return this;
  }

  public ListBillOverviewByProdResponse addListItem(ListForListBillOverviewByProdOutput listItem) {
    if (this.list == null) {
      this.list = new ArrayList<ListForListBillOverviewByProdOutput>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @Valid
  @Schema(description = "")
  public List<ListForListBillOverviewByProdOutput> getList() {
    return list;
  }

  public void setList(List<ListForListBillOverviewByProdOutput> list) {
    this.list = list;
  }

  public ListBillOverviewByProdResponse offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @Schema(description = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public ListBillOverviewByProdResponse total(Integer total) {
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
    ListBillOverviewByProdResponse listBillOverviewByProdResponse = (ListBillOverviewByProdResponse) o;
    return Objects.equals(this.limit, listBillOverviewByProdResponse.limit) &&
        Objects.equals(this.list, listBillOverviewByProdResponse.list) &&
        Objects.equals(this.offset, listBillOverviewByProdResponse.offset) &&
        Objects.equals(this.total, listBillOverviewByProdResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, list, offset, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBillOverviewByProdResponse {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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