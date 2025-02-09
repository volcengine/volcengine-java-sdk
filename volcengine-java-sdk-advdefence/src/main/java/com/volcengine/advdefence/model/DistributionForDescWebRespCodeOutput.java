/*
 * advdefence
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.advdefence.model;

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
 * DistributionForDescWebRespCodeOutput
 */



public class DistributionForDescWebRespCodeOutput {
  @SerializedName("Percentage")
  private Float percentage = null;

  @SerializedName("RespCode")
  private String respCode = null;

  @SerializedName("TotalQps")
  private Float totalQps = null;

  public DistributionForDescWebRespCodeOutput percentage(Float percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @Schema(description = "")
  public Float getPercentage() {
    return percentage;
  }

  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }

  public DistributionForDescWebRespCodeOutput respCode(String respCode) {
    this.respCode = respCode;
    return this;
  }

   /**
   * Get respCode
   * @return respCode
  **/
  @Schema(description = "")
  public String getRespCode() {
    return respCode;
  }

  public void setRespCode(String respCode) {
    this.respCode = respCode;
  }

  public DistributionForDescWebRespCodeOutput totalQps(Float totalQps) {
    this.totalQps = totalQps;
    return this;
  }

   /**
   * Get totalQps
   * @return totalQps
  **/
  @Schema(description = "")
  public Float getTotalQps() {
    return totalQps;
  }

  public void setTotalQps(Float totalQps) {
    this.totalQps = totalQps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionForDescWebRespCodeOutput distributionForDescWebRespCodeOutput = (DistributionForDescWebRespCodeOutput) o;
    return Objects.equals(this.percentage, distributionForDescWebRespCodeOutput.percentage) &&
        Objects.equals(this.respCode, distributionForDescWebRespCodeOutput.respCode) &&
        Objects.equals(this.totalQps, distributionForDescWebRespCodeOutput.totalQps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage, respCode, totalQps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionForDescWebRespCodeOutput {\n");
    
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    respCode: ").append(toIndentedString(respCode)).append("\n");
    sb.append("    totalQps: ").append(toIndentedString(totalQps)).append("\n");
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
