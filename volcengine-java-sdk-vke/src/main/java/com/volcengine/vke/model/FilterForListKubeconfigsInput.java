/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

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
 * FilterForListKubeconfigsInput
 */


public class FilterForListKubeconfigsInput {
  @SerializedName("ClusterIds")
  private List<String> clusterIds = null;

  @SerializedName("Ids")
  private List<String> ids = null;

  @SerializedName("RoleIds")
  private List<Long> roleIds = null;

  @SerializedName("Types")
  private List<String> types = null;

  @SerializedName("UserIds")
  private List<Long> userIds = null;

  public FilterForListKubeconfigsInput clusterIds(List<String> clusterIds) {
    this.clusterIds = clusterIds;
    return this;
  }

  public FilterForListKubeconfigsInput addClusterIdsItem(String clusterIdsItem) {
    if (this.clusterIds == null) {
      this.clusterIds = new ArrayList<String>();
    }
    this.clusterIds.add(clusterIdsItem);
    return this;
  }

   /**
   * Get clusterIds
   * @return clusterIds
  **/
  @Schema(description = "")
  public List<String> getClusterIds() {
    return clusterIds;
  }

  public void setClusterIds(List<String> clusterIds) {
    this.clusterIds = clusterIds;
  }

  public FilterForListKubeconfigsInput ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public FilterForListKubeconfigsInput addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<String>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  @Schema(description = "")
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  public FilterForListKubeconfigsInput roleIds(List<Long> roleIds) {
    this.roleIds = roleIds;
    return this;
  }

  public FilterForListKubeconfigsInput addRoleIdsItem(Long roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new ArrayList<Long>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

   /**
   * Get roleIds
   * @return roleIds
  **/
  @Schema(description = "")
  public List<Long> getRoleIds() {
    return roleIds;
  }

  public void setRoleIds(List<Long> roleIds) {
    this.roleIds = roleIds;
  }

  public FilterForListKubeconfigsInput types(List<String> types) {
    this.types = types;
    return this;
  }

  public FilterForListKubeconfigsInput addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<String>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @Schema(description = "")
  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }

  public FilterForListKubeconfigsInput userIds(List<Long> userIds) {
    this.userIds = userIds;
    return this;
  }

  public FilterForListKubeconfigsInput addUserIdsItem(Long userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<Long>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Get userIds
   * @return userIds
  **/
  @Schema(description = "")
  public List<Long> getUserIds() {
    return userIds;
  }

  public void setUserIds(List<Long> userIds) {
    this.userIds = userIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterForListKubeconfigsInput filterForListKubeconfigsInput = (FilterForListKubeconfigsInput) o;
    return Objects.equals(this.clusterIds, filterForListKubeconfigsInput.clusterIds) &&
        Objects.equals(this.ids, filterForListKubeconfigsInput.ids) &&
        Objects.equals(this.roleIds, filterForListKubeconfigsInput.roleIds) &&
        Objects.equals(this.types, filterForListKubeconfigsInput.types) &&
        Objects.equals(this.userIds, filterForListKubeconfigsInput.userIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterIds, ids, roleIds, types, userIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterForListKubeconfigsInput {\n");
    
    sb.append("    clusterIds: ").append(toIndentedString(clusterIds)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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
