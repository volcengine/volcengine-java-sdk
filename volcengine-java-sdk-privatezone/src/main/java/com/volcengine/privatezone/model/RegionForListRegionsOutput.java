/*
 * private_zone
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.privatezone.model;

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
 * RegionForListRegionsOutput
 */



public class RegionForListRegionsOutput {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("RegionCode")
  private String regionCode = null;

  public RegionForListRegionsOutput name(String name) {
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

  public RegionForListRegionsOutput regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

   /**
   * Get regionCode
   * @return regionCode
  **/
  @Schema(description = "")
  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegionForListRegionsOutput regionForListRegionsOutput = (RegionForListRegionsOutput) o;
    return Objects.equals(this.name, regionForListRegionsOutput.name) &&
        Objects.equals(this.regionCode, regionForListRegionsOutput.regionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, regionCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionForListRegionsOutput {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
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
