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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConfigInfoForDescribeTasksOutput
 */


public class ConfigInfoForDescribeTasksOutput {
  @SerializedName("ConfigInfoKey")
  private String configInfoKey = null;

  @SerializedName("ConfigInfoValue")
  private List<String> configInfoValue = null;

  public ConfigInfoForDescribeTasksOutput configInfoKey(String configInfoKey) {
    this.configInfoKey = configInfoKey;
    return this;
  }

   /**
   * Get configInfoKey
   * @return configInfoKey
  **/
  @Schema(description = "")
  public String getConfigInfoKey() {
    return configInfoKey;
  }

  public void setConfigInfoKey(String configInfoKey) {
    this.configInfoKey = configInfoKey;
  }

  public ConfigInfoForDescribeTasksOutput configInfoValue(List<String> configInfoValue) {
    this.configInfoValue = configInfoValue;
    return this;
  }

  public ConfigInfoForDescribeTasksOutput addConfigInfoValueItem(String configInfoValueItem) {
    if (this.configInfoValue == null) {
      this.configInfoValue = new ArrayList<String>();
    }
    this.configInfoValue.add(configInfoValueItem);
    return this;
  }

   /**
   * Get configInfoValue
   * @return configInfoValue
  **/
  @Schema(description = "")
  public List<String> getConfigInfoValue() {
    return configInfoValue;
  }

  public void setConfigInfoValue(List<String> configInfoValue) {
    this.configInfoValue = configInfoValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigInfoForDescribeTasksOutput configInfoForDescribeTasksOutput = (ConfigInfoForDescribeTasksOutput) o;
    return Objects.equals(this.configInfoKey, configInfoForDescribeTasksOutput.configInfoKey) &&
        Objects.equals(this.configInfoValue, configInfoForDescribeTasksOutput.configInfoValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configInfoKey, configInfoValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigInfoForDescribeTasksOutput {\n");
    
    sb.append("    configInfoKey: ").append(toIndentedString(configInfoKey)).append("\n");
    sb.append("    configInfoValue: ").append(toIndentedString(configInfoValue)).append("\n");
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