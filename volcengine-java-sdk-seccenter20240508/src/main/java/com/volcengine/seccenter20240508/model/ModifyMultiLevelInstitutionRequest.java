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
 * ModifyMultiLevelInstitutionRequest
 */



public class ModifyMultiLevelInstitutionRequest {
  @SerializedName("AccountID")
  private String accountID = null;

  @SerializedName("AppSec")
  private Boolean appSec = null;

  @SerializedName("ClusterSec")
  private Boolean clusterSec = null;

  @SerializedName("ExpireTime")
  private Integer expireTime = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("InstitutionID")
  private String institutionID = null;

  @SerializedName("InstitutionName")
  private String institutionName = null;

  @SerializedName("Licenses")
  private Integer licenses = null;

  @SerializedName("Remark")
  private String remark = null;

  public ModifyMultiLevelInstitutionRequest accountID(String accountID) {
    this.accountID = accountID;
    return this;
  }

   /**
   * Get accountID
   * @return accountID
  **/
  @Schema(description = "")
  public String getAccountID() {
    return accountID;
  }

  public void setAccountID(String accountID) {
    this.accountID = accountID;
  }

  public ModifyMultiLevelInstitutionRequest appSec(Boolean appSec) {
    this.appSec = appSec;
    return this;
  }

   /**
   * Get appSec
   * @return appSec
  **/
  @Schema(description = "")
  public Boolean isAppSec() {
    return appSec;
  }

  public void setAppSec(Boolean appSec) {
    this.appSec = appSec;
  }

  public ModifyMultiLevelInstitutionRequest clusterSec(Boolean clusterSec) {
    this.clusterSec = clusterSec;
    return this;
  }

   /**
   * Get clusterSec
   * @return clusterSec
  **/
  @Schema(description = "")
  public Boolean isClusterSec() {
    return clusterSec;
  }

  public void setClusterSec(Boolean clusterSec) {
    this.clusterSec = clusterSec;
  }

  public ModifyMultiLevelInstitutionRequest expireTime(Integer expireTime) {
    this.expireTime = expireTime;
    return this;
  }

   /**
   * Get expireTime
   * @return expireTime
  **/
  @Schema(description = "")
  public Integer getExpireTime() {
    return expireTime;
  }

  public void setExpireTime(Integer expireTime) {
    this.expireTime = expireTime;
  }

  public ModifyMultiLevelInstitutionRequest ID(String ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @Schema(description = "")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public ModifyMultiLevelInstitutionRequest institutionID(String institutionID) {
    this.institutionID = institutionID;
    return this;
  }

   /**
   * Get institutionID
   * @return institutionID
  **/
  @Schema(description = "")
  public String getInstitutionID() {
    return institutionID;
  }

  public void setInstitutionID(String institutionID) {
    this.institutionID = institutionID;
  }

  public ModifyMultiLevelInstitutionRequest institutionName(String institutionName) {
    this.institutionName = institutionName;
    return this;
  }

   /**
   * Get institutionName
   * @return institutionName
  **/
  @Schema(description = "")
  public String getInstitutionName() {
    return institutionName;
  }

  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }

  public ModifyMultiLevelInstitutionRequest licenses(Integer licenses) {
    this.licenses = licenses;
    return this;
  }

   /**
   * Get licenses
   * @return licenses
  **/
  @Schema(description = "")
  public Integer getLicenses() {
    return licenses;
  }

  public void setLicenses(Integer licenses) {
    this.licenses = licenses;
  }

  public ModifyMultiLevelInstitutionRequest remark(String remark) {
    this.remark = remark;
    return this;
  }

   /**
   * Get remark
   * @return remark
  **/
  @Schema(description = "")
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyMultiLevelInstitutionRequest modifyMultiLevelInstitutionRequest = (ModifyMultiLevelInstitutionRequest) o;
    return Objects.equals(this.accountID, modifyMultiLevelInstitutionRequest.accountID) &&
        Objects.equals(this.appSec, modifyMultiLevelInstitutionRequest.appSec) &&
        Objects.equals(this.clusterSec, modifyMultiLevelInstitutionRequest.clusterSec) &&
        Objects.equals(this.expireTime, modifyMultiLevelInstitutionRequest.expireTime) &&
        Objects.equals(this.ID, modifyMultiLevelInstitutionRequest.ID) &&
        Objects.equals(this.institutionID, modifyMultiLevelInstitutionRequest.institutionID) &&
        Objects.equals(this.institutionName, modifyMultiLevelInstitutionRequest.institutionName) &&
        Objects.equals(this.licenses, modifyMultiLevelInstitutionRequest.licenses) &&
        Objects.equals(this.remark, modifyMultiLevelInstitutionRequest.remark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountID, appSec, clusterSec, expireTime, ID, institutionID, institutionName, licenses, remark);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyMultiLevelInstitutionRequest {\n");
    
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    appSec: ").append(toIndentedString(appSec)).append("\n");
    sb.append("    clusterSec: ").append(toIndentedString(clusterSec)).append("\n");
    sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    institutionID: ").append(toIndentedString(institutionID)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    licenses: ").append(toIndentedString(licenses)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
