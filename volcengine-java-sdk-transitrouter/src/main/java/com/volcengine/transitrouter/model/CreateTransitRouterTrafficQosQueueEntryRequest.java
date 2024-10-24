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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateTransitRouterTrafficQosQueueEntryRequest
 */



public class CreateTransitRouterTrafficQosQueueEntryRequest {
  @SerializedName("BandwidthPercent")
  private Integer bandwidthPercent = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Dscps")
  private List<Integer> dscps = null;

  @SerializedName("TransitRouterTrafficQosQueueEntryName")
  private String transitRouterTrafficQosQueueEntryName = null;

  @SerializedName("TransitRouterTrafficQosQueuePolicyId")
  private String transitRouterTrafficQosQueuePolicyId = null;

  public CreateTransitRouterTrafficQosQueueEntryRequest bandwidthPercent(Integer bandwidthPercent) {
    this.bandwidthPercent = bandwidthPercent;
    return this;
  }

   /**
   * Get bandwidthPercent
   * @return bandwidthPercent
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getBandwidthPercent() {
    return bandwidthPercent;
  }

  public void setBandwidthPercent(Integer bandwidthPercent) {
    this.bandwidthPercent = bandwidthPercent;
  }

  public CreateTransitRouterTrafficQosQueueEntryRequest clientToken(String clientToken) {
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

  public CreateTransitRouterTrafficQosQueueEntryRequest description(String description) {
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

  public CreateTransitRouterTrafficQosQueueEntryRequest dscps(List<Integer> dscps) {
    this.dscps = dscps;
    return this;
  }

  public CreateTransitRouterTrafficQosQueueEntryRequest addDscpsItem(Integer dscpsItem) {
    if (this.dscps == null) {
      this.dscps = new ArrayList<Integer>();
    }
    this.dscps.add(dscpsItem);
    return this;
  }

   /**
   * Get dscps
   * @return dscps
  **/
  @Schema(description = "")
  public List<Integer> getDscps() {
    return dscps;
  }

  public void setDscps(List<Integer> dscps) {
    this.dscps = dscps;
  }

  public CreateTransitRouterTrafficQosQueueEntryRequest transitRouterTrafficQosQueueEntryName(String transitRouterTrafficQosQueueEntryName) {
    this.transitRouterTrafficQosQueueEntryName = transitRouterTrafficQosQueueEntryName;
    return this;
  }

   /**
   * Get transitRouterTrafficQosQueueEntryName
   * @return transitRouterTrafficQosQueueEntryName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTransitRouterTrafficQosQueueEntryName() {
    return transitRouterTrafficQosQueueEntryName;
  }

  public void setTransitRouterTrafficQosQueueEntryName(String transitRouterTrafficQosQueueEntryName) {
    this.transitRouterTrafficQosQueueEntryName = transitRouterTrafficQosQueueEntryName;
  }

  public CreateTransitRouterTrafficQosQueueEntryRequest transitRouterTrafficQosQueuePolicyId(String transitRouterTrafficQosQueuePolicyId) {
    this.transitRouterTrafficQosQueuePolicyId = transitRouterTrafficQosQueuePolicyId;
    return this;
  }

   /**
   * Get transitRouterTrafficQosQueuePolicyId
   * @return transitRouterTrafficQosQueuePolicyId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTransitRouterTrafficQosQueuePolicyId() {
    return transitRouterTrafficQosQueuePolicyId;
  }

  public void setTransitRouterTrafficQosQueuePolicyId(String transitRouterTrafficQosQueuePolicyId) {
    this.transitRouterTrafficQosQueuePolicyId = transitRouterTrafficQosQueuePolicyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTransitRouterTrafficQosQueueEntryRequest createTransitRouterTrafficQosQueueEntryRequest = (CreateTransitRouterTrafficQosQueueEntryRequest) o;
    return Objects.equals(this.bandwidthPercent, createTransitRouterTrafficQosQueueEntryRequest.bandwidthPercent) &&
        Objects.equals(this.clientToken, createTransitRouterTrafficQosQueueEntryRequest.clientToken) &&
        Objects.equals(this.description, createTransitRouterTrafficQosQueueEntryRequest.description) &&
        Objects.equals(this.dscps, createTransitRouterTrafficQosQueueEntryRequest.dscps) &&
        Objects.equals(this.transitRouterTrafficQosQueueEntryName, createTransitRouterTrafficQosQueueEntryRequest.transitRouterTrafficQosQueueEntryName) &&
        Objects.equals(this.transitRouterTrafficQosQueuePolicyId, createTransitRouterTrafficQosQueueEntryRequest.transitRouterTrafficQosQueuePolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidthPercent, clientToken, description, dscps, transitRouterTrafficQosQueueEntryName, transitRouterTrafficQosQueuePolicyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransitRouterTrafficQosQueueEntryRequest {\n");
    
    sb.append("    bandwidthPercent: ").append(toIndentedString(bandwidthPercent)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dscps: ").append(toIndentedString(dscps)).append("\n");
    sb.append("    transitRouterTrafficQosQueueEntryName: ").append(toIndentedString(transitRouterTrafficQosQueueEntryName)).append("\n");
    sb.append("    transitRouterTrafficQosQueuePolicyId: ").append(toIndentedString(transitRouterTrafficQosQueuePolicyId)).append("\n");
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