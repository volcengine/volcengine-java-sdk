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
import com.volcengine.apig.model.IngressSettingsForCreateUpstreamSourceInput;
import com.volcengine.apig.model.SourceSpecForCreateUpstreamSourceInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateUpstreamSourceRequest
 */



public class CreateUpstreamSourceRequest {
  @SerializedName("Comments")
  private String comments = null;

  @SerializedName("GatewayId")
  private String gatewayId = null;

  @SerializedName("IngressSettings")
  private IngressSettingsForCreateUpstreamSourceInput ingressSettings = null;

  @SerializedName("SourceSpec")
  private SourceSpecForCreateUpstreamSourceInput sourceSpec = null;

  @SerializedName("SourceType")
  private String sourceType = null;

  @SerializedName("WatchNamespaces")
  private List<String> watchNamespaces = null;

  public CreateUpstreamSourceRequest comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @Schema(description = "")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public CreateUpstreamSourceRequest gatewayId(String gatewayId) {
    this.gatewayId = gatewayId;
    return this;
  }

   /**
   * Get gatewayId
   * @return gatewayId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getGatewayId() {
    return gatewayId;
  }

  public void setGatewayId(String gatewayId) {
    this.gatewayId = gatewayId;
  }

  public CreateUpstreamSourceRequest ingressSettings(IngressSettingsForCreateUpstreamSourceInput ingressSettings) {
    this.ingressSettings = ingressSettings;
    return this;
  }

   /**
   * Get ingressSettings
   * @return ingressSettings
  **/
  @Valid
  @Schema(description = "")
  public IngressSettingsForCreateUpstreamSourceInput getIngressSettings() {
    return ingressSettings;
  }

  public void setIngressSettings(IngressSettingsForCreateUpstreamSourceInput ingressSettings) {
    this.ingressSettings = ingressSettings;
  }

  public CreateUpstreamSourceRequest sourceSpec(SourceSpecForCreateUpstreamSourceInput sourceSpec) {
    this.sourceSpec = sourceSpec;
    return this;
  }

   /**
   * Get sourceSpec
   * @return sourceSpec
  **/
  @Valid
  @Schema(description = "")
  public SourceSpecForCreateUpstreamSourceInput getSourceSpec() {
    return sourceSpec;
  }

  public void setSourceSpec(SourceSpecForCreateUpstreamSourceInput sourceSpec) {
    this.sourceSpec = sourceSpec;
  }

  public CreateUpstreamSourceRequest sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public CreateUpstreamSourceRequest watchNamespaces(List<String> watchNamespaces) {
    this.watchNamespaces = watchNamespaces;
    return this;
  }

  public CreateUpstreamSourceRequest addWatchNamespacesItem(String watchNamespacesItem) {
    if (this.watchNamespaces == null) {
      this.watchNamespaces = new ArrayList<String>();
    }
    this.watchNamespaces.add(watchNamespacesItem);
    return this;
  }

   /**
   * Get watchNamespaces
   * @return watchNamespaces
  **/
  @Schema(description = "")
  public List<String> getWatchNamespaces() {
    return watchNamespaces;
  }

  public void setWatchNamespaces(List<String> watchNamespaces) {
    this.watchNamespaces = watchNamespaces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUpstreamSourceRequest createUpstreamSourceRequest = (CreateUpstreamSourceRequest) o;
    return Objects.equals(this.comments, createUpstreamSourceRequest.comments) &&
        Objects.equals(this.gatewayId, createUpstreamSourceRequest.gatewayId) &&
        Objects.equals(this.ingressSettings, createUpstreamSourceRequest.ingressSettings) &&
        Objects.equals(this.sourceSpec, createUpstreamSourceRequest.sourceSpec) &&
        Objects.equals(this.sourceType, createUpstreamSourceRequest.sourceType) &&
        Objects.equals(this.watchNamespaces, createUpstreamSourceRequest.watchNamespaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, gatewayId, ingressSettings, sourceSpec, sourceType, watchNamespaces);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUpstreamSourceRequest {\n");
    
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
    sb.append("    ingressSettings: ").append(toIndentedString(ingressSettings)).append("\n");
    sb.append("    sourceSpec: ").append(toIndentedString(sourceSpec)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    watchNamespaces: ").append(toIndentedString(watchNamespaces)).append("\n");
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
