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
 * ParameterForModifyDBInstanceParametersInput
 */



public class ParameterForModifyDBInstanceParametersInput {
  @SerializedName("CheckingCode")
  private String checkingCode = null;

  @SerializedName("DefaultValue")
  private String defaultValue = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DescriptionZH")
  private String descriptionZH = null;

  @SerializedName("ForceRestart")
  private Boolean forceRestart = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("Value")
  private String value = null;

  public ParameterForModifyDBInstanceParametersInput checkingCode(String checkingCode) {
    this.checkingCode = checkingCode;
    return this;
  }

   /**
   * Get checkingCode
   * @return checkingCode
  **/
  @Schema(description = "")
  public String getCheckingCode() {
    return checkingCode;
  }

  public void setCheckingCode(String checkingCode) {
    this.checkingCode = checkingCode;
  }

  public ParameterForModifyDBInstanceParametersInput defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @Schema(description = "")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public ParameterForModifyDBInstanceParametersInput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ParameterForModifyDBInstanceParametersInput descriptionZH(String descriptionZH) {
    this.descriptionZH = descriptionZH;
    return this;
  }

   /**
   * Get descriptionZH
   * @return descriptionZH
  **/
  @Schema(description = "")
  public String getDescriptionZH() {
    return descriptionZH;
  }

  public void setDescriptionZH(String descriptionZH) {
    this.descriptionZH = descriptionZH;
  }

  public ParameterForModifyDBInstanceParametersInput forceRestart(Boolean forceRestart) {
    this.forceRestart = forceRestart;
    return this;
  }

   /**
   * Get forceRestart
   * @return forceRestart
  **/
  @Schema(description = "")
  public Boolean isForceRestart() {
    return forceRestart;
  }

  public void setForceRestart(Boolean forceRestart) {
    this.forceRestart = forceRestart;
  }

  public ParameterForModifyDBInstanceParametersInput name(String name) {
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

  public ParameterForModifyDBInstanceParametersInput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ParameterForModifyDBInstanceParametersInput value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterForModifyDBInstanceParametersInput parameterForModifyDBInstanceParametersInput = (ParameterForModifyDBInstanceParametersInput) o;
    return Objects.equals(this.checkingCode, parameterForModifyDBInstanceParametersInput.checkingCode) &&
        Objects.equals(this.defaultValue, parameterForModifyDBInstanceParametersInput.defaultValue) &&
        Objects.equals(this.description, parameterForModifyDBInstanceParametersInput.description) &&
        Objects.equals(this.descriptionZH, parameterForModifyDBInstanceParametersInput.descriptionZH) &&
        Objects.equals(this.forceRestart, parameterForModifyDBInstanceParametersInput.forceRestart) &&
        Objects.equals(this.name, parameterForModifyDBInstanceParametersInput.name) &&
        Objects.equals(this.type, parameterForModifyDBInstanceParametersInput.type) &&
        Objects.equals(this.value, parameterForModifyDBInstanceParametersInput.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkingCode, defaultValue, description, descriptionZH, forceRestart, name, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterForModifyDBInstanceParametersInput {\n");
    
    sb.append("    checkingCode: ").append(toIndentedString(checkingCode)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionZH: ").append(toIndentedString(descriptionZH)).append("\n");
    sb.append("    forceRestart: ").append(toIndentedString(forceRestart)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
