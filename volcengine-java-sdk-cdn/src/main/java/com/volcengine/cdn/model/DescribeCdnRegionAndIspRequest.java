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
 * DescribeCdnRegionAndIspRequest
 */



public class DescribeCdnRegionAndIspRequest {
  @SerializedName("Area")
  private String area = null;

  @SerializedName("Lang")
  private String lang = null;

  public DescribeCdnRegionAndIspRequest area(String area) {
    this.area = area;
    return this;
  }

   /**
   * Get area
   * @return area
  **/
  @Schema(description = "")
  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public DescribeCdnRegionAndIspRequest lang(String lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @Schema(description = "")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeCdnRegionAndIspRequest describeCdnRegionAndIspRequest = (DescribeCdnRegionAndIspRequest) o;
    return Objects.equals(this.area, describeCdnRegionAndIspRequest.area) &&
        Objects.equals(this.lang, describeCdnRegionAndIspRequest.lang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, lang);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCdnRegionAndIspRequest {\n");
    
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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
