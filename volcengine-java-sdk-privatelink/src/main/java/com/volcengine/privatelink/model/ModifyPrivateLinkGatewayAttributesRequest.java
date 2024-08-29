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
 * ModifyPrivateLinkGatewayAttributesRequest
 */



public class ModifyPrivateLinkGatewayAttributesRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("PrivateLinkGatewayId")
  private String privateLinkGatewayId = null;

  @SerializedName("PrivateLinkGatewayName")
  private String privateLinkGatewayName = null;

  public ModifyPrivateLinkGatewayAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ModifyPrivateLinkGatewayAttributesRequest privateLinkGatewayId(String privateLinkGatewayId) {
    this.privateLinkGatewayId = privateLinkGatewayId;
    return this;
  }

   /**
   * Get privateLinkGatewayId
   * @return privateLinkGatewayId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPrivateLinkGatewayId() {
    return privateLinkGatewayId;
  }

  public void setPrivateLinkGatewayId(String privateLinkGatewayId) {
    this.privateLinkGatewayId = privateLinkGatewayId;
  }

  public ModifyPrivateLinkGatewayAttributesRequest privateLinkGatewayName(String privateLinkGatewayName) {
    this.privateLinkGatewayName = privateLinkGatewayName;
    return this;
  }

   /**
   * Get privateLinkGatewayName
   * @return privateLinkGatewayName
  **/
  @Schema(description = "")
  public String getPrivateLinkGatewayName() {
    return privateLinkGatewayName;
  }

  public void setPrivateLinkGatewayName(String privateLinkGatewayName) {
    this.privateLinkGatewayName = privateLinkGatewayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyPrivateLinkGatewayAttributesRequest modifyPrivateLinkGatewayAttributesRequest = (ModifyPrivateLinkGatewayAttributesRequest) o;
    return Objects.equals(this.description, modifyPrivateLinkGatewayAttributesRequest.description) &&
        Objects.equals(this.privateLinkGatewayId, modifyPrivateLinkGatewayAttributesRequest.privateLinkGatewayId) &&
        Objects.equals(this.privateLinkGatewayName, modifyPrivateLinkGatewayAttributesRequest.privateLinkGatewayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, privateLinkGatewayId, privateLinkGatewayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyPrivateLinkGatewayAttributesRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    privateLinkGatewayId: ").append(toIndentedString(privateLinkGatewayId)).append("\n");
    sb.append("    privateLinkGatewayName: ").append(toIndentedString(privateLinkGatewayName)).append("\n");
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
