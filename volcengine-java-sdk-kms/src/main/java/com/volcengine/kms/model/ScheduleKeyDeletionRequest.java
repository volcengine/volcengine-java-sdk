/*
 * kms
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.kms.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ScheduleKeyDeletionRequest
 */



public class ScheduleKeyDeletionRequest {
  @SerializedName("KeyName")
  private String keyName = null;

  @SerializedName("KeyringName")
  private String keyringName = null;

  @SerializedName("PendingWindowInDays")
  private Integer pendingWindowInDays = null;

  public ScheduleKeyDeletionRequest keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

   /**
   * Get keyName
   * @return keyName
  **/
  @NotNull
 @Size(min=2,max=31)  @Schema(required = true, description = "")
  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public ScheduleKeyDeletionRequest keyringName(String keyringName) {
    this.keyringName = keyringName;
    return this;
  }

   /**
   * Get keyringName
   * @return keyringName
  **/
  @NotNull
 @Size(min=2,max=31)  @Schema(required = true, description = "")
  public String getKeyringName() {
    return keyringName;
  }

  public void setKeyringName(String keyringName) {
    this.keyringName = keyringName;
  }

  public ScheduleKeyDeletionRequest pendingWindowInDays(Integer pendingWindowInDays) {
    this.pendingWindowInDays = pendingWindowInDays;
    return this;
  }

   /**
   * Get pendingWindowInDays
   * minimum: 7
   * maximum: 30
   * @return pendingWindowInDays
  **/
 @Min(7) @Max(30)  @Schema(description = "")
  public Integer getPendingWindowInDays() {
    return pendingWindowInDays;
  }

  public void setPendingWindowInDays(Integer pendingWindowInDays) {
    this.pendingWindowInDays = pendingWindowInDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleKeyDeletionRequest scheduleKeyDeletionRequest = (ScheduleKeyDeletionRequest) o;
    return Objects.equals(this.keyName, scheduleKeyDeletionRequest.keyName) &&
        Objects.equals(this.keyringName, scheduleKeyDeletionRequest.keyringName) &&
        Objects.equals(this.pendingWindowInDays, scheduleKeyDeletionRequest.pendingWindowInDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyName, keyringName, pendingWindowInDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleKeyDeletionRequest {\n");
    
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    keyringName: ").append(toIndentedString(keyringName)).append("\n");
    sb.append("    pendingWindowInDays: ").append(toIndentedString(pendingWindowInDays)).append("\n");
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