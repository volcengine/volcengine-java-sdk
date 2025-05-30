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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FilterForListRegistryNamespacesInput
 */



public class FilterForListRegistryNamespacesInput {
  @SerializedName("Namespace")
  private String namespace = null;

  @SerializedName("NamespaceIDs")
  private List<String> namespaceIDs = null;

  @SerializedName("RegistryName")
  private String registryName = null;

  public FilterForListRegistryNamespacesInput namespace(String namespace) {
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

  public FilterForListRegistryNamespacesInput namespaceIDs(List<String> namespaceIDs) {
    this.namespaceIDs = namespaceIDs;
    return this;
  }

  public FilterForListRegistryNamespacesInput addNamespaceIDsItem(String namespaceIDsItem) {
    if (this.namespaceIDs == null) {
      this.namespaceIDs = new ArrayList<String>();
    }
    this.namespaceIDs.add(namespaceIDsItem);
    return this;
  }

   /**
   * Get namespaceIDs
   * @return namespaceIDs
  **/
  @Schema(description = "")
  public List<String> getNamespaceIDs() {
    return namespaceIDs;
  }

  public void setNamespaceIDs(List<String> namespaceIDs) {
    this.namespaceIDs = namespaceIDs;
  }

  public FilterForListRegistryNamespacesInput registryName(String registryName) {
    this.registryName = registryName;
    return this;
  }

   /**
   * Get registryName
   * @return registryName
  **/
  @Schema(description = "")
  public String getRegistryName() {
    return registryName;
  }

  public void setRegistryName(String registryName) {
    this.registryName = registryName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterForListRegistryNamespacesInput filterForListRegistryNamespacesInput = (FilterForListRegistryNamespacesInput) o;
    return Objects.equals(this.namespace, filterForListRegistryNamespacesInput.namespace) &&
        Objects.equals(this.namespaceIDs, filterForListRegistryNamespacesInput.namespaceIDs) &&
        Objects.equals(this.registryName, filterForListRegistryNamespacesInput.registryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, namespaceIDs, registryName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterForListRegistryNamespacesInput {\n");
    
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    namespaceIDs: ").append(toIndentedString(namespaceIDs)).append("\n");
    sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
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
