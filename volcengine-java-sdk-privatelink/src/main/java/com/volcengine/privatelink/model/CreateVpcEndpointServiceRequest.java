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
import com.volcengine.privatelink.model.ResourceForCreateVpcEndpointServiceInput;
import com.volcengine.privatelink.model.ResourceIdForCreateVpcEndpointServiceInput;
import com.volcengine.privatelink.model.TagForCreateVpcEndpointServiceInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateVpcEndpointServiceRequest
 */


public class CreateVpcEndpointServiceRequest {
  @SerializedName("AutoAcceptEnabled")
  private Boolean autoAcceptEnabled = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("PrivateDNSEnabled")
  private Boolean privateDNSEnabled = null;

  @SerializedName("PrivateDNSName")
  private String privateDNSName = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("ResourceIds")
  private List<ResourceIdForCreateVpcEndpointServiceInput> resourceIds = null;

  @SerializedName("Resources")
  private List<ResourceForCreateVpcEndpointServiceInput> resources = null;

  @SerializedName("ServiceNameSuffix")
  private String serviceNameSuffix = null;

  @SerializedName("ServiceResourceType")
  private String serviceResourceType = null;

  @SerializedName("Tags")
  private List<TagForCreateVpcEndpointServiceInput> tags = null;

  @SerializedName("WildcardDomainEnabled")
  private Boolean wildcardDomainEnabled = null;

  public CreateVpcEndpointServiceRequest autoAcceptEnabled(Boolean autoAcceptEnabled) {
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

  public CreateVpcEndpointServiceRequest clientToken(String clientToken) {
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

  public CreateVpcEndpointServiceRequest description(String description) {
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

  public CreateVpcEndpointServiceRequest privateDNSEnabled(Boolean privateDNSEnabled) {
    this.privateDNSEnabled = privateDNSEnabled;
    return this;
  }

   /**
   * Get privateDNSEnabled
   * @return privateDNSEnabled
  **/
  @Schema(description = "")
  public Boolean isPrivateDNSEnabled() {
    return privateDNSEnabled;
  }

  public void setPrivateDNSEnabled(Boolean privateDNSEnabled) {
    this.privateDNSEnabled = privateDNSEnabled;
  }

  public CreateVpcEndpointServiceRequest privateDNSName(String privateDNSName) {
    this.privateDNSName = privateDNSName;
    return this;
  }

   /**
   * Get privateDNSName
   * @return privateDNSName
  **/
  @Schema(description = "")
  public String getPrivateDNSName() {
    return privateDNSName;
  }

  public void setPrivateDNSName(String privateDNSName) {
    this.privateDNSName = privateDNSName;
  }

  public CreateVpcEndpointServiceRequest projectName(String projectName) {
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

  public CreateVpcEndpointServiceRequest resourceIds(List<ResourceIdForCreateVpcEndpointServiceInput> resourceIds) {
    this.resourceIds = resourceIds;
    return this;
  }

  public CreateVpcEndpointServiceRequest addResourceIdsItem(ResourceIdForCreateVpcEndpointServiceInput resourceIdsItem) {
    if (this.resourceIds == null) {
      this.resourceIds = new ArrayList<ResourceIdForCreateVpcEndpointServiceInput>();
    }
    this.resourceIds.add(resourceIdsItem);
    return this;
  }

   /**
   * Get resourceIds
   * @return resourceIds
  **/
  @Valid
  @Schema(description = "")
  public List<ResourceIdForCreateVpcEndpointServiceInput> getResourceIds() {
    return resourceIds;
  }

  public void setResourceIds(List<ResourceIdForCreateVpcEndpointServiceInput> resourceIds) {
    this.resourceIds = resourceIds;
  }

  public CreateVpcEndpointServiceRequest resources(List<ResourceForCreateVpcEndpointServiceInput> resources) {
    this.resources = resources;
    return this;
  }

  public CreateVpcEndpointServiceRequest addResourcesItem(ResourceForCreateVpcEndpointServiceInput resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<ResourceForCreateVpcEndpointServiceInput>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @Valid
  @Schema(description = "")
  public List<ResourceForCreateVpcEndpointServiceInput> getResources() {
    return resources;
  }

  public void setResources(List<ResourceForCreateVpcEndpointServiceInput> resources) {
    this.resources = resources;
  }

  public CreateVpcEndpointServiceRequest serviceNameSuffix(String serviceNameSuffix) {
    this.serviceNameSuffix = serviceNameSuffix;
    return this;
  }

   /**
   * Get serviceNameSuffix
   * @return serviceNameSuffix
  **/
  @Schema(description = "")
  public String getServiceNameSuffix() {
    return serviceNameSuffix;
  }

  public void setServiceNameSuffix(String serviceNameSuffix) {
    this.serviceNameSuffix = serviceNameSuffix;
  }

  public CreateVpcEndpointServiceRequest serviceResourceType(String serviceResourceType) {
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

  public CreateVpcEndpointServiceRequest tags(List<TagForCreateVpcEndpointServiceInput> tags) {
    this.tags = tags;
    return this;
  }

  public CreateVpcEndpointServiceRequest addTagsItem(TagForCreateVpcEndpointServiceInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCreateVpcEndpointServiceInput>();
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
  public List<TagForCreateVpcEndpointServiceInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCreateVpcEndpointServiceInput> tags) {
    this.tags = tags;
  }

  public CreateVpcEndpointServiceRequest wildcardDomainEnabled(Boolean wildcardDomainEnabled) {
    this.wildcardDomainEnabled = wildcardDomainEnabled;
    return this;
  }

   /**
   * Get wildcardDomainEnabled
   * @return wildcardDomainEnabled
  **/
  @Schema(description = "")
  public Boolean isWildcardDomainEnabled() {
    return wildcardDomainEnabled;
  }

  public void setWildcardDomainEnabled(Boolean wildcardDomainEnabled) {
    this.wildcardDomainEnabled = wildcardDomainEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVpcEndpointServiceRequest createVpcEndpointServiceRequest = (CreateVpcEndpointServiceRequest) o;
    return Objects.equals(this.autoAcceptEnabled, createVpcEndpointServiceRequest.autoAcceptEnabled) &&
        Objects.equals(this.clientToken, createVpcEndpointServiceRequest.clientToken) &&
        Objects.equals(this.description, createVpcEndpointServiceRequest.description) &&
        Objects.equals(this.privateDNSEnabled, createVpcEndpointServiceRequest.privateDNSEnabled) &&
        Objects.equals(this.privateDNSName, createVpcEndpointServiceRequest.privateDNSName) &&
        Objects.equals(this.projectName, createVpcEndpointServiceRequest.projectName) &&
        Objects.equals(this.resourceIds, createVpcEndpointServiceRequest.resourceIds) &&
        Objects.equals(this.resources, createVpcEndpointServiceRequest.resources) &&
        Objects.equals(this.serviceNameSuffix, createVpcEndpointServiceRequest.serviceNameSuffix) &&
        Objects.equals(this.serviceResourceType, createVpcEndpointServiceRequest.serviceResourceType) &&
        Objects.equals(this.tags, createVpcEndpointServiceRequest.tags) &&
        Objects.equals(this.wildcardDomainEnabled, createVpcEndpointServiceRequest.wildcardDomainEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoAcceptEnabled, clientToken, description, privateDNSEnabled, privateDNSName, projectName, resourceIds, resources, serviceNameSuffix, serviceResourceType, tags, wildcardDomainEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVpcEndpointServiceRequest {\n");
    
    sb.append("    autoAcceptEnabled: ").append(toIndentedString(autoAcceptEnabled)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    privateDNSEnabled: ").append(toIndentedString(privateDNSEnabled)).append("\n");
    sb.append("    privateDNSName: ").append(toIndentedString(privateDNSName)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    serviceNameSuffix: ").append(toIndentedString(serviceNameSuffix)).append("\n");
    sb.append("    serviceResourceType: ").append(toIndentedString(serviceResourceType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    wildcardDomainEnabled: ").append(toIndentedString(wildcardDomainEnabled)).append("\n");
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
