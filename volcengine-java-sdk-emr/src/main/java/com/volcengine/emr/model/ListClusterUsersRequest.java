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
 * ListClusterUsersRequest
 */



public class ListClusterUsersRequest {
  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("CreateTimeOrder")
  private String createTimeOrder = null;

  @SerializedName("CreateorName")
  private String createorName = null;

  @SerializedName("Keyword")
  private String keyword = null;

  @SerializedName("UpdateTimeOrder")
  private String updateTimeOrder = null;

  @SerializedName("UserGroupName")
  private String userGroupName = null;

  @SerializedName("UserName")
  private String userName = null;

  @SerializedName("UserNameOrder")
  private String userNameOrder = null;

  @SerializedName("UserNames")
  private List<String> userNames = null;

  public ListClusterUsersRequest clusterId(String clusterId) {
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

  public ListClusterUsersRequest createTimeOrder(String createTimeOrder) {
    this.createTimeOrder = createTimeOrder;
    return this;
  }

   /**
   * Get createTimeOrder
   * @return createTimeOrder
  **/
  @Schema(description = "")
  public String getCreateTimeOrder() {
    return createTimeOrder;
  }

  public void setCreateTimeOrder(String createTimeOrder) {
    this.createTimeOrder = createTimeOrder;
  }

  public ListClusterUsersRequest createorName(String createorName) {
    this.createorName = createorName;
    return this;
  }

   /**
   * Get createorName
   * @return createorName
  **/
  @Schema(description = "")
  public String getCreateorName() {
    return createorName;
  }

  public void setCreateorName(String createorName) {
    this.createorName = createorName;
  }

  public ListClusterUsersRequest keyword(String keyword) {
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

  public ListClusterUsersRequest updateTimeOrder(String updateTimeOrder) {
    this.updateTimeOrder = updateTimeOrder;
    return this;
  }

   /**
   * Get updateTimeOrder
   * @return updateTimeOrder
  **/
  @Schema(description = "")
  public String getUpdateTimeOrder() {
    return updateTimeOrder;
  }

  public void setUpdateTimeOrder(String updateTimeOrder) {
    this.updateTimeOrder = updateTimeOrder;
  }

  public ListClusterUsersRequest userGroupName(String userGroupName) {
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

  public ListClusterUsersRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @Schema(description = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public ListClusterUsersRequest userNameOrder(String userNameOrder) {
    this.userNameOrder = userNameOrder;
    return this;
  }

   /**
   * Get userNameOrder
   * @return userNameOrder
  **/
  @Schema(description = "")
  public String getUserNameOrder() {
    return userNameOrder;
  }

  public void setUserNameOrder(String userNameOrder) {
    this.userNameOrder = userNameOrder;
  }

  public ListClusterUsersRequest userNames(List<String> userNames) {
    this.userNames = userNames;
    return this;
  }

  public ListClusterUsersRequest addUserNamesItem(String userNamesItem) {
    if (this.userNames == null) {
      this.userNames = new ArrayList<String>();
    }
    this.userNames.add(userNamesItem);
    return this;
  }

   /**
   * Get userNames
   * @return userNames
  **/
  @Schema(description = "")
  public List<String> getUserNames() {
    return userNames;
  }

  public void setUserNames(List<String> userNames) {
    this.userNames = userNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListClusterUsersRequest listClusterUsersRequest = (ListClusterUsersRequest) o;
    return Objects.equals(this.clusterId, listClusterUsersRequest.clusterId) &&
        Objects.equals(this.createTimeOrder, listClusterUsersRequest.createTimeOrder) &&
        Objects.equals(this.createorName, listClusterUsersRequest.createorName) &&
        Objects.equals(this.keyword, listClusterUsersRequest.keyword) &&
        Objects.equals(this.updateTimeOrder, listClusterUsersRequest.updateTimeOrder) &&
        Objects.equals(this.userGroupName, listClusterUsersRequest.userGroupName) &&
        Objects.equals(this.userName, listClusterUsersRequest.userName) &&
        Objects.equals(this.userNameOrder, listClusterUsersRequest.userNameOrder) &&
        Objects.equals(this.userNames, listClusterUsersRequest.userNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, createTimeOrder, createorName, keyword, updateTimeOrder, userGroupName, userName, userNameOrder, userNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListClusterUsersRequest {\n");
    
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    createTimeOrder: ").append(toIndentedString(createTimeOrder)).append("\n");
    sb.append("    createorName: ").append(toIndentedString(createorName)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    updateTimeOrder: ").append(toIndentedString(updateTimeOrder)).append("\n");
    sb.append("    userGroupName: ").append(toIndentedString(userGroupName)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userNameOrder: ").append(toIndentedString(userNameOrder)).append("\n");
    sb.append("    userNames: ").append(toIndentedString(userNames)).append("\n");
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
