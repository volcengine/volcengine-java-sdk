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
import com.volcengine.vedbm.model.TagForCreateDBInstanceInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateDBInstanceRequest
 */



public class CreateDBInstanceRequest {
  @SerializedName("AutoRenew")
  private Boolean autoRenew = null;

  /**
   * Gets or Sets chargeType
   */
  @JsonAdapter(ChargeTypeEnum.Adapter.class)
  public enum ChargeTypeEnum {
    @SerializedName("PostPaid")
    POSTPAID("PostPaid"),
    @SerializedName("PrePaid")
    PREPAID("PrePaid");

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

  /**
   * Gets or Sets dbEngineVersion
   */
  @JsonAdapter(DbEngineVersionEnum.Adapter.class)
  public enum DbEngineVersionEnum {
    @SerializedName("MySQL_5_7")
    MYSQL_5_7("MySQL_5_7"),
    @SerializedName("MySQL_8_0")
    MYSQL_8_0("MySQL_8_0");

    private String value;

    DbEngineVersionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DbEngineVersionEnum fromValue(String input) {
      for (DbEngineVersionEnum b : DbEngineVersionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DbEngineVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DbEngineVersionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DbEngineVersionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DbEngineVersionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("DBEngineVersion")
  private DbEngineVersionEnum dbEngineVersion = null;

  /**
   * Gets or Sets dbMinorVersion
   */
  @JsonAdapter(DbMinorVersionEnum.Adapter.class)
  public enum DbMinorVersionEnum {
    @SerializedName("2.0")
    _2_0("2.0"),
    @SerializedName("3.0")
    _3_0("3.0"),
    @SerializedName("3.1")
    _3_1("3.1"),
    @SerializedName("3.2")
    _3_2("3.2");

    private String value;

    DbMinorVersionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DbMinorVersionEnum fromValue(String input) {
      for (DbMinorVersionEnum b : DbMinorVersionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DbMinorVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DbMinorVersionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DbMinorVersionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DbMinorVersionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("DBMinorVersion")
  private DbMinorVersionEnum dbMinorVersion = null;

  @SerializedName("DBTimeZone")
  private String dbTimeZone = null;

  /**
   * Gets or Sets deletionProtection
   */
  @JsonAdapter(DeletionProtectionEnum.Adapter.class)
  public enum DeletionProtectionEnum {
    @SerializedName("disabled")
    DISABLED("disabled"),
    @SerializedName("enabled")
    ENABLED("enabled");

    private String value;

    DeletionProtectionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DeletionProtectionEnum fromValue(String input) {
      for (DeletionProtectionEnum b : DeletionProtectionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DeletionProtectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeletionProtectionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DeletionProtectionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DeletionProtectionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("DeletionProtection")
  private DeletionProtectionEnum deletionProtection = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  /**
   * Gets or Sets lowerCaseTableNames
   */
  @JsonAdapter(LowerCaseTableNamesEnum.Adapter.class)
  public enum LowerCaseTableNamesEnum {
    @SerializedName("0")
    _0("0"),
    @SerializedName("1")
    _1("1");

    private String value;

    LowerCaseTableNamesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static LowerCaseTableNamesEnum fromValue(String input) {
      for (LowerCaseTableNamesEnum b : LowerCaseTableNamesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<LowerCaseTableNamesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LowerCaseTableNamesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public LowerCaseTableNamesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return LowerCaseTableNamesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("LowerCaseTableNames")
  private LowerCaseTableNamesEnum lowerCaseTableNames = null;

  @SerializedName("NodeNumber")
  private Integer nodeNumber = null;

  /**
   * Gets or Sets nodeSpec
   */
  @JsonAdapter(NodeSpecEnum.Adapter.class)
  public enum NodeSpecEnum {
    @SerializedName("vedb.mysql.g4.2xlarge")
    VEDB_MYSQL_G4_2XLARGE("vedb.mysql.g4.2xlarge"),
    @SerializedName("vedb.mysql.g4.4xlarge")
    VEDB_MYSQL_G4_4XLARGE("vedb.mysql.g4.4xlarge"),
    @SerializedName("vedb.mysql.g4.large")
    VEDB_MYSQL_G4_LARGE("vedb.mysql.g4.large"),
    @SerializedName("vedb.mysql.g4.xlarge")
    VEDB_MYSQL_G4_XLARGE("vedb.mysql.g4.xlarge"),
    @SerializedName("vedb.mysql.g8.2xlarge")
    VEDB_MYSQL_G8_2XLARGE("vedb.mysql.g8.2xlarge"),
    @SerializedName("vedb.mysql.x4.2xlarge")
    VEDB_MYSQL_X4_2XLARGE("vedb.mysql.x4.2xlarge"),
    @SerializedName("vedb.mysql.x4.4xlarge")
    VEDB_MYSQL_X4_4XLARGE("vedb.mysql.x4.4xlarge"),
    @SerializedName("vedb.mysql.x4.8xlarge")
    VEDB_MYSQL_X4_8XLARGE("vedb.mysql.x4.8xlarge"),
    @SerializedName("vedb.mysql.x4.large")
    VEDB_MYSQL_X4_LARGE("vedb.mysql.x4.large"),
    @SerializedName("vedb.mysql.x4.xlarge")
    VEDB_MYSQL_X4_XLARGE("vedb.mysql.x4.xlarge"),
    @SerializedName("vedb.mysql.x8.2xlarge")
    VEDB_MYSQL_X8_2XLARGE("vedb.mysql.x8.2xlarge"),
    @SerializedName("vedb.mysql.x8.4xlarge")
    VEDB_MYSQL_X8_4XLARGE("vedb.mysql.x8.4xlarge"),
    @SerializedName("vedb.mysql.x8.6xlarge")
    VEDB_MYSQL_X8_6XLARGE("vedb.mysql.x8.6xlarge"),
    @SerializedName("vedb.mysql.x8.8xlarge")
    VEDB_MYSQL_X8_8XLARGE("vedb.mysql.x8.8xlarge"),
    @SerializedName("vedb.mysql.x8.large")
    VEDB_MYSQL_X8_LARGE("vedb.mysql.x8.large"),
    @SerializedName("vedb.mysql.x8.xlarge")
    VEDB_MYSQL_X8_XLARGE("vedb.mysql.x8.xlarge");

    private String value;

    NodeSpecEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static NodeSpecEnum fromValue(String input) {
      for (NodeSpecEnum b : NodeSpecEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<NodeSpecEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NodeSpecEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public NodeSpecEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return NodeSpecEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("NodeSpec")
  private NodeSpecEnum nodeSpec = null;

  @SerializedName("Number")
  private Integer number = null;

  @SerializedName("Period")
  private Integer period = null;

  /**
   * Gets or Sets periodUnit
   */
  @JsonAdapter(PeriodUnitEnum.Adapter.class)
  public enum PeriodUnitEnum {
    @SerializedName("Month")
    MONTH("Month"),
    @SerializedName("Year")
    YEAR("Year");

    private String value;

    PeriodUnitEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PeriodUnitEnum fromValue(String input) {
      for (PeriodUnitEnum b : PeriodUnitEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PeriodUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodUnitEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PeriodUnitEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PeriodUnitEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("PeriodUnit")
  private PeriodUnitEnum periodUnit = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("PrePaidStorageInGB")
  private Integer prePaidStorageInGB = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  /**
   * Gets or Sets storageChargeType
   */
  @JsonAdapter(StorageChargeTypeEnum.Adapter.class)
  public enum StorageChargeTypeEnum {
    @SerializedName("PostPaid")
    POSTPAID("PostPaid"),
    @SerializedName("PrePaid")
    PREPAID("PrePaid");

    private String value;

    StorageChargeTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StorageChargeTypeEnum fromValue(String input) {
      for (StorageChargeTypeEnum b : StorageChargeTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StorageChargeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StorageChargeTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StorageChargeTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StorageChargeTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("StorageChargeType")
  private StorageChargeTypeEnum storageChargeType = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("SuperAccountName")
  private String superAccountName = null;

  @SerializedName("SuperAccountPassword")
  private String superAccountPassword = null;

  @SerializedName("Tags")
  private List<TagForCreateDBInstanceInput> tags = null;

  @SerializedName("TemplateId")
  private String templateId = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("ZoneIds")
  private String zoneIds = null;

  public CreateDBInstanceRequest autoRenew(Boolean autoRenew) {
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

  public CreateDBInstanceRequest chargeType(ChargeTypeEnum chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public ChargeTypeEnum getChargeType() {
    return chargeType;
  }

  public void setChargeType(ChargeTypeEnum chargeType) {
    this.chargeType = chargeType;
  }

  public CreateDBInstanceRequest dbEngineVersion(DbEngineVersionEnum dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
    return this;
  }

   /**
   * Get dbEngineVersion
   * @return dbEngineVersion
  **/
  @NotNull
  @Schema(required = true, description = "")
  public DbEngineVersionEnum getDbEngineVersion() {
    return dbEngineVersion;
  }

  public void setDbEngineVersion(DbEngineVersionEnum dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
  }

  public CreateDBInstanceRequest dbMinorVersion(DbMinorVersionEnum dbMinorVersion) {
    this.dbMinorVersion = dbMinorVersion;
    return this;
  }

   /**
   * Get dbMinorVersion
   * @return dbMinorVersion
  **/
  @Schema(description = "")
  public DbMinorVersionEnum getDbMinorVersion() {
    return dbMinorVersion;
  }

  public void setDbMinorVersion(DbMinorVersionEnum dbMinorVersion) {
    this.dbMinorVersion = dbMinorVersion;
  }

  public CreateDBInstanceRequest dbTimeZone(String dbTimeZone) {
    this.dbTimeZone = dbTimeZone;
    return this;
  }

   /**
   * Get dbTimeZone
   * @return dbTimeZone
  **/
  @Schema(description = "")
  public String getDbTimeZone() {
    return dbTimeZone;
  }

  public void setDbTimeZone(String dbTimeZone) {
    this.dbTimeZone = dbTimeZone;
  }

  public CreateDBInstanceRequest deletionProtection(DeletionProtectionEnum deletionProtection) {
    this.deletionProtection = deletionProtection;
    return this;
  }

   /**
   * Get deletionProtection
   * @return deletionProtection
  **/
  @Schema(description = "")
  public DeletionProtectionEnum getDeletionProtection() {
    return deletionProtection;
  }

  public void setDeletionProtection(DeletionProtectionEnum deletionProtection) {
    this.deletionProtection = deletionProtection;
  }

  public CreateDBInstanceRequest instanceName(String instanceName) {
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

  public CreateDBInstanceRequest lowerCaseTableNames(LowerCaseTableNamesEnum lowerCaseTableNames) {
    this.lowerCaseTableNames = lowerCaseTableNames;
    return this;
  }

   /**
   * Get lowerCaseTableNames
   * @return lowerCaseTableNames
  **/
  @Schema(description = "")
  public LowerCaseTableNamesEnum getLowerCaseTableNames() {
    return lowerCaseTableNames;
  }

  public void setLowerCaseTableNames(LowerCaseTableNamesEnum lowerCaseTableNames) {
    this.lowerCaseTableNames = lowerCaseTableNames;
  }

  public CreateDBInstanceRequest nodeNumber(Integer nodeNumber) {
    this.nodeNumber = nodeNumber;
    return this;
  }

   /**
   * Get nodeNumber
   * @return nodeNumber
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getNodeNumber() {
    return nodeNumber;
  }

  public void setNodeNumber(Integer nodeNumber) {
    this.nodeNumber = nodeNumber;
  }

  public CreateDBInstanceRequest nodeSpec(NodeSpecEnum nodeSpec) {
    this.nodeSpec = nodeSpec;
    return this;
  }

   /**
   * Get nodeSpec
   * @return nodeSpec
  **/
  @NotNull
  @Schema(required = true, description = "")
  public NodeSpecEnum getNodeSpec() {
    return nodeSpec;
  }

  public void setNodeSpec(NodeSpecEnum nodeSpec) {
    this.nodeSpec = nodeSpec;
  }

  public CreateDBInstanceRequest number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @Schema(description = "")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public CreateDBInstanceRequest period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public CreateDBInstanceRequest periodUnit(PeriodUnitEnum periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

   /**
   * Get periodUnit
   * @return periodUnit
  **/
  @Schema(description = "")
  public PeriodUnitEnum getPeriodUnit() {
    return periodUnit;
  }

  public void setPeriodUnit(PeriodUnitEnum periodUnit) {
    this.periodUnit = periodUnit;
  }

  public CreateDBInstanceRequest port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public CreateDBInstanceRequest prePaidStorageInGB(Integer prePaidStorageInGB) {
    this.prePaidStorageInGB = prePaidStorageInGB;
    return this;
  }

   /**
   * Get prePaidStorageInGB
   * @return prePaidStorageInGB
  **/
  @Schema(description = "")
  public Integer getPrePaidStorageInGB() {
    return prePaidStorageInGB;
  }

  public void setPrePaidStorageInGB(Integer prePaidStorageInGB) {
    this.prePaidStorageInGB = prePaidStorageInGB;
  }

  public CreateDBInstanceRequest projectName(String projectName) {
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

  public CreateDBInstanceRequest storageChargeType(StorageChargeTypeEnum storageChargeType) {
    this.storageChargeType = storageChargeType;
    return this;
  }

   /**
   * Get storageChargeType
   * @return storageChargeType
  **/
  @Schema(description = "")
  public StorageChargeTypeEnum getStorageChargeType() {
    return storageChargeType;
  }

  public void setStorageChargeType(StorageChargeTypeEnum storageChargeType) {
    this.storageChargeType = storageChargeType;
  }

  public CreateDBInstanceRequest subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public CreateDBInstanceRequest superAccountName(String superAccountName) {
    this.superAccountName = superAccountName;
    return this;
  }

   /**
   * Get superAccountName
   * @return superAccountName
  **/
  @Schema(description = "")
  public String getSuperAccountName() {
    return superAccountName;
  }

  public void setSuperAccountName(String superAccountName) {
    this.superAccountName = superAccountName;
  }

  public CreateDBInstanceRequest superAccountPassword(String superAccountPassword) {
    this.superAccountPassword = superAccountPassword;
    return this;
  }

   /**
   * Get superAccountPassword
   * @return superAccountPassword
  **/
  @Schema(description = "")
  public String getSuperAccountPassword() {
    return superAccountPassword;
  }

  public void setSuperAccountPassword(String superAccountPassword) {
    this.superAccountPassword = superAccountPassword;
  }

  public CreateDBInstanceRequest tags(List<TagForCreateDBInstanceInput> tags) {
    this.tags = tags;
    return this;
  }

  public CreateDBInstanceRequest addTagsItem(TagForCreateDBInstanceInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCreateDBInstanceInput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForCreateDBInstanceInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCreateDBInstanceInput> tags) {
    this.tags = tags;
  }

  public CreateDBInstanceRequest templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @Schema(description = "")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public CreateDBInstanceRequest vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  public CreateDBInstanceRequest zoneIds(String zoneIds) {
    this.zoneIds = zoneIds;
    return this;
  }

   /**
   * Get zoneIds
   * @return zoneIds
  **/
  @NotNull
  @Schema(required = true, description = "")
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
    CreateDBInstanceRequest createDBInstanceRequest = (CreateDBInstanceRequest) o;
    return Objects.equals(this.autoRenew, createDBInstanceRequest.autoRenew) &&
        Objects.equals(this.chargeType, createDBInstanceRequest.chargeType) &&
        Objects.equals(this.dbEngineVersion, createDBInstanceRequest.dbEngineVersion) &&
        Objects.equals(this.dbMinorVersion, createDBInstanceRequest.dbMinorVersion) &&
        Objects.equals(this.dbTimeZone, createDBInstanceRequest.dbTimeZone) &&
        Objects.equals(this.deletionProtection, createDBInstanceRequest.deletionProtection) &&
        Objects.equals(this.instanceName, createDBInstanceRequest.instanceName) &&
        Objects.equals(this.lowerCaseTableNames, createDBInstanceRequest.lowerCaseTableNames) &&
        Objects.equals(this.nodeNumber, createDBInstanceRequest.nodeNumber) &&
        Objects.equals(this.nodeSpec, createDBInstanceRequest.nodeSpec) &&
        Objects.equals(this.number, createDBInstanceRequest.number) &&
        Objects.equals(this.period, createDBInstanceRequest.period) &&
        Objects.equals(this.periodUnit, createDBInstanceRequest.periodUnit) &&
        Objects.equals(this.port, createDBInstanceRequest.port) &&
        Objects.equals(this.prePaidStorageInGB, createDBInstanceRequest.prePaidStorageInGB) &&
        Objects.equals(this.projectName, createDBInstanceRequest.projectName) &&
        Objects.equals(this.storageChargeType, createDBInstanceRequest.storageChargeType) &&
        Objects.equals(this.subnetId, createDBInstanceRequest.subnetId) &&
        Objects.equals(this.superAccountName, createDBInstanceRequest.superAccountName) &&
        Objects.equals(this.superAccountPassword, createDBInstanceRequest.superAccountPassword) &&
        Objects.equals(this.tags, createDBInstanceRequest.tags) &&
        Objects.equals(this.templateId, createDBInstanceRequest.templateId) &&
        Objects.equals(this.vpcId, createDBInstanceRequest.vpcId) &&
        Objects.equals(this.zoneIds, createDBInstanceRequest.zoneIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRenew, chargeType, dbEngineVersion, dbMinorVersion, dbTimeZone, deletionProtection, instanceName, lowerCaseTableNames, nodeNumber, nodeSpec, number, period, periodUnit, port, prePaidStorageInGB, projectName, storageChargeType, subnetId, superAccountName, superAccountPassword, tags, templateId, vpcId, zoneIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDBInstanceRequest {\n");
    
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    dbEngineVersion: ").append(toIndentedString(dbEngineVersion)).append("\n");
    sb.append("    dbMinorVersion: ").append(toIndentedString(dbMinorVersion)).append("\n");
    sb.append("    dbTimeZone: ").append(toIndentedString(dbTimeZone)).append("\n");
    sb.append("    deletionProtection: ").append(toIndentedString(deletionProtection)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    lowerCaseTableNames: ").append(toIndentedString(lowerCaseTableNames)).append("\n");
    sb.append("    nodeNumber: ").append(toIndentedString(nodeNumber)).append("\n");
    sb.append("    nodeSpec: ").append(toIndentedString(nodeSpec)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    prePaidStorageInGB: ").append(toIndentedString(prePaidStorageInGB)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    storageChargeType: ").append(toIndentedString(storageChargeType)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    superAccountName: ").append(toIndentedString(superAccountName)).append("\n");
    sb.append("    superAccountPassword: ").append(toIndentedString(superAccountPassword)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
