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
import com.volcengine.cdn.model.DomainLockForDescribeCertConfigOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SpecifiedCertConfigForDescribeCertConfigOutput
 */



public class SpecifiedCertConfigForDescribeCertConfigOutput {
  @SerializedName("CerStatus")
  private String cerStatus = null;

  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("DomainLock")
  private DomainLockForDescribeCertConfigOutput domainLock = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Type")
  private String type = null;

  public SpecifiedCertConfigForDescribeCertConfigOutput cerStatus(String cerStatus) {
    this.cerStatus = cerStatus;
    return this;
  }

   /**
   * Get cerStatus
   * @return cerStatus
  **/
  @Schema(description = "")
  public String getCerStatus() {
    return cerStatus;
  }

  public void setCerStatus(String cerStatus) {
    this.cerStatus = cerStatus;
  }

  public SpecifiedCertConfigForDescribeCertConfigOutput domain(String domain) {
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

  public SpecifiedCertConfigForDescribeCertConfigOutput domainLock(DomainLockForDescribeCertConfigOutput domainLock) {
    this.domainLock = domainLock;
    return this;
  }

   /**
   * Get domainLock
   * @return domainLock
  **/
  @Valid
  @Schema(description = "")
  public DomainLockForDescribeCertConfigOutput getDomainLock() {
    return domainLock;
  }

  public void setDomainLock(DomainLockForDescribeCertConfigOutput domainLock) {
    this.domainLock = domainLock;
  }

  public SpecifiedCertConfigForDescribeCertConfigOutput status(String status) {
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

  public SpecifiedCertConfigForDescribeCertConfigOutput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecifiedCertConfigForDescribeCertConfigOutput specifiedCertConfigForDescribeCertConfigOutput = (SpecifiedCertConfigForDescribeCertConfigOutput) o;
    return Objects.equals(this.cerStatus, specifiedCertConfigForDescribeCertConfigOutput.cerStatus) &&
        Objects.equals(this.domain, specifiedCertConfigForDescribeCertConfigOutput.domain) &&
        Objects.equals(this.domainLock, specifiedCertConfigForDescribeCertConfigOutput.domainLock) &&
        Objects.equals(this.status, specifiedCertConfigForDescribeCertConfigOutput.status) &&
        Objects.equals(this.type, specifiedCertConfigForDescribeCertConfigOutput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cerStatus, domain, domainLock, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecifiedCertConfigForDescribeCertConfigOutput {\n");
    
    sb.append("    cerStatus: ").append(toIndentedString(cerStatus)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    domainLock: ").append(toIndentedString(domainLock)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
