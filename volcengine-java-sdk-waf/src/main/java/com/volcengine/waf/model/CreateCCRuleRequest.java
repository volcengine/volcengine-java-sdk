/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.waf.model.AccurateGroupForCreateCCRuleInput;
import com.volcengine.waf.model.CronConfForCreateCCRuleInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateCCRuleRequest
 */



public class CreateCCRuleRequest {
  @SerializedName("AccurateGroup")
  private AccurateGroupForCreateCCRuleInput accurateGroup = null;

  @SerializedName("AccurateGroupPriority")
  private Integer accurateGroupPriority = null;

  @SerializedName("CCType")
  private Integer ccType = null;

  @SerializedName("CountTime")
  private Integer countTime = null;

  @SerializedName("CronConfs")
  private List<CronConfForCreateCCRuleInput> cronConfs = null;

  @SerializedName("CronEnable")
  private Integer cronEnable = null;

  @SerializedName("EffectTime")
  private Integer effectTime = null;

  @SerializedName("Enable")
  private Integer enable = null;

  @SerializedName("ExemptionTime")
  private Integer exemptionTime = null;

  @SerializedName("Field")
  private String field = null;

  @SerializedName("Host")
  private String host = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("PathThreshold")
  private Integer pathThreshold = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RulePriority")
  private Integer rulePriority = null;

  @SerializedName("RuleTag")
  private String ruleTag = null;

  @SerializedName("SingleThreshold")
  private Integer singleThreshold = null;

  @SerializedName("Url")
  private String url = null;

  public CreateCCRuleRequest accurateGroup(AccurateGroupForCreateCCRuleInput accurateGroup) {
    this.accurateGroup = accurateGroup;
    return this;
  }

   /**
   * Get accurateGroup
   * @return accurateGroup
  **/
  @Valid
  @Schema(description = "")
  public AccurateGroupForCreateCCRuleInput getAccurateGroup() {
    return accurateGroup;
  }

  public void setAccurateGroup(AccurateGroupForCreateCCRuleInput accurateGroup) {
    this.accurateGroup = accurateGroup;
  }

  public CreateCCRuleRequest accurateGroupPriority(Integer accurateGroupPriority) {
    this.accurateGroupPriority = accurateGroupPriority;
    return this;
  }

   /**
   * Get accurateGroupPriority
   * @return accurateGroupPriority
  **/
  @Schema(description = "")
  public Integer getAccurateGroupPriority() {
    return accurateGroupPriority;
  }

  public void setAccurateGroupPriority(Integer accurateGroupPriority) {
    this.accurateGroupPriority = accurateGroupPriority;
  }

  public CreateCCRuleRequest ccType(Integer ccType) {
    this.ccType = ccType;
    return this;
  }

   /**
   * Get ccType
   * @return ccType
  **/
  @Schema(description = "")
  public Integer getCcType() {
    return ccType;
  }

  public void setCcType(Integer ccType) {
    this.ccType = ccType;
  }

  public CreateCCRuleRequest countTime(Integer countTime) {
    this.countTime = countTime;
    return this;
  }

   /**
   * Get countTime
   * @return countTime
  **/
  @Schema(description = "")
  public Integer getCountTime() {
    return countTime;
  }

  public void setCountTime(Integer countTime) {
    this.countTime = countTime;
  }

  public CreateCCRuleRequest cronConfs(List<CronConfForCreateCCRuleInput> cronConfs) {
    this.cronConfs = cronConfs;
    return this;
  }

  public CreateCCRuleRequest addCronConfsItem(CronConfForCreateCCRuleInput cronConfsItem) {
    if (this.cronConfs == null) {
      this.cronConfs = new ArrayList<CronConfForCreateCCRuleInput>();
    }
    this.cronConfs.add(cronConfsItem);
    return this;
  }

   /**
   * Get cronConfs
   * @return cronConfs
  **/
  @Valid
  @Schema(description = "")
  public List<CronConfForCreateCCRuleInput> getCronConfs() {
    return cronConfs;
  }

  public void setCronConfs(List<CronConfForCreateCCRuleInput> cronConfs) {
    this.cronConfs = cronConfs;
  }

  public CreateCCRuleRequest cronEnable(Integer cronEnable) {
    this.cronEnable = cronEnable;
    return this;
  }

   /**
   * Get cronEnable
   * @return cronEnable
  **/
  @Schema(description = "")
  public Integer getCronEnable() {
    return cronEnable;
  }

  public void setCronEnable(Integer cronEnable) {
    this.cronEnable = cronEnable;
  }

  public CreateCCRuleRequest effectTime(Integer effectTime) {
    this.effectTime = effectTime;
    return this;
  }

   /**
   * Get effectTime
   * @return effectTime
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getEffectTime() {
    return effectTime;
  }

  public void setEffectTime(Integer effectTime) {
    this.effectTime = effectTime;
  }

  public CreateCCRuleRequest enable(Integer enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getEnable() {
    return enable;
  }

  public void setEnable(Integer enable) {
    this.enable = enable;
  }

  public CreateCCRuleRequest exemptionTime(Integer exemptionTime) {
    this.exemptionTime = exemptionTime;
    return this;
  }

   /**
   * Get exemptionTime
   * @return exemptionTime
  **/
  @Schema(description = "")
  public Integer getExemptionTime() {
    return exemptionTime;
  }

  public void setExemptionTime(Integer exemptionTime) {
    this.exemptionTime = exemptionTime;
  }

  public CreateCCRuleRequest field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public CreateCCRuleRequest host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public CreateCCRuleRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateCCRuleRequest pathThreshold(Integer pathThreshold) {
    this.pathThreshold = pathThreshold;
    return this;
  }

   /**
   * Get pathThreshold
   * @return pathThreshold
  **/
  @Schema(description = "")
  public Integer getPathThreshold() {
    return pathThreshold;
  }

  public void setPathThreshold(Integer pathThreshold) {
    this.pathThreshold = pathThreshold;
  }

  public CreateCCRuleRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public CreateCCRuleRequest rulePriority(Integer rulePriority) {
    this.rulePriority = rulePriority;
    return this;
  }

   /**
   * Get rulePriority
   * @return rulePriority
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getRulePriority() {
    return rulePriority;
  }

  public void setRulePriority(Integer rulePriority) {
    this.rulePriority = rulePriority;
  }

  public CreateCCRuleRequest ruleTag(String ruleTag) {
    this.ruleTag = ruleTag;
    return this;
  }

   /**
   * Get ruleTag
   * @return ruleTag
  **/
  @Schema(description = "")
  public String getRuleTag() {
    return ruleTag;
  }

  public void setRuleTag(String ruleTag) {
    this.ruleTag = ruleTag;
  }

  public CreateCCRuleRequest singleThreshold(Integer singleThreshold) {
    this.singleThreshold = singleThreshold;
    return this;
  }

   /**
   * Get singleThreshold
   * @return singleThreshold
  **/
  @Schema(description = "")
  public Integer getSingleThreshold() {
    return singleThreshold;
  }

  public void setSingleThreshold(Integer singleThreshold) {
    this.singleThreshold = singleThreshold;
  }

  public CreateCCRuleRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @NotNull
  @Schema(required = true, description = "")
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
    CreateCCRuleRequest createCCRuleRequest = (CreateCCRuleRequest) o;
    return Objects.equals(this.accurateGroup, createCCRuleRequest.accurateGroup) &&
        Objects.equals(this.accurateGroupPriority, createCCRuleRequest.accurateGroupPriority) &&
        Objects.equals(this.ccType, createCCRuleRequest.ccType) &&
        Objects.equals(this.countTime, createCCRuleRequest.countTime) &&
        Objects.equals(this.cronConfs, createCCRuleRequest.cronConfs) &&
        Objects.equals(this.cronEnable, createCCRuleRequest.cronEnable) &&
        Objects.equals(this.effectTime, createCCRuleRequest.effectTime) &&
        Objects.equals(this.enable, createCCRuleRequest.enable) &&
        Objects.equals(this.exemptionTime, createCCRuleRequest.exemptionTime) &&
        Objects.equals(this.field, createCCRuleRequest.field) &&
        Objects.equals(this.host, createCCRuleRequest.host) &&
        Objects.equals(this.name, createCCRuleRequest.name) &&
        Objects.equals(this.pathThreshold, createCCRuleRequest.pathThreshold) &&
        Objects.equals(this.projectName, createCCRuleRequest.projectName) &&
        Objects.equals(this.rulePriority, createCCRuleRequest.rulePriority) &&
        Objects.equals(this.ruleTag, createCCRuleRequest.ruleTag) &&
        Objects.equals(this.singleThreshold, createCCRuleRequest.singleThreshold) &&
        Objects.equals(this.url, createCCRuleRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accurateGroup, accurateGroupPriority, ccType, countTime, cronConfs, cronEnable, effectTime, enable, exemptionTime, field, host, name, pathThreshold, projectName, rulePriority, ruleTag, singleThreshold, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCCRuleRequest {\n");
    
    sb.append("    accurateGroup: ").append(toIndentedString(accurateGroup)).append("\n");
    sb.append("    accurateGroupPriority: ").append(toIndentedString(accurateGroupPriority)).append("\n");
    sb.append("    ccType: ").append(toIndentedString(ccType)).append("\n");
    sb.append("    countTime: ").append(toIndentedString(countTime)).append("\n");
    sb.append("    cronConfs: ").append(toIndentedString(cronConfs)).append("\n");
    sb.append("    cronEnable: ").append(toIndentedString(cronEnable)).append("\n");
    sb.append("    effectTime: ").append(toIndentedString(effectTime)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    exemptionTime: ").append(toIndentedString(exemptionTime)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pathThreshold: ").append(toIndentedString(pathThreshold)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    rulePriority: ").append(toIndentedString(rulePriority)).append("\n");
    sb.append("    ruleTag: ").append(toIndentedString(ruleTag)).append("\n");
    sb.append("    singleThreshold: ").append(toIndentedString(singleThreshold)).append("\n");
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