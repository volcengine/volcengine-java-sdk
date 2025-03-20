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
 * DescribeSlotsRequest
 */



public class DescribeSlotsRequest {
  @SerializedName("Database")
  private String database = null;

  @SerializedName("IPAddress")
  private String ipAddress = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Plugin")
  private String plugin = null;

  @SerializedName("SlotName")
  private String slotName = null;

  @SerializedName("SlotStatus")
  private String slotStatus = null;

  @SerializedName("SlotType")
  private String slotType = null;

  @SerializedName("Temporary")
  private Boolean temporary = null;

  public DescribeSlotsRequest database(String database) {
    this.database = database;
    return this;
  }

   /**
   * Get database
   * @return database
  **/
  @Schema(description = "")
  public String getDatabase() {
    return database;
  }

  public void setDatabase(String database) {
    this.database = database;
  }

  public DescribeSlotsRequest ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @Schema(description = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public DescribeSlotsRequest instanceId(String instanceId) {
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

  public DescribeSlotsRequest plugin(String plugin) {
    this.plugin = plugin;
    return this;
  }

   /**
   * Get plugin
   * @return plugin
  **/
  @Schema(description = "")
  public String getPlugin() {
    return plugin;
  }

  public void setPlugin(String plugin) {
    this.plugin = plugin;
  }

  public DescribeSlotsRequest slotName(String slotName) {
    this.slotName = slotName;
    return this;
  }

   /**
   * Get slotName
   * @return slotName
  **/
  @Schema(description = "")
  public String getSlotName() {
    return slotName;
  }

  public void setSlotName(String slotName) {
    this.slotName = slotName;
  }

  public DescribeSlotsRequest slotStatus(String slotStatus) {
    this.slotStatus = slotStatus;
    return this;
  }

   /**
   * Get slotStatus
   * @return slotStatus
  **/
  @Schema(description = "")
  public String getSlotStatus() {
    return slotStatus;
  }

  public void setSlotStatus(String slotStatus) {
    this.slotStatus = slotStatus;
  }

  public DescribeSlotsRequest slotType(String slotType) {
    this.slotType = slotType;
    return this;
  }

   /**
   * Get slotType
   * @return slotType
  **/
  @Schema(description = "")
  public String getSlotType() {
    return slotType;
  }

  public void setSlotType(String slotType) {
    this.slotType = slotType;
  }

  public DescribeSlotsRequest temporary(Boolean temporary) {
    this.temporary = temporary;
    return this;
  }

   /**
   * Get temporary
   * @return temporary
  **/
  @Schema(description = "")
  public Boolean isTemporary() {
    return temporary;
  }

  public void setTemporary(Boolean temporary) {
    this.temporary = temporary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeSlotsRequest describeSlotsRequest = (DescribeSlotsRequest) o;
    return Objects.equals(this.database, describeSlotsRequest.database) &&
        Objects.equals(this.ipAddress, describeSlotsRequest.ipAddress) &&
        Objects.equals(this.instanceId, describeSlotsRequest.instanceId) &&
        Objects.equals(this.plugin, describeSlotsRequest.plugin) &&
        Objects.equals(this.slotName, describeSlotsRequest.slotName) &&
        Objects.equals(this.slotStatus, describeSlotsRequest.slotStatus) &&
        Objects.equals(this.slotType, describeSlotsRequest.slotType) &&
        Objects.equals(this.temporary, describeSlotsRequest.temporary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(database, ipAddress, instanceId, plugin, slotName, slotStatus, slotType, temporary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSlotsRequest {\n");
    
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    plugin: ").append(toIndentedString(plugin)).append("\n");
    sb.append("    slotName: ").append(toIndentedString(slotName)).append("\n");
    sb.append("    slotStatus: ").append(toIndentedString(slotStatus)).append("\n");
    sb.append("    slotType: ").append(toIndentedString(slotType)).append("\n");
    sb.append("    temporary: ").append(toIndentedString(temporary)).append("\n");
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
