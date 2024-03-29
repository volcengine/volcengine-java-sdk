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
import com.volcengine.vedbm.model.ZoneNodeInfoForModifyDBInstanceSpecInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyDBInstanceSpecRequest
 */


public class ModifyDBInstanceSpecRequest {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("NodeNumber")
  private Integer nodeNumber = null;

  @SerializedName("NodeSpec")
  private String nodeSpec = null;

  @SerializedName("ZoneNodeInfos")
  private List<ZoneNodeInfoForModifyDBInstanceSpecInput> zoneNodeInfos = null;

  public ModifyDBInstanceSpecRequest instanceId(String instanceId) {
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

  public ModifyDBInstanceSpecRequest nodeNumber(Integer nodeNumber) {
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

  public ModifyDBInstanceSpecRequest nodeSpec(String nodeSpec) {
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

  public ModifyDBInstanceSpecRequest zoneNodeInfos(List<ZoneNodeInfoForModifyDBInstanceSpecInput> zoneNodeInfos) {
    this.zoneNodeInfos = zoneNodeInfos;
    return this;
  }

  public ModifyDBInstanceSpecRequest addZoneNodeInfosItem(ZoneNodeInfoForModifyDBInstanceSpecInput zoneNodeInfosItem) {
    if (this.zoneNodeInfos == null) {
      this.zoneNodeInfos = new ArrayList<ZoneNodeInfoForModifyDBInstanceSpecInput>();
    }
    this.zoneNodeInfos.add(zoneNodeInfosItem);
    return this;
  }

   /**
   * Get zoneNodeInfos
   * @return zoneNodeInfos
  **/
  @Valid
  @Schema(description = "")
  public List<ZoneNodeInfoForModifyDBInstanceSpecInput> getZoneNodeInfos() {
    return zoneNodeInfos;
  }

  public void setZoneNodeInfos(List<ZoneNodeInfoForModifyDBInstanceSpecInput> zoneNodeInfos) {
    this.zoneNodeInfos = zoneNodeInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyDBInstanceSpecRequest modifyDBInstanceSpecRequest = (ModifyDBInstanceSpecRequest) o;
    return Objects.equals(this.instanceId, modifyDBInstanceSpecRequest.instanceId) &&
        Objects.equals(this.nodeNumber, modifyDBInstanceSpecRequest.nodeNumber) &&
        Objects.equals(this.nodeSpec, modifyDBInstanceSpecRequest.nodeSpec) &&
        Objects.equals(this.zoneNodeInfos, modifyDBInstanceSpecRequest.zoneNodeInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, nodeNumber, nodeSpec, zoneNodeInfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDBInstanceSpecRequest {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    nodeNumber: ").append(toIndentedString(nodeNumber)).append("\n");
    sb.append("    nodeSpec: ").append(toIndentedString(nodeSpec)).append("\n");
    sb.append("    zoneNodeInfos: ").append(toIndentedString(zoneNodeInfos)).append("\n");
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
