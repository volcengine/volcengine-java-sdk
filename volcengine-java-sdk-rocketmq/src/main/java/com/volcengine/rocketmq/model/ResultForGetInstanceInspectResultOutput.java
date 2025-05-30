/*
 * rocketmq
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rocketmq.model;

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
 * ResultForGetInstanceInspectResultOutput
 */



public class ResultForGetInstanceInspectResultOutput {
  @SerializedName("Describe")
  private String describe = null;

  @SerializedName("InspectName")
  private String inspectName = null;

  @SerializedName("Level")
  private String level = null;

  @SerializedName("Resource")
  private List<String> resource = null;

  @SerializedName("ResultId")
  private String resultId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Suggestion")
  private List<String> suggestion = null;

  @SerializedName("TimeStamp")
  private String timeStamp = null;

  @SerializedName("Type")
  private String type = null;

  public ResultForGetInstanceInspectResultOutput describe(String describe) {
    this.describe = describe;
    return this;
  }

   /**
   * Get describe
   * @return describe
  **/
  @Schema(description = "")
  public String getDescribe() {
    return describe;
  }

  public void setDescribe(String describe) {
    this.describe = describe;
  }

  public ResultForGetInstanceInspectResultOutput inspectName(String inspectName) {
    this.inspectName = inspectName;
    return this;
  }

   /**
   * Get inspectName
   * @return inspectName
  **/
  @Schema(description = "")
  public String getInspectName() {
    return inspectName;
  }

  public void setInspectName(String inspectName) {
    this.inspectName = inspectName;
  }

  public ResultForGetInstanceInspectResultOutput level(String level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @Schema(description = "")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public ResultForGetInstanceInspectResultOutput resource(List<String> resource) {
    this.resource = resource;
    return this;
  }

  public ResultForGetInstanceInspectResultOutput addResourceItem(String resourceItem) {
    if (this.resource == null) {
      this.resource = new ArrayList<String>();
    }
    this.resource.add(resourceItem);
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @Schema(description = "")
  public List<String> getResource() {
    return resource;
  }

  public void setResource(List<String> resource) {
    this.resource = resource;
  }

  public ResultForGetInstanceInspectResultOutput resultId(String resultId) {
    this.resultId = resultId;
    return this;
  }

   /**
   * Get resultId
   * @return resultId
  **/
  @Schema(description = "")
  public String getResultId() {
    return resultId;
  }

  public void setResultId(String resultId) {
    this.resultId = resultId;
  }

  public ResultForGetInstanceInspectResultOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ResultForGetInstanceInspectResultOutput suggestion(List<String> suggestion) {
    this.suggestion = suggestion;
    return this;
  }

  public ResultForGetInstanceInspectResultOutput addSuggestionItem(String suggestionItem) {
    if (this.suggestion == null) {
      this.suggestion = new ArrayList<String>();
    }
    this.suggestion.add(suggestionItem);
    return this;
  }

   /**
   * Get suggestion
   * @return suggestion
  **/
  @Schema(description = "")
  public List<String> getSuggestion() {
    return suggestion;
  }

  public void setSuggestion(List<String> suggestion) {
    this.suggestion = suggestion;
  }

  public ResultForGetInstanceInspectResultOutput timeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * Get timeStamp
   * @return timeStamp
  **/
  @Schema(description = "")
  public String getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }

  public ResultForGetInstanceInspectResultOutput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultForGetInstanceInspectResultOutput resultForGetInstanceInspectResultOutput = (ResultForGetInstanceInspectResultOutput) o;
    return Objects.equals(this.describe, resultForGetInstanceInspectResultOutput.describe) &&
        Objects.equals(this.inspectName, resultForGetInstanceInspectResultOutput.inspectName) &&
        Objects.equals(this.level, resultForGetInstanceInspectResultOutput.level) &&
        Objects.equals(this.resource, resultForGetInstanceInspectResultOutput.resource) &&
        Objects.equals(this.resultId, resultForGetInstanceInspectResultOutput.resultId) &&
        Objects.equals(this.status, resultForGetInstanceInspectResultOutput.status) &&
        Objects.equals(this.suggestion, resultForGetInstanceInspectResultOutput.suggestion) &&
        Objects.equals(this.timeStamp, resultForGetInstanceInspectResultOutput.timeStamp) &&
        Objects.equals(this.type, resultForGetInstanceInspectResultOutput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(describe, inspectName, level, resource, resultId, status, suggestion, timeStamp, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultForGetInstanceInspectResultOutput {\n");
    
    sb.append("    describe: ").append(toIndentedString(describe)).append("\n");
    sb.append("    inspectName: ").append(toIndentedString(inspectName)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
