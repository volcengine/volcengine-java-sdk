/*
 * privatelink
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.privatelink.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.privatelink.model.ResourceForCreateUniqueResourceTypeVpcEndpointServiceInput;
import com.volcengine.privatelink.model.TagsForCreateUniqueResourceTypeVpcEndpointServiceInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateUniqueResourceTypeVpcEndpointServiceRequest
 */


public class CreateUniqueResourceTypeVpcEndpointServiceRequest {
  @SerializedName("AutoAcceptEnabled")
  private Boolean autoAcceptEnabled = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Resource")
  private ResourceForCreateUniqueResourceTypeVpcEndpointServiceInput resource = null;

  @SerializedName("ServiceResourceType")
  private String serviceResourceType = null;

  @SerializedName("Tags")
  private TagsForCreateUniqueResourceTypeVpcEndpointServiceInput tags = null;

  @SerializedName("ZoneIds")
  private List<String> zoneIds = null;

  public CreateUniqueResourceTypeVpcEndpointServiceRequest autoAcceptEnabled(Boolean autoAcceptEnabled) {
    this.autoAcceptEnabled = autoAcceptEnabled;
    return this;
  }

   /**
   * Get autoAcceptEnabled
   * @return autoAcceptEnabled
  **/
  @Schema(description = "")
  public Boolean isAutoAcceptEnabled() {
    return autoAcceptEnabled;
  }

  public void setAutoAcceptEnabled(Boolean autoAcceptEnabled) {
    this.autoAcceptEnabled = autoAcceptEnabled;
  }

  public CreateUniqueResourceTypeVpcEndpointServiceRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public CreateUniqueResourceTypeVpcEndpointServiceRequest description(String description) {
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

  public CreateUniqueResourceTypeVpcEndpointServiceRequest projectName(String projectName) {
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

  public CreateUniqueResourceTypeVpcEndpointServiceRequest resource(ResourceForCreateUniqueResourceTypeVpcEndpointServiceInput resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @Valid
  @Schema(description = "")
  public ResourceForCreateUniqueResourceTypeVpcEndpointServiceInput getResource() {
    return resource;
  }

  public void setResource(ResourceForCreateUniqueResourceTypeVpcEndpointServiceInput resource) {
    this.resource = resource;
  }

  public CreateUniqueResourceTypeVpcEndpointServiceRequest serviceResourceType(String serviceResourceType) {
    this.serviceResourceType = serviceResourceType;
    return this;
  }

   /**
   * Get serviceResourceType
   * @return serviceResourceType
  **/
  @Schema(description = "")
  public String getServiceResourceType() {
    return serviceResourceType;
  }

  public void setServiceResourceType(String serviceResourceType) {
    this.serviceResourceType = serviceResourceType;
  }

  public CreateUniqueResourceTypeVpcEndpointServiceRequest tags(TagsForCreateUniqueResourceTypeVpcEndpointServiceInput tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public TagsForCreateUniqueResourceTypeVpcEndpointServiceInput getTags() {
    return tags;
  }

  public void setTags(TagsForCreateUniqueResourceTypeVpcEndpointServiceInput tags) {
    this.tags = tags;
  }

  public CreateUniqueResourceTypeVpcEndpointServiceRequest zoneIds(List<String> zoneIds) {
    this.zoneIds = zoneIds;
    return this;
  }

  public CreateUniqueResourceTypeVpcEndpointServiceRequest addZoneIdsItem(String zoneIdsItem) {
    if (this.zoneIds == null) {
      this.zoneIds = new ArrayList<String>();
    }
    this.zoneIds.add(zoneIdsItem);
    return this;
  }

   /**
   * Get zoneIds
   * @return zoneIds
  **/
  @Schema(description = "")
  public List<String> getZoneIds() {
    return zoneIds;
  }

  public void setZoneIds(List<String> zoneIds) {
    this.zoneIds = zoneIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUniqueResourceTypeVpcEndpointServiceRequest createUniqueResourceTypeVpcEndpointServiceRequest = (CreateUniqueResourceTypeVpcEndpointServiceRequest) o;
    return Objects.equals(this.autoAcceptEnabled, createUniqueResourceTypeVpcEndpointServiceRequest.autoAcceptEnabled) &&
        Objects.equals(this.clientToken, createUniqueResourceTypeVpcEndpointServiceRequest.clientToken) &&
        Objects.equals(this.description, createUniqueResourceTypeVpcEndpointServiceRequest.description) &&
        Objects.equals(this.projectName, createUniqueResourceTypeVpcEndpointServiceRequest.projectName) &&
        Objects.equals(this.resource, createUniqueResourceTypeVpcEndpointServiceRequest.resource) &&
        Objects.equals(this.serviceResourceType, createUniqueResourceTypeVpcEndpointServiceRequest.serviceResourceType) &&
        Objects.equals(this.tags, createUniqueResourceTypeVpcEndpointServiceRequest.tags) &&
        Objects.equals(this.zoneIds, createUniqueResourceTypeVpcEndpointServiceRequest.zoneIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoAcceptEnabled, clientToken, description, projectName, resource, serviceResourceType, tags, zoneIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUniqueResourceTypeVpcEndpointServiceRequest {\n");
    
    sb.append("    autoAcceptEnabled: ").append(toIndentedString(autoAcceptEnabled)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    serviceResourceType: ").append(toIndentedString(serviceResourceType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    zoneIds: ").append(toIndentedString(zoneIds)).append("\n");
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
