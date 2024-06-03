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
import com.volcengine.waf.model.AccurateForListCustomBotConfigOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DataForListCustomBotConfigOutput
 */



public class DataForListCustomBotConfigOutput {
  @SerializedName("Accurate")
  private List<AccurateForListCustomBotConfigOutput> accurate = null;

  @SerializedName("Action")
  private String action = null;

  @SerializedName("Advanced")
  private Integer advanced = null;

  @SerializedName("BotType")
  private String botType = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Enable")
  private Integer enable = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("RuleTag")
  private String ruleTag = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public DataForListCustomBotConfigOutput accurate(List<AccurateForListCustomBotConfigOutput> accurate) {
    this.accurate = accurate;
    return this;
  }

  public DataForListCustomBotConfigOutput addAccurateItem(AccurateForListCustomBotConfigOutput accurateItem) {
    if (this.accurate == null) {
      this.accurate = new ArrayList<AccurateForListCustomBotConfigOutput>();
    }
    this.accurate.add(accurateItem);
    return this;
  }

   /**
   * Get accurate
   * @return accurate
  **/
  @Valid
  @Schema(description = "")
  public List<AccurateForListCustomBotConfigOutput> getAccurate() {
    return accurate;
  }

  public void setAccurate(List<AccurateForListCustomBotConfigOutput> accurate) {
    this.accurate = accurate;
  }

  public DataForListCustomBotConfigOutput action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public DataForListCustomBotConfigOutput advanced(Integer advanced) {
    this.advanced = advanced;
    return this;
  }

   /**
   * Get advanced
   * @return advanced
  **/
  @Schema(description = "")
  public Integer getAdvanced() {
    return advanced;
  }

  public void setAdvanced(Integer advanced) {
    this.advanced = advanced;
  }

  public DataForListCustomBotConfigOutput botType(String botType) {
    this.botType = botType;
    return this;
  }

   /**
   * Get botType
   * @return botType
  **/
  @Schema(description = "")
  public String getBotType() {
    return botType;
  }

  public void setBotType(String botType) {
    this.botType = botType;
  }

  public DataForListCustomBotConfigOutput description(String description) {
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

  public DataForListCustomBotConfigOutput enable(Integer enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Schema(description = "")
  public Integer getEnable() {
    return enable;
  }

  public void setEnable(Integer enable) {
    this.enable = enable;
  }

  public DataForListCustomBotConfigOutput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DataForListCustomBotConfigOutput ruleTag(String ruleTag) {
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

  public DataForListCustomBotConfigOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForListCustomBotConfigOutput dataForListCustomBotConfigOutput = (DataForListCustomBotConfigOutput) o;
    return Objects.equals(this.accurate, dataForListCustomBotConfigOutput.accurate) &&
        Objects.equals(this.action, dataForListCustomBotConfigOutput.action) &&
        Objects.equals(this.advanced, dataForListCustomBotConfigOutput.advanced) &&
        Objects.equals(this.botType, dataForListCustomBotConfigOutput.botType) &&
        Objects.equals(this.description, dataForListCustomBotConfigOutput.description) &&
        Objects.equals(this.enable, dataForListCustomBotConfigOutput.enable) &&
        Objects.equals(this.id, dataForListCustomBotConfigOutput.id) &&
        Objects.equals(this.ruleTag, dataForListCustomBotConfigOutput.ruleTag) &&
        Objects.equals(this.updateTime, dataForListCustomBotConfigOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accurate, action, advanced, botType, description, enable, id, ruleTag, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForListCustomBotConfigOutput {\n");
    
    sb.append("    accurate: ").append(toIndentedString(accurate)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
    sb.append("    botType: ").append(toIndentedString(botType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ruleTag: ").append(toIndentedString(ruleTag)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
