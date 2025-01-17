/*
 * redis
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.redis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.redis.model.CapacityForDescribeDBInstancesOutput;
import com.volcengine.redis.model.TagForDescribeDBInstancesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * InstanceForDescribeDBInstancesOutput
 */



public class InstanceForDescribeDBInstancesOutput {
  @SerializedName("Capacity")
  private CapacityForDescribeDBInstancesOutput capacity = null;

  @SerializedName("ChargeType")
  private String chargeType = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("DataLayout")
  private String dataLayout = null;

  @SerializedName("DeletionProtection")
  private String deletionProtection = null;

  @SerializedName("EngineVersion")
  private String engineVersion = null;

  @SerializedName("ExpiredTime")
  private String expiredTime = null;

  @SerializedName("InstanceClass")
  private String instanceClass = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("MultiAZ")
  private String multiAZ = null;

  @SerializedName("NodeNumber")
  private Integer nodeNumber = null;

  @SerializedName("PrivateAddress")
  private String privateAddress = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("ServiceType")
  private String serviceType = null;

  @SerializedName("ShardCapacity")
  private Double shardCapacity = null;

  @SerializedName("ShardNumber")
  private Integer shardNumber = null;

  @SerializedName("ShardedCluster")
  private Integer shardedCluster = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeDBInstancesOutput> tags = null;

  @SerializedName("VIP")
  private String VIP = null;

  @SerializedName("VIPv6")
  private String viPv6 = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("ZoneIds")
  private List<String> zoneIds = null;

  public InstanceForDescribeDBInstancesOutput capacity(CapacityForDescribeDBInstancesOutput capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * @return capacity
  **/
  @Valid
  @Schema(description = "")
  public CapacityForDescribeDBInstancesOutput getCapacity() {
    return capacity;
  }

  public void setCapacity(CapacityForDescribeDBInstancesOutput capacity) {
    this.capacity = capacity;
  }

  public InstanceForDescribeDBInstancesOutput chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @Schema(description = "")
  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  public InstanceForDescribeDBInstancesOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public InstanceForDescribeDBInstancesOutput dataLayout(String dataLayout) {
    this.dataLayout = dataLayout;
    return this;
  }

   /**
   * Get dataLayout
   * @return dataLayout
  **/
  @Schema(description = "")
  public String getDataLayout() {
    return dataLayout;
  }

  public void setDataLayout(String dataLayout) {
    this.dataLayout = dataLayout;
  }

  public InstanceForDescribeDBInstancesOutput deletionProtection(String deletionProtection) {
    this.deletionProtection = deletionProtection;
    return this;
  }

   /**
   * Get deletionProtection
   * @return deletionProtection
  **/
  @Schema(description = "")
  public String getDeletionProtection() {
    return deletionProtection;
  }

  public void setDeletionProtection(String deletionProtection) {
    this.deletionProtection = deletionProtection;
  }

  public InstanceForDescribeDBInstancesOutput engineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
    return this;
  }

   /**
   * Get engineVersion
   * @return engineVersion
  **/
  @Schema(description = "")
  public String getEngineVersion() {
    return engineVersion;
  }

  public void setEngineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
  }

  public InstanceForDescribeDBInstancesOutput expiredTime(String expiredTime) {
    this.expiredTime = expiredTime;
    return this;
  }

   /**
   * Get expiredTime
   * @return expiredTime
  **/
  @Schema(description = "")
  public String getExpiredTime() {
    return expiredTime;
  }

  public void setExpiredTime(String expiredTime) {
    this.expiredTime = expiredTime;
  }

  public InstanceForDescribeDBInstancesOutput instanceClass(String instanceClass) {
    this.instanceClass = instanceClass;
    return this;
  }

   /**
   * Get instanceClass
   * @return instanceClass
  **/
  @Schema(description = "")
  public String getInstanceClass() {
    return instanceClass;
  }

  public void setInstanceClass(String instanceClass) {
    this.instanceClass = instanceClass;
  }

  public InstanceForDescribeDBInstancesOutput instanceId(String instanceId) {
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

  public InstanceForDescribeDBInstancesOutput instanceName(String instanceName) {
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

  public InstanceForDescribeDBInstancesOutput multiAZ(String multiAZ) {
    this.multiAZ = multiAZ;
    return this;
  }

   /**
   * Get multiAZ
   * @return multiAZ
  **/
  @Schema(description = "")
  public String getMultiAZ() {
    return multiAZ;
  }

  public void setMultiAZ(String multiAZ) {
    this.multiAZ = multiAZ;
  }

  public InstanceForDescribeDBInstancesOutput nodeNumber(Integer nodeNumber) {
    this.nodeNumber = nodeNumber;
    return this;
  }

   /**
   * Get nodeNumber
   * @return nodeNumber
  **/
  @Schema(description = "")
  public Integer getNodeNumber() {
    return nodeNumber;
  }

  public void setNodeNumber(Integer nodeNumber) {
    this.nodeNumber = nodeNumber;
  }

  public InstanceForDescribeDBInstancesOutput privateAddress(String privateAddress) {
    this.privateAddress = privateAddress;
    return this;
  }

   /**
   * Get privateAddress
   * @return privateAddress
  **/
  @Schema(description = "")
  public String getPrivateAddress() {
    return privateAddress;
  }

  public void setPrivateAddress(String privateAddress) {
    this.privateAddress = privateAddress;
  }

  public InstanceForDescribeDBInstancesOutput projectName(String projectName) {
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

  public InstanceForDescribeDBInstancesOutput regionId(String regionId) {
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

  public InstanceForDescribeDBInstancesOutput serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  @Schema(description = "")
  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public InstanceForDescribeDBInstancesOutput shardCapacity(Double shardCapacity) {
    this.shardCapacity = shardCapacity;
    return this;
  }

   /**
   * Get shardCapacity
   * @return shardCapacity
  **/
  @Schema(description = "")
  public Double getShardCapacity() {
    return shardCapacity;
  }

  public void setShardCapacity(Double shardCapacity) {
    this.shardCapacity = shardCapacity;
  }

  public InstanceForDescribeDBInstancesOutput shardNumber(Integer shardNumber) {
    this.shardNumber = shardNumber;
    return this;
  }

   /**
   * Get shardNumber
   * @return shardNumber
  **/
  @Schema(description = "")
  public Integer getShardNumber() {
    return shardNumber;
  }

  public void setShardNumber(Integer shardNumber) {
    this.shardNumber = shardNumber;
  }

  public InstanceForDescribeDBInstancesOutput shardedCluster(Integer shardedCluster) {
    this.shardedCluster = shardedCluster;
    return this;
  }

   /**
   * Get shardedCluster
   * @return shardedCluster
  **/
  @Schema(description = "")
  public Integer getShardedCluster() {
    return shardedCluster;
  }

  public void setShardedCluster(Integer shardedCluster) {
    this.shardedCluster = shardedCluster;
  }

  public InstanceForDescribeDBInstancesOutput status(String status) {
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

  public InstanceForDescribeDBInstancesOutput tags(List<TagForDescribeDBInstancesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public InstanceForDescribeDBInstancesOutput addTagsItem(TagForDescribeDBInstancesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeDBInstancesOutput>();
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
  public List<TagForDescribeDBInstancesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeDBInstancesOutput> tags) {
    this.tags = tags;
  }

  public InstanceForDescribeDBInstancesOutput VIP(String VIP) {
    this.VIP = VIP;
    return this;
  }

   /**
   * Get VIP
   * @return VIP
  **/
  @Schema(description = "")
  public String getVIP() {
    return VIP;
  }

  public void setVIP(String VIP) {
    this.VIP = VIP;
  }

  public InstanceForDescribeDBInstancesOutput viPv6(String viPv6) {
    this.viPv6 = viPv6;
    return this;
  }

   /**
   * Get viPv6
   * @return viPv6
  **/
  @Schema(description = "")
  public String getViPv6() {
    return viPv6;
  }

  public void setViPv6(String viPv6) {
    this.viPv6 = viPv6;
  }

  public InstanceForDescribeDBInstancesOutput vpcId(String vpcId) {
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

  public InstanceForDescribeDBInstancesOutput zoneIds(List<String> zoneIds) {
    this.zoneIds = zoneIds;
    return this;
  }

  public InstanceForDescribeDBInstancesOutput addZoneIdsItem(String zoneIdsItem) {
    if (this.zoneIds == null) {
      this.zoneIds = new ArrayList<String>();
    }
    this.zoneIds.add(zoneIdsItem);
    return this;
  }

   /**
   * Get zoneIds
   * @return zoneIds
  **/
  @Schema(description = "")
  public List<String> getZoneIds() {
    return zoneIds;
  }

  public void setZoneIds(List<String> zoneIds) {
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
    InstanceForDescribeDBInstancesOutput instanceForDescribeDBInstancesOutput = (InstanceForDescribeDBInstancesOutput) o;
    return Objects.equals(this.capacity, instanceForDescribeDBInstancesOutput.capacity) &&
        Objects.equals(this.chargeType, instanceForDescribeDBInstancesOutput.chargeType) &&
        Objects.equals(this.createTime, instanceForDescribeDBInstancesOutput.createTime) &&
        Objects.equals(this.dataLayout, instanceForDescribeDBInstancesOutput.dataLayout) &&
        Objects.equals(this.deletionProtection, instanceForDescribeDBInstancesOutput.deletionProtection) &&
        Objects.equals(this.engineVersion, instanceForDescribeDBInstancesOutput.engineVersion) &&
        Objects.equals(this.expiredTime, instanceForDescribeDBInstancesOutput.expiredTime) &&
        Objects.equals(this.instanceClass, instanceForDescribeDBInstancesOutput.instanceClass) &&
        Objects.equals(this.instanceId, instanceForDescribeDBInstancesOutput.instanceId) &&
        Objects.equals(this.instanceName, instanceForDescribeDBInstancesOutput.instanceName) &&
        Objects.equals(this.multiAZ, instanceForDescribeDBInstancesOutput.multiAZ) &&
        Objects.equals(this.nodeNumber, instanceForDescribeDBInstancesOutput.nodeNumber) &&
        Objects.equals(this.privateAddress, instanceForDescribeDBInstancesOutput.privateAddress) &&
        Objects.equals(this.projectName, instanceForDescribeDBInstancesOutput.projectName) &&
        Objects.equals(this.regionId, instanceForDescribeDBInstancesOutput.regionId) &&
        Objects.equals(this.serviceType, instanceForDescribeDBInstancesOutput.serviceType) &&
        Objects.equals(this.shardCapacity, instanceForDescribeDBInstancesOutput.shardCapacity) &&
        Objects.equals(this.shardNumber, instanceForDescribeDBInstancesOutput.shardNumber) &&
        Objects.equals(this.shardedCluster, instanceForDescribeDBInstancesOutput.shardedCluster) &&
        Objects.equals(this.status, instanceForDescribeDBInstancesOutput.status) &&
        Objects.equals(this.tags, instanceForDescribeDBInstancesOutput.tags) &&
        Objects.equals(this.VIP, instanceForDescribeDBInstancesOutput.VIP) &&
        Objects.equals(this.viPv6, instanceForDescribeDBInstancesOutput.viPv6) &&
        Objects.equals(this.vpcId, instanceForDescribeDBInstancesOutput.vpcId) &&
        Objects.equals(this.zoneIds, instanceForDescribeDBInstancesOutput.zoneIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, chargeType, createTime, dataLayout, deletionProtection, engineVersion, expiredTime, instanceClass, instanceId, instanceName, multiAZ, nodeNumber, privateAddress, projectName, regionId, serviceType, shardCapacity, shardNumber, shardedCluster, status, tags, VIP, viPv6, vpcId, zoneIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceForDescribeDBInstancesOutput {\n");
    
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    dataLayout: ").append(toIndentedString(dataLayout)).append("\n");
    sb.append("    deletionProtection: ").append(toIndentedString(deletionProtection)).append("\n");
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    instanceClass: ").append(toIndentedString(instanceClass)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    multiAZ: ").append(toIndentedString(multiAZ)).append("\n");
    sb.append("    nodeNumber: ").append(toIndentedString(nodeNumber)).append("\n");
    sb.append("    privateAddress: ").append(toIndentedString(privateAddress)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    shardCapacity: ").append(toIndentedString(shardCapacity)).append("\n");
    sb.append("    shardNumber: ").append(toIndentedString(shardNumber)).append("\n");
    sb.append("    shardedCluster: ").append(toIndentedString(shardedCluster)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    VIP: ").append(toIndentedString(VIP)).append("\n");
    sb.append("    viPv6: ").append(toIndentedString(viPv6)).append("\n");
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
