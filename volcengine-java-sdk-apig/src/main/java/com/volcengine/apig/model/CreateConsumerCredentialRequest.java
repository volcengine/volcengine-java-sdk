/*
 * apig
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.apig.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.apig.model.HmacAuthCredentialForCreateConsumerCredentialInput;
import com.volcengine.apig.model.KeyAuthCredentialForCreateConsumerCredentialInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateConsumerCredentialRequest
 */



public class CreateConsumerCredentialRequest {
  @SerializedName("ConsumerId")
  private String consumerId = null;

  @SerializedName("CredentialType")
  private String credentialType = null;

  @SerializedName("HmacAuthCredential")
  private HmacAuthCredentialForCreateConsumerCredentialInput hmacAuthCredential = null;

  @SerializedName("KeyAuthCredential")
  private KeyAuthCredentialForCreateConsumerCredentialInput keyAuthCredential = null;

  public CreateConsumerCredentialRequest consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

   /**
   * Get consumerId
   * @return consumerId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public CreateConsumerCredentialRequest credentialType(String credentialType) {
    this.credentialType = credentialType;
    return this;
  }

   /**
   * Get credentialType
   * @return credentialType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCredentialType() {
    return credentialType;
  }

  public void setCredentialType(String credentialType) {
    this.credentialType = credentialType;
  }

  public CreateConsumerCredentialRequest hmacAuthCredential(HmacAuthCredentialForCreateConsumerCredentialInput hmacAuthCredential) {
    this.hmacAuthCredential = hmacAuthCredential;
    return this;
  }

   /**
   * Get hmacAuthCredential
   * @return hmacAuthCredential
  **/
  @Valid
  @Schema(description = "")
  public HmacAuthCredentialForCreateConsumerCredentialInput getHmacAuthCredential() {
    return hmacAuthCredential;
  }

  public void setHmacAuthCredential(HmacAuthCredentialForCreateConsumerCredentialInput hmacAuthCredential) {
    this.hmacAuthCredential = hmacAuthCredential;
  }

  public CreateConsumerCredentialRequest keyAuthCredential(KeyAuthCredentialForCreateConsumerCredentialInput keyAuthCredential) {
    this.keyAuthCredential = keyAuthCredential;
    return this;
  }

   /**
   * Get keyAuthCredential
   * @return keyAuthCredential
  **/
  @Valid
  @Schema(description = "")
  public KeyAuthCredentialForCreateConsumerCredentialInput getKeyAuthCredential() {
    return keyAuthCredential;
  }

  public void setKeyAuthCredential(KeyAuthCredentialForCreateConsumerCredentialInput keyAuthCredential) {
    this.keyAuthCredential = keyAuthCredential;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConsumerCredentialRequest createConsumerCredentialRequest = (CreateConsumerCredentialRequest) o;
    return Objects.equals(this.consumerId, createConsumerCredentialRequest.consumerId) &&
        Objects.equals(this.credentialType, createConsumerCredentialRequest.credentialType) &&
        Objects.equals(this.hmacAuthCredential, createConsumerCredentialRequest.hmacAuthCredential) &&
        Objects.equals(this.keyAuthCredential, createConsumerCredentialRequest.keyAuthCredential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId, credentialType, hmacAuthCredential, keyAuthCredential);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConsumerCredentialRequest {\n");
    
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
    sb.append("    hmacAuthCredential: ").append(toIndentedString(hmacAuthCredential)).append("\n");
    sb.append("    keyAuthCredential: ").append(toIndentedString(keyAuthCredential)).append("\n");
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
