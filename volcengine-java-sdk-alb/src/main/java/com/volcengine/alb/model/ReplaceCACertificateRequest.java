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
 * ReplaceCACertificateRequest
 */



public class ReplaceCACertificateRequest {
  @SerializedName("CACertificate")
  private String caCertificate = null;

  @SerializedName("CACertificateId")
  private String caCertificateId = null;

  @SerializedName("CACertificateName")
  private String caCertificateName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("OldCACertificateId")
  private String oldCACertificateId = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("UpdateMode")
  private String updateMode = null;

  public ReplaceCACertificateRequest caCertificate(String caCertificate) {
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

  public ReplaceCACertificateRequest caCertificateId(String caCertificateId) {
    this.caCertificateId = caCertificateId;
    return this;
  }

   /**
   * Get caCertificateId
   * @return caCertificateId
  **/
  @Schema(description = "")
  public String getCaCertificateId() {
    return caCertificateId;
  }

  public void setCaCertificateId(String caCertificateId) {
    this.caCertificateId = caCertificateId;
  }

  public ReplaceCACertificateRequest caCertificateName(String caCertificateName) {
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

  public ReplaceCACertificateRequest description(String description) {
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

  public ReplaceCACertificateRequest oldCACertificateId(String oldCACertificateId) {
    this.oldCACertificateId = oldCACertificateId;
    return this;
  }

   /**
   * Get oldCACertificateId
   * @return oldCACertificateId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getOldCACertificateId() {
    return oldCACertificateId;
  }

  public void setOldCACertificateId(String oldCACertificateId) {
    this.oldCACertificateId = oldCACertificateId;
  }

  public ReplaceCACertificateRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public ReplaceCACertificateRequest updateMode(String updateMode) {
    this.updateMode = updateMode;
    return this;
  }

   /**
   * Get updateMode
   * @return updateMode
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getUpdateMode() {
    return updateMode;
  }

  public void setUpdateMode(String updateMode) {
    this.updateMode = updateMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceCACertificateRequest replaceCACertificateRequest = (ReplaceCACertificateRequest) o;
    return Objects.equals(this.caCertificate, replaceCACertificateRequest.caCertificate) &&
        Objects.equals(this.caCertificateId, replaceCACertificateRequest.caCertificateId) &&
        Objects.equals(this.caCertificateName, replaceCACertificateRequest.caCertificateName) &&
        Objects.equals(this.description, replaceCACertificateRequest.description) &&
        Objects.equals(this.oldCACertificateId, replaceCACertificateRequest.oldCACertificateId) &&
        Objects.equals(this.projectName, replaceCACertificateRequest.projectName) &&
        Objects.equals(this.updateMode, replaceCACertificateRequest.updateMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caCertificate, caCertificateId, caCertificateName, description, oldCACertificateId, projectName, updateMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceCACertificateRequest {\n");
    
    sb.append("    caCertificate: ").append(toIndentedString(caCertificate)).append("\n");
    sb.append("    caCertificateId: ").append(toIndentedString(caCertificateId)).append("\n");
    sb.append("    caCertificateName: ").append(toIndentedString(caCertificateName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    oldCACertificateId: ").append(toIndentedString(oldCACertificateId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    updateMode: ").append(toIndentedString(updateMode)).append("\n");
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
