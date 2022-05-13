/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.directconnect.model;

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
 * ModifyDirectConnectGatewayAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T17:16:28.121303+08:00[Asia/Shanghai]")
public class ModifyDirectConnectGatewayAttributesRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("DirectConnectGatewayId")
  private String directConnectGatewayId = null;

  @SerializedName("DirectConnectGatewayName")
  private String directConnectGatewayName = null;

  public ModifyDirectConnectGatewayAttributesRequest description(String description) {
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

  public ModifyDirectConnectGatewayAttributesRequest directConnectGatewayId(String directConnectGatewayId) {
    this.directConnectGatewayId = directConnectGatewayId;
    return this;
  }

   /**
   * Get directConnectGatewayId
   * @return directConnectGatewayId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDirectConnectGatewayId() {
    return directConnectGatewayId;
  }

  public void setDirectConnectGatewayId(String directConnectGatewayId) {
    this.directConnectGatewayId = directConnectGatewayId;
  }

  public ModifyDirectConnectGatewayAttributesRequest directConnectGatewayName(String directConnectGatewayName) {
    this.directConnectGatewayName = directConnectGatewayName;
    return this;
  }

   /**
   * Get directConnectGatewayName
   * @return directConnectGatewayName
  **/
  @Schema(description = "")
  public String getDirectConnectGatewayName() {
    return directConnectGatewayName;
  }

  public void setDirectConnectGatewayName(String directConnectGatewayName) {
    this.directConnectGatewayName = directConnectGatewayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyDirectConnectGatewayAttributesRequest modifyDirectConnectGatewayAttributesRequest = (ModifyDirectConnectGatewayAttributesRequest) o;
    return Objects.equals(this.description, modifyDirectConnectGatewayAttributesRequest.description) &&
        Objects.equals(this.directConnectGatewayId, modifyDirectConnectGatewayAttributesRequest.directConnectGatewayId) &&
        Objects.equals(this.directConnectGatewayName, modifyDirectConnectGatewayAttributesRequest.directConnectGatewayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, directConnectGatewayId, directConnectGatewayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDirectConnectGatewayAttributesRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    directConnectGatewayId: ").append(toIndentedString(directConnectGatewayId)).append("\n");
    sb.append("    directConnectGatewayName: ").append(toIndentedString(directConnectGatewayName)).append("\n");
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
