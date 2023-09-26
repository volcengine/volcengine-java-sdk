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
 * AccountPrivilegesInfoForCreateDBAccountInput
 */


public class AccountPrivilegesInfoForCreateDBAccountInput {
  /**
   * Gets or Sets accountPrivilege
   */
  @JsonAdapter(AccountPrivilegeEnum.Adapter.class)
  public enum AccountPrivilegeEnum {
    CUSTOM("Custom"),
    DDLONLY("DDLOnly"),
    DMLONLY("DMLOnly"),
    NONE("None"),
    READONLY("ReadOnly"),
    READWRITE("ReadWrite");

    private String value;

    AccountPrivilegeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AccountPrivilegeEnum fromValue(String input) {
      for (AccountPrivilegeEnum b : AccountPrivilegeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AccountPrivilegeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountPrivilegeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AccountPrivilegeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AccountPrivilegeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("AccountPrivilege")
  private AccountPrivilegeEnum accountPrivilege = null;

  @SerializedName("AccountPrivilegeCustom")
  private String accountPrivilegeCustom = null;

  @SerializedName("DBName")
  private String dbName = null;

  public AccountPrivilegesInfoForCreateDBAccountInput accountPrivilege(AccountPrivilegeEnum accountPrivilege) {
    this.accountPrivilege = accountPrivilege;
    return this;
  }

   /**
   * Get accountPrivilege
   * @return accountPrivilege
  **/
  @Schema(description = "")
  public AccountPrivilegeEnum getAccountPrivilege() {
    return accountPrivilege;
  }

  public void setAccountPrivilege(AccountPrivilegeEnum accountPrivilege) {
    this.accountPrivilege = accountPrivilege;
  }

  public AccountPrivilegesInfoForCreateDBAccountInput accountPrivilegeCustom(String accountPrivilegeCustom) {
    this.accountPrivilegeCustom = accountPrivilegeCustom;
    return this;
  }

   /**
   * Get accountPrivilegeCustom
   * @return accountPrivilegeCustom
  **/
  @Schema(description = "")
  public String getAccountPrivilegeCustom() {
    return accountPrivilegeCustom;
  }

  public void setAccountPrivilegeCustom(String accountPrivilegeCustom) {
    this.accountPrivilegeCustom = accountPrivilegeCustom;
  }

  public AccountPrivilegesInfoForCreateDBAccountInput dbName(String dbName) {
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
    AccountPrivilegesInfoForCreateDBAccountInput accountPrivilegesInfoForCreateDBAccountInput = (AccountPrivilegesInfoForCreateDBAccountInput) o;
    return Objects.equals(this.accountPrivilege, accountPrivilegesInfoForCreateDBAccountInput.accountPrivilege) &&
        Objects.equals(this.accountPrivilegeCustom, accountPrivilegesInfoForCreateDBAccountInput.accountPrivilegeCustom) &&
        Objects.equals(this.dbName, accountPrivilegesInfoForCreateDBAccountInput.dbName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountPrivilege, accountPrivilegeCustom, dbName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPrivilegesInfoForCreateDBAccountInput {\n");
    
    sb.append("    accountPrivilege: ").append(toIndentedString(accountPrivilege)).append("\n");
    sb.append("    accountPrivilegeCustom: ").append(toIndentedString(accountPrivilegeCustom)).append("\n");
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