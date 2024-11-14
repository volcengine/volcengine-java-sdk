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
 * AffectedAssetForGetApiV1AlarmDetailOutput
 */



public class AffectedAssetForGetApiV1AlarmDetailOutput {
  @SerializedName("resource_cloud_account_id")
  private String resourceCloudAccountId = null;

  @SerializedName("resource_cloud_account_name")
  private String resourceCloudAccountName = null;

  @SerializedName("resource_id")
  private String resourceId = null;

  @SerializedName("resource_name")
  private String resourceName = null;

  /**
   * Gets or Sets resourceStatus
   */
  @JsonAdapter(ResourceStatusEnum.Adapter.class)
  public enum ResourceStatusEnum {
    @SerializedName("exist")
    EXIST("exist"),
    @SerializedName("not-exist")
    NOT_EXIST("not-exist");

    private String value;

    ResourceStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ResourceStatusEnum fromValue(String input) {
      for (ResourceStatusEnum b : ResourceStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ResourceStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResourceStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ResourceStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ResourceStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("resource_status")
  private ResourceStatusEnum resourceStatus = null;

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
  }  @SerializedName("resource_type")
  private ResourceTypeEnum resourceType = null;

  @SerializedName("resource_vendor")
  private String resourceVendor = null;

  public AffectedAssetForGetApiV1AlarmDetailOutput resourceCloudAccountId(String resourceCloudAccountId) {
    this.resourceCloudAccountId = resourceCloudAccountId;
    return this;
  }

   /**
   * Get resourceCloudAccountId
   * @return resourceCloudAccountId
  **/
  @Schema(description = "")
  public String getResourceCloudAccountId() {
    return resourceCloudAccountId;
  }

  public void setResourceCloudAccountId(String resourceCloudAccountId) {
    this.resourceCloudAccountId = resourceCloudAccountId;
  }

  public AffectedAssetForGetApiV1AlarmDetailOutput resourceCloudAccountName(String resourceCloudAccountName) {
    this.resourceCloudAccountName = resourceCloudAccountName;
    return this;
  }

   /**
   * Get resourceCloudAccountName
   * @return resourceCloudAccountName
  **/
  @Schema(description = "")
  public String getResourceCloudAccountName() {
    return resourceCloudAccountName;
  }

  public void setResourceCloudAccountName(String resourceCloudAccountName) {
    this.resourceCloudAccountName = resourceCloudAccountName;
  }

  public AffectedAssetForGetApiV1AlarmDetailOutput resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @Schema(description = "")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public AffectedAssetForGetApiV1AlarmDetailOutput resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

   /**
   * Get resourceName
   * @return resourceName
  **/
  @Schema(description = "")
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public AffectedAssetForGetApiV1AlarmDetailOutput resourceStatus(ResourceStatusEnum resourceStatus) {
    this.resourceStatus = resourceStatus;
    return this;
  }

   /**
   * Get resourceStatus
   * @return resourceStatus
  **/
  @Schema(description = "")
  public ResourceStatusEnum getResourceStatus() {
    return resourceStatus;
  }

  public void setResourceStatus(ResourceStatusEnum resourceStatus) {
    this.resourceStatus = resourceStatus;
  }

  public AffectedAssetForGetApiV1AlarmDetailOutput resourceType(ResourceTypeEnum resourceType) {
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

  public AffectedAssetForGetApiV1AlarmDetailOutput resourceVendor(String resourceVendor) {
    this.resourceVendor = resourceVendor;
    return this;
  }

   /**
   * Get resourceVendor
   * @return resourceVendor
  **/
  @Schema(description = "")
  public String getResourceVendor() {
    return resourceVendor;
  }

  public void setResourceVendor(String resourceVendor) {
    this.resourceVendor = resourceVendor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AffectedAssetForGetApiV1AlarmDetailOutput affectedAssetForGetApiV1AlarmDetailOutput = (AffectedAssetForGetApiV1AlarmDetailOutput) o;
    return Objects.equals(this.resourceCloudAccountId, affectedAssetForGetApiV1AlarmDetailOutput.resourceCloudAccountId) &&
        Objects.equals(this.resourceCloudAccountName, affectedAssetForGetApiV1AlarmDetailOutput.resourceCloudAccountName) &&
        Objects.equals(this.resourceId, affectedAssetForGetApiV1AlarmDetailOutput.resourceId) &&
        Objects.equals(this.resourceName, affectedAssetForGetApiV1AlarmDetailOutput.resourceName) &&
        Objects.equals(this.resourceStatus, affectedAssetForGetApiV1AlarmDetailOutput.resourceStatus) &&
        Objects.equals(this.resourceType, affectedAssetForGetApiV1AlarmDetailOutput.resourceType) &&
        Objects.equals(this.resourceVendor, affectedAssetForGetApiV1AlarmDetailOutput.resourceVendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceCloudAccountId, resourceCloudAccountName, resourceId, resourceName, resourceStatus, resourceType, resourceVendor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AffectedAssetForGetApiV1AlarmDetailOutput {\n");
    
    sb.append("    resourceCloudAccountId: ").append(toIndentedString(resourceCloudAccountId)).append("\n");
    sb.append("    resourceCloudAccountName: ").append(toIndentedString(resourceCloudAccountName)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    resourceStatus: ").append(toIndentedString(resourceStatus)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceVendor: ").append(toIndentedString(resourceVendor)).append("\n");
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
