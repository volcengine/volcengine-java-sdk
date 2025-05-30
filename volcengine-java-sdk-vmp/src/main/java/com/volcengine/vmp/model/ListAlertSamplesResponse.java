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
import com.volcengine.vmp.model.ItemForListAlertSamplesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListAlertSamplesResponse
 */



public class ListAlertSamplesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Items")
  private List<ItemForListAlertSamplesOutput> items = null;

  @SerializedName("Total")
  private Long total = null;

  public ListAlertSamplesResponse items(List<ItemForListAlertSamplesOutput> items) {
    this.items = items;
    return this;
  }

  public ListAlertSamplesResponse addItemsItem(ItemForListAlertSamplesOutput itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ItemForListAlertSamplesOutput>();
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
  public List<ItemForListAlertSamplesOutput> getItems() {
    return items;
  }

  public void setItems(List<ItemForListAlertSamplesOutput> items) {
    this.items = items;
  }

  public ListAlertSamplesResponse total(Long total) {
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
    ListAlertSamplesResponse listAlertSamplesResponse = (ListAlertSamplesResponse) o;
    return Objects.equals(this.items, listAlertSamplesResponse.items) &&
        Objects.equals(this.total, listAlertSamplesResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAlertSamplesResponse {\n");
    
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
