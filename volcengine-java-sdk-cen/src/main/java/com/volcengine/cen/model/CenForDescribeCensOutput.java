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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CenForDescribeCensOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T20:17:51.288534+08:00[Asia/Shanghai]")
public class CenForDescribeCensOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("CenBandwidthPackageIds")
  private List<String> cenBandwidthPackageIds = null;

  @SerializedName("CenId")
  private String cenId = null;

  @SerializedName("CenName")
  private String cenName = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public CenForDescribeCensOutput accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public CenForDescribeCensOutput cenBandwidthPackageIds(List<String> cenBandwidthPackageIds) {
    this.cenBandwidthPackageIds = cenBandwidthPackageIds;
    return this;
  }

  public CenForDescribeCensOutput addCenBandwidthPackageIdsItem(String cenBandwidthPackageIdsItem) {
    if (this.cenBandwidthPackageIds == null) {
      this.cenBandwidthPackageIds = new ArrayList<String>();
    }
    this.cenBandwidthPackageIds.add(cenBandwidthPackageIdsItem);
    return this;
  }

   /**
   * Get cenBandwidthPackageIds
   * @return cenBandwidthPackageIds
  **/
  @Schema(description = "")
  public List<String> getCenBandwidthPackageIds() {
    return cenBandwidthPackageIds;
  }

  public void setCenBandwidthPackageIds(List<String> cenBandwidthPackageIds) {
    this.cenBandwidthPackageIds = cenBandwidthPackageIds;
  }

  public CenForDescribeCensOutput cenId(String cenId) {
    this.cenId = cenId;
    return this;
  }

   /**
   * Get cenId
   * @return cenId
  **/
  @Schema(description = "")
  public String getCenId() {
    return cenId;
  }

  public void setCenId(String cenId) {
    this.cenId = cenId;
  }

  public CenForDescribeCensOutput cenName(String cenName) {
    this.cenName = cenName;
    return this;
  }

   /**
   * Get cenName
   * @return cenName
  **/
  @Schema(description = "")
  public String getCenName() {
    return cenName;
  }

  public void setCenName(String cenName) {
    this.cenName = cenName;
  }

  public CenForDescribeCensOutput creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public CenForDescribeCensOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CenForDescribeCensOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CenForDescribeCensOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CenForDescribeCensOutput cenForDescribeCensOutput = (CenForDescribeCensOutput) o;
    return Objects.equals(this.accountId, cenForDescribeCensOutput.accountId) &&
        Objects.equals(this.cenBandwidthPackageIds, cenForDescribeCensOutput.cenBandwidthPackageIds) &&
        Objects.equals(this.cenId, cenForDescribeCensOutput.cenId) &&
        Objects.equals(this.cenName, cenForDescribeCensOutput.cenName) &&
        Objects.equals(this.creationTime, cenForDescribeCensOutput.creationTime) &&
        Objects.equals(this.description, cenForDescribeCensOutput.description) &&
        Objects.equals(this.status, cenForDescribeCensOutput.status) &&
        Objects.equals(this.updateTime, cenForDescribeCensOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, cenBandwidthPackageIds, cenId, cenName, creationTime, description, status, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CenForDescribeCensOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    cenBandwidthPackageIds: ").append(toIndentedString(cenBandwidthPackageIds)).append("\n");
    sb.append("    cenId: ").append(toIndentedString(cenId)).append("\n");
    sb.append("    cenName: ").append(toIndentedString(cenName)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
