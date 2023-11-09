/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.alb.model.RedirectConfigForDescribeRulesOutput;
import com.volcengine.alb.model.RewriteConfigForDescribeRulesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RuleForDescribeRulesOutput
 */


public class RuleForDescribeRulesOutput {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("RedirectConfig")
  private RedirectConfigForDescribeRulesOutput redirectConfig = null;

  @SerializedName("RewriteConfig")
  private RewriteConfigForDescribeRulesOutput rewriteConfig = null;

  @SerializedName("RewriteEnabled")
  private String rewriteEnabled = null;

  @SerializedName("RuleAction")
  private String ruleAction = null;

  @SerializedName("RuleId")
  private String ruleId = null;

  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  @SerializedName("TrafficLimitEnabled")
  private String trafficLimitEnabled = null;

  @SerializedName("TrafficLimitQPS")
  private Integer trafficLimitQPS = null;

  @SerializedName("Url")
  private String url = null;

  public RuleForDescribeRulesOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RuleForDescribeRulesOutput domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @Schema(description = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public RuleForDescribeRulesOutput redirectConfig(RedirectConfigForDescribeRulesOutput redirectConfig) {
    this.redirectConfig = redirectConfig;
    return this;
  }

   /**
   * Get redirectConfig
   * @return redirectConfig
  **/
  @Valid
  @Schema(description = "")
  public RedirectConfigForDescribeRulesOutput getRedirectConfig() {
    return redirectConfig;
  }

  public void setRedirectConfig(RedirectConfigForDescribeRulesOutput redirectConfig) {
    this.redirectConfig = redirectConfig;
  }

  public RuleForDescribeRulesOutput rewriteConfig(RewriteConfigForDescribeRulesOutput rewriteConfig) {
    this.rewriteConfig = rewriteConfig;
    return this;
  }

   /**
   * Get rewriteConfig
   * @return rewriteConfig
  **/
  @Valid
  @Schema(description = "")
  public RewriteConfigForDescribeRulesOutput getRewriteConfig() {
    return rewriteConfig;
  }

  public void setRewriteConfig(RewriteConfigForDescribeRulesOutput rewriteConfig) {
    this.rewriteConfig = rewriteConfig;
  }

  public RuleForDescribeRulesOutput rewriteEnabled(String rewriteEnabled) {
    this.rewriteEnabled = rewriteEnabled;
    return this;
  }

   /**
   * Get rewriteEnabled
   * @return rewriteEnabled
  **/
  @Schema(description = "")
  public String getRewriteEnabled() {
    return rewriteEnabled;
  }

  public void setRewriteEnabled(String rewriteEnabled) {
    this.rewriteEnabled = rewriteEnabled;
  }

  public RuleForDescribeRulesOutput ruleAction(String ruleAction) {
    this.ruleAction = ruleAction;
    return this;
  }

   /**
   * Get ruleAction
   * @return ruleAction
  **/
  @Schema(description = "")
  public String getRuleAction() {
    return ruleAction;
  }

  public void setRuleAction(String ruleAction) {
    this.ruleAction = ruleAction;
  }

  public RuleForDescribeRulesOutput ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Get ruleId
   * @return ruleId
  **/
  @Schema(description = "")
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public RuleForDescribeRulesOutput serverGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
    return this;
  }

   /**
   * Get serverGroupId
   * @return serverGroupId
  **/
  @Schema(description = "")
  public String getServerGroupId() {
    return serverGroupId;
  }

  public void setServerGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
  }

  public RuleForDescribeRulesOutput trafficLimitEnabled(String trafficLimitEnabled) {
    this.trafficLimitEnabled = trafficLimitEnabled;
    return this;
  }

   /**
   * Get trafficLimitEnabled
   * @return trafficLimitEnabled
  **/
  @Schema(description = "")
  public String getTrafficLimitEnabled() {
    return trafficLimitEnabled;
  }

  public void setTrafficLimitEnabled(String trafficLimitEnabled) {
    this.trafficLimitEnabled = trafficLimitEnabled;
  }

  public RuleForDescribeRulesOutput trafficLimitQPS(Integer trafficLimitQPS) {
    this.trafficLimitQPS = trafficLimitQPS;
    return this;
  }

   /**
   * Get trafficLimitQPS
   * @return trafficLimitQPS
  **/
  @Schema(description = "")
  public Integer getTrafficLimitQPS() {
    return trafficLimitQPS;
  }

  public void setTrafficLimitQPS(Integer trafficLimitQPS) {
    this.trafficLimitQPS = trafficLimitQPS;
  }

  public RuleForDescribeRulesOutput url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleForDescribeRulesOutput ruleForDescribeRulesOutput = (RuleForDescribeRulesOutput) o;
    return Objects.equals(this.description, ruleForDescribeRulesOutput.description) &&
        Objects.equals(this.domain, ruleForDescribeRulesOutput.domain) &&
        Objects.equals(this.redirectConfig, ruleForDescribeRulesOutput.redirectConfig) &&
        Objects.equals(this.rewriteConfig, ruleForDescribeRulesOutput.rewriteConfig) &&
        Objects.equals(this.rewriteEnabled, ruleForDescribeRulesOutput.rewriteEnabled) &&
        Objects.equals(this.ruleAction, ruleForDescribeRulesOutput.ruleAction) &&
        Objects.equals(this.ruleId, ruleForDescribeRulesOutput.ruleId) &&
        Objects.equals(this.serverGroupId, ruleForDescribeRulesOutput.serverGroupId) &&
        Objects.equals(this.trafficLimitEnabled, ruleForDescribeRulesOutput.trafficLimitEnabled) &&
        Objects.equals(this.trafficLimitQPS, ruleForDescribeRulesOutput.trafficLimitQPS) &&
        Objects.equals(this.url, ruleForDescribeRulesOutput.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, domain, redirectConfig, rewriteConfig, rewriteEnabled, ruleAction, ruleId, serverGroupId, trafficLimitEnabled, trafficLimitQPS, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleForDescribeRulesOutput {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    redirectConfig: ").append(toIndentedString(redirectConfig)).append("\n");
    sb.append("    rewriteConfig: ").append(toIndentedString(rewriteConfig)).append("\n");
    sb.append("    rewriteEnabled: ").append(toIndentedString(rewriteEnabled)).append("\n");
    sb.append("    ruleAction: ").append(toIndentedString(ruleAction)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
    sb.append("    trafficLimitEnabled: ").append(toIndentedString(trafficLimitEnabled)).append("\n");
    sb.append("    trafficLimitQPS: ").append(toIndentedString(trafficLimitQPS)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
