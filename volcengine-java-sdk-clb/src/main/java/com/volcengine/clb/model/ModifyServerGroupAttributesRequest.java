/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.clb.model.ServerForModifyServerGroupAttributesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyServerGroupAttributesRequest
 */



public class ModifyServerGroupAttributesRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  @SerializedName("ServerGroupName")
  private String serverGroupName = null;

  @SerializedName("Servers")
  private List<ServerForModifyServerGroupAttributesInput> servers = null;

  public ModifyServerGroupAttributesRequest description(String description) {
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

  public ModifyServerGroupAttributesRequest serverGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
    return this;
  }

   /**
   * Get serverGroupId
   * @return serverGroupId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getServerGroupId() {
    return serverGroupId;
  }

  public void setServerGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
  }

  public ModifyServerGroupAttributesRequest serverGroupName(String serverGroupName) {
    this.serverGroupName = serverGroupName;
    return this;
  }

   /**
   * Get serverGroupName
   * @return serverGroupName
  **/
  @Schema(description = "")
  public String getServerGroupName() {
    return serverGroupName;
  }

  public void setServerGroupName(String serverGroupName) {
    this.serverGroupName = serverGroupName;
  }

  public ModifyServerGroupAttributesRequest servers(List<ServerForModifyServerGroupAttributesInput> servers) {
    this.servers = servers;
    return this;
  }

  public ModifyServerGroupAttributesRequest addServersItem(ServerForModifyServerGroupAttributesInput serversItem) {
    if (this.servers == null) {
      this.servers = new ArrayList<ServerForModifyServerGroupAttributesInput>();
    }
    this.servers.add(serversItem);
    return this;
  }

   /**
   * Get servers
   * @return servers
  **/
  @Valid
  @Schema(description = "")
  public List<ServerForModifyServerGroupAttributesInput> getServers() {
    return servers;
  }

  public void setServers(List<ServerForModifyServerGroupAttributesInput> servers) {
    this.servers = servers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyServerGroupAttributesRequest modifyServerGroupAttributesRequest = (ModifyServerGroupAttributesRequest) o;
    return Objects.equals(this.description, modifyServerGroupAttributesRequest.description) &&
        Objects.equals(this.serverGroupId, modifyServerGroupAttributesRequest.serverGroupId) &&
        Objects.equals(this.serverGroupName, modifyServerGroupAttributesRequest.serverGroupName) &&
        Objects.equals(this.servers, modifyServerGroupAttributesRequest.servers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, serverGroupId, serverGroupName, servers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyServerGroupAttributesRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
    sb.append("    serverGroupName: ").append(toIndentedString(serverGroupName)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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
