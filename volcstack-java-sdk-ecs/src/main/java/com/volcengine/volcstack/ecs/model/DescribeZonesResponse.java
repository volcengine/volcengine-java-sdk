/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcstack.ecs.model.ZoneForDescribeZonesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeZonesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T17:16:32.628524+08:00[Asia/Shanghai]")
public class DescribeZonesResponse {
  @SerializedName("Zones")
  private List<ZoneForDescribeZonesOutput> zones = null;

  public DescribeZonesResponse zones(List<ZoneForDescribeZonesOutput> zones) {
    this.zones = zones;
    return this;
  }

  public DescribeZonesResponse addZonesItem(ZoneForDescribeZonesOutput zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<ZoneForDescribeZonesOutput>();
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
  public List<ZoneForDescribeZonesOutput> getZones() {
    return zones;
  }

  public void setZones(List<ZoneForDescribeZonesOutput> zones) {
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
    DescribeZonesResponse describeZonesResponse = (DescribeZonesResponse) o;
    return Objects.equals(this.zones, describeZonesResponse.zones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeZonesResponse {\n");
    
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
