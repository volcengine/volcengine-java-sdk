/*
 * escloud
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.escloud.model;

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
 * ZoneForDescribeZonesOutput
 */



public class ZoneForDescribeZonesOutput {
  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  @SerializedName("ZoneName")
  private String zoneName = null;

  @SerializedName("ZoneStatus")
  private String zoneStatus = null;

  public ZoneForDescribeZonesOutput regionId(String regionId) {
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

  public ZoneForDescribeZonesOutput zoneId(String zoneId) {
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

  public ZoneForDescribeZonesOutput zoneName(String zoneName) {
    this.zoneName = zoneName;
    return this;
  }

   /**
   * Get zoneName
   * @return zoneName
  **/
  @Schema(description = "")
  public String getZoneName() {
    return zoneName;
  }

  public void setZoneName(String zoneName) {
    this.zoneName = zoneName;
  }

  public ZoneForDescribeZonesOutput zoneStatus(String zoneStatus) {
    this.zoneStatus = zoneStatus;
    return this;
  }

   /**
   * Get zoneStatus
   * @return zoneStatus
  **/
  @Schema(description = "")
  public String getZoneStatus() {
    return zoneStatus;
  }

  public void setZoneStatus(String zoneStatus) {
    this.zoneStatus = zoneStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZoneForDescribeZonesOutput zoneForDescribeZonesOutput = (ZoneForDescribeZonesOutput) o;
    return Objects.equals(this.regionId, zoneForDescribeZonesOutput.regionId) &&
        Objects.equals(this.zoneId, zoneForDescribeZonesOutput.zoneId) &&
        Objects.equals(this.zoneName, zoneForDescribeZonesOutput.zoneName) &&
        Objects.equals(this.zoneStatus, zoneForDescribeZonesOutput.zoneStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionId, zoneId, zoneName, zoneStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZoneForDescribeZonesOutput {\n");
    
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
    sb.append("    zoneStatus: ").append(toIndentedString(zoneStatus)).append("\n");
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