/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

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
 * AddCertificateRequest
 */



public class AddCertificateRequest {
  @SerializedName("CertType")
  private String certType = null;

  @SerializedName("Certificate")
  private String certificate = null;

  @SerializedName("Desc")
  private String desc = null;

  @SerializedName("EncryType")
  private String encryType = null;

  @SerializedName("EncryptionCert")
  private String encryptionCert = null;

  @SerializedName("EncryptionKey")
  private String encryptionKey = null;

  @SerializedName("PrivateKey")
  private String privateKey = null;

  @SerializedName("Repeatable")
  private Boolean repeatable = null;

  @SerializedName("Source")
  private String source = null;

  public AddCertificateRequest certType(String certType) {
    this.certType = certType;
    return this;
  }

   /**
   * Get certType
   * @return certType
  **/
  @Schema(description = "")
  public String getCertType() {
    return certType;
  }

  public void setCertType(String certType) {
    this.certType = certType;
  }

  public AddCertificateRequest certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public AddCertificateRequest desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @Schema(description = "")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public AddCertificateRequest encryType(String encryType) {
    this.encryType = encryType;
    return this;
  }

   /**
   * Get encryType
   * @return encryType
  **/
  @Schema(description = "")
  public String getEncryType() {
    return encryType;
  }

  public void setEncryType(String encryType) {
    this.encryType = encryType;
  }

  public AddCertificateRequest encryptionCert(String encryptionCert) {
    this.encryptionCert = encryptionCert;
    return this;
  }

   /**
   * Get encryptionCert
   * @return encryptionCert
  **/
  @Schema(description = "")
  public String getEncryptionCert() {
    return encryptionCert;
  }

  public void setEncryptionCert(String encryptionCert) {
    this.encryptionCert = encryptionCert;
  }

  public AddCertificateRequest encryptionKey(String encryptionKey) {
    this.encryptionKey = encryptionKey;
    return this;
  }

   /**
   * Get encryptionKey
   * @return encryptionKey
  **/
  @Schema(description = "")
  public String getEncryptionKey() {
    return encryptionKey;
  }

  public void setEncryptionKey(String encryptionKey) {
    this.encryptionKey = encryptionKey;
  }

  public AddCertificateRequest privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Get privateKey
   * @return privateKey
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  public AddCertificateRequest repeatable(Boolean repeatable) {
    this.repeatable = repeatable;
    return this;
  }

   /**
   * Get repeatable
   * @return repeatable
  **/
  @Schema(description = "")
  public Boolean isRepeatable() {
    return repeatable;
  }

  public void setRepeatable(Boolean repeatable) {
    this.repeatable = repeatable;
  }

  public AddCertificateRequest source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddCertificateRequest addCertificateRequest = (AddCertificateRequest) o;
    return Objects.equals(this.certType, addCertificateRequest.certType) &&
        Objects.equals(this.certificate, addCertificateRequest.certificate) &&
        Objects.equals(this.desc, addCertificateRequest.desc) &&
        Objects.equals(this.encryType, addCertificateRequest.encryType) &&
        Objects.equals(this.encryptionCert, addCertificateRequest.encryptionCert) &&
        Objects.equals(this.encryptionKey, addCertificateRequest.encryptionKey) &&
        Objects.equals(this.privateKey, addCertificateRequest.privateKey) &&
        Objects.equals(this.repeatable, addCertificateRequest.repeatable) &&
        Objects.equals(this.source, addCertificateRequest.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certType, certificate, desc, encryType, encryptionCert, encryptionKey, privateKey, repeatable, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCertificateRequest {\n");
    
    sb.append("    certType: ").append(toIndentedString(certType)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    encryType: ").append(toIndentedString(encryType)).append("\n");
    sb.append("    encryptionCert: ").append(toIndentedString(encryptionCert)).append("\n");
    sb.append("    encryptionKey: ").append(toIndentedString(encryptionKey)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    repeatable: ").append(toIndentedString(repeatable)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
