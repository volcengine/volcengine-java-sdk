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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CACertificateForDescribeCACertificatesOutput
 */



public class CACertificateForDescribeCACertificatesOutput {
  @SerializedName("CACertificateId")
  private String caCertificateId = null;

  @SerializedName("CACertificateName")
  private String caCertificateName = null;

  @SerializedName("CertificateType")
  private String certificateType = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DomainName")
  private String domainName = null;

  @SerializedName("ExpiredAt")
  private String expiredAt = null;

  @SerializedName("Listeners")
  private List<String> listeners = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("San")
  private String san = null;

  @SerializedName("Status")
  private String status = null;

  public CACertificateForDescribeCACertificatesOutput caCertificateId(String caCertificateId) {
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

  public CACertificateForDescribeCACertificatesOutput caCertificateName(String caCertificateName) {
    this.caCertificateName = caCertificateName;
    return this;
  }

   /**
   * Get caCertificateName
   * @return caCertificateName
  **/
  @Schema(description = "")
  public String getCaCertificateName() {
    return caCertificateName;
  }

  public void setCaCertificateName(String caCertificateName) {
    this.caCertificateName = caCertificateName;
  }

  public CACertificateForDescribeCACertificatesOutput certificateType(String certificateType) {
    this.certificateType = certificateType;
    return this;
  }

   /**
   * Get certificateType
   * @return certificateType
  **/
  @Schema(description = "")
  public String getCertificateType() {
    return certificateType;
  }

  public void setCertificateType(String certificateType) {
    this.certificateType = certificateType;
  }

  public CACertificateForDescribeCACertificatesOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public CACertificateForDescribeCACertificatesOutput description(String description) {
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

  public CACertificateForDescribeCACertificatesOutput domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

   /**
   * Get domainName
   * @return domainName
  **/
  @Schema(description = "")
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public CACertificateForDescribeCACertificatesOutput expiredAt(String expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

   /**
   * Get expiredAt
   * @return expiredAt
  **/
  @Schema(description = "")
  public String getExpiredAt() {
    return expiredAt;
  }

  public void setExpiredAt(String expiredAt) {
    this.expiredAt = expiredAt;
  }

  public CACertificateForDescribeCACertificatesOutput listeners(List<String> listeners) {
    this.listeners = listeners;
    return this;
  }

  public CACertificateForDescribeCACertificatesOutput addListenersItem(String listenersItem) {
    if (this.listeners == null) {
      this.listeners = new ArrayList<String>();
    }
    this.listeners.add(listenersItem);
    return this;
  }

   /**
   * Get listeners
   * @return listeners
  **/
  @Schema(description = "")
  public List<String> getListeners() {
    return listeners;
  }

  public void setListeners(List<String> listeners) {
    this.listeners = listeners;
  }

  public CACertificateForDescribeCACertificatesOutput projectName(String projectName) {
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

  public CACertificateForDescribeCACertificatesOutput san(String san) {
    this.san = san;
    return this;
  }

   /**
   * Get san
   * @return san
  **/
  @Schema(description = "")
  public String getSan() {
    return san;
  }

  public void setSan(String san) {
    this.san = san;
  }

  public CACertificateForDescribeCACertificatesOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
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
    CACertificateForDescribeCACertificatesOutput caCertificateForDescribeCACertificatesOutput = (CACertificateForDescribeCACertificatesOutput) o;
    return Objects.equals(this.caCertificateId, caCertificateForDescribeCACertificatesOutput.caCertificateId) &&
        Objects.equals(this.caCertificateName, caCertificateForDescribeCACertificatesOutput.caCertificateName) &&
        Objects.equals(this.certificateType, caCertificateForDescribeCACertificatesOutput.certificateType) &&
        Objects.equals(this.createTime, caCertificateForDescribeCACertificatesOutput.createTime) &&
        Objects.equals(this.description, caCertificateForDescribeCACertificatesOutput.description) &&
        Objects.equals(this.domainName, caCertificateForDescribeCACertificatesOutput.domainName) &&
        Objects.equals(this.expiredAt, caCertificateForDescribeCACertificatesOutput.expiredAt) &&
        Objects.equals(this.listeners, caCertificateForDescribeCACertificatesOutput.listeners) &&
        Objects.equals(this.projectName, caCertificateForDescribeCACertificatesOutput.projectName) &&
        Objects.equals(this.san, caCertificateForDescribeCACertificatesOutput.san) &&
        Objects.equals(this.status, caCertificateForDescribeCACertificatesOutput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caCertificateId, caCertificateName, certificateType, createTime, description, domainName, expiredAt, listeners, projectName, san, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CACertificateForDescribeCACertificatesOutput {\n");
    
    sb.append("    caCertificateId: ").append(toIndentedString(caCertificateId)).append("\n");
    sb.append("    caCertificateName: ").append(toIndentedString(caCertificateName)).append("\n");
    sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
    sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    san: ").append(toIndentedString(san)).append("\n");
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
