/*
 * cloud_trail
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cloudtrail.model;

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
 * RelatedResourceForLookupEventsOutput
 */



public class RelatedResourceForLookupEventsOutput {
  @SerializedName("IntegratedTrn")
  private String integratedTrn = null;

  @SerializedName("ResourceID")
  private String resourceID = null;

  @SerializedName("ResourceType")
  private String resourceType = null;

  @SerializedName("ResourceTypeDisplay")
  private String resourceTypeDisplay = null;

  @SerializedName("ServiceCode")
  private String serviceCode = null;

  @SerializedName("SourceType")
  private String sourceType = null;

  public RelatedResourceForLookupEventsOutput integratedTrn(String integratedTrn) {
    this.integratedTrn = integratedTrn;
    return this;
  }

   /**
   * Get integratedTrn
   * @return integratedTrn
  **/
  @Schema(description = "")
  public String getIntegratedTrn() {
    return integratedTrn;
  }

  public void setIntegratedTrn(String integratedTrn) {
    this.integratedTrn = integratedTrn;
  }

  public RelatedResourceForLookupEventsOutput resourceID(String resourceID) {
    this.resourceID = resourceID;
    return this;
  }

   /**
   * Get resourceID
   * @return resourceID
  **/
  @Schema(description = "")
  public String getResourceID() {
    return resourceID;
  }

  public void setResourceID(String resourceID) {
    this.resourceID = resourceID;
  }

  public RelatedResourceForLookupEventsOutput resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @Schema(description = "")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public RelatedResourceForLookupEventsOutput resourceTypeDisplay(String resourceTypeDisplay) {
    this.resourceTypeDisplay = resourceTypeDisplay;
    return this;
  }

   /**
   * Get resourceTypeDisplay
   * @return resourceTypeDisplay
  **/
  @Schema(description = "")
  public String getResourceTypeDisplay() {
    return resourceTypeDisplay;
  }

  public void setResourceTypeDisplay(String resourceTypeDisplay) {
    this.resourceTypeDisplay = resourceTypeDisplay;
  }

  public RelatedResourceForLookupEventsOutput serviceCode(String serviceCode) {
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * Get serviceCode
   * @return serviceCode
  **/
  @Schema(description = "")
  public String getServiceCode() {
    return serviceCode;
  }

  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }

  public RelatedResourceForLookupEventsOutput sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @Schema(description = "")
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedResourceForLookupEventsOutput relatedResourceForLookupEventsOutput = (RelatedResourceForLookupEventsOutput) o;
    return Objects.equals(this.integratedTrn, relatedResourceForLookupEventsOutput.integratedTrn) &&
        Objects.equals(this.resourceID, relatedResourceForLookupEventsOutput.resourceID) &&
        Objects.equals(this.resourceType, relatedResourceForLookupEventsOutput.resourceType) &&
        Objects.equals(this.resourceTypeDisplay, relatedResourceForLookupEventsOutput.resourceTypeDisplay) &&
        Objects.equals(this.serviceCode, relatedResourceForLookupEventsOutput.serviceCode) &&
        Objects.equals(this.sourceType, relatedResourceForLookupEventsOutput.sourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integratedTrn, resourceID, resourceType, resourceTypeDisplay, serviceCode, sourceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedResourceForLookupEventsOutput {\n");
    
    sb.append("    integratedTrn: ").append(toIndentedString(integratedTrn)).append("\n");
    sb.append("    resourceID: ").append(toIndentedString(resourceID)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceTypeDisplay: ").append(toIndentedString(resourceTypeDisplay)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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