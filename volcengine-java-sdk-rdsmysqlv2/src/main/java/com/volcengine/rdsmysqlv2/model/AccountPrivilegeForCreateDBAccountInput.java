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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AccountPrivilegeForCreateDBAccountInput
 */



public class AccountPrivilegeForCreateDBAccountInput {
  @SerializedName("AccountPrivilege")
  private String accountPrivilege = null;

  @SerializedName("AccountPrivilegeDetail")
  private String accountPrivilegeDetail = null;

  @SerializedName("DBName")
  private String dbName = null;

  public AccountPrivilegeForCreateDBAccountInput accountPrivilege(String accountPrivilege) {
    this.accountPrivilege = accountPrivilege;
    return this;
  }

   /**
   * Get accountPrivilege
   * @return accountPrivilege
  **/
  @Schema(description = "")
  public String getAccountPrivilege() {
    return accountPrivilege;
  }

  public void setAccountPrivilege(String accountPrivilege) {
    this.accountPrivilege = accountPrivilege;
  }

  public AccountPrivilegeForCreateDBAccountInput accountPrivilegeDetail(String accountPrivilegeDetail) {
    this.accountPrivilegeDetail = accountPrivilegeDetail;
    return this;
  }

   /**
   * Get accountPrivilegeDetail
   * @return accountPrivilegeDetail
  **/
  @Schema(description = "")
  public String getAccountPrivilegeDetail() {
    return accountPrivilegeDetail;
  }

  public void setAccountPrivilegeDetail(String accountPrivilegeDetail) {
    this.accountPrivilegeDetail = accountPrivilegeDetail;
  }

  public AccountPrivilegeForCreateDBAccountInput dbName(String dbName) {
    this.dbName = dbName;
    return this;
  }

   /**
   * Get dbName
   * @return dbName
  **/
  @Schema(description = "")
  public String getDbName() {
    return dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPrivilegeForCreateDBAccountInput accountPrivilegeForCreateDBAccountInput = (AccountPrivilegeForCreateDBAccountInput) o;
    return Objects.equals(this.accountPrivilege, accountPrivilegeForCreateDBAccountInput.accountPrivilege) &&
        Objects.equals(this.accountPrivilegeDetail, accountPrivilegeForCreateDBAccountInput.accountPrivilegeDetail) &&
        Objects.equals(this.dbName, accountPrivilegeForCreateDBAccountInput.dbName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountPrivilege, accountPrivilegeDetail, dbName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPrivilegeForCreateDBAccountInput {\n");
    
    sb.append("    accountPrivilege: ").append(toIndentedString(accountPrivilege)).append("\n");
    sb.append("    accountPrivilegeDetail: ").append(toIndentedString(accountPrivilegeDetail)).append("\n");
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
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
