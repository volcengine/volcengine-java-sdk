/*
 * vefaas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vefaas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vefaas.model.ItemForListTriggersOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListTriggersResponse
 */



public class ListTriggersResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Items")
  private List<ItemForListTriggersOutput> items = null;

  @SerializedName("Total")
  private Integer total = null;

  public ListTriggersResponse items(List<ItemForListTriggersOutput> items) {
    this.items = items;
    return this;
  }

  public ListTriggersResponse addItemsItem(ItemForListTriggersOutput itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ItemForListTriggersOutput>();
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
  public List<ItemForListTriggersOutput> getItems() {
    return items;
  }

  public void setItems(List<ItemForListTriggersOutput> items) {
    this.items = items;
  }

  public ListTriggersResponse total(Integer total) {
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
    ListTriggersResponse listTriggersResponse = (ListTriggersResponse) o;
    return Objects.equals(this.items, listTriggersResponse.items) &&
        Objects.equals(this.total, listTriggersResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTriggersResponse {\n");
    
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
