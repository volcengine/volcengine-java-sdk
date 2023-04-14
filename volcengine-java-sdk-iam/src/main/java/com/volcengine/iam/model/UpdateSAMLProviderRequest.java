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
 * UpdateSAMLProviderRequest
 */


public class UpdateSAMLProviderRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("NewEncodedSAMLMetadataDocument")
  private String newEncodedSAMLMetadataDocument = null;

  @SerializedName("SAMLProviderName")
  private String saMLProviderName = null;

  @SerializedName("SSOType")
  private Integer ssOType = null;

  @SerializedName("Status")
  private Integer status = null;

  public UpdateSAMLProviderRequest description(String description) {
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

  public UpdateSAMLProviderRequest newEncodedSAMLMetadataDocument(String newEncodedSAMLMetadataDocument) {
    this.newEncodedSAMLMetadataDocument = newEncodedSAMLMetadataDocument;
    return this;
  }

   /**
   * Get newEncodedSAMLMetadataDocument
   * @return newEncodedSAMLMetadataDocument
  **/
  @Schema(description = "")
  public String getNewEncodedSAMLMetadataDocument() {
    return newEncodedSAMLMetadataDocument;
  }

  public void setNewEncodedSAMLMetadataDocument(String newEncodedSAMLMetadataDocument) {
    this.newEncodedSAMLMetadataDocument = newEncodedSAMLMetadataDocument;
  }

  public UpdateSAMLProviderRequest saMLProviderName(String saMLProviderName) {
    this.saMLProviderName = saMLProviderName;
    return this;
  }

   /**
   * Get saMLProviderName
   * @return saMLProviderName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSaMLProviderName() {
    return saMLProviderName;
  }

  public void setSaMLProviderName(String saMLProviderName) {
    this.saMLProviderName = saMLProviderName;
  }

  public UpdateSAMLProviderRequest ssOType(Integer ssOType) {
    this.ssOType = ssOType;
    return this;
  }

   /**
   * Get ssOType
   * @return ssOType
  **/
  @Schema(description = "")
  public Integer getSsOType() {
    return ssOType;
  }

  public void setSsOType(Integer ssOType) {
    this.ssOType = ssOType;
  }

  public UpdateSAMLProviderRequest status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSAMLProviderRequest updateSAMLProviderRequest = (UpdateSAMLProviderRequest) o;
    return Objects.equals(this.description, updateSAMLProviderRequest.description) &&
        Objects.equals(this.newEncodedSAMLMetadataDocument, updateSAMLProviderRequest.newEncodedSAMLMetadataDocument) &&
        Objects.equals(this.saMLProviderName, updateSAMLProviderRequest.saMLProviderName) &&
        Objects.equals(this.ssOType, updateSAMLProviderRequest.ssOType) &&
        Objects.equals(this.status, updateSAMLProviderRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, newEncodedSAMLMetadataDocument, saMLProviderName, ssOType, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSAMLProviderRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    newEncodedSAMLMetadataDocument: ").append(toIndentedString(newEncodedSAMLMetadataDocument)).append("\n");
    sb.append("    saMLProviderName: ").append(toIndentedString(saMLProviderName)).append("\n");
    sb.append("    ssOType: ").append(toIndentedString(ssOType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
