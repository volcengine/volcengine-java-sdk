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
import com.volcengine.waf.model.AccurateRuleForListBotAnalyseProtectRuleOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GroupForListBotAnalyseProtectRuleOutput
 */



public class GroupForListBotAnalyseProtectRuleOutput {
  @SerializedName("AccurateGroupPriority")
  private Integer accurateGroupPriority = null;

  @SerializedName("AccurateRules")
  private List<AccurateRuleForListBotAnalyseProtectRuleOutput> accurateRules = null;

  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Logic")
  private Integer logic = null;

  public GroupForListBotAnalyseProtectRuleOutput accurateGroupPriority(Integer accurateGroupPriority) {
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

  public GroupForListBotAnalyseProtectRuleOutput accurateRules(List<AccurateRuleForListBotAnalyseProtectRuleOutput> accurateRules) {
    this.accurateRules = accurateRules;
    return this;
  }

  public GroupForListBotAnalyseProtectRuleOutput addAccurateRulesItem(AccurateRuleForListBotAnalyseProtectRuleOutput accurateRulesItem) {
    if (this.accurateRules == null) {
      this.accurateRules = new ArrayList<AccurateRuleForListBotAnalyseProtectRuleOutput>();
    }
    this.accurateRules.add(accurateRulesItem);
    return this;
  }

   /**
   * Get accurateRules
   * @return accurateRules
  **/
  @Valid
  @Schema(description = "")
  public List<AccurateRuleForListBotAnalyseProtectRuleOutput> getAccurateRules() {
    return accurateRules;
  }

  public void setAccurateRules(List<AccurateRuleForListBotAnalyseProtectRuleOutput> accurateRules) {
    this.accurateRules = accurateRules;
  }

  public GroupForListBotAnalyseProtectRuleOutput id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GroupForListBotAnalyseProtectRuleOutput logic(Integer logic) {
    this.logic = logic;
    return this;
  }

   /**
   * Get logic
   * @return logic
  **/
  @Schema(description = "")
  public Integer getLogic() {
    return logic;
  }

  public void setLogic(Integer logic) {
    this.logic = logic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupForListBotAnalyseProtectRuleOutput groupForListBotAnalyseProtectRuleOutput = (GroupForListBotAnalyseProtectRuleOutput) o;
    return Objects.equals(this.accurateGroupPriority, groupForListBotAnalyseProtectRuleOutput.accurateGroupPriority) &&
        Objects.equals(this.accurateRules, groupForListBotAnalyseProtectRuleOutput.accurateRules) &&
        Objects.equals(this.id, groupForListBotAnalyseProtectRuleOutput.id) &&
        Objects.equals(this.logic, groupForListBotAnalyseProtectRuleOutput.logic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accurateGroupPriority, accurateRules, id, logic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupForListBotAnalyseProtectRuleOutput {\n");
    
    sb.append("    accurateGroupPriority: ").append(toIndentedString(accurateGroupPriority)).append("\n");
    sb.append("    accurateRules: ").append(toIndentedString(accurateRules)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logic: ").append(toIndentedString(logic)).append("\n");
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
