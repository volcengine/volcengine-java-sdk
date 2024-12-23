/*
 * escloud
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.escloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.escloud.model.ColdNodeResourceSpecForDescribeInstancesOutput;
import com.volcengine.escloud.model.ColdNodeStorageSpecForDescribeInstancesOutput;
import com.volcengine.escloud.model.CoordinatorNodeResourceSpecForDescribeInstancesOutput;
import com.volcengine.escloud.model.CoordinatorNodeStorageSpecForDescribeInstancesOutput;
import com.volcengine.escloud.model.HotNodeResourceSpecForDescribeInstancesOutput;
import com.volcengine.escloud.model.HotNodeStorageSpecForDescribeInstancesOutput;
import com.volcengine.escloud.model.KibanaNodeResourceSpecForDescribeInstancesOutput;
import com.volcengine.escloud.model.MasterNodeResourceSpecForDescribeInstancesOutput;
import com.volcengine.escloud.model.MasterNodeStorageSpecForDescribeInstancesOutput;
import com.volcengine.escloud.model.SubnetForDescribeInstancesOutput;
import com.volcengine.escloud.model.VPCForDescribeInstancesOutput;
import com.volcengine.escloud.model.WarmNodeResourceSpecForDescribeInstancesOutput;
import com.volcengine.escloud.model.WarmNodeStorageSpecForDescribeInstancesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * InstanceConfigurationForDescribeInstancesOutput
 */



public class InstanceConfigurationForDescribeInstancesOutput {
  @SerializedName("AdminUserName")
  private String adminUserName = null;

  /**
   * Gets or Sets chargeType
   */
  @JsonAdapter(ChargeTypeEnum.Adapter.class)
  public enum ChargeTypeEnum {
    @SerializedName("PrePaid")
    PREPAID("PrePaid"),
    @SerializedName("PostPaid")
    POSTPAID("PostPaid");

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

  @SerializedName("ColdNodeNumber")
  private Integer coldNodeNumber = null;

  @SerializedName("ColdNodeResourceSpec")
  private ColdNodeResourceSpecForDescribeInstancesOutput coldNodeResourceSpec = null;

  @SerializedName("ColdNodeStorageSpec")
  private ColdNodeStorageSpecForDescribeInstancesOutput coldNodeStorageSpec = null;

  @SerializedName("CoordinatorNodeNumber")
  private Integer coordinatorNodeNumber = null;

  @SerializedName("CoordinatorNodeResourceSpec")
  private CoordinatorNodeResourceSpecForDescribeInstancesOutput coordinatorNodeResourceSpec = null;

  @SerializedName("CoordinatorNodeStorageSpec")
  private CoordinatorNodeStorageSpecForDescribeInstancesOutput coordinatorNodeStorageSpec = null;

  @SerializedName("EnableHttps")
  private Boolean enableHttps = null;

  @SerializedName("EnablePureMaster")
  private Boolean enablePureMaster = null;

  @SerializedName("HotNodeNumber")
  private Integer hotNodeNumber = null;

  @SerializedName("HotNodeResourceSpec")
  private HotNodeResourceSpecForDescribeInstancesOutput hotNodeResourceSpec = null;

  @SerializedName("HotNodeStorageSpec")
  private HotNodeStorageSpecForDescribeInstancesOutput hotNodeStorageSpec = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("KibanaNodeNumber")
  private Integer kibanaNodeNumber = null;

  @SerializedName("KibanaNodeResourceSpec")
  private KibanaNodeResourceSpecForDescribeInstancesOutput kibanaNodeResourceSpec = null;

  @SerializedName("MasterNodeNumber")
  private Integer masterNodeNumber = null;

  @SerializedName("MasterNodeResourceSpec")
  private MasterNodeResourceSpecForDescribeInstancesOutput masterNodeResourceSpec = null;

  @SerializedName("MasterNodeStorageSpec")
  private MasterNodeStorageSpecForDescribeInstancesOutput masterNodeStorageSpec = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("Subnet")
  private SubnetForDescribeInstancesOutput subnet = null;

  @SerializedName("VPC")
  private VPCForDescribeInstancesOutput VPC = null;

  /**
   * Gets or Sets version
   */
  @JsonAdapter(VersionEnum.Adapter.class)
  public enum VersionEnum {
    @SerializedName("V6_7")
    V6_7("V6_7"),
    @SerializedName("V7_10")
    V7_10("V7_10"),
    @SerializedName("V7_TLS")
    V7_TLS("V7_TLS"),
    @SerializedName("V7_BYTE")
    V7_BYTE("V7_BYTE"),
    @SerializedName("OPEN_SEARCH_2_9")
    OPEN_SEARCH_2_9("OPEN_SEARCH_2_9");

    private String value;

    VersionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static VersionEnum fromValue(String input) {
      for (VersionEnum b : VersionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<VersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VersionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public VersionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return VersionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Version")
  private VersionEnum version = null;

  @SerializedName("WarmNodeNumber")
  private Integer warmNodeNumber = null;

  @SerializedName("WarmNodeResourceSpec")
  private WarmNodeResourceSpecForDescribeInstancesOutput warmNodeResourceSpec = null;

  @SerializedName("WarmNodeStorageSpec")
  private WarmNodeStorageSpecForDescribeInstancesOutput warmNodeStorageSpec = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  @SerializedName("ZoneNumber")
  private Integer zoneNumber = null;

  public InstanceConfigurationForDescribeInstancesOutput adminUserName(String adminUserName) {
    this.adminUserName = adminUserName;
    return this;
  }

   /**
   * Get adminUserName
   * @return adminUserName
  **/
  @Schema(description = "")
  public String getAdminUserName() {
    return adminUserName;
  }

  public void setAdminUserName(String adminUserName) {
    this.adminUserName = adminUserName;
  }

  public InstanceConfigurationForDescribeInstancesOutput chargeType(ChargeTypeEnum chargeType) {
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

  public InstanceConfigurationForDescribeInstancesOutput coldNodeNumber(Integer coldNodeNumber) {
    this.coldNodeNumber = coldNodeNumber;
    return this;
  }

   /**
   * Get coldNodeNumber
   * @return coldNodeNumber
  **/
  @Schema(description = "")
  public Integer getColdNodeNumber() {
    return coldNodeNumber;
  }

  public void setColdNodeNumber(Integer coldNodeNumber) {
    this.coldNodeNumber = coldNodeNumber;
  }

  public InstanceConfigurationForDescribeInstancesOutput coldNodeResourceSpec(ColdNodeResourceSpecForDescribeInstancesOutput coldNodeResourceSpec) {
    this.coldNodeResourceSpec = coldNodeResourceSpec;
    return this;
  }

   /**
   * Get coldNodeResourceSpec
   * @return coldNodeResourceSpec
  **/
  @Valid
  @Schema(description = "")
  public ColdNodeResourceSpecForDescribeInstancesOutput getColdNodeResourceSpec() {
    return coldNodeResourceSpec;
  }

  public void setColdNodeResourceSpec(ColdNodeResourceSpecForDescribeInstancesOutput coldNodeResourceSpec) {
    this.coldNodeResourceSpec = coldNodeResourceSpec;
  }

  public InstanceConfigurationForDescribeInstancesOutput coldNodeStorageSpec(ColdNodeStorageSpecForDescribeInstancesOutput coldNodeStorageSpec) {
    this.coldNodeStorageSpec = coldNodeStorageSpec;
    return this;
  }

   /**
   * Get coldNodeStorageSpec
   * @return coldNodeStorageSpec
  **/
  @Valid
  @Schema(description = "")
  public ColdNodeStorageSpecForDescribeInstancesOutput getColdNodeStorageSpec() {
    return coldNodeStorageSpec;
  }

  public void setColdNodeStorageSpec(ColdNodeStorageSpecForDescribeInstancesOutput coldNodeStorageSpec) {
    this.coldNodeStorageSpec = coldNodeStorageSpec;
  }

  public InstanceConfigurationForDescribeInstancesOutput coordinatorNodeNumber(Integer coordinatorNodeNumber) {
    this.coordinatorNodeNumber = coordinatorNodeNumber;
    return this;
  }

   /**
   * Get coordinatorNodeNumber
   * @return coordinatorNodeNumber
  **/
  @Schema(description = "")
  public Integer getCoordinatorNodeNumber() {
    return coordinatorNodeNumber;
  }

  public void setCoordinatorNodeNumber(Integer coordinatorNodeNumber) {
    this.coordinatorNodeNumber = coordinatorNodeNumber;
  }

  public InstanceConfigurationForDescribeInstancesOutput coordinatorNodeResourceSpec(CoordinatorNodeResourceSpecForDescribeInstancesOutput coordinatorNodeResourceSpec) {
    this.coordinatorNodeResourceSpec = coordinatorNodeResourceSpec;
    return this;
  }

   /**
   * Get coordinatorNodeResourceSpec
   * @return coordinatorNodeResourceSpec
  **/
  @Valid
  @Schema(description = "")
  public CoordinatorNodeResourceSpecForDescribeInstancesOutput getCoordinatorNodeResourceSpec() {
    return coordinatorNodeResourceSpec;
  }

  public void setCoordinatorNodeResourceSpec(CoordinatorNodeResourceSpecForDescribeInstancesOutput coordinatorNodeResourceSpec) {
    this.coordinatorNodeResourceSpec = coordinatorNodeResourceSpec;
  }

  public InstanceConfigurationForDescribeInstancesOutput coordinatorNodeStorageSpec(CoordinatorNodeStorageSpecForDescribeInstancesOutput coordinatorNodeStorageSpec) {
    this.coordinatorNodeStorageSpec = coordinatorNodeStorageSpec;
    return this;
  }

   /**
   * Get coordinatorNodeStorageSpec
   * @return coordinatorNodeStorageSpec
  **/
  @Valid
  @Schema(description = "")
  public CoordinatorNodeStorageSpecForDescribeInstancesOutput getCoordinatorNodeStorageSpec() {
    return coordinatorNodeStorageSpec;
  }

  public void setCoordinatorNodeStorageSpec(CoordinatorNodeStorageSpecForDescribeInstancesOutput coordinatorNodeStorageSpec) {
    this.coordinatorNodeStorageSpec = coordinatorNodeStorageSpec;
  }

  public InstanceConfigurationForDescribeInstancesOutput enableHttps(Boolean enableHttps) {
    this.enableHttps = enableHttps;
    return this;
  }

   /**
   * Get enableHttps
   * @return enableHttps
  **/
  @Schema(description = "")
  public Boolean isEnableHttps() {
    return enableHttps;
  }

  public void setEnableHttps(Boolean enableHttps) {
    this.enableHttps = enableHttps;
  }

  public InstanceConfigurationForDescribeInstancesOutput enablePureMaster(Boolean enablePureMaster) {
    this.enablePureMaster = enablePureMaster;
    return this;
  }

   /**
   * Get enablePureMaster
   * @return enablePureMaster
  **/
  @Schema(description = "")
  public Boolean isEnablePureMaster() {
    return enablePureMaster;
  }

  public void setEnablePureMaster(Boolean enablePureMaster) {
    this.enablePureMaster = enablePureMaster;
  }

  public InstanceConfigurationForDescribeInstancesOutput hotNodeNumber(Integer hotNodeNumber) {
    this.hotNodeNumber = hotNodeNumber;
    return this;
  }

   /**
   * Get hotNodeNumber
   * @return hotNodeNumber
  **/
  @Schema(description = "")
  public Integer getHotNodeNumber() {
    return hotNodeNumber;
  }

  public void setHotNodeNumber(Integer hotNodeNumber) {
    this.hotNodeNumber = hotNodeNumber;
  }

  public InstanceConfigurationForDescribeInstancesOutput hotNodeResourceSpec(HotNodeResourceSpecForDescribeInstancesOutput hotNodeResourceSpec) {
    this.hotNodeResourceSpec = hotNodeResourceSpec;
    return this;
  }

   /**
   * Get hotNodeResourceSpec
   * @return hotNodeResourceSpec
  **/
  @Valid
  @Schema(description = "")
  public HotNodeResourceSpecForDescribeInstancesOutput getHotNodeResourceSpec() {
    return hotNodeResourceSpec;
  }

  public void setHotNodeResourceSpec(HotNodeResourceSpecForDescribeInstancesOutput hotNodeResourceSpec) {
    this.hotNodeResourceSpec = hotNodeResourceSpec;
  }

  public InstanceConfigurationForDescribeInstancesOutput hotNodeStorageSpec(HotNodeStorageSpecForDescribeInstancesOutput hotNodeStorageSpec) {
    this.hotNodeStorageSpec = hotNodeStorageSpec;
    return this;
  }

   /**
   * Get hotNodeStorageSpec
   * @return hotNodeStorageSpec
  **/
  @Valid
  @Schema(description = "")
  public HotNodeStorageSpecForDescribeInstancesOutput getHotNodeStorageSpec() {
    return hotNodeStorageSpec;
  }

  public void setHotNodeStorageSpec(HotNodeStorageSpecForDescribeInstancesOutput hotNodeStorageSpec) {
    this.hotNodeStorageSpec = hotNodeStorageSpec;
  }

  public InstanceConfigurationForDescribeInstancesOutput instanceName(String instanceName) {
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

  public InstanceConfigurationForDescribeInstancesOutput kibanaNodeNumber(Integer kibanaNodeNumber) {
    this.kibanaNodeNumber = kibanaNodeNumber;
    return this;
  }

   /**
   * Get kibanaNodeNumber
   * @return kibanaNodeNumber
  **/
  @Schema(description = "")
  public Integer getKibanaNodeNumber() {
    return kibanaNodeNumber;
  }

  public void setKibanaNodeNumber(Integer kibanaNodeNumber) {
    this.kibanaNodeNumber = kibanaNodeNumber;
  }

  public InstanceConfigurationForDescribeInstancesOutput kibanaNodeResourceSpec(KibanaNodeResourceSpecForDescribeInstancesOutput kibanaNodeResourceSpec) {
    this.kibanaNodeResourceSpec = kibanaNodeResourceSpec;
    return this;
  }

   /**
   * Get kibanaNodeResourceSpec
   * @return kibanaNodeResourceSpec
  **/
  @Valid
  @Schema(description = "")
  public KibanaNodeResourceSpecForDescribeInstancesOutput getKibanaNodeResourceSpec() {
    return kibanaNodeResourceSpec;
  }

  public void setKibanaNodeResourceSpec(KibanaNodeResourceSpecForDescribeInstancesOutput kibanaNodeResourceSpec) {
    this.kibanaNodeResourceSpec = kibanaNodeResourceSpec;
  }

  public InstanceConfigurationForDescribeInstancesOutput masterNodeNumber(Integer masterNodeNumber) {
    this.masterNodeNumber = masterNodeNumber;
    return this;
  }

   /**
   * Get masterNodeNumber
   * @return masterNodeNumber
  **/
  @Schema(description = "")
  public Integer getMasterNodeNumber() {
    return masterNodeNumber;
  }

  public void setMasterNodeNumber(Integer masterNodeNumber) {
    this.masterNodeNumber = masterNodeNumber;
  }

  public InstanceConfigurationForDescribeInstancesOutput masterNodeResourceSpec(MasterNodeResourceSpecForDescribeInstancesOutput masterNodeResourceSpec) {
    this.masterNodeResourceSpec = masterNodeResourceSpec;
    return this;
  }

   /**
   * Get masterNodeResourceSpec
   * @return masterNodeResourceSpec
  **/
  @Valid
  @Schema(description = "")
  public MasterNodeResourceSpecForDescribeInstancesOutput getMasterNodeResourceSpec() {
    return masterNodeResourceSpec;
  }

  public void setMasterNodeResourceSpec(MasterNodeResourceSpecForDescribeInstancesOutput masterNodeResourceSpec) {
    this.masterNodeResourceSpec = masterNodeResourceSpec;
  }

  public InstanceConfigurationForDescribeInstancesOutput masterNodeStorageSpec(MasterNodeStorageSpecForDescribeInstancesOutput masterNodeStorageSpec) {
    this.masterNodeStorageSpec = masterNodeStorageSpec;
    return this;
  }

   /**
   * Get masterNodeStorageSpec
   * @return masterNodeStorageSpec
  **/
  @Valid
  @Schema(description = "")
  public MasterNodeStorageSpecForDescribeInstancesOutput getMasterNodeStorageSpec() {
    return masterNodeStorageSpec;
  }

  public void setMasterNodeStorageSpec(MasterNodeStorageSpecForDescribeInstancesOutput masterNodeStorageSpec) {
    this.masterNodeStorageSpec = masterNodeStorageSpec;
  }

  public InstanceConfigurationForDescribeInstancesOutput projectName(String projectName) {
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

  public InstanceConfigurationForDescribeInstancesOutput regionId(String regionId) {
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

  public InstanceConfigurationForDescribeInstancesOutput subnet(SubnetForDescribeInstancesOutput subnet) {
    this.subnet = subnet;
    return this;
  }

   /**
   * Get subnet
   * @return subnet
  **/
  @Valid
  @Schema(description = "")
  public SubnetForDescribeInstancesOutput getSubnet() {
    return subnet;
  }

  public void setSubnet(SubnetForDescribeInstancesOutput subnet) {
    this.subnet = subnet;
  }

  public InstanceConfigurationForDescribeInstancesOutput VPC(VPCForDescribeInstancesOutput VPC) {
    this.VPC = VPC;
    return this;
  }

   /**
   * Get VPC
   * @return VPC
  **/
  @Valid
  @Schema(description = "")
  public VPCForDescribeInstancesOutput getVPC() {
    return VPC;
  }

  public void setVPC(VPCForDescribeInstancesOutput VPC) {
    this.VPC = VPC;
  }

  public InstanceConfigurationForDescribeInstancesOutput version(VersionEnum version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public VersionEnum getVersion() {
    return version;
  }

  public void setVersion(VersionEnum version) {
    this.version = version;
  }

  public InstanceConfigurationForDescribeInstancesOutput warmNodeNumber(Integer warmNodeNumber) {
    this.warmNodeNumber = warmNodeNumber;
    return this;
  }

   /**
   * Get warmNodeNumber
   * @return warmNodeNumber
  **/
  @Schema(description = "")
  public Integer getWarmNodeNumber() {
    return warmNodeNumber;
  }

  public void setWarmNodeNumber(Integer warmNodeNumber) {
    this.warmNodeNumber = warmNodeNumber;
  }

  public InstanceConfigurationForDescribeInstancesOutput warmNodeResourceSpec(WarmNodeResourceSpecForDescribeInstancesOutput warmNodeResourceSpec) {
    this.warmNodeResourceSpec = warmNodeResourceSpec;
    return this;
  }

   /**
   * Get warmNodeResourceSpec
   * @return warmNodeResourceSpec
  **/
  @Valid
  @Schema(description = "")
  public WarmNodeResourceSpecForDescribeInstancesOutput getWarmNodeResourceSpec() {
    return warmNodeResourceSpec;
  }

  public void setWarmNodeResourceSpec(WarmNodeResourceSpecForDescribeInstancesOutput warmNodeResourceSpec) {
    this.warmNodeResourceSpec = warmNodeResourceSpec;
  }

  public InstanceConfigurationForDescribeInstancesOutput warmNodeStorageSpec(WarmNodeStorageSpecForDescribeInstancesOutput warmNodeStorageSpec) {
    this.warmNodeStorageSpec = warmNodeStorageSpec;
    return this;
  }

   /**
   * Get warmNodeStorageSpec
   * @return warmNodeStorageSpec
  **/
  @Valid
  @Schema(description = "")
  public WarmNodeStorageSpecForDescribeInstancesOutput getWarmNodeStorageSpec() {
    return warmNodeStorageSpec;
  }

  public void setWarmNodeStorageSpec(WarmNodeStorageSpecForDescribeInstancesOutput warmNodeStorageSpec) {
    this.warmNodeStorageSpec = warmNodeStorageSpec;
  }

  public InstanceConfigurationForDescribeInstancesOutput zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }

  public InstanceConfigurationForDescribeInstancesOutput zoneNumber(Integer zoneNumber) {
    this.zoneNumber = zoneNumber;
    return this;
  }

   /**
   * Get zoneNumber
   * @return zoneNumber
  **/
  @Schema(description = "")
  public Integer getZoneNumber() {
    return zoneNumber;
  }

  public void setZoneNumber(Integer zoneNumber) {
    this.zoneNumber = zoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceConfigurationForDescribeInstancesOutput instanceConfigurationForDescribeInstancesOutput = (InstanceConfigurationForDescribeInstancesOutput) o;
    return Objects.equals(this.adminUserName, instanceConfigurationForDescribeInstancesOutput.adminUserName) &&
        Objects.equals(this.chargeType, instanceConfigurationForDescribeInstancesOutput.chargeType) &&
        Objects.equals(this.coldNodeNumber, instanceConfigurationForDescribeInstancesOutput.coldNodeNumber) &&
        Objects.equals(this.coldNodeResourceSpec, instanceConfigurationForDescribeInstancesOutput.coldNodeResourceSpec) &&
        Objects.equals(this.coldNodeStorageSpec, instanceConfigurationForDescribeInstancesOutput.coldNodeStorageSpec) &&
        Objects.equals(this.coordinatorNodeNumber, instanceConfigurationForDescribeInstancesOutput.coordinatorNodeNumber) &&
        Objects.equals(this.coordinatorNodeResourceSpec, instanceConfigurationForDescribeInstancesOutput.coordinatorNodeResourceSpec) &&
        Objects.equals(this.coordinatorNodeStorageSpec, instanceConfigurationForDescribeInstancesOutput.coordinatorNodeStorageSpec) &&
        Objects.equals(this.enableHttps, instanceConfigurationForDescribeInstancesOutput.enableHttps) &&
        Objects.equals(this.enablePureMaster, instanceConfigurationForDescribeInstancesOutput.enablePureMaster) &&
        Objects.equals(this.hotNodeNumber, instanceConfigurationForDescribeInstancesOutput.hotNodeNumber) &&
        Objects.equals(this.hotNodeResourceSpec, instanceConfigurationForDescribeInstancesOutput.hotNodeResourceSpec) &&
        Objects.equals(this.hotNodeStorageSpec, instanceConfigurationForDescribeInstancesOutput.hotNodeStorageSpec) &&
        Objects.equals(this.instanceName, instanceConfigurationForDescribeInstancesOutput.instanceName) &&
        Objects.equals(this.kibanaNodeNumber, instanceConfigurationForDescribeInstancesOutput.kibanaNodeNumber) &&
        Objects.equals(this.kibanaNodeResourceSpec, instanceConfigurationForDescribeInstancesOutput.kibanaNodeResourceSpec) &&
        Objects.equals(this.masterNodeNumber, instanceConfigurationForDescribeInstancesOutput.masterNodeNumber) &&
        Objects.equals(this.masterNodeResourceSpec, instanceConfigurationForDescribeInstancesOutput.masterNodeResourceSpec) &&
        Objects.equals(this.masterNodeStorageSpec, instanceConfigurationForDescribeInstancesOutput.masterNodeStorageSpec) &&
        Objects.equals(this.projectName, instanceConfigurationForDescribeInstancesOutput.projectName) &&
        Objects.equals(this.regionId, instanceConfigurationForDescribeInstancesOutput.regionId) &&
        Objects.equals(this.subnet, instanceConfigurationForDescribeInstancesOutput.subnet) &&
        Objects.equals(this.VPC, instanceConfigurationForDescribeInstancesOutput.VPC) &&
        Objects.equals(this.version, instanceConfigurationForDescribeInstancesOutput.version) &&
        Objects.equals(this.warmNodeNumber, instanceConfigurationForDescribeInstancesOutput.warmNodeNumber) &&
        Objects.equals(this.warmNodeResourceSpec, instanceConfigurationForDescribeInstancesOutput.warmNodeResourceSpec) &&
        Objects.equals(this.warmNodeStorageSpec, instanceConfigurationForDescribeInstancesOutput.warmNodeStorageSpec) &&
        Objects.equals(this.zoneId, instanceConfigurationForDescribeInstancesOutput.zoneId) &&
        Objects.equals(this.zoneNumber, instanceConfigurationForDescribeInstancesOutput.zoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminUserName, chargeType, coldNodeNumber, coldNodeResourceSpec, coldNodeStorageSpec, coordinatorNodeNumber, coordinatorNodeResourceSpec, coordinatorNodeStorageSpec, enableHttps, enablePureMaster, hotNodeNumber, hotNodeResourceSpec, hotNodeStorageSpec, instanceName, kibanaNodeNumber, kibanaNodeResourceSpec, masterNodeNumber, masterNodeResourceSpec, masterNodeStorageSpec, projectName, regionId, subnet, VPC, version, warmNodeNumber, warmNodeResourceSpec, warmNodeStorageSpec, zoneId, zoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceConfigurationForDescribeInstancesOutput {\n");
    
    sb.append("    adminUserName: ").append(toIndentedString(adminUserName)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    coldNodeNumber: ").append(toIndentedString(coldNodeNumber)).append("\n");
    sb.append("    coldNodeResourceSpec: ").append(toIndentedString(coldNodeResourceSpec)).append("\n");
    sb.append("    coldNodeStorageSpec: ").append(toIndentedString(coldNodeStorageSpec)).append("\n");
    sb.append("    coordinatorNodeNumber: ").append(toIndentedString(coordinatorNodeNumber)).append("\n");
    sb.append("    coordinatorNodeResourceSpec: ").append(toIndentedString(coordinatorNodeResourceSpec)).append("\n");
    sb.append("    coordinatorNodeStorageSpec: ").append(toIndentedString(coordinatorNodeStorageSpec)).append("\n");
    sb.append("    enableHttps: ").append(toIndentedString(enableHttps)).append("\n");
    sb.append("    enablePureMaster: ").append(toIndentedString(enablePureMaster)).append("\n");
    sb.append("    hotNodeNumber: ").append(toIndentedString(hotNodeNumber)).append("\n");
    sb.append("    hotNodeResourceSpec: ").append(toIndentedString(hotNodeResourceSpec)).append("\n");
    sb.append("    hotNodeStorageSpec: ").append(toIndentedString(hotNodeStorageSpec)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    kibanaNodeNumber: ").append(toIndentedString(kibanaNodeNumber)).append("\n");
    sb.append("    kibanaNodeResourceSpec: ").append(toIndentedString(kibanaNodeResourceSpec)).append("\n");
    sb.append("    masterNodeNumber: ").append(toIndentedString(masterNodeNumber)).append("\n");
    sb.append("    masterNodeResourceSpec: ").append(toIndentedString(masterNodeResourceSpec)).append("\n");
    sb.append("    masterNodeStorageSpec: ").append(toIndentedString(masterNodeStorageSpec)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
    sb.append("    VPC: ").append(toIndentedString(VPC)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    warmNodeNumber: ").append(toIndentedString(warmNodeNumber)).append("\n");
    sb.append("    warmNodeResourceSpec: ").append(toIndentedString(warmNodeResourceSpec)).append("\n");
    sb.append("    warmNodeStorageSpec: ").append(toIndentedString(warmNodeStorageSpec)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    zoneNumber: ").append(toIndentedString(zoneNumber)).append("\n");
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
