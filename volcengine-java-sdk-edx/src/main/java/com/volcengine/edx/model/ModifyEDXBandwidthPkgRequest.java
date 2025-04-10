/*
 * edx
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.edx.model;

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
 * ModifyEDXBandwidthPkgRequest
 */



public class ModifyEDXBandwidthPkgRequest {
  @SerializedName("BandwidthPkgId")
  private String bandwidthPkgId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("TotalBandwidth")
  private Integer totalBandwidth = null;

  public ModifyEDXBandwidthPkgRequest bandwidthPkgId(String bandwidthPkgId) {
    this.bandwidthPkgId = bandwidthPkgId;
    return this;
  }

   /**
   * Get bandwidthPkgId
   * @return bandwidthPkgId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getBandwidthPkgId() {
    return bandwidthPkgId;
  }

  public void setBandwidthPkgId(String bandwidthPkgId) {
    this.bandwidthPkgId = bandwidthPkgId;
  }

  public ModifyEDXBandwidthPkgRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ModifyEDXBandwidthPkgRequest totalBandwidth(Integer totalBandwidth) {
    this.totalBandwidth = totalBandwidth;
    return this;
  }

   /**
   * Get totalBandwidth
   * @return totalBandwidth
  **/
  @Schema(description = "")
  public Integer getTotalBandwidth() {
    return totalBandwidth;
  }

  public void setTotalBandwidth(Integer totalBandwidth) {
    this.totalBandwidth = totalBandwidth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyEDXBandwidthPkgRequest modifyEDXBandwidthPkgRequest = (ModifyEDXBandwidthPkgRequest) o;
    return Objects.equals(this.bandwidthPkgId, modifyEDXBandwidthPkgRequest.bandwidthPkgId) &&
        Objects.equals(this.name, modifyEDXBandwidthPkgRequest.name) &&
        Objects.equals(this.totalBandwidth, modifyEDXBandwidthPkgRequest.totalBandwidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidthPkgId, name, totalBandwidth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyEDXBandwidthPkgRequest {\n");
    
    sb.append("    bandwidthPkgId: ").append(toIndentedString(bandwidthPkgId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    totalBandwidth: ").append(toIndentedString(totalBandwidth)).append("\n");
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
