/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

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
 * DataForListVulWhiteFieldOutput
 */



public class DataForListVulWhiteFieldOutput {
  @SerializedName("Enable")
  private Integer enable = null;

  @SerializedName("FieldArea")
  private String fieldArea = null;

  @SerializedName("FieldList")
  private String fieldList = null;

  @SerializedName("Host")
  private String host = null;

  @SerializedName("ID")
  private Integer ID = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("RuleTag")
  private String ruleTag = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public DataForListVulWhiteFieldOutput enable(Integer enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Schema(description = "")
  public Integer getEnable() {
    return enable;
  }

  public void setEnable(Integer enable) {
    this.enable = enable;
  }

  public DataForListVulWhiteFieldOutput fieldArea(String fieldArea) {
    this.fieldArea = fieldArea;
    return this;
  }

   /**
   * Get fieldArea
   * @return fieldArea
  **/
  @Schema(description = "")
  public String getFieldArea() {
    return fieldArea;
  }

  public void setFieldArea(String fieldArea) {
    this.fieldArea = fieldArea;
  }

  public DataForListVulWhiteFieldOutput fieldList(String fieldList) {
    this.fieldList = fieldList;
    return this;
  }

   /**
   * Get fieldList
   * @return fieldList
  **/
  @Schema(description = "")
  public String getFieldList() {
    return fieldList;
  }

  public void setFieldList(String fieldList) {
    this.fieldList = fieldList;
  }

  public DataForListVulWhiteFieldOutput host(String host) {
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

  public DataForListVulWhiteFieldOutput ID(Integer ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @Schema(description = "")
  public Integer getID() {
    return ID;
  }

  public void setID(Integer ID) {
    this.ID = ID;
  }

  public DataForListVulWhiteFieldOutput name(String name) {
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

  public DataForListVulWhiteFieldOutput ruleTag(String ruleTag) {
    this.ruleTag = ruleTag;
    return this;
  }

   /**
   * Get ruleTag
   * @return ruleTag
  **/
  @Schema(description = "")
  public String getRuleTag() {
    return ruleTag;
  }

  public void setRuleTag(String ruleTag) {
    this.ruleTag = ruleTag;
  }

  public DataForListVulWhiteFieldOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForListVulWhiteFieldOutput dataForListVulWhiteFieldOutput = (DataForListVulWhiteFieldOutput) o;
    return Objects.equals(this.enable, dataForListVulWhiteFieldOutput.enable) &&
        Objects.equals(this.fieldArea, dataForListVulWhiteFieldOutput.fieldArea) &&
        Objects.equals(this.fieldList, dataForListVulWhiteFieldOutput.fieldList) &&
        Objects.equals(this.host, dataForListVulWhiteFieldOutput.host) &&
        Objects.equals(this.ID, dataForListVulWhiteFieldOutput.ID) &&
        Objects.equals(this.name, dataForListVulWhiteFieldOutput.name) &&
        Objects.equals(this.ruleTag, dataForListVulWhiteFieldOutput.ruleTag) &&
        Objects.equals(this.updateTime, dataForListVulWhiteFieldOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, fieldArea, fieldList, host, ID, name, ruleTag, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForListVulWhiteFieldOutput {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    fieldArea: ").append(toIndentedString(fieldArea)).append("\n");
    sb.append("    fieldList: ").append(toIndentedString(fieldList)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ruleTag: ").append(toIndentedString(ruleTag)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
