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

package com.volcengine.volcstack.cen.model;

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
 * CenBandwidthPackageForDescribeCenBandwidthPackagesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-24T18:20:48.145669+08:00[Asia/Shanghai]")
public class CenBandwidthPackageForDescribeCenBandwidthPackagesOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("BillingType")
  private Integer billingType = null;

  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("CenBandwidthPackageId")
  private String cenBandwidthPackageId = null;

  @SerializedName("CenBandwidthPackageName")
  private String cenBandwidthPackageName = null;

  @SerializedName("CenIds")
  private List<String> cenIds = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ExpiredTime")
  private String expiredTime = null;

  @SerializedName("LocalGeographicRegionSetId")
  private String localGeographicRegionSetId = null;

  @SerializedName("LockReason")
  private String lockReason = null;

  @SerializedName("PeerGeographicRegionSetId")
  private String peerGeographicRegionSetId = null;

  @SerializedName("RemainingBandwidth")
  private Integer remainingBandwidth = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput accountId(String accountId) {
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

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @Schema(description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput billingType(Integer billingType) {
    this.billingType = billingType;
    return this;
  }

   /**
   * Get billingType
   * @return billingType
  **/
  @Schema(description = "")
  public Integer getBillingType() {
    return billingType;
  }

  public void setBillingType(Integer billingType) {
    this.billingType = billingType;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput businessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
    return this;
  }

   /**
   * Get businessStatus
   * @return businessStatus
  **/
  @Schema(description = "")
  public String getBusinessStatus() {
    return businessStatus;
  }

  public void setBusinessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput cenBandwidthPackageId(String cenBandwidthPackageId) {
    this.cenBandwidthPackageId = cenBandwidthPackageId;
    return this;
  }

   /**
   * Get cenBandwidthPackageId
   * @return cenBandwidthPackageId
  **/
  @Schema(description = "")
  public String getCenBandwidthPackageId() {
    return cenBandwidthPackageId;
  }

  public void setCenBandwidthPackageId(String cenBandwidthPackageId) {
    this.cenBandwidthPackageId = cenBandwidthPackageId;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput cenBandwidthPackageName(String cenBandwidthPackageName) {
    this.cenBandwidthPackageName = cenBandwidthPackageName;
    return this;
  }

   /**
   * Get cenBandwidthPackageName
   * @return cenBandwidthPackageName
  **/
  @Schema(description = "")
  public String getCenBandwidthPackageName() {
    return cenBandwidthPackageName;
  }

  public void setCenBandwidthPackageName(String cenBandwidthPackageName) {
    this.cenBandwidthPackageName = cenBandwidthPackageName;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput cenIds(List<String> cenIds) {
    this.cenIds = cenIds;
    return this;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput addCenIdsItem(String cenIdsItem) {
    if (this.cenIds == null) {
      this.cenIds = new ArrayList<String>();
    }
    this.cenIds.add(cenIdsItem);
    return this;
  }

   /**
   * Get cenIds
   * @return cenIds
  **/
  @Schema(description = "")
  public List<String> getCenIds() {
    return cenIds;
  }

  public void setCenIds(List<String> cenIds) {
    this.cenIds = cenIds;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput creationTime(String creationTime) {
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

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput deletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
    return this;
  }

   /**
   * Get deletedTime
   * @return deletedTime
  **/
  @Schema(description = "")
  public String getDeletedTime() {
    return deletedTime;
  }

  public void setDeletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput description(String description) {
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

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput expiredTime(String expiredTime) {
    this.expiredTime = expiredTime;
    return this;
  }

   /**
   * Get expiredTime
   * @return expiredTime
  **/
  @Schema(description = "")
  public String getExpiredTime() {
    return expiredTime;
  }

  public void setExpiredTime(String expiredTime) {
    this.expiredTime = expiredTime;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput localGeographicRegionSetId(String localGeographicRegionSetId) {
    this.localGeographicRegionSetId = localGeographicRegionSetId;
    return this;
  }

   /**
   * Get localGeographicRegionSetId
   * @return localGeographicRegionSetId
  **/
  @Schema(description = "")
  public String getLocalGeographicRegionSetId() {
    return localGeographicRegionSetId;
  }

  public void setLocalGeographicRegionSetId(String localGeographicRegionSetId) {
    this.localGeographicRegionSetId = localGeographicRegionSetId;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput lockReason(String lockReason) {
    this.lockReason = lockReason;
    return this;
  }

   /**
   * Get lockReason
   * @return lockReason
  **/
  @Schema(description = "")
  public String getLockReason() {
    return lockReason;
  }

  public void setLockReason(String lockReason) {
    this.lockReason = lockReason;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput peerGeographicRegionSetId(String peerGeographicRegionSetId) {
    this.peerGeographicRegionSetId = peerGeographicRegionSetId;
    return this;
  }

   /**
   * Get peerGeographicRegionSetId
   * @return peerGeographicRegionSetId
  **/
  @Schema(description = "")
  public String getPeerGeographicRegionSetId() {
    return peerGeographicRegionSetId;
  }

  public void setPeerGeographicRegionSetId(String peerGeographicRegionSetId) {
    this.peerGeographicRegionSetId = peerGeographicRegionSetId;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput remainingBandwidth(Integer remainingBandwidth) {
    this.remainingBandwidth = remainingBandwidth;
    return this;
  }

   /**
   * Get remainingBandwidth
   * @return remainingBandwidth
  **/
  @Schema(description = "")
  public Integer getRemainingBandwidth() {
    return remainingBandwidth;
  }

  public void setRemainingBandwidth(Integer remainingBandwidth) {
    this.remainingBandwidth = remainingBandwidth;
  }

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput status(String status) {
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

  public CenBandwidthPackageForDescribeCenBandwidthPackagesOutput updateTime(String updateTime) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CenBandwidthPackageForDescribeCenBandwidthPackagesOutput cenBandwidthPackageForDescribeCenBandwidthPackagesOutput = (CenBandwidthPackageForDescribeCenBandwidthPackagesOutput) o;
    return Objects.equals(this.accountId, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.accountId) &&
        Objects.equals(this.bandwidth, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.bandwidth) &&
        Objects.equals(this.billingType, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.billingType) &&
        Objects.equals(this.businessStatus, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.businessStatus) &&
        Objects.equals(this.cenBandwidthPackageId, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.cenBandwidthPackageId) &&
        Objects.equals(this.cenBandwidthPackageName, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.cenBandwidthPackageName) &&
        Objects.equals(this.cenIds, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.cenIds) &&
        Objects.equals(this.creationTime, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.creationTime) &&
        Objects.equals(this.deletedTime, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.deletedTime) &&
        Objects.equals(this.description, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.description) &&
        Objects.equals(this.expiredTime, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.expiredTime) &&
        Objects.equals(this.localGeographicRegionSetId, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.localGeographicRegionSetId) &&
        Objects.equals(this.lockReason, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.lockReason) &&
        Objects.equals(this.peerGeographicRegionSetId, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.peerGeographicRegionSetId) &&
        Objects.equals(this.remainingBandwidth, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.remainingBandwidth) &&
        Objects.equals(this.status, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.status) &&
        Objects.equals(this.updateTime, cenBandwidthPackageForDescribeCenBandwidthPackagesOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bandwidth, billingType, businessStatus, cenBandwidthPackageId, cenBandwidthPackageName, cenIds, creationTime, deletedTime, description, expiredTime, localGeographicRegionSetId, lockReason, peerGeographicRegionSetId, remainingBandwidth, status, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CenBandwidthPackageForDescribeCenBandwidthPackagesOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    cenBandwidthPackageId: ").append(toIndentedString(cenBandwidthPackageId)).append("\n");
    sb.append("    cenBandwidthPackageName: ").append(toIndentedString(cenBandwidthPackageName)).append("\n");
    sb.append("    cenIds: ").append(toIndentedString(cenIds)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    localGeographicRegionSetId: ").append(toIndentedString(localGeographicRegionSetId)).append("\n");
    sb.append("    lockReason: ").append(toIndentedString(lockReason)).append("\n");
    sb.append("    peerGeographicRegionSetId: ").append(toIndentedString(peerGeographicRegionSetId)).append("\n");
    sb.append("    remainingBandwidth: ").append(toIndentedString(remainingBandwidth)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
