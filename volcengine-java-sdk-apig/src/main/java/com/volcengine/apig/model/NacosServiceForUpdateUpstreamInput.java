/*
 * apig
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.apig.model;

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
 * NacosServiceForUpdateUpstreamInput
 */



public class NacosServiceForUpdateUpstreamInput {
  @SerializedName("Group")
  private String group = null;

  @SerializedName("Namespace")
  private String namespace = null;

  @SerializedName("NamespaceId")
  private String namespaceId = null;

  @SerializedName("Service")
  private String service = null;

  @SerializedName("UpstreamSourceId")
  private String upstreamSourceId = null;

  public NacosServiceForUpdateUpstreamInput group(String group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @Schema(description = "")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public NacosServiceForUpdateUpstreamInput namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @Schema(description = "")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public NacosServiceForUpdateUpstreamInput namespaceId(String namespaceId) {
    this.namespaceId = namespaceId;
    return this;
  }

   /**
   * Get namespaceId
   * @return namespaceId
  **/
  @Schema(description = "")
  public String getNamespaceId() {
    return namespaceId;
  }

  public void setNamespaceId(String namespaceId) {
    this.namespaceId = namespaceId;
  }

  public NacosServiceForUpdateUpstreamInput service(String service) {
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @Schema(description = "")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public NacosServiceForUpdateUpstreamInput upstreamSourceId(String upstreamSourceId) {
    this.upstreamSourceId = upstreamSourceId;
    return this;
  }

   /**
   * Get upstreamSourceId
   * @return upstreamSourceId
  **/
  @Schema(description = "")
  public String getUpstreamSourceId() {
    return upstreamSourceId;
  }

  public void setUpstreamSourceId(String upstreamSourceId) {
    this.upstreamSourceId = upstreamSourceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NacosServiceForUpdateUpstreamInput nacosServiceForUpdateUpstreamInput = (NacosServiceForUpdateUpstreamInput) o;
    return Objects.equals(this.group, nacosServiceForUpdateUpstreamInput.group) &&
        Objects.equals(this.namespace, nacosServiceForUpdateUpstreamInput.namespace) &&
        Objects.equals(this.namespaceId, nacosServiceForUpdateUpstreamInput.namespaceId) &&
        Objects.equals(this.service, nacosServiceForUpdateUpstreamInput.service) &&
        Objects.equals(this.upstreamSourceId, nacosServiceForUpdateUpstreamInput.upstreamSourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, namespace, namespaceId, service, upstreamSourceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NacosServiceForUpdateUpstreamInput {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    upstreamSourceId: ").append(toIndentedString(upstreamSourceId)).append("\n");
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
