/*
 * vedbm
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vedbm.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vedbm.model.InstanceStructureForDescribeDBInstanceDetailOutput;
import com.volcengine.vedbm.model.MaintenanceWindowForDescribeDBInstanceDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * InstanceDetailForDescribeDBInstanceDetailOutput
 */


public class InstanceDetailForDescribeDBInstanceDetailOutput {
  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("DBEngineVersion")
  private String dbEngineVersion = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceStatus")
  private String instanceStatus = null;

  @SerializedName("InstanceStructures")
  private List<InstanceStructureForDescribeDBInstanceDetailOutput> instanceStructures = null;

  @SerializedName("LowerCaseTableNames")
  private String lowerCaseTableNames = null;

  @SerializedName("MaintenanceWindow")
  private MaintenanceWindowForDescribeDBInstanceDetailOutput maintenanceWindow = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("SpecFamily")
  private String specFamily = null;

  @SerializedName("StorageUsedGiB")
  private Float storageUsedGiB = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("TimeZone")
  private String timeZone = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("ZoneIds")
  private String zoneIds = null;

  public InstanceDetailForDescribeDBInstanceDetailOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public InstanceDetailForDescribeDBInstanceDetailOutput dbEngineVersion(String dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
    return this;
  }

   /**
   * Get dbEngineVersion
   * @return dbEngineVersion
  **/
  @Schema(description = "")
  public String getDbEngineVersion() {
    return dbEngineVersion;
  }

  public void setDbEngineVersion(String dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
  }

  public InstanceDetailForDescribeDBInstanceDetailOutput instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public InstanceDetailForDescribeDBInstanceDetailOutput instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * Get instanceName
   * @return instanceName
  **/
  @Schema(description = "")
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public InstanceDetailForDescribeDBInstanceDetailOutput instanceStatus(String instanceStatus) {
    this.instanceStatus = instanceStatus;
    return this;
  }

   /**
   * Get instanceStatus
   * @return instanceStatus
  **/
  @Schema(description = "")
  public String getInstanceStatus() {
    return instanceStatus;
  }

  public void setInstanceStatus(String instanceStatus) {
    this.instanceStatus = instanceStatus;
  }

  public InstanceDetailForDescribeDBInstanceDetailOutput instanceStructures(List<InstanceStructureForDescribeDBInstanceDetailOutput> instanceStructures) {
    this.instanceStructures = instanceStructures;
    return this;
  }

  public InstanceDetailForDescribeDBInstanceDetailOutput addInstanceStructuresItem(InstanceStructureForDescribeDBInstanceDetailOutput instanceStructuresItem) {
    if (this.instanceStructures == null) {
      this.instanceStructures = new ArrayList<InstanceStructureForDescribeDBInstanceDetailOutput>();
    }
    this.instanceStructures.add(instanceStructuresItem);
    return this;
  }

   /**
   * Get instanceStructures
   * @return instanceStructures
  **/
  @Valid
  @Schema(description = "")
  public List<InstanceStructureForDescribeDBInstanceDetailOutput> getInstanceStructures() {
    return instanceStructures;
  }

  public void setInstanceStructures(List<InstanceStructureForDescribeDBInstanceDetailOutput> instanceStructures) {
    this.instanceStructures = instanceStructures;
  }

  public InstanceDetailForDescribeDBInstanceDetailOutput lowerCaseTableNames(String lowerCaseTableNames) {
    this.lowerCaseTableNames = lowerCaseTableNames;
    return this;
  }

   /**
   * Get lowerCaseTableNames
   * @return lowerCaseTableNames
  **/
  @Schema(description = "")
  public String getLowerCaseTableNames() {
    return lowerCaseTableNames;
  }

  public void setLowerCaseTableNames(String lowerCaseTableNames) {
    this.lowerCaseTableNames = lowerCaseTableNames;
  }

  public InstanceDetailForDescribeDBInstanceDetailOutput maintenanceWindow(MaintenanceWindowForDescribeDBInstanceDetailOutput maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
    return this;
  }

   /**
   * Get maintenanceWindow
   * @return maintenanceWindow
  **/
  @Valid
  @Schema(description = "")
  public MaintenanceWindowForDescribeDBInstanceDetailOutput getMaintenanceWindow() {
    return maintenanceWindow;
  }

  public void setMaintenanceWindow(MaintenanceWindowForDescribeDBInstanceDetailOutput maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
  }

  public InstanceDetailForDescribeDBInstanceDetailOutput projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public InstanceDetailForDescribeDBInstanceDetailOutput regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  @Schema(description = "")
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public InstanceDetailForDescribeDBInstanceDetailOutput specFamily(String specFamily) {
    this.specFamily = specFamily;
    return this;
  }

   /**
   * Get specFamily
   * @return specFamily
  **/
  @Schema(description = "")
  public String getSpecFamily() {
    return specFamily;
  }

  public void setSpecFamily(String specFamily) {
    this.specFamily = specFamily;
  }

  public InstanceDetailForDescribeDBInstanceDetailOutput storageUsedGiB(Float storageUsedGiB) {
    this.storageUsedGiB = storageUsedGiB;
    return this;
  }

   /**
   * Get storageUsedGiB
   * @return storageUsedGiB
  **/
  @Schema(description = "")
  public Float getStorageUsedGiB() {
    return storageUsedGiB;
  }

  public void setStorageUsedGiB(Float storageUsedGiB) {
    this.storageUsedGiB = storageUsedGiB;
  }

  public InstanceDetailForDescribeDBInstanceDetailOutput subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @Schema(description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public InstanceDetailForDescribeDBInstanceDetailOutput timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @Schema(description = "")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public InstanceDetailForDescribeDBInstanceDetailOutput vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  public InstanceDetailForDescribeDBInstanceDetailOutput zoneIds(String zoneIds) {
    this.zoneIds = zoneIds;
    return this;
  }

   /**
   * Get zoneIds
   * @return zoneIds
  **/
  @Schema(description = "")
  public String getZoneIds() {
    return zoneIds;
  }

  public void setZoneIds(String zoneIds) {
    this.zoneIds = zoneIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceDetailForDescribeDBInstanceDetailOutput instanceDetailForDescribeDBInstanceDetailOutput = (InstanceDetailForDescribeDBInstanceDetailOutput) o;
    return Objects.equals(this.createTime, instanceDetailForDescribeDBInstanceDetailOutput.createTime) &&
        Objects.equals(this.dbEngineVersion, instanceDetailForDescribeDBInstanceDetailOutput.dbEngineVersion) &&
        Objects.equals(this.instanceId, instanceDetailForDescribeDBInstanceDetailOutput.instanceId) &&
        Objects.equals(this.instanceName, instanceDetailForDescribeDBInstanceDetailOutput.instanceName) &&
        Objects.equals(this.instanceStatus, instanceDetailForDescribeDBInstanceDetailOutput.instanceStatus) &&
        Objects.equals(this.instanceStructures, instanceDetailForDescribeDBInstanceDetailOutput.instanceStructures) &&
        Objects.equals(this.lowerCaseTableNames, instanceDetailForDescribeDBInstanceDetailOutput.lowerCaseTableNames) &&
        Objects.equals(this.maintenanceWindow, instanceDetailForDescribeDBInstanceDetailOutput.maintenanceWindow) &&
        Objects.equals(this.projectName, instanceDetailForDescribeDBInstanceDetailOutput.projectName) &&
        Objects.equals(this.regionId, instanceDetailForDescribeDBInstanceDetailOutput.regionId) &&
        Objects.equals(this.specFamily, instanceDetailForDescribeDBInstanceDetailOutput.specFamily) &&
        Objects.equals(this.storageUsedGiB, instanceDetailForDescribeDBInstanceDetailOutput.storageUsedGiB) &&
        Objects.equals(this.subnetId, instanceDetailForDescribeDBInstanceDetailOutput.subnetId) &&
        Objects.equals(this.timeZone, instanceDetailForDescribeDBInstanceDetailOutput.timeZone) &&
        Objects.equals(this.vpcId, instanceDetailForDescribeDBInstanceDetailOutput.vpcId) &&
        Objects.equals(this.zoneIds, instanceDetailForDescribeDBInstanceDetailOutput.zoneIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, dbEngineVersion, instanceId, instanceName, instanceStatus, instanceStructures, lowerCaseTableNames, maintenanceWindow, projectName, regionId, specFamily, storageUsedGiB, subnetId, timeZone, vpcId, zoneIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceDetailForDescribeDBInstanceDetailOutput {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    dbEngineVersion: ").append(toIndentedString(dbEngineVersion)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
    sb.append("    instanceStructures: ").append(toIndentedString(instanceStructures)).append("\n");
    sb.append("    lowerCaseTableNames: ").append(toIndentedString(lowerCaseTableNames)).append("\n");
    sb.append("    maintenanceWindow: ").append(toIndentedString(maintenanceWindow)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    specFamily: ").append(toIndentedString(specFamily)).append("\n");
    sb.append("    storageUsedGiB: ").append(toIndentedString(storageUsedGiB)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    zoneIds: ").append(toIndentedString(zoneIds)).append("\n");
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
