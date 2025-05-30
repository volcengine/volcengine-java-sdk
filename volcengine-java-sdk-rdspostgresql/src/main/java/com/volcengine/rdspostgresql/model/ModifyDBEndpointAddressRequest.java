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
 * ModifyDBEndpointAddressRequest
 */



public class ModifyDBEndpointAddressRequest {
  @SerializedName("DomainPrefix")
  private String domainPrefix = null;

  @SerializedName("EndpointId")
  private String endpointId = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("NetworkType")
  private String networkType = null;

  @SerializedName("Port")
  private String port = null;

  public ModifyDBEndpointAddressRequest domainPrefix(String domainPrefix) {
    this.domainPrefix = domainPrefix;
    return this;
  }

   /**
   * Get domainPrefix
   * @return domainPrefix
  **/
  @Schema(description = "")
  public String getDomainPrefix() {
    return domainPrefix;
  }

  public void setDomainPrefix(String domainPrefix) {
    this.domainPrefix = domainPrefix;
  }

  public ModifyDBEndpointAddressRequest endpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

   /**
   * Get endpointId
   * @return endpointId
  **/
  @Schema(description = "")
  public String getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }

  public ModifyDBEndpointAddressRequest instanceId(String instanceId) {
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

  public ModifyDBEndpointAddressRequest networkType(String networkType) {
    this.networkType = networkType;
    return this;
  }

   /**
   * Get networkType
   * @return networkType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getNetworkType() {
    return networkType;
  }

  public void setNetworkType(String networkType) {
    this.networkType = networkType;
  }

  public ModifyDBEndpointAddressRequest port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyDBEndpointAddressRequest modifyDBEndpointAddressRequest = (ModifyDBEndpointAddressRequest) o;
    return Objects.equals(this.domainPrefix, modifyDBEndpointAddressRequest.domainPrefix) &&
        Objects.equals(this.endpointId, modifyDBEndpointAddressRequest.endpointId) &&
        Objects.equals(this.instanceId, modifyDBEndpointAddressRequest.instanceId) &&
        Objects.equals(this.networkType, modifyDBEndpointAddressRequest.networkType) &&
        Objects.equals(this.port, modifyDBEndpointAddressRequest.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainPrefix, endpointId, instanceId, networkType, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDBEndpointAddressRequest {\n");
    
    sb.append("    domainPrefix: ").append(toIndentedString(domainPrefix)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
