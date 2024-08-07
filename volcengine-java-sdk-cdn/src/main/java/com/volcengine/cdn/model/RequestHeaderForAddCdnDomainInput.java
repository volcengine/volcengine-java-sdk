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
import com.volcengine.cdn.model.ConditionForAddCdnDomainInput;
import com.volcengine.cdn.model.RequestHeaderActionForAddCdnDomainInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RequestHeaderForAddCdnDomainInput
 */



public class RequestHeaderForAddCdnDomainInput {
  @SerializedName("Condition")
  private ConditionForAddCdnDomainInput condition = null;

  @SerializedName("RequestHeaderAction")
  private RequestHeaderActionForAddCdnDomainInput requestHeaderAction = null;

  public RequestHeaderForAddCdnDomainInput condition(ConditionForAddCdnDomainInput condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @Valid
  @Schema(description = "")
  public ConditionForAddCdnDomainInput getCondition() {
    return condition;
  }

  public void setCondition(ConditionForAddCdnDomainInput condition) {
    this.condition = condition;
  }

  public RequestHeaderForAddCdnDomainInput requestHeaderAction(RequestHeaderActionForAddCdnDomainInput requestHeaderAction) {
    this.requestHeaderAction = requestHeaderAction;
    return this;
  }

   /**
   * Get requestHeaderAction
   * @return requestHeaderAction
  **/
  @Valid
  @Schema(description = "")
  public RequestHeaderActionForAddCdnDomainInput getRequestHeaderAction() {
    return requestHeaderAction;
  }

  public void setRequestHeaderAction(RequestHeaderActionForAddCdnDomainInput requestHeaderAction) {
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
    RequestHeaderForAddCdnDomainInput requestHeaderForAddCdnDomainInput = (RequestHeaderForAddCdnDomainInput) o;
    return Objects.equals(this.condition, requestHeaderForAddCdnDomainInput.condition) &&
        Objects.equals(this.requestHeaderAction, requestHeaderForAddCdnDomainInput.requestHeaderAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, requestHeaderAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestHeaderForAddCdnDomainInput {\n");
    
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
