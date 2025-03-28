/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

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
 * GetGlobalDefaultDeleteOptionResponse
 */



public class GetGlobalDefaultDeleteOptionResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("DefaultDeleteAllResources")
  private Boolean defaultDeleteAllResources = null;

  @SerializedName("LastChangeTime")
  private String lastChangeTime = null;

  public GetGlobalDefaultDeleteOptionResponse defaultDeleteAllResources(Boolean defaultDeleteAllResources) {
    this.defaultDeleteAllResources = defaultDeleteAllResources;
    return this;
  }

   /**
   * Get defaultDeleteAllResources
   * @return defaultDeleteAllResources
  **/
  @Schema(description = "")
  public Boolean isDefaultDeleteAllResources() {
    return defaultDeleteAllResources;
  }

  public void setDefaultDeleteAllResources(Boolean defaultDeleteAllResources) {
    this.defaultDeleteAllResources = defaultDeleteAllResources;
  }

  public GetGlobalDefaultDeleteOptionResponse lastChangeTime(String lastChangeTime) {
    this.lastChangeTime = lastChangeTime;
    return this;
  }

   /**
   * Get lastChangeTime
   * @return lastChangeTime
  **/
  @Schema(description = "")
  public String getLastChangeTime() {
    return lastChangeTime;
  }

  public void setLastChangeTime(String lastChangeTime) {
    this.lastChangeTime = lastChangeTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGlobalDefaultDeleteOptionResponse getGlobalDefaultDeleteOptionResponse = (GetGlobalDefaultDeleteOptionResponse) o;
    return Objects.equals(this.defaultDeleteAllResources, getGlobalDefaultDeleteOptionResponse.defaultDeleteAllResources) &&
        Objects.equals(this.lastChangeTime, getGlobalDefaultDeleteOptionResponse.lastChangeTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultDeleteAllResources, lastChangeTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGlobalDefaultDeleteOptionResponse {\n");
    
    sb.append("    defaultDeleteAllResources: ").append(toIndentedString(defaultDeleteAllResources)).append("\n");
    sb.append("    lastChangeTime: ").append(toIndentedString(lastChangeTime)).append("\n");
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
