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
import com.volcengine.vmp.model.ItemForListWorkspaceInstanceTypesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListWorkspaceInstanceTypesResponse
 */



public class ListWorkspaceInstanceTypesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Items")
  private List<ItemForListWorkspaceInstanceTypesOutput> items = null;

  @SerializedName("Total")
  private Long total = null;

  public ListWorkspaceInstanceTypesResponse items(List<ItemForListWorkspaceInstanceTypesOutput> items) {
    this.items = items;
    return this;
  }

  public ListWorkspaceInstanceTypesResponse addItemsItem(ItemForListWorkspaceInstanceTypesOutput itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ItemForListWorkspaceInstanceTypesOutput>();
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
  public List<ItemForListWorkspaceInstanceTypesOutput> getItems() {
    return items;
  }

  public void setItems(List<ItemForListWorkspaceInstanceTypesOutput> items) {
    this.items = items;
  }

  public ListWorkspaceInstanceTypesResponse total(Long total) {
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
    ListWorkspaceInstanceTypesResponse listWorkspaceInstanceTypesResponse = (ListWorkspaceInstanceTypesResponse) o;
    return Objects.equals(this.items, listWorkspaceInstanceTypesResponse.items) &&
        Objects.equals(this.total, listWorkspaceInstanceTypesResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListWorkspaceInstanceTypesResponse {\n");
    
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
