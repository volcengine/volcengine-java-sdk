/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

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
 * ImportKeyPairRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-01T17:18:25.441969+08:00[Asia/Shanghai]")
public class ImportKeyPairRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("KeyPairName")
  private String keyPairName = null;

  @SerializedName("PublicKey")
  private String publicKey = null;

  public ImportKeyPairRequest description(String description) {
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

  public ImportKeyPairRequest keyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
    return this;
  }

   /**
   * Get keyPairName
   * @return keyPairName
  **/
  @Schema(description = "")
  public String getKeyPairName() {
    return keyPairName;
  }

  public void setKeyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
  }

  public ImportKeyPairRequest publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Get publicKey
   * @return publicKey
  **/
  @Schema(description = "")
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportKeyPairRequest importKeyPairRequest = (ImportKeyPairRequest) o;
    return Objects.equals(this.description, importKeyPairRequest.description) &&
        Objects.equals(this.keyPairName, importKeyPairRequest.keyPairName) &&
        Objects.equals(this.publicKey, importKeyPairRequest.publicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, keyPairName, publicKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportKeyPairRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keyPairName: ").append(toIndentedString(keyPairName)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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
