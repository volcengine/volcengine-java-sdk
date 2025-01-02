/*
 * mcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcdn.model;

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
 * ChildForListAlertMetaMetricsOutput
 */



public class ChildForListAlertMetaMetricsOutput {
  @SerializedName("Format")
  private List<String> format = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("ProtocolType")
  private String protocolType = null;

  @SerializedName("SupportAlgo")
  private List<String> supportAlgo = null;

  @SerializedName("TriggerType")
  private String triggerType = null;

  public ChildForListAlertMetaMetricsOutput format(List<String> format) {
    this.format = format;
    return this;
  }

  public ChildForListAlertMetaMetricsOutput addFormatItem(String formatItem) {
    if (this.format == null) {
      this.format = new ArrayList<String>();
    }
    this.format.add(formatItem);
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @Schema(description = "")
  public List<String> getFormat() {
    return format;
  }

  public void setFormat(List<String> format) {
    this.format = format;
  }

  public ChildForListAlertMetaMetricsOutput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChildForListAlertMetaMetricsOutput name(String name) {
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

  public ChildForListAlertMetaMetricsOutput protocolType(String protocolType) {
    this.protocolType = protocolType;
    return this;
  }

   /**
   * Get protocolType
   * @return protocolType
  **/
  @Schema(description = "")
  public String getProtocolType() {
    return protocolType;
  }

  public void setProtocolType(String protocolType) {
    this.protocolType = protocolType;
  }

  public ChildForListAlertMetaMetricsOutput supportAlgo(List<String> supportAlgo) {
    this.supportAlgo = supportAlgo;
    return this;
  }

  public ChildForListAlertMetaMetricsOutput addSupportAlgoItem(String supportAlgoItem) {
    if (this.supportAlgo == null) {
      this.supportAlgo = new ArrayList<String>();
    }
    this.supportAlgo.add(supportAlgoItem);
    return this;
  }

   /**
   * Get supportAlgo
   * @return supportAlgo
  **/
  @Schema(description = "")
  public List<String> getSupportAlgo() {
    return supportAlgo;
  }

  public void setSupportAlgo(List<String> supportAlgo) {
    this.supportAlgo = supportAlgo;
  }

  public ChildForListAlertMetaMetricsOutput triggerType(String triggerType) {
    this.triggerType = triggerType;
    return this;
  }

   /**
   * Get triggerType
   * @return triggerType
  **/
  @Schema(description = "")
  public String getTriggerType() {
    return triggerType;
  }

  public void setTriggerType(String triggerType) {
    this.triggerType = triggerType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChildForListAlertMetaMetricsOutput childForListAlertMetaMetricsOutput = (ChildForListAlertMetaMetricsOutput) o;
    return Objects.equals(this.format, childForListAlertMetaMetricsOutput.format) &&
        Objects.equals(this.id, childForListAlertMetaMetricsOutput.id) &&
        Objects.equals(this.name, childForListAlertMetaMetricsOutput.name) &&
        Objects.equals(this.protocolType, childForListAlertMetaMetricsOutput.protocolType) &&
        Objects.equals(this.supportAlgo, childForListAlertMetaMetricsOutput.supportAlgo) &&
        Objects.equals(this.triggerType, childForListAlertMetaMetricsOutput.triggerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, id, name, protocolType, supportAlgo, triggerType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildForListAlertMetaMetricsOutput {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
    sb.append("    supportAlgo: ").append(toIndentedString(supportAlgo)).append("\n");
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
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