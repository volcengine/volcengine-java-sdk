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

package com.volcengine.volcstack.vpn.model;

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
 * ModifyCustomerGatewayAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T17:16:45.779409+08:00[Asia/Shanghai]")
public class ModifyCustomerGatewayAttributesRequest {
  @SerializedName("CustomerGatewayId")
  private String customerGatewayId = null;

  @SerializedName("CustomerGatewayName")
  private String customerGatewayName = null;

  @SerializedName("Description")
  private String description = null;

  public ModifyCustomerGatewayAttributesRequest customerGatewayId(String customerGatewayId) {
    this.customerGatewayId = customerGatewayId;
    return this;
  }

   /**
   * Get customerGatewayId
   * @return customerGatewayId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCustomerGatewayId() {
    return customerGatewayId;
  }

  public void setCustomerGatewayId(String customerGatewayId) {
    this.customerGatewayId = customerGatewayId;
  }

  public ModifyCustomerGatewayAttributesRequest customerGatewayName(String customerGatewayName) {
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

  public ModifyCustomerGatewayAttributesRequest description(String description) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyCustomerGatewayAttributesRequest modifyCustomerGatewayAttributesRequest = (ModifyCustomerGatewayAttributesRequest) o;
    return Objects.equals(this.customerGatewayId, modifyCustomerGatewayAttributesRequest.customerGatewayId) &&
        Objects.equals(this.customerGatewayName, modifyCustomerGatewayAttributesRequest.customerGatewayName) &&
        Objects.equals(this.description, modifyCustomerGatewayAttributesRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerGatewayId, customerGatewayName, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyCustomerGatewayAttributesRequest {\n");
    
    sb.append("    customerGatewayId: ").append(toIndentedString(customerGatewayId)).append("\n");
    sb.append("    customerGatewayName: ").append(toIndentedString(customerGatewayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
