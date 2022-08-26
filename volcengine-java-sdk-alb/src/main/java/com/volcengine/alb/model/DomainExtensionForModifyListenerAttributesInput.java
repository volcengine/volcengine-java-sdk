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
 * DomainExtensionForModifyListenerAttributesInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-26T18:47:55.368678+08:00[Asia/Shanghai]")
public class DomainExtensionForModifyListenerAttributesInput {
  @SerializedName("Action")
  private String action = null;

  @SerializedName("CertificateId")
  private String certificateId = null;

  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("DomainExtensionId")
  private String domainExtensionId = null;

  public DomainExtensionForModifyListenerAttributesInput action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public DomainExtensionForModifyListenerAttributesInput certificateId(String certificateId) {
    this.certificateId = certificateId;
    return this;
  }

   /**
   * Get certificateId
   * @return certificateId
  **/
  @Schema(description = "")
  public String getCertificateId() {
    return certificateId;
  }

  public void setCertificateId(String certificateId) {
    this.certificateId = certificateId;
  }

  public DomainExtensionForModifyListenerAttributesInput domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @Schema(description = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public DomainExtensionForModifyListenerAttributesInput domainExtensionId(String domainExtensionId) {
    this.domainExtensionId = domainExtensionId;
    return this;
  }

   /**
   * Get domainExtensionId
   * @return domainExtensionId
  **/
  @Schema(description = "")
  public String getDomainExtensionId() {
    return domainExtensionId;
  }

  public void setDomainExtensionId(String domainExtensionId) {
    this.domainExtensionId = domainExtensionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainExtensionForModifyListenerAttributesInput domainExtensionForModifyListenerAttributesInput = (DomainExtensionForModifyListenerAttributesInput) o;
    return Objects.equals(this.action, domainExtensionForModifyListenerAttributesInput.action) &&
        Objects.equals(this.certificateId, domainExtensionForModifyListenerAttributesInput.certificateId) &&
        Objects.equals(this.domain, domainExtensionForModifyListenerAttributesInput.domain) &&
        Objects.equals(this.domainExtensionId, domainExtensionForModifyListenerAttributesInput.domainExtensionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, certificateId, domain, domainExtensionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainExtensionForModifyListenerAttributesInput {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    domainExtensionId: ").append(toIndentedString(domainExtensionId)).append("\n");
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
