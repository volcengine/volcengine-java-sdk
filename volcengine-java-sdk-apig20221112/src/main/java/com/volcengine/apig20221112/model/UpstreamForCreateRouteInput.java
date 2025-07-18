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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpstreamForCreateRouteInput
 */



public class UpstreamForCreateRouteInput {
  @SerializedName("Type")
  private String type = null;

  @SerializedName("UpstreamId")
  private String upstreamId = null;

  @SerializedName("Version")
  private String version = null;

  public UpstreamForCreateRouteInput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public UpstreamForCreateRouteInput upstreamId(String upstreamId) {
    this.upstreamId = upstreamId;
    return this;
  }

   /**
   * Get upstreamId
   * @return upstreamId
  **/
  @Schema(description = "")
  public String getUpstreamId() {
    return upstreamId;
  }

  public void setUpstreamId(String upstreamId) {
    this.upstreamId = upstreamId;
  }

  public UpstreamForCreateRouteInput version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpstreamForCreateRouteInput upstreamForCreateRouteInput = (UpstreamForCreateRouteInput) o;
    return Objects.equals(this.type, upstreamForCreateRouteInput.type) &&
        Objects.equals(this.upstreamId, upstreamForCreateRouteInput.upstreamId) &&
        Objects.equals(this.version, upstreamForCreateRouteInput.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, upstreamId, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpstreamForCreateRouteInput {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    upstreamId: ").append(toIndentedString(upstreamId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
