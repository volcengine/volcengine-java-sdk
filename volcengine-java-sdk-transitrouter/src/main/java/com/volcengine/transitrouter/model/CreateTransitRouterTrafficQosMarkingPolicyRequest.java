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
 * CreateTransitRouterTrafficQosMarkingPolicyRequest
 */



public class CreateTransitRouterTrafficQosMarkingPolicyRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("TransitRouterId")
  private String transitRouterId = null;

  @SerializedName("TransitRouterTrafficQosMarkingPolicyName")
  private String transitRouterTrafficQosMarkingPolicyName = null;

  public CreateTransitRouterTrafficQosMarkingPolicyRequest clientToken(String clientToken) {
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

  public CreateTransitRouterTrafficQosMarkingPolicyRequest description(String description) {
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

  public CreateTransitRouterTrafficQosMarkingPolicyRequest transitRouterId(String transitRouterId) {
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

  public CreateTransitRouterTrafficQosMarkingPolicyRequest transitRouterTrafficQosMarkingPolicyName(String transitRouterTrafficQosMarkingPolicyName) {
    this.transitRouterTrafficQosMarkingPolicyName = transitRouterTrafficQosMarkingPolicyName;
    return this;
  }

   /**
   * Get transitRouterTrafficQosMarkingPolicyName
   * @return transitRouterTrafficQosMarkingPolicyName
  **/
  @Schema(description = "")
  public String getTransitRouterTrafficQosMarkingPolicyName() {
    return transitRouterTrafficQosMarkingPolicyName;
  }

  public void setTransitRouterTrafficQosMarkingPolicyName(String transitRouterTrafficQosMarkingPolicyName) {
    this.transitRouterTrafficQosMarkingPolicyName = transitRouterTrafficQosMarkingPolicyName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTransitRouterTrafficQosMarkingPolicyRequest createTransitRouterTrafficQosMarkingPolicyRequest = (CreateTransitRouterTrafficQosMarkingPolicyRequest) o;
    return Objects.equals(this.clientToken, createTransitRouterTrafficQosMarkingPolicyRequest.clientToken) &&
        Objects.equals(this.description, createTransitRouterTrafficQosMarkingPolicyRequest.description) &&
        Objects.equals(this.transitRouterId, createTransitRouterTrafficQosMarkingPolicyRequest.transitRouterId) &&
        Objects.equals(this.transitRouterTrafficQosMarkingPolicyName, createTransitRouterTrafficQosMarkingPolicyRequest.transitRouterTrafficQosMarkingPolicyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, description, transitRouterId, transitRouterTrafficQosMarkingPolicyName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransitRouterTrafficQosMarkingPolicyRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    transitRouterId: ").append(toIndentedString(transitRouterId)).append("\n");
    sb.append("    transitRouterTrafficQosMarkingPolicyName: ").append(toIndentedString(transitRouterTrafficQosMarkingPolicyName)).append("\n");
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