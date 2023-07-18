/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.ecs.model.NetworkInterfaceForRunInstancesInput;
import com.volcengine.ecs.model.TagForRunInstancesInput;
import com.volcengine.ecs.model.VolumeForRunInstancesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RunInstancesRequest
 */



public class RunInstancesRequest {
  @SerializedName("AutoRenew")
  private Boolean autoRenew = null;

  @SerializedName("AutoRenewPeriod")
  private Integer autoRenewPeriod = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Count")
  private Integer count = null;

  @SerializedName("CreditSpecification")
  private String creditSpecification = null;

  @SerializedName("DeploymentSetId")
  private String deploymentSetId = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DryRun")
  private Boolean dryRun = null;

  @SerializedName("HostName")
  private String hostName = null;

  @SerializedName("Hostname")
  private String hostname = null;

  @SerializedName("HpcClusterId")
  private String hpcClusterId = null;

  @SerializedName("ImageId")
  private String imageId = null;

  @SerializedName("InstanceChargeType")
  private String instanceChargeType = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("InstanceTypeId")
  private String instanceTypeId = null;

  @SerializedName("KeepImageCredential")
  private Boolean keepImageCredential = null;

  @SerializedName("KeyPairName")
  private String keyPairName = null;

  @SerializedName("MinCount")
  private Integer minCount = null;

  @SerializedName("NetworkInterfaces")
  private List<NetworkInterfaceForRunInstancesInput> networkInterfaces = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("Period")
  private Integer period = null;

  @SerializedName("PeriodUnit")
  private String periodUnit = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("SecurityEnhancementStrategy")
  private String securityEnhancementStrategy = null;

  @SerializedName("SpotStrategy")
  private String spotStrategy = null;

  @SerializedName("SuffixIndex")
  private Integer suffixIndex = null;

  @SerializedName("Tags")
  private List<TagForRunInstancesInput> tags = null;

  @SerializedName("UniqueSuffix")
  private Boolean uniqueSuffix = null;

  @SerializedName("UserData")
  private String userData = null;

  @SerializedName("Volumes")
  private List<VolumeForRunInstancesInput> volumes = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public RunInstancesRequest autoRenew(Boolean autoRenew) {
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

  public RunInstancesRequest autoRenewPeriod(Integer autoRenewPeriod) {
    this.autoRenewPeriod = autoRenewPeriod;
    return this;
  }

   /**
   * Get autoRenewPeriod
   * @return autoRenewPeriod
  **/
  @Schema(description = "")
  public Integer getAutoRenewPeriod() {
    return autoRenewPeriod;
  }

  public void setAutoRenewPeriod(Integer autoRenewPeriod) {
    this.autoRenewPeriod = autoRenewPeriod;
  }

  public RunInstancesRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public RunInstancesRequest count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(description = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public RunInstancesRequest creditSpecification(String creditSpecification) {
    this.creditSpecification = creditSpecification;
    return this;
  }

   /**
   * Get creditSpecification
   * @return creditSpecification
  **/
  @Schema(description = "")
  public String getCreditSpecification() {
    return creditSpecification;
  }

  public void setCreditSpecification(String creditSpecification) {
    this.creditSpecification = creditSpecification;
  }

  public RunInstancesRequest deploymentSetId(String deploymentSetId) {
    this.deploymentSetId = deploymentSetId;
    return this;
  }

   /**
   * Get deploymentSetId
   * @return deploymentSetId
  **/
  @Schema(description = "")
  public String getDeploymentSetId() {
    return deploymentSetId;
  }

  public void setDeploymentSetId(String deploymentSetId) {
    this.deploymentSetId = deploymentSetId;
  }

  public RunInstancesRequest description(String description) {
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

  public RunInstancesRequest dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

   /**
   * Get dryRun
   * @return dryRun
  **/
  @Schema(description = "")
  public Boolean isDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public RunInstancesRequest hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * this field is deprecated
   * @return hostName
  **/
  @Schema(description = "this field is deprecated")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public RunInstancesRequest hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @Schema(description = "")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public RunInstancesRequest hpcClusterId(String hpcClusterId) {
    this.hpcClusterId = hpcClusterId;
    return this;
  }

   /**
   * Get hpcClusterId
   * @return hpcClusterId
  **/
  @Schema(description = "")
  public String getHpcClusterId() {
    return hpcClusterId;
  }

  public void setHpcClusterId(String hpcClusterId) {
    this.hpcClusterId = hpcClusterId;
  }

  public RunInstancesRequest imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public RunInstancesRequest instanceChargeType(String instanceChargeType) {
    this.instanceChargeType = instanceChargeType;
    return this;
  }

   /**
   * Get instanceChargeType
   * @return instanceChargeType
  **/
  @Schema(description = "")
  public String getInstanceChargeType() {
    return instanceChargeType;
  }

  public void setInstanceChargeType(String instanceChargeType) {
    this.instanceChargeType = instanceChargeType;
  }

  public RunInstancesRequest instanceName(String instanceName) {
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

  public RunInstancesRequest instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public RunInstancesRequest instanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
    return this;
  }

   /**
   * Get instanceTypeId
   * @return instanceTypeId
  **/
  @Schema(description = "")
  public String getInstanceTypeId() {
    return instanceTypeId;
  }

  public void setInstanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
  }

  public RunInstancesRequest keepImageCredential(Boolean keepImageCredential) {
    this.keepImageCredential = keepImageCredential;
    return this;
  }

   /**
   * Get keepImageCredential
   * @return keepImageCredential
  **/
  @Schema(description = "")
  public Boolean isKeepImageCredential() {
    return keepImageCredential;
  }

  public void setKeepImageCredential(Boolean keepImageCredential) {
    this.keepImageCredential = keepImageCredential;
  }

  public RunInstancesRequest keyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
    return this;
  }

   /**
   * Get keyPairName
   * @return keyPairName
  **/
  @Schema(description = "")
  public String getKeyPairName() {
    return keyPairName;
  }

  public void setKeyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
  }

  public RunInstancesRequest minCount(Integer minCount) {
    this.minCount = minCount;
    return this;
  }

   /**
   * Get minCount
   * @return minCount
  **/
  @Schema(description = "")
  public Integer getMinCount() {
    return minCount;
  }

  public void setMinCount(Integer minCount) {
    this.minCount = minCount;
  }

  public RunInstancesRequest networkInterfaces(List<NetworkInterfaceForRunInstancesInput> networkInterfaces) {
    this.networkInterfaces = networkInterfaces;
    return this;
  }

  public RunInstancesRequest addNetworkInterfacesItem(NetworkInterfaceForRunInstancesInput networkInterfacesItem) {
    if (this.networkInterfaces == null) {
      this.networkInterfaces = new ArrayList<NetworkInterfaceForRunInstancesInput>();
    }
    this.networkInterfaces.add(networkInterfacesItem);
    return this;
  }

   /**
   * Get networkInterfaces
   * @return networkInterfaces
  **/
  @Valid
  @Schema(description = "")
  public List<NetworkInterfaceForRunInstancesInput> getNetworkInterfaces() {
    return networkInterfaces;
  }

  public void setNetworkInterfaces(List<NetworkInterfaceForRunInstancesInput> networkInterfaces) {
    this.networkInterfaces = networkInterfaces;
  }

  public RunInstancesRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public RunInstancesRequest period(Integer period) {
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

  public RunInstancesRequest periodUnit(String periodUnit) {
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

  public RunInstancesRequest projectName(String projectName) {
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

  public RunInstancesRequest securityEnhancementStrategy(String securityEnhancementStrategy) {
    this.securityEnhancementStrategy = securityEnhancementStrategy;
    return this;
  }

   /**
   * Get securityEnhancementStrategy
   * @return securityEnhancementStrategy
  **/
  @Schema(description = "")
  public String getSecurityEnhancementStrategy() {
    return securityEnhancementStrategy;
  }

  public void setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
    this.securityEnhancementStrategy = securityEnhancementStrategy;
  }

  public RunInstancesRequest spotStrategy(String spotStrategy) {
    this.spotStrategy = spotStrategy;
    return this;
  }

   /**
   * Get spotStrategy
   * @return spotStrategy
  **/
  @Schema(description = "")
  public String getSpotStrategy() {
    return spotStrategy;
  }

  public void setSpotStrategy(String spotStrategy) {
    this.spotStrategy = spotStrategy;
  }

  public RunInstancesRequest suffixIndex(Integer suffixIndex) {
    this.suffixIndex = suffixIndex;
    return this;
  }

   /**
   * Get suffixIndex
   * @return suffixIndex
  **/
  @Schema(description = "")
  public Integer getSuffixIndex() {
    return suffixIndex;
  }

  public void setSuffixIndex(Integer suffixIndex) {
    this.suffixIndex = suffixIndex;
  }

  public RunInstancesRequest tags(List<TagForRunInstancesInput> tags) {
    this.tags = tags;
    return this;
  }

  public RunInstancesRequest addTagsItem(TagForRunInstancesInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForRunInstancesInput>();
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
  public List<TagForRunInstancesInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForRunInstancesInput> tags) {
    this.tags = tags;
  }

  public RunInstancesRequest uniqueSuffix(Boolean uniqueSuffix) {
    this.uniqueSuffix = uniqueSuffix;
    return this;
  }

   /**
   * Get uniqueSuffix
   * @return uniqueSuffix
  **/
  @Schema(description = "")
  public Boolean isUniqueSuffix() {
    return uniqueSuffix;
  }

  public void setUniqueSuffix(Boolean uniqueSuffix) {
    this.uniqueSuffix = uniqueSuffix;
  }

  public RunInstancesRequest userData(String userData) {
    this.userData = userData;
    return this;
  }

   /**
   * Get userData
   * @return userData
  **/
  @Schema(description = "")
  public String getUserData() {
    return userData;
  }

  public void setUserData(String userData) {
    this.userData = userData;
  }

  public RunInstancesRequest volumes(List<VolumeForRunInstancesInput> volumes) {
    this.volumes = volumes;
    return this;
  }

  public RunInstancesRequest addVolumesItem(VolumeForRunInstancesInput volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<VolumeForRunInstancesInput>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Get volumes
   * @return volumes
  **/
  @Valid
  @Schema(description = "")
  public List<VolumeForRunInstancesInput> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<VolumeForRunInstancesInput> volumes) {
    this.volumes = volumes;
  }

  public RunInstancesRequest zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @NotNull
  @Schema(required = true, description = "")
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
    RunInstancesRequest runInstancesRequest = (RunInstancesRequest) o;
    return Objects.equals(this.autoRenew, runInstancesRequest.autoRenew) &&
        Objects.equals(this.autoRenewPeriod, runInstancesRequest.autoRenewPeriod) &&
        Objects.equals(this.clientToken, runInstancesRequest.clientToken) &&
        Objects.equals(this.count, runInstancesRequest.count) &&
        Objects.equals(this.creditSpecification, runInstancesRequest.creditSpecification) &&
        Objects.equals(this.deploymentSetId, runInstancesRequest.deploymentSetId) &&
        Objects.equals(this.description, runInstancesRequest.description) &&
        Objects.equals(this.dryRun, runInstancesRequest.dryRun) &&
        Objects.equals(this.hostName, runInstancesRequest.hostName) &&
        Objects.equals(this.hostname, runInstancesRequest.hostname) &&
        Objects.equals(this.hpcClusterId, runInstancesRequest.hpcClusterId) &&
        Objects.equals(this.imageId, runInstancesRequest.imageId) &&
        Objects.equals(this.instanceChargeType, runInstancesRequest.instanceChargeType) &&
        Objects.equals(this.instanceName, runInstancesRequest.instanceName) &&
        Objects.equals(this.instanceType, runInstancesRequest.instanceType) &&
        Objects.equals(this.instanceTypeId, runInstancesRequest.instanceTypeId) &&
        Objects.equals(this.keepImageCredential, runInstancesRequest.keepImageCredential) &&
        Objects.equals(this.keyPairName, runInstancesRequest.keyPairName) &&
        Objects.equals(this.minCount, runInstancesRequest.minCount) &&
        Objects.equals(this.networkInterfaces, runInstancesRequest.networkInterfaces) &&
        Objects.equals(this.password, runInstancesRequest.password) &&
        Objects.equals(this.period, runInstancesRequest.period) &&
        Objects.equals(this.periodUnit, runInstancesRequest.periodUnit) &&
        Objects.equals(this.projectName, runInstancesRequest.projectName) &&
        Objects.equals(this.securityEnhancementStrategy, runInstancesRequest.securityEnhancementStrategy) &&
        Objects.equals(this.spotStrategy, runInstancesRequest.spotStrategy) &&
        Objects.equals(this.suffixIndex, runInstancesRequest.suffixIndex) &&
        Objects.equals(this.tags, runInstancesRequest.tags) &&
        Objects.equals(this.uniqueSuffix, runInstancesRequest.uniqueSuffix) &&
        Objects.equals(this.userData, runInstancesRequest.userData) &&
        Objects.equals(this.volumes, runInstancesRequest.volumes) &&
        Objects.equals(this.zoneId, runInstancesRequest.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRenew, autoRenewPeriod, clientToken, count, creditSpecification, deploymentSetId, description, dryRun, hostName, hostname, hpcClusterId, imageId, instanceChargeType, instanceName, instanceType, instanceTypeId, keepImageCredential, keyPairName, minCount, networkInterfaces, password, period, periodUnit, projectName, securityEnhancementStrategy, spotStrategy, suffixIndex, tags, uniqueSuffix, userData, volumes, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunInstancesRequest {\n");
    
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    autoRenewPeriod: ").append(toIndentedString(autoRenewPeriod)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    creditSpecification: ").append(toIndentedString(creditSpecification)).append("\n");
    sb.append("    deploymentSetId: ").append(toIndentedString(deploymentSetId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    hpcClusterId: ").append(toIndentedString(hpcClusterId)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    instanceChargeType: ").append(toIndentedString(instanceChargeType)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    instanceTypeId: ").append(toIndentedString(instanceTypeId)).append("\n");
    sb.append("    keepImageCredential: ").append(toIndentedString(keepImageCredential)).append("\n");
    sb.append("    keyPairName: ").append(toIndentedString(keyPairName)).append("\n");
    sb.append("    minCount: ").append(toIndentedString(minCount)).append("\n");
    sb.append("    networkInterfaces: ").append(toIndentedString(networkInterfaces)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    securityEnhancementStrategy: ").append(toIndentedString(securityEnhancementStrategy)).append("\n");
    sb.append("    spotStrategy: ").append(toIndentedString(spotStrategy)).append("\n");
    sb.append("    suffixIndex: ").append(toIndentedString(suffixIndex)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    uniqueSuffix: ").append(toIndentedString(uniqueSuffix)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
