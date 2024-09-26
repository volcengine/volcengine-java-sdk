/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vpn.model.HealthCheckConfigForCreateVpnConnectionHealthCheckersInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateVpnConnectionHealthCheckersRequest
 */



public class CreateVpnConnectionHealthCheckersRequest {
  @SerializedName("HealthCheckConfigs")
  private List<HealthCheckConfigForCreateVpnConnectionHealthCheckersInput> healthCheckConfigs = null;

  @SerializedName("VpnConnectionId")
  private String vpnConnectionId = null;

  public CreateVpnConnectionHealthCheckersRequest healthCheckConfigs(List<HealthCheckConfigForCreateVpnConnectionHealthCheckersInput> healthCheckConfigs) {
    this.healthCheckConfigs = healthCheckConfigs;
    return this;
  }

  public CreateVpnConnectionHealthCheckersRequest addHealthCheckConfigsItem(HealthCheckConfigForCreateVpnConnectionHealthCheckersInput healthCheckConfigsItem) {
    if (this.healthCheckConfigs == null) {
      this.healthCheckConfigs = new ArrayList<HealthCheckConfigForCreateVpnConnectionHealthCheckersInput>();
    }
    this.healthCheckConfigs.add(healthCheckConfigsItem);
    return this;
  }

   /**
   * Get healthCheckConfigs
   * @return healthCheckConfigs
  **/
  @Valid
  @Schema(description = "")
  public List<HealthCheckConfigForCreateVpnConnectionHealthCheckersInput> getHealthCheckConfigs() {
    return healthCheckConfigs;
  }

  public void setHealthCheckConfigs(List<HealthCheckConfigForCreateVpnConnectionHealthCheckersInput> healthCheckConfigs) {
    this.healthCheckConfigs = healthCheckConfigs;
  }

  public CreateVpnConnectionHealthCheckersRequest vpnConnectionId(String vpnConnectionId) {
    this.vpnConnectionId = vpnConnectionId;
    return this;
  }

   /**
   * Get vpnConnectionId
   * @return vpnConnectionId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVpnConnectionId() {
    return vpnConnectionId;
  }

  public void setVpnConnectionId(String vpnConnectionId) {
    this.vpnConnectionId = vpnConnectionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVpnConnectionHealthCheckersRequest createVpnConnectionHealthCheckersRequest = (CreateVpnConnectionHealthCheckersRequest) o;
    return Objects.equals(this.healthCheckConfigs, createVpnConnectionHealthCheckersRequest.healthCheckConfigs) &&
        Objects.equals(this.vpnConnectionId, createVpnConnectionHealthCheckersRequest.vpnConnectionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(healthCheckConfigs, vpnConnectionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVpnConnectionHealthCheckersRequest {\n");
    
    sb.append("    healthCheckConfigs: ").append(toIndentedString(healthCheckConfigs)).append("\n");
    sb.append("    vpnConnectionId: ").append(toIndentedString(vpnConnectionId)).append("\n");
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