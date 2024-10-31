/*
 * rabbitmq
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rabbitmq.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rabbitmq.model.ZoneForDescribeAvailabilityZonesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeAvailabilityZonesResponse
 */



public class DescribeAvailabilityZonesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("Zones")
  private List<ZoneForDescribeAvailabilityZonesOutput> zones = null;

  public DescribeAvailabilityZonesResponse regionId(String regionId) {
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

  public DescribeAvailabilityZonesResponse zones(List<ZoneForDescribeAvailabilityZonesOutput> zones) {
    this.zones = zones;
    return this;
  }

  public DescribeAvailabilityZonesResponse addZonesItem(ZoneForDescribeAvailabilityZonesOutput zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<ZoneForDescribeAvailabilityZonesOutput>();
    }
    this.zones.add(zonesItem);
    return this;
  }

   /**
   * Get zones
   * @return zones
  **/
  @Valid
  @Schema(description = "")
  public List<ZoneForDescribeAvailabilityZonesOutput> getZones() {
    return zones;
  }

  public void setZones(List<ZoneForDescribeAvailabilityZonesOutput> zones) {
    this.zones = zones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeAvailabilityZonesResponse describeAvailabilityZonesResponse = (DescribeAvailabilityZonesResponse) o;
    return Objects.equals(this.regionId, describeAvailabilityZonesResponse.regionId) &&
        Objects.equals(this.zones, describeAvailabilityZonesResponse.zones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionId, zones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeAvailabilityZonesResponse {\n");
    
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
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
