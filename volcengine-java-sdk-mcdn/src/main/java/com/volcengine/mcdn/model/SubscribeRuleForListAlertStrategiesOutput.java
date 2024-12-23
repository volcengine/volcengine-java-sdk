/*
 * mcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mcdn.model.ContactGroupForListAlertStrategiesOutput;
import com.volcengine.mcdn.model.ContactRobotForListAlertStrategiesOutput;
import com.volcengine.mcdn.model.NotifyConfigForListAlertStrategiesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SubscribeRuleForListAlertStrategiesOutput
 */



public class SubscribeRuleForListAlertStrategiesOutput {
  @SerializedName("ContactGroups")
  private List<ContactGroupForListAlertStrategiesOutput> contactGroups = null;

  @SerializedName("ContactRobots")
  private List<ContactRobotForListAlertStrategiesOutput> contactRobots = null;

  @SerializedName("NotifyConfig")
  private NotifyConfigForListAlertStrategiesOutput notifyConfig = null;

  public SubscribeRuleForListAlertStrategiesOutput contactGroups(List<ContactGroupForListAlertStrategiesOutput> contactGroups) {
    this.contactGroups = contactGroups;
    return this;
  }

  public SubscribeRuleForListAlertStrategiesOutput addContactGroupsItem(ContactGroupForListAlertStrategiesOutput contactGroupsItem) {
    if (this.contactGroups == null) {
      this.contactGroups = new ArrayList<ContactGroupForListAlertStrategiesOutput>();
    }
    this.contactGroups.add(contactGroupsItem);
    return this;
  }

   /**
   * Get contactGroups
   * @return contactGroups
  **/
  @Valid
  @Schema(description = "")
  public List<ContactGroupForListAlertStrategiesOutput> getContactGroups() {
    return contactGroups;
  }

  public void setContactGroups(List<ContactGroupForListAlertStrategiesOutput> contactGroups) {
    this.contactGroups = contactGroups;
  }

  public SubscribeRuleForListAlertStrategiesOutput contactRobots(List<ContactRobotForListAlertStrategiesOutput> contactRobots) {
    this.contactRobots = contactRobots;
    return this;
  }

  public SubscribeRuleForListAlertStrategiesOutput addContactRobotsItem(ContactRobotForListAlertStrategiesOutput contactRobotsItem) {
    if (this.contactRobots == null) {
      this.contactRobots = new ArrayList<ContactRobotForListAlertStrategiesOutput>();
    }
    this.contactRobots.add(contactRobotsItem);
    return this;
  }

   /**
   * Get contactRobots
   * @return contactRobots
  **/
  @Valid
  @Schema(description = "")
  public List<ContactRobotForListAlertStrategiesOutput> getContactRobots() {
    return contactRobots;
  }

  public void setContactRobots(List<ContactRobotForListAlertStrategiesOutput> contactRobots) {
    this.contactRobots = contactRobots;
  }

  public SubscribeRuleForListAlertStrategiesOutput notifyConfig(NotifyConfigForListAlertStrategiesOutput notifyConfig) {
    this.notifyConfig = notifyConfig;
    return this;
  }

   /**
   * Get notifyConfig
   * @return notifyConfig
  **/
  @Valid
  @Schema(description = "")
  public NotifyConfigForListAlertStrategiesOutput getNotifyConfig() {
    return notifyConfig;
  }

  public void setNotifyConfig(NotifyConfigForListAlertStrategiesOutput notifyConfig) {
    this.notifyConfig = notifyConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscribeRuleForListAlertStrategiesOutput subscribeRuleForListAlertStrategiesOutput = (SubscribeRuleForListAlertStrategiesOutput) o;
    return Objects.equals(this.contactGroups, subscribeRuleForListAlertStrategiesOutput.contactGroups) &&
        Objects.equals(this.contactRobots, subscribeRuleForListAlertStrategiesOutput.contactRobots) &&
        Objects.equals(this.notifyConfig, subscribeRuleForListAlertStrategiesOutput.notifyConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactGroups, contactRobots, notifyConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscribeRuleForListAlertStrategiesOutput {\n");
    
    sb.append("    contactGroups: ").append(toIndentedString(contactGroups)).append("\n");
    sb.append("    contactRobots: ").append(toIndentedString(contactRobots)).append("\n");
    sb.append("    notifyConfig: ").append(toIndentedString(notifyConfig)).append("\n");
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
