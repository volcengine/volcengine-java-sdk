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
 * TemplateParamForDescribeParameterTemplateOutput
 */


public class TemplateParamForDescribeParameterTemplateOutput {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("RunningValue")
  private String runningValue = null;

  public TemplateParamForDescribeParameterTemplateOutput description(String description) {
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

  public TemplateParamForDescribeParameterTemplateOutput name(String name) {
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

  public TemplateParamForDescribeParameterTemplateOutput runningValue(String runningValue) {
    this.runningValue = runningValue;
    return this;
  }

   /**
   * Get runningValue
   * @return runningValue
  **/
  @Schema(description = "")
  public String getRunningValue() {
    return runningValue;
  }

  public void setRunningValue(String runningValue) {
    this.runningValue = runningValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateParamForDescribeParameterTemplateOutput templateParamForDescribeParameterTemplateOutput = (TemplateParamForDescribeParameterTemplateOutput) o;
    return Objects.equals(this.description, templateParamForDescribeParameterTemplateOutput.description) &&
        Objects.equals(this.name, templateParamForDescribeParameterTemplateOutput.name) &&
        Objects.equals(this.runningValue, templateParamForDescribeParameterTemplateOutput.runningValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, runningValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateParamForDescribeParameterTemplateOutput {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    runningValue: ").append(toIndentedString(runningValue)).append("\n");
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
