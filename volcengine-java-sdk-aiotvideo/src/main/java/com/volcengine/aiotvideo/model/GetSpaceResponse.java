/*
 * aiotvideo
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.aiotvideo.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.aiotvideo.model.DomainsForGetSpaceOutput;
import com.volcengine.aiotvideo.model.GBForGetSpaceOutput;
import com.volcengine.aiotvideo.model.SipServerForGetSpaceOutput;
import com.volcengine.aiotvideo.model.TemplateForGetSpaceOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetSpaceResponse
 */



public class GetSpaceResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AccessType")
  private String accessType = null;

  @SerializedName("CallbackURL")
  private String callbackURL = null;

  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Domains")
  private DomainsForGetSpaceOutput domains = null;

  @SerializedName("GB")
  private GBForGetSpaceOutput GB = null;

  @SerializedName("HLSLowLatency")
  private Boolean hlSLowLatency = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("SipServer")
  private SipServerForGetSpaceOutput sipServer = null;

  @SerializedName("SpaceID")
  private String spaceID = null;

  @SerializedName("SpaceName")
  private String spaceName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Template")
  private TemplateForGetSpaceOutput template = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  public GetSpaceResponse accessType(String accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * Get accessType
   * @return accessType
  **/
  @Schema(description = "")
  public String getAccessType() {
    return accessType;
  }

  public void setAccessType(String accessType) {
    this.accessType = accessType;
  }

  public GetSpaceResponse callbackURL(String callbackURL) {
    this.callbackURL = callbackURL;
    return this;
  }

   /**
   * Get callbackURL
   * @return callbackURL
  **/
  @Schema(description = "")
  public String getCallbackURL() {
    return callbackURL;
  }

  public void setCallbackURL(String callbackURL) {
    this.callbackURL = callbackURL;
  }

  public GetSpaceResponse createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public GetSpaceResponse description(String description) {
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

  public GetSpaceResponse domains(DomainsForGetSpaceOutput domains) {
    this.domains = domains;
    return this;
  }

   /**
   * Get domains
   * @return domains
  **/
  @Valid
  @Schema(description = "")
  public DomainsForGetSpaceOutput getDomains() {
    return domains;
  }

  public void setDomains(DomainsForGetSpaceOutput domains) {
    this.domains = domains;
  }

  public GetSpaceResponse GB(GBForGetSpaceOutput GB) {
    this.GB = GB;
    return this;
  }

   /**
   * Get GB
   * @return GB
  **/
  @Valid
  @Schema(description = "")
  public GBForGetSpaceOutput getGB() {
    return GB;
  }

  public void setGB(GBForGetSpaceOutput GB) {
    this.GB = GB;
  }

  public GetSpaceResponse hlSLowLatency(Boolean hlSLowLatency) {
    this.hlSLowLatency = hlSLowLatency;
    return this;
  }

   /**
   * Get hlSLowLatency
   * @return hlSLowLatency
  **/
  @Schema(description = "")
  public Boolean isHlSLowLatency() {
    return hlSLowLatency;
  }

  public void setHlSLowLatency(Boolean hlSLowLatency) {
    this.hlSLowLatency = hlSLowLatency;
  }

  public GetSpaceResponse region(String region) {
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

  public GetSpaceResponse sipServer(SipServerForGetSpaceOutput sipServer) {
    this.sipServer = sipServer;
    return this;
  }

   /**
   * Get sipServer
   * @return sipServer
  **/
  @Valid
  @Schema(description = "")
  public SipServerForGetSpaceOutput getSipServer() {
    return sipServer;
  }

  public void setSipServer(SipServerForGetSpaceOutput sipServer) {
    this.sipServer = sipServer;
  }

  public GetSpaceResponse spaceID(String spaceID) {
    this.spaceID = spaceID;
    return this;
  }

   /**
   * Get spaceID
   * @return spaceID
  **/
  @Schema(description = "")
  public String getSpaceID() {
    return spaceID;
  }

  public void setSpaceID(String spaceID) {
    this.spaceID = spaceID;
  }

  public GetSpaceResponse spaceName(String spaceName) {
    this.spaceName = spaceName;
    return this;
  }

   /**
   * Get spaceName
   * @return spaceName
  **/
  @Schema(description = "")
  public String getSpaceName() {
    return spaceName;
  }

  public void setSpaceName(String spaceName) {
    this.spaceName = spaceName;
  }

  public GetSpaceResponse status(String status) {
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

  public GetSpaceResponse template(TemplateForGetSpaceOutput template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @Valid
  @Schema(description = "")
  public TemplateForGetSpaceOutput getTemplate() {
    return template;
  }

  public void setTemplate(TemplateForGetSpaceOutput template) {
    this.template = template;
  }

  public GetSpaceResponse updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSpaceResponse getSpaceResponse = (GetSpaceResponse) o;
    return Objects.equals(this.accessType, getSpaceResponse.accessType) &&
        Objects.equals(this.callbackURL, getSpaceResponse.callbackURL) &&
        Objects.equals(this.createdAt, getSpaceResponse.createdAt) &&
        Objects.equals(this.description, getSpaceResponse.description) &&
        Objects.equals(this.domains, getSpaceResponse.domains) &&
        Objects.equals(this.GB, getSpaceResponse.GB) &&
        Objects.equals(this.hlSLowLatency, getSpaceResponse.hlSLowLatency) &&
        Objects.equals(this.region, getSpaceResponse.region) &&
        Objects.equals(this.sipServer, getSpaceResponse.sipServer) &&
        Objects.equals(this.spaceID, getSpaceResponse.spaceID) &&
        Objects.equals(this.spaceName, getSpaceResponse.spaceName) &&
        Objects.equals(this.status, getSpaceResponse.status) &&
        Objects.equals(this.template, getSpaceResponse.template) &&
        Objects.equals(this.updatedAt, getSpaceResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, callbackURL, createdAt, description, domains, GB, hlSLowLatency, region, sipServer, spaceID, spaceName, status, template, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSpaceResponse {\n");
    
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    callbackURL: ").append(toIndentedString(callbackURL)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    GB: ").append(toIndentedString(GB)).append("\n");
    sb.append("    hlSLowLatency: ").append(toIndentedString(hlSLowLatency)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    sipServer: ").append(toIndentedString(sipServer)).append("\n");
    sb.append("    spaceID: ").append(toIndentedString(spaceID)).append("\n");
    sb.append("    spaceName: ").append(toIndentedString(spaceName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
