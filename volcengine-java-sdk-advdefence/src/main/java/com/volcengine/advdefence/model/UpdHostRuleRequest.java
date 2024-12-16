/*
 * advdefence
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.advdefence.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.advdefence.model.ProxySetHeaderForUpdHostRuleInput;
import com.volcengine.advdefence.model.ServerForUpdHostRuleInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdHostRuleRequest
 */



public class UpdHostRuleRequest {
  @SerializedName("AccessMode")
  private Integer accessMode = null;

  @SerializedName("AllSSLCipher")
  private Integer allSSLCipher = null;

  @SerializedName("BackUpStatus")
  private Integer backUpStatus = null;

  @SerializedName("ChunkMode")
  private Integer chunkMode = null;

  @SerializedName("ClientMaxBodySize")
  private Integer clientMaxBodySize = null;

  @SerializedName("DefIp")
  private List<String> defIp = null;

  @SerializedName("GzipMode")
  private Integer gzipMode = null;

  @SerializedName("Host")
  private String host = null;

  @SerializedName("Http2")
  private Integer http2 = null;

  @SerializedName("KeepAliveRequests")
  private Integer keepAliveRequests = null;

  @SerializedName("KeepAliveTimeOut")
  private Integer keepAliveTimeOut = null;

  @SerializedName("LBAlgorithm")
  private String lbAlgorithm = null;

  @SerializedName("ProtoFollow")
  private Integer protoFollow = null;

  @SerializedName("Protocols")
  private List<String> protocols = null;

  @SerializedName("ProxyConnectTimeOut")
  private Integer proxyConnectTimeOut = null;

  @SerializedName("ProxyKeepAliveRequests")
  private Integer proxyKeepAliveRequests = null;

  @SerializedName("ProxyKeepAliveTimeOut")
  private Integer proxyKeepAliveTimeOut = null;

  @SerializedName("ProxyReadTimeOut")
  private Integer proxyReadTimeOut = null;

  @SerializedName("ProxyRetry")
  private Integer proxyRetry = null;

  @SerializedName("ProxySendTimeOut")
  private Integer proxySendTimeOut = null;

  @SerializedName("ProxySetHeader")
  private List<ProxySetHeaderForUpdHostRuleInput> proxySetHeader = null;

  @SerializedName("SSLCiphers")
  private List<String> ssLCiphers = null;

  @SerializedName("SSLProtocols")
  private List<String> ssLProtocols = null;

  @SerializedName("Servers")
  private List<ServerForUpdHostRuleInput> servers = null;

  @SerializedName("UserCertId")
  private String userCertId = null;

  public UpdHostRuleRequest accessMode(Integer accessMode) {
    this.accessMode = accessMode;
    return this;
  }

   /**
   * Get accessMode
   * @return accessMode
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getAccessMode() {
    return accessMode;
  }

  public void setAccessMode(Integer accessMode) {
    this.accessMode = accessMode;
  }

  public UpdHostRuleRequest allSSLCipher(Integer allSSLCipher) {
    this.allSSLCipher = allSSLCipher;
    return this;
  }

   /**
   * Get allSSLCipher
   * @return allSSLCipher
  **/
  @Schema(description = "")
  public Integer getAllSSLCipher() {
    return allSSLCipher;
  }

  public void setAllSSLCipher(Integer allSSLCipher) {
    this.allSSLCipher = allSSLCipher;
  }

  public UpdHostRuleRequest backUpStatus(Integer backUpStatus) {
    this.backUpStatus = backUpStatus;
    return this;
  }

   /**
   * Get backUpStatus
   * @return backUpStatus
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getBackUpStatus() {
    return backUpStatus;
  }

  public void setBackUpStatus(Integer backUpStatus) {
    this.backUpStatus = backUpStatus;
  }

  public UpdHostRuleRequest chunkMode(Integer chunkMode) {
    this.chunkMode = chunkMode;
    return this;
  }

   /**
   * Get chunkMode
   * @return chunkMode
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getChunkMode() {
    return chunkMode;
  }

  public void setChunkMode(Integer chunkMode) {
    this.chunkMode = chunkMode;
  }

  public UpdHostRuleRequest clientMaxBodySize(Integer clientMaxBodySize) {
    this.clientMaxBodySize = clientMaxBodySize;
    return this;
  }

   /**
   * Get clientMaxBodySize
   * @return clientMaxBodySize
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getClientMaxBodySize() {
    return clientMaxBodySize;
  }

  public void setClientMaxBodySize(Integer clientMaxBodySize) {
    this.clientMaxBodySize = clientMaxBodySize;
  }

  public UpdHostRuleRequest defIp(List<String> defIp) {
    this.defIp = defIp;
    return this;
  }

  public UpdHostRuleRequest addDefIpItem(String defIpItem) {
    if (this.defIp == null) {
      this.defIp = new ArrayList<String>();
    }
    this.defIp.add(defIpItem);
    return this;
  }

   /**
   * Get defIp
   * @return defIp
  **/
  @Schema(description = "")
  public List<String> getDefIp() {
    return defIp;
  }

  public void setDefIp(List<String> defIp) {
    this.defIp = defIp;
  }

  public UpdHostRuleRequest gzipMode(Integer gzipMode) {
    this.gzipMode = gzipMode;
    return this;
  }

   /**
   * Get gzipMode
   * @return gzipMode
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getGzipMode() {
    return gzipMode;
  }

  public void setGzipMode(Integer gzipMode) {
    this.gzipMode = gzipMode;
  }

  public UpdHostRuleRequest host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public UpdHostRuleRequest http2(Integer http2) {
    this.http2 = http2;
    return this;
  }

   /**
   * Get http2
   * @return http2
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getHttp2() {
    return http2;
  }

  public void setHttp2(Integer http2) {
    this.http2 = http2;
  }

  public UpdHostRuleRequest keepAliveRequests(Integer keepAliveRequests) {
    this.keepAliveRequests = keepAliveRequests;
    return this;
  }

   /**
   * Get keepAliveRequests
   * @return keepAliveRequests
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getKeepAliveRequests() {
    return keepAliveRequests;
  }

  public void setKeepAliveRequests(Integer keepAliveRequests) {
    this.keepAliveRequests = keepAliveRequests;
  }

  public UpdHostRuleRequest keepAliveTimeOut(Integer keepAliveTimeOut) {
    this.keepAliveTimeOut = keepAliveTimeOut;
    return this;
  }

   /**
   * Get keepAliveTimeOut
   * @return keepAliveTimeOut
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getKeepAliveTimeOut() {
    return keepAliveTimeOut;
  }

  public void setKeepAliveTimeOut(Integer keepAliveTimeOut) {
    this.keepAliveTimeOut = keepAliveTimeOut;
  }

  public UpdHostRuleRequest lbAlgorithm(String lbAlgorithm) {
    this.lbAlgorithm = lbAlgorithm;
    return this;
  }

   /**
   * Get lbAlgorithm
   * @return lbAlgorithm
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getLbAlgorithm() {
    return lbAlgorithm;
  }

  public void setLbAlgorithm(String lbAlgorithm) {
    this.lbAlgorithm = lbAlgorithm;
  }

  public UpdHostRuleRequest protoFollow(Integer protoFollow) {
    this.protoFollow = protoFollow;
    return this;
  }

   /**
   * Get protoFollow
   * @return protoFollow
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getProtoFollow() {
    return protoFollow;
  }

  public void setProtoFollow(Integer protoFollow) {
    this.protoFollow = protoFollow;
  }

  public UpdHostRuleRequest protocols(List<String> protocols) {
    this.protocols = protocols;
    return this;
  }

  public UpdHostRuleRequest addProtocolsItem(String protocolsItem) {
    if (this.protocols == null) {
      this.protocols = new ArrayList<String>();
    }
    this.protocols.add(protocolsItem);
    return this;
  }

   /**
   * Get protocols
   * @return protocols
  **/
  @Schema(description = "")
  public List<String> getProtocols() {
    return protocols;
  }

  public void setProtocols(List<String> protocols) {
    this.protocols = protocols;
  }

  public UpdHostRuleRequest proxyConnectTimeOut(Integer proxyConnectTimeOut) {
    this.proxyConnectTimeOut = proxyConnectTimeOut;
    return this;
  }

   /**
   * Get proxyConnectTimeOut
   * @return proxyConnectTimeOut
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getProxyConnectTimeOut() {
    return proxyConnectTimeOut;
  }

  public void setProxyConnectTimeOut(Integer proxyConnectTimeOut) {
    this.proxyConnectTimeOut = proxyConnectTimeOut;
  }

  public UpdHostRuleRequest proxyKeepAliveRequests(Integer proxyKeepAliveRequests) {
    this.proxyKeepAliveRequests = proxyKeepAliveRequests;
    return this;
  }

   /**
   * Get proxyKeepAliveRequests
   * @return proxyKeepAliveRequests
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getProxyKeepAliveRequests() {
    return proxyKeepAliveRequests;
  }

  public void setProxyKeepAliveRequests(Integer proxyKeepAliveRequests) {
    this.proxyKeepAliveRequests = proxyKeepAliveRequests;
  }

  public UpdHostRuleRequest proxyKeepAliveTimeOut(Integer proxyKeepAliveTimeOut) {
    this.proxyKeepAliveTimeOut = proxyKeepAliveTimeOut;
    return this;
  }

   /**
   * Get proxyKeepAliveTimeOut
   * @return proxyKeepAliveTimeOut
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getProxyKeepAliveTimeOut() {
    return proxyKeepAliveTimeOut;
  }

  public void setProxyKeepAliveTimeOut(Integer proxyKeepAliveTimeOut) {
    this.proxyKeepAliveTimeOut = proxyKeepAliveTimeOut;
  }

  public UpdHostRuleRequest proxyReadTimeOut(Integer proxyReadTimeOut) {
    this.proxyReadTimeOut = proxyReadTimeOut;
    return this;
  }

   /**
   * Get proxyReadTimeOut
   * @return proxyReadTimeOut
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getProxyReadTimeOut() {
    return proxyReadTimeOut;
  }

  public void setProxyReadTimeOut(Integer proxyReadTimeOut) {
    this.proxyReadTimeOut = proxyReadTimeOut;
  }

  public UpdHostRuleRequest proxyRetry(Integer proxyRetry) {
    this.proxyRetry = proxyRetry;
    return this;
  }

   /**
   * Get proxyRetry
   * @return proxyRetry
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getProxyRetry() {
    return proxyRetry;
  }

  public void setProxyRetry(Integer proxyRetry) {
    this.proxyRetry = proxyRetry;
  }

  public UpdHostRuleRequest proxySendTimeOut(Integer proxySendTimeOut) {
    this.proxySendTimeOut = proxySendTimeOut;
    return this;
  }

   /**
   * Get proxySendTimeOut
   * @return proxySendTimeOut
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getProxySendTimeOut() {
    return proxySendTimeOut;
  }

  public void setProxySendTimeOut(Integer proxySendTimeOut) {
    this.proxySendTimeOut = proxySendTimeOut;
  }

  public UpdHostRuleRequest proxySetHeader(List<ProxySetHeaderForUpdHostRuleInput> proxySetHeader) {
    this.proxySetHeader = proxySetHeader;
    return this;
  }

  public UpdHostRuleRequest addProxySetHeaderItem(ProxySetHeaderForUpdHostRuleInput proxySetHeaderItem) {
    if (this.proxySetHeader == null) {
      this.proxySetHeader = new ArrayList<ProxySetHeaderForUpdHostRuleInput>();
    }
    this.proxySetHeader.add(proxySetHeaderItem);
    return this;
  }

   /**
   * Get proxySetHeader
   * @return proxySetHeader
  **/
  @Valid
  @Schema(description = "")
  public List<ProxySetHeaderForUpdHostRuleInput> getProxySetHeader() {
    return proxySetHeader;
  }

  public void setProxySetHeader(List<ProxySetHeaderForUpdHostRuleInput> proxySetHeader) {
    this.proxySetHeader = proxySetHeader;
  }

  public UpdHostRuleRequest ssLCiphers(List<String> ssLCiphers) {
    this.ssLCiphers = ssLCiphers;
    return this;
  }

  public UpdHostRuleRequest addSsLCiphersItem(String ssLCiphersItem) {
    if (this.ssLCiphers == null) {
      this.ssLCiphers = new ArrayList<String>();
    }
    this.ssLCiphers.add(ssLCiphersItem);
    return this;
  }

   /**
   * Get ssLCiphers
   * @return ssLCiphers
  **/
  @Schema(description = "")
  public List<String> getSsLCiphers() {
    return ssLCiphers;
  }

  public void setSsLCiphers(List<String> ssLCiphers) {
    this.ssLCiphers = ssLCiphers;
  }

  public UpdHostRuleRequest ssLProtocols(List<String> ssLProtocols) {
    this.ssLProtocols = ssLProtocols;
    return this;
  }

  public UpdHostRuleRequest addSsLProtocolsItem(String ssLProtocolsItem) {
    if (this.ssLProtocols == null) {
      this.ssLProtocols = new ArrayList<String>();
    }
    this.ssLProtocols.add(ssLProtocolsItem);
    return this;
  }

   /**
   * Get ssLProtocols
   * @return ssLProtocols
  **/
  @Schema(description = "")
  public List<String> getSsLProtocols() {
    return ssLProtocols;
  }

  public void setSsLProtocols(List<String> ssLProtocols) {
    this.ssLProtocols = ssLProtocols;
  }

  public UpdHostRuleRequest servers(List<ServerForUpdHostRuleInput> servers) {
    this.servers = servers;
    return this;
  }

  public UpdHostRuleRequest addServersItem(ServerForUpdHostRuleInput serversItem) {
    if (this.servers == null) {
      this.servers = new ArrayList<ServerForUpdHostRuleInput>();
    }
    this.servers.add(serversItem);
    return this;
  }

   /**
   * Get servers
   * @return servers
  **/
  @Valid
  @Schema(description = "")
  public List<ServerForUpdHostRuleInput> getServers() {
    return servers;
  }

  public void setServers(List<ServerForUpdHostRuleInput> servers) {
    this.servers = servers;
  }

  public UpdHostRuleRequest userCertId(String userCertId) {
    this.userCertId = userCertId;
    return this;
  }

   /**
   * Get userCertId
   * @return userCertId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getUserCertId() {
    return userCertId;
  }

  public void setUserCertId(String userCertId) {
    this.userCertId = userCertId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdHostRuleRequest updHostRuleRequest = (UpdHostRuleRequest) o;
    return Objects.equals(this.accessMode, updHostRuleRequest.accessMode) &&
        Objects.equals(this.allSSLCipher, updHostRuleRequest.allSSLCipher) &&
        Objects.equals(this.backUpStatus, updHostRuleRequest.backUpStatus) &&
        Objects.equals(this.chunkMode, updHostRuleRequest.chunkMode) &&
        Objects.equals(this.clientMaxBodySize, updHostRuleRequest.clientMaxBodySize) &&
        Objects.equals(this.defIp, updHostRuleRequest.defIp) &&
        Objects.equals(this.gzipMode, updHostRuleRequest.gzipMode) &&
        Objects.equals(this.host, updHostRuleRequest.host) &&
        Objects.equals(this.http2, updHostRuleRequest.http2) &&
        Objects.equals(this.keepAliveRequests, updHostRuleRequest.keepAliveRequests) &&
        Objects.equals(this.keepAliveTimeOut, updHostRuleRequest.keepAliveTimeOut) &&
        Objects.equals(this.lbAlgorithm, updHostRuleRequest.lbAlgorithm) &&
        Objects.equals(this.protoFollow, updHostRuleRequest.protoFollow) &&
        Objects.equals(this.protocols, updHostRuleRequest.protocols) &&
        Objects.equals(this.proxyConnectTimeOut, updHostRuleRequest.proxyConnectTimeOut) &&
        Objects.equals(this.proxyKeepAliveRequests, updHostRuleRequest.proxyKeepAliveRequests) &&
        Objects.equals(this.proxyKeepAliveTimeOut, updHostRuleRequest.proxyKeepAliveTimeOut) &&
        Objects.equals(this.proxyReadTimeOut, updHostRuleRequest.proxyReadTimeOut) &&
        Objects.equals(this.proxyRetry, updHostRuleRequest.proxyRetry) &&
        Objects.equals(this.proxySendTimeOut, updHostRuleRequest.proxySendTimeOut) &&
        Objects.equals(this.proxySetHeader, updHostRuleRequest.proxySetHeader) &&
        Objects.equals(this.ssLCiphers, updHostRuleRequest.ssLCiphers) &&
        Objects.equals(this.ssLProtocols, updHostRuleRequest.ssLProtocols) &&
        Objects.equals(this.servers, updHostRuleRequest.servers) &&
        Objects.equals(this.userCertId, updHostRuleRequest.userCertId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessMode, allSSLCipher, backUpStatus, chunkMode, clientMaxBodySize, defIp, gzipMode, host, http2, keepAliveRequests, keepAliveTimeOut, lbAlgorithm, protoFollow, protocols, proxyConnectTimeOut, proxyKeepAliveRequests, proxyKeepAliveTimeOut, proxyReadTimeOut, proxyRetry, proxySendTimeOut, proxySetHeader, ssLCiphers, ssLProtocols, servers, userCertId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdHostRuleRequest {\n");
    
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    allSSLCipher: ").append(toIndentedString(allSSLCipher)).append("\n");
    sb.append("    backUpStatus: ").append(toIndentedString(backUpStatus)).append("\n");
    sb.append("    chunkMode: ").append(toIndentedString(chunkMode)).append("\n");
    sb.append("    clientMaxBodySize: ").append(toIndentedString(clientMaxBodySize)).append("\n");
    sb.append("    defIp: ").append(toIndentedString(defIp)).append("\n");
    sb.append("    gzipMode: ").append(toIndentedString(gzipMode)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    http2: ").append(toIndentedString(http2)).append("\n");
    sb.append("    keepAliveRequests: ").append(toIndentedString(keepAliveRequests)).append("\n");
    sb.append("    keepAliveTimeOut: ").append(toIndentedString(keepAliveTimeOut)).append("\n");
    sb.append("    lbAlgorithm: ").append(toIndentedString(lbAlgorithm)).append("\n");
    sb.append("    protoFollow: ").append(toIndentedString(protoFollow)).append("\n");
    sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
    sb.append("    proxyConnectTimeOut: ").append(toIndentedString(proxyConnectTimeOut)).append("\n");
    sb.append("    proxyKeepAliveRequests: ").append(toIndentedString(proxyKeepAliveRequests)).append("\n");
    sb.append("    proxyKeepAliveTimeOut: ").append(toIndentedString(proxyKeepAliveTimeOut)).append("\n");
    sb.append("    proxyReadTimeOut: ").append(toIndentedString(proxyReadTimeOut)).append("\n");
    sb.append("    proxyRetry: ").append(toIndentedString(proxyRetry)).append("\n");
    sb.append("    proxySendTimeOut: ").append(toIndentedString(proxySendTimeOut)).append("\n");
    sb.append("    proxySetHeader: ").append(toIndentedString(proxySetHeader)).append("\n");
    sb.append("    ssLCiphers: ").append(toIndentedString(ssLCiphers)).append("\n");
    sb.append("    ssLProtocols: ").append(toIndentedString(ssLProtocols)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
    sb.append("    userCertId: ").append(toIndentedString(userCertId)).append("\n");
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