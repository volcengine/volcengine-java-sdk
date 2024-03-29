/*
 * natgateway
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.natgateway.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.natgateway.model.ZoneForListNatGatewayAvailableZonesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListNatGatewayAvailableZonesResponse
 */



public class ListNatGatewayAvailableZonesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("Zones")
  private List<ZoneForListNatGatewayAvailableZonesOutput> zones = null;

  public ListNatGatewayAvailableZonesResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ListNatGatewayAvailableZonesResponse zones(List<ZoneForListNatGatewayAvailableZonesOutput> zones) {
    this.zones = zones;
    return this;
  }

  public ListNatGatewayAvailableZonesResponse addZonesItem(ZoneForListNatGatewayAvailableZonesOutput zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<ZoneForListNatGatewayAvailableZonesOutput>();
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
  public List<ZoneForListNatGatewayAvailableZonesOutput> getZones() {
    return zones;
  }

  public void setZones(List<ZoneForListNatGatewayAvailableZonesOutput> zones) {
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
    ListNatGatewayAvailableZonesResponse listNatGatewayAvailableZonesResponse = (ListNatGatewayAvailableZonesResponse) o;
    return Objects.equals(this.requestId, listNatGatewayAvailableZonesResponse.requestId) &&
        Objects.equals(this.zones, listNatGatewayAvailableZonesResponse.zones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, zones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListNatGatewayAvailableZonesResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
