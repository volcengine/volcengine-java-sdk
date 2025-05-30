/*
 * seccenter20240508
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.seccenter20240508.model;

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
 * FilterForListRepoImageLayerInput
 */



public class FilterForListRepoImageLayerInput {
  @SerializedName("PkgName")
  private String pkgName = null;

  @SerializedName("VulnID")
  private String vulnID = null;

  public FilterForListRepoImageLayerInput pkgName(String pkgName) {
    this.pkgName = pkgName;
    return this;
  }

   /**
   * Get pkgName
   * @return pkgName
  **/
  @Schema(description = "")
  public String getPkgName() {
    return pkgName;
  }

  public void setPkgName(String pkgName) {
    this.pkgName = pkgName;
  }

  public FilterForListRepoImageLayerInput vulnID(String vulnID) {
    this.vulnID = vulnID;
    return this;
  }

   /**
   * Get vulnID
   * @return vulnID
  **/
  @Schema(description = "")
  public String getVulnID() {
    return vulnID;
  }

  public void setVulnID(String vulnID) {
    this.vulnID = vulnID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterForListRepoImageLayerInput filterForListRepoImageLayerInput = (FilterForListRepoImageLayerInput) o;
    return Objects.equals(this.pkgName, filterForListRepoImageLayerInput.pkgName) &&
        Objects.equals(this.vulnID, filterForListRepoImageLayerInput.vulnID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkgName, vulnID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterForListRepoImageLayerInput {\n");
    
    sb.append("    pkgName: ").append(toIndentedString(pkgName)).append("\n");
    sb.append("    vulnID: ").append(toIndentedString(vulnID)).append("\n");
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
