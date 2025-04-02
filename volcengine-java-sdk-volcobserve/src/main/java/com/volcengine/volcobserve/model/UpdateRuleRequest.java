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
import com.volcengine.volcobserve.model.ConditionForUpdateRuleInput;
import com.volcengine.volcobserve.model.ConvertTagForUpdateRuleInput;
import com.volcengine.volcobserve.model.DimensionConditionsForUpdateRuleInput;
import com.volcengine.volcobserve.model.LevelConditionForUpdateRuleInput;
import com.volcengine.volcobserve.model.NoDataForUpdateRuleInput;
import com.volcengine.volcobserve.model.RecoveryNotifyForUpdateRuleInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateRuleRequest
 */



public class UpdateRuleRequest {
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
  private List<ConditionForUpdateRuleInput> conditions = null;

  @SerializedName("ContactGroupIds")
  private List<String> contactGroupIds = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DimensionConditions")
  private DimensionConditionsForUpdateRuleInput dimensionConditions = null;

  @SerializedName("EffectEndAt")
  private String effectEndAt = null;

  @SerializedName("EffectStartAt")
  private String effectStartAt = null;

  @SerializedName("EnableState")
  private String enableState = null;

  @SerializedName("EvaluationCount")
  private Integer evaluationCount = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Level")
  private String level = null;

  @SerializedName("LevelConditions")
  private List<LevelConditionForUpdateRuleInput> levelConditions = null;

  @SerializedName("MultipleConditions")
  private Boolean multipleConditions = null;

  @SerializedName("Namespace")
  private String namespace = null;

  @SerializedName("NoData")
  private NoDataForUpdateRuleInput noData = null;

  @SerializedName("NotificationId")
  private String notificationId = null;

  @SerializedName("OriginalDimensions")
  private Map<String, List<String>> originalDimensions = null;

  @SerializedName("RecoveryNotify")
  private RecoveryNotifyForUpdateRuleInput recoveryNotify = null;

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

  @SerializedName("Tags")
  private List<ConvertTagForUpdateRuleInput> tags = null;

  @SerializedName("Webhook")
  private String webhook = null;

  @SerializedName("WebhookIds")
  private List<String> webhookIds = null;

  public UpdateRuleRequest alertMethods(List<AlertMethodsEnum> alertMethods) {
    this.alertMethods = alertMethods;
    return this;
  }

  public UpdateRuleRequest addAlertMethodsItem(AlertMethodsEnum alertMethodsItem) {
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

  public UpdateRuleRequest conditionOperator(String conditionOperator) {
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

  public UpdateRuleRequest conditions(List<ConditionForUpdateRuleInput> conditions) {
    this.conditions = conditions;
    return this;
  }

  public UpdateRuleRequest addConditionsItem(ConditionForUpdateRuleInput conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<ConditionForUpdateRuleInput>();
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
  public List<ConditionForUpdateRuleInput> getConditions() {
    return conditions;
  }

  public void setConditions(List<ConditionForUpdateRuleInput> conditions) {
    this.conditions = conditions;
  }

  public UpdateRuleRequest contactGroupIds(List<String> contactGroupIds) {
    this.contactGroupIds = contactGroupIds;
    return this;
  }

  public UpdateRuleRequest addContactGroupIdsItem(String contactGroupIdsItem) {
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

  public UpdateRuleRequest description(String description) {
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

  public UpdateRuleRequest dimensionConditions(DimensionConditionsForUpdateRuleInput dimensionConditions) {
    this.dimensionConditions = dimensionConditions;
    return this;
  }

   /**
   * Get dimensionConditions
   * @return dimensionConditions
  **/
  @Valid
  @Schema(description = "")
  public DimensionConditionsForUpdateRuleInput getDimensionConditions() {
    return dimensionConditions;
  }

  public void setDimensionConditions(DimensionConditionsForUpdateRuleInput dimensionConditions) {
    this.dimensionConditions = dimensionConditions;
  }

  public UpdateRuleRequest effectEndAt(String effectEndAt) {
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

  public UpdateRuleRequest effectStartAt(String effectStartAt) {
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

  public UpdateRuleRequest enableState(String enableState) {
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

  public UpdateRuleRequest evaluationCount(Integer evaluationCount) {
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

  public UpdateRuleRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdateRuleRequest level(String level) {
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

  public UpdateRuleRequest levelConditions(List<LevelConditionForUpdateRuleInput> levelConditions) {
    this.levelConditions = levelConditions;
    return this;
  }

  public UpdateRuleRequest addLevelConditionsItem(LevelConditionForUpdateRuleInput levelConditionsItem) {
    if (this.levelConditions == null) {
      this.levelConditions = new ArrayList<LevelConditionForUpdateRuleInput>();
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
  public List<LevelConditionForUpdateRuleInput> getLevelConditions() {
    return levelConditions;
  }

  public void setLevelConditions(List<LevelConditionForUpdateRuleInput> levelConditions) {
    this.levelConditions = levelConditions;
  }

  public UpdateRuleRequest multipleConditions(Boolean multipleConditions) {
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

  public UpdateRuleRequest namespace(String namespace) {
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

  public UpdateRuleRequest noData(NoDataForUpdateRuleInput noData) {
    this.noData = noData;
    return this;
  }

   /**
   * Get noData
   * @return noData
  **/
  @Valid
  @Schema(description = "")
  public NoDataForUpdateRuleInput getNoData() {
    return noData;
  }

  public void setNoData(NoDataForUpdateRuleInput noData) {
    this.noData = noData;
  }

  public UpdateRuleRequest notificationId(String notificationId) {
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

  public UpdateRuleRequest originalDimensions(Map<String, List<String>> originalDimensions) {
    this.originalDimensions = originalDimensions;
    return this;
  }

  public UpdateRuleRequest putOriginalDimensionsItem(String key, List<String> originalDimensionsItem) {
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

  public UpdateRuleRequest recoveryNotify(RecoveryNotifyForUpdateRuleInput recoveryNotify) {
    this.recoveryNotify = recoveryNotify;
    return this;
  }

   /**
   * Get recoveryNotify
   * @return recoveryNotify
  **/
  @Valid
  @Schema(description = "")
  public RecoveryNotifyForUpdateRuleInput getRecoveryNotify() {
    return recoveryNotify;
  }

  public void setRecoveryNotify(RecoveryNotifyForUpdateRuleInput recoveryNotify) {
    this.recoveryNotify = recoveryNotify;
  }

  public UpdateRuleRequest regions(List<String> regions) {
    this.regions = regions;
    return this;
  }

  public UpdateRuleRequest addRegionsItem(String regionsItem) {
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

  public UpdateRuleRequest ruleName(String ruleName) {
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

  public UpdateRuleRequest ruleType(RuleTypeEnum ruleType) {
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

  public UpdateRuleRequest silenceTime(Integer silenceTime) {
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

  public UpdateRuleRequest subNamespace(String subNamespace) {
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

  public UpdateRuleRequest tags(List<ConvertTagForUpdateRuleInput> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateRuleRequest addTagsItem(ConvertTagForUpdateRuleInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<ConvertTagForUpdateRuleInput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<ConvertTagForUpdateRuleInput> getTags() {
    return tags;
  }

  public void setTags(List<ConvertTagForUpdateRuleInput> tags) {
    this.tags = tags;
  }

  public UpdateRuleRequest webhook(String webhook) {
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

  public UpdateRuleRequest webhookIds(List<String> webhookIds) {
    this.webhookIds = webhookIds;
    return this;
  }

  public UpdateRuleRequest addWebhookIdsItem(String webhookIdsItem) {
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
    UpdateRuleRequest updateRuleRequest = (UpdateRuleRequest) o;
    return Objects.equals(this.alertMethods, updateRuleRequest.alertMethods) &&
        Objects.equals(this.conditionOperator, updateRuleRequest.conditionOperator) &&
        Objects.equals(this.conditions, updateRuleRequest.conditions) &&
        Objects.equals(this.contactGroupIds, updateRuleRequest.contactGroupIds) &&
        Objects.equals(this.description, updateRuleRequest.description) &&
        Objects.equals(this.dimensionConditions, updateRuleRequest.dimensionConditions) &&
        Objects.equals(this.effectEndAt, updateRuleRequest.effectEndAt) &&
        Objects.equals(this.effectStartAt, updateRuleRequest.effectStartAt) &&
        Objects.equals(this.enableState, updateRuleRequest.enableState) &&
        Objects.equals(this.evaluationCount, updateRuleRequest.evaluationCount) &&
        Objects.equals(this.id, updateRuleRequest.id) &&
        Objects.equals(this.level, updateRuleRequest.level) &&
        Objects.equals(this.levelConditions, updateRuleRequest.levelConditions) &&
        Objects.equals(this.multipleConditions, updateRuleRequest.multipleConditions) &&
        Objects.equals(this.namespace, updateRuleRequest.namespace) &&
        Objects.equals(this.noData, updateRuleRequest.noData) &&
        Objects.equals(this.notificationId, updateRuleRequest.notificationId) &&
        Objects.equals(this.originalDimensions, updateRuleRequest.originalDimensions) &&
        Objects.equals(this.recoveryNotify, updateRuleRequest.recoveryNotify) &&
        Objects.equals(this.regions, updateRuleRequest.regions) &&
        Objects.equals(this.ruleName, updateRuleRequest.ruleName) &&
        Objects.equals(this.ruleType, updateRuleRequest.ruleType) &&
        Objects.equals(this.silenceTime, updateRuleRequest.silenceTime) &&
        Objects.equals(this.subNamespace, updateRuleRequest.subNamespace) &&
        Objects.equals(this.tags, updateRuleRequest.tags) &&
        Objects.equals(this.webhook, updateRuleRequest.webhook) &&
        Objects.equals(this.webhookIds, updateRuleRequest.webhookIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertMethods, conditionOperator, conditions, contactGroupIds, description, dimensionConditions, effectEndAt, effectStartAt, enableState, evaluationCount, id, level, levelConditions, multipleConditions, namespace, noData, notificationId, originalDimensions, recoveryNotify, regions, ruleName, ruleType, silenceTime, subNamespace, tags, webhook, webhookIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRuleRequest {\n");
    
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
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    levelConditions: ").append(toIndentedString(levelConditions)).append("\n");
    sb.append("    multipleConditions: ").append(toIndentedString(multipleConditions)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    noData: ").append(toIndentedString(noData)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    originalDimensions: ").append(toIndentedString(originalDimensions)).append("\n");
    sb.append("    recoveryNotify: ").append(toIndentedString(recoveryNotify)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    silenceTime: ").append(toIndentedString(silenceTime)).append("\n");
    sb.append("    subNamespace: ").append(toIndentedString(subNamespace)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
