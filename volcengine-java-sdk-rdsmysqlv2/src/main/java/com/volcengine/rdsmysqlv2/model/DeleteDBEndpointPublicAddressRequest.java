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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DeleteDBEndpointPublicAddressRequest
 */


public class DeleteDBEndpointPublicAddressRequest {
  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("EipId")
  private String eipId = null;

  @SerializedName("EndpointId")
  private String endpointId = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  public DeleteDBEndpointPublicAddressRequest domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public DeleteDBEndpointPublicAddressRequest eipId(String eipId) {
    this.eipId = eipId;
    return this;
  }

   /**
   * Get eipId
   * @return eipId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getEipId() {
    return eipId;
  }

  public void setEipId(String eipId) {
    this.eipId = eipId;
  }

  public DeleteDBEndpointPublicAddressRequest endpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

   /**
   * Get endpointId
   * @return endpointId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }

  public DeleteDBEndpointPublicAddressRequest instanceId(String instanceId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDBEndpointPublicAddressRequest deleteDBEndpointPublicAddressRequest = (DeleteDBEndpointPublicAddressRequest) o;
    return Objects.equals(this.domain, deleteDBEndpointPublicAddressRequest.domain) &&
        Objects.equals(this.eipId, deleteDBEndpointPublicAddressRequest.eipId) &&
        Objects.equals(this.endpointId, deleteDBEndpointPublicAddressRequest.endpointId) &&
        Objects.equals(this.instanceId, deleteDBEndpointPublicAddressRequest.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, eipId, endpointId, instanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDBEndpointPublicAddressRequest {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
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