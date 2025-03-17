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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * InstanceSpecForDescribeDBInstanceSpecsOutput
 */



public class InstanceSpecForDescribeDBInstanceSpecsOutput {
  @SerializedName("Connection")
  private Integer connection = null;

  @SerializedName("DBEngineVersion")
  private String dbEngineVersion = null;

  @SerializedName("Memory")
  private Integer memory = null;

  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("SpecCode")
  private String specCode = null;

  @SerializedName("SpecStatus")
  private String specStatus = null;

  @SerializedName("VCPU")
  private Integer VCPU = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public InstanceSpecForDescribeDBInstanceSpecsOutput connection(Integer connection) {
    this.connection = connection;
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  @Schema(description = "")
  public Integer getConnection() {
    return connection;
  }

  public void setConnection(Integer connection) {
    this.connection = connection;
  }

  public InstanceSpecForDescribeDBInstanceSpecsOutput dbEngineVersion(String dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
    return this;
  }

   /**
   * Get dbEngineVersion
   * @return dbEngineVersion
  **/
  @Schema(description = "")
  public String getDbEngineVersion() {
    return dbEngineVersion;
  }

  public void setDbEngineVersion(String dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
  }

  public InstanceSpecForDescribeDBInstanceSpecsOutput memory(Integer memory) {
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

  public InstanceSpecForDescribeDBInstanceSpecsOutput regionId(String regionId) {
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

  public InstanceSpecForDescribeDBInstanceSpecsOutput specCode(String specCode) {
    this.specCode = specCode;
    return this;
  }

   /**
   * Get specCode
   * @return specCode
  **/
  @Schema(description = "")
  public String getSpecCode() {
    return specCode;
  }

  public void setSpecCode(String specCode) {
    this.specCode = specCode;
  }

  public InstanceSpecForDescribeDBInstanceSpecsOutput specStatus(String specStatus) {
    this.specStatus = specStatus;
    return this;
  }

   /**
   * Get specStatus
   * @return specStatus
  **/
  @Schema(description = "")
  public String getSpecStatus() {
    return specStatus;
  }

  public void setSpecStatus(String specStatus) {
    this.specStatus = specStatus;
  }

  public InstanceSpecForDescribeDBInstanceSpecsOutput VCPU(Integer VCPU) {
    this.VCPU = VCPU;
    return this;
  }

   /**
   * Get VCPU
   * @return VCPU
  **/
  @Schema(description = "")
  public Integer getVCPU() {
    return VCPU;
  }

  public void setVCPU(Integer VCPU) {
    this.VCPU = VCPU;
  }

  public InstanceSpecForDescribeDBInstanceSpecsOutput zoneId(String zoneId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceSpecForDescribeDBInstanceSpecsOutput instanceSpecForDescribeDBInstanceSpecsOutput = (InstanceSpecForDescribeDBInstanceSpecsOutput) o;
    return Objects.equals(this.connection, instanceSpecForDescribeDBInstanceSpecsOutput.connection) &&
        Objects.equals(this.dbEngineVersion, instanceSpecForDescribeDBInstanceSpecsOutput.dbEngineVersion) &&
        Objects.equals(this.memory, instanceSpecForDescribeDBInstanceSpecsOutput.memory) &&
        Objects.equals(this.regionId, instanceSpecForDescribeDBInstanceSpecsOutput.regionId) &&
        Objects.equals(this.specCode, instanceSpecForDescribeDBInstanceSpecsOutput.specCode) &&
        Objects.equals(this.specStatus, instanceSpecForDescribeDBInstanceSpecsOutput.specStatus) &&
        Objects.equals(this.VCPU, instanceSpecForDescribeDBInstanceSpecsOutput.VCPU) &&
        Objects.equals(this.zoneId, instanceSpecForDescribeDBInstanceSpecsOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connection, dbEngineVersion, memory, regionId, specCode, specStatus, VCPU, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceSpecForDescribeDBInstanceSpecsOutput {\n");
    
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    dbEngineVersion: ").append(toIndentedString(dbEngineVersion)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
    sb.append("    specStatus: ").append(toIndentedString(specStatus)).append("\n");
    sb.append("    VCPU: ").append(toIndentedString(VCPU)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
