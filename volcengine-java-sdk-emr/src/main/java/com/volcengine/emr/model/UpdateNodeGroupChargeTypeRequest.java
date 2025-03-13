/*
 * emr
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.emr.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.emr.model.ChargePreConfigForUpdateNodeGroupChargeTypeInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateNodeGroupChargeTypeRequest
 */



public class UpdateNodeGroupChargeTypeRequest {
  @SerializedName("ChargePreConfig")
  private ChargePreConfigForUpdateNodeGroupChargeTypeInput chargePreConfig = null;

  @SerializedName("ChargeType")
  private String chargeType = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("NodeGroupIds")
  private List<String> nodeGroupIds = null;

  public UpdateNodeGroupChargeTypeRequest chargePreConfig(ChargePreConfigForUpdateNodeGroupChargeTypeInput chargePreConfig) {
    this.chargePreConfig = chargePreConfig;
    return this;
  }

   /**
   * Get chargePreConfig
   * @return chargePreConfig
  **/
  @Valid
  @Schema(description = "")
  public ChargePreConfigForUpdateNodeGroupChargeTypeInput getChargePreConfig() {
    return chargePreConfig;
  }

  public void setChargePreConfig(ChargePreConfigForUpdateNodeGroupChargeTypeInput chargePreConfig) {
    this.chargePreConfig = chargePreConfig;
  }

  public UpdateNodeGroupChargeTypeRequest chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  public UpdateNodeGroupChargeTypeRequest clientToken(String clientToken) {
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

  public UpdateNodeGroupChargeTypeRequest clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public UpdateNodeGroupChargeTypeRequest nodeGroupIds(List<String> nodeGroupIds) {
    this.nodeGroupIds = nodeGroupIds;
    return this;
  }

  public UpdateNodeGroupChargeTypeRequest addNodeGroupIdsItem(String nodeGroupIdsItem) {
    if (this.nodeGroupIds == null) {
      this.nodeGroupIds = new ArrayList<String>();
    }
    this.nodeGroupIds.add(nodeGroupIdsItem);
    return this;
  }

   /**
   * Get nodeGroupIds
   * @return nodeGroupIds
  **/
  @Schema(description = "")
  public List<String> getNodeGroupIds() {
    return nodeGroupIds;
  }

  public void setNodeGroupIds(List<String> nodeGroupIds) {
    this.nodeGroupIds = nodeGroupIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateNodeGroupChargeTypeRequest updateNodeGroupChargeTypeRequest = (UpdateNodeGroupChargeTypeRequest) o;
    return Objects.equals(this.chargePreConfig, updateNodeGroupChargeTypeRequest.chargePreConfig) &&
        Objects.equals(this.chargeType, updateNodeGroupChargeTypeRequest.chargeType) &&
        Objects.equals(this.clientToken, updateNodeGroupChargeTypeRequest.clientToken) &&
        Objects.equals(this.clusterId, updateNodeGroupChargeTypeRequest.clusterId) &&
        Objects.equals(this.nodeGroupIds, updateNodeGroupChargeTypeRequest.nodeGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargePreConfig, chargeType, clientToken, clusterId, nodeGroupIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateNodeGroupChargeTypeRequest {\n");
    
    sb.append("    chargePreConfig: ").append(toIndentedString(chargePreConfig)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    nodeGroupIds: ").append(toIndentedString(nodeGroupIds)).append("\n");
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
