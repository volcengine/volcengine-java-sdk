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
 * CacheKeyComponentForDescribeCdnConfigOutput
 */



public class CacheKeyComponentForDescribeCdnConfigOutput {
  @SerializedName("Action")
  private String action = null;

  @SerializedName("IgnoreCase")
  private Boolean ignoreCase = null;

  @SerializedName("Object")
  private String object = null;

  @SerializedName("Subobject")
  private String subobject = null;

  public CacheKeyComponentForDescribeCdnConfigOutput action(String action) {
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

  public CacheKeyComponentForDescribeCdnConfigOutput ignoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
    return this;
  }

   /**
   * Get ignoreCase
   * @return ignoreCase
  **/
  @Schema(description = "")
  public Boolean isIgnoreCase() {
    return ignoreCase;
  }

  public void setIgnoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }

  public CacheKeyComponentForDescribeCdnConfigOutput object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @Schema(description = "")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public CacheKeyComponentForDescribeCdnConfigOutput subobject(String subobject) {
    this.subobject = subobject;
    return this;
  }

   /**
   * Get subobject
   * @return subobject
  **/
  @Schema(description = "")
  public String getSubobject() {
    return subobject;
  }

  public void setSubobject(String subobject) {
    this.subobject = subobject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheKeyComponentForDescribeCdnConfigOutput cacheKeyComponentForDescribeCdnConfigOutput = (CacheKeyComponentForDescribeCdnConfigOutput) o;
    return Objects.equals(this.action, cacheKeyComponentForDescribeCdnConfigOutput.action) &&
        Objects.equals(this.ignoreCase, cacheKeyComponentForDescribeCdnConfigOutput.ignoreCase) &&
        Objects.equals(this.object, cacheKeyComponentForDescribeCdnConfigOutput.object) &&
        Objects.equals(this.subobject, cacheKeyComponentForDescribeCdnConfigOutput.subobject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, ignoreCase, object, subobject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheKeyComponentForDescribeCdnConfigOutput {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    ignoreCase: ").append(toIndentedString(ignoreCase)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    subobject: ").append(toIndentedString(subobject)).append("\n");
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
