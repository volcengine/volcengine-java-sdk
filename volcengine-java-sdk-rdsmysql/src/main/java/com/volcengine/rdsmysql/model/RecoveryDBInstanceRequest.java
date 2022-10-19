/*
 * rds_mysql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysql.model;

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
 * RecoveryDBInstanceRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-19T10:12:05.954803+08:00[Asia/Shanghai]")
public class RecoveryDBInstanceRequest {
  @SerializedName("AutoRenew")
  private Boolean autoRenew = null;

  @SerializedName("BackupId")
  private String backupId = null;

  /**
   * Gets or Sets chargeType
   */
  @JsonAdapter(ChargeTypeEnum.Adapter.class)
  public enum ChargeTypeEnum {
    NOTENABLED("NotEnabled"),
    POSTPAID("PostPaid"),
    PREPAID("Prepaid");

    private String value;

    ChargeTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ChargeTypeEnum fromValue(String input) {
      for (ChargeTypeEnum b : ChargeTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ChargeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChargeTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ChargeTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ChargeTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ChargeType")
  private ChargeTypeEnum chargeType = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceSpecName")
  private String instanceSpecName = null;

  /**
   * Gets or Sets prepaidPeriod
   */
  @JsonAdapter(PrepaidPeriodEnum.Adapter.class)
  public enum PrepaidPeriodEnum {
    MONTH("Month"),
    YEAR("Year");

    private String value;

    PrepaidPeriodEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PrepaidPeriodEnum fromValue(String input) {
      for (PrepaidPeriodEnum b : PrepaidPeriodEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PrepaidPeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrepaidPeriodEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PrepaidPeriodEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PrepaidPeriodEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("PrepaidPeriod")
  private PrepaidPeriodEnum prepaidPeriod = null;

  /**
   * Gets or Sets recoveryType
   */
  @JsonAdapter(RecoveryTypeEnum.Adapter.class)
  public enum RecoveryTypeEnum {
    INSTANCE("Instance");

    private String value;

    RecoveryTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RecoveryTypeEnum fromValue(String input) {
      for (RecoveryTypeEnum b : RecoveryTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RecoveryTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecoveryTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RecoveryTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RecoveryTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("RecoveryType")
  private RecoveryTypeEnum recoveryType = null;

  @SerializedName("RestoreTime")
  private String restoreTime = null;

  @SerializedName("StorageSpaceGB")
  private Integer storageSpaceGB = null;

  /**
   * Gets or Sets storageType
   */
  @JsonAdapter(StorageTypeEnum.Adapter.class)
  public enum StorageTypeEnum {
    CLOUDSTORAGE("CloudStorage"),
    ESSDPL1("ESSDPL1"),
    ESSDPL2("ESSDPL2"),
    LOCALSSD("LocalSSD");

    private String value;

    StorageTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StorageTypeEnum fromValue(String input) {
      for (StorageTypeEnum b : StorageTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StorageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StorageTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StorageTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StorageTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("StorageType")
  private StorageTypeEnum storageType = null;

  @SerializedName("UsedTime")
  private Integer usedTime = null;

  @SerializedName("VpcID")
  private String vpcID = null;

  public RecoveryDBInstanceRequest autoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
    return this;
  }

   /**
   * Get autoRenew
   * @return autoRenew
  **/
  @Schema(description = "")
  public Boolean isAutoRenew() {
    return autoRenew;
  }

  public void setAutoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  public RecoveryDBInstanceRequest backupId(String backupId) {
    this.backupId = backupId;
    return this;
  }

   /**
   * Get backupId
   * @return backupId
  **/
  @Schema(description = "")
  public String getBackupId() {
    return backupId;
  }

  public void setBackupId(String backupId) {
    this.backupId = backupId;
  }

  public RecoveryDBInstanceRequest chargeType(ChargeTypeEnum chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @Schema(description = "")
  public ChargeTypeEnum getChargeType() {
    return chargeType;
  }

  public void setChargeType(ChargeTypeEnum chargeType) {
    this.chargeType = chargeType;
  }

  public RecoveryDBInstanceRequest instanceId(String instanceId) {
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

  public RecoveryDBInstanceRequest instanceName(String instanceName) {
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

  public RecoveryDBInstanceRequest instanceSpecName(String instanceSpecName) {
    this.instanceSpecName = instanceSpecName;
    return this;
  }

   /**
   * Get instanceSpecName
   * @return instanceSpecName
  **/
  @Schema(description = "")
  public String getInstanceSpecName() {
    return instanceSpecName;
  }

  public void setInstanceSpecName(String instanceSpecName) {
    this.instanceSpecName = instanceSpecName;
  }

  public RecoveryDBInstanceRequest prepaidPeriod(PrepaidPeriodEnum prepaidPeriod) {
    this.prepaidPeriod = prepaidPeriod;
    return this;
  }

   /**
   * Get prepaidPeriod
   * @return prepaidPeriod
  **/
  @Schema(description = "")
  public PrepaidPeriodEnum getPrepaidPeriod() {
    return prepaidPeriod;
  }

  public void setPrepaidPeriod(PrepaidPeriodEnum prepaidPeriod) {
    this.prepaidPeriod = prepaidPeriod;
  }

  public RecoveryDBInstanceRequest recoveryType(RecoveryTypeEnum recoveryType) {
    this.recoveryType = recoveryType;
    return this;
  }

   /**
   * Get recoveryType
   * @return recoveryType
  **/
  @Schema(description = "")
  public RecoveryTypeEnum getRecoveryType() {
    return recoveryType;
  }

  public void setRecoveryType(RecoveryTypeEnum recoveryType) {
    this.recoveryType = recoveryType;
  }

  public RecoveryDBInstanceRequest restoreTime(String restoreTime) {
    this.restoreTime = restoreTime;
    return this;
  }

   /**
   * Get restoreTime
   * @return restoreTime
  **/
  @Schema(description = "")
  public String getRestoreTime() {
    return restoreTime;
  }

  public void setRestoreTime(String restoreTime) {
    this.restoreTime = restoreTime;
  }

  public RecoveryDBInstanceRequest storageSpaceGB(Integer storageSpaceGB) {
    this.storageSpaceGB = storageSpaceGB;
    return this;
  }

   /**
   * Get storageSpaceGB
   * @return storageSpaceGB
  **/
  @Schema(description = "")
  public Integer getStorageSpaceGB() {
    return storageSpaceGB;
  }

  public void setStorageSpaceGB(Integer storageSpaceGB) {
    this.storageSpaceGB = storageSpaceGB;
  }

  public RecoveryDBInstanceRequest storageType(StorageTypeEnum storageType) {
    this.storageType = storageType;
    return this;
  }

   /**
   * Get storageType
   * @return storageType
  **/
  @Schema(description = "")
  public StorageTypeEnum getStorageType() {
    return storageType;
  }

  public void setStorageType(StorageTypeEnum storageType) {
    this.storageType = storageType;
  }

  public RecoveryDBInstanceRequest usedTime(Integer usedTime) {
    this.usedTime = usedTime;
    return this;
  }

   /**
   * Get usedTime
   * @return usedTime
  **/
  @Schema(description = "")
  public Integer getUsedTime() {
    return usedTime;
  }

  public void setUsedTime(Integer usedTime) {
    this.usedTime = usedTime;
  }

  public RecoveryDBInstanceRequest vpcID(String vpcID) {
    this.vpcID = vpcID;
    return this;
  }

   /**
   * Get vpcID
   * @return vpcID
  **/
  @Schema(description = "")
  public String getVpcID() {
    return vpcID;
  }

  public void setVpcID(String vpcID) {
    this.vpcID = vpcID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecoveryDBInstanceRequest recoveryDBInstanceRequest = (RecoveryDBInstanceRequest) o;
    return Objects.equals(this.autoRenew, recoveryDBInstanceRequest.autoRenew) &&
        Objects.equals(this.backupId, recoveryDBInstanceRequest.backupId) &&
        Objects.equals(this.chargeType, recoveryDBInstanceRequest.chargeType) &&
        Objects.equals(this.instanceId, recoveryDBInstanceRequest.instanceId) &&
        Objects.equals(this.instanceName, recoveryDBInstanceRequest.instanceName) &&
        Objects.equals(this.instanceSpecName, recoveryDBInstanceRequest.instanceSpecName) &&
        Objects.equals(this.prepaidPeriod, recoveryDBInstanceRequest.prepaidPeriod) &&
        Objects.equals(this.recoveryType, recoveryDBInstanceRequest.recoveryType) &&
        Objects.equals(this.restoreTime, recoveryDBInstanceRequest.restoreTime) &&
        Objects.equals(this.storageSpaceGB, recoveryDBInstanceRequest.storageSpaceGB) &&
        Objects.equals(this.storageType, recoveryDBInstanceRequest.storageType) &&
        Objects.equals(this.usedTime, recoveryDBInstanceRequest.usedTime) &&
        Objects.equals(this.vpcID, recoveryDBInstanceRequest.vpcID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRenew, backupId, chargeType, instanceId, instanceName, instanceSpecName, prepaidPeriod, recoveryType, restoreTime, storageSpaceGB, storageType, usedTime, vpcID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecoveryDBInstanceRequest {\n");
    
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceSpecName: ").append(toIndentedString(instanceSpecName)).append("\n");
    sb.append("    prepaidPeriod: ").append(toIndentedString(prepaidPeriod)).append("\n");
    sb.append("    recoveryType: ").append(toIndentedString(recoveryType)).append("\n");
    sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
    sb.append("    storageSpaceGB: ").append(toIndentedString(storageSpaceGB)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    usedTime: ").append(toIndentedString(usedTime)).append("\n");
    sb.append("    vpcID: ").append(toIndentedString(vpcID)).append("\n");
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
