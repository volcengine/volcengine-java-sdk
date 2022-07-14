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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateCustomerGatewayRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:23:33.618811+08:00[Asia/Shanghai]")
public class CreateCustomerGatewayRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("CustomerGatewayName")
  private String customerGatewayName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  public CreateCustomerGatewayRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public CreateCustomerGatewayRequest customerGatewayName(String customerGatewayName) {
    this.customerGatewayName = customerGatewayName;
    return this;
  }

   /**
   * Get customerGatewayName
   * @return customerGatewayName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getCustomerGatewayName() {
    return customerGatewayName;
  }

  public void setCustomerGatewayName(String customerGatewayName) {
    this.customerGatewayName = customerGatewayName;
  }

  public CreateCustomerGatewayRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 @Size(min=1,max=255)  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateCustomerGatewayRequest ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomerGatewayRequest createCustomerGatewayRequest = (CreateCustomerGatewayRequest) o;
    return Objects.equals(this.clientToken, createCustomerGatewayRequest.clientToken) &&
        Objects.equals(this.customerGatewayName, createCustomerGatewayRequest.customerGatewayName) &&
        Objects.equals(this.description, createCustomerGatewayRequest.description) &&
        Objects.equals(this.ipAddress, createCustomerGatewayRequest.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, customerGatewayName, description, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomerGatewayRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    customerGatewayName: ").append(toIndentedString(customerGatewayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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
