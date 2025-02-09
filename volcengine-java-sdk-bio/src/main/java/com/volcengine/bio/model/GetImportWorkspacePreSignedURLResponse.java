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
 * GetImportWorkspacePreSignedURLResponse
 */



public class GetImportWorkspacePreSignedURLResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("PreSignedURL")
  private String preSignedURL = null;

  @SerializedName("SchemaKey")
  private String schemaKey = null;

  public GetImportWorkspacePreSignedURLResponse preSignedURL(String preSignedURL) {
    this.preSignedURL = preSignedURL;
    return this;
  }

   /**
   * Get preSignedURL
   * @return preSignedURL
  **/
  @Schema(description = "")
  public String getPreSignedURL() {
    return preSignedURL;
  }

  public void setPreSignedURL(String preSignedURL) {
    this.preSignedURL = preSignedURL;
  }

  public GetImportWorkspacePreSignedURLResponse schemaKey(String schemaKey) {
    this.schemaKey = schemaKey;
    return this;
  }

   /**
   * Get schemaKey
   * @return schemaKey
  **/
  @Schema(description = "")
  public String getSchemaKey() {
    return schemaKey;
  }

  public void setSchemaKey(String schemaKey) {
    this.schemaKey = schemaKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetImportWorkspacePreSignedURLResponse getImportWorkspacePreSignedURLResponse = (GetImportWorkspacePreSignedURLResponse) o;
    return Objects.equals(this.preSignedURL, getImportWorkspacePreSignedURLResponse.preSignedURL) &&
        Objects.equals(this.schemaKey, getImportWorkspacePreSignedURLResponse.schemaKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preSignedURL, schemaKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetImportWorkspacePreSignedURLResponse {\n");
    
    sb.append("    preSignedURL: ").append(toIndentedString(preSignedURL)).append("\n");
    sb.append("    schemaKey: ").append(toIndentedString(schemaKey)).append("\n");
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
