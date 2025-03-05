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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateClusterUserGroupRequest
 */



public class CreateClusterUserGroupRequest {
  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Members")
  private List<String> members = null;

  @SerializedName("UserGroupName")
  private String userGroupName = null;

  public CreateClusterUserGroupRequest clusterId(String clusterId) {
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

  public CreateClusterUserGroupRequest description(String description) {
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

  public CreateClusterUserGroupRequest members(List<String> members) {
    this.members = members;
    return this;
  }

  public CreateClusterUserGroupRequest addMembersItem(String membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<String>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @Schema(description = "")
  public List<String> getMembers() {
    return members;
  }

  public void setMembers(List<String> members) {
    this.members = members;
  }

  public CreateClusterUserGroupRequest userGroupName(String userGroupName) {
    this.userGroupName = userGroupName;
    return this;
  }

   /**
   * Get userGroupName
   * @return userGroupName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getUserGroupName() {
    return userGroupName;
  }

  public void setUserGroupName(String userGroupName) {
    this.userGroupName = userGroupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClusterUserGroupRequest createClusterUserGroupRequest = (CreateClusterUserGroupRequest) o;
    return Objects.equals(this.clusterId, createClusterUserGroupRequest.clusterId) &&
        Objects.equals(this.description, createClusterUserGroupRequest.description) &&
        Objects.equals(this.members, createClusterUserGroupRequest.members) &&
        Objects.equals(this.userGroupName, createClusterUserGroupRequest.userGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, description, members, userGroupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClusterUserGroupRequest {\n");
    
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    userGroupName: ").append(toIndentedString(userGroupName)).append("\n");
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
