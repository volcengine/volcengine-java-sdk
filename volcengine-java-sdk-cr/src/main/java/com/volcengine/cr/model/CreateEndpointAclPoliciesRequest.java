/*
 * cr
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cr.model;

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
 * CreateEndpointAclPoliciesRequest
 */



public class CreateEndpointAclPoliciesRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("Entries")
  private List<String> entries = null;

  @SerializedName("Registry")
  private String registry = null;

  @SerializedName("Type")
  private String type = null;

  public CreateEndpointAclPoliciesRequest description(String description) {
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

  public CreateEndpointAclPoliciesRequest entries(List<String> entries) {
    this.entries = entries;
    return this;
  }

  public CreateEndpointAclPoliciesRequest addEntriesItem(String entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<String>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @Schema(description = "")
  public List<String> getEntries() {
    return entries;
  }

  public void setEntries(List<String> entries) {
    this.entries = entries;
  }

  public CreateEndpointAclPoliciesRequest registry(String registry) {
    this.registry = registry;
    return this;
  }

   /**
   * Get registry
   * @return registry
  **/
  @NotNull
 @Size(min=3,max=30)  @Schema(required = true, description = "")
  public String getRegistry() {
    return registry;
  }

  public void setRegistry(String registry) {
    this.registry = registry;
  }

  public CreateEndpointAclPoliciesRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @NotNull
  @Schema(required = true, description = "")
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
    CreateEndpointAclPoliciesRequest createEndpointAclPoliciesRequest = (CreateEndpointAclPoliciesRequest) o;
    return Objects.equals(this.description, createEndpointAclPoliciesRequest.description) &&
        Objects.equals(this.entries, createEndpointAclPoliciesRequest.entries) &&
        Objects.equals(this.registry, createEndpointAclPoliciesRequest.registry) &&
        Objects.equals(this.type, createEndpointAclPoliciesRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, entries, registry, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEndpointAclPoliciesRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
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
