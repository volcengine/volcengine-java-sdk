/*
 * mongodb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mongodb.model;

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
 * MongosNodeSpecForDescribeNodeSpecsOutput
 */


public class MongosNodeSpecForDescribeNodeSpecsOutput {
  @SerializedName("CpuNum")
  private Double cpuNum = null;

  @SerializedName("MaxConn")
  private Long maxConn = null;

  @SerializedName("MemInGb")
  private Double memInGb = null;

  @SerializedName("SpecName")
  private String specName = null;

  public MongosNodeSpecForDescribeNodeSpecsOutput cpuNum(Double cpuNum) {
    this.cpuNum = cpuNum;
    return this;
  }

   /**
   * Get cpuNum
   * @return cpuNum
  **/
  @Schema(description = "")
  public Double getCpuNum() {
    return cpuNum;
  }

  public void setCpuNum(Double cpuNum) {
    this.cpuNum = cpuNum;
  }

  public MongosNodeSpecForDescribeNodeSpecsOutput maxConn(Long maxConn) {
    this.maxConn = maxConn;
    return this;
  }

   /**
   * Get maxConn
   * @return maxConn
  **/
  @Schema(description = "")
  public Long getMaxConn() {
    return maxConn;
  }

  public void setMaxConn(Long maxConn) {
    this.maxConn = maxConn;
  }

  public MongosNodeSpecForDescribeNodeSpecsOutput memInGb(Double memInGb) {
    this.memInGb = memInGb;
    return this;
  }

   /**
   * Get memInGb
   * @return memInGb
  **/
  @Schema(description = "")
  public Double getMemInGb() {
    return memInGb;
  }

  public void setMemInGb(Double memInGb) {
    this.memInGb = memInGb;
  }

  public MongosNodeSpecForDescribeNodeSpecsOutput specName(String specName) {
    this.specName = specName;
    return this;
  }

   /**
   * Get specName
   * @return specName
  **/
  @Schema(description = "")
  public String getSpecName() {
    return specName;
  }

  public void setSpecName(String specName) {
    this.specName = specName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MongosNodeSpecForDescribeNodeSpecsOutput mongosNodeSpecForDescribeNodeSpecsOutput = (MongosNodeSpecForDescribeNodeSpecsOutput) o;
    return Objects.equals(this.cpuNum, mongosNodeSpecForDescribeNodeSpecsOutput.cpuNum) &&
        Objects.equals(this.maxConn, mongosNodeSpecForDescribeNodeSpecsOutput.maxConn) &&
        Objects.equals(this.memInGb, mongosNodeSpecForDescribeNodeSpecsOutput.memInGb) &&
        Objects.equals(this.specName, mongosNodeSpecForDescribeNodeSpecsOutput.specName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuNum, maxConn, memInGb, specName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MongosNodeSpecForDescribeNodeSpecsOutput {\n");
    
    sb.append("    cpuNum: ").append(toIndentedString(cpuNum)).append("\n");
    sb.append("    maxConn: ").append(toIndentedString(maxConn)).append("\n");
    sb.append("    memInGb: ").append(toIndentedString(memInGb)).append("\n");
    sb.append("    specName: ").append(toIndentedString(specName)).append("\n");
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
