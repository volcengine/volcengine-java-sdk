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
 * CreateSAMLProviderRequest
 */


public class CreateSAMLProviderRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("EncodedSAMLMetadataDocument")
  private String encodedSAMLMetadataDocument = null;

  @SerializedName("SAMLProviderName")
  private String saMLProviderName = null;

  @SerializedName("SSOType")
  private Integer ssOType = null;

  @SerializedName("Status")
  private Integer status = null;

  public CreateSAMLProviderRequest description(String description) {
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

  public CreateSAMLProviderRequest encodedSAMLMetadataDocument(String encodedSAMLMetadataDocument) {
    this.encodedSAMLMetadataDocument = encodedSAMLMetadataDocument;
    return this;
  }

   /**
   * Get encodedSAMLMetadataDocument
   * @return encodedSAMLMetadataDocument
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getEncodedSAMLMetadataDocument() {
    return encodedSAMLMetadataDocument;
  }

  public void setEncodedSAMLMetadataDocument(String encodedSAMLMetadataDocument) {
    this.encodedSAMLMetadataDocument = encodedSAMLMetadataDocument;
  }

  public CreateSAMLProviderRequest saMLProviderName(String saMLProviderName) {
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

  public CreateSAMLProviderRequest ssOType(Integer ssOType) {
    this.ssOType = ssOType;
    return this;
  }

   /**
   * Get ssOType
   * @return ssOType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getSsOType() {
    return ssOType;
  }

  public void setSsOType(Integer ssOType) {
    this.ssOType = ssOType;
  }

  public CreateSAMLProviderRequest status(Integer status) {
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
    CreateSAMLProviderRequest createSAMLProviderRequest = (CreateSAMLProviderRequest) o;
    return Objects.equals(this.description, createSAMLProviderRequest.description) &&
        Objects.equals(this.encodedSAMLMetadataDocument, createSAMLProviderRequest.encodedSAMLMetadataDocument) &&
        Objects.equals(this.saMLProviderName, createSAMLProviderRequest.saMLProviderName) &&
        Objects.equals(this.ssOType, createSAMLProviderRequest.ssOType) &&
        Objects.equals(this.status, createSAMLProviderRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, encodedSAMLMetadataDocument, saMLProviderName, ssOType, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSAMLProviderRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    encodedSAMLMetadataDocument: ").append(toIndentedString(encodedSAMLMetadataDocument)).append("\n");
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
