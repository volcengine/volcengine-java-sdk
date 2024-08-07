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
 * CacheActionForDescribeCdnConfigOutput
 */



public class CacheActionForDescribeCdnConfigOutput {
  @SerializedName("Action")
  private String action = null;

  @SerializedName("DefaultPolicy")
  private String defaultPolicy = null;

  @SerializedName("IgnoreCase")
  private Boolean ignoreCase = null;

  @SerializedName("Ttl")
  private Long ttl = null;

  public CacheActionForDescribeCdnConfigOutput action(String action) {
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

  public CacheActionForDescribeCdnConfigOutput defaultPolicy(String defaultPolicy) {
    this.defaultPolicy = defaultPolicy;
    return this;
  }

   /**
   * Get defaultPolicy
   * @return defaultPolicy
  **/
  @Schema(description = "")
  public String getDefaultPolicy() {
    return defaultPolicy;
  }

  public void setDefaultPolicy(String defaultPolicy) {
    this.defaultPolicy = defaultPolicy;
  }

  public CacheActionForDescribeCdnConfigOutput ignoreCase(Boolean ignoreCase) {
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

  public CacheActionForDescribeCdnConfigOutput ttl(Long ttl) {
    this.ttl = ttl;
    return this;
  }

   /**
   * Get ttl
   * @return ttl
  **/
  @Schema(description = "")
  public Long getTtl() {
    return ttl;
  }

  public void setTtl(Long ttl) {
    this.ttl = ttl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheActionForDescribeCdnConfigOutput cacheActionForDescribeCdnConfigOutput = (CacheActionForDescribeCdnConfigOutput) o;
    return Objects.equals(this.action, cacheActionForDescribeCdnConfigOutput.action) &&
        Objects.equals(this.defaultPolicy, cacheActionForDescribeCdnConfigOutput.defaultPolicy) &&
        Objects.equals(this.ignoreCase, cacheActionForDescribeCdnConfigOutput.ignoreCase) &&
        Objects.equals(this.ttl, cacheActionForDescribeCdnConfigOutput.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, defaultPolicy, ignoreCase, ttl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheActionForDescribeCdnConfigOutput {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    defaultPolicy: ").append(toIndentedString(defaultPolicy)).append("\n");
    sb.append("    ignoreCase: ").append(toIndentedString(ignoreCase)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
