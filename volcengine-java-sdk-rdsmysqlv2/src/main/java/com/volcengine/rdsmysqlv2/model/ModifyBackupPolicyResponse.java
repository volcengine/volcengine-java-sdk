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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyBackupPolicyResponse
 */



public class ModifyBackupPolicyResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("BinlogBackupAllRetention")
  private Boolean binlogBackupAllRetention = null;

  @SerializedName("BinlogBackupEnabled")
  private Boolean binlogBackupEnabled = null;

  @SerializedName("BinlogBackupEncryptionEnabled")
  private Boolean binlogBackupEncryptionEnabled = null;

  @SerializedName("BinlogFileCountsEnable")
  private Boolean binlogFileCountsEnable = null;

  @SerializedName("BinlogLimitCount")
  private Integer binlogLimitCount = null;

  @SerializedName("BinlogLocalRetentionHour")
  private Integer binlogLocalRetentionHour = null;

  @SerializedName("BinlogSpaceLimitEnable")
  private Boolean binlogSpaceLimitEnable = null;

  @SerializedName("BinlogStoragePercentage")
  private Integer binlogStoragePercentage = null;

  @SerializedName("DataBackupAllRetention")
  private Boolean dataBackupAllRetention = null;

  @SerializedName("DataBackupEncryptionEnabled")
  private Boolean dataBackupEncryptionEnabled = null;

  @SerializedName("DataBackupRetentionDay")
  private Integer dataBackupRetentionDay = null;

  @SerializedName("DataFullBackupPeriods")
  private List<String> dataFullBackupPeriods = null;

  @SerializedName("DataFullBackupStartUTCHour")
  private Integer dataFullBackupStartUTCHour = null;

  @SerializedName("DataFullBackupTime")
  private String dataFullBackupTime = null;

  @SerializedName("DataIncrBackupPeriods")
  private List<String> dataIncrBackupPeriods = null;

  @SerializedName("DataKeepDaysAfterReleased")
  private Integer dataKeepDaysAfterReleased = null;

  @SerializedName("DataKeepPolicyAfterReleased")
  private String dataKeepPolicyAfterReleased = null;

  @SerializedName("HourlyIncrBackupEnable")
  private Boolean hourlyIncrBackupEnable = null;

  @SerializedName("IncrBackupHourPeriod")
  private Integer incrBackupHourPeriod = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("LockDDLTime")
  private Integer lockDDLTime = null;

  @SerializedName("LockDdlTime")
  private Integer lockDdlTime = null;

  @SerializedName("LogBackupRetentionDay")
  private Integer logBackupRetentionDay = null;

  @SerializedName("RetentionPolicySynced")
  private Boolean retentionPolicySynced = null;

  public ModifyBackupPolicyResponse binlogBackupAllRetention(Boolean binlogBackupAllRetention) {
    this.binlogBackupAllRetention = binlogBackupAllRetention;
    return this;
  }

   /**
   * Get binlogBackupAllRetention
   * @return binlogBackupAllRetention
  **/
  @Schema(description = "")
  public Boolean isBinlogBackupAllRetention() {
    return binlogBackupAllRetention;
  }

  public void setBinlogBackupAllRetention(Boolean binlogBackupAllRetention) {
    this.binlogBackupAllRetention = binlogBackupAllRetention;
  }

  public ModifyBackupPolicyResponse binlogBackupEnabled(Boolean binlogBackupEnabled) {
    this.binlogBackupEnabled = binlogBackupEnabled;
    return this;
  }

   /**
   * Get binlogBackupEnabled
   * @return binlogBackupEnabled
  **/
  @Schema(description = "")
  public Boolean isBinlogBackupEnabled() {
    return binlogBackupEnabled;
  }

  public void setBinlogBackupEnabled(Boolean binlogBackupEnabled) {
    this.binlogBackupEnabled = binlogBackupEnabled;
  }

  public ModifyBackupPolicyResponse binlogBackupEncryptionEnabled(Boolean binlogBackupEncryptionEnabled) {
    this.binlogBackupEncryptionEnabled = binlogBackupEncryptionEnabled;
    return this;
  }

   /**
   * Get binlogBackupEncryptionEnabled
   * @return binlogBackupEncryptionEnabled
  **/
  @Schema(description = "")
  public Boolean isBinlogBackupEncryptionEnabled() {
    return binlogBackupEncryptionEnabled;
  }

  public void setBinlogBackupEncryptionEnabled(Boolean binlogBackupEncryptionEnabled) {
    this.binlogBackupEncryptionEnabled = binlogBackupEncryptionEnabled;
  }

  public ModifyBackupPolicyResponse binlogFileCountsEnable(Boolean binlogFileCountsEnable) {
    this.binlogFileCountsEnable = binlogFileCountsEnable;
    return this;
  }

   /**
   * Get binlogFileCountsEnable
   * @return binlogFileCountsEnable
  **/
  @Schema(description = "")
  public Boolean isBinlogFileCountsEnable() {
    return binlogFileCountsEnable;
  }

  public void setBinlogFileCountsEnable(Boolean binlogFileCountsEnable) {
    this.binlogFileCountsEnable = binlogFileCountsEnable;
  }

  public ModifyBackupPolicyResponse binlogLimitCount(Integer binlogLimitCount) {
    this.binlogLimitCount = binlogLimitCount;
    return this;
  }

   /**
   * Get binlogLimitCount
   * @return binlogLimitCount
  **/
  @Schema(description = "")
  public Integer getBinlogLimitCount() {
    return binlogLimitCount;
  }

  public void setBinlogLimitCount(Integer binlogLimitCount) {
    this.binlogLimitCount = binlogLimitCount;
  }

  public ModifyBackupPolicyResponse binlogLocalRetentionHour(Integer binlogLocalRetentionHour) {
    this.binlogLocalRetentionHour = binlogLocalRetentionHour;
    return this;
  }

   /**
   * Get binlogLocalRetentionHour
   * @return binlogLocalRetentionHour
  **/
  @Schema(description = "")
  public Integer getBinlogLocalRetentionHour() {
    return binlogLocalRetentionHour;
  }

  public void setBinlogLocalRetentionHour(Integer binlogLocalRetentionHour) {
    this.binlogLocalRetentionHour = binlogLocalRetentionHour;
  }

  public ModifyBackupPolicyResponse binlogSpaceLimitEnable(Boolean binlogSpaceLimitEnable) {
    this.binlogSpaceLimitEnable = binlogSpaceLimitEnable;
    return this;
  }

   /**
   * Get binlogSpaceLimitEnable
   * @return binlogSpaceLimitEnable
  **/
  @Schema(description = "")
  public Boolean isBinlogSpaceLimitEnable() {
    return binlogSpaceLimitEnable;
  }

  public void setBinlogSpaceLimitEnable(Boolean binlogSpaceLimitEnable) {
    this.binlogSpaceLimitEnable = binlogSpaceLimitEnable;
  }

  public ModifyBackupPolicyResponse binlogStoragePercentage(Integer binlogStoragePercentage) {
    this.binlogStoragePercentage = binlogStoragePercentage;
    return this;
  }

   /**
   * Get binlogStoragePercentage
   * @return binlogStoragePercentage
  **/
  @Schema(description = "")
  public Integer getBinlogStoragePercentage() {
    return binlogStoragePercentage;
  }

  public void setBinlogStoragePercentage(Integer binlogStoragePercentage) {
    this.binlogStoragePercentage = binlogStoragePercentage;
  }

  public ModifyBackupPolicyResponse dataBackupAllRetention(Boolean dataBackupAllRetention) {
    this.dataBackupAllRetention = dataBackupAllRetention;
    return this;
  }

   /**
   * Get dataBackupAllRetention
   * @return dataBackupAllRetention
  **/
  @Schema(description = "")
  public Boolean isDataBackupAllRetention() {
    return dataBackupAllRetention;
  }

  public void setDataBackupAllRetention(Boolean dataBackupAllRetention) {
    this.dataBackupAllRetention = dataBackupAllRetention;
  }

  public ModifyBackupPolicyResponse dataBackupEncryptionEnabled(Boolean dataBackupEncryptionEnabled) {
    this.dataBackupEncryptionEnabled = dataBackupEncryptionEnabled;
    return this;
  }

   /**
   * Get dataBackupEncryptionEnabled
   * @return dataBackupEncryptionEnabled
  **/
  @Schema(description = "")
  public Boolean isDataBackupEncryptionEnabled() {
    return dataBackupEncryptionEnabled;
  }

  public void setDataBackupEncryptionEnabled(Boolean dataBackupEncryptionEnabled) {
    this.dataBackupEncryptionEnabled = dataBackupEncryptionEnabled;
  }

  public ModifyBackupPolicyResponse dataBackupRetentionDay(Integer dataBackupRetentionDay) {
    this.dataBackupRetentionDay = dataBackupRetentionDay;
    return this;
  }

   /**
   * Get dataBackupRetentionDay
   * @return dataBackupRetentionDay
  **/
  @Schema(description = "")
  public Integer getDataBackupRetentionDay() {
    return dataBackupRetentionDay;
  }

  public void setDataBackupRetentionDay(Integer dataBackupRetentionDay) {
    this.dataBackupRetentionDay = dataBackupRetentionDay;
  }

  public ModifyBackupPolicyResponse dataFullBackupPeriods(List<String> dataFullBackupPeriods) {
    this.dataFullBackupPeriods = dataFullBackupPeriods;
    return this;
  }

  public ModifyBackupPolicyResponse addDataFullBackupPeriodsItem(String dataFullBackupPeriodsItem) {
    if (this.dataFullBackupPeriods == null) {
      this.dataFullBackupPeriods = new ArrayList<String>();
    }
    this.dataFullBackupPeriods.add(dataFullBackupPeriodsItem);
    return this;
  }

   /**
   * Get dataFullBackupPeriods
   * @return dataFullBackupPeriods
  **/
  @Schema(description = "")
  public List<String> getDataFullBackupPeriods() {
    return dataFullBackupPeriods;
  }

  public void setDataFullBackupPeriods(List<String> dataFullBackupPeriods) {
    this.dataFullBackupPeriods = dataFullBackupPeriods;
  }

  public ModifyBackupPolicyResponse dataFullBackupStartUTCHour(Integer dataFullBackupStartUTCHour) {
    this.dataFullBackupStartUTCHour = dataFullBackupStartUTCHour;
    return this;
  }

   /**
   * Get dataFullBackupStartUTCHour
   * @return dataFullBackupStartUTCHour
  **/
  @Schema(description = "")
  public Integer getDataFullBackupStartUTCHour() {
    return dataFullBackupStartUTCHour;
  }

  public void setDataFullBackupStartUTCHour(Integer dataFullBackupStartUTCHour) {
    this.dataFullBackupStartUTCHour = dataFullBackupStartUTCHour;
  }

  public ModifyBackupPolicyResponse dataFullBackupTime(String dataFullBackupTime) {
    this.dataFullBackupTime = dataFullBackupTime;
    return this;
  }

   /**
   * Get dataFullBackupTime
   * @return dataFullBackupTime
  **/
  @Schema(description = "")
  public String getDataFullBackupTime() {
    return dataFullBackupTime;
  }

  public void setDataFullBackupTime(String dataFullBackupTime) {
    this.dataFullBackupTime = dataFullBackupTime;
  }

  public ModifyBackupPolicyResponse dataIncrBackupPeriods(List<String> dataIncrBackupPeriods) {
    this.dataIncrBackupPeriods = dataIncrBackupPeriods;
    return this;
  }

  public ModifyBackupPolicyResponse addDataIncrBackupPeriodsItem(String dataIncrBackupPeriodsItem) {
    if (this.dataIncrBackupPeriods == null) {
      this.dataIncrBackupPeriods = new ArrayList<String>();
    }
    this.dataIncrBackupPeriods.add(dataIncrBackupPeriodsItem);
    return this;
  }

   /**
   * Get dataIncrBackupPeriods
   * @return dataIncrBackupPeriods
  **/
  @Schema(description = "")
  public List<String> getDataIncrBackupPeriods() {
    return dataIncrBackupPeriods;
  }

  public void setDataIncrBackupPeriods(List<String> dataIncrBackupPeriods) {
    this.dataIncrBackupPeriods = dataIncrBackupPeriods;
  }

  public ModifyBackupPolicyResponse dataKeepDaysAfterReleased(Integer dataKeepDaysAfterReleased) {
    this.dataKeepDaysAfterReleased = dataKeepDaysAfterReleased;
    return this;
  }

   /**
   * Get dataKeepDaysAfterReleased
   * @return dataKeepDaysAfterReleased
  **/
  @Schema(description = "")
  public Integer getDataKeepDaysAfterReleased() {
    return dataKeepDaysAfterReleased;
  }

  public void setDataKeepDaysAfterReleased(Integer dataKeepDaysAfterReleased) {
    this.dataKeepDaysAfterReleased = dataKeepDaysAfterReleased;
  }

  public ModifyBackupPolicyResponse dataKeepPolicyAfterReleased(String dataKeepPolicyAfterReleased) {
    this.dataKeepPolicyAfterReleased = dataKeepPolicyAfterReleased;
    return this;
  }

   /**
   * Get dataKeepPolicyAfterReleased
   * @return dataKeepPolicyAfterReleased
  **/
  @Schema(description = "")
  public String getDataKeepPolicyAfterReleased() {
    return dataKeepPolicyAfterReleased;
  }

  public void setDataKeepPolicyAfterReleased(String dataKeepPolicyAfterReleased) {
    this.dataKeepPolicyAfterReleased = dataKeepPolicyAfterReleased;
  }

  public ModifyBackupPolicyResponse hourlyIncrBackupEnable(Boolean hourlyIncrBackupEnable) {
    this.hourlyIncrBackupEnable = hourlyIncrBackupEnable;
    return this;
  }

   /**
   * Get hourlyIncrBackupEnable
   * @return hourlyIncrBackupEnable
  **/
  @Schema(description = "")
  public Boolean isHourlyIncrBackupEnable() {
    return hourlyIncrBackupEnable;
  }

  public void setHourlyIncrBackupEnable(Boolean hourlyIncrBackupEnable) {
    this.hourlyIncrBackupEnable = hourlyIncrBackupEnable;
  }

  public ModifyBackupPolicyResponse incrBackupHourPeriod(Integer incrBackupHourPeriod) {
    this.incrBackupHourPeriod = incrBackupHourPeriod;
    return this;
  }

   /**
   * Get incrBackupHourPeriod
   * @return incrBackupHourPeriod
  **/
  @Schema(description = "")
  public Integer getIncrBackupHourPeriod() {
    return incrBackupHourPeriod;
  }

  public void setIncrBackupHourPeriod(Integer incrBackupHourPeriod) {
    this.incrBackupHourPeriod = incrBackupHourPeriod;
  }

  public ModifyBackupPolicyResponse instanceId(String instanceId) {
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

  public ModifyBackupPolicyResponse lockDDLTime(Integer lockDDLTime) {
    this.lockDDLTime = lockDDLTime;
    return this;
  }

   /**
   * Get lockDDLTime
   * @return lockDDLTime
  **/
  @Schema(description = "")
  public Integer getLockDDLTime() {
    return lockDDLTime;
  }

  public void setLockDDLTime(Integer lockDDLTime) {
    this.lockDDLTime = lockDDLTime;
  }

  public ModifyBackupPolicyResponse lockDdlTime(Integer lockDdlTime) {
    this.lockDdlTime = lockDdlTime;
    return this;
  }

   /**
   * Get lockDdlTime
   * @return lockDdlTime
  **/
  @Schema(description = "")
  public Integer getLockDdlTime() {
    return lockDdlTime;
  }

  public void setLockDdlTime(Integer lockDdlTime) {
    this.lockDdlTime = lockDdlTime;
  }

  public ModifyBackupPolicyResponse logBackupRetentionDay(Integer logBackupRetentionDay) {
    this.logBackupRetentionDay = logBackupRetentionDay;
    return this;
  }

   /**
   * Get logBackupRetentionDay
   * @return logBackupRetentionDay
  **/
  @Schema(description = "")
  public Integer getLogBackupRetentionDay() {
    return logBackupRetentionDay;
  }

  public void setLogBackupRetentionDay(Integer logBackupRetentionDay) {
    this.logBackupRetentionDay = logBackupRetentionDay;
  }

  public ModifyBackupPolicyResponse retentionPolicySynced(Boolean retentionPolicySynced) {
    this.retentionPolicySynced = retentionPolicySynced;
    return this;
  }

   /**
   * Get retentionPolicySynced
   * @return retentionPolicySynced
  **/
  @Schema(description = "")
  public Boolean isRetentionPolicySynced() {
    return retentionPolicySynced;
  }

  public void setRetentionPolicySynced(Boolean retentionPolicySynced) {
    this.retentionPolicySynced = retentionPolicySynced;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyBackupPolicyResponse modifyBackupPolicyResponse = (ModifyBackupPolicyResponse) o;
    return Objects.equals(this.binlogBackupAllRetention, modifyBackupPolicyResponse.binlogBackupAllRetention) &&
        Objects.equals(this.binlogBackupEnabled, modifyBackupPolicyResponse.binlogBackupEnabled) &&
        Objects.equals(this.binlogBackupEncryptionEnabled, modifyBackupPolicyResponse.binlogBackupEncryptionEnabled) &&
        Objects.equals(this.binlogFileCountsEnable, modifyBackupPolicyResponse.binlogFileCountsEnable) &&
        Objects.equals(this.binlogLimitCount, modifyBackupPolicyResponse.binlogLimitCount) &&
        Objects.equals(this.binlogLocalRetentionHour, modifyBackupPolicyResponse.binlogLocalRetentionHour) &&
        Objects.equals(this.binlogSpaceLimitEnable, modifyBackupPolicyResponse.binlogSpaceLimitEnable) &&
        Objects.equals(this.binlogStoragePercentage, modifyBackupPolicyResponse.binlogStoragePercentage) &&
        Objects.equals(this.dataBackupAllRetention, modifyBackupPolicyResponse.dataBackupAllRetention) &&
        Objects.equals(this.dataBackupEncryptionEnabled, modifyBackupPolicyResponse.dataBackupEncryptionEnabled) &&
        Objects.equals(this.dataBackupRetentionDay, modifyBackupPolicyResponse.dataBackupRetentionDay) &&
        Objects.equals(this.dataFullBackupPeriods, modifyBackupPolicyResponse.dataFullBackupPeriods) &&
        Objects.equals(this.dataFullBackupStartUTCHour, modifyBackupPolicyResponse.dataFullBackupStartUTCHour) &&
        Objects.equals(this.dataFullBackupTime, modifyBackupPolicyResponse.dataFullBackupTime) &&
        Objects.equals(this.dataIncrBackupPeriods, modifyBackupPolicyResponse.dataIncrBackupPeriods) &&
        Objects.equals(this.dataKeepDaysAfterReleased, modifyBackupPolicyResponse.dataKeepDaysAfterReleased) &&
        Objects.equals(this.dataKeepPolicyAfterReleased, modifyBackupPolicyResponse.dataKeepPolicyAfterReleased) &&
        Objects.equals(this.hourlyIncrBackupEnable, modifyBackupPolicyResponse.hourlyIncrBackupEnable) &&
        Objects.equals(this.incrBackupHourPeriod, modifyBackupPolicyResponse.incrBackupHourPeriod) &&
        Objects.equals(this.instanceId, modifyBackupPolicyResponse.instanceId) &&
        Objects.equals(this.lockDDLTime, modifyBackupPolicyResponse.lockDDLTime) &&
        Objects.equals(this.lockDdlTime, modifyBackupPolicyResponse.lockDdlTime) &&
        Objects.equals(this.logBackupRetentionDay, modifyBackupPolicyResponse.logBackupRetentionDay) &&
        Objects.equals(this.retentionPolicySynced, modifyBackupPolicyResponse.retentionPolicySynced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binlogBackupAllRetention, binlogBackupEnabled, binlogBackupEncryptionEnabled, binlogFileCountsEnable, binlogLimitCount, binlogLocalRetentionHour, binlogSpaceLimitEnable, binlogStoragePercentage, dataBackupAllRetention, dataBackupEncryptionEnabled, dataBackupRetentionDay, dataFullBackupPeriods, dataFullBackupStartUTCHour, dataFullBackupTime, dataIncrBackupPeriods, dataKeepDaysAfterReleased, dataKeepPolicyAfterReleased, hourlyIncrBackupEnable, incrBackupHourPeriod, instanceId, lockDDLTime, lockDdlTime, logBackupRetentionDay, retentionPolicySynced);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyBackupPolicyResponse {\n");
    
    sb.append("    binlogBackupAllRetention: ").append(toIndentedString(binlogBackupAllRetention)).append("\n");
    sb.append("    binlogBackupEnabled: ").append(toIndentedString(binlogBackupEnabled)).append("\n");
    sb.append("    binlogBackupEncryptionEnabled: ").append(toIndentedString(binlogBackupEncryptionEnabled)).append("\n");
    sb.append("    binlogFileCountsEnable: ").append(toIndentedString(binlogFileCountsEnable)).append("\n");
    sb.append("    binlogLimitCount: ").append(toIndentedString(binlogLimitCount)).append("\n");
    sb.append("    binlogLocalRetentionHour: ").append(toIndentedString(binlogLocalRetentionHour)).append("\n");
    sb.append("    binlogSpaceLimitEnable: ").append(toIndentedString(binlogSpaceLimitEnable)).append("\n");
    sb.append("    binlogStoragePercentage: ").append(toIndentedString(binlogStoragePercentage)).append("\n");
    sb.append("    dataBackupAllRetention: ").append(toIndentedString(dataBackupAllRetention)).append("\n");
    sb.append("    dataBackupEncryptionEnabled: ").append(toIndentedString(dataBackupEncryptionEnabled)).append("\n");
    sb.append("    dataBackupRetentionDay: ").append(toIndentedString(dataBackupRetentionDay)).append("\n");
    sb.append("    dataFullBackupPeriods: ").append(toIndentedString(dataFullBackupPeriods)).append("\n");
    sb.append("    dataFullBackupStartUTCHour: ").append(toIndentedString(dataFullBackupStartUTCHour)).append("\n");
    sb.append("    dataFullBackupTime: ").append(toIndentedString(dataFullBackupTime)).append("\n");
    sb.append("    dataIncrBackupPeriods: ").append(toIndentedString(dataIncrBackupPeriods)).append("\n");
    sb.append("    dataKeepDaysAfterReleased: ").append(toIndentedString(dataKeepDaysAfterReleased)).append("\n");
    sb.append("    dataKeepPolicyAfterReleased: ").append(toIndentedString(dataKeepPolicyAfterReleased)).append("\n");
    sb.append("    hourlyIncrBackupEnable: ").append(toIndentedString(hourlyIncrBackupEnable)).append("\n");
    sb.append("    incrBackupHourPeriod: ").append(toIndentedString(incrBackupHourPeriod)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    lockDDLTime: ").append(toIndentedString(lockDDLTime)).append("\n");
    sb.append("    lockDdlTime: ").append(toIndentedString(lockDdlTime)).append("\n");
    sb.append("    logBackupRetentionDay: ").append(toIndentedString(logBackupRetentionDay)).append("\n");
    sb.append("    retentionPolicySynced: ").append(toIndentedString(retentionPolicySynced)).append("\n");
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
