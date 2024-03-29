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
 * DisassociateCenBandwidthPackageRequest
 */


public class DisassociateCenBandwidthPackageRequest {
  @SerializedName("CenBandwidthPackageId")
  private String cenBandwidthPackageId = null;

  @SerializedName("CenId")
  private String cenId = null;

  public DisassociateCenBandwidthPackageRequest cenBandwidthPackageId(String cenBandwidthPackageId) {
    this.cenBandwidthPackageId = cenBandwidthPackageId;
    return this;
  }

   /**
   * Get cenBandwidthPackageId
   * @return cenBandwidthPackageId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCenBandwidthPackageId() {
    return cenBandwidthPackageId;
  }

  public void setCenBandwidthPackageId(String cenBandwidthPackageId) {
    this.cenBandwidthPackageId = cenBandwidthPackageId;
  }

  public DisassociateCenBandwidthPackageRequest cenId(String cenId) {
    this.cenId = cenId;
    return this;
  }

   /**
   * Get cenId
   * @return cenId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCenId() {
    return cenId;
  }

  public void setCenId(String cenId) {
    this.cenId = cenId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisassociateCenBandwidthPackageRequest disassociateCenBandwidthPackageRequest = (DisassociateCenBandwidthPackageRequest) o;
    return Objects.equals(this.cenBandwidthPackageId, disassociateCenBandwidthPackageRequest.cenBandwidthPackageId) &&
        Objects.equals(this.cenId, disassociateCenBandwidthPackageRequest.cenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cenBandwidthPackageId, cenId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisassociateCenBandwidthPackageRequest {\n");
    
    sb.append("    cenBandwidthPackageId: ").append(toIndentedString(cenBandwidthPackageId)).append("\n");
    sb.append("    cenId: ").append(toIndentedString(cenId)).append("\n");
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
