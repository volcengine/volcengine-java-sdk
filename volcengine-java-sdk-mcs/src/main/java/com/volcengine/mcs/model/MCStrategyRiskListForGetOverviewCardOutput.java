/*
 * mcs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcs.model;

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
 * MCStrategyRiskListForGetOverviewCardOutput
 */



public class MCStrategyRiskListForGetOverviewCardOutput {
  @SerializedName("ResourceCnt")
  private Long resourceCnt = null;

  /**
   * Gets or Sets resourceType
   */
  @JsonAdapter(ResourceTypeEnum.Adapter.class)
  public enum ResourceTypeEnum {
    @SerializedName("ComputeVm")
    COMPUTEVM("ComputeVm"),
    @SerializedName("K8SCluster")
    K8SCLUSTER("K8SCluster"),
    @SerializedName("K8SPOD")
    K8SPOD("K8SPOD"),
    @SerializedName("K8SContainer")
    K8SCONTAINER("K8SContainer"),
    @SerializedName("K8SApp")
    K8SAPP("K8SApp"),
    @SerializedName("ComputeCR")
    COMPUTECR("ComputeCR"),
    @SerializedName("NetworkSecurityGroup")
    NETWORKSECURITYGROUP("NetworkSecurityGroup"),
    @SerializedName("NetworkSlb")
    NETWORKSLB("NetworkSlb"),
    @SerializedName("NetworkVpc")
    NETWORKVPC("NetworkVpc"),
    @SerializedName("NetworkSubnet")
    NETWORKSUBNET("NetworkSubnet"),
    @SerializedName("NetworkNatGateway")
    NETWORKNATGATEWAY("NetworkNatGateway"),
    @SerializedName("NetworkAPIGateway")
    NETWORKAPIGATEWAY("NetworkAPIGateway"),
    @SerializedName("NetworkEip")
    NETWORKEIP("NetworkEip"),
    @SerializedName("NetworkInterface")
    NETWORKINTERFACE("NetworkInterface"),
    @SerializedName("NetworkRouteTable")
    NETWORKROUTETABLE("NetworkRouteTable"),
    @SerializedName("NetworkIPSecVPN")
    NETWORKIPSECVPN("NetworkIPSecVPN"),
    @SerializedName("NetworkSSLVPN")
    NETWORKSSLVPN("NetworkSSLVPN"),
    @SerializedName("NetworkDirectConnectGateway")
    NETWORKDIRECTCONNECTGATEWAY("NetworkDirectConnectGateway"),
    @SerializedName("NetworkCEN")
    NETWORKCEN("NetworkCEN"),
    @SerializedName("StorageOssBucket")
    STORAGEOSSBUCKET("StorageOssBucket"),
    @SerializedName("StorageDB")
    STORAGEDB("StorageDB"),
    @SerializedName("StorageVolume")
    STORAGEVOLUME("StorageVolume"),
    @SerializedName("IdentityIamAccount")
    IDENTITYIAMACCOUNT("IdentityIamAccount"),
    @SerializedName("ComputeMSERegistryCenter")
    COMPUTEMSEREGISTRYCENTER("ComputeMSERegistryCenter"),
    @SerializedName("ComputeMSEGateway")
    COMPUTEMSEGATEWAY("ComputeMSEGateway"),
    @SerializedName("MQInstance")
    MQINSTANCE("MQInstance");

    private String value;

    ResourceTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ResourceTypeEnum fromValue(String input) {
      for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ResourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ResourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ResourceTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ResourceType")
  private ResourceTypeEnum resourceType = null;

  @SerializedName("RiskID")
  private String riskID = null;

  /**
   * Gets or Sets riskLevel
   */
  @JsonAdapter(RiskLevelEnum.Adapter.class)
  public enum RiskLevelEnum {
    @SerializedName("050-security")
    _050_SECURITY("050-security"),
    @SerializedName("100-low")
    _100_LOW("100-low"),
    @SerializedName("300-mid")
    _300_MID("300-mid"),
    @SerializedName("500-high")
    _500_HIGH("500-high"),
    @SerializedName("700-critical")
    _700_CRITICAL("700-critical");

    private String value;

    RiskLevelEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RiskLevelEnum fromValue(String input) {
      for (RiskLevelEnum b : RiskLevelEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RiskLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RiskLevelEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RiskLevelEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RiskLevelEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("RiskLevel")
  private RiskLevelEnum riskLevel = null;

  @SerializedName("RiskName")
  private String riskName = null;

  @SerializedName("RiskOccurTimeMilli")
  private Long riskOccurTimeMilli = null;

  public MCStrategyRiskListForGetOverviewCardOutput resourceCnt(Long resourceCnt) {
    this.resourceCnt = resourceCnt;
    return this;
  }

   /**
   * Get resourceCnt
   * @return resourceCnt
  **/
  @Schema(description = "")
  public Long getResourceCnt() {
    return resourceCnt;
  }

  public void setResourceCnt(Long resourceCnt) {
    this.resourceCnt = resourceCnt;
  }

  public MCStrategyRiskListForGetOverviewCardOutput resourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @Schema(description = "")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }

  public MCStrategyRiskListForGetOverviewCardOutput riskID(String riskID) {
    this.riskID = riskID;
    return this;
  }

   /**
   * Get riskID
   * @return riskID
  **/
  @Schema(description = "")
  public String getRiskID() {
    return riskID;
  }

  public void setRiskID(String riskID) {
    this.riskID = riskID;
  }

  public MCStrategyRiskListForGetOverviewCardOutput riskLevel(RiskLevelEnum riskLevel) {
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * Get riskLevel
   * @return riskLevel
  **/
  @Schema(description = "")
  public RiskLevelEnum getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(RiskLevelEnum riskLevel) {
    this.riskLevel = riskLevel;
  }

  public MCStrategyRiskListForGetOverviewCardOutput riskName(String riskName) {
    this.riskName = riskName;
    return this;
  }

   /**
   * Get riskName
   * @return riskName
  **/
  @Schema(description = "")
  public String getRiskName() {
    return riskName;
  }

  public void setRiskName(String riskName) {
    this.riskName = riskName;
  }

  public MCStrategyRiskListForGetOverviewCardOutput riskOccurTimeMilli(Long riskOccurTimeMilli) {
    this.riskOccurTimeMilli = riskOccurTimeMilli;
    return this;
  }

   /**
   * Get riskOccurTimeMilli
   * @return riskOccurTimeMilli
  **/
  @Schema(description = "")
  public Long getRiskOccurTimeMilli() {
    return riskOccurTimeMilli;
  }

  public void setRiskOccurTimeMilli(Long riskOccurTimeMilli) {
    this.riskOccurTimeMilli = riskOccurTimeMilli;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MCStrategyRiskListForGetOverviewCardOutput mcStrategyRiskListForGetOverviewCardOutput = (MCStrategyRiskListForGetOverviewCardOutput) o;
    return Objects.equals(this.resourceCnt, mcStrategyRiskListForGetOverviewCardOutput.resourceCnt) &&
        Objects.equals(this.resourceType, mcStrategyRiskListForGetOverviewCardOutput.resourceType) &&
        Objects.equals(this.riskID, mcStrategyRiskListForGetOverviewCardOutput.riskID) &&
        Objects.equals(this.riskLevel, mcStrategyRiskListForGetOverviewCardOutput.riskLevel) &&
        Objects.equals(this.riskName, mcStrategyRiskListForGetOverviewCardOutput.riskName) &&
        Objects.equals(this.riskOccurTimeMilli, mcStrategyRiskListForGetOverviewCardOutput.riskOccurTimeMilli);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceCnt, resourceType, riskID, riskLevel, riskName, riskOccurTimeMilli);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MCStrategyRiskListForGetOverviewCardOutput {\n");
    
    sb.append("    resourceCnt: ").append(toIndentedString(resourceCnt)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    riskID: ").append(toIndentedString(riskID)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    riskName: ").append(toIndentedString(riskName)).append("\n");
    sb.append("    riskOccurTimeMilli: ").append(toIndentedString(riskOccurTimeMilli)).append("\n");
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