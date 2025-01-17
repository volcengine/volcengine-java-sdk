/*
 * cloud_trail20180101
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cloudtrail20180101.model;

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
 * DescribeTrailsRequest
 */



public class DescribeTrailsRequest {
  @SerializedName("IncludeOrganizationTrail")
  private Integer includeOrganizationTrail = null;

  @SerializedName("TrailNames")
  private List<String> trailNames = null;

  public DescribeTrailsRequest includeOrganizationTrail(Integer includeOrganizationTrail) {
    this.includeOrganizationTrail = includeOrganizationTrail;
    return this;
  }

   /**
   * Get includeOrganizationTrail
   * @return includeOrganizationTrail
  **/
  @Schema(description = "")
  public Integer getIncludeOrganizationTrail() {
    return includeOrganizationTrail;
  }

  public void setIncludeOrganizationTrail(Integer includeOrganizationTrail) {
    this.includeOrganizationTrail = includeOrganizationTrail;
  }

  public DescribeTrailsRequest trailNames(List<String> trailNames) {
    this.trailNames = trailNames;
    return this;
  }

  public DescribeTrailsRequest addTrailNamesItem(String trailNamesItem) {
    if (this.trailNames == null) {
      this.trailNames = new ArrayList<String>();
    }
    this.trailNames.add(trailNamesItem);
    return this;
  }

   /**
   * Get trailNames
   * @return trailNames
  **/
  @Schema(description = "")
  public List<String> getTrailNames() {
    return trailNames;
  }

  public void setTrailNames(List<String> trailNames) {
    this.trailNames = trailNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTrailsRequest describeTrailsRequest = (DescribeTrailsRequest) o;
    return Objects.equals(this.includeOrganizationTrail, describeTrailsRequest.includeOrganizationTrail) &&
        Objects.equals(this.trailNames, describeTrailsRequest.trailNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeOrganizationTrail, trailNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTrailsRequest {\n");
    
    sb.append("    includeOrganizationTrail: ").append(toIndentedString(includeOrganizationTrail)).append("\n");
    sb.append("    trailNames: ").append(toIndentedString(trailNames)).append("\n");
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
