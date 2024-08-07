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
 * QueryStringInstanceForAddCdnDomainInput
 */



public class QueryStringInstanceForAddCdnDomainInput {
  @SerializedName("Action")
  private String action = null;

  @SerializedName("Key")
  private String key = null;

  @SerializedName("Value")
  private String value = null;

  @SerializedName("ValueType")
  private String valueType = null;

  public QueryStringInstanceForAddCdnDomainInput action(String action) {
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

  public QueryStringInstanceForAddCdnDomainInput key(String key) {
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

  public QueryStringInstanceForAddCdnDomainInput value(String value) {
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

  public QueryStringInstanceForAddCdnDomainInput valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @Schema(description = "")
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryStringInstanceForAddCdnDomainInput queryStringInstanceForAddCdnDomainInput = (QueryStringInstanceForAddCdnDomainInput) o;
    return Objects.equals(this.action, queryStringInstanceForAddCdnDomainInput.action) &&
        Objects.equals(this.key, queryStringInstanceForAddCdnDomainInput.key) &&
        Objects.equals(this.value, queryStringInstanceForAddCdnDomainInput.value) &&
        Objects.equals(this.valueType, queryStringInstanceForAddCdnDomainInput.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, key, value, valueType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryStringInstanceForAddCdnDomainInput {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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
