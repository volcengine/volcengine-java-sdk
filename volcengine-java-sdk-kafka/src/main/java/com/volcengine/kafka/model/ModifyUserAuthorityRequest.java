/*
 * kafka
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.kafka.model;

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
 * ModifyUserAuthorityRequest
 */


public class ModifyUserAuthorityRequest {
  @SerializedName("AllAuthority")
  private Boolean allAuthority = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("UserName")
  private String userName = null;

  public ModifyUserAuthorityRequest allAuthority(Boolean allAuthority) {
    this.allAuthority = allAuthority;
    return this;
  }

   /**
   * Get allAuthority
   * @return allAuthority
  **/
  @Schema(description = "")
  public Boolean isAllAuthority() {
    return allAuthority;
  }

  public void setAllAuthority(Boolean allAuthority) {
    this.allAuthority = allAuthority;
  }

  public ModifyUserAuthorityRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ModifyUserAuthorityRequest userName(String userName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyUserAuthorityRequest modifyUserAuthorityRequest = (ModifyUserAuthorityRequest) o;
    return Objects.equals(this.allAuthority, modifyUserAuthorityRequest.allAuthority) &&
        Objects.equals(this.instanceId, modifyUserAuthorityRequest.instanceId) &&
        Objects.equals(this.userName, modifyUserAuthorityRequest.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allAuthority, instanceId, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyUserAuthorityRequest {\n");
    
    sb.append("    allAuthority: ").append(toIndentedString(allAuthority)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
