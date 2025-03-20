/*
 * rds_postgresql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdspostgresql.model;

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
 * ResetDBAccountRequest
 */



public class ResetDBAccountRequest {
  @SerializedName("AccountName")
  private String accountName = null;

  @SerializedName("AccountPassword")
  private String accountPassword = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  public ResetDBAccountRequest accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public ResetDBAccountRequest accountPassword(String accountPassword) {
    this.accountPassword = accountPassword;
    return this;
  }

   /**
   * Get accountPassword
   * @return accountPassword
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAccountPassword() {
    return accountPassword;
  }

  public void setAccountPassword(String accountPassword) {
    this.accountPassword = accountPassword;
  }

  public ResetDBAccountRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetDBAccountRequest resetDBAccountRequest = (ResetDBAccountRequest) o;
    return Objects.equals(this.accountName, resetDBAccountRequest.accountName) &&
        Objects.equals(this.accountPassword, resetDBAccountRequest.accountPassword) &&
        Objects.equals(this.instanceId, resetDBAccountRequest.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, accountPassword, instanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetDBAccountRequest {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountPassword: ").append(toIndentedString(accountPassword)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
