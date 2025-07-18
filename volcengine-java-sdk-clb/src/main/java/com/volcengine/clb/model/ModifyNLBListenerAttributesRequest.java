/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

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
 * ModifyNLBListenerAttributesRequest
 */



public class ModifyNLBListenerAttributesRequest {
  @SerializedName("CertificateId")
  private String certificateId = null;

  @SerializedName("ConnectionTimeout")
  private Integer connectionTimeout = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Enabled")
  private Boolean enabled = null;

  @SerializedName("ListenerId")
  private String listenerId = null;

  @SerializedName("ListenerName")
  private String listenerName = null;

  @SerializedName("SecurityPolicyId")
  private String securityPolicyId = null;

  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  public ModifyNLBListenerAttributesRequest certificateId(String certificateId) {
    this.certificateId = certificateId;
    return this;
  }

   /**
   * Get certificateId
   * @return certificateId
  **/
  @Schema(description = "")
  public String getCertificateId() {
    return certificateId;
  }

  public void setCertificateId(String certificateId) {
    this.certificateId = certificateId;
  }

  public ModifyNLBListenerAttributesRequest connectionTimeout(Integer connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    return this;
  }

   /**
   * Get connectionTimeout
   * @return connectionTimeout
  **/
  @Schema(description = "")
  public Integer getConnectionTimeout() {
    return connectionTimeout;
  }

  public void setConnectionTimeout(Integer connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  public ModifyNLBListenerAttributesRequest description(String description) {
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

  public ModifyNLBListenerAttributesRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ModifyNLBListenerAttributesRequest listenerId(String listenerId) {
    this.listenerId = listenerId;
    return this;
  }

   /**
   * Get listenerId
   * @return listenerId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getListenerId() {
    return listenerId;
  }

  public void setListenerId(String listenerId) {
    this.listenerId = listenerId;
  }

  public ModifyNLBListenerAttributesRequest listenerName(String listenerName) {
    this.listenerName = listenerName;
    return this;
  }

   /**
   * Get listenerName
   * @return listenerName
  **/
  @Schema(description = "")
  public String getListenerName() {
    return listenerName;
  }

  public void setListenerName(String listenerName) {
    this.listenerName = listenerName;
  }

  public ModifyNLBListenerAttributesRequest securityPolicyId(String securityPolicyId) {
    this.securityPolicyId = securityPolicyId;
    return this;
  }

   /**
   * Get securityPolicyId
   * @return securityPolicyId
  **/
  @Schema(description = "")
  public String getSecurityPolicyId() {
    return securityPolicyId;
  }

  public void setSecurityPolicyId(String securityPolicyId) {
    this.securityPolicyId = securityPolicyId;
  }

  public ModifyNLBListenerAttributesRequest serverGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
    return this;
  }

   /**
   * Get serverGroupId
   * @return serverGroupId
  **/
  @Schema(description = "")
  public String getServerGroupId() {
    return serverGroupId;
  }

  public void setServerGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyNLBListenerAttributesRequest modifyNLBListenerAttributesRequest = (ModifyNLBListenerAttributesRequest) o;
    return Objects.equals(this.certificateId, modifyNLBListenerAttributesRequest.certificateId) &&
        Objects.equals(this.connectionTimeout, modifyNLBListenerAttributesRequest.connectionTimeout) &&
        Objects.equals(this.description, modifyNLBListenerAttributesRequest.description) &&
        Objects.equals(this.enabled, modifyNLBListenerAttributesRequest.enabled) &&
        Objects.equals(this.listenerId, modifyNLBListenerAttributesRequest.listenerId) &&
        Objects.equals(this.listenerName, modifyNLBListenerAttributesRequest.listenerName) &&
        Objects.equals(this.securityPolicyId, modifyNLBListenerAttributesRequest.securityPolicyId) &&
        Objects.equals(this.serverGroupId, modifyNLBListenerAttributesRequest.serverGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateId, connectionTimeout, description, enabled, listenerId, listenerName, securityPolicyId, serverGroupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyNLBListenerAttributesRequest {\n");
    
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
    sb.append("    connectionTimeout: ").append(toIndentedString(connectionTimeout)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
    sb.append("    listenerName: ").append(toIndentedString(listenerName)).append("\n");
    sb.append("    securityPolicyId: ").append(toIndentedString(securityPolicyId)).append("\n");
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
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
