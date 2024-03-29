/*
 * vepfs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vepfs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vepfs.model.NodeForDescribeFileSystemsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MountPointForDescribeFileSystemsOutput
 */


public class MountPointForDescribeFileSystemsOutput {
  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("FileSystemId")
  private String fileSystemId = null;

  @SerializedName("MountPointId")
  private String mountPointId = null;

  @SerializedName("MountPointName")
  private String mountPointName = null;

  @SerializedName("Nodes")
  private List<NodeForDescribeFileSystemsOutput> nodes = null;

  @SerializedName("SecurityGroupId")
  private String securityGroupId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("SubnetName")
  private String subnetName = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("VpcName")
  private String vpcName = null;

  public MountPointForDescribeFileSystemsOutput createTime(String createTime) {
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

  public MountPointForDescribeFileSystemsOutput fileSystemId(String fileSystemId) {
    this.fileSystemId = fileSystemId;
    return this;
  }

   /**
   * Get fileSystemId
   * @return fileSystemId
  **/
  @Schema(description = "")
  public String getFileSystemId() {
    return fileSystemId;
  }

  public void setFileSystemId(String fileSystemId) {
    this.fileSystemId = fileSystemId;
  }

  public MountPointForDescribeFileSystemsOutput mountPointId(String mountPointId) {
    this.mountPointId = mountPointId;
    return this;
  }

   /**
   * Get mountPointId
   * @return mountPointId
  **/
  @Schema(description = "")
  public String getMountPointId() {
    return mountPointId;
  }

  public void setMountPointId(String mountPointId) {
    this.mountPointId = mountPointId;
  }

  public MountPointForDescribeFileSystemsOutput mountPointName(String mountPointName) {
    this.mountPointName = mountPointName;
    return this;
  }

   /**
   * Get mountPointName
   * @return mountPointName
  **/
  @Schema(description = "")
  public String getMountPointName() {
    return mountPointName;
  }

  public void setMountPointName(String mountPointName) {
    this.mountPointName = mountPointName;
  }

  public MountPointForDescribeFileSystemsOutput nodes(List<NodeForDescribeFileSystemsOutput> nodes) {
    this.nodes = nodes;
    return this;
  }

  public MountPointForDescribeFileSystemsOutput addNodesItem(NodeForDescribeFileSystemsOutput nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<NodeForDescribeFileSystemsOutput>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @Valid
  @Schema(description = "")
  public List<NodeForDescribeFileSystemsOutput> getNodes() {
    return nodes;
  }

  public void setNodes(List<NodeForDescribeFileSystemsOutput> nodes) {
    this.nodes = nodes;
  }

  public MountPointForDescribeFileSystemsOutput securityGroupId(String securityGroupId) {
    this.securityGroupId = securityGroupId;
    return this;
  }

   /**
   * Get securityGroupId
   * @return securityGroupId
  **/
  @Schema(description = "")
  public String getSecurityGroupId() {
    return securityGroupId;
  }

  public void setSecurityGroupId(String securityGroupId) {
    this.securityGroupId = securityGroupId;
  }

  public MountPointForDescribeFileSystemsOutput status(String status) {
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

  public MountPointForDescribeFileSystemsOutput subnetId(String subnetId) {
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

  public MountPointForDescribeFileSystemsOutput subnetName(String subnetName) {
    this.subnetName = subnetName;
    return this;
  }

   /**
   * Get subnetName
   * @return subnetName
  **/
  @Schema(description = "")
  public String getSubnetName() {
    return subnetName;
  }

  public void setSubnetName(String subnetName) {
    this.subnetName = subnetName;
  }

  public MountPointForDescribeFileSystemsOutput vpcId(String vpcId) {
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

  public MountPointForDescribeFileSystemsOutput vpcName(String vpcName) {
    this.vpcName = vpcName;
    return this;
  }

   /**
   * Get vpcName
   * @return vpcName
  **/
  @Schema(description = "")
  public String getVpcName() {
    return vpcName;
  }

  public void setVpcName(String vpcName) {
    this.vpcName = vpcName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MountPointForDescribeFileSystemsOutput mountPointForDescribeFileSystemsOutput = (MountPointForDescribeFileSystemsOutput) o;
    return Objects.equals(this.createTime, mountPointForDescribeFileSystemsOutput.createTime) &&
        Objects.equals(this.fileSystemId, mountPointForDescribeFileSystemsOutput.fileSystemId) &&
        Objects.equals(this.mountPointId, mountPointForDescribeFileSystemsOutput.mountPointId) &&
        Objects.equals(this.mountPointName, mountPointForDescribeFileSystemsOutput.mountPointName) &&
        Objects.equals(this.nodes, mountPointForDescribeFileSystemsOutput.nodes) &&
        Objects.equals(this.securityGroupId, mountPointForDescribeFileSystemsOutput.securityGroupId) &&
        Objects.equals(this.status, mountPointForDescribeFileSystemsOutput.status) &&
        Objects.equals(this.subnetId, mountPointForDescribeFileSystemsOutput.subnetId) &&
        Objects.equals(this.subnetName, mountPointForDescribeFileSystemsOutput.subnetName) &&
        Objects.equals(this.vpcId, mountPointForDescribeFileSystemsOutput.vpcId) &&
        Objects.equals(this.vpcName, mountPointForDescribeFileSystemsOutput.vpcName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, fileSystemId, mountPointId, mountPointName, nodes, securityGroupId, status, subnetId, subnetName, vpcId, vpcName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountPointForDescribeFileSystemsOutput {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    fileSystemId: ").append(toIndentedString(fileSystemId)).append("\n");
    sb.append("    mountPointId: ").append(toIndentedString(mountPointId)).append("\n");
    sb.append("    mountPointName: ").append(toIndentedString(mountPointName)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
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
