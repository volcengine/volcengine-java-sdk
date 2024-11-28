/*
 * advdefence20230308
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.advdefence20230308.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.advdefence20230308.model.AvgFlowForDescribeBizFlowAndConnCountOutput;
import com.volcengine.advdefence20230308.model.PeakFlowForDescribeBizFlowAndConnCountOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BizOutPpsFlowForDescribeBizFlowAndConnCountOutput
 */



public class BizOutPpsFlowForDescribeBizFlowAndConnCountOutput {
  @SerializedName("AvgFlows")
  private List<AvgFlowForDescribeBizFlowAndConnCountOutput> avgFlows = null;

  @SerializedName("MaxAvgValue")
  private Integer maxAvgValue = null;

  @SerializedName("PeakFlows")
  private List<PeakFlowForDescribeBizFlowAndConnCountOutput> peakFlows = null;

  @SerializedName("PeakValue")
  private Integer peakValue = null;

  public BizOutPpsFlowForDescribeBizFlowAndConnCountOutput avgFlows(List<AvgFlowForDescribeBizFlowAndConnCountOutput> avgFlows) {
    this.avgFlows = avgFlows;
    return this;
  }

  public BizOutPpsFlowForDescribeBizFlowAndConnCountOutput addAvgFlowsItem(AvgFlowForDescribeBizFlowAndConnCountOutput avgFlowsItem) {
    if (this.avgFlows == null) {
      this.avgFlows = new ArrayList<AvgFlowForDescribeBizFlowAndConnCountOutput>();
    }
    this.avgFlows.add(avgFlowsItem);
    return this;
  }

   /**
   * Get avgFlows
   * @return avgFlows
  **/
  @Valid
  @Schema(description = "")
  public List<AvgFlowForDescribeBizFlowAndConnCountOutput> getAvgFlows() {
    return avgFlows;
  }

  public void setAvgFlows(List<AvgFlowForDescribeBizFlowAndConnCountOutput> avgFlows) {
    this.avgFlows = avgFlows;
  }

  public BizOutPpsFlowForDescribeBizFlowAndConnCountOutput maxAvgValue(Integer maxAvgValue) {
    this.maxAvgValue = maxAvgValue;
    return this;
  }

   /**
   * Get maxAvgValue
   * @return maxAvgValue
  **/
  @Schema(description = "")
  public Integer getMaxAvgValue() {
    return maxAvgValue;
  }

  public void setMaxAvgValue(Integer maxAvgValue) {
    this.maxAvgValue = maxAvgValue;
  }

  public BizOutPpsFlowForDescribeBizFlowAndConnCountOutput peakFlows(List<PeakFlowForDescribeBizFlowAndConnCountOutput> peakFlows) {
    this.peakFlows = peakFlows;
    return this;
  }

  public BizOutPpsFlowForDescribeBizFlowAndConnCountOutput addPeakFlowsItem(PeakFlowForDescribeBizFlowAndConnCountOutput peakFlowsItem) {
    if (this.peakFlows == null) {
      this.peakFlows = new ArrayList<PeakFlowForDescribeBizFlowAndConnCountOutput>();
    }
    this.peakFlows.add(peakFlowsItem);
    return this;
  }

   /**
   * Get peakFlows
   * @return peakFlows
  **/
  @Valid
  @Schema(description = "")
  public List<PeakFlowForDescribeBizFlowAndConnCountOutput> getPeakFlows() {
    return peakFlows;
  }

  public void setPeakFlows(List<PeakFlowForDescribeBizFlowAndConnCountOutput> peakFlows) {
    this.peakFlows = peakFlows;
  }

  public BizOutPpsFlowForDescribeBizFlowAndConnCountOutput peakValue(Integer peakValue) {
    this.peakValue = peakValue;
    return this;
  }

   /**
   * Get peakValue
   * @return peakValue
  **/
  @Schema(description = "")
  public Integer getPeakValue() {
    return peakValue;
  }

  public void setPeakValue(Integer peakValue) {
    this.peakValue = peakValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BizOutPpsFlowForDescribeBizFlowAndConnCountOutput bizOutPpsFlowForDescribeBizFlowAndConnCountOutput = (BizOutPpsFlowForDescribeBizFlowAndConnCountOutput) o;
    return Objects.equals(this.avgFlows, bizOutPpsFlowForDescribeBizFlowAndConnCountOutput.avgFlows) &&
        Objects.equals(this.maxAvgValue, bizOutPpsFlowForDescribeBizFlowAndConnCountOutput.maxAvgValue) &&
        Objects.equals(this.peakFlows, bizOutPpsFlowForDescribeBizFlowAndConnCountOutput.peakFlows) &&
        Objects.equals(this.peakValue, bizOutPpsFlowForDescribeBizFlowAndConnCountOutput.peakValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgFlows, maxAvgValue, peakFlows, peakValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BizOutPpsFlowForDescribeBizFlowAndConnCountOutput {\n");
    
    sb.append("    avgFlows: ").append(toIndentedString(avgFlows)).append("\n");
    sb.append("    maxAvgValue: ").append(toIndentedString(maxAvgValue)).append("\n");
    sb.append("    peakFlows: ").append(toIndentedString(peakFlows)).append("\n");
    sb.append("    peakValue: ").append(toIndentedString(peakValue)).append("\n");
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
