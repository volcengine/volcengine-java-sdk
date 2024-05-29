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
 * CertificateForAddCdnDomainInput
 */



public class CertificateForAddCdnDomainInput {
  @SerializedName("Certificate")
  private String certificate = null;

  @SerializedName("EncryptionCert")
  private String encryptionCert = null;

  @SerializedName("EncryptionKey")
  private String encryptionKey = null;

  @SerializedName("PrivateKey")
  private String privateKey = null;

  public CertificateForAddCdnDomainInput certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  @Schema(description = "")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public CertificateForAddCdnDomainInput encryptionCert(String encryptionCert) {
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

  public CertificateForAddCdnDomainInput encryptionKey(String encryptionKey) {
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

  public CertificateForAddCdnDomainInput privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Get privateKey
   * @return privateKey
  **/
  @Schema(description = "")
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateForAddCdnDomainInput certificateForAddCdnDomainInput = (CertificateForAddCdnDomainInput) o;
    return Objects.equals(this.certificate, certificateForAddCdnDomainInput.certificate) &&
        Objects.equals(this.encryptionCert, certificateForAddCdnDomainInput.encryptionCert) &&
        Objects.equals(this.encryptionKey, certificateForAddCdnDomainInput.encryptionKey) &&
        Objects.equals(this.privateKey, certificateForAddCdnDomainInput.privateKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, encryptionCert, encryptionKey, privateKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateForAddCdnDomainInput {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    encryptionCert: ").append(toIndentedString(encryptionCert)).append("\n");
    sb.append("    encryptionKey: ").append(toIndentedString(encryptionKey)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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
