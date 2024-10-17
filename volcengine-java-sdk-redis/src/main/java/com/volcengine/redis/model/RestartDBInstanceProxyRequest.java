/*
 * redis
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.redis.model;

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
 * RestartDBInstanceProxyRequest
 */



public class RestartDBInstanceProxyRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("ProxyNodeIds")
  private List<String> proxyNodeIds = null;

  public RestartDBInstanceProxyRequest clientToken(String clientToken) {
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

  public RestartDBInstanceProxyRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public RestartDBInstanceProxyRequest proxyNodeIds(List<String> proxyNodeIds) {
    this.proxyNodeIds = proxyNodeIds;
    return this;
  }

  public RestartDBInstanceProxyRequest addProxyNodeIdsItem(String proxyNodeIdsItem) {
    if (this.proxyNodeIds == null) {
      this.proxyNodeIds = new ArrayList<String>();
    }
    this.proxyNodeIds.add(proxyNodeIdsItem);
    return this;
  }

   /**
   * Get proxyNodeIds
   * @return proxyNodeIds
  **/
  @Schema(description = "")
  public List<String> getProxyNodeIds() {
    return proxyNodeIds;
  }

  public void setProxyNodeIds(List<String> proxyNodeIds) {
    this.proxyNodeIds = proxyNodeIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestartDBInstanceProxyRequest restartDBInstanceProxyRequest = (RestartDBInstanceProxyRequest) o;
    return Objects.equals(this.clientToken, restartDBInstanceProxyRequest.clientToken) &&
        Objects.equals(this.instanceId, restartDBInstanceProxyRequest.instanceId) &&
        Objects.equals(this.proxyNodeIds, restartDBInstanceProxyRequest.proxyNodeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, instanceId, proxyNodeIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestartDBInstanceProxyRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    proxyNodeIds: ").append(toIndentedString(proxyNodeIds)).append("\n");
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