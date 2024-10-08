/*
 * privatelink
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.privatelink.model;

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
 * AddPermissionToVpcEndpointServiceRequest
 */



public class AddPermissionToVpcEndpointServiceRequest {
  @SerializedName("PermitAccountId")
  private String permitAccountId = null;

  @SerializedName("ServiceId")
  private String serviceId = null;

  public AddPermissionToVpcEndpointServiceRequest permitAccountId(String permitAccountId) {
    this.permitAccountId = permitAccountId;
    return this;
  }

   /**
   * Get permitAccountId
   * @return permitAccountId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPermitAccountId() {
    return permitAccountId;
  }

  public void setPermitAccountId(String permitAccountId) {
    this.permitAccountId = permitAccountId;
  }

  public AddPermissionToVpcEndpointServiceRequest serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddPermissionToVpcEndpointServiceRequest addPermissionToVpcEndpointServiceRequest = (AddPermissionToVpcEndpointServiceRequest) o;
    return Objects.equals(this.permitAccountId, addPermissionToVpcEndpointServiceRequest.permitAccountId) &&
        Objects.equals(this.serviceId, addPermissionToVpcEndpointServiceRequest.serviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permitAccountId, serviceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddPermissionToVpcEndpointServiceRequest {\n");
    
    sb.append("    permitAccountId: ").append(toIndentedString(permitAccountId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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
