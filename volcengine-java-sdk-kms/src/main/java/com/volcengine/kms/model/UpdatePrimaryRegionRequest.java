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
 * UpdatePrimaryRegionRequest
 */



public class UpdatePrimaryRegionRequest {
  @SerializedName("KeyID")
  private String keyID = null;

  @SerializedName("KeyName")
  private String keyName = null;

  @SerializedName("KeyringName")
  private String keyringName = null;

  @SerializedName("PrimaryRegion")
  private String primaryRegion = null;

  public UpdatePrimaryRegionRequest keyID(String keyID) {
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

  public UpdatePrimaryRegionRequest keyName(String keyName) {
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

  public UpdatePrimaryRegionRequest keyringName(String keyringName) {
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

  public UpdatePrimaryRegionRequest primaryRegion(String primaryRegion) {
    this.primaryRegion = primaryRegion;
    return this;
  }

   /**
   * Get primaryRegion
   * @return primaryRegion
  **/
  @NotNull
 @Size(max=64)  @Schema(required = true, description = "")
  public String getPrimaryRegion() {
    return primaryRegion;
  }

  public void setPrimaryRegion(String primaryRegion) {
    this.primaryRegion = primaryRegion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePrimaryRegionRequest updatePrimaryRegionRequest = (UpdatePrimaryRegionRequest) o;
    return Objects.equals(this.keyID, updatePrimaryRegionRequest.keyID) &&
        Objects.equals(this.keyName, updatePrimaryRegionRequest.keyName) &&
        Objects.equals(this.keyringName, updatePrimaryRegionRequest.keyringName) &&
        Objects.equals(this.primaryRegion, updatePrimaryRegionRequest.primaryRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyID, keyName, keyringName, primaryRegion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePrimaryRegionRequest {\n");
    
    sb.append("    keyID: ").append(toIndentedString(keyID)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    keyringName: ").append(toIndentedString(keyringName)).append("\n");
    sb.append("    primaryRegion: ").append(toIndentedString(primaryRegion)).append("\n");
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
