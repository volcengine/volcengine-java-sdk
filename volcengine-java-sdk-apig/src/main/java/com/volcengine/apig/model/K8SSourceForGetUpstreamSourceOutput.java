/*
 * apig
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.apig.model;

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
 * K8SSourceForGetUpstreamSourceOutput
 */



public class K8SSourceForGetUpstreamSourceOutput {
  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("ClusterType")
  private String clusterType = null;

  public K8SSourceForGetUpstreamSourceOutput clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @Schema(description = "")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public K8SSourceForGetUpstreamSourceOutput clusterType(String clusterType) {
    this.clusterType = clusterType;
    return this;
  }

   /**
   * Get clusterType
   * @return clusterType
  **/
  @Schema(description = "")
  public String getClusterType() {
    return clusterType;
  }

  public void setClusterType(String clusterType) {
    this.clusterType = clusterType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    K8SSourceForGetUpstreamSourceOutput k8SSourceForGetUpstreamSourceOutput = (K8SSourceForGetUpstreamSourceOutput) o;
    return Objects.equals(this.clusterId, k8SSourceForGetUpstreamSourceOutput.clusterId) &&
        Objects.equals(this.clusterType, k8SSourceForGetUpstreamSourceOutput.clusterType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, clusterType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class K8SSourceForGetUpstreamSourceOutput {\n");
    
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
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
