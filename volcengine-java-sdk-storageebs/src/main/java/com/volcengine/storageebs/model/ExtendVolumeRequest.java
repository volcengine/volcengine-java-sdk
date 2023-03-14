/*
 * storage_ebs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.storageebs.model;

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
 * ExtendVolumeRequest
 */


public class ExtendVolumeRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("NewSize")
  private String newSize = null;

  @SerializedName("VolumeId")
  private String volumeId = null;

  public ExtendVolumeRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public ExtendVolumeRequest newSize(String newSize) {
    this.newSize = newSize;
    return this;
  }

   /**
   * Get newSize
   * @return newSize
  **/
  @Schema(description = "")
  public String getNewSize() {
    return newSize;
  }

  public void setNewSize(String newSize) {
    this.newSize = newSize;
  }

  public ExtendVolumeRequest volumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

   /**
   * Get volumeId
   * @return volumeId
  **/
  @Schema(description = "")
  public String getVolumeId() {
    return volumeId;
  }

  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendVolumeRequest extendVolumeRequest = (ExtendVolumeRequest) o;
    return Objects.equals(this.clientToken, extendVolumeRequest.clientToken) &&
        Objects.equals(this.newSize, extendVolumeRequest.newSize) &&
        Objects.equals(this.volumeId, extendVolumeRequest.volumeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, newSize, volumeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendVolumeRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    newSize: ").append(toIndentedString(newSize)).append("\n");
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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
