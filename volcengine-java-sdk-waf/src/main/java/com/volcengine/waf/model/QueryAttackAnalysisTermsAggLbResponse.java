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
import com.volcengine.waf.model.ItemForQueryAttackAnalysisTermsAggLbOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * QueryAttackAnalysisTermsAggLbResponse
 */



public class QueryAttackAnalysisTermsAggLbResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Items")
  private List<ItemForQueryAttackAnalysisTermsAggLbOutput> items = null;

  @SerializedName("Total")
  private Float total = null;

  public QueryAttackAnalysisTermsAggLbResponse items(List<ItemForQueryAttackAnalysisTermsAggLbOutput> items) {
    this.items = items;
    return this;
  }

  public QueryAttackAnalysisTermsAggLbResponse addItemsItem(ItemForQueryAttackAnalysisTermsAggLbOutput itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ItemForQueryAttackAnalysisTermsAggLbOutput>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Valid
  @Schema(description = "")
  public List<ItemForQueryAttackAnalysisTermsAggLbOutput> getItems() {
    return items;
  }

  public void setItems(List<ItemForQueryAttackAnalysisTermsAggLbOutput> items) {
    this.items = items;
  }

  public QueryAttackAnalysisTermsAggLbResponse total(Float total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Float getTotal() {
    return total;
  }

  public void setTotal(Float total) {
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
    QueryAttackAnalysisTermsAggLbResponse queryAttackAnalysisTermsAggLbResponse = (QueryAttackAnalysisTermsAggLbResponse) o;
    return Objects.equals(this.items, queryAttackAnalysisTermsAggLbResponse.items) &&
        Objects.equals(this.total, queryAttackAnalysisTermsAggLbResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAttackAnalysisTermsAggLbResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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