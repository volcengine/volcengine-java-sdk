/*
 * bio
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.bio.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.bio.model.ItemForListDataModelsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListDataModelsResponse
 */



public class ListDataModelsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Items")
  private List<ItemForListDataModelsOutput> items = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public ListDataModelsResponse items(List<ItemForListDataModelsOutput> items) {
    this.items = items;
    return this;
  }

  public ListDataModelsResponse addItemsItem(ItemForListDataModelsOutput itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ItemForListDataModelsOutput>();
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
  public List<ItemForListDataModelsOutput> getItems() {
    return items;
  }

  public void setItems(List<ItemForListDataModelsOutput> items) {
    this.items = items;
  }

  public ListDataModelsResponse totalCount(Integer totalCount) {
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
    ListDataModelsResponse listDataModelsResponse = (ListDataModelsResponse) o;
    return Objects.equals(this.items, listDataModelsResponse.items) &&
        Objects.equals(this.totalCount, listDataModelsResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDataModelsResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
