/*
 * seccenter20240508
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.seccenter20240508.model;

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
 * RiskForListAssetCenterDevsInput
 */



public class RiskForListAssetCenterDevsInput {
  @SerializedName("Alarm")
  private Boolean alarm = null;

  @SerializedName("Baseline")
  private Boolean baseline = null;

  @SerializedName("Virus")
  private Boolean virus = null;

  @SerializedName("Vuln")
  private Boolean vuln = null;

  public RiskForListAssetCenterDevsInput alarm(Boolean alarm) {
    this.alarm = alarm;
    return this;
  }

   /**
   * Get alarm
   * @return alarm
  **/
  @Schema(description = "")
  public Boolean isAlarm() {
    return alarm;
  }

  public void setAlarm(Boolean alarm) {
    this.alarm = alarm;
  }

  public RiskForListAssetCenterDevsInput baseline(Boolean baseline) {
    this.baseline = baseline;
    return this;
  }

   /**
   * Get baseline
   * @return baseline
  **/
  @Schema(description = "")
  public Boolean isBaseline() {
    return baseline;
  }

  public void setBaseline(Boolean baseline) {
    this.baseline = baseline;
  }

  public RiskForListAssetCenterDevsInput virus(Boolean virus) {
    this.virus = virus;
    return this;
  }

   /**
   * Get virus
   * @return virus
  **/
  @Schema(description = "")
  public Boolean isVirus() {
    return virus;
  }

  public void setVirus(Boolean virus) {
    this.virus = virus;
  }

  public RiskForListAssetCenterDevsInput vuln(Boolean vuln) {
    this.vuln = vuln;
    return this;
  }

   /**
   * Get vuln
   * @return vuln
  **/
  @Schema(description = "")
  public Boolean isVuln() {
    return vuln;
  }

  public void setVuln(Boolean vuln) {
    this.vuln = vuln;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskForListAssetCenterDevsInput riskForListAssetCenterDevsInput = (RiskForListAssetCenterDevsInput) o;
    return Objects.equals(this.alarm, riskForListAssetCenterDevsInput.alarm) &&
        Objects.equals(this.baseline, riskForListAssetCenterDevsInput.baseline) &&
        Objects.equals(this.virus, riskForListAssetCenterDevsInput.virus) &&
        Objects.equals(this.vuln, riskForListAssetCenterDevsInput.vuln);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarm, baseline, virus, vuln);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskForListAssetCenterDevsInput {\n");
    
    sb.append("    alarm: ").append(toIndentedString(alarm)).append("\n");
    sb.append("    baseline: ").append(toIndentedString(baseline)).append("\n");
    sb.append("    virus: ").append(toIndentedString(virus)).append("\n");
    sb.append("    vuln: ").append(toIndentedString(vuln)).append("\n");
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
