/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

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
 * UploadCACertificateRequest
 */


public class UploadCACertificateRequest {
  @SerializedName("CACertificate")
  private String caCertificate = null;

  @SerializedName("CACertificateName")
  private String caCertificateName = null;

  @SerializedName("Description")
  private String description = null;

  public UploadCACertificateRequest caCertificate(String caCertificate) {
    this.caCertificate = caCertificate;
    return this;
  }

   /**
   * Get caCertificate
   * @return caCertificate
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCaCertificate() {
    return caCertificate;
  }

  public void setCaCertificate(String caCertificate) {
    this.caCertificate = caCertificate;
  }

  public UploadCACertificateRequest caCertificateName(String caCertificateName) {
    this.caCertificateName = caCertificateName;
    return this;
  }

   /**
   * Get caCertificateName
   * @return caCertificateName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getCaCertificateName() {
    return caCertificateName;
  }

  public void setCaCertificateName(String caCertificateName) {
    this.caCertificateName = caCertificateName;
  }

  public UploadCACertificateRequest description(String description) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadCACertificateRequest uploadCACertificateRequest = (UploadCACertificateRequest) o;
    return Objects.equals(this.caCertificate, uploadCACertificateRequest.caCertificate) &&
        Objects.equals(this.caCertificateName, uploadCACertificateRequest.caCertificateName) &&
        Objects.equals(this.description, uploadCACertificateRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caCertificate, caCertificateName, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadCACertificateRequest {\n");
    
    sb.append("    caCertificate: ").append(toIndentedString(caCertificate)).append("\n");
    sb.append("    caCertificateName: ").append(toIndentedString(caCertificateName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
