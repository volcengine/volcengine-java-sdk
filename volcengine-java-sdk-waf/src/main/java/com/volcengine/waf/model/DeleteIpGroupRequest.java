/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

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
 * DeleteIpGroupRequest
 */



public class DeleteIpGroupRequest {
  @SerializedName("IpGroupIds")
  private List<Integer> ipGroupIds = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  public DeleteIpGroupRequest ipGroupIds(List<Integer> ipGroupIds) {
    this.ipGroupIds = ipGroupIds;
    return this;
  }

  public DeleteIpGroupRequest addIpGroupIdsItem(Integer ipGroupIdsItem) {
    if (this.ipGroupIds == null) {
      this.ipGroupIds = new ArrayList<Integer>();
    }
    this.ipGroupIds.add(ipGroupIdsItem);
    return this;
  }

   /**
   * Get ipGroupIds
   * @return ipGroupIds
  **/
  @Schema(description = "")
  public List<Integer> getIpGroupIds() {
    return ipGroupIds;
  }

  public void setIpGroupIds(List<Integer> ipGroupIds) {
    this.ipGroupIds = ipGroupIds;
  }

  public DeleteIpGroupRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteIpGroupRequest deleteIpGroupRequest = (DeleteIpGroupRequest) o;
    return Objects.equals(this.ipGroupIds, deleteIpGroupRequest.ipGroupIds) &&
        Objects.equals(this.projectName, deleteIpGroupRequest.projectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipGroupIds, projectName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteIpGroupRequest {\n");
    
    sb.append("    ipGroupIds: ").append(toIndentedString(ipGroupIds)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
