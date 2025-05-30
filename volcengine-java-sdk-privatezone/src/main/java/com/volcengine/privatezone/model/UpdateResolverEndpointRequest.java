/*
 * private_zone
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.privatezone.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.privatezone.model.IpConfigsForUpdateResolverEndpointInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateResolverEndpointRequest
 */



public class UpdateResolverEndpointRequest {
  @SerializedName("EndpointID")
  private Long endpointID = null;

  @SerializedName("EndpointTrn")
  private String endpointTrn = null;

  @SerializedName("EndpointType")
  private String endpointType = null;

  @SerializedName("IpConfigs")
  private IpConfigsForUpdateResolverEndpointInput ipConfigs = null;

  @SerializedName("Name")
  private String name = null;

  public UpdateResolverEndpointRequest endpointID(Long endpointID) {
    this.endpointID = endpointID;
    return this;
  }

   /**
   * Get endpointID
   * @return endpointID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Long getEndpointID() {
    return endpointID;
  }

  public void setEndpointID(Long endpointID) {
    this.endpointID = endpointID;
  }

  public UpdateResolverEndpointRequest endpointTrn(String endpointTrn) {
    this.endpointTrn = endpointTrn;
    return this;
  }

   /**
   * Get endpointTrn
   * @return endpointTrn
  **/
  @Schema(description = "")
  public String getEndpointTrn() {
    return endpointTrn;
  }

  public void setEndpointTrn(String endpointTrn) {
    this.endpointTrn = endpointTrn;
  }

  public UpdateResolverEndpointRequest endpointType(String endpointType) {
    this.endpointType = endpointType;
    return this;
  }

   /**
   * Get endpointType
   * @return endpointType
  **/
  @Schema(description = "")
  public String getEndpointType() {
    return endpointType;
  }

  public void setEndpointType(String endpointType) {
    this.endpointType = endpointType;
  }

  public UpdateResolverEndpointRequest ipConfigs(IpConfigsForUpdateResolverEndpointInput ipConfigs) {
    this.ipConfigs = ipConfigs;
    return this;
  }

   /**
   * Get ipConfigs
   * @return ipConfigs
  **/
  @Valid
  @Schema(description = "")
  public IpConfigsForUpdateResolverEndpointInput getIpConfigs() {
    return ipConfigs;
  }

  public void setIpConfigs(IpConfigsForUpdateResolverEndpointInput ipConfigs) {
    this.ipConfigs = ipConfigs;
  }

  public UpdateResolverEndpointRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateResolverEndpointRequest updateResolverEndpointRequest = (UpdateResolverEndpointRequest) o;
    return Objects.equals(this.endpointID, updateResolverEndpointRequest.endpointID) &&
        Objects.equals(this.endpointTrn, updateResolverEndpointRequest.endpointTrn) &&
        Objects.equals(this.endpointType, updateResolverEndpointRequest.endpointType) &&
        Objects.equals(this.ipConfigs, updateResolverEndpointRequest.ipConfigs) &&
        Objects.equals(this.name, updateResolverEndpointRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointID, endpointTrn, endpointType, ipConfigs, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateResolverEndpointRequest {\n");
    
    sb.append("    endpointID: ").append(toIndentedString(endpointID)).append("\n");
    sb.append("    endpointTrn: ").append(toIndentedString(endpointTrn)).append("\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    ipConfigs: ").append(toIndentedString(ipConfigs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
