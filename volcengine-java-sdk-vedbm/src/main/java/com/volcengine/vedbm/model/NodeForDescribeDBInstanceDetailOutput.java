/*
 * vedbm
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vedbm.model;

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
 * NodeForDescribeDBInstanceDetailOutput
 */


public class NodeForDescribeDBInstanceDetailOutput {
  @SerializedName("Memory")
  private Integer memory = null;

  @SerializedName("NodeId")
  private String nodeId = null;

  @SerializedName("NodeSpec")
  private String nodeSpec = null;

  @SerializedName("NodeType")
  private String nodeType = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  @SerializedName("vCPU")
  private Integer vCPU = null;

  public NodeForDescribeDBInstanceDetailOutput memory(Integer memory) {
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @Schema(description = "")
  public Integer getMemory() {
    return memory;
  }

  public void setMemory(Integer memory) {
    this.memory = memory;
  }

  public NodeForDescribeDBInstanceDetailOutput nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @Schema(description = "")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public NodeForDescribeDBInstanceDetailOutput nodeSpec(String nodeSpec) {
    this.nodeSpec = nodeSpec;
    return this;
  }

   /**
   * Get nodeSpec
   * @return nodeSpec
  **/
  @Schema(description = "")
  public String getNodeSpec() {
    return nodeSpec;
  }

  public void setNodeSpec(String nodeSpec) {
    this.nodeSpec = nodeSpec;
  }

  public NodeForDescribeDBInstanceDetailOutput nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @Schema(description = "")
  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public NodeForDescribeDBInstanceDetailOutput zoneId(String zoneId) {
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

  public NodeForDescribeDBInstanceDetailOutput vCPU(Integer vCPU) {
    this.vCPU = vCPU;
    return this;
  }

   /**
   * Get vCPU
   * @return vCPU
  **/
  @Schema(description = "")
  public Integer getVCPU() {
    return vCPU;
  }

  public void setVCPU(Integer vCPU) {
    this.vCPU = vCPU;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeForDescribeDBInstanceDetailOutput nodeForDescribeDBInstanceDetailOutput = (NodeForDescribeDBInstanceDetailOutput) o;
    return Objects.equals(this.memory, nodeForDescribeDBInstanceDetailOutput.memory) &&
        Objects.equals(this.nodeId, nodeForDescribeDBInstanceDetailOutput.nodeId) &&
        Objects.equals(this.nodeSpec, nodeForDescribeDBInstanceDetailOutput.nodeSpec) &&
        Objects.equals(this.nodeType, nodeForDescribeDBInstanceDetailOutput.nodeType) &&
        Objects.equals(this.zoneId, nodeForDescribeDBInstanceDetailOutput.zoneId) &&
        Objects.equals(this.vCPU, nodeForDescribeDBInstanceDetailOutput.vCPU);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memory, nodeId, nodeSpec, nodeType, zoneId, vCPU);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeForDescribeDBInstanceDetailOutput {\n");
    
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    nodeSpec: ").append(toIndentedString(nodeSpec)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    vCPU: ").append(toIndentedString(vCPU)).append("\n");
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