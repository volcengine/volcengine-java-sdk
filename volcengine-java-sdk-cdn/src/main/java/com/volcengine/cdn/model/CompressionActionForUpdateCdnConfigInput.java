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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CompressionActionForUpdateCdnConfigInput
 */



public class CompressionActionForUpdateCdnConfigInput {
  @SerializedName("CompressionFormat")
  private String compressionFormat = null;

  @SerializedName("CompressionTarget")
  private String compressionTarget = null;

  @SerializedName("CompressionType")
  private List<String> compressionType = null;

  @SerializedName("MinFileSizeKB")
  private Long minFileSizeKB = null;

  public CompressionActionForUpdateCdnConfigInput compressionFormat(String compressionFormat) {
    this.compressionFormat = compressionFormat;
    return this;
  }

   /**
   * Get compressionFormat
   * @return compressionFormat
  **/
  @Schema(description = "")
  public String getCompressionFormat() {
    return compressionFormat;
  }

  public void setCompressionFormat(String compressionFormat) {
    this.compressionFormat = compressionFormat;
  }

  public CompressionActionForUpdateCdnConfigInput compressionTarget(String compressionTarget) {
    this.compressionTarget = compressionTarget;
    return this;
  }

   /**
   * Get compressionTarget
   * @return compressionTarget
  **/
  @Schema(description = "")
  public String getCompressionTarget() {
    return compressionTarget;
  }

  public void setCompressionTarget(String compressionTarget) {
    this.compressionTarget = compressionTarget;
  }

  public CompressionActionForUpdateCdnConfigInput compressionType(List<String> compressionType) {
    this.compressionType = compressionType;
    return this;
  }

  public CompressionActionForUpdateCdnConfigInput addCompressionTypeItem(String compressionTypeItem) {
    if (this.compressionType == null) {
      this.compressionType = new ArrayList<String>();
    }
    this.compressionType.add(compressionTypeItem);
    return this;
  }

   /**
   * Get compressionType
   * @return compressionType
  **/
  @Schema(description = "")
  public List<String> getCompressionType() {
    return compressionType;
  }

  public void setCompressionType(List<String> compressionType) {
    this.compressionType = compressionType;
  }

  public CompressionActionForUpdateCdnConfigInput minFileSizeKB(Long minFileSizeKB) {
    this.minFileSizeKB = minFileSizeKB;
    return this;
  }

   /**
   * Get minFileSizeKB
   * @return minFileSizeKB
  **/
  @Schema(description = "")
  public Long getMinFileSizeKB() {
    return minFileSizeKB;
  }

  public void setMinFileSizeKB(Long minFileSizeKB) {
    this.minFileSizeKB = minFileSizeKB;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompressionActionForUpdateCdnConfigInput compressionActionForUpdateCdnConfigInput = (CompressionActionForUpdateCdnConfigInput) o;
    return Objects.equals(this.compressionFormat, compressionActionForUpdateCdnConfigInput.compressionFormat) &&
        Objects.equals(this.compressionTarget, compressionActionForUpdateCdnConfigInput.compressionTarget) &&
        Objects.equals(this.compressionType, compressionActionForUpdateCdnConfigInput.compressionType) &&
        Objects.equals(this.minFileSizeKB, compressionActionForUpdateCdnConfigInput.minFileSizeKB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compressionFormat, compressionTarget, compressionType, minFileSizeKB);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompressionActionForUpdateCdnConfigInput {\n");
    
    sb.append("    compressionFormat: ").append(toIndentedString(compressionFormat)).append("\n");
    sb.append("    compressionTarget: ").append(toIndentedString(compressionTarget)).append("\n");
    sb.append("    compressionType: ").append(toIndentedString(compressionType)).append("\n");
    sb.append("    minFileSizeKB: ").append(toIndentedString(minFileSizeKB)).append("\n");
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
