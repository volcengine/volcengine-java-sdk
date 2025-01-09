/*
 * seccenter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.seccenter.model;

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
 * AddCloudEnvRequest
 */



public class AddCloudEnvRequest {
  @SerializedName("AccessKey")
  private String accessKey = null;

  @SerializedName("CloudPlatform")
  private String cloudPlatform = null;

  @SerializedName("Comment")
  private String comment = null;

  @SerializedName("KeyType")
  private String keyType = null;

  @SerializedName("SecretKey")
  private String secretKey = null;

  @SerializedName("SyncPeriod")
  private Integer syncPeriod = null;

  public AddCloudEnvRequest accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public AddCloudEnvRequest cloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
    return this;
  }

   /**
   * Get cloudPlatform
   * @return cloudPlatform
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  public AddCloudEnvRequest comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public AddCloudEnvRequest keyType(String keyType) {
    this.keyType = keyType;
    return this;
  }

   /**
   * Get keyType
   * @return keyType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getKeyType() {
    return keyType;
  }

  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }

  public AddCloudEnvRequest secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Get secretKey
   * @return secretKey
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  public AddCloudEnvRequest syncPeriod(Integer syncPeriod) {
    this.syncPeriod = syncPeriod;
    return this;
  }

   /**
   * Get syncPeriod
   * @return syncPeriod
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getSyncPeriod() {
    return syncPeriod;
  }

  public void setSyncPeriod(Integer syncPeriod) {
    this.syncPeriod = syncPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddCloudEnvRequest addCloudEnvRequest = (AddCloudEnvRequest) o;
    return Objects.equals(this.accessKey, addCloudEnvRequest.accessKey) &&
        Objects.equals(this.cloudPlatform, addCloudEnvRequest.cloudPlatform) &&
        Objects.equals(this.comment, addCloudEnvRequest.comment) &&
        Objects.equals(this.keyType, addCloudEnvRequest.keyType) &&
        Objects.equals(this.secretKey, addCloudEnvRequest.secretKey) &&
        Objects.equals(this.syncPeriod, addCloudEnvRequest.syncPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, cloudPlatform, comment, keyType, secretKey, syncPeriod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCloudEnvRequest {\n");
    
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    syncPeriod: ").append(toIndentedString(syncPeriod)).append("\n");
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
