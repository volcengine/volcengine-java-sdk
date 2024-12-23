/*
 * mcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mcdn.model.ContentSettingsForListCloudAccountsOutput;
import com.volcengine.mcdn.model.DomainSettingsForListCloudAccountsOutput;
import com.volcengine.mcdn.model.ExtraForListCloudAccountsOutput;
import com.volcengine.mcdn.model.PermissionStateForListCloudAccountsOutput;
import com.volcengine.mcdn.model.StatSettingsForListCloudAccountsOutput;
import com.volcengine.mcdn.model.SyncStatusStateForListCloudAccountsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CloudAccountForListCloudAccountsOutput
 */



public class CloudAccountForListCloudAccountsOutput {
  @SerializedName("CloudAccountVendorPermission")
  private String cloudAccountVendorPermission = null;

  @SerializedName("ContentSettings")
  private ContentSettingsForListCloudAccountsOutput contentSettings = null;

  @SerializedName("CreatedAt")
  private Long createdAt = null;

  @SerializedName("DomainSettings")
  private DomainSettingsForListCloudAccountsOutput domainSettings = null;

  @SerializedName("Extra")
  private ExtraForListCloudAccountsOutput extra = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("LastSyncAt")
  private Long lastSyncAt = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("PermissionState")
  private PermissionStateForListCloudAccountsOutput permissionState = null;

  @SerializedName("ReadOnly")
  private Boolean readOnly = null;

  @SerializedName("SelfHostProxyEndpoint")
  private String selfHostProxyEndpoint = null;

  @SerializedName("StatSettings")
  private StatSettingsForListCloudAccountsOutput statSettings = null;

  @SerializedName("SubProducts")
  private List<String> subProducts = null;

  @SerializedName("SyncStatus")
  private String syncStatus = null;

  @SerializedName("SyncStatusState")
  private SyncStatusStateForListCloudAccountsOutput syncStatusState = null;

  @SerializedName("TopAccountId")
  private String topAccountId = null;

  @SerializedName("UpdatedAt")
  private Long updatedAt = null;

  @SerializedName("Vendor")
  private String vendor = null;

  public CloudAccountForListCloudAccountsOutput cloudAccountVendorPermission(String cloudAccountVendorPermission) {
    this.cloudAccountVendorPermission = cloudAccountVendorPermission;
    return this;
  }

   /**
   * Get cloudAccountVendorPermission
   * @return cloudAccountVendorPermission
  **/
  @Schema(description = "")
  public String getCloudAccountVendorPermission() {
    return cloudAccountVendorPermission;
  }

  public void setCloudAccountVendorPermission(String cloudAccountVendorPermission) {
    this.cloudAccountVendorPermission = cloudAccountVendorPermission;
  }

  public CloudAccountForListCloudAccountsOutput contentSettings(ContentSettingsForListCloudAccountsOutput contentSettings) {
    this.contentSettings = contentSettings;
    return this;
  }

   /**
   * Get contentSettings
   * @return contentSettings
  **/
  @Valid
  @Schema(description = "")
  public ContentSettingsForListCloudAccountsOutput getContentSettings() {
    return contentSettings;
  }

  public void setContentSettings(ContentSettingsForListCloudAccountsOutput contentSettings) {
    this.contentSettings = contentSettings;
  }

  public CloudAccountForListCloudAccountsOutput createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public CloudAccountForListCloudAccountsOutput domainSettings(DomainSettingsForListCloudAccountsOutput domainSettings) {
    this.domainSettings = domainSettings;
    return this;
  }

   /**
   * Get domainSettings
   * @return domainSettings
  **/
  @Valid
  @Schema(description = "")
  public DomainSettingsForListCloudAccountsOutput getDomainSettings() {
    return domainSettings;
  }

  public void setDomainSettings(DomainSettingsForListCloudAccountsOutput domainSettings) {
    this.domainSettings = domainSettings;
  }

  public CloudAccountForListCloudAccountsOutput extra(ExtraForListCloudAccountsOutput extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @Valid
  @Schema(description = "")
  public ExtraForListCloudAccountsOutput getExtra() {
    return extra;
  }

  public void setExtra(ExtraForListCloudAccountsOutput extra) {
    this.extra = extra;
  }

  public CloudAccountForListCloudAccountsOutput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CloudAccountForListCloudAccountsOutput lastSyncAt(Long lastSyncAt) {
    this.lastSyncAt = lastSyncAt;
    return this;
  }

   /**
   * Get lastSyncAt
   * @return lastSyncAt
  **/
  @Schema(description = "")
  public Long getLastSyncAt() {
    return lastSyncAt;
  }

  public void setLastSyncAt(Long lastSyncAt) {
    this.lastSyncAt = lastSyncAt;
  }

  public CloudAccountForListCloudAccountsOutput name(String name) {
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

  public CloudAccountForListCloudAccountsOutput permissionState(PermissionStateForListCloudAccountsOutput permissionState) {
    this.permissionState = permissionState;
    return this;
  }

   /**
   * Get permissionState
   * @return permissionState
  **/
  @Valid
  @Schema(description = "")
  public PermissionStateForListCloudAccountsOutput getPermissionState() {
    return permissionState;
  }

  public void setPermissionState(PermissionStateForListCloudAccountsOutput permissionState) {
    this.permissionState = permissionState;
  }

  public CloudAccountForListCloudAccountsOutput readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @Schema(description = "")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public CloudAccountForListCloudAccountsOutput selfHostProxyEndpoint(String selfHostProxyEndpoint) {
    this.selfHostProxyEndpoint = selfHostProxyEndpoint;
    return this;
  }

   /**
   * Get selfHostProxyEndpoint
   * @return selfHostProxyEndpoint
  **/
  @Schema(description = "")
  public String getSelfHostProxyEndpoint() {
    return selfHostProxyEndpoint;
  }

  public void setSelfHostProxyEndpoint(String selfHostProxyEndpoint) {
    this.selfHostProxyEndpoint = selfHostProxyEndpoint;
  }

  public CloudAccountForListCloudAccountsOutput statSettings(StatSettingsForListCloudAccountsOutput statSettings) {
    this.statSettings = statSettings;
    return this;
  }

   /**
   * Get statSettings
   * @return statSettings
  **/
  @Valid
  @Schema(description = "")
  public StatSettingsForListCloudAccountsOutput getStatSettings() {
    return statSettings;
  }

  public void setStatSettings(StatSettingsForListCloudAccountsOutput statSettings) {
    this.statSettings = statSettings;
  }

  public CloudAccountForListCloudAccountsOutput subProducts(List<String> subProducts) {
    this.subProducts = subProducts;
    return this;
  }

  public CloudAccountForListCloudAccountsOutput addSubProductsItem(String subProductsItem) {
    if (this.subProducts == null) {
      this.subProducts = new ArrayList<String>();
    }
    this.subProducts.add(subProductsItem);
    return this;
  }

   /**
   * Get subProducts
   * @return subProducts
  **/
  @Schema(description = "")
  public List<String> getSubProducts() {
    return subProducts;
  }

  public void setSubProducts(List<String> subProducts) {
    this.subProducts = subProducts;
  }

  public CloudAccountForListCloudAccountsOutput syncStatus(String syncStatus) {
    this.syncStatus = syncStatus;
    return this;
  }

   /**
   * Get syncStatus
   * @return syncStatus
  **/
  @Schema(description = "")
  public String getSyncStatus() {
    return syncStatus;
  }

  public void setSyncStatus(String syncStatus) {
    this.syncStatus = syncStatus;
  }

  public CloudAccountForListCloudAccountsOutput syncStatusState(SyncStatusStateForListCloudAccountsOutput syncStatusState) {
    this.syncStatusState = syncStatusState;
    return this;
  }

   /**
   * Get syncStatusState
   * @return syncStatusState
  **/
  @Valid
  @Schema(description = "")
  public SyncStatusStateForListCloudAccountsOutput getSyncStatusState() {
    return syncStatusState;
  }

  public void setSyncStatusState(SyncStatusStateForListCloudAccountsOutput syncStatusState) {
    this.syncStatusState = syncStatusState;
  }

  public CloudAccountForListCloudAccountsOutput topAccountId(String topAccountId) {
    this.topAccountId = topAccountId;
    return this;
  }

   /**
   * Get topAccountId
   * @return topAccountId
  **/
  @Schema(description = "")
  public String getTopAccountId() {
    return topAccountId;
  }

  public void setTopAccountId(String topAccountId) {
    this.topAccountId = topAccountId;
  }

  public CloudAccountForListCloudAccountsOutput updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public Long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CloudAccountForListCloudAccountsOutput vendor(String vendor) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudAccountForListCloudAccountsOutput cloudAccountForListCloudAccountsOutput = (CloudAccountForListCloudAccountsOutput) o;
    return Objects.equals(this.cloudAccountVendorPermission, cloudAccountForListCloudAccountsOutput.cloudAccountVendorPermission) &&
        Objects.equals(this.contentSettings, cloudAccountForListCloudAccountsOutput.contentSettings) &&
        Objects.equals(this.createdAt, cloudAccountForListCloudAccountsOutput.createdAt) &&
        Objects.equals(this.domainSettings, cloudAccountForListCloudAccountsOutput.domainSettings) &&
        Objects.equals(this.extra, cloudAccountForListCloudAccountsOutput.extra) &&
        Objects.equals(this.id, cloudAccountForListCloudAccountsOutput.id) &&
        Objects.equals(this.lastSyncAt, cloudAccountForListCloudAccountsOutput.lastSyncAt) &&
        Objects.equals(this.name, cloudAccountForListCloudAccountsOutput.name) &&
        Objects.equals(this.permissionState, cloudAccountForListCloudAccountsOutput.permissionState) &&
        Objects.equals(this.readOnly, cloudAccountForListCloudAccountsOutput.readOnly) &&
        Objects.equals(this.selfHostProxyEndpoint, cloudAccountForListCloudAccountsOutput.selfHostProxyEndpoint) &&
        Objects.equals(this.statSettings, cloudAccountForListCloudAccountsOutput.statSettings) &&
        Objects.equals(this.subProducts, cloudAccountForListCloudAccountsOutput.subProducts) &&
        Objects.equals(this.syncStatus, cloudAccountForListCloudAccountsOutput.syncStatus) &&
        Objects.equals(this.syncStatusState, cloudAccountForListCloudAccountsOutput.syncStatusState) &&
        Objects.equals(this.topAccountId, cloudAccountForListCloudAccountsOutput.topAccountId) &&
        Objects.equals(this.updatedAt, cloudAccountForListCloudAccountsOutput.updatedAt) &&
        Objects.equals(this.vendor, cloudAccountForListCloudAccountsOutput.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAccountVendorPermission, contentSettings, createdAt, domainSettings, extra, id, lastSyncAt, name, permissionState, readOnly, selfHostProxyEndpoint, statSettings, subProducts, syncStatus, syncStatusState, topAccountId, updatedAt, vendor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudAccountForListCloudAccountsOutput {\n");
    
    sb.append("    cloudAccountVendorPermission: ").append(toIndentedString(cloudAccountVendorPermission)).append("\n");
    sb.append("    contentSettings: ").append(toIndentedString(contentSettings)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    domainSettings: ").append(toIndentedString(domainSettings)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastSyncAt: ").append(toIndentedString(lastSyncAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissionState: ").append(toIndentedString(permissionState)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    selfHostProxyEndpoint: ").append(toIndentedString(selfHostProxyEndpoint)).append("\n");
    sb.append("    statSettings: ").append(toIndentedString(statSettings)).append("\n");
    sb.append("    subProducts: ").append(toIndentedString(subProducts)).append("\n");
    sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
    sb.append("    syncStatusState: ").append(toIndentedString(syncStatusState)).append("\n");
    sb.append("    topAccountId: ").append(toIndentedString(topAccountId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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
