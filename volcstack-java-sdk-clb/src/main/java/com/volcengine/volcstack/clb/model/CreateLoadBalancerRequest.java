/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.clb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcstack.clb.model.EipBillingConfigForCreateLoadBalancerInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateLoadBalancerRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T17:16:23.251034+08:00[Asia/Shanghai]")
public class CreateLoadBalancerRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("EipBillingConfig")
  private EipBillingConfigForCreateLoadBalancerInput eipBillingConfig = null;

  @SerializedName("EniAddress")
  private String eniAddress = null;

  @SerializedName("LoadBalancerBillingType")
  private Integer loadBalancerBillingType = null;

  @SerializedName("LoadBalancerName")
  private String loadBalancerName = null;

  @SerializedName("LoadBalancerSpec")
  private String loadBalancerSpec = null;

  @SerializedName("ModificationProtectionReason")
  private String modificationProtectionReason = null;

  @SerializedName("ModificationProtectionStatus")
  private String modificationProtectionStatus = null;

  @SerializedName("Period")
  private Integer period = null;

  @SerializedName("PeriodUnit")
  private String periodUnit = null;

  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public CreateLoadBalancerRequest description(String description) {
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

  public CreateLoadBalancerRequest eipBillingConfig(EipBillingConfigForCreateLoadBalancerInput eipBillingConfig) {
    this.eipBillingConfig = eipBillingConfig;
    return this;
  }

   /**
   * Get eipBillingConfig
   * @return eipBillingConfig
  **/
  @Valid
  @Schema(description = "")
  public EipBillingConfigForCreateLoadBalancerInput getEipBillingConfig() {
    return eipBillingConfig;
  }

  public void setEipBillingConfig(EipBillingConfigForCreateLoadBalancerInput eipBillingConfig) {
    this.eipBillingConfig = eipBillingConfig;
  }

  public CreateLoadBalancerRequest eniAddress(String eniAddress) {
    this.eniAddress = eniAddress;
    return this;
  }

   /**
   * Get eniAddress
   * @return eniAddress
  **/
  @Schema(description = "")
  public String getEniAddress() {
    return eniAddress;
  }

  public void setEniAddress(String eniAddress) {
    this.eniAddress = eniAddress;
  }

  public CreateLoadBalancerRequest loadBalancerBillingType(Integer loadBalancerBillingType) {
    this.loadBalancerBillingType = loadBalancerBillingType;
    return this;
  }

   /**
   * Get loadBalancerBillingType
   * @return loadBalancerBillingType
  **/
  @Schema(description = "")
  public Integer getLoadBalancerBillingType() {
    return loadBalancerBillingType;
  }

  public void setLoadBalancerBillingType(Integer loadBalancerBillingType) {
    this.loadBalancerBillingType = loadBalancerBillingType;
  }

  public CreateLoadBalancerRequest loadBalancerName(String loadBalancerName) {
    this.loadBalancerName = loadBalancerName;
    return this;
  }

   /**
   * Get loadBalancerName
   * @return loadBalancerName
  **/
  @Schema(description = "")
  public String getLoadBalancerName() {
    return loadBalancerName;
  }

  public void setLoadBalancerName(String loadBalancerName) {
    this.loadBalancerName = loadBalancerName;
  }

  public CreateLoadBalancerRequest loadBalancerSpec(String loadBalancerSpec) {
    this.loadBalancerSpec = loadBalancerSpec;
    return this;
  }

   /**
   * Get loadBalancerSpec
   * @return loadBalancerSpec
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getLoadBalancerSpec() {
    return loadBalancerSpec;
  }

  public void setLoadBalancerSpec(String loadBalancerSpec) {
    this.loadBalancerSpec = loadBalancerSpec;
  }

  public CreateLoadBalancerRequest modificationProtectionReason(String modificationProtectionReason) {
    this.modificationProtectionReason = modificationProtectionReason;
    return this;
  }

   /**
   * Get modificationProtectionReason
   * @return modificationProtectionReason
  **/
  @Schema(description = "")
  public String getModificationProtectionReason() {
    return modificationProtectionReason;
  }

  public void setModificationProtectionReason(String modificationProtectionReason) {
    this.modificationProtectionReason = modificationProtectionReason;
  }

  public CreateLoadBalancerRequest modificationProtectionStatus(String modificationProtectionStatus) {
    this.modificationProtectionStatus = modificationProtectionStatus;
    return this;
  }

   /**
   * Get modificationProtectionStatus
   * @return modificationProtectionStatus
  **/
  @Schema(description = "")
  public String getModificationProtectionStatus() {
    return modificationProtectionStatus;
  }

  public void setModificationProtectionStatus(String modificationProtectionStatus) {
    this.modificationProtectionStatus = modificationProtectionStatus;
  }

  public CreateLoadBalancerRequest period(Integer period) {
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

  public CreateLoadBalancerRequest periodUnit(String periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

   /**
   * Get periodUnit
   * @return periodUnit
  **/
  @Schema(description = "")
  public String getPeriodUnit() {
    return periodUnit;
  }

  public void setPeriodUnit(String periodUnit) {
    this.periodUnit = periodUnit;
  }

  public CreateLoadBalancerRequest regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public CreateLoadBalancerRequest subnetId(String subnetId) {
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

  public CreateLoadBalancerRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CreateLoadBalancerRequest vpcId(String vpcId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLoadBalancerRequest createLoadBalancerRequest = (CreateLoadBalancerRequest) o;
    return Objects.equals(this.description, createLoadBalancerRequest.description) &&
        Objects.equals(this.eipBillingConfig, createLoadBalancerRequest.eipBillingConfig) &&
        Objects.equals(this.eniAddress, createLoadBalancerRequest.eniAddress) &&
        Objects.equals(this.loadBalancerBillingType, createLoadBalancerRequest.loadBalancerBillingType) &&
        Objects.equals(this.loadBalancerName, createLoadBalancerRequest.loadBalancerName) &&
        Objects.equals(this.loadBalancerSpec, createLoadBalancerRequest.loadBalancerSpec) &&
        Objects.equals(this.modificationProtectionReason, createLoadBalancerRequest.modificationProtectionReason) &&
        Objects.equals(this.modificationProtectionStatus, createLoadBalancerRequest.modificationProtectionStatus) &&
        Objects.equals(this.period, createLoadBalancerRequest.period) &&
        Objects.equals(this.periodUnit, createLoadBalancerRequest.periodUnit) &&
        Objects.equals(this.regionId, createLoadBalancerRequest.regionId) &&
        Objects.equals(this.subnetId, createLoadBalancerRequest.subnetId) &&
        Objects.equals(this.type, createLoadBalancerRequest.type) &&
        Objects.equals(this.vpcId, createLoadBalancerRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, eipBillingConfig, eniAddress, loadBalancerBillingType, loadBalancerName, loadBalancerSpec, modificationProtectionReason, modificationProtectionStatus, period, periodUnit, regionId, subnetId, type, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLoadBalancerRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eipBillingConfig: ").append(toIndentedString(eipBillingConfig)).append("\n");
    sb.append("    eniAddress: ").append(toIndentedString(eniAddress)).append("\n");
    sb.append("    loadBalancerBillingType: ").append(toIndentedString(loadBalancerBillingType)).append("\n");
    sb.append("    loadBalancerName: ").append(toIndentedString(loadBalancerName)).append("\n");
    sb.append("    loadBalancerSpec: ").append(toIndentedString(loadBalancerSpec)).append("\n");
    sb.append("    modificationProtectionReason: ").append(toIndentedString(modificationProtectionReason)).append("\n");
    sb.append("    modificationProtectionStatus: ").append(toIndentedString(modificationProtectionStatus)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
