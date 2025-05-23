/*
 * dns
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dns.model;

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
 * CustomerLineForListCustomLinesOutput
 */



public class CustomerLineForListCustomLinesOutput {
  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("IPSegments")
  private List<String> ipSegments = null;

  @SerializedName("Line")
  private String line = null;

  @SerializedName("NameCN")
  private String nameCN = null;

  @SerializedName("Remark")
  private String remark = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  public CustomerLineForListCustomLinesOutput createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public CustomerLineForListCustomLinesOutput ipSegments(List<String> ipSegments) {
    this.ipSegments = ipSegments;
    return this;
  }

  public CustomerLineForListCustomLinesOutput addIpSegmentsItem(String ipSegmentsItem) {
    if (this.ipSegments == null) {
      this.ipSegments = new ArrayList<String>();
    }
    this.ipSegments.add(ipSegmentsItem);
    return this;
  }

   /**
   * Get ipSegments
   * @return ipSegments
  **/
  @Schema(description = "")
  public List<String> getIpSegments() {
    return ipSegments;
  }

  public void setIpSegments(List<String> ipSegments) {
    this.ipSegments = ipSegments;
  }

  public CustomerLineForListCustomLinesOutput line(String line) {
    this.line = line;
    return this;
  }

   /**
   * Get line
   * @return line
  **/
  @Schema(description = "")
  public String getLine() {
    return line;
  }

  public void setLine(String line) {
    this.line = line;
  }

  public CustomerLineForListCustomLinesOutput nameCN(String nameCN) {
    this.nameCN = nameCN;
    return this;
  }

   /**
   * Get nameCN
   * @return nameCN
  **/
  @Schema(description = "")
  public String getNameCN() {
    return nameCN;
  }

  public void setNameCN(String nameCN) {
    this.nameCN = nameCN;
  }

  public CustomerLineForListCustomLinesOutput remark(String remark) {
    this.remark = remark;
    return this;
  }

   /**
   * Get remark
   * @return remark
  **/
  @Schema(description = "")
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public CustomerLineForListCustomLinesOutput updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerLineForListCustomLinesOutput customerLineForListCustomLinesOutput = (CustomerLineForListCustomLinesOutput) o;
    return Objects.equals(this.createdAt, customerLineForListCustomLinesOutput.createdAt) &&
        Objects.equals(this.ipSegments, customerLineForListCustomLinesOutput.ipSegments) &&
        Objects.equals(this.line, customerLineForListCustomLinesOutput.line) &&
        Objects.equals(this.nameCN, customerLineForListCustomLinesOutput.nameCN) &&
        Objects.equals(this.remark, customerLineForListCustomLinesOutput.remark) &&
        Objects.equals(this.updatedAt, customerLineForListCustomLinesOutput.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, ipSegments, line, nameCN, remark, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerLineForListCustomLinesOutput {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    ipSegments: ").append(toIndentedString(ipSegments)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    nameCN: ").append(toIndentedString(nameCN)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
