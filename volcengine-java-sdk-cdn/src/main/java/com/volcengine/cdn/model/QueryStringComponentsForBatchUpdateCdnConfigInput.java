/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * QueryStringComponentsForBatchUpdateCdnConfigInput
 */



public class QueryStringComponentsForBatchUpdateCdnConfigInput {
  @SerializedName("Action")
  private String action = null;

  @SerializedName("Value")
  private String value = null;

  public QueryStringComponentsForBatchUpdateCdnConfigInput action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public QueryStringComponentsForBatchUpdateCdnConfigInput value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryStringComponentsForBatchUpdateCdnConfigInput queryStringComponentsForBatchUpdateCdnConfigInput = (QueryStringComponentsForBatchUpdateCdnConfigInput) o;
    return Objects.equals(this.action, queryStringComponentsForBatchUpdateCdnConfigInput.action) &&
        Objects.equals(this.value, queryStringComponentsForBatchUpdateCdnConfigInput.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryStringComponentsForBatchUpdateCdnConfigInput {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
