/*
 * privatelink
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.privatelink.model;

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
 * PrivateLinkGatewayForDescribePrivateLinkGatewaysOutput
 */



public class PrivateLinkGatewayForDescribePrivateLinkGatewaysOutput {
  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("NetworkInterfaceId")
  private String networkInterfaceId = null;

  @SerializedName("NetworkInterfaceIp")
  private String networkInterfaceIp = null;

  @SerializedName("PrivateLinkGatewayId")
  private String privateLinkGatewayId = null;

  @SerializedName("PrivateLinkGatewayName")
  private String privateLinkGatewayName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public PrivateLinkGatewayForDescribePrivateLinkGatewaysOutput businessStatus(String businessStatus) {
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

  public PrivateLinkGatewayForDescribePrivateLinkGatewaysOutput creationTime(String creationTime) {
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

  public PrivateLinkGatewayForDescribePrivateLinkGatewaysOutput deletedTime(String deletedTime) {
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

  public PrivateLinkGatewayForDescribePrivateLinkGatewaysOutput description(String description) {
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

  public PrivateLinkGatewayForDescribePrivateLinkGatewaysOutput networkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
    return this;
  }

   /**
   * Get networkInterfaceId
   * @return networkInterfaceId
  **/
  @Schema(description = "")
  public String getNetworkInterfaceId() {
    return networkInterfaceId;
  }

  public void setNetworkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
  }

  public PrivateLinkGatewayForDescribePrivateLinkGatewaysOutput networkInterfaceIp(String networkInterfaceIp) {
    this.networkInterfaceIp = networkInterfaceIp;
    return this;
  }

   /**
   * Get networkInterfaceIp
   * @return networkInterfaceIp
  **/
  @Schema(description = "")
  public String getNetworkInterfaceIp() {
    return networkInterfaceIp;
  }

  public void setNetworkInterfaceIp(String networkInterfaceIp) {
    this.networkInterfaceIp = networkInterfaceIp;
  }

  public PrivateLinkGatewayForDescribePrivateLinkGatewaysOutput privateLinkGatewayId(String privateLinkGatewayId) {
    this.privateLinkGatewayId = privateLinkGatewayId;
    return this;
  }

   /**
   * Get privateLinkGatewayId
   * @return privateLinkGatewayId
  **/
  @Schema(description = "")
  public String getPrivateLinkGatewayId() {
    return privateLinkGatewayId;
  }

  public void setPrivateLinkGatewayId(String privateLinkGatewayId) {
    this.privateLinkGatewayId = privateLinkGatewayId;
  }

  public PrivateLinkGatewayForDescribePrivateLinkGatewaysOutput privateLinkGatewayName(String privateLinkGatewayName) {
    this.privateLinkGatewayName = privateLinkGatewayName;
    return this;
  }

   /**
   * Get privateLinkGatewayName
   * @return privateLinkGatewayName
  **/
  @Schema(description = "")
  public String getPrivateLinkGatewayName() {
    return privateLinkGatewayName;
  }

  public void setPrivateLinkGatewayName(String privateLinkGatewayName) {
    this.privateLinkGatewayName = privateLinkGatewayName;
  }

  public PrivateLinkGatewayForDescribePrivateLinkGatewaysOutput status(String status) {
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

  public PrivateLinkGatewayForDescribePrivateLinkGatewaysOutput subnetId(String subnetId) {
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

  public PrivateLinkGatewayForDescribePrivateLinkGatewaysOutput updateTime(String updateTime) {
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

  public PrivateLinkGatewayForDescribePrivateLinkGatewaysOutput vpcId(String vpcId) {
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

  public PrivateLinkGatewayForDescribePrivateLinkGatewaysOutput zoneId(String zoneId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateLinkGatewayForDescribePrivateLinkGatewaysOutput privateLinkGatewayForDescribePrivateLinkGatewaysOutput = (PrivateLinkGatewayForDescribePrivateLinkGatewaysOutput) o;
    return Objects.equals(this.businessStatus, privateLinkGatewayForDescribePrivateLinkGatewaysOutput.businessStatus) &&
        Objects.equals(this.creationTime, privateLinkGatewayForDescribePrivateLinkGatewaysOutput.creationTime) &&
        Objects.equals(this.deletedTime, privateLinkGatewayForDescribePrivateLinkGatewaysOutput.deletedTime) &&
        Objects.equals(this.description, privateLinkGatewayForDescribePrivateLinkGatewaysOutput.description) &&
        Objects.equals(this.networkInterfaceId, privateLinkGatewayForDescribePrivateLinkGatewaysOutput.networkInterfaceId) &&
        Objects.equals(this.networkInterfaceIp, privateLinkGatewayForDescribePrivateLinkGatewaysOutput.networkInterfaceIp) &&
        Objects.equals(this.privateLinkGatewayId, privateLinkGatewayForDescribePrivateLinkGatewaysOutput.privateLinkGatewayId) &&
        Objects.equals(this.privateLinkGatewayName, privateLinkGatewayForDescribePrivateLinkGatewaysOutput.privateLinkGatewayName) &&
        Objects.equals(this.status, privateLinkGatewayForDescribePrivateLinkGatewaysOutput.status) &&
        Objects.equals(this.subnetId, privateLinkGatewayForDescribePrivateLinkGatewaysOutput.subnetId) &&
        Objects.equals(this.updateTime, privateLinkGatewayForDescribePrivateLinkGatewaysOutput.updateTime) &&
        Objects.equals(this.vpcId, privateLinkGatewayForDescribePrivateLinkGatewaysOutput.vpcId) &&
        Objects.equals(this.zoneId, privateLinkGatewayForDescribePrivateLinkGatewaysOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessStatus, creationTime, deletedTime, description, networkInterfaceId, networkInterfaceIp, privateLinkGatewayId, privateLinkGatewayName, status, subnetId, updateTime, vpcId, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateLinkGatewayForDescribePrivateLinkGatewaysOutput {\n");
    
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    networkInterfaceId: ").append(toIndentedString(networkInterfaceId)).append("\n");
    sb.append("    networkInterfaceIp: ").append(toIndentedString(networkInterfaceIp)).append("\n");
    sb.append("    privateLinkGatewayId: ").append(toIndentedString(privateLinkGatewayId)).append("\n");
    sb.append("    privateLinkGatewayName: ").append(toIndentedString(privateLinkGatewayName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
