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
import com.volcengine.volcobserve.model.NotificationForCreateNotificationInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateNotificationRequest
 */



public class CreateNotificationRequest {
  @SerializedName("EffectEndAt")
  private String effectEndAt = null;

  @SerializedName("EffectStartAt")
  private String effectStartAt = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Notifications")
  private List<NotificationForCreateNotificationInput> notifications = null;

  public CreateNotificationRequest effectEndAt(String effectEndAt) {
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

  public CreateNotificationRequest effectStartAt(String effectStartAt) {
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

  public CreateNotificationRequest name(String name) {
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

  public CreateNotificationRequest notifications(List<NotificationForCreateNotificationInput> notifications) {
    this.notifications = notifications;
    return this;
  }

  public CreateNotificationRequest addNotificationsItem(NotificationForCreateNotificationInput notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<NotificationForCreateNotificationInput>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  @Valid
  @Schema(description = "")
  public List<NotificationForCreateNotificationInput> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<NotificationForCreateNotificationInput> notifications) {
    this.notifications = notifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateNotificationRequest createNotificationRequest = (CreateNotificationRequest) o;
    return Objects.equals(this.effectEndAt, createNotificationRequest.effectEndAt) &&
        Objects.equals(this.effectStartAt, createNotificationRequest.effectStartAt) &&
        Objects.equals(this.name, createNotificationRequest.name) &&
        Objects.equals(this.notifications, createNotificationRequest.notifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectEndAt, effectStartAt, name, notifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateNotificationRequest {\n");
    
    sb.append("    effectEndAt: ").append(toIndentedString(effectEndAt)).append("\n");
    sb.append("    effectStartAt: ").append(toIndentedString(effectStartAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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
