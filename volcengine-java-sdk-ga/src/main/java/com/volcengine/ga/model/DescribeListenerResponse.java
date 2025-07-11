/*
 * ga
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ga.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.ga.model.FixedSourceReturnForDescribeListenerOutput;
import com.volcengine.ga.model.IPAccessForDescribeListenerOutput;
import com.volcengine.ga.model.PortRangeForDescribeListenerOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeListenerResponse
 */



public class DescribeListenerResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AcceleratorId")
  private String acceleratorId = null;

  @SerializedName("AccountID")
  private String accountID = null;

  @SerializedName("BackupEndpointGroupIds")
  private List<String> backupEndpointGroupIds = null;

  @SerializedName("CreateTime")
  private Integer createTime = null;

  @SerializedName("DisableIsolateTCPNullConn")
  private Boolean disableIsolateTCPNullConn = null;

  @SerializedName("DisablePreConnect")
  private Boolean disablePreConnect = null;

  @SerializedName("EnableAffinity")
  private Boolean enableAffinity = null;

  @SerializedName("EndpointGroupIds")
  private List<String> endpointGroupIds = null;

  @SerializedName("FixedSourceReturn")
  private FixedSourceReturnForDescribeListenerOutput fixedSourceReturn = null;

  @SerializedName("IPAccess")
  private IPAccessForDescribeListenerOutput ipAccess = null;

  @SerializedName("ListenerId")
  private String listenerId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("PortRanges")
  private List<PortRangeForDescribeListenerOutput> portRanges = null;

  @SerializedName("Protocol")
  private String protocol = null;

  @SerializedName("State")
  private String state = null;

  public DescribeListenerResponse acceleratorId(String acceleratorId) {
    this.acceleratorId = acceleratorId;
    return this;
  }

   /**
   * Get acceleratorId
   * @return acceleratorId
  **/
  @Schema(description = "")
  public String getAcceleratorId() {
    return acceleratorId;
  }

  public void setAcceleratorId(String acceleratorId) {
    this.acceleratorId = acceleratorId;
  }

  public DescribeListenerResponse accountID(String accountID) {
    this.accountID = accountID;
    return this;
  }

   /**
   * Get accountID
   * @return accountID
  **/
  @Schema(description = "")
  public String getAccountID() {
    return accountID;
  }

  public void setAccountID(String accountID) {
    this.accountID = accountID;
  }

  public DescribeListenerResponse backupEndpointGroupIds(List<String> backupEndpointGroupIds) {
    this.backupEndpointGroupIds = backupEndpointGroupIds;
    return this;
  }

  public DescribeListenerResponse addBackupEndpointGroupIdsItem(String backupEndpointGroupIdsItem) {
    if (this.backupEndpointGroupIds == null) {
      this.backupEndpointGroupIds = new ArrayList<String>();
    }
    this.backupEndpointGroupIds.add(backupEndpointGroupIdsItem);
    return this;
  }

   /**
   * Get backupEndpointGroupIds
   * @return backupEndpointGroupIds
  **/
  @Schema(description = "")
  public List<String> getBackupEndpointGroupIds() {
    return backupEndpointGroupIds;
  }

  public void setBackupEndpointGroupIds(List<String> backupEndpointGroupIds) {
    this.backupEndpointGroupIds = backupEndpointGroupIds;
  }

  public DescribeListenerResponse createTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public Integer getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }

  public DescribeListenerResponse disableIsolateTCPNullConn(Boolean disableIsolateTCPNullConn) {
    this.disableIsolateTCPNullConn = disableIsolateTCPNullConn;
    return this;
  }

   /**
   * Get disableIsolateTCPNullConn
   * @return disableIsolateTCPNullConn
  **/
  @Schema(description = "")
  public Boolean isDisableIsolateTCPNullConn() {
    return disableIsolateTCPNullConn;
  }

  public void setDisableIsolateTCPNullConn(Boolean disableIsolateTCPNullConn) {
    this.disableIsolateTCPNullConn = disableIsolateTCPNullConn;
  }

  public DescribeListenerResponse disablePreConnect(Boolean disablePreConnect) {
    this.disablePreConnect = disablePreConnect;
    return this;
  }

   /**
   * Get disablePreConnect
   * @return disablePreConnect
  **/
  @Schema(description = "")
  public Boolean isDisablePreConnect() {
    return disablePreConnect;
  }

  public void setDisablePreConnect(Boolean disablePreConnect) {
    this.disablePreConnect = disablePreConnect;
  }

  public DescribeListenerResponse enableAffinity(Boolean enableAffinity) {
    this.enableAffinity = enableAffinity;
    return this;
  }

   /**
   * Get enableAffinity
   * @return enableAffinity
  **/
  @Schema(description = "")
  public Boolean isEnableAffinity() {
    return enableAffinity;
  }

  public void setEnableAffinity(Boolean enableAffinity) {
    this.enableAffinity = enableAffinity;
  }

  public DescribeListenerResponse endpointGroupIds(List<String> endpointGroupIds) {
    this.endpointGroupIds = endpointGroupIds;
    return this;
  }

  public DescribeListenerResponse addEndpointGroupIdsItem(String endpointGroupIdsItem) {
    if (this.endpointGroupIds == null) {
      this.endpointGroupIds = new ArrayList<String>();
    }
    this.endpointGroupIds.add(endpointGroupIdsItem);
    return this;
  }

   /**
   * Get endpointGroupIds
   * @return endpointGroupIds
  **/
  @Schema(description = "")
  public List<String> getEndpointGroupIds() {
    return endpointGroupIds;
  }

  public void setEndpointGroupIds(List<String> endpointGroupIds) {
    this.endpointGroupIds = endpointGroupIds;
  }

  public DescribeListenerResponse fixedSourceReturn(FixedSourceReturnForDescribeListenerOutput fixedSourceReturn) {
    this.fixedSourceReturn = fixedSourceReturn;
    return this;
  }

   /**
   * Get fixedSourceReturn
   * @return fixedSourceReturn
  **/
  @Valid
  @Schema(description = "")
  public FixedSourceReturnForDescribeListenerOutput getFixedSourceReturn() {
    return fixedSourceReturn;
  }

  public void setFixedSourceReturn(FixedSourceReturnForDescribeListenerOutput fixedSourceReturn) {
    this.fixedSourceReturn = fixedSourceReturn;
  }

  public DescribeListenerResponse ipAccess(IPAccessForDescribeListenerOutput ipAccess) {
    this.ipAccess = ipAccess;
    return this;
  }

   /**
   * Get ipAccess
   * @return ipAccess
  **/
  @Valid
  @Schema(description = "")
  public IPAccessForDescribeListenerOutput getIpAccess() {
    return ipAccess;
  }

  public void setIpAccess(IPAccessForDescribeListenerOutput ipAccess) {
    this.ipAccess = ipAccess;
  }

  public DescribeListenerResponse listenerId(String listenerId) {
    this.listenerId = listenerId;
    return this;
  }

   /**
   * Get listenerId
   * @return listenerId
  **/
  @Schema(description = "")
  public String getListenerId() {
    return listenerId;
  }

  public void setListenerId(String listenerId) {
    this.listenerId = listenerId;
  }

  public DescribeListenerResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DescribeListenerResponse portRanges(List<PortRangeForDescribeListenerOutput> portRanges) {
    this.portRanges = portRanges;
    return this;
  }

  public DescribeListenerResponse addPortRangesItem(PortRangeForDescribeListenerOutput portRangesItem) {
    if (this.portRanges == null) {
      this.portRanges = new ArrayList<PortRangeForDescribeListenerOutput>();
    }
    this.portRanges.add(portRangesItem);
    return this;
  }

   /**
   * Get portRanges
   * @return portRanges
  **/
  @Valid
  @Schema(description = "")
  public List<PortRangeForDescribeListenerOutput> getPortRanges() {
    return portRanges;
  }

  public void setPortRanges(List<PortRangeForDescribeListenerOutput> portRanges) {
    this.portRanges = portRanges;
  }

  public DescribeListenerResponse protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public DescribeListenerResponse state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeListenerResponse describeListenerResponse = (DescribeListenerResponse) o;
    return Objects.equals(this.acceleratorId, describeListenerResponse.acceleratorId) &&
        Objects.equals(this.accountID, describeListenerResponse.accountID) &&
        Objects.equals(this.backupEndpointGroupIds, describeListenerResponse.backupEndpointGroupIds) &&
        Objects.equals(this.createTime, describeListenerResponse.createTime) &&
        Objects.equals(this.disableIsolateTCPNullConn, describeListenerResponse.disableIsolateTCPNullConn) &&
        Objects.equals(this.disablePreConnect, describeListenerResponse.disablePreConnect) &&
        Objects.equals(this.enableAffinity, describeListenerResponse.enableAffinity) &&
        Objects.equals(this.endpointGroupIds, describeListenerResponse.endpointGroupIds) &&
        Objects.equals(this.fixedSourceReturn, describeListenerResponse.fixedSourceReturn) &&
        Objects.equals(this.ipAccess, describeListenerResponse.ipAccess) &&
        Objects.equals(this.listenerId, describeListenerResponse.listenerId) &&
        Objects.equals(this.name, describeListenerResponse.name) &&
        Objects.equals(this.portRanges, describeListenerResponse.portRanges) &&
        Objects.equals(this.protocol, describeListenerResponse.protocol) &&
        Objects.equals(this.state, describeListenerResponse.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceleratorId, accountID, backupEndpointGroupIds, createTime, disableIsolateTCPNullConn, disablePreConnect, enableAffinity, endpointGroupIds, fixedSourceReturn, ipAccess, listenerId, name, portRanges, protocol, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeListenerResponse {\n");
    
    sb.append("    acceleratorId: ").append(toIndentedString(acceleratorId)).append("\n");
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    backupEndpointGroupIds: ").append(toIndentedString(backupEndpointGroupIds)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    disableIsolateTCPNullConn: ").append(toIndentedString(disableIsolateTCPNullConn)).append("\n");
    sb.append("    disablePreConnect: ").append(toIndentedString(disablePreConnect)).append("\n");
    sb.append("    enableAffinity: ").append(toIndentedString(enableAffinity)).append("\n");
    sb.append("    endpointGroupIds: ").append(toIndentedString(endpointGroupIds)).append("\n");
    sb.append("    fixedSourceReturn: ").append(toIndentedString(fixedSourceReturn)).append("\n");
    sb.append("    ipAccess: ").append(toIndentedString(ipAccess)).append("\n");
    sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    portRanges: ").append(toIndentedString(portRanges)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
