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
import com.volcengine.rdsmysqlv2.model.AccountPrivilegeForDescribeDBAccountsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AccountForDescribeDBAccountsOutput
 */



public class AccountForDescribeDBAccountsOutput {
  @SerializedName("AccountDesc")
  private String accountDesc = null;

  @SerializedName("AccountName")
  private String accountName = null;

  @SerializedName("AccountPrivileges")
  private List<AccountPrivilegeForDescribeDBAccountsOutput> accountPrivileges = null;

  @SerializedName("AccountPrivilegesSQL")
  private List<String> accountPrivilegesSQL = null;

  @SerializedName("AccountStatus")
  private String accountStatus = null;

  @SerializedName("AccountType")
  private String accountType = null;

  @SerializedName("GlobalAccountPrivileges")
  private List<String> globalAccountPrivileges = null;

  @SerializedName("Host")
  private String host = null;

  public AccountForDescribeDBAccountsOutput accountDesc(String accountDesc) {
    this.accountDesc = accountDesc;
    return this;
  }

   /**
   * Get accountDesc
   * @return accountDesc
  **/
  @Schema(description = "")
  public String getAccountDesc() {
    return accountDesc;
  }

  public void setAccountDesc(String accountDesc) {
    this.accountDesc = accountDesc;
  }

  public AccountForDescribeDBAccountsOutput accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @Schema(description = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public AccountForDescribeDBAccountsOutput accountPrivileges(List<AccountPrivilegeForDescribeDBAccountsOutput> accountPrivileges) {
    this.accountPrivileges = accountPrivileges;
    return this;
  }

  public AccountForDescribeDBAccountsOutput addAccountPrivilegesItem(AccountPrivilegeForDescribeDBAccountsOutput accountPrivilegesItem) {
    if (this.accountPrivileges == null) {
      this.accountPrivileges = new ArrayList<AccountPrivilegeForDescribeDBAccountsOutput>();
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
  public List<AccountPrivilegeForDescribeDBAccountsOutput> getAccountPrivileges() {
    return accountPrivileges;
  }

  public void setAccountPrivileges(List<AccountPrivilegeForDescribeDBAccountsOutput> accountPrivileges) {
    this.accountPrivileges = accountPrivileges;
  }

  public AccountForDescribeDBAccountsOutput accountPrivilegesSQL(List<String> accountPrivilegesSQL) {
    this.accountPrivilegesSQL = accountPrivilegesSQL;
    return this;
  }

  public AccountForDescribeDBAccountsOutput addAccountPrivilegesSQLItem(String accountPrivilegesSQLItem) {
    if (this.accountPrivilegesSQL == null) {
      this.accountPrivilegesSQL = new ArrayList<String>();
    }
    this.accountPrivilegesSQL.add(accountPrivilegesSQLItem);
    return this;
  }

   /**
   * Get accountPrivilegesSQL
   * @return accountPrivilegesSQL
  **/
  @Schema(description = "")
  public List<String> getAccountPrivilegesSQL() {
    return accountPrivilegesSQL;
  }

  public void setAccountPrivilegesSQL(List<String> accountPrivilegesSQL) {
    this.accountPrivilegesSQL = accountPrivilegesSQL;
  }

  public AccountForDescribeDBAccountsOutput accountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Get accountStatus
   * @return accountStatus
  **/
  @Schema(description = "")
  public String getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }

  public AccountForDescribeDBAccountsOutput accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @Schema(description = "")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public AccountForDescribeDBAccountsOutput globalAccountPrivileges(List<String> globalAccountPrivileges) {
    this.globalAccountPrivileges = globalAccountPrivileges;
    return this;
  }

  public AccountForDescribeDBAccountsOutput addGlobalAccountPrivilegesItem(String globalAccountPrivilegesItem) {
    if (this.globalAccountPrivileges == null) {
      this.globalAccountPrivileges = new ArrayList<String>();
    }
    this.globalAccountPrivileges.add(globalAccountPrivilegesItem);
    return this;
  }

   /**
   * Get globalAccountPrivileges
   * @return globalAccountPrivileges
  **/
  @Schema(description = "")
  public List<String> getGlobalAccountPrivileges() {
    return globalAccountPrivileges;
  }

  public void setGlobalAccountPrivileges(List<String> globalAccountPrivileges) {
    this.globalAccountPrivileges = globalAccountPrivileges;
  }

  public AccountForDescribeDBAccountsOutput host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @Schema(description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountForDescribeDBAccountsOutput accountForDescribeDBAccountsOutput = (AccountForDescribeDBAccountsOutput) o;
    return Objects.equals(this.accountDesc, accountForDescribeDBAccountsOutput.accountDesc) &&
        Objects.equals(this.accountName, accountForDescribeDBAccountsOutput.accountName) &&
        Objects.equals(this.accountPrivileges, accountForDescribeDBAccountsOutput.accountPrivileges) &&
        Objects.equals(this.accountPrivilegesSQL, accountForDescribeDBAccountsOutput.accountPrivilegesSQL) &&
        Objects.equals(this.accountStatus, accountForDescribeDBAccountsOutput.accountStatus) &&
        Objects.equals(this.accountType, accountForDescribeDBAccountsOutput.accountType) &&
        Objects.equals(this.globalAccountPrivileges, accountForDescribeDBAccountsOutput.globalAccountPrivileges) &&
        Objects.equals(this.host, accountForDescribeDBAccountsOutput.host);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountDesc, accountName, accountPrivileges, accountPrivilegesSQL, accountStatus, accountType, globalAccountPrivileges, host);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountForDescribeDBAccountsOutput {\n");
    
    sb.append("    accountDesc: ").append(toIndentedString(accountDesc)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountPrivileges: ").append(toIndentedString(accountPrivileges)).append("\n");
    sb.append("    accountPrivilegesSQL: ").append(toIndentedString(accountPrivilegesSQL)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    globalAccountPrivileges: ").append(toIndentedString(globalAccountPrivileges)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
