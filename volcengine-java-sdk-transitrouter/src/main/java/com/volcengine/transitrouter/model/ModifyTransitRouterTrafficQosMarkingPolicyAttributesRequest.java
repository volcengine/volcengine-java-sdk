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
 * ModifyTransitRouterTrafficQosMarkingPolicyAttributesRequest
 */



public class ModifyTransitRouterTrafficQosMarkingPolicyAttributesRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("TransitRouterTrafficQosMarkingPolicyId")
  private String transitRouterTrafficQosMarkingPolicyId = null;

  @SerializedName("TransitRouterTrafficQosMarkingPolicyName")
  private String transitRouterTrafficQosMarkingPolicyName = null;

  public ModifyTransitRouterTrafficQosMarkingPolicyAttributesRequest description(String description) {
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

  public ModifyTransitRouterTrafficQosMarkingPolicyAttributesRequest transitRouterTrafficQosMarkingPolicyId(String transitRouterTrafficQosMarkingPolicyId) {
    this.transitRouterTrafficQosMarkingPolicyId = transitRouterTrafficQosMarkingPolicyId;
    return this;
  }

   /**
   * Get transitRouterTrafficQosMarkingPolicyId
   * @return transitRouterTrafficQosMarkingPolicyId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTransitRouterTrafficQosMarkingPolicyId() {
    return transitRouterTrafficQosMarkingPolicyId;
  }

  public void setTransitRouterTrafficQosMarkingPolicyId(String transitRouterTrafficQosMarkingPolicyId) {
    this.transitRouterTrafficQosMarkingPolicyId = transitRouterTrafficQosMarkingPolicyId;
  }

  public ModifyTransitRouterTrafficQosMarkingPolicyAttributesRequest transitRouterTrafficQosMarkingPolicyName(String transitRouterTrafficQosMarkingPolicyName) {
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
    ModifyTransitRouterTrafficQosMarkingPolicyAttributesRequest modifyTransitRouterTrafficQosMarkingPolicyAttributesRequest = (ModifyTransitRouterTrafficQosMarkingPolicyAttributesRequest) o;
    return Objects.equals(this.description, modifyTransitRouterTrafficQosMarkingPolicyAttributesRequest.description) &&
        Objects.equals(this.transitRouterTrafficQosMarkingPolicyId, modifyTransitRouterTrafficQosMarkingPolicyAttributesRequest.transitRouterTrafficQosMarkingPolicyId) &&
        Objects.equals(this.transitRouterTrafficQosMarkingPolicyName, modifyTransitRouterTrafficQosMarkingPolicyAttributesRequest.transitRouterTrafficQosMarkingPolicyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, transitRouterTrafficQosMarkingPolicyId, transitRouterTrafficQosMarkingPolicyName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyTransitRouterTrafficQosMarkingPolicyAttributesRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    transitRouterTrafficQosMarkingPolicyId: ").append(toIndentedString(transitRouterTrafficQosMarkingPolicyId)).append("\n");
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
