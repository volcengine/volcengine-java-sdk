/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ItemForListSupportedResourceTypesOutput
 */



public class ItemForListSupportedResourceTypesOutput {
  @SerializedName("ResourceScope")
  private String resourceScope = null;

  @SerializedName("ResourceSpecifications")
  private List<String> resourceSpecifications = null;

  @SerializedName("ResourceType")
  private String resourceType = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public ItemForListSupportedResourceTypesOutput resourceScope(String resourceScope) {
    this.resourceScope = resourceScope;
    return this;
  }

   /**
   * Get resourceScope
   * @return resourceScope
  **/
  @Schema(description = "")
  public String getResourceScope() {
    return resourceScope;
  }

  public void setResourceScope(String resourceScope) {
    this.resourceScope = resourceScope;
  }

  public ItemForListSupportedResourceTypesOutput resourceSpecifications(List<String> resourceSpecifications) {
    this.resourceSpecifications = resourceSpecifications;
    return this;
  }

  public ItemForListSupportedResourceTypesOutput addResourceSpecificationsItem(String resourceSpecificationsItem) {
    if (this.resourceSpecifications == null) {
      this.resourceSpecifications = new ArrayList<String>();
    }
    this.resourceSpecifications.add(resourceSpecificationsItem);
    return this;
  }

   /**
   * Get resourceSpecifications
   * @return resourceSpecifications
  **/
  @Schema(description = "")
  public List<String> getResourceSpecifications() {
    return resourceSpecifications;
  }

  public void setResourceSpecifications(List<String> resourceSpecifications) {
    this.resourceSpecifications = resourceSpecifications;
  }

  public ItemForListSupportedResourceTypesOutput resourceType(String resourceType) {
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

  public ItemForListSupportedResourceTypesOutput zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemForListSupportedResourceTypesOutput itemForListSupportedResourceTypesOutput = (ItemForListSupportedResourceTypesOutput) o;
    return Objects.equals(this.resourceScope, itemForListSupportedResourceTypesOutput.resourceScope) &&
        Objects.equals(this.resourceSpecifications, itemForListSupportedResourceTypesOutput.resourceSpecifications) &&
        Objects.equals(this.resourceType, itemForListSupportedResourceTypesOutput.resourceType) &&
        Objects.equals(this.zoneId, itemForListSupportedResourceTypesOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceScope, resourceSpecifications, resourceType, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemForListSupportedResourceTypesOutput {\n");
    
    sb.append("    resourceScope: ").append(toIndentedString(resourceScope)).append("\n");
    sb.append("    resourceSpecifications: ").append(toIndentedString(resourceSpecifications)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
