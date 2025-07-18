/*
 * apig20221112
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.apig20221112.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.apig20221112.model.PathForUpdateRouteInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * QueryStringForUpdateRouteInput
 */



public class QueryStringForUpdateRouteInput {
  @SerializedName("Key")
  private String key = null;

  @SerializedName("Value")
  private PathForUpdateRouteInput value = null;

  public QueryStringForUpdateRouteInput key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public QueryStringForUpdateRouteInput value(PathForUpdateRouteInput value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Valid
  @Schema(description = "")
  public PathForUpdateRouteInput getValue() {
    return value;
  }

  public void setValue(PathForUpdateRouteInput value) {
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
    QueryStringForUpdateRouteInput queryStringForUpdateRouteInput = (QueryStringForUpdateRouteInput) o;
    return Objects.equals(this.key, queryStringForUpdateRouteInput.key) &&
        Objects.equals(this.value, queryStringForUpdateRouteInput.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryStringForUpdateRouteInput {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
