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
 * AffectPackForGetVulnDetailOutput
 */



public class AffectPackForGetVulnDetailOutput {
  @SerializedName("AffectedVersion")
  private String affectedVersion = null;

  @SerializedName("FixedVersion")
  private String fixedVersion = null;

  @SerializedName("PkgName")
  private String pkgName = null;

  @SerializedName("Vendor")
  private String vendor = null;

  @SerializedName("VendorVulnID")
  private String vendorVulnID = null;

  public AffectPackForGetVulnDetailOutput affectedVersion(String affectedVersion) {
    this.affectedVersion = affectedVersion;
    return this;
  }

   /**
   * Get affectedVersion
   * @return affectedVersion
  **/
  @Schema(description = "")
  public String getAffectedVersion() {
    return affectedVersion;
  }

  public void setAffectedVersion(String affectedVersion) {
    this.affectedVersion = affectedVersion;
  }

  public AffectPackForGetVulnDetailOutput fixedVersion(String fixedVersion) {
    this.fixedVersion = fixedVersion;
    return this;
  }

   /**
   * Get fixedVersion
   * @return fixedVersion
  **/
  @Schema(description = "")
  public String getFixedVersion() {
    return fixedVersion;
  }

  public void setFixedVersion(String fixedVersion) {
    this.fixedVersion = fixedVersion;
  }

  public AffectPackForGetVulnDetailOutput pkgName(String pkgName) {
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

  public AffectPackForGetVulnDetailOutput vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @Schema(description = "")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public AffectPackForGetVulnDetailOutput vendorVulnID(String vendorVulnID) {
    this.vendorVulnID = vendorVulnID;
    return this;
  }

   /**
   * Get vendorVulnID
   * @return vendorVulnID
  **/
  @Schema(description = "")
  public String getVendorVulnID() {
    return vendorVulnID;
  }

  public void setVendorVulnID(String vendorVulnID) {
    this.vendorVulnID = vendorVulnID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AffectPackForGetVulnDetailOutput affectPackForGetVulnDetailOutput = (AffectPackForGetVulnDetailOutput) o;
    return Objects.equals(this.affectedVersion, affectPackForGetVulnDetailOutput.affectedVersion) &&
        Objects.equals(this.fixedVersion, affectPackForGetVulnDetailOutput.fixedVersion) &&
        Objects.equals(this.pkgName, affectPackForGetVulnDetailOutput.pkgName) &&
        Objects.equals(this.vendor, affectPackForGetVulnDetailOutput.vendor) &&
        Objects.equals(this.vendorVulnID, affectPackForGetVulnDetailOutput.vendorVulnID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affectedVersion, fixedVersion, pkgName, vendor, vendorVulnID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AffectPackForGetVulnDetailOutput {\n");
    
    sb.append("    affectedVersion: ").append(toIndentedString(affectedVersion)).append("\n");
    sb.append("    fixedVersion: ").append(toIndentedString(fixedVersion)).append("\n");
    sb.append("    pkgName: ").append(toIndentedString(pkgName)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    vendorVulnID: ").append(toIndentedString(vendorVulnID)).append("\n");
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
