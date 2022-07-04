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
import com.volcengine.autoscaling.model.ServerGroupAttributeForAttachServerGroupsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AttachServerGroupsRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-04T12:08:52.868690+08:00[Asia/Shanghai]")
public class AttachServerGroupsRequest {
  @SerializedName("ScalingGroupId")
  private String scalingGroupId = null;

  @SerializedName("ServerGroupAttributes")
  private List<ServerGroupAttributeForAttachServerGroupsInput> serverGroupAttributes = null;

  public AttachServerGroupsRequest scalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
    return this;
  }

   /**
   * Get scalingGroupId
   * @return scalingGroupId
  **/
  @Schema(description = "")
  public String getScalingGroupId() {
    return scalingGroupId;
  }

  public void setScalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
  }

  public AttachServerGroupsRequest serverGroupAttributes(List<ServerGroupAttributeForAttachServerGroupsInput> serverGroupAttributes) {
    this.serverGroupAttributes = serverGroupAttributes;
    return this;
  }

  public AttachServerGroupsRequest addServerGroupAttributesItem(ServerGroupAttributeForAttachServerGroupsInput serverGroupAttributesItem) {
    if (this.serverGroupAttributes == null) {
      this.serverGroupAttributes = new ArrayList<ServerGroupAttributeForAttachServerGroupsInput>();
    }
    this.serverGroupAttributes.add(serverGroupAttributesItem);
    return this;
  }

   /**
   * Get serverGroupAttributes
   * @return serverGroupAttributes
  **/
  @Valid
  @Schema(description = "")
  public List<ServerGroupAttributeForAttachServerGroupsInput> getServerGroupAttributes() {
    return serverGroupAttributes;
  }

  public void setServerGroupAttributes(List<ServerGroupAttributeForAttachServerGroupsInput> serverGroupAttributes) {
    this.serverGroupAttributes = serverGroupAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachServerGroupsRequest attachServerGroupsRequest = (AttachServerGroupsRequest) o;
    return Objects.equals(this.scalingGroupId, attachServerGroupsRequest.scalingGroupId) &&
        Objects.equals(this.serverGroupAttributes, attachServerGroupsRequest.serverGroupAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scalingGroupId, serverGroupAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachServerGroupsRequest {\n");
    
    sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
    sb.append("    serverGroupAttributes: ").append(toIndentedString(serverGroupAttributes)).append("\n");
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
