/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.directconnect.model;

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
 * DescribeSharedDirectConnectConnectionsRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T20:23:22.987183+08:00[Asia/Shanghai]")
public class DescribeSharedDirectConnectConnectionsRequest {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ParentConnectionId")
  private String parentConnectionId = null;

  @SerializedName("SharedDirectConnectConnectionIds")
  private List<String> sharedDirectConnectConnectionIds = null;

  @SerializedName("SharedDirectConnectConnectionName")
  private String sharedDirectConnectConnectionName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UserAccountId")
  private String userAccountId = null;

  @SerializedName("VlanId")
  private Integer vlanId = null;

  public DescribeSharedDirectConnectConnectionsRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeSharedDirectConnectConnectionsRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeSharedDirectConnectConnectionsRequest parentConnectionId(String parentConnectionId) {
    this.parentConnectionId = parentConnectionId;
    return this;
  }

   /**
   * Get parentConnectionId
   * @return parentConnectionId
  **/
  @Schema(description = "")
  public String getParentConnectionId() {
    return parentConnectionId;
  }

  public void setParentConnectionId(String parentConnectionId) {
    this.parentConnectionId = parentConnectionId;
  }

  public DescribeSharedDirectConnectConnectionsRequest sharedDirectConnectConnectionIds(List<String> sharedDirectConnectConnectionIds) {
    this.sharedDirectConnectConnectionIds = sharedDirectConnectConnectionIds;
    return this;
  }

  public DescribeSharedDirectConnectConnectionsRequest addSharedDirectConnectConnectionIdsItem(String sharedDirectConnectConnectionIdsItem) {
    if (this.sharedDirectConnectConnectionIds == null) {
      this.sharedDirectConnectConnectionIds = new ArrayList<String>();
    }
    this.sharedDirectConnectConnectionIds.add(sharedDirectConnectConnectionIdsItem);
    return this;
  }

   /**
   * Get sharedDirectConnectConnectionIds
   * @return sharedDirectConnectConnectionIds
  **/
  @Schema(description = "")
  public List<String> getSharedDirectConnectConnectionIds() {
    return sharedDirectConnectConnectionIds;
  }

  public void setSharedDirectConnectConnectionIds(List<String> sharedDirectConnectConnectionIds) {
    this.sharedDirectConnectConnectionIds = sharedDirectConnectConnectionIds;
  }

  public DescribeSharedDirectConnectConnectionsRequest sharedDirectConnectConnectionName(String sharedDirectConnectConnectionName) {
    this.sharedDirectConnectConnectionName = sharedDirectConnectConnectionName;
    return this;
  }

   /**
   * Get sharedDirectConnectConnectionName
   * @return sharedDirectConnectConnectionName
  **/
  @Schema(description = "")
  public String getSharedDirectConnectConnectionName() {
    return sharedDirectConnectConnectionName;
  }

  public void setSharedDirectConnectConnectionName(String sharedDirectConnectConnectionName) {
    this.sharedDirectConnectConnectionName = sharedDirectConnectConnectionName;
  }

  public DescribeSharedDirectConnectConnectionsRequest status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DescribeSharedDirectConnectConnectionsRequest userAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
    return this;
  }

   /**
   * Get userAccountId
   * @return userAccountId
  **/
  @Schema(description = "")
  public String getUserAccountId() {
    return userAccountId;
  }

  public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
  }

  public DescribeSharedDirectConnectConnectionsRequest vlanId(Integer vlanId) {
    this.vlanId = vlanId;
    return this;
  }

   /**
   * Get vlanId
   * @return vlanId
  **/
  @Schema(description = "")
  public Integer getVlanId() {
    return vlanId;
  }

  public void setVlanId(Integer vlanId) {
    this.vlanId = vlanId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeSharedDirectConnectConnectionsRequest describeSharedDirectConnectConnectionsRequest = (DescribeSharedDirectConnectConnectionsRequest) o;
    return Objects.equals(this.pageNumber, describeSharedDirectConnectConnectionsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeSharedDirectConnectConnectionsRequest.pageSize) &&
        Objects.equals(this.parentConnectionId, describeSharedDirectConnectConnectionsRequest.parentConnectionId) &&
        Objects.equals(this.sharedDirectConnectConnectionIds, describeSharedDirectConnectConnectionsRequest.sharedDirectConnectConnectionIds) &&
        Objects.equals(this.sharedDirectConnectConnectionName, describeSharedDirectConnectConnectionsRequest.sharedDirectConnectConnectionName) &&
        Objects.equals(this.status, describeSharedDirectConnectConnectionsRequest.status) &&
        Objects.equals(this.userAccountId, describeSharedDirectConnectConnectionsRequest.userAccountId) &&
        Objects.equals(this.vlanId, describeSharedDirectConnectConnectionsRequest.vlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, parentConnectionId, sharedDirectConnectConnectionIds, sharedDirectConnectConnectionName, status, userAccountId, vlanId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSharedDirectConnectConnectionsRequest {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    parentConnectionId: ").append(toIndentedString(parentConnectionId)).append("\n");
    sb.append("    sharedDirectConnectConnectionIds: ").append(toIndentedString(sharedDirectConnectConnectionIds)).append("\n");
    sb.append("    sharedDirectConnectConnectionName: ").append(toIndentedString(sharedDirectConnectConnectionName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userAccountId: ").append(toIndentedString(userAccountId)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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
