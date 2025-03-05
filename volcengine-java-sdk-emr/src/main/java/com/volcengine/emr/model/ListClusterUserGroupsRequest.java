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
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListClusterUserGroupsRequest
 */



public class ListClusterUserGroupsRequest {
  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("Keyword")
  private String keyword = null;

  @SerializedName("UserGroupName")
  private String userGroupName = null;

  public ListClusterUserGroupsRequest clusterId(String clusterId) {
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

  public ListClusterUserGroupsRequest keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * Get keyword
   * @return keyword
  **/
  @Schema(description = "")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public ListClusterUserGroupsRequest userGroupName(String userGroupName) {
    this.userGroupName = userGroupName;
    return this;
  }

   /**
   * Get userGroupName
   * @return userGroupName
  **/
  @Schema(description = "")
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
    ListClusterUserGroupsRequest listClusterUserGroupsRequest = (ListClusterUserGroupsRequest) o;
    return Objects.equals(this.clusterId, listClusterUserGroupsRequest.clusterId) &&
        Objects.equals(this.keyword, listClusterUserGroupsRequest.keyword) &&
        Objects.equals(this.userGroupName, listClusterUserGroupsRequest.userGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, keyword, userGroupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListClusterUserGroupsRequest {\n");
    
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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
