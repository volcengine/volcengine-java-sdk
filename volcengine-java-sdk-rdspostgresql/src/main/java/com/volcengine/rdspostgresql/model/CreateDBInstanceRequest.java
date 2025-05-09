/*
 * rds_postgresql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdspostgresql.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdspostgresql.model.ChargeInfoForCreateDBInstanceInput;
import com.volcengine.rdspostgresql.model.NodeInfoForCreateDBInstanceInput;
import com.volcengine.rdspostgresql.model.TagForCreateDBInstanceInput;
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
  @SerializedName("ChargeInfo")
  private ChargeInfoForCreateDBInstanceInput chargeInfo = null;

  @SerializedName("DBEngineVersion")
  private String dbEngineVersion = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("NodeInfo")
  private List<NodeInfoForCreateDBInstanceInput> nodeInfo = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("StorageSpace")
  private Integer storageSpace = null;

  @SerializedName("StorageType")
  private String storageType = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("Tags")
  private List<TagForCreateDBInstanceInput> tags = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public CreateDBInstanceRequest chargeInfo(ChargeInfoForCreateDBInstanceInput chargeInfo) {
    this.chargeInfo = chargeInfo;
    return this;
  }

   /**
   * Get chargeInfo
   * @return chargeInfo
  **/
  @Valid
  @Schema(description = "")
  public ChargeInfoForCreateDBInstanceInput getChargeInfo() {
    return chargeInfo;
  }

  public void setChargeInfo(ChargeInfoForCreateDBInstanceInput chargeInfo) {
    this.chargeInfo = chargeInfo;
  }

  public CreateDBInstanceRequest dbEngineVersion(String dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
    return this;
  }

   /**
   * Get dbEngineVersion
   * @return dbEngineVersion
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDbEngineVersion() {
    return dbEngineVersion;
  }

  public void setDbEngineVersion(String dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
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

  public CreateDBInstanceRequest nodeInfo(List<NodeInfoForCreateDBInstanceInput> nodeInfo) {
    this.nodeInfo = nodeInfo;
    return this;
  }

  public CreateDBInstanceRequest addNodeInfoItem(NodeInfoForCreateDBInstanceInput nodeInfoItem) {
    if (this.nodeInfo == null) {
      this.nodeInfo = new ArrayList<NodeInfoForCreateDBInstanceInput>();
    }
    this.nodeInfo.add(nodeInfoItem);
    return this;
  }

   /**
   * Get nodeInfo
   * @return nodeInfo
  **/
  @Valid
  @Schema(description = "")
  public List<NodeInfoForCreateDBInstanceInput> getNodeInfo() {
    return nodeInfo;
  }

  public void setNodeInfo(List<NodeInfoForCreateDBInstanceInput> nodeInfo) {
    this.nodeInfo = nodeInfo;
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

  public CreateDBInstanceRequest storageSpace(Integer storageSpace) {
    this.storageSpace = storageSpace;
    return this;
  }

   /**
   * Get storageSpace
   * @return storageSpace
  **/
  @Schema(description = "")
  public Integer getStorageSpace() {
    return storageSpace;
  }

  public void setStorageSpace(Integer storageSpace) {
    this.storageSpace = storageSpace;
  }

  public CreateDBInstanceRequest storageType(String storageType) {
    this.storageType = storageType;
    return this;
  }

   /**
   * Get storageType
   * @return storageType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getStorageType() {
    return storageType;
  }

  public void setStorageType(String storageType) {
    this.storageType = storageType;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDBInstanceRequest createDBInstanceRequest = (CreateDBInstanceRequest) o;
    return Objects.equals(this.chargeInfo, createDBInstanceRequest.chargeInfo) &&
        Objects.equals(this.dbEngineVersion, createDBInstanceRequest.dbEngineVersion) &&
        Objects.equals(this.instanceName, createDBInstanceRequest.instanceName) &&
        Objects.equals(this.nodeInfo, createDBInstanceRequest.nodeInfo) &&
        Objects.equals(this.projectName, createDBInstanceRequest.projectName) &&
        Objects.equals(this.storageSpace, createDBInstanceRequest.storageSpace) &&
        Objects.equals(this.storageType, createDBInstanceRequest.storageType) &&
        Objects.equals(this.subnetId, createDBInstanceRequest.subnetId) &&
        Objects.equals(this.tags, createDBInstanceRequest.tags) &&
        Objects.equals(this.vpcId, createDBInstanceRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeInfo, dbEngineVersion, instanceName, nodeInfo, projectName, storageSpace, storageType, subnetId, tags, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDBInstanceRequest {\n");
    
    sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
    sb.append("    dbEngineVersion: ").append(toIndentedString(dbEngineVersion)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
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
