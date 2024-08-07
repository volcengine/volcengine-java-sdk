/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.autoscaling.model;

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
 * ServerGroupAttributeForDetachServerGroupsInput
 */


public class ServerGroupAttributeForDetachServerGroupsInput {
  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  @SerializedName("Type")
  private String type = null;

  public ServerGroupAttributeForDetachServerGroupsInput port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public ServerGroupAttributeForDetachServerGroupsInput serverGroupId(String serverGroupId) {
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

  public ServerGroupAttributeForDetachServerGroupsInput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerGroupAttributeForDetachServerGroupsInput serverGroupAttributeForDetachServerGroupsInput = (ServerGroupAttributeForDetachServerGroupsInput) o;
    return Objects.equals(this.port, serverGroupAttributeForDetachServerGroupsInput.port) &&
        Objects.equals(this.serverGroupId, serverGroupAttributeForDetachServerGroupsInput.serverGroupId) &&
        Objects.equals(this.type, serverGroupAttributeForDetachServerGroupsInput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(port, serverGroupId, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerGroupAttributeForDetachServerGroupsInput {\n");
    
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
