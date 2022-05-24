/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.directconnect.model;

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
 * DirectConnectConnectionForDescribeDirectConnectConnectionsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:27.325524+08:00[Asia/Shanghai]")
public class DirectConnectConnectionForDescribeDirectConnectConnectionsOutput {
  @SerializedName("AccessPoint")
  private String accessPoint = null;

  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("ConnectionType")
  private String connectionType = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DirectConnectConnectionId")
  private String directConnectConnectionId = null;

  @SerializedName("DirectConnectConnectionName")
  private String directConnectConnectionName = null;

  @SerializedName("Operator")
  private String operator = null;

  @SerializedName("ParentConnectionAccountId")
  private String parentConnectionAccountId = null;

  @SerializedName("ParentConnectionId")
  private String parentConnectionId = null;

  @SerializedName("PeerLocation")
  private String peerLocation = null;

  @SerializedName("PortType")
  private String portType = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VlanId")
  private Integer vlanId = null;

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput accessPoint(String accessPoint) {
    this.accessPoint = accessPoint;
    return this;
  }

   /**
   * Get accessPoint
   * @return accessPoint
  **/
  @Schema(description = "")
  public String getAccessPoint() {
    return accessPoint;
  }

  public void setAccessPoint(String accessPoint) {
    this.accessPoint = accessPoint;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @Schema(description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput connectionType(String connectionType) {
    this.connectionType = connectionType;
    return this;
  }

   /**
   * Get connectionType
   * @return connectionType
  **/
  @Schema(description = "")
  public String getConnectionType() {
    return connectionType;
  }

  public void setConnectionType(String connectionType) {
    this.connectionType = connectionType;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput creationTime(String creationTime) {
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

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput description(String description) {
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

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput directConnectConnectionId(String directConnectConnectionId) {
    this.directConnectConnectionId = directConnectConnectionId;
    return this;
  }

   /**
   * Get directConnectConnectionId
   * @return directConnectConnectionId
  **/
  @Schema(description = "")
  public String getDirectConnectConnectionId() {
    return directConnectConnectionId;
  }

  public void setDirectConnectConnectionId(String directConnectConnectionId) {
    this.directConnectConnectionId = directConnectConnectionId;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput directConnectConnectionName(String directConnectConnectionName) {
    this.directConnectConnectionName = directConnectConnectionName;
    return this;
  }

   /**
   * Get directConnectConnectionName
   * @return directConnectConnectionName
  **/
  @Schema(description = "")
  public String getDirectConnectConnectionName() {
    return directConnectConnectionName;
  }

  public void setDirectConnectConnectionName(String directConnectConnectionName) {
    this.directConnectConnectionName = directConnectConnectionName;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @Schema(description = "")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput parentConnectionAccountId(String parentConnectionAccountId) {
    this.parentConnectionAccountId = parentConnectionAccountId;
    return this;
  }

   /**
   * Get parentConnectionAccountId
   * @return parentConnectionAccountId
  **/
  @Schema(description = "")
  public String getParentConnectionAccountId() {
    return parentConnectionAccountId;
  }

  public void setParentConnectionAccountId(String parentConnectionAccountId) {
    this.parentConnectionAccountId = parentConnectionAccountId;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput parentConnectionId(String parentConnectionId) {
    this.parentConnectionId = parentConnectionId;
    return this;
  }

   /**
   * Get parentConnectionId
   * @return parentConnectionId
  **/
  @Schema(description = "")
  public String getParentConnectionId() {
    return parentConnectionId;
  }

  public void setParentConnectionId(String parentConnectionId) {
    this.parentConnectionId = parentConnectionId;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput peerLocation(String peerLocation) {
    this.peerLocation = peerLocation;
    return this;
  }

   /**
   * Get peerLocation
   * @return peerLocation
  **/
  @Schema(description = "")
  public String getPeerLocation() {
    return peerLocation;
  }

  public void setPeerLocation(String peerLocation) {
    this.peerLocation = peerLocation;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput portType(String portType) {
    this.portType = portType;
    return this;
  }

   /**
   * Get portType
   * @return portType
  **/
  @Schema(description = "")
  public String getPortType() {
    return portType;
  }

  public void setPortType(String portType) {
    this.portType = portType;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput status(String status) {
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

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput updateTime(String updateTime) {
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

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput vlanId(Integer vlanId) {
    this.vlanId = vlanId;
    return this;
  }

   /**
   * Get vlanId
   * @return vlanId
  **/
  @Schema(description = "")
  public Integer getVlanId() {
    return vlanId;
  }

  public void setVlanId(Integer vlanId) {
    this.vlanId = vlanId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectConnectConnectionForDescribeDirectConnectConnectionsOutput directConnectConnectionForDescribeDirectConnectConnectionsOutput = (DirectConnectConnectionForDescribeDirectConnectConnectionsOutput) o;
    return Objects.equals(this.accessPoint, directConnectConnectionForDescribeDirectConnectConnectionsOutput.accessPoint) &&
        Objects.equals(this.accountId, directConnectConnectionForDescribeDirectConnectConnectionsOutput.accountId) &&
        Objects.equals(this.bandwidth, directConnectConnectionForDescribeDirectConnectConnectionsOutput.bandwidth) &&
        Objects.equals(this.connectionType, directConnectConnectionForDescribeDirectConnectConnectionsOutput.connectionType) &&
        Objects.equals(this.creationTime, directConnectConnectionForDescribeDirectConnectConnectionsOutput.creationTime) &&
        Objects.equals(this.description, directConnectConnectionForDescribeDirectConnectConnectionsOutput.description) &&
        Objects.equals(this.directConnectConnectionId, directConnectConnectionForDescribeDirectConnectConnectionsOutput.directConnectConnectionId) &&
        Objects.equals(this.directConnectConnectionName, directConnectConnectionForDescribeDirectConnectConnectionsOutput.directConnectConnectionName) &&
        Objects.equals(this.operator, directConnectConnectionForDescribeDirectConnectConnectionsOutput.operator) &&
        Objects.equals(this.parentConnectionAccountId, directConnectConnectionForDescribeDirectConnectConnectionsOutput.parentConnectionAccountId) &&
        Objects.equals(this.parentConnectionId, directConnectConnectionForDescribeDirectConnectConnectionsOutput.parentConnectionId) &&
        Objects.equals(this.peerLocation, directConnectConnectionForDescribeDirectConnectConnectionsOutput.peerLocation) &&
        Objects.equals(this.portType, directConnectConnectionForDescribeDirectConnectConnectionsOutput.portType) &&
        Objects.equals(this.status, directConnectConnectionForDescribeDirectConnectConnectionsOutput.status) &&
        Objects.equals(this.updateTime, directConnectConnectionForDescribeDirectConnectConnectionsOutput.updateTime) &&
        Objects.equals(this.vlanId, directConnectConnectionForDescribeDirectConnectConnectionsOutput.vlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessPoint, accountId, bandwidth, connectionType, creationTime, description, directConnectConnectionId, directConnectConnectionName, operator, parentConnectionAccountId, parentConnectionId, peerLocation, portType, status, updateTime, vlanId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectConnectConnectionForDescribeDirectConnectConnectionsOutput {\n");
    
    sb.append("    accessPoint: ").append(toIndentedString(accessPoint)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    directConnectConnectionId: ").append(toIndentedString(directConnectConnectionId)).append("\n");
    sb.append("    directConnectConnectionName: ").append(toIndentedString(directConnectConnectionName)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    parentConnectionAccountId: ").append(toIndentedString(parentConnectionAccountId)).append("\n");
    sb.append("    parentConnectionId: ").append(toIndentedString(parentConnectionId)).append("\n");
    sb.append("    peerLocation: ").append(toIndentedString(peerLocation)).append("\n");
    sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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
