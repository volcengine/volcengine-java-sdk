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
 * ColumnPrivilegeForGrantDBAccountPrivilegeInput
 */



public class ColumnPrivilegeForGrantDBAccountPrivilegeInput {
  @SerializedName("AccountPrivilegeDetail")
  private String accountPrivilegeDetail = null;

  @SerializedName("ColumnName")
  private String columnName = null;

  @SerializedName("TableName")
  private String tableName = null;

  public ColumnPrivilegeForGrantDBAccountPrivilegeInput accountPrivilegeDetail(String accountPrivilegeDetail) {
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

  public ColumnPrivilegeForGrantDBAccountPrivilegeInput columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

   /**
   * Get columnName
   * @return columnName
  **/
  @Schema(description = "")
  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public ColumnPrivilegeForGrantDBAccountPrivilegeInput tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Get tableName
   * @return tableName
  **/
  @Schema(description = "")
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnPrivilegeForGrantDBAccountPrivilegeInput columnPrivilegeForGrantDBAccountPrivilegeInput = (ColumnPrivilegeForGrantDBAccountPrivilegeInput) o;
    return Objects.equals(this.accountPrivilegeDetail, columnPrivilegeForGrantDBAccountPrivilegeInput.accountPrivilegeDetail) &&
        Objects.equals(this.columnName, columnPrivilegeForGrantDBAccountPrivilegeInput.columnName) &&
        Objects.equals(this.tableName, columnPrivilegeForGrantDBAccountPrivilegeInput.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountPrivilegeDetail, columnName, tableName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnPrivilegeForGrantDBAccountPrivilegeInput {\n");
    
    sb.append("    accountPrivilegeDetail: ").append(toIndentedString(accountPrivilegeDetail)).append("\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
