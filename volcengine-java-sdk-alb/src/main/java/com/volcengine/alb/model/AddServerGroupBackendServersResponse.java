/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

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
 * AddServerGroupBackendServersResponse
 */



public class AddServerGroupBackendServersResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("ServerIds")
  private List<String> serverIds = null;

  public AddServerGroupBackendServersResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public AddServerGroupBackendServersResponse serverIds(List<String> serverIds) {
    this.serverIds = serverIds;
    return this;
  }

  public AddServerGroupBackendServersResponse addServerIdsItem(String serverIdsItem) {
    if (this.serverIds == null) {
      this.serverIds = new ArrayList<String>();
    }
    this.serverIds.add(serverIdsItem);
    return this;
  }

   /**
   * Get serverIds
   * @return serverIds
  **/
  @Schema(description = "")
  public List<String> getServerIds() {
    return serverIds;
  }

  public void setServerIds(List<String> serverIds) {
    this.serverIds = serverIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddServerGroupBackendServersResponse addServerGroupBackendServersResponse = (AddServerGroupBackendServersResponse) o;
    return Objects.equals(this.requestId, addServerGroupBackendServersResponse.requestId) &&
        Objects.equals(this.serverIds, addServerGroupBackendServersResponse.serverIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, serverIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddServerGroupBackendServersResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
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
