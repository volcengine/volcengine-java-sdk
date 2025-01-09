/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.alb.model.DomainExtensionForModifyListenerAttributesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyListenerAttributesRequest
 */



public class ModifyListenerAttributesRequest {
  @SerializedName("AccessLogRecordCustomizedHeadersEnabled")
  private String accessLogRecordCustomizedHeadersEnabled = null;

  @SerializedName("AclIds")
  private List<String> aclIds = null;

  @SerializedName("AclStatus")
  private String aclStatus = null;

  @SerializedName("AclType")
  private String aclType = null;

  @SerializedName("CACertificateId")
  private String caCertificateId = null;

  @SerializedName("CertCenterCertificateId")
  private String certCenterCertificateId = null;

  @SerializedName("CertificateId")
  private String certificateId = null;

  @SerializedName("CertificateSource")
  private String certificateSource = null;

  @SerializedName("ClientAddressTransmissionProtocol")
  private String clientAddressTransmissionProtocol = null;

  @SerializedName("CustomizedCfgId")
  private String customizedCfgId = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DomainExtensions")
  private List<DomainExtensionForModifyListenerAttributesInput> domainExtensions = null;

  @SerializedName("EnableHttp2")
  private String enableHttp2 = null;

  @SerializedName("EnableQuic")
  private String enableQuic = null;

  @SerializedName("Enabled")
  private String enabled = null;

  @SerializedName("ListenerId")
  private String listenerId = null;

  @SerializedName("ListenerName")
  private String listenerName = null;

  @SerializedName("ProxyProtocolDisabled")
  private String proxyProtocolDisabled = null;

  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  public ModifyListenerAttributesRequest accessLogRecordCustomizedHeadersEnabled(String accessLogRecordCustomizedHeadersEnabled) {
    this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
    return this;
  }

   /**
   * Get accessLogRecordCustomizedHeadersEnabled
   * @return accessLogRecordCustomizedHeadersEnabled
  **/
  @Schema(description = "")
  public String getAccessLogRecordCustomizedHeadersEnabled() {
    return accessLogRecordCustomizedHeadersEnabled;
  }

  public void setAccessLogRecordCustomizedHeadersEnabled(String accessLogRecordCustomizedHeadersEnabled) {
    this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
  }

  public ModifyListenerAttributesRequest aclIds(List<String> aclIds) {
    this.aclIds = aclIds;
    return this;
  }

  public ModifyListenerAttributesRequest addAclIdsItem(String aclIdsItem) {
    if (this.aclIds == null) {
      this.aclIds = new ArrayList<String>();
    }
    this.aclIds.add(aclIdsItem);
    return this;
  }

   /**
   * Get aclIds
   * @return aclIds
  **/
  @Schema(description = "")
  public List<String> getAclIds() {
    return aclIds;
  }

  public void setAclIds(List<String> aclIds) {
    this.aclIds = aclIds;
  }

  public ModifyListenerAttributesRequest aclStatus(String aclStatus) {
    this.aclStatus = aclStatus;
    return this;
  }

   /**
   * Get aclStatus
   * @return aclStatus
  **/
  @Schema(description = "")
  public String getAclStatus() {
    return aclStatus;
  }

  public void setAclStatus(String aclStatus) {
    this.aclStatus = aclStatus;
  }

  public ModifyListenerAttributesRequest aclType(String aclType) {
    this.aclType = aclType;
    return this;
  }

   /**
   * Get aclType
   * @return aclType
  **/
  @Schema(description = "")
  public String getAclType() {
    return aclType;
  }

  public void setAclType(String aclType) {
    this.aclType = aclType;
  }

  public ModifyListenerAttributesRequest caCertificateId(String caCertificateId) {
    this.caCertificateId = caCertificateId;
    return this;
  }

   /**
   * Get caCertificateId
   * @return caCertificateId
  **/
  @Schema(description = "")
  public String getCaCertificateId() {
    return caCertificateId;
  }

  public void setCaCertificateId(String caCertificateId) {
    this.caCertificateId = caCertificateId;
  }

  public ModifyListenerAttributesRequest certCenterCertificateId(String certCenterCertificateId) {
    this.certCenterCertificateId = certCenterCertificateId;
    return this;
  }

   /**
   * Get certCenterCertificateId
   * @return certCenterCertificateId
  **/
  @Schema(description = "")
  public String getCertCenterCertificateId() {
    return certCenterCertificateId;
  }

  public void setCertCenterCertificateId(String certCenterCertificateId) {
    this.certCenterCertificateId = certCenterCertificateId;
  }

  public ModifyListenerAttributesRequest certificateId(String certificateId) {
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

  public ModifyListenerAttributesRequest certificateSource(String certificateSource) {
    this.certificateSource = certificateSource;
    return this;
  }

   /**
   * Get certificateSource
   * @return certificateSource
  **/
  @Schema(description = "")
  public String getCertificateSource() {
    return certificateSource;
  }

  public void setCertificateSource(String certificateSource) {
    this.certificateSource = certificateSource;
  }

  public ModifyListenerAttributesRequest clientAddressTransmissionProtocol(String clientAddressTransmissionProtocol) {
    this.clientAddressTransmissionProtocol = clientAddressTransmissionProtocol;
    return this;
  }

   /**
   * Get clientAddressTransmissionProtocol
   * @return clientAddressTransmissionProtocol
  **/
  @Schema(description = "")
  public String getClientAddressTransmissionProtocol() {
    return clientAddressTransmissionProtocol;
  }

  public void setClientAddressTransmissionProtocol(String clientAddressTransmissionProtocol) {
    this.clientAddressTransmissionProtocol = clientAddressTransmissionProtocol;
  }

  public ModifyListenerAttributesRequest customizedCfgId(String customizedCfgId) {
    this.customizedCfgId = customizedCfgId;
    return this;
  }

   /**
   * Get customizedCfgId
   * @return customizedCfgId
  **/
  @Schema(description = "")
  public String getCustomizedCfgId() {
    return customizedCfgId;
  }

  public void setCustomizedCfgId(String customizedCfgId) {
    this.customizedCfgId = customizedCfgId;
  }

  public ModifyListenerAttributesRequest description(String description) {
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

  public ModifyListenerAttributesRequest domainExtensions(List<DomainExtensionForModifyListenerAttributesInput> domainExtensions) {
    this.domainExtensions = domainExtensions;
    return this;
  }

  public ModifyListenerAttributesRequest addDomainExtensionsItem(DomainExtensionForModifyListenerAttributesInput domainExtensionsItem) {
    if (this.domainExtensions == null) {
      this.domainExtensions = new ArrayList<DomainExtensionForModifyListenerAttributesInput>();
    }
    this.domainExtensions.add(domainExtensionsItem);
    return this;
  }

   /**
   * Get domainExtensions
   * @return domainExtensions
  **/
  @Valid
  @Schema(description = "")
  public List<DomainExtensionForModifyListenerAttributesInput> getDomainExtensions() {
    return domainExtensions;
  }

  public void setDomainExtensions(List<DomainExtensionForModifyListenerAttributesInput> domainExtensions) {
    this.domainExtensions = domainExtensions;
  }

  public ModifyListenerAttributesRequest enableHttp2(String enableHttp2) {
    this.enableHttp2 = enableHttp2;
    return this;
  }

   /**
   * Get enableHttp2
   * @return enableHttp2
  **/
  @Schema(description = "")
  public String getEnableHttp2() {
    return enableHttp2;
  }

  public void setEnableHttp2(String enableHttp2) {
    this.enableHttp2 = enableHttp2;
  }

  public ModifyListenerAttributesRequest enableQuic(String enableQuic) {
    this.enableQuic = enableQuic;
    return this;
  }

   /**
   * Get enableQuic
   * @return enableQuic
  **/
  @Schema(description = "")
  public String getEnableQuic() {
    return enableQuic;
  }

  public void setEnableQuic(String enableQuic) {
    this.enableQuic = enableQuic;
  }

  public ModifyListenerAttributesRequest enabled(String enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public String getEnabled() {
    return enabled;
  }

  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }

  public ModifyListenerAttributesRequest listenerId(String listenerId) {
    this.listenerId = listenerId;
    return this;
  }

   /**
   * Get listenerId
   * @return listenerId
  **/
  @Schema(description = "")
  public String getListenerId() {
    return listenerId;
  }

  public void setListenerId(String listenerId) {
    this.listenerId = listenerId;
  }

  public ModifyListenerAttributesRequest listenerName(String listenerName) {
    this.listenerName = listenerName;
    return this;
  }

   /**
   * Get listenerName
   * @return listenerName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getListenerName() {
    return listenerName;
  }

  public void setListenerName(String listenerName) {
    this.listenerName = listenerName;
  }

  public ModifyListenerAttributesRequest proxyProtocolDisabled(String proxyProtocolDisabled) {
    this.proxyProtocolDisabled = proxyProtocolDisabled;
    return this;
  }

   /**
   * Get proxyProtocolDisabled
   * @return proxyProtocolDisabled
  **/
  @Schema(description = "")
  public String getProxyProtocolDisabled() {
    return proxyProtocolDisabled;
  }

  public void setProxyProtocolDisabled(String proxyProtocolDisabled) {
    this.proxyProtocolDisabled = proxyProtocolDisabled;
  }

  public ModifyListenerAttributesRequest serverGroupId(String serverGroupId) {
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
    ModifyListenerAttributesRequest modifyListenerAttributesRequest = (ModifyListenerAttributesRequest) o;
    return Objects.equals(this.accessLogRecordCustomizedHeadersEnabled, modifyListenerAttributesRequest.accessLogRecordCustomizedHeadersEnabled) &&
        Objects.equals(this.aclIds, modifyListenerAttributesRequest.aclIds) &&
        Objects.equals(this.aclStatus, modifyListenerAttributesRequest.aclStatus) &&
        Objects.equals(this.aclType, modifyListenerAttributesRequest.aclType) &&
        Objects.equals(this.caCertificateId, modifyListenerAttributesRequest.caCertificateId) &&
        Objects.equals(this.certCenterCertificateId, modifyListenerAttributesRequest.certCenterCertificateId) &&
        Objects.equals(this.certificateId, modifyListenerAttributesRequest.certificateId) &&
        Objects.equals(this.certificateSource, modifyListenerAttributesRequest.certificateSource) &&
        Objects.equals(this.clientAddressTransmissionProtocol, modifyListenerAttributesRequest.clientAddressTransmissionProtocol) &&
        Objects.equals(this.customizedCfgId, modifyListenerAttributesRequest.customizedCfgId) &&
        Objects.equals(this.description, modifyListenerAttributesRequest.description) &&
        Objects.equals(this.domainExtensions, modifyListenerAttributesRequest.domainExtensions) &&
        Objects.equals(this.enableHttp2, modifyListenerAttributesRequest.enableHttp2) &&
        Objects.equals(this.enableQuic, modifyListenerAttributesRequest.enableQuic) &&
        Objects.equals(this.enabled, modifyListenerAttributesRequest.enabled) &&
        Objects.equals(this.listenerId, modifyListenerAttributesRequest.listenerId) &&
        Objects.equals(this.listenerName, modifyListenerAttributesRequest.listenerName) &&
        Objects.equals(this.proxyProtocolDisabled, modifyListenerAttributesRequest.proxyProtocolDisabled) &&
        Objects.equals(this.serverGroupId, modifyListenerAttributesRequest.serverGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLogRecordCustomizedHeadersEnabled, aclIds, aclStatus, aclType, caCertificateId, certCenterCertificateId, certificateId, certificateSource, clientAddressTransmissionProtocol, customizedCfgId, description, domainExtensions, enableHttp2, enableQuic, enabled, listenerId, listenerName, proxyProtocolDisabled, serverGroupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyListenerAttributesRequest {\n");
    
    sb.append("    accessLogRecordCustomizedHeadersEnabled: ").append(toIndentedString(accessLogRecordCustomizedHeadersEnabled)).append("\n");
    sb.append("    aclIds: ").append(toIndentedString(aclIds)).append("\n");
    sb.append("    aclStatus: ").append(toIndentedString(aclStatus)).append("\n");
    sb.append("    aclType: ").append(toIndentedString(aclType)).append("\n");
    sb.append("    caCertificateId: ").append(toIndentedString(caCertificateId)).append("\n");
    sb.append("    certCenterCertificateId: ").append(toIndentedString(certCenterCertificateId)).append("\n");
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
    sb.append("    certificateSource: ").append(toIndentedString(certificateSource)).append("\n");
    sb.append("    clientAddressTransmissionProtocol: ").append(toIndentedString(clientAddressTransmissionProtocol)).append("\n");
    sb.append("    customizedCfgId: ").append(toIndentedString(customizedCfgId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    domainExtensions: ").append(toIndentedString(domainExtensions)).append("\n");
    sb.append("    enableHttp2: ").append(toIndentedString(enableHttp2)).append("\n");
    sb.append("    enableQuic: ").append(toIndentedString(enableQuic)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
    sb.append("    listenerName: ").append(toIndentedString(listenerName)).append("\n");
    sb.append("    proxyProtocolDisabled: ").append(toIndentedString(proxyProtocolDisabled)).append("\n");
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
