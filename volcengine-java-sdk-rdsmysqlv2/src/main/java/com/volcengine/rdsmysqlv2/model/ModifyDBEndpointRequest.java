/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysqlv2.model.ReadOnlyNodeWeightForModifyDBEndpointInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyDBEndpointRequest
 */



public class ModifyDBEndpointRequest {
  @SerializedName("AutoAddNewNodes")
  private Boolean autoAddNewNodes = null;

  @SerializedName("ConnectionPoolType")
  private String connectionPoolType = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("EndpointId")
  private String endpointId = null;

  @SerializedName("EndpointName")
  private String endpointName = null;

  @SerializedName("IdleConnectionReclaim")
  private Boolean idleConnectionReclaim = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("MultiStatementsMode")
  private String multiStatementsMode = null;

  @SerializedName("Nodes")
  private String nodes = null;

  @SerializedName("ReadOnlyNodeDistributionType")
  private String readOnlyNodeDistributionType = null;

  @SerializedName("ReadOnlyNodeMaxDelayTime")
  private Integer readOnlyNodeMaxDelayTime = null;

  @SerializedName("ReadOnlyNodeWeight")
  private List<ReadOnlyNodeWeightForModifyDBEndpointInput> readOnlyNodeWeight = null;

  @SerializedName("ReadWriteMode")
  private String readWriteMode = null;

  @SerializedName("ReadWriteSpliting")
  private Boolean readWriteSpliting = null;

  public ModifyDBEndpointRequest autoAddNewNodes(Boolean autoAddNewNodes) {
    this.autoAddNewNodes = autoAddNewNodes;
    return this;
  }

   /**
   * Get autoAddNewNodes
   * @return autoAddNewNodes
  **/
  @Schema(description = "")
  public Boolean isAutoAddNewNodes() {
    return autoAddNewNodes;
  }

  public void setAutoAddNewNodes(Boolean autoAddNewNodes) {
    this.autoAddNewNodes = autoAddNewNodes;
  }

  public ModifyDBEndpointRequest connectionPoolType(String connectionPoolType) {
    this.connectionPoolType = connectionPoolType;
    return this;
  }

   /**
   * Get connectionPoolType
   * @return connectionPoolType
  **/
  @Schema(description = "")
  public String getConnectionPoolType() {
    return connectionPoolType;
  }

  public void setConnectionPoolType(String connectionPoolType) {
    this.connectionPoolType = connectionPoolType;
  }

  public ModifyDBEndpointRequest description(String description) {
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

  public ModifyDBEndpointRequest endpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

   /**
   * Get endpointId
   * @return endpointId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }

  public ModifyDBEndpointRequest endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * Get endpointName
   * @return endpointName
  **/
  @Schema(description = "")
  public String getEndpointName() {
    return endpointName;
  }

  public void setEndpointName(String endpointName) {
    this.endpointName = endpointName;
  }

  public ModifyDBEndpointRequest idleConnectionReclaim(Boolean idleConnectionReclaim) {
    this.idleConnectionReclaim = idleConnectionReclaim;
    return this;
  }

   /**
   * Get idleConnectionReclaim
   * @return idleConnectionReclaim
  **/
  @Schema(description = "")
  public Boolean isIdleConnectionReclaim() {
    return idleConnectionReclaim;
  }

  public void setIdleConnectionReclaim(Boolean idleConnectionReclaim) {
    this.idleConnectionReclaim = idleConnectionReclaim;
  }

  public ModifyDBEndpointRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ModifyDBEndpointRequest multiStatementsMode(String multiStatementsMode) {
    this.multiStatementsMode = multiStatementsMode;
    return this;
  }

   /**
   * Get multiStatementsMode
   * @return multiStatementsMode
  **/
  @Schema(description = "")
  public String getMultiStatementsMode() {
    return multiStatementsMode;
  }

  public void setMultiStatementsMode(String multiStatementsMode) {
    this.multiStatementsMode = multiStatementsMode;
  }

  public ModifyDBEndpointRequest nodes(String nodes) {
    this.nodes = nodes;
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @Schema(description = "")
  public String getNodes() {
    return nodes;
  }

  public void setNodes(String nodes) {
    this.nodes = nodes;
  }

  public ModifyDBEndpointRequest readOnlyNodeDistributionType(String readOnlyNodeDistributionType) {
    this.readOnlyNodeDistributionType = readOnlyNodeDistributionType;
    return this;
  }

   /**
   * Get readOnlyNodeDistributionType
   * @return readOnlyNodeDistributionType
  **/
  @Schema(description = "")
  public String getReadOnlyNodeDistributionType() {
    return readOnlyNodeDistributionType;
  }

  public void setReadOnlyNodeDistributionType(String readOnlyNodeDistributionType) {
    this.readOnlyNodeDistributionType = readOnlyNodeDistributionType;
  }

  public ModifyDBEndpointRequest readOnlyNodeMaxDelayTime(Integer readOnlyNodeMaxDelayTime) {
    this.readOnlyNodeMaxDelayTime = readOnlyNodeMaxDelayTime;
    return this;
  }

   /**
   * Get readOnlyNodeMaxDelayTime
   * @return readOnlyNodeMaxDelayTime
  **/
  @Schema(description = "")
  public Integer getReadOnlyNodeMaxDelayTime() {
    return readOnlyNodeMaxDelayTime;
  }

  public void setReadOnlyNodeMaxDelayTime(Integer readOnlyNodeMaxDelayTime) {
    this.readOnlyNodeMaxDelayTime = readOnlyNodeMaxDelayTime;
  }

  public ModifyDBEndpointRequest readOnlyNodeWeight(List<ReadOnlyNodeWeightForModifyDBEndpointInput> readOnlyNodeWeight) {
    this.readOnlyNodeWeight = readOnlyNodeWeight;
    return this;
  }

  public ModifyDBEndpointRequest addReadOnlyNodeWeightItem(ReadOnlyNodeWeightForModifyDBEndpointInput readOnlyNodeWeightItem) {
    if (this.readOnlyNodeWeight == null) {
      this.readOnlyNodeWeight = new ArrayList<ReadOnlyNodeWeightForModifyDBEndpointInput>();
    }
    this.readOnlyNodeWeight.add(readOnlyNodeWeightItem);
    return this;
  }

   /**
   * Get readOnlyNodeWeight
   * @return readOnlyNodeWeight
  **/
  @Valid
  @Schema(description = "")
  public List<ReadOnlyNodeWeightForModifyDBEndpointInput> getReadOnlyNodeWeight() {
    return readOnlyNodeWeight;
  }

  public void setReadOnlyNodeWeight(List<ReadOnlyNodeWeightForModifyDBEndpointInput> readOnlyNodeWeight) {
    this.readOnlyNodeWeight = readOnlyNodeWeight;
  }

  public ModifyDBEndpointRequest readWriteMode(String readWriteMode) {
    this.readWriteMode = readWriteMode;
    return this;
  }

   /**
   * Get readWriteMode
   * @return readWriteMode
  **/
  @Schema(description = "")
  public String getReadWriteMode() {
    return readWriteMode;
  }

  public void setReadWriteMode(String readWriteMode) {
    this.readWriteMode = readWriteMode;
  }

  public ModifyDBEndpointRequest readWriteSpliting(Boolean readWriteSpliting) {
    this.readWriteSpliting = readWriteSpliting;
    return this;
  }

   /**
   * Get readWriteSpliting
   * @return readWriteSpliting
  **/
  @Schema(description = "")
  public Boolean isReadWriteSpliting() {
    return readWriteSpliting;
  }

  public void setReadWriteSpliting(Boolean readWriteSpliting) {
    this.readWriteSpliting = readWriteSpliting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyDBEndpointRequest modifyDBEndpointRequest = (ModifyDBEndpointRequest) o;
    return Objects.equals(this.autoAddNewNodes, modifyDBEndpointRequest.autoAddNewNodes) &&
        Objects.equals(this.connectionPoolType, modifyDBEndpointRequest.connectionPoolType) &&
        Objects.equals(this.description, modifyDBEndpointRequest.description) &&
        Objects.equals(this.endpointId, modifyDBEndpointRequest.endpointId) &&
        Objects.equals(this.endpointName, modifyDBEndpointRequest.endpointName) &&
        Objects.equals(this.idleConnectionReclaim, modifyDBEndpointRequest.idleConnectionReclaim) &&
        Objects.equals(this.instanceId, modifyDBEndpointRequest.instanceId) &&
        Objects.equals(this.multiStatementsMode, modifyDBEndpointRequest.multiStatementsMode) &&
        Objects.equals(this.nodes, modifyDBEndpointRequest.nodes) &&
        Objects.equals(this.readOnlyNodeDistributionType, modifyDBEndpointRequest.readOnlyNodeDistributionType) &&
        Objects.equals(this.readOnlyNodeMaxDelayTime, modifyDBEndpointRequest.readOnlyNodeMaxDelayTime) &&
        Objects.equals(this.readOnlyNodeWeight, modifyDBEndpointRequest.readOnlyNodeWeight) &&
        Objects.equals(this.readWriteMode, modifyDBEndpointRequest.readWriteMode) &&
        Objects.equals(this.readWriteSpliting, modifyDBEndpointRequest.readWriteSpliting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoAddNewNodes, connectionPoolType, description, endpointId, endpointName, idleConnectionReclaim, instanceId, multiStatementsMode, nodes, readOnlyNodeDistributionType, readOnlyNodeMaxDelayTime, readOnlyNodeWeight, readWriteMode, readWriteSpliting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDBEndpointRequest {\n");
    
    sb.append("    autoAddNewNodes: ").append(toIndentedString(autoAddNewNodes)).append("\n");
    sb.append("    connectionPoolType: ").append(toIndentedString(connectionPoolType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("    idleConnectionReclaim: ").append(toIndentedString(idleConnectionReclaim)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    multiStatementsMode: ").append(toIndentedString(multiStatementsMode)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    readOnlyNodeDistributionType: ").append(toIndentedString(readOnlyNodeDistributionType)).append("\n");
    sb.append("    readOnlyNodeMaxDelayTime: ").append(toIndentedString(readOnlyNodeMaxDelayTime)).append("\n");
    sb.append("    readOnlyNodeWeight: ").append(toIndentedString(readOnlyNodeWeight)).append("\n");
    sb.append("    readWriteMode: ").append(toIndentedString(readWriteMode)).append("\n");
    sb.append("    readWriteSpliting: ").append(toIndentedString(readWriteSpliting)).append("\n");
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
