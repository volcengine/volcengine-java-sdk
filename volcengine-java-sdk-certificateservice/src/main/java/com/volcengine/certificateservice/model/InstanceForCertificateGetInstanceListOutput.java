/*
 * certificate_service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.certificateservice.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.certificateservice.model.TagForCertificateGetInstanceListOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * InstanceForCertificateGetInstanceListOutput
 */



public class InstanceForCertificateGetInstanceListOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("CertificateDomainType")
  private String certificateDomainType = null;

  @SerializedName("CertificateKeyAlgorithm")
  private String certificateKeyAlgorithm = null;

  @SerializedName("CommonName")
  private String commonName = null;

  @SerializedName("CreatedTime")
  private String createdTime = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceLevel")
  private String instanceLevel = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("IsCertificateRevoked")
  private Boolean isCertificateRevoked = null;

  @SerializedName("IsCertificateSm")
  private Boolean isCertificateSm = null;

  @SerializedName("Issuer")
  private String issuer = null;

  @SerializedName("NotAfter")
  private String notAfter = null;

  @SerializedName("NotBefore")
  private String notBefore = null;

  @SerializedName("OrderBrand")
  private String orderBrand = null;

  @SerializedName("OrderPeriod")
  private Integer orderPeriod = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("San")
  private List<String> san = null;

  @SerializedName("SourceId")
  private String sourceId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tag")
  private String tag = null;

  @SerializedName("Tags")
  private List<TagForCertificateGetInstanceListOutput> tags = null;

  public InstanceForCertificateGetInstanceListOutput accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public InstanceForCertificateGetInstanceListOutput certificateDomainType(String certificateDomainType) {
    this.certificateDomainType = certificateDomainType;
    return this;
  }

   /**
   * Get certificateDomainType
   * @return certificateDomainType
  **/
  @Schema(description = "")
  public String getCertificateDomainType() {
    return certificateDomainType;
  }

  public void setCertificateDomainType(String certificateDomainType) {
    this.certificateDomainType = certificateDomainType;
  }

  public InstanceForCertificateGetInstanceListOutput certificateKeyAlgorithm(String certificateKeyAlgorithm) {
    this.certificateKeyAlgorithm = certificateKeyAlgorithm;
    return this;
  }

   /**
   * Get certificateKeyAlgorithm
   * @return certificateKeyAlgorithm
  **/
  @Schema(description = "")
  public String getCertificateKeyAlgorithm() {
    return certificateKeyAlgorithm;
  }

  public void setCertificateKeyAlgorithm(String certificateKeyAlgorithm) {
    this.certificateKeyAlgorithm = certificateKeyAlgorithm;
  }

  public InstanceForCertificateGetInstanceListOutput commonName(String commonName) {
    this.commonName = commonName;
    return this;
  }

   /**
   * Get commonName
   * @return commonName
  **/
  @Schema(description = "")
  public String getCommonName() {
    return commonName;
  }

  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }

  public InstanceForCertificateGetInstanceListOutput createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @Schema(description = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public InstanceForCertificateGetInstanceListOutput instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public InstanceForCertificateGetInstanceListOutput instanceLevel(String instanceLevel) {
    this.instanceLevel = instanceLevel;
    return this;
  }

   /**
   * Get instanceLevel
   * @return instanceLevel
  **/
  @Schema(description = "")
  public String getInstanceLevel() {
    return instanceLevel;
  }

  public void setInstanceLevel(String instanceLevel) {
    this.instanceLevel = instanceLevel;
  }

  public InstanceForCertificateGetInstanceListOutput instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public InstanceForCertificateGetInstanceListOutput isCertificateRevoked(Boolean isCertificateRevoked) {
    this.isCertificateRevoked = isCertificateRevoked;
    return this;
  }

   /**
   * Get isCertificateRevoked
   * @return isCertificateRevoked
  **/
  @Schema(description = "")
  public Boolean isIsCertificateRevoked() {
    return isCertificateRevoked;
  }

  public void setIsCertificateRevoked(Boolean isCertificateRevoked) {
    this.isCertificateRevoked = isCertificateRevoked;
  }

  public InstanceForCertificateGetInstanceListOutput isCertificateSm(Boolean isCertificateSm) {
    this.isCertificateSm = isCertificateSm;
    return this;
  }

   /**
   * Get isCertificateSm
   * @return isCertificateSm
  **/
  @Schema(description = "")
  public Boolean isIsCertificateSm() {
    return isCertificateSm;
  }

  public void setIsCertificateSm(Boolean isCertificateSm) {
    this.isCertificateSm = isCertificateSm;
  }

  public InstanceForCertificateGetInstanceListOutput issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @Schema(description = "")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public InstanceForCertificateGetInstanceListOutput notAfter(String notAfter) {
    this.notAfter = notAfter;
    return this;
  }

   /**
   * Get notAfter
   * @return notAfter
  **/
  @Schema(description = "")
  public String getNotAfter() {
    return notAfter;
  }

  public void setNotAfter(String notAfter) {
    this.notAfter = notAfter;
  }

  public InstanceForCertificateGetInstanceListOutput notBefore(String notBefore) {
    this.notBefore = notBefore;
    return this;
  }

   /**
   * Get notBefore
   * @return notBefore
  **/
  @Schema(description = "")
  public String getNotBefore() {
    return notBefore;
  }

  public void setNotBefore(String notBefore) {
    this.notBefore = notBefore;
  }

  public InstanceForCertificateGetInstanceListOutput orderBrand(String orderBrand) {
    this.orderBrand = orderBrand;
    return this;
  }

   /**
   * Get orderBrand
   * @return orderBrand
  **/
  @Schema(description = "")
  public String getOrderBrand() {
    return orderBrand;
  }

  public void setOrderBrand(String orderBrand) {
    this.orderBrand = orderBrand;
  }

  public InstanceForCertificateGetInstanceListOutput orderPeriod(Integer orderPeriod) {
    this.orderPeriod = orderPeriod;
    return this;
  }

   /**
   * Get orderPeriod
   * @return orderPeriod
  **/
  @Schema(description = "")
  public Integer getOrderPeriod() {
    return orderPeriod;
  }

  public void setOrderPeriod(Integer orderPeriod) {
    this.orderPeriod = orderPeriod;
  }

  public InstanceForCertificateGetInstanceListOutput projectName(String projectName) {
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

  public InstanceForCertificateGetInstanceListOutput san(List<String> san) {
    this.san = san;
    return this;
  }

  public InstanceForCertificateGetInstanceListOutput addSanItem(String sanItem) {
    if (this.san == null) {
      this.san = new ArrayList<String>();
    }
    this.san.add(sanItem);
    return this;
  }

   /**
   * Get san
   * @return san
  **/
  @Schema(description = "")
  public List<String> getSan() {
    return san;
  }

  public void setSan(List<String> san) {
    this.san = san;
  }

  public InstanceForCertificateGetInstanceListOutput sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @Schema(description = "")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public InstanceForCertificateGetInstanceListOutput status(String status) {
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

  public InstanceForCertificateGetInstanceListOutput tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @Schema(description = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public InstanceForCertificateGetInstanceListOutput tags(List<TagForCertificateGetInstanceListOutput> tags) {
    this.tags = tags;
    return this;
  }

  public InstanceForCertificateGetInstanceListOutput addTagsItem(TagForCertificateGetInstanceListOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCertificateGetInstanceListOutput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForCertificateGetInstanceListOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCertificateGetInstanceListOutput> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceForCertificateGetInstanceListOutput instanceForCertificateGetInstanceListOutput = (InstanceForCertificateGetInstanceListOutput) o;
    return Objects.equals(this.accountId, instanceForCertificateGetInstanceListOutput.accountId) &&
        Objects.equals(this.certificateDomainType, instanceForCertificateGetInstanceListOutput.certificateDomainType) &&
        Objects.equals(this.certificateKeyAlgorithm, instanceForCertificateGetInstanceListOutput.certificateKeyAlgorithm) &&
        Objects.equals(this.commonName, instanceForCertificateGetInstanceListOutput.commonName) &&
        Objects.equals(this.createdTime, instanceForCertificateGetInstanceListOutput.createdTime) &&
        Objects.equals(this.instanceId, instanceForCertificateGetInstanceListOutput.instanceId) &&
        Objects.equals(this.instanceLevel, instanceForCertificateGetInstanceListOutput.instanceLevel) &&
        Objects.equals(this.instanceType, instanceForCertificateGetInstanceListOutput.instanceType) &&
        Objects.equals(this.isCertificateRevoked, instanceForCertificateGetInstanceListOutput.isCertificateRevoked) &&
        Objects.equals(this.isCertificateSm, instanceForCertificateGetInstanceListOutput.isCertificateSm) &&
        Objects.equals(this.issuer, instanceForCertificateGetInstanceListOutput.issuer) &&
        Objects.equals(this.notAfter, instanceForCertificateGetInstanceListOutput.notAfter) &&
        Objects.equals(this.notBefore, instanceForCertificateGetInstanceListOutput.notBefore) &&
        Objects.equals(this.orderBrand, instanceForCertificateGetInstanceListOutput.orderBrand) &&
        Objects.equals(this.orderPeriod, instanceForCertificateGetInstanceListOutput.orderPeriod) &&
        Objects.equals(this.projectName, instanceForCertificateGetInstanceListOutput.projectName) &&
        Objects.equals(this.san, instanceForCertificateGetInstanceListOutput.san) &&
        Objects.equals(this.sourceId, instanceForCertificateGetInstanceListOutput.sourceId) &&
        Objects.equals(this.status, instanceForCertificateGetInstanceListOutput.status) &&
        Objects.equals(this.tag, instanceForCertificateGetInstanceListOutput.tag) &&
        Objects.equals(this.tags, instanceForCertificateGetInstanceListOutput.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, certificateDomainType, certificateKeyAlgorithm, commonName, createdTime, instanceId, instanceLevel, instanceType, isCertificateRevoked, isCertificateSm, issuer, notAfter, notBefore, orderBrand, orderPeriod, projectName, san, sourceId, status, tag, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceForCertificateGetInstanceListOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    certificateDomainType: ").append(toIndentedString(certificateDomainType)).append("\n");
    sb.append("    certificateKeyAlgorithm: ").append(toIndentedString(certificateKeyAlgorithm)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceLevel: ").append(toIndentedString(instanceLevel)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    isCertificateRevoked: ").append(toIndentedString(isCertificateRevoked)).append("\n");
    sb.append("    isCertificateSm: ").append(toIndentedString(isCertificateSm)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    orderBrand: ").append(toIndentedString(orderBrand)).append("\n");
    sb.append("    orderPeriod: ").append(toIndentedString(orderPeriod)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    san: ").append(toIndentedString(san)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
