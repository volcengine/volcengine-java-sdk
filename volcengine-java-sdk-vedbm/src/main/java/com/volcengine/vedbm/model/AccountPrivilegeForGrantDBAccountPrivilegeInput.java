/*
 * vedbm
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vedbm.model;

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
 * AccountPrivilegeForGrantDBAccountPrivilegeInput
 */



public class AccountPrivilegeForGrantDBAccountPrivilegeInput {
  /**
   * Gets or Sets accountPrivilege
   */
  @JsonAdapter(AccountPrivilegeEnum.Adapter.class)
  public enum AccountPrivilegeEnum {
    @SerializedName("ReadWrite")
    READWRITE("ReadWrite"),
    @SerializedName("ReadOnly")
    READONLY("ReadOnly"),
    @SerializedName("DDLOnly")
    DDLONLY("DDLOnly"),
    @SerializedName("DMLOnly")
    DMLONLY("DMLOnly");

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

  @SerializedName("DBName")
  private String dbName = null;

  public AccountPrivilegeForGrantDBAccountPrivilegeInput accountPrivilege(AccountPrivilegeEnum accountPrivilege) {
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

  public AccountPrivilegeForGrantDBAccountPrivilegeInput dbName(String dbName) {
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
    AccountPrivilegeForGrantDBAccountPrivilegeInput accountPrivilegeForGrantDBAccountPrivilegeInput = (AccountPrivilegeForGrantDBAccountPrivilegeInput) o;
    return Objects.equals(this.accountPrivilege, accountPrivilegeForGrantDBAccountPrivilegeInput.accountPrivilege) &&
        Objects.equals(this.dbName, accountPrivilegeForGrantDBAccountPrivilegeInput.dbName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountPrivilege, dbName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPrivilegeForGrantDBAccountPrivilegeInput {\n");
    
    sb.append("    accountPrivilege: ").append(toIndentedString(accountPrivilege)).append("\n");
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
