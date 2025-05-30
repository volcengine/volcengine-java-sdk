/*
 * seccenter20240508
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.seccenter20240508.model;

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
 * GetTLSInfoResponse
 */



public class GetTLSInfoResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Authorized")
  private Boolean authorized = null;

  @SerializedName("Open")
  private Boolean open = null;

  @SerializedName("ProjectId")
  private String projectId = null;

  @SerializedName("QuotaTotal")
  private Integer quotaTotal = null;

  @SerializedName("QuotaUsed")
  private Integer quotaUsed = null;

  @SerializedName("StorageDays")
  private Integer storageDays = null;

  @SerializedName("Threshold")
  private Integer threshold = null;

  @SerializedName("TopicId")
  private String topicId = null;

  @SerializedName("VulnTopicId")
  private String vulnTopicId = null;

  public GetTLSInfoResponse authorized(Boolean authorized) {
    this.authorized = authorized;
    return this;
  }

   /**
   * Get authorized
   * @return authorized
  **/
  @Schema(description = "")
  public Boolean isAuthorized() {
    return authorized;
  }

  public void setAuthorized(Boolean authorized) {
    this.authorized = authorized;
  }

  public GetTLSInfoResponse open(Boolean open) {
    this.open = open;
    return this;
  }

   /**
   * Get open
   * @return open
  **/
  @Schema(description = "")
  public Boolean isOpen() {
    return open;
  }

  public void setOpen(Boolean open) {
    this.open = open;
  }

  public GetTLSInfoResponse projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @Schema(description = "")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public GetTLSInfoResponse quotaTotal(Integer quotaTotal) {
    this.quotaTotal = quotaTotal;
    return this;
  }

   /**
   * Get quotaTotal
   * @return quotaTotal
  **/
  @Schema(description = "")
  public Integer getQuotaTotal() {
    return quotaTotal;
  }

  public void setQuotaTotal(Integer quotaTotal) {
    this.quotaTotal = quotaTotal;
  }

  public GetTLSInfoResponse quotaUsed(Integer quotaUsed) {
    this.quotaUsed = quotaUsed;
    return this;
  }

   /**
   * Get quotaUsed
   * @return quotaUsed
  **/
  @Schema(description = "")
  public Integer getQuotaUsed() {
    return quotaUsed;
  }

  public void setQuotaUsed(Integer quotaUsed) {
    this.quotaUsed = quotaUsed;
  }

  public GetTLSInfoResponse storageDays(Integer storageDays) {
    this.storageDays = storageDays;
    return this;
  }

   /**
   * Get storageDays
   * @return storageDays
  **/
  @Schema(description = "")
  public Integer getStorageDays() {
    return storageDays;
  }

  public void setStorageDays(Integer storageDays) {
    this.storageDays = storageDays;
  }

  public GetTLSInfoResponse threshold(Integer threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @Schema(description = "")
  public Integer getThreshold() {
    return threshold;
  }

  public void setThreshold(Integer threshold) {
    this.threshold = threshold;
  }

  public GetTLSInfoResponse topicId(String topicId) {
    this.topicId = topicId;
    return this;
  }

   /**
   * Get topicId
   * @return topicId
  **/
  @Schema(description = "")
  public String getTopicId() {
    return topicId;
  }

  public void setTopicId(String topicId) {
    this.topicId = topicId;
  }

  public GetTLSInfoResponse vulnTopicId(String vulnTopicId) {
    this.vulnTopicId = vulnTopicId;
    return this;
  }

   /**
   * Get vulnTopicId
   * @return vulnTopicId
  **/
  @Schema(description = "")
  public String getVulnTopicId() {
    return vulnTopicId;
  }

  public void setVulnTopicId(String vulnTopicId) {
    this.vulnTopicId = vulnTopicId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTLSInfoResponse getTLSInfoResponse = (GetTLSInfoResponse) o;
    return Objects.equals(this.authorized, getTLSInfoResponse.authorized) &&
        Objects.equals(this.open, getTLSInfoResponse.open) &&
        Objects.equals(this.projectId, getTLSInfoResponse.projectId) &&
        Objects.equals(this.quotaTotal, getTLSInfoResponse.quotaTotal) &&
        Objects.equals(this.quotaUsed, getTLSInfoResponse.quotaUsed) &&
        Objects.equals(this.storageDays, getTLSInfoResponse.storageDays) &&
        Objects.equals(this.threshold, getTLSInfoResponse.threshold) &&
        Objects.equals(this.topicId, getTLSInfoResponse.topicId) &&
        Objects.equals(this.vulnTopicId, getTLSInfoResponse.vulnTopicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorized, open, projectId, quotaTotal, quotaUsed, storageDays, threshold, topicId, vulnTopicId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTLSInfoResponse {\n");
    
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    quotaTotal: ").append(toIndentedString(quotaTotal)).append("\n");
    sb.append("    quotaUsed: ").append(toIndentedString(quotaUsed)).append("\n");
    sb.append("    storageDays: ").append(toIndentedString(storageDays)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
    sb.append("    vulnTopicId: ").append(toIndentedString(vulnTopicId)).append("\n");
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
