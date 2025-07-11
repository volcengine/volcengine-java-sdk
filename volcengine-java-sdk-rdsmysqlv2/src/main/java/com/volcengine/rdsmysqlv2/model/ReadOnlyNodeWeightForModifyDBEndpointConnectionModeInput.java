/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

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
 * ReadOnlyNodeWeightForModifyDBEndpointConnectionModeInput
 */



public class ReadOnlyNodeWeightForModifyDBEndpointConnectionModeInput {
  @SerializedName("NodeId")
  private String nodeId = null;

  @SerializedName("NodeType")
  private String nodeType = null;

  @SerializedName("Weight")
  private Integer weight = null;

  public ReadOnlyNodeWeightForModifyDBEndpointConnectionModeInput nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @Schema(description = "")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public ReadOnlyNodeWeightForModifyDBEndpointConnectionModeInput nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @Schema(description = "")
  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public ReadOnlyNodeWeightForModifyDBEndpointConnectionModeInput weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @Schema(description = "")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadOnlyNodeWeightForModifyDBEndpointConnectionModeInput readOnlyNodeWeightForModifyDBEndpointConnectionModeInput = (ReadOnlyNodeWeightForModifyDBEndpointConnectionModeInput) o;
    return Objects.equals(this.nodeId, readOnlyNodeWeightForModifyDBEndpointConnectionModeInput.nodeId) &&
        Objects.equals(this.nodeType, readOnlyNodeWeightForModifyDBEndpointConnectionModeInput.nodeType) &&
        Objects.equals(this.weight, readOnlyNodeWeightForModifyDBEndpointConnectionModeInput.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, nodeType, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadOnlyNodeWeightForModifyDBEndpointConnectionModeInput {\n");
    
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
