/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

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
 * TosAuthInformationForBatchUpdateCdnConfigInput
 */



public class TosAuthInformationForBatchUpdateCdnConfigInput {
  @SerializedName("AccessKeyId")
  private String accessKeyId = null;

  @SerializedName("AccessKeySecret")
  private String accessKeySecret = null;

  @SerializedName("AccountKey")
  private String accountKey = null;

  public TosAuthInformationForBatchUpdateCdnConfigInput accessKeyId(String accessKeyId) {
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

  public TosAuthInformationForBatchUpdateCdnConfigInput accessKeySecret(String accessKeySecret) {
    this.accessKeySecret = accessKeySecret;
    return this;
  }

   /**
   * Get accessKeySecret
   * @return accessKeySecret
  **/
  @Schema(description = "")
  public String getAccessKeySecret() {
    return accessKeySecret;
  }

  public void setAccessKeySecret(String accessKeySecret) {
    this.accessKeySecret = accessKeySecret;
  }

  public TosAuthInformationForBatchUpdateCdnConfigInput accountKey(String accountKey) {
    this.accountKey = accountKey;
    return this;
  }

   /**
   * Get accountKey
   * @return accountKey
  **/
  @Schema(description = "")
  public String getAccountKey() {
    return accountKey;
  }

  public void setAccountKey(String accountKey) {
    this.accountKey = accountKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TosAuthInformationForBatchUpdateCdnConfigInput tosAuthInformationForBatchUpdateCdnConfigInput = (TosAuthInformationForBatchUpdateCdnConfigInput) o;
    return Objects.equals(this.accessKeyId, tosAuthInformationForBatchUpdateCdnConfigInput.accessKeyId) &&
        Objects.equals(this.accessKeySecret, tosAuthInformationForBatchUpdateCdnConfigInput.accessKeySecret) &&
        Objects.equals(this.accountKey, tosAuthInformationForBatchUpdateCdnConfigInput.accountKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, accessKeySecret, accountKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TosAuthInformationForBatchUpdateCdnConfigInput {\n");
    
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    accessKeySecret: ").append(toIndentedString(accessKeySecret)).append("\n");
    sb.append("    accountKey: ").append(toIndentedString(accountKey)).append("\n");
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
