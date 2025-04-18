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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListAclRuleRequest
 */



public class ListAclRuleRequest {
  @SerializedName("AclType")
  private String aclType = null;

  @SerializedName("Action")
  private List<String> action = null;

  @SerializedName("DefenceHost")
  private List<String> defenceHost = null;

  @SerializedName("Enable")
  private List<Integer> enable = null;

  @SerializedName("Page")
  private Integer page = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RuleName")
  private String ruleName = null;

  @SerializedName("RuleTag")
  private String ruleTag = null;

  @SerializedName("TimeOrderBy")
  private String timeOrderBy = null;

  public ListAclRuleRequest aclType(String aclType) {
    this.aclType = aclType;
    return this;
  }

   /**
   * Get aclType
   * @return aclType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAclType() {
    return aclType;
  }

  public void setAclType(String aclType) {
    this.aclType = aclType;
  }

  public ListAclRuleRequest action(List<String> action) {
    this.action = action;
    return this;
  }

  public ListAclRuleRequest addActionItem(String actionItem) {
    if (this.action == null) {
      this.action = new ArrayList<String>();
    }
    this.action.add(actionItem);
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public List<String> getAction() {
    return action;
  }

  public void setAction(List<String> action) {
    this.action = action;
  }

  public ListAclRuleRequest defenceHost(List<String> defenceHost) {
    this.defenceHost = defenceHost;
    return this;
  }

  public ListAclRuleRequest addDefenceHostItem(String defenceHostItem) {
    if (this.defenceHost == null) {
      this.defenceHost = new ArrayList<String>();
    }
    this.defenceHost.add(defenceHostItem);
    return this;
  }

   /**
   * Get defenceHost
   * @return defenceHost
  **/
  @Schema(description = "")
  public List<String> getDefenceHost() {
    return defenceHost;
  }

  public void setDefenceHost(List<String> defenceHost) {
    this.defenceHost = defenceHost;
  }

  public ListAclRuleRequest enable(List<Integer> enable) {
    this.enable = enable;
    return this;
  }

  public ListAclRuleRequest addEnableItem(Integer enableItem) {
    if (this.enable == null) {
      this.enable = new ArrayList<Integer>();
    }
    this.enable.add(enableItem);
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Schema(description = "")
  public List<Integer> getEnable() {
    return enable;
  }

  public void setEnable(List<Integer> enable) {
    this.enable = enable;
  }

  public ListAclRuleRequest page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @Schema(description = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public ListAclRuleRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public ListAclRuleRequest projectName(String projectName) {
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

  public ListAclRuleRequest ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Get ruleName
   * @return ruleName
  **/
  @Schema(description = "")
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public ListAclRuleRequest ruleTag(String ruleTag) {
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

  public ListAclRuleRequest timeOrderBy(String timeOrderBy) {
    this.timeOrderBy = timeOrderBy;
    return this;
  }

   /**
   * Get timeOrderBy
   * @return timeOrderBy
  **/
  @Schema(description = "")
  public String getTimeOrderBy() {
    return timeOrderBy;
  }

  public void setTimeOrderBy(String timeOrderBy) {
    this.timeOrderBy = timeOrderBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAclRuleRequest listAclRuleRequest = (ListAclRuleRequest) o;
    return Objects.equals(this.aclType, listAclRuleRequest.aclType) &&
        Objects.equals(this.action, listAclRuleRequest.action) &&
        Objects.equals(this.defenceHost, listAclRuleRequest.defenceHost) &&
        Objects.equals(this.enable, listAclRuleRequest.enable) &&
        Objects.equals(this.page, listAclRuleRequest.page) &&
        Objects.equals(this.pageSize, listAclRuleRequest.pageSize) &&
        Objects.equals(this.projectName, listAclRuleRequest.projectName) &&
        Objects.equals(this.ruleName, listAclRuleRequest.ruleName) &&
        Objects.equals(this.ruleTag, listAclRuleRequest.ruleTag) &&
        Objects.equals(this.timeOrderBy, listAclRuleRequest.timeOrderBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aclType, action, defenceHost, enable, page, pageSize, projectName, ruleName, ruleTag, timeOrderBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAclRuleRequest {\n");
    
    sb.append("    aclType: ").append(toIndentedString(aclType)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    defenceHost: ").append(toIndentedString(defenceHost)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    ruleTag: ").append(toIndentedString(ruleTag)).append("\n");
    sb.append("    timeOrderBy: ").append(toIndentedString(timeOrderBy)).append("\n");
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
