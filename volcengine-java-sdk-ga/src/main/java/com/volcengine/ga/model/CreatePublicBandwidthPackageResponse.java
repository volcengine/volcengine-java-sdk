/*
 * ga
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ga.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreatePublicBandwidthPackageResponse
 */



public class CreatePublicBandwidthPackageResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("BandwidthPackageId")
  private String bandwidthPackageId = null;

  @SerializedName("PreorderNumbers")
  private List<String> preorderNumbers = null;

  public CreatePublicBandwidthPackageResponse bandwidthPackageId(String bandwidthPackageId) {
    this.bandwidthPackageId = bandwidthPackageId;
    return this;
  }

   /**
   * Get bandwidthPackageId
   * @return bandwidthPackageId
  **/
  @Schema(description = "")
  public String getBandwidthPackageId() {
    return bandwidthPackageId;
  }

  public void setBandwidthPackageId(String bandwidthPackageId) {
    this.bandwidthPackageId = bandwidthPackageId;
  }

  public CreatePublicBandwidthPackageResponse preorderNumbers(List<String> preorderNumbers) {
    this.preorderNumbers = preorderNumbers;
    return this;
  }

  public CreatePublicBandwidthPackageResponse addPreorderNumbersItem(String preorderNumbersItem) {
    if (this.preorderNumbers == null) {
      this.preorderNumbers = new ArrayList<String>();
    }
    this.preorderNumbers.add(preorderNumbersItem);
    return this;
  }

   /**
   * Get preorderNumbers
   * @return preorderNumbers
  **/
  @Schema(description = "")
  public List<String> getPreorderNumbers() {
    return preorderNumbers;
  }

  public void setPreorderNumbers(List<String> preorderNumbers) {
    this.preorderNumbers = preorderNumbers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePublicBandwidthPackageResponse createPublicBandwidthPackageResponse = (CreatePublicBandwidthPackageResponse) o;
    return Objects.equals(this.bandwidthPackageId, createPublicBandwidthPackageResponse.bandwidthPackageId) &&
        Objects.equals(this.preorderNumbers, createPublicBandwidthPackageResponse.preorderNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidthPackageId, preorderNumbers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePublicBandwidthPackageResponse {\n");
    
    sb.append("    bandwidthPackageId: ").append(toIndentedString(bandwidthPackageId)).append("\n");
    sb.append("    preorderNumbers: ").append(toIndentedString(preorderNumbers)).append("\n");
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
