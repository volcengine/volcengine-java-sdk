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
 * AsymmetricEncryptResponse
 */



public class AsymmetricEncryptResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CiphertextBlob")
  private String ciphertextBlob = null;

  @SerializedName("KeyID")
  private String keyID = null;

  public AsymmetricEncryptResponse ciphertextBlob(String ciphertextBlob) {
    this.ciphertextBlob = ciphertextBlob;
    return this;
  }

   /**
   * Get ciphertextBlob
   * @return ciphertextBlob
  **/
  @Schema(description = "")
  public String getCiphertextBlob() {
    return ciphertextBlob;
  }

  public void setCiphertextBlob(String ciphertextBlob) {
    this.ciphertextBlob = ciphertextBlob;
  }

  public AsymmetricEncryptResponse keyID(String keyID) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsymmetricEncryptResponse asymmetricEncryptResponse = (AsymmetricEncryptResponse) o;
    return Objects.equals(this.ciphertextBlob, asymmetricEncryptResponse.ciphertextBlob) &&
        Objects.equals(this.keyID, asymmetricEncryptResponse.keyID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ciphertextBlob, keyID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsymmetricEncryptResponse {\n");
    
    sb.append("    ciphertextBlob: ").append(toIndentedString(ciphertextBlob)).append("\n");
    sb.append("    keyID: ").append(toIndentedString(keyID)).append("\n");
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