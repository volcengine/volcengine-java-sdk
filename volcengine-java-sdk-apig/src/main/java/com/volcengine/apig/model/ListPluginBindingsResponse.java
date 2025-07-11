/*
 * apig
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.apig.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.apig.model.ItemForListPluginBindingsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListPluginBindingsResponse
 */



public class ListPluginBindingsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Items")
  private List<ItemForListPluginBindingsOutput> items = null;

  @SerializedName("Total")
  private Long total = null;

  public ListPluginBindingsResponse items(List<ItemForListPluginBindingsOutput> items) {
    this.items = items;
    return this;
  }

  public ListPluginBindingsResponse addItemsItem(ItemForListPluginBindingsOutput itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ItemForListPluginBindingsOutput>();
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
  public List<ItemForListPluginBindingsOutput> getItems() {
    return items;
  }

  public void setItems(List<ItemForListPluginBindingsOutput> items) {
    this.items = items;
  }

  public ListPluginBindingsResponse total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
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
    ListPluginBindingsResponse listPluginBindingsResponse = (ListPluginBindingsResponse) o;
    return Objects.equals(this.items, listPluginBindingsResponse.items) &&
        Objects.equals(this.total, listPluginBindingsResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPluginBindingsResponse {\n");
    
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
