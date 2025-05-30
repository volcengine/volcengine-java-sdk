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
import com.volcengine.vmp.model.FilterForListAlertSamplesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListAlertSamplesRequest
 */



public class ListAlertSamplesRequest {
  @SerializedName("Filter")
  private FilterForListAlertSamplesInput filter = null;

  @SerializedName("Limit")
  private Long limit = null;

  public ListAlertSamplesRequest filter(FilterForListAlertSamplesInput filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Valid
  @Schema(description = "")
  public FilterForListAlertSamplesInput getFilter() {
    return filter;
  }

  public void setFilter(FilterForListAlertSamplesInput filter) {
    this.filter = filter;
  }

  public ListAlertSamplesRequest limit(Long limit) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAlertSamplesRequest listAlertSamplesRequest = (ListAlertSamplesRequest) o;
    return Objects.equals(this.filter, listAlertSamplesRequest.filter) &&
        Objects.equals(this.limit, listAlertSamplesRequest.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, limit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAlertSamplesRequest {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
