/*
 * bio
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.bio.model;

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
 * UpdateAPIAccessKeyRequest
 */



public class UpdateAPIAccessKeyRequest {
  @SerializedName("AccessKeyID")
  private String accessKeyID = null;

  @SerializedName("ClusterID")
  private String clusterID = null;

  @SerializedName("SecretAccessKey")
  private String secretAccessKey = null;

  public UpdateAPIAccessKeyRequest accessKeyID(String accessKeyID) {
    this.accessKeyID = accessKeyID;
    return this;
  }

   /**
   * Get accessKeyID
   * @return accessKeyID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAccessKeyID() {
    return accessKeyID;
  }

  public void setAccessKeyID(String accessKeyID) {
    this.accessKeyID = accessKeyID;
  }

  public UpdateAPIAccessKeyRequest clusterID(String clusterID) {
    this.clusterID = clusterID;
    return this;
  }

   /**
   * Get clusterID
   * @return clusterID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getClusterID() {
    return clusterID;
  }

  public void setClusterID(String clusterID) {
    this.clusterID = clusterID;
  }

  public UpdateAPIAccessKeyRequest secretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

   /**
   * Get secretAccessKey
   * @return secretAccessKey
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  public void setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAPIAccessKeyRequest updateAPIAccessKeyRequest = (UpdateAPIAccessKeyRequest) o;
    return Objects.equals(this.accessKeyID, updateAPIAccessKeyRequest.accessKeyID) &&
        Objects.equals(this.clusterID, updateAPIAccessKeyRequest.clusterID) &&
        Objects.equals(this.secretAccessKey, updateAPIAccessKeyRequest.secretAccessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyID, clusterID, secretAccessKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAPIAccessKeyRequest {\n");
    
    sb.append("    accessKeyID: ").append(toIndentedString(accessKeyID)).append("\n");
    sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
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
