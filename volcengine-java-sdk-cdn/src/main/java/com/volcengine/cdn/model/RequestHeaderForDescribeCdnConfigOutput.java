/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cdn.model.ConditionForDescribeCdnConfigOutput;
import com.volcengine.cdn.model.RequestHeaderActionForDescribeCdnConfigOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RequestHeaderForDescribeCdnConfigOutput
 */



public class RequestHeaderForDescribeCdnConfigOutput {
  @SerializedName("Condition")
  private ConditionForDescribeCdnConfigOutput condition = null;

  @SerializedName("RequestHeaderAction")
  private RequestHeaderActionForDescribeCdnConfigOutput requestHeaderAction = null;

  public RequestHeaderForDescribeCdnConfigOutput condition(ConditionForDescribeCdnConfigOutput condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @Valid
  @Schema(description = "")
  public ConditionForDescribeCdnConfigOutput getCondition() {
    return condition;
  }

  public void setCondition(ConditionForDescribeCdnConfigOutput condition) {
    this.condition = condition;
  }

  public RequestHeaderForDescribeCdnConfigOutput requestHeaderAction(RequestHeaderActionForDescribeCdnConfigOutput requestHeaderAction) {
    this.requestHeaderAction = requestHeaderAction;
    return this;
  }

   /**
   * Get requestHeaderAction
   * @return requestHeaderAction
  **/
  @Valid
  @Schema(description = "")
  public RequestHeaderActionForDescribeCdnConfigOutput getRequestHeaderAction() {
    return requestHeaderAction;
  }

  public void setRequestHeaderAction(RequestHeaderActionForDescribeCdnConfigOutput requestHeaderAction) {
    this.requestHeaderAction = requestHeaderAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestHeaderForDescribeCdnConfigOutput requestHeaderForDescribeCdnConfigOutput = (RequestHeaderForDescribeCdnConfigOutput) o;
    return Objects.equals(this.condition, requestHeaderForDescribeCdnConfigOutput.condition) &&
        Objects.equals(this.requestHeaderAction, requestHeaderForDescribeCdnConfigOutput.requestHeaderAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, requestHeaderAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestHeaderForDescribeCdnConfigOutput {\n");
    
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    requestHeaderAction: ").append(toIndentedString(requestHeaderAction)).append("\n");
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
