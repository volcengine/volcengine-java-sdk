/*
 * volc_observe
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcobserve.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcobserve.model.ConditionForCreateRuleInput;
import com.volcengine.volcobserve.model.DimensionConditionsForCreateRuleInput;
import com.volcengine.volcobserve.model.LevelConditionForCreateRuleInput;
import com.volcengine.volcobserve.model.NoDataForCreateRuleInput;
import com.volcengine.volcobserve.model.RecoveryNotifyForCreateRuleInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateRuleRequest
 */



public class CreateRuleRequest {
  /**
   * Gets or Sets alertMethods
   */
  @JsonAdapter(AlertMethodsEnum.Adapter.class)
  public enum AlertMethodsEnum {
    @SerializedName("Email")
    EMAIL("Email"),
    @SerializedName("Phone")
    PHONE("Phone"),
    @SerializedName("SMS")
    SMS("SMS"),
    @SerializedName("Webhook")
    WEBHOOK("Webhook");

    private String value;

    AlertMethodsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AlertMethodsEnum fromValue(String input) {
      for (AlertMethodsEnum b : AlertMethodsEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AlertMethodsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlertMethodsEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AlertMethodsEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AlertMethodsEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("AlertMethods")
  private List<AlertMethodsEnum> alertMethods = null;

  @SerializedName("ConditionOperator")
  private String conditionOperator = null;

  @SerializedName("Conditions")
  private List<ConditionForCreateRuleInput> conditions = null;

  @SerializedName("ContactGroupIds")
  private List<String> contactGroupIds = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DimensionConditions")
  private DimensionConditionsForCreateRuleInput dimensionConditions = null;

  @SerializedName("EffectEndAt")
  private String effectEndAt = null;

  @SerializedName("EffectStartAt")
  private String effectStartAt = null;

  @SerializedName("EnableState")
  private String enableState = null;

  @SerializedName("EvaluationCount")
  private Integer evaluationCount = null;

  @SerializedName("Level")
  private String level = null;

  @SerializedName("LevelConditions")
  private List<LevelConditionForCreateRuleInput> levelConditions = null;

  @SerializedName("MultipleConditions")
  private Boolean multipleConditions = null;

  @SerializedName("Namespace")
  private String namespace = null;

  @SerializedName("NoData")
  private NoDataForCreateRuleInput noData = null;

  @SerializedName("NotificationId")
  private String notificationId = null;

  @SerializedName("OriginalDimensions")
  private Map<String, List<String>> originalDimensions = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RecoveryNotify")
  private RecoveryNotifyForCreateRuleInput recoveryNotify = null;

  @SerializedName("Regions")
  private List<String> regions = null;

  @SerializedName("RuleName")
  private String ruleName = null;

  /**
   * Gets or Sets ruleType
   */
  @JsonAdapter(RuleTypeEnum.Adapter.class)
  public enum RuleTypeEnum {
    @SerializedName("static")
    STATIC("static"),
    @SerializedName("dynamic")
    DYNAMIC("dynamic");

    private String value;

    RuleTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RuleTypeEnum fromValue(String input) {
      for (RuleTypeEnum b : RuleTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RuleTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RuleTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RuleTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RuleTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("RuleType")
  private RuleTypeEnum ruleType = null;

  @SerializedName("SilenceTime")
  private Integer silenceTime = null;

  @SerializedName("SubNamespace")
  private String subNamespace = null;

  @SerializedName("Webhook")
  private String webhook = null;

  @SerializedName("WebhookIds")
  private List<String> webhookIds = null;

  public CreateRuleRequest alertMethods(List<AlertMethodsEnum> alertMethods) {
    this.alertMethods = alertMethods;
    return this;
  }

  public CreateRuleRequest addAlertMethodsItem(AlertMethodsEnum alertMethodsItem) {
    if (this.alertMethods == null) {
      this.alertMethods = new ArrayList<AlertMethodsEnum>();
    }
    this.alertMethods.add(alertMethodsItem);
    return this;
  }

   /**
   * Get alertMethods
   * @return alertMethods
  **/
  @Schema(description = "")
  public List<AlertMethodsEnum> getAlertMethods() {
    return alertMethods;
  }

  public void setAlertMethods(List<AlertMethodsEnum> alertMethods) {
    this.alertMethods = alertMethods;
  }

  public CreateRuleRequest conditionOperator(String conditionOperator) {
    this.conditionOperator = conditionOperator;
    return this;
  }

   /**
   * Get conditionOperator
   * @return conditionOperator
  **/
  @Schema(description = "")
  public String getConditionOperator() {
    return conditionOperator;
  }

  public void setConditionOperator(String conditionOperator) {
    this.conditionOperator = conditionOperator;
  }

  public CreateRuleRequest conditions(List<ConditionForCreateRuleInput> conditions) {
    this.conditions = conditions;
    return this;
  }

  public CreateRuleRequest addConditionsItem(ConditionForCreateRuleInput conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<ConditionForCreateRuleInput>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @Valid
  @Schema(description = "")
  public List<ConditionForCreateRuleInput> getConditions() {
    return conditions;
  }

  public void setConditions(List<ConditionForCreateRuleInput> conditions) {
    this.conditions = conditions;
  }

  public CreateRuleRequest contactGroupIds(List<String> contactGroupIds) {
    this.contactGroupIds = contactGroupIds;
    return this;
  }

  public CreateRuleRequest addContactGroupIdsItem(String contactGroupIdsItem) {
    if (this.contactGroupIds == null) {
      this.contactGroupIds = new ArrayList<String>();
    }
    this.contactGroupIds.add(contactGroupIdsItem);
    return this;
  }

   /**
   * Get contactGroupIds
   * @return contactGroupIds
  **/
  @Schema(description = "")
  public List<String> getContactGroupIds() {
    return contactGroupIds;
  }

  public void setContactGroupIds(List<String> contactGroupIds) {
    this.contactGroupIds = contactGroupIds;
  }

  public CreateRuleRequest description(String description) {
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

  public CreateRuleRequest dimensionConditions(DimensionConditionsForCreateRuleInput dimensionConditions) {
    this.dimensionConditions = dimensionConditions;
    return this;
  }

   /**
   * Get dimensionConditions
   * @return dimensionConditions
  **/
  @Valid
  @Schema(description = "")
  public DimensionConditionsForCreateRuleInput getDimensionConditions() {
    return dimensionConditions;
  }

  public void setDimensionConditions(DimensionConditionsForCreateRuleInput dimensionConditions) {
    this.dimensionConditions = dimensionConditions;
  }

  public CreateRuleRequest effectEndAt(String effectEndAt) {
    this.effectEndAt = effectEndAt;
    return this;
  }

   /**
   * Get effectEndAt
   * @return effectEndAt
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getEffectEndAt() {
    return effectEndAt;
  }

  public void setEffectEndAt(String effectEndAt) {
    this.effectEndAt = effectEndAt;
  }

  public CreateRuleRequest effectStartAt(String effectStartAt) {
    this.effectStartAt = effectStartAt;
    return this;
  }

   /**
   * Get effectStartAt
   * @return effectStartAt
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getEffectStartAt() {
    return effectStartAt;
  }

  public void setEffectStartAt(String effectStartAt) {
    this.effectStartAt = effectStartAt;
  }

  public CreateRuleRequest enableState(String enableState) {
    this.enableState = enableState;
    return this;
  }

   /**
   * Get enableState
   * @return enableState
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getEnableState() {
    return enableState;
  }

  public void setEnableState(String enableState) {
    this.enableState = enableState;
  }

  public CreateRuleRequest evaluationCount(Integer evaluationCount) {
    this.evaluationCount = evaluationCount;
    return this;
  }

   /**
   * Get evaluationCount
   * @return evaluationCount
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getEvaluationCount() {
    return evaluationCount;
  }

  public void setEvaluationCount(Integer evaluationCount) {
    this.evaluationCount = evaluationCount;
  }

  public CreateRuleRequest level(String level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public CreateRuleRequest levelConditions(List<LevelConditionForCreateRuleInput> levelConditions) {
    this.levelConditions = levelConditions;
    return this;
  }

  public CreateRuleRequest addLevelConditionsItem(LevelConditionForCreateRuleInput levelConditionsItem) {
    if (this.levelConditions == null) {
      this.levelConditions = new ArrayList<LevelConditionForCreateRuleInput>();
    }
    this.levelConditions.add(levelConditionsItem);
    return this;
  }

   /**
   * Get levelConditions
   * @return levelConditions
  **/
  @Valid
  @Schema(description = "")
  public List<LevelConditionForCreateRuleInput> getLevelConditions() {
    return levelConditions;
  }

  public void setLevelConditions(List<LevelConditionForCreateRuleInput> levelConditions) {
    this.levelConditions = levelConditions;
  }

  public CreateRuleRequest multipleConditions(Boolean multipleConditions) {
    this.multipleConditions = multipleConditions;
    return this;
  }

   /**
   * Get multipleConditions
   * @return multipleConditions
  **/
  @Schema(description = "")
  public Boolean isMultipleConditions() {
    return multipleConditions;
  }

  public void setMultipleConditions(Boolean multipleConditions) {
    this.multipleConditions = multipleConditions;
  }

  public CreateRuleRequest namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public CreateRuleRequest noData(NoDataForCreateRuleInput noData) {
    this.noData = noData;
    return this;
  }

   /**
   * Get noData
   * @return noData
  **/
  @Valid
  @Schema(description = "")
  public NoDataForCreateRuleInput getNoData() {
    return noData;
  }

  public void setNoData(NoDataForCreateRuleInput noData) {
    this.noData = noData;
  }

  public CreateRuleRequest notificationId(String notificationId) {
    this.notificationId = notificationId;
    return this;
  }

   /**
   * Get notificationId
   * @return notificationId
  **/
  @Schema(description = "")
  public String getNotificationId() {
    return notificationId;
  }

  public void setNotificationId(String notificationId) {
    this.notificationId = notificationId;
  }

  public CreateRuleRequest originalDimensions(Map<String, List<String>> originalDimensions) {
    this.originalDimensions = originalDimensions;
    return this;
  }

  public CreateRuleRequest putOriginalDimensionsItem(String key, List<String> originalDimensionsItem) {
    if (this.originalDimensions == null) {
      this.originalDimensions = new HashMap<String, List<String>>();
    }
    this.originalDimensions.put(key, originalDimensionsItem);
    return this;
  }

   /**
   * Get originalDimensions
   * @return originalDimensions
  **/
  @Valid
  @Schema(description = "")
  public Map<String, List<String>> getOriginalDimensions() {
    return originalDimensions;
  }

  public void setOriginalDimensions(Map<String, List<String>> originalDimensions) {
    this.originalDimensions = originalDimensions;
  }

  public CreateRuleRequest projectName(String projectName) {
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

  public CreateRuleRequest recoveryNotify(RecoveryNotifyForCreateRuleInput recoveryNotify) {
    this.recoveryNotify = recoveryNotify;
    return this;
  }

   /**
   * Get recoveryNotify
   * @return recoveryNotify
  **/
  @Valid
  @Schema(description = "")
  public RecoveryNotifyForCreateRuleInput getRecoveryNotify() {
    return recoveryNotify;
  }

  public void setRecoveryNotify(RecoveryNotifyForCreateRuleInput recoveryNotify) {
    this.recoveryNotify = recoveryNotify;
  }

  public CreateRuleRequest regions(List<String> regions) {
    this.regions = regions;
    return this;
  }

  public CreateRuleRequest addRegionsItem(String regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<String>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @Schema(description = "")
  public List<String> getRegions() {
    return regions;
  }

  public void setRegions(List<String> regions) {
    this.regions = regions;
  }

  public CreateRuleRequest ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Get ruleName
   * @return ruleName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public CreateRuleRequest ruleType(RuleTypeEnum ruleType) {
    this.ruleType = ruleType;
    return this;
  }

   /**
   * Get ruleType
   * @return ruleType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public RuleTypeEnum getRuleType() {
    return ruleType;
  }

  public void setRuleType(RuleTypeEnum ruleType) {
    this.ruleType = ruleType;
  }

  public CreateRuleRequest silenceTime(Integer silenceTime) {
    this.silenceTime = silenceTime;
    return this;
  }

   /**
   * Get silenceTime
   * @return silenceTime
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getSilenceTime() {
    return silenceTime;
  }

  public void setSilenceTime(Integer silenceTime) {
    this.silenceTime = silenceTime;
  }

  public CreateRuleRequest subNamespace(String subNamespace) {
    this.subNamespace = subNamespace;
    return this;
  }

   /**
   * Get subNamespace
   * @return subNamespace
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSubNamespace() {
    return subNamespace;
  }

  public void setSubNamespace(String subNamespace) {
    this.subNamespace = subNamespace;
  }

  public CreateRuleRequest webhook(String webhook) {
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @Schema(description = "")
  public String getWebhook() {
    return webhook;
  }

  public void setWebhook(String webhook) {
    this.webhook = webhook;
  }

  public CreateRuleRequest webhookIds(List<String> webhookIds) {
    this.webhookIds = webhookIds;
    return this;
  }

  public CreateRuleRequest addWebhookIdsItem(String webhookIdsItem) {
    if (this.webhookIds == null) {
      this.webhookIds = new ArrayList<String>();
    }
    this.webhookIds.add(webhookIdsItem);
    return this;
  }

   /**
   * Get webhookIds
   * @return webhookIds
  **/
  @Schema(description = "")
  public List<String> getWebhookIds() {
    return webhookIds;
  }

  public void setWebhookIds(List<String> webhookIds) {
    this.webhookIds = webhookIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRuleRequest createRuleRequest = (CreateRuleRequest) o;
    return Objects.equals(this.alertMethods, createRuleRequest.alertMethods) &&
        Objects.equals(this.conditionOperator, createRuleRequest.conditionOperator) &&
        Objects.equals(this.conditions, createRuleRequest.conditions) &&
        Objects.equals(this.contactGroupIds, createRuleRequest.contactGroupIds) &&
        Objects.equals(this.description, createRuleRequest.description) &&
        Objects.equals(this.dimensionConditions, createRuleRequest.dimensionConditions) &&
        Objects.equals(this.effectEndAt, createRuleRequest.effectEndAt) &&
        Objects.equals(this.effectStartAt, createRuleRequest.effectStartAt) &&
        Objects.equals(this.enableState, createRuleRequest.enableState) &&
        Objects.equals(this.evaluationCount, createRuleRequest.evaluationCount) &&
        Objects.equals(this.level, createRuleRequest.level) &&
        Objects.equals(this.levelConditions, createRuleRequest.levelConditions) &&
        Objects.equals(this.multipleConditions, createRuleRequest.multipleConditions) &&
        Objects.equals(this.namespace, createRuleRequest.namespace) &&
        Objects.equals(this.noData, createRuleRequest.noData) &&
        Objects.equals(this.notificationId, createRuleRequest.notificationId) &&
        Objects.equals(this.originalDimensions, createRuleRequest.originalDimensions) &&
        Objects.equals(this.projectName, createRuleRequest.projectName) &&
        Objects.equals(this.recoveryNotify, createRuleRequest.recoveryNotify) &&
        Objects.equals(this.regions, createRuleRequest.regions) &&
        Objects.equals(this.ruleName, createRuleRequest.ruleName) &&
        Objects.equals(this.ruleType, createRuleRequest.ruleType) &&
        Objects.equals(this.silenceTime, createRuleRequest.silenceTime) &&
        Objects.equals(this.subNamespace, createRuleRequest.subNamespace) &&
        Objects.equals(this.webhook, createRuleRequest.webhook) &&
        Objects.equals(this.webhookIds, createRuleRequest.webhookIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertMethods, conditionOperator, conditions, contactGroupIds, description, dimensionConditions, effectEndAt, effectStartAt, enableState, evaluationCount, level, levelConditions, multipleConditions, namespace, noData, notificationId, originalDimensions, projectName, recoveryNotify, regions, ruleName, ruleType, silenceTime, subNamespace, webhook, webhookIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRuleRequest {\n");
    
    sb.append("    alertMethods: ").append(toIndentedString(alertMethods)).append("\n");
    sb.append("    conditionOperator: ").append(toIndentedString(conditionOperator)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    contactGroupIds: ").append(toIndentedString(contactGroupIds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dimensionConditions: ").append(toIndentedString(dimensionConditions)).append("\n");
    sb.append("    effectEndAt: ").append(toIndentedString(effectEndAt)).append("\n");
    sb.append("    effectStartAt: ").append(toIndentedString(effectStartAt)).append("\n");
    sb.append("    enableState: ").append(toIndentedString(enableState)).append("\n");
    sb.append("    evaluationCount: ").append(toIndentedString(evaluationCount)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    levelConditions: ").append(toIndentedString(levelConditions)).append("\n");
    sb.append("    multipleConditions: ").append(toIndentedString(multipleConditions)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    noData: ").append(toIndentedString(noData)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    originalDimensions: ").append(toIndentedString(originalDimensions)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    recoveryNotify: ").append(toIndentedString(recoveryNotify)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    silenceTime: ").append(toIndentedString(silenceTime)).append("\n");
    sb.append("    subNamespace: ").append(toIndentedString(subNamespace)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    webhookIds: ").append(toIndentedString(webhookIds)).append("\n");
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
