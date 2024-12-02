/*
 * vefaas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vefaas.model;

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
 * TopParamForDeleteTimerInput
 */



public class TopParamForDeleteTimerInput {
  @SerializedName("AccountId")
  private Long accountId = null;

  @SerializedName("DestService")
  private String destService = null;

  @SerializedName("IsInternal")
  private String isInternal = null;

  @SerializedName("Psm")
  private String psm = null;

  @SerializedName("RealIp")
  private String realIp = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("RoleId")
  private Long roleId = null;

  @SerializedName("Site")
  private String site = null;

  @SerializedName("SourceService")
  private String sourceService = null;

  @SerializedName("UserAgent")
  private String userAgent = null;

  @SerializedName("UserId")
  private Long userId = null;

  public TopParamForDeleteTimerInput accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public TopParamForDeleteTimerInput destService(String destService) {
    this.destService = destService;
    return this;
  }

   /**
   * Get destService
   * @return destService
  **/
  @Schema(description = "")
  public String getDestService() {
    return destService;
  }

  public void setDestService(String destService) {
    this.destService = destService;
  }

  public TopParamForDeleteTimerInput isInternal(String isInternal) {
    this.isInternal = isInternal;
    return this;
  }

   /**
   * Get isInternal
   * @return isInternal
  **/
  @Schema(description = "")
  public String getIsInternal() {
    return isInternal;
  }

  public void setIsInternal(String isInternal) {
    this.isInternal = isInternal;
  }

  public TopParamForDeleteTimerInput psm(String psm) {
    this.psm = psm;
    return this;
  }

   /**
   * Get psm
   * @return psm
  **/
  @Schema(description = "")
  public String getPsm() {
    return psm;
  }

  public void setPsm(String psm) {
    this.psm = psm;
  }

  public TopParamForDeleteTimerInput realIp(String realIp) {
    this.realIp = realIp;
    return this;
  }

   /**
   * Get realIp
   * @return realIp
  **/
  @Schema(description = "")
  public String getRealIp() {
    return realIp;
  }

  public void setRealIp(String realIp) {
    this.realIp = realIp;
  }

  public TopParamForDeleteTimerInput region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public TopParamForDeleteTimerInput requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public TopParamForDeleteTimerInput roleId(Long roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * Get roleId
   * @return roleId
  **/
  @Schema(description = "")
  public Long getRoleId() {
    return roleId;
  }

  public void setRoleId(Long roleId) {
    this.roleId = roleId;
  }

  public TopParamForDeleteTimerInput site(String site) {
    this.site = site;
    return this;
  }

   /**
   * Get site
   * @return site
  **/
  @Schema(description = "")
  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public TopParamForDeleteTimerInput sourceService(String sourceService) {
    this.sourceService = sourceService;
    return this;
  }

   /**
   * Get sourceService
   * @return sourceService
  **/
  @Schema(description = "")
  public String getSourceService() {
    return sourceService;
  }

  public void setSourceService(String sourceService) {
    this.sourceService = sourceService;
  }

  public TopParamForDeleteTimerInput userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Get userAgent
   * @return userAgent
  **/
  @Schema(description = "")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public TopParamForDeleteTimerInput userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopParamForDeleteTimerInput topParamForDeleteTimerInput = (TopParamForDeleteTimerInput) o;
    return Objects.equals(this.accountId, topParamForDeleteTimerInput.accountId) &&
        Objects.equals(this.destService, topParamForDeleteTimerInput.destService) &&
        Objects.equals(this.isInternal, topParamForDeleteTimerInput.isInternal) &&
        Objects.equals(this.psm, topParamForDeleteTimerInput.psm) &&
        Objects.equals(this.realIp, topParamForDeleteTimerInput.realIp) &&
        Objects.equals(this.region, topParamForDeleteTimerInput.region) &&
        Objects.equals(this.requestId, topParamForDeleteTimerInput.requestId) &&
        Objects.equals(this.roleId, topParamForDeleteTimerInput.roleId) &&
        Objects.equals(this.site, topParamForDeleteTimerInput.site) &&
        Objects.equals(this.sourceService, topParamForDeleteTimerInput.sourceService) &&
        Objects.equals(this.userAgent, topParamForDeleteTimerInput.userAgent) &&
        Objects.equals(this.userId, topParamForDeleteTimerInput.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, destService, isInternal, psm, realIp, region, requestId, roleId, site, sourceService, userAgent, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopParamForDeleteTimerInput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    destService: ").append(toIndentedString(destService)).append("\n");
    sb.append("    isInternal: ").append(toIndentedString(isInternal)).append("\n");
    sb.append("    psm: ").append(toIndentedString(psm)).append("\n");
    sb.append("    realIp: ").append(toIndentedString(realIp)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    sourceService: ").append(toIndentedString(sourceService)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
