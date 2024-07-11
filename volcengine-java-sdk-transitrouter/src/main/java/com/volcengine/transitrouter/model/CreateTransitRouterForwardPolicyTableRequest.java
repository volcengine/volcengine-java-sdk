/*
 * transitrouter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.transitrouter.model;

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
 * CreateTransitRouterForwardPolicyTableRequest
 */



public class CreateTransitRouterForwardPolicyTableRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("TransitRouterForwardPolicyTableName")
  private String transitRouterForwardPolicyTableName = null;

  @SerializedName("TransitRouterId")
  private String transitRouterId = null;

  public CreateTransitRouterForwardPolicyTableRequest clientToken(String clientToken) {
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

  public CreateTransitRouterForwardPolicyTableRequest description(String description) {
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

  public CreateTransitRouterForwardPolicyTableRequest transitRouterForwardPolicyTableName(String transitRouterForwardPolicyTableName) {
    this.transitRouterForwardPolicyTableName = transitRouterForwardPolicyTableName;
    return this;
  }

   /**
   * Get transitRouterForwardPolicyTableName
   * @return transitRouterForwardPolicyTableName
  **/
  @Schema(description = "")
  public String getTransitRouterForwardPolicyTableName() {
    return transitRouterForwardPolicyTableName;
  }

  public void setTransitRouterForwardPolicyTableName(String transitRouterForwardPolicyTableName) {
    this.transitRouterForwardPolicyTableName = transitRouterForwardPolicyTableName;
  }

  public CreateTransitRouterForwardPolicyTableRequest transitRouterId(String transitRouterId) {
    this.transitRouterId = transitRouterId;
    return this;
  }

   /**
   * Get transitRouterId
   * @return transitRouterId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTransitRouterId() {
    return transitRouterId;
  }

  public void setTransitRouterId(String transitRouterId) {
    this.transitRouterId = transitRouterId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTransitRouterForwardPolicyTableRequest createTransitRouterForwardPolicyTableRequest = (CreateTransitRouterForwardPolicyTableRequest) o;
    return Objects.equals(this.clientToken, createTransitRouterForwardPolicyTableRequest.clientToken) &&
        Objects.equals(this.description, createTransitRouterForwardPolicyTableRequest.description) &&
        Objects.equals(this.transitRouterForwardPolicyTableName, createTransitRouterForwardPolicyTableRequest.transitRouterForwardPolicyTableName) &&
        Objects.equals(this.transitRouterId, createTransitRouterForwardPolicyTableRequest.transitRouterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, description, transitRouterForwardPolicyTableName, transitRouterId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransitRouterForwardPolicyTableRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    transitRouterForwardPolicyTableName: ").append(toIndentedString(transitRouterForwardPolicyTableName)).append("\n");
    sb.append("    transitRouterId: ").append(toIndentedString(transitRouterId)).append("\n");
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
