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
import com.volcengine.cdn.model.AuthModeConfigForAddCdnDomainInput;
import com.volcengine.cdn.model.AuthResponseConfigForAddCdnDomainInput;
import com.volcengine.cdn.model.QueryStringRulesForAddCdnDomainInput;
import com.volcengine.cdn.model.RequestHeaderRulesForAddCdnDomainInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RemoteAuthRuleActionForAddCdnDomainInput
 */



public class RemoteAuthRuleActionForAddCdnDomainInput {
  @SerializedName("AuthModeConfig")
  private AuthModeConfigForAddCdnDomainInput authModeConfig = null;

  @SerializedName("AuthResponseConfig")
  private AuthResponseConfigForAddCdnDomainInput authResponseConfig = null;

  @SerializedName("QueryStringRules")
  private QueryStringRulesForAddCdnDomainInput queryStringRules = null;

  @SerializedName("RequestBodyRules")
  private String requestBodyRules = null;

  @SerializedName("RequestHeaderRules")
  private RequestHeaderRulesForAddCdnDomainInput requestHeaderRules = null;

  public RemoteAuthRuleActionForAddCdnDomainInput authModeConfig(AuthModeConfigForAddCdnDomainInput authModeConfig) {
    this.authModeConfig = authModeConfig;
    return this;
  }

   /**
   * Get authModeConfig
   * @return authModeConfig
  **/
  @Valid
  @Schema(description = "")
  public AuthModeConfigForAddCdnDomainInput getAuthModeConfig() {
    return authModeConfig;
  }

  public void setAuthModeConfig(AuthModeConfigForAddCdnDomainInput authModeConfig) {
    this.authModeConfig = authModeConfig;
  }

  public RemoteAuthRuleActionForAddCdnDomainInput authResponseConfig(AuthResponseConfigForAddCdnDomainInput authResponseConfig) {
    this.authResponseConfig = authResponseConfig;
    return this;
  }

   /**
   * Get authResponseConfig
   * @return authResponseConfig
  **/
  @Valid
  @Schema(description = "")
  public AuthResponseConfigForAddCdnDomainInput getAuthResponseConfig() {
    return authResponseConfig;
  }

  public void setAuthResponseConfig(AuthResponseConfigForAddCdnDomainInput authResponseConfig) {
    this.authResponseConfig = authResponseConfig;
  }

  public RemoteAuthRuleActionForAddCdnDomainInput queryStringRules(QueryStringRulesForAddCdnDomainInput queryStringRules) {
    this.queryStringRules = queryStringRules;
    return this;
  }

   /**
   * Get queryStringRules
   * @return queryStringRules
  **/
  @Valid
  @Schema(description = "")
  public QueryStringRulesForAddCdnDomainInput getQueryStringRules() {
    return queryStringRules;
  }

  public void setQueryStringRules(QueryStringRulesForAddCdnDomainInput queryStringRules) {
    this.queryStringRules = queryStringRules;
  }

  public RemoteAuthRuleActionForAddCdnDomainInput requestBodyRules(String requestBodyRules) {
    this.requestBodyRules = requestBodyRules;
    return this;
  }

   /**
   * Get requestBodyRules
   * @return requestBodyRules
  **/
  @Schema(description = "")
  public String getRequestBodyRules() {
    return requestBodyRules;
  }

  public void setRequestBodyRules(String requestBodyRules) {
    this.requestBodyRules = requestBodyRules;
  }

  public RemoteAuthRuleActionForAddCdnDomainInput requestHeaderRules(RequestHeaderRulesForAddCdnDomainInput requestHeaderRules) {
    this.requestHeaderRules = requestHeaderRules;
    return this;
  }

   /**
   * Get requestHeaderRules
   * @return requestHeaderRules
  **/
  @Valid
  @Schema(description = "")
  public RequestHeaderRulesForAddCdnDomainInput getRequestHeaderRules() {
    return requestHeaderRules;
  }

  public void setRequestHeaderRules(RequestHeaderRulesForAddCdnDomainInput requestHeaderRules) {
    this.requestHeaderRules = requestHeaderRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteAuthRuleActionForAddCdnDomainInput remoteAuthRuleActionForAddCdnDomainInput = (RemoteAuthRuleActionForAddCdnDomainInput) o;
    return Objects.equals(this.authModeConfig, remoteAuthRuleActionForAddCdnDomainInput.authModeConfig) &&
        Objects.equals(this.authResponseConfig, remoteAuthRuleActionForAddCdnDomainInput.authResponseConfig) &&
        Objects.equals(this.queryStringRules, remoteAuthRuleActionForAddCdnDomainInput.queryStringRules) &&
        Objects.equals(this.requestBodyRules, remoteAuthRuleActionForAddCdnDomainInput.requestBodyRules) &&
        Objects.equals(this.requestHeaderRules, remoteAuthRuleActionForAddCdnDomainInput.requestHeaderRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authModeConfig, authResponseConfig, queryStringRules, requestBodyRules, requestHeaderRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteAuthRuleActionForAddCdnDomainInput {\n");
    
    sb.append("    authModeConfig: ").append(toIndentedString(authModeConfig)).append("\n");
    sb.append("    authResponseConfig: ").append(toIndentedString(authResponseConfig)).append("\n");
    sb.append("    queryStringRules: ").append(toIndentedString(queryStringRules)).append("\n");
    sb.append("    requestBodyRules: ").append(toIndentedString(requestBodyRules)).append("\n");
    sb.append("    requestHeaderRules: ").append(toIndentedString(requestHeaderRules)).append("\n");
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
