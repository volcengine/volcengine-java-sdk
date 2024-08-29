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
import com.volcengine.privatelink.model.ResourceForModifyUniqueResourceTypeVpcEndpointServiceAttributesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyUniqueResourceTypeVpcEndpointServiceAttributesRequest
 */



public class ModifyUniqueResourceTypeVpcEndpointServiceAttributesRequest {
  @SerializedName("AutoAcceptEnabled")
  private Boolean autoAcceptEnabled = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("IpAddressVersions")
  private List<String> ipAddressVersions = null;

  @SerializedName("Resource")
  private ResourceForModifyUniqueResourceTypeVpcEndpointServiceAttributesInput resource = null;

  @SerializedName("ServiceId")
  private String serviceId = null;

  @SerializedName("ZoneIDs")
  private String zoneIDs = null;

  @SerializedName("ZoneIds")
  private List<String> zoneIds = null;

  public ModifyUniqueResourceTypeVpcEndpointServiceAttributesRequest autoAcceptEnabled(Boolean autoAcceptEnabled) {
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

  public ModifyUniqueResourceTypeVpcEndpointServiceAttributesRequest description(String description) {
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

  public ModifyUniqueResourceTypeVpcEndpointServiceAttributesRequest ipAddressVersions(List<String> ipAddressVersions) {
    this.ipAddressVersions = ipAddressVersions;
    return this;
  }

  public ModifyUniqueResourceTypeVpcEndpointServiceAttributesRequest addIpAddressVersionsItem(String ipAddressVersionsItem) {
    if (this.ipAddressVersions == null) {
      this.ipAddressVersions = new ArrayList<String>();
    }
    this.ipAddressVersions.add(ipAddressVersionsItem);
    return this;
  }

   /**
   * Get ipAddressVersions
   * @return ipAddressVersions
  **/
  @Schema(description = "")
  public List<String> getIpAddressVersions() {
    return ipAddressVersions;
  }

  public void setIpAddressVersions(List<String> ipAddressVersions) {
    this.ipAddressVersions = ipAddressVersions;
  }

  public ModifyUniqueResourceTypeVpcEndpointServiceAttributesRequest resource(ResourceForModifyUniqueResourceTypeVpcEndpointServiceAttributesInput resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @Valid
  @Schema(description = "")
  public ResourceForModifyUniqueResourceTypeVpcEndpointServiceAttributesInput getResource() {
    return resource;
  }

  public void setResource(ResourceForModifyUniqueResourceTypeVpcEndpointServiceAttributesInput resource) {
    this.resource = resource;
  }

  public ModifyUniqueResourceTypeVpcEndpointServiceAttributesRequest serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public ModifyUniqueResourceTypeVpcEndpointServiceAttributesRequest zoneIDs(String zoneIDs) {
    this.zoneIDs = zoneIDs;
    return this;
  }

   /**
   * Get zoneIDs
   * @return zoneIDs
  **/
  @Schema(description = "")
  public String getZoneIDs() {
    return zoneIDs;
  }

  public void setZoneIDs(String zoneIDs) {
    this.zoneIDs = zoneIDs;
  }

  public ModifyUniqueResourceTypeVpcEndpointServiceAttributesRequest zoneIds(List<String> zoneIds) {
    this.zoneIds = zoneIds;
    return this;
  }

  public ModifyUniqueResourceTypeVpcEndpointServiceAttributesRequest addZoneIdsItem(String zoneIdsItem) {
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
    ModifyUniqueResourceTypeVpcEndpointServiceAttributesRequest modifyUniqueResourceTypeVpcEndpointServiceAttributesRequest = (ModifyUniqueResourceTypeVpcEndpointServiceAttributesRequest) o;
    return Objects.equals(this.autoAcceptEnabled, modifyUniqueResourceTypeVpcEndpointServiceAttributesRequest.autoAcceptEnabled) &&
        Objects.equals(this.description, modifyUniqueResourceTypeVpcEndpointServiceAttributesRequest.description) &&
        Objects.equals(this.ipAddressVersions, modifyUniqueResourceTypeVpcEndpointServiceAttributesRequest.ipAddressVersions) &&
        Objects.equals(this.resource, modifyUniqueResourceTypeVpcEndpointServiceAttributesRequest.resource) &&
        Objects.equals(this.serviceId, modifyUniqueResourceTypeVpcEndpointServiceAttributesRequest.serviceId) &&
        Objects.equals(this.zoneIDs, modifyUniqueResourceTypeVpcEndpointServiceAttributesRequest.zoneIDs) &&
        Objects.equals(this.zoneIds, modifyUniqueResourceTypeVpcEndpointServiceAttributesRequest.zoneIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoAcceptEnabled, description, ipAddressVersions, resource, serviceId, zoneIDs, zoneIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyUniqueResourceTypeVpcEndpointServiceAttributesRequest {\n");
    
    sb.append("    autoAcceptEnabled: ").append(toIndentedString(autoAcceptEnabled)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ipAddressVersions: ").append(toIndentedString(ipAddressVersions)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    zoneIDs: ").append(toIndentedString(zoneIDs)).append("\n");
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
