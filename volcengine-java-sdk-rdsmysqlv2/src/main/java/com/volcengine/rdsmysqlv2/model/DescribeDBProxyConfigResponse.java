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
import com.volcengine.rdsmysqlv2.model.CheckModifyDBProxyAllowedForDescribeDBProxyConfigOutput;
import com.volcengine.rdsmysqlv2.model.FeatureStateForDescribeDBProxyConfigOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDBProxyConfigResponse
 */



public class DescribeDBProxyConfigResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("BinlogDump")
  private Boolean binlogDump = null;

  @SerializedName("CheckModifyDBProxyAllowed")
  private CheckModifyDBProxyAllowedForDescribeDBProxyConfigOutput checkModifyDBProxyAllowed = null;

  @SerializedName("ConnectionPoolType")
  private String connectionPoolType = null;

  @SerializedName("DBProxyStatus")
  private String dbProxyStatus = null;

  @SerializedName("FeatureStates")
  private List<FeatureStateForDescribeDBProxyConfigOutput> featureStates = null;

  @SerializedName("GlobalReadOnly")
  private Boolean globalReadOnly = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  public DescribeDBProxyConfigResponse binlogDump(Boolean binlogDump) {
    this.binlogDump = binlogDump;
    return this;
  }

   /**
   * Get binlogDump
   * @return binlogDump
  **/
  @Schema(description = "")
  public Boolean isBinlogDump() {
    return binlogDump;
  }

  public void setBinlogDump(Boolean binlogDump) {
    this.binlogDump = binlogDump;
  }

  public DescribeDBProxyConfigResponse checkModifyDBProxyAllowed(CheckModifyDBProxyAllowedForDescribeDBProxyConfigOutput checkModifyDBProxyAllowed) {
    this.checkModifyDBProxyAllowed = checkModifyDBProxyAllowed;
    return this;
  }

   /**
   * Get checkModifyDBProxyAllowed
   * @return checkModifyDBProxyAllowed
  **/
  @Valid
  @Schema(description = "")
  public CheckModifyDBProxyAllowedForDescribeDBProxyConfigOutput getCheckModifyDBProxyAllowed() {
    return checkModifyDBProxyAllowed;
  }

  public void setCheckModifyDBProxyAllowed(CheckModifyDBProxyAllowedForDescribeDBProxyConfigOutput checkModifyDBProxyAllowed) {
    this.checkModifyDBProxyAllowed = checkModifyDBProxyAllowed;
  }

  public DescribeDBProxyConfigResponse connectionPoolType(String connectionPoolType) {
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

  public DescribeDBProxyConfigResponse dbProxyStatus(String dbProxyStatus) {
    this.dbProxyStatus = dbProxyStatus;
    return this;
  }

   /**
   * Get dbProxyStatus
   * @return dbProxyStatus
  **/
  @Schema(description = "")
  public String getDbProxyStatus() {
    return dbProxyStatus;
  }

  public void setDbProxyStatus(String dbProxyStatus) {
    this.dbProxyStatus = dbProxyStatus;
  }

  public DescribeDBProxyConfigResponse featureStates(List<FeatureStateForDescribeDBProxyConfigOutput> featureStates) {
    this.featureStates = featureStates;
    return this;
  }

  public DescribeDBProxyConfigResponse addFeatureStatesItem(FeatureStateForDescribeDBProxyConfigOutput featureStatesItem) {
    if (this.featureStates == null) {
      this.featureStates = new ArrayList<FeatureStateForDescribeDBProxyConfigOutput>();
    }
    this.featureStates.add(featureStatesItem);
    return this;
  }

   /**
   * Get featureStates
   * @return featureStates
  **/
  @Valid
  @Schema(description = "")
  public List<FeatureStateForDescribeDBProxyConfigOutput> getFeatureStates() {
    return featureStates;
  }

  public void setFeatureStates(List<FeatureStateForDescribeDBProxyConfigOutput> featureStates) {
    this.featureStates = featureStates;
  }

  public DescribeDBProxyConfigResponse globalReadOnly(Boolean globalReadOnly) {
    this.globalReadOnly = globalReadOnly;
    return this;
  }

   /**
   * Get globalReadOnly
   * @return globalReadOnly
  **/
  @Schema(description = "")
  public Boolean isGlobalReadOnly() {
    return globalReadOnly;
  }

  public void setGlobalReadOnly(Boolean globalReadOnly) {
    this.globalReadOnly = globalReadOnly;
  }

  public DescribeDBProxyConfigResponse instanceId(String instanceId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDBProxyConfigResponse describeDBProxyConfigResponse = (DescribeDBProxyConfigResponse) o;
    return Objects.equals(this.binlogDump, describeDBProxyConfigResponse.binlogDump) &&
        Objects.equals(this.checkModifyDBProxyAllowed, describeDBProxyConfigResponse.checkModifyDBProxyAllowed) &&
        Objects.equals(this.connectionPoolType, describeDBProxyConfigResponse.connectionPoolType) &&
        Objects.equals(this.dbProxyStatus, describeDBProxyConfigResponse.dbProxyStatus) &&
        Objects.equals(this.featureStates, describeDBProxyConfigResponse.featureStates) &&
        Objects.equals(this.globalReadOnly, describeDBProxyConfigResponse.globalReadOnly) &&
        Objects.equals(this.instanceId, describeDBProxyConfigResponse.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binlogDump, checkModifyDBProxyAllowed, connectionPoolType, dbProxyStatus, featureStates, globalReadOnly, instanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDBProxyConfigResponse {\n");
    
    sb.append("    binlogDump: ").append(toIndentedString(binlogDump)).append("\n");
    sb.append("    checkModifyDBProxyAllowed: ").append(toIndentedString(checkModifyDBProxyAllowed)).append("\n");
    sb.append("    connectionPoolType: ").append(toIndentedString(connectionPoolType)).append("\n");
    sb.append("    dbProxyStatus: ").append(toIndentedString(dbProxyStatus)).append("\n");
    sb.append("    featureStates: ").append(toIndentedString(featureStates)).append("\n");
    sb.append("    globalReadOnly: ").append(toIndentedString(globalReadOnly)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
