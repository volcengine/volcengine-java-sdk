/*
 * iam
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam.model;

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
 * AccessKeyForCreateAccessKeyOutput
 */



public class AccessKeyForCreateAccessKeyOutput {
  @SerializedName("AccessKeyId")
  private String accessKeyId = null;

  @SerializedName("CreateDate")
  private String createDate = null;

  @SerializedName("SecretAccessKey")
  private String secretAccessKey = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateDate")
  private String updateDate = null;

  @SerializedName("UserName")
  private String userName = null;

  public AccessKeyForCreateAccessKeyOutput accessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

   /**
   * Get accessKeyId
   * @return accessKeyId
  **/
  @Schema(description = "")
  public String getAccessKeyId() {
    return accessKeyId;
  }

  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  public AccessKeyForCreateAccessKeyOutput createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @Schema(description = "")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public AccessKeyForCreateAccessKeyOutput secretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

   /**
   * Get secretAccessKey
   * @return secretAccessKey
  **/
  @Schema(description = "")
  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  public void setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }

  public AccessKeyForCreateAccessKeyOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public AccessKeyForCreateAccessKeyOutput updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @Schema(description = "")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }

  public AccessKeyForCreateAccessKeyOutput userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @Schema(description = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessKeyForCreateAccessKeyOutput accessKeyForCreateAccessKeyOutput = (AccessKeyForCreateAccessKeyOutput) o;
    return Objects.equals(this.accessKeyId, accessKeyForCreateAccessKeyOutput.accessKeyId) &&
        Objects.equals(this.createDate, accessKeyForCreateAccessKeyOutput.createDate) &&
        Objects.equals(this.secretAccessKey, accessKeyForCreateAccessKeyOutput.secretAccessKey) &&
        Objects.equals(this.status, accessKeyForCreateAccessKeyOutput.status) &&
        Objects.equals(this.updateDate, accessKeyForCreateAccessKeyOutput.updateDate) &&
        Objects.equals(this.userName, accessKeyForCreateAccessKeyOutput.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, createDate, secretAccessKey, status, updateDate, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessKeyForCreateAccessKeyOutput {\n");
    
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
