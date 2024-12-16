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
 * OfflineCacheForUpdateCdnConfigInput
 */



public class OfflineCacheForUpdateCdnConfigInput {
  @SerializedName("Object")
  private String object = null;

  @SerializedName("StatusCode")
  private String statusCode = null;

  @SerializedName("Switch")
  private Boolean _switch = null;

  public OfflineCacheForUpdateCdnConfigInput object(String object) {
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

  public OfflineCacheForUpdateCdnConfigInput statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @Schema(description = "")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public OfflineCacheForUpdateCdnConfigInput _switch(Boolean _switch) {
    this._switch = _switch;
    return this;
  }

   /**
   * Get _switch
   * @return _switch
  **/
  @Schema(description = "")
  public Boolean isSwitch() {
    return _switch;
  }

  public void setSwitch(Boolean _switch) {
    this._switch = _switch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineCacheForUpdateCdnConfigInput offlineCacheForUpdateCdnConfigInput = (OfflineCacheForUpdateCdnConfigInput) o;
    return Objects.equals(this.object, offlineCacheForUpdateCdnConfigInput.object) &&
        Objects.equals(this.statusCode, offlineCacheForUpdateCdnConfigInput.statusCode) &&
        Objects.equals(this._switch, offlineCacheForUpdateCdnConfigInput._switch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, statusCode, _switch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineCacheForUpdateCdnConfigInput {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    _switch: ").append(toIndentedString(_switch)).append("\n");
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