/*
 * cen
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cen.model;

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
 * CreateCenInterRegionBandwidthResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T19:54:58.517508+08:00[Asia/Shanghai]")
public class CreateCenInterRegionBandwidthResponse {
  @SerializedName("InterRegionBandwidthId")
  private String interRegionBandwidthId = null;

  public CreateCenInterRegionBandwidthResponse interRegionBandwidthId(String interRegionBandwidthId) {
    this.interRegionBandwidthId = interRegionBandwidthId;
    return this;
  }

   /**
   * Get interRegionBandwidthId
   * @return interRegionBandwidthId
  **/
  @Schema(description = "")
  public String getInterRegionBandwidthId() {
    return interRegionBandwidthId;
  }

  public void setInterRegionBandwidthId(String interRegionBandwidthId) {
    this.interRegionBandwidthId = interRegionBandwidthId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCenInterRegionBandwidthResponse createCenInterRegionBandwidthResponse = (CreateCenInterRegionBandwidthResponse) o;
    return Objects.equals(this.interRegionBandwidthId, createCenInterRegionBandwidthResponse.interRegionBandwidthId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interRegionBandwidthId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCenInterRegionBandwidthResponse {\n");
    
    sb.append("    interRegionBandwidthId: ").append(toIndentedString(interRegionBandwidthId)).append("\n");
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
