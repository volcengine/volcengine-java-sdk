/*
 * mcs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mcs.model.CloudVendorForGetApiV1OverviewSecurityScoresOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetApiV1OverviewSecurityScoresResponse
 */



public class GetApiV1OverviewSecurityScoresResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("cloud_vendors")
  private List<CloudVendorForGetApiV1OverviewSecurityScoresOutput> cloudVendors = null;

  @SerializedName("overview")
  private String overview = null;

  public GetApiV1OverviewSecurityScoresResponse cloudVendors(List<CloudVendorForGetApiV1OverviewSecurityScoresOutput> cloudVendors) {
    this.cloudVendors = cloudVendors;
    return this;
  }

  public GetApiV1OverviewSecurityScoresResponse addCloudVendorsItem(CloudVendorForGetApiV1OverviewSecurityScoresOutput cloudVendorsItem) {
    if (this.cloudVendors == null) {
      this.cloudVendors = new ArrayList<CloudVendorForGetApiV1OverviewSecurityScoresOutput>();
    }
    this.cloudVendors.add(cloudVendorsItem);
    return this;
  }

   /**
   * Get cloudVendors
   * @return cloudVendors
  **/
  @Valid
  @Schema(description = "")
  public List<CloudVendorForGetApiV1OverviewSecurityScoresOutput> getCloudVendors() {
    return cloudVendors;
  }

  public void setCloudVendors(List<CloudVendorForGetApiV1OverviewSecurityScoresOutput> cloudVendors) {
    this.cloudVendors = cloudVendors;
  }

  public GetApiV1OverviewSecurityScoresResponse overview(String overview) {
    this.overview = overview;
    return this;
  }

   /**
   * Get overview
   * @return overview
  **/
  @Schema(description = "")
  public String getOverview() {
    return overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetApiV1OverviewSecurityScoresResponse getApiV1OverviewSecurityScoresResponse = (GetApiV1OverviewSecurityScoresResponse) o;
    return Objects.equals(this.cloudVendors, getApiV1OverviewSecurityScoresResponse.cloudVendors) &&
        Objects.equals(this.overview, getApiV1OverviewSecurityScoresResponse.overview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudVendors, overview);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetApiV1OverviewSecurityScoresResponse {\n");
    
    sb.append("    cloudVendors: ").append(toIndentedString(cloudVendors)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
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
