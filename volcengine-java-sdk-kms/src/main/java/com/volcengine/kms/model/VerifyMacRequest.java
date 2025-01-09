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
 * VerifyMacRequest
 */



public class VerifyMacRequest {
  @SerializedName("KeyID")
  private String keyID = null;

  @SerializedName("KeyName")
  private String keyName = null;

  @SerializedName("KeyringName")
  private String keyringName = null;

  @SerializedName("Mac")
  private String mac = null;

  @SerializedName("MacAlgorithm")
  private String macAlgorithm = null;

  @SerializedName("Message")
  private String message = null;

  public VerifyMacRequest keyID(String keyID) {
    this.keyID = keyID;
    return this;
  }

   /**
   * Get keyID
   * @return keyID
  **/
  @Schema(description = "")
  public String getKeyID() {
    return keyID;
  }

  public void setKeyID(String keyID) {
    this.keyID = keyID;
  }

  public VerifyMacRequest keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

   /**
   * Get keyName
   * @return keyName
  **/
 @Size(min=2,max=31)  @Schema(description = "")
  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public VerifyMacRequest keyringName(String keyringName) {
    this.keyringName = keyringName;
    return this;
  }

   /**
   * Get keyringName
   * @return keyringName
  **/
 @Size(min=2,max=31)  @Schema(description = "")
  public String getKeyringName() {
    return keyringName;
  }

  public void setKeyringName(String keyringName) {
    this.keyringName = keyringName;
  }

  public VerifyMacRequest mac(String mac) {
    this.mac = mac;
    return this;
  }

   /**
   * Get mac
   * @return mac
  **/
  @NotNull
 @Size(min=1,max=6144)  @Schema(required = true, description = "")
  public String getMac() {
    return mac;
  }

  public void setMac(String mac) {
    this.mac = mac;
  }

  public VerifyMacRequest macAlgorithm(String macAlgorithm) {
    this.macAlgorithm = macAlgorithm;
    return this;
  }

   /**
   * Get macAlgorithm
   * @return macAlgorithm
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getMacAlgorithm() {
    return macAlgorithm;
  }

  public void setMacAlgorithm(String macAlgorithm) {
    this.macAlgorithm = macAlgorithm;
  }

  public VerifyMacRequest message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @NotNull
 @Size(min=1,max=4096)  @Schema(required = true, description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyMacRequest verifyMacRequest = (VerifyMacRequest) o;
    return Objects.equals(this.keyID, verifyMacRequest.keyID) &&
        Objects.equals(this.keyName, verifyMacRequest.keyName) &&
        Objects.equals(this.keyringName, verifyMacRequest.keyringName) &&
        Objects.equals(this.mac, verifyMacRequest.mac) &&
        Objects.equals(this.macAlgorithm, verifyMacRequest.macAlgorithm) &&
        Objects.equals(this.message, verifyMacRequest.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyID, keyName, keyringName, mac, macAlgorithm, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyMacRequest {\n");
    
    sb.append("    keyID: ").append(toIndentedString(keyID)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    keyringName: ").append(toIndentedString(keyringName)).append("\n");
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
    sb.append("    macAlgorithm: ").append(toIndentedString(macAlgorithm)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
