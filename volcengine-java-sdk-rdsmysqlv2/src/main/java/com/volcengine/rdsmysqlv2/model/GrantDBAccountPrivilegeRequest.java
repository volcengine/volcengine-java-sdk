/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysqlv2.model.AccountPrivilegeForGrantDBAccountPrivilegeInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GrantDBAccountPrivilegeRequest
 */


public class GrantDBAccountPrivilegeRequest {
  @SerializedName("AccountName")
  private String accountName = null;

  @SerializedName("AccountPrivileges")
  private List<AccountPrivilegeForGrantDBAccountPrivilegeInput> accountPrivileges = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  public GrantDBAccountPrivilegeRequest accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @NotNull
 @Size(min=2,max=32)  @Schema(required = true, description = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public GrantDBAccountPrivilegeRequest accountPrivileges(List<AccountPrivilegeForGrantDBAccountPrivilegeInput> accountPrivileges) {
    this.accountPrivileges = accountPrivileges;
    return this;
  }

  public GrantDBAccountPrivilegeRequest addAccountPrivilegesItem(AccountPrivilegeForGrantDBAccountPrivilegeInput accountPrivilegesItem) {
    if (this.accountPrivileges == null) {
      this.accountPrivileges = new ArrayList<AccountPrivilegeForGrantDBAccountPrivilegeInput>();
    }
    this.accountPrivileges.add(accountPrivilegesItem);
    return this;
  }

   /**
   * Get accountPrivileges
   * @return accountPrivileges
  **/
  @Valid
  @Schema(description = "")
  public List<AccountPrivilegeForGrantDBAccountPrivilegeInput> getAccountPrivileges() {
    return accountPrivileges;
  }

  public void setAccountPrivileges(List<AccountPrivilegeForGrantDBAccountPrivilegeInput> accountPrivileges) {
    this.accountPrivileges = accountPrivileges;
  }

  public GrantDBAccountPrivilegeRequest instanceId(String instanceId) {
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
    GrantDBAccountPrivilegeRequest grantDBAccountPrivilegeRequest = (GrantDBAccountPrivilegeRequest) o;
    return Objects.equals(this.accountName, grantDBAccountPrivilegeRequest.accountName) &&
        Objects.equals(this.accountPrivileges, grantDBAccountPrivilegeRequest.accountPrivileges) &&
        Objects.equals(this.instanceId, grantDBAccountPrivilegeRequest.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, accountPrivileges, instanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrantDBAccountPrivilegeRequest {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountPrivileges: ").append(toIndentedString(accountPrivileges)).append("\n");
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
