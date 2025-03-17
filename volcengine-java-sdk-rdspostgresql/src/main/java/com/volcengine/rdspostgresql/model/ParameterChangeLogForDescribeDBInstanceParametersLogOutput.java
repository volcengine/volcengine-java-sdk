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
 * ParameterChangeLogForDescribeDBInstanceParametersLogOutput
 */



public class ParameterChangeLogForDescribeDBInstanceParametersLogOutput {
  @SerializedName("ModifyTime")
  private String modifyTime = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("NewValue")
  private String newValue = null;

  @SerializedName("OldValue")
  private String oldValue = null;

  @SerializedName("Status")
  private String status = null;

  public ParameterChangeLogForDescribeDBInstanceParametersLogOutput modifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * Get modifyTime
   * @return modifyTime
  **/
  @Schema(description = "")
  public String getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }

  public ParameterChangeLogForDescribeDBInstanceParametersLogOutput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ParameterChangeLogForDescribeDBInstanceParametersLogOutput newValue(String newValue) {
    this.newValue = newValue;
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @Schema(description = "")
  public String getNewValue() {
    return newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }

  public ParameterChangeLogForDescribeDBInstanceParametersLogOutput oldValue(String oldValue) {
    this.oldValue = oldValue;
    return this;
  }

   /**
   * Get oldValue
   * @return oldValue
  **/
  @Schema(description = "")
  public String getOldValue() {
    return oldValue;
  }

  public void setOldValue(String oldValue) {
    this.oldValue = oldValue;
  }

  public ParameterChangeLogForDescribeDBInstanceParametersLogOutput status(String status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterChangeLogForDescribeDBInstanceParametersLogOutput parameterChangeLogForDescribeDBInstanceParametersLogOutput = (ParameterChangeLogForDescribeDBInstanceParametersLogOutput) o;
    return Objects.equals(this.modifyTime, parameterChangeLogForDescribeDBInstanceParametersLogOutput.modifyTime) &&
        Objects.equals(this.name, parameterChangeLogForDescribeDBInstanceParametersLogOutput.name) &&
        Objects.equals(this.newValue, parameterChangeLogForDescribeDBInstanceParametersLogOutput.newValue) &&
        Objects.equals(this.oldValue, parameterChangeLogForDescribeDBInstanceParametersLogOutput.oldValue) &&
        Objects.equals(this.status, parameterChangeLogForDescribeDBInstanceParametersLogOutput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifyTime, name, newValue, oldValue, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterChangeLogForDescribeDBInstanceParametersLogOutput {\n");
    
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
