/*
 * cloud_detect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clouddetect.model;

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
 * AssertionForGetTaskResultOutput
 */



public class AssertionForGetTaskResultOutput {
  @SerializedName("ConditionMessage")
  private String conditionMessage = null;

  @SerializedName("ResultValue")
  private String resultValue = null;

  @SerializedName("Success")
  private Boolean success = null;

  public AssertionForGetTaskResultOutput conditionMessage(String conditionMessage) {
    this.conditionMessage = conditionMessage;
    return this;
  }

   /**
   * Get conditionMessage
   * @return conditionMessage
  **/
  @Schema(description = "")
  public String getConditionMessage() {
    return conditionMessage;
  }

  public void setConditionMessage(String conditionMessage) {
    this.conditionMessage = conditionMessage;
  }

  public AssertionForGetTaskResultOutput resultValue(String resultValue) {
    this.resultValue = resultValue;
    return this;
  }

   /**
   * Get resultValue
   * @return resultValue
  **/
  @Schema(description = "")
  public String getResultValue() {
    return resultValue;
  }

  public void setResultValue(String resultValue) {
    this.resultValue = resultValue;
  }

  public AssertionForGetTaskResultOutput success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @Schema(description = "")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssertionForGetTaskResultOutput assertionForGetTaskResultOutput = (AssertionForGetTaskResultOutput) o;
    return Objects.equals(this.conditionMessage, assertionForGetTaskResultOutput.conditionMessage) &&
        Objects.equals(this.resultValue, assertionForGetTaskResultOutput.resultValue) &&
        Objects.equals(this.success, assertionForGetTaskResultOutput.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionMessage, resultValue, success);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssertionForGetTaskResultOutput {\n");
    
    sb.append("    conditionMessage: ").append(toIndentedString(conditionMessage)).append("\n");
    sb.append("    resultValue: ").append(toIndentedString(resultValue)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
