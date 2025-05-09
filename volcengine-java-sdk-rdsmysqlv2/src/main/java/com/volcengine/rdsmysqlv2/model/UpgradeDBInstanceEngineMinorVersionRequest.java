/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

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
 * UpgradeDBInstanceEngineMinorVersionRequest
 */



public class UpgradeDBInstanceEngineMinorVersionRequest {
  @SerializedName("EstimateOnly")
  private Boolean estimateOnly = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("SpecifiedSwitchEndTime")
  private String specifiedSwitchEndTime = null;

  @SerializedName("SpecifiedSwitchStartTime")
  private String specifiedSwitchStartTime = null;

  @SerializedName("SwitchType")
  private String switchType = null;

  @SerializedName("TargetMinorVersion")
  private String targetMinorVersion = null;

  public UpgradeDBInstanceEngineMinorVersionRequest estimateOnly(Boolean estimateOnly) {
    this.estimateOnly = estimateOnly;
    return this;
  }

   /**
   * Get estimateOnly
   * @return estimateOnly
  **/
  @Schema(description = "")
  public Boolean isEstimateOnly() {
    return estimateOnly;
  }

  public void setEstimateOnly(Boolean estimateOnly) {
    this.estimateOnly = estimateOnly;
  }

  public UpgradeDBInstanceEngineMinorVersionRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public UpgradeDBInstanceEngineMinorVersionRequest specifiedSwitchEndTime(String specifiedSwitchEndTime) {
    this.specifiedSwitchEndTime = specifiedSwitchEndTime;
    return this;
  }

   /**
   * Get specifiedSwitchEndTime
   * @return specifiedSwitchEndTime
  **/
  @Schema(description = "")
  public String getSpecifiedSwitchEndTime() {
    return specifiedSwitchEndTime;
  }

  public void setSpecifiedSwitchEndTime(String specifiedSwitchEndTime) {
    this.specifiedSwitchEndTime = specifiedSwitchEndTime;
  }

  public UpgradeDBInstanceEngineMinorVersionRequest specifiedSwitchStartTime(String specifiedSwitchStartTime) {
    this.specifiedSwitchStartTime = specifiedSwitchStartTime;
    return this;
  }

   /**
   * Get specifiedSwitchStartTime
   * @return specifiedSwitchStartTime
  **/
  @Schema(description = "")
  public String getSpecifiedSwitchStartTime() {
    return specifiedSwitchStartTime;
  }

  public void setSpecifiedSwitchStartTime(String specifiedSwitchStartTime) {
    this.specifiedSwitchStartTime = specifiedSwitchStartTime;
  }

  public UpgradeDBInstanceEngineMinorVersionRequest switchType(String switchType) {
    this.switchType = switchType;
    return this;
  }

   /**
   * Get switchType
   * @return switchType
  **/
  @Schema(description = "")
  public String getSwitchType() {
    return switchType;
  }

  public void setSwitchType(String switchType) {
    this.switchType = switchType;
  }

  public UpgradeDBInstanceEngineMinorVersionRequest targetMinorVersion(String targetMinorVersion) {
    this.targetMinorVersion = targetMinorVersion;
    return this;
  }

   /**
   * Get targetMinorVersion
   * @return targetMinorVersion
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTargetMinorVersion() {
    return targetMinorVersion;
  }

  public void setTargetMinorVersion(String targetMinorVersion) {
    this.targetMinorVersion = targetMinorVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeDBInstanceEngineMinorVersionRequest upgradeDBInstanceEngineMinorVersionRequest = (UpgradeDBInstanceEngineMinorVersionRequest) o;
    return Objects.equals(this.estimateOnly, upgradeDBInstanceEngineMinorVersionRequest.estimateOnly) &&
        Objects.equals(this.instanceId, upgradeDBInstanceEngineMinorVersionRequest.instanceId) &&
        Objects.equals(this.specifiedSwitchEndTime, upgradeDBInstanceEngineMinorVersionRequest.specifiedSwitchEndTime) &&
        Objects.equals(this.specifiedSwitchStartTime, upgradeDBInstanceEngineMinorVersionRequest.specifiedSwitchStartTime) &&
        Objects.equals(this.switchType, upgradeDBInstanceEngineMinorVersionRequest.switchType) &&
        Objects.equals(this.targetMinorVersion, upgradeDBInstanceEngineMinorVersionRequest.targetMinorVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimateOnly, instanceId, specifiedSwitchEndTime, specifiedSwitchStartTime, switchType, targetMinorVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeDBInstanceEngineMinorVersionRequest {\n");
    
    sb.append("    estimateOnly: ").append(toIndentedString(estimateOnly)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    specifiedSwitchEndTime: ").append(toIndentedString(specifiedSwitchEndTime)).append("\n");
    sb.append("    specifiedSwitchStartTime: ").append(toIndentedString(specifiedSwitchStartTime)).append("\n");
    sb.append("    switchType: ").append(toIndentedString(switchType)).append("\n");
    sb.append("    targetMinorVersion: ").append(toIndentedString(targetMinorVersion)).append("\n");
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
