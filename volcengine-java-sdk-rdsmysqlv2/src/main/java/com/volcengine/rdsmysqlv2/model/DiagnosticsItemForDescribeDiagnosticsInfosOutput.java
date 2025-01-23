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
 * DiagnosticsItemForDescribeDiagnosticsInfosOutput
 */



public class DiagnosticsItemForDescribeDiagnosticsInfosOutput {
  @SerializedName("DiagnosticsItem")
  private String diagnosticsItem = null;

  @SerializedName("DiagnosticsResult")
  private String diagnosticsResult = null;

  @SerializedName("PossibleEffect")
  private String possibleEffect = null;

  @SerializedName("Suggestion")
  private String suggestion = null;

  public DiagnosticsItemForDescribeDiagnosticsInfosOutput diagnosticsItem(String diagnosticsItem) {
    this.diagnosticsItem = diagnosticsItem;
    return this;
  }

   /**
   * Get diagnosticsItem
   * @return diagnosticsItem
  **/
  @Schema(description = "")
  public String getDiagnosticsItem() {
    return diagnosticsItem;
  }

  public void setDiagnosticsItem(String diagnosticsItem) {
    this.diagnosticsItem = diagnosticsItem;
  }

  public DiagnosticsItemForDescribeDiagnosticsInfosOutput diagnosticsResult(String diagnosticsResult) {
    this.diagnosticsResult = diagnosticsResult;
    return this;
  }

   /**
   * Get diagnosticsResult
   * @return diagnosticsResult
  **/
  @Schema(description = "")
  public String getDiagnosticsResult() {
    return diagnosticsResult;
  }

  public void setDiagnosticsResult(String diagnosticsResult) {
    this.diagnosticsResult = diagnosticsResult;
  }

  public DiagnosticsItemForDescribeDiagnosticsInfosOutput possibleEffect(String possibleEffect) {
    this.possibleEffect = possibleEffect;
    return this;
  }

   /**
   * Get possibleEffect
   * @return possibleEffect
  **/
  @Schema(description = "")
  public String getPossibleEffect() {
    return possibleEffect;
  }

  public void setPossibleEffect(String possibleEffect) {
    this.possibleEffect = possibleEffect;
  }

  public DiagnosticsItemForDescribeDiagnosticsInfosOutput suggestion(String suggestion) {
    this.suggestion = suggestion;
    return this;
  }

   /**
   * Get suggestion
   * @return suggestion
  **/
  @Schema(description = "")
  public String getSuggestion() {
    return suggestion;
  }

  public void setSuggestion(String suggestion) {
    this.suggestion = suggestion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosticsItemForDescribeDiagnosticsInfosOutput diagnosticsItemForDescribeDiagnosticsInfosOutput = (DiagnosticsItemForDescribeDiagnosticsInfosOutput) o;
    return Objects.equals(this.diagnosticsItem, diagnosticsItemForDescribeDiagnosticsInfosOutput.diagnosticsItem) &&
        Objects.equals(this.diagnosticsResult, diagnosticsItemForDescribeDiagnosticsInfosOutput.diagnosticsResult) &&
        Objects.equals(this.possibleEffect, diagnosticsItemForDescribeDiagnosticsInfosOutput.possibleEffect) &&
        Objects.equals(this.suggestion, diagnosticsItemForDescribeDiagnosticsInfosOutput.suggestion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diagnosticsItem, diagnosticsResult, possibleEffect, suggestion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticsItemForDescribeDiagnosticsInfosOutput {\n");
    
    sb.append("    diagnosticsItem: ").append(toIndentedString(diagnosticsItem)).append("\n");
    sb.append("    diagnosticsResult: ").append(toIndentedString(diagnosticsResult)).append("\n");
    sb.append("    possibleEffect: ").append(toIndentedString(possibleEffect)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
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
