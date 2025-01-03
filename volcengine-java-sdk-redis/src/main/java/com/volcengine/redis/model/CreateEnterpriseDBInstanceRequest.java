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
import com.volcengine.redis.model.ConfigureNodeForCreateEnterpriseDBInstanceInput;
import com.volcengine.redis.model.TagForCreateEnterpriseDBInstanceInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateEnterpriseDBInstanceRequest
 */



public class CreateEnterpriseDBInstanceRequest {
  @SerializedName("AllowListIds")
  private List<String> allowListIds = null;

  @SerializedName("AutoRenew")
  private Boolean autoRenew = null;

  @SerializedName("ChargeType")
  private String chargeType = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("ConfigureNodes")
  private List<ConfigureNodeForCreateEnterpriseDBInstanceInput> configureNodes = null;

  @SerializedName("DataLayout")
  private String dataLayout = null;

  @SerializedName("DeletionProtection")
  private String deletionProtection = null;

  @SerializedName("FlashPerShard")
  private Integer flashPerShard = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("Modules")
  private List<String> modules = null;

  @SerializedName("MultiAZ")
  private String multiAZ = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("PurchaseMonths")
  private Integer purchaseMonths = null;

  @SerializedName("RamPerShard")
  private Integer ramPerShard = null;

  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("ShardNumber")
  private Integer shardNumber = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("Tags")
  private List<TagForCreateEnterpriseDBInstanceInput> tags = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public CreateEnterpriseDBInstanceRequest allowListIds(List<String> allowListIds) {
    this.allowListIds = allowListIds;
    return this;
  }

  public CreateEnterpriseDBInstanceRequest addAllowListIdsItem(String allowListIdsItem) {
    if (this.allowListIds == null) {
      this.allowListIds = new ArrayList<String>();
    }
    this.allowListIds.add(allowListIdsItem);
    return this;
  }

   /**
   * Get allowListIds
   * @return allowListIds
  **/
  @Schema(description = "")
  public List<String> getAllowListIds() {
    return allowListIds;
  }

  public void setAllowListIds(List<String> allowListIds) {
    this.allowListIds = allowListIds;
  }

  public CreateEnterpriseDBInstanceRequest autoRenew(Boolean autoRenew) {
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

  public CreateEnterpriseDBInstanceRequest chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  public CreateEnterpriseDBInstanceRequest clientToken(String clientToken) {
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

  public CreateEnterpriseDBInstanceRequest configureNodes(List<ConfigureNodeForCreateEnterpriseDBInstanceInput> configureNodes) {
    this.configureNodes = configureNodes;
    return this;
  }

  public CreateEnterpriseDBInstanceRequest addConfigureNodesItem(ConfigureNodeForCreateEnterpriseDBInstanceInput configureNodesItem) {
    if (this.configureNodes == null) {
      this.configureNodes = new ArrayList<ConfigureNodeForCreateEnterpriseDBInstanceInput>();
    }
    this.configureNodes.add(configureNodesItem);
    return this;
  }

   /**
   * Get configureNodes
   * @return configureNodes
  **/
  @Valid
  @Schema(description = "")
  public List<ConfigureNodeForCreateEnterpriseDBInstanceInput> getConfigureNodes() {
    return configureNodes;
  }

  public void setConfigureNodes(List<ConfigureNodeForCreateEnterpriseDBInstanceInput> configureNodes) {
    this.configureNodes = configureNodes;
  }

  public CreateEnterpriseDBInstanceRequest dataLayout(String dataLayout) {
    this.dataLayout = dataLayout;
    return this;
  }

   /**
   * Get dataLayout
   * @return dataLayout
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDataLayout() {
    return dataLayout;
  }

  public void setDataLayout(String dataLayout) {
    this.dataLayout = dataLayout;
  }

  public CreateEnterpriseDBInstanceRequest deletionProtection(String deletionProtection) {
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

  public CreateEnterpriseDBInstanceRequest flashPerShard(Integer flashPerShard) {
    this.flashPerShard = flashPerShard;
    return this;
  }

   /**
   * Get flashPerShard
   * @return flashPerShard
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getFlashPerShard() {
    return flashPerShard;
  }

  public void setFlashPerShard(Integer flashPerShard) {
    this.flashPerShard = flashPerShard;
  }

  public CreateEnterpriseDBInstanceRequest instanceName(String instanceName) {
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

  public CreateEnterpriseDBInstanceRequest modules(List<String> modules) {
    this.modules = modules;
    return this;
  }

  public CreateEnterpriseDBInstanceRequest addModulesItem(String modulesItem) {
    if (this.modules == null) {
      this.modules = new ArrayList<String>();
    }
    this.modules.add(modulesItem);
    return this;
  }

   /**
   * Get modules
   * @return modules
  **/
  @Schema(description = "")
  public List<String> getModules() {
    return modules;
  }

  public void setModules(List<String> modules) {
    this.modules = modules;
  }

  public CreateEnterpriseDBInstanceRequest multiAZ(String multiAZ) {
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

  public CreateEnterpriseDBInstanceRequest password(String password) {
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

  public CreateEnterpriseDBInstanceRequest projectName(String projectName) {
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

  public CreateEnterpriseDBInstanceRequest purchaseMonths(Integer purchaseMonths) {
    this.purchaseMonths = purchaseMonths;
    return this;
  }

   /**
   * Get purchaseMonths
   * @return purchaseMonths
  **/
  @Schema(description = "")
  public Integer getPurchaseMonths() {
    return purchaseMonths;
  }

  public void setPurchaseMonths(Integer purchaseMonths) {
    this.purchaseMonths = purchaseMonths;
  }

  public CreateEnterpriseDBInstanceRequest ramPerShard(Integer ramPerShard) {
    this.ramPerShard = ramPerShard;
    return this;
  }

   /**
   * Get ramPerShard
   * @return ramPerShard
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getRamPerShard() {
    return ramPerShard;
  }

  public void setRamPerShard(Integer ramPerShard) {
    this.ramPerShard = ramPerShard;
  }

  public CreateEnterpriseDBInstanceRequest regionId(String regionId) {
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

  public CreateEnterpriseDBInstanceRequest shardNumber(Integer shardNumber) {
    this.shardNumber = shardNumber;
    return this;
  }

   /**
   * Get shardNumber
   * @return shardNumber
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getShardNumber() {
    return shardNumber;
  }

  public void setShardNumber(Integer shardNumber) {
    this.shardNumber = shardNumber;
  }

  public CreateEnterpriseDBInstanceRequest subnetId(String subnetId) {
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

  public CreateEnterpriseDBInstanceRequest tags(List<TagForCreateEnterpriseDBInstanceInput> tags) {
    this.tags = tags;
    return this;
  }

  public CreateEnterpriseDBInstanceRequest addTagsItem(TagForCreateEnterpriseDBInstanceInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCreateEnterpriseDBInstanceInput>();
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
  public List<TagForCreateEnterpriseDBInstanceInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCreateEnterpriseDBInstanceInput> tags) {
    this.tags = tags;
  }

  public CreateEnterpriseDBInstanceRequest vpcId(String vpcId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEnterpriseDBInstanceRequest createEnterpriseDBInstanceRequest = (CreateEnterpriseDBInstanceRequest) o;
    return Objects.equals(this.allowListIds, createEnterpriseDBInstanceRequest.allowListIds) &&
        Objects.equals(this.autoRenew, createEnterpriseDBInstanceRequest.autoRenew) &&
        Objects.equals(this.chargeType, createEnterpriseDBInstanceRequest.chargeType) &&
        Objects.equals(this.clientToken, createEnterpriseDBInstanceRequest.clientToken) &&
        Objects.equals(this.configureNodes, createEnterpriseDBInstanceRequest.configureNodes) &&
        Objects.equals(this.dataLayout, createEnterpriseDBInstanceRequest.dataLayout) &&
        Objects.equals(this.deletionProtection, createEnterpriseDBInstanceRequest.deletionProtection) &&
        Objects.equals(this.flashPerShard, createEnterpriseDBInstanceRequest.flashPerShard) &&
        Objects.equals(this.instanceName, createEnterpriseDBInstanceRequest.instanceName) &&
        Objects.equals(this.modules, createEnterpriseDBInstanceRequest.modules) &&
        Objects.equals(this.multiAZ, createEnterpriseDBInstanceRequest.multiAZ) &&
        Objects.equals(this.password, createEnterpriseDBInstanceRequest.password) &&
        Objects.equals(this.projectName, createEnterpriseDBInstanceRequest.projectName) &&
        Objects.equals(this.purchaseMonths, createEnterpriseDBInstanceRequest.purchaseMonths) &&
        Objects.equals(this.ramPerShard, createEnterpriseDBInstanceRequest.ramPerShard) &&
        Objects.equals(this.regionId, createEnterpriseDBInstanceRequest.regionId) &&
        Objects.equals(this.shardNumber, createEnterpriseDBInstanceRequest.shardNumber) &&
        Objects.equals(this.subnetId, createEnterpriseDBInstanceRequest.subnetId) &&
        Objects.equals(this.tags, createEnterpriseDBInstanceRequest.tags) &&
        Objects.equals(this.vpcId, createEnterpriseDBInstanceRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowListIds, autoRenew, chargeType, clientToken, configureNodes, dataLayout, deletionProtection, flashPerShard, instanceName, modules, multiAZ, password, projectName, purchaseMonths, ramPerShard, regionId, shardNumber, subnetId, tags, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEnterpriseDBInstanceRequest {\n");
    
    sb.append("    allowListIds: ").append(toIndentedString(allowListIds)).append("\n");
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    configureNodes: ").append(toIndentedString(configureNodes)).append("\n");
    sb.append("    dataLayout: ").append(toIndentedString(dataLayout)).append("\n");
    sb.append("    deletionProtection: ").append(toIndentedString(deletionProtection)).append("\n");
    sb.append("    flashPerShard: ").append(toIndentedString(flashPerShard)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
    sb.append("    multiAZ: ").append(toIndentedString(multiAZ)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    purchaseMonths: ").append(toIndentedString(purchaseMonths)).append("\n");
    sb.append("    ramPerShard: ").append(toIndentedString(ramPerShard)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    shardNumber: ").append(toIndentedString(shardNumber)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
