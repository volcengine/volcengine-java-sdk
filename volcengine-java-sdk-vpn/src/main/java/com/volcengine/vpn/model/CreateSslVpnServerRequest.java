/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpn.model;

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
 * CreateSslVpnServerRequest
 */



public class CreateSslVpnServerRequest {
  @SerializedName("Auth")
  private String auth = null;

  @SerializedName("Cipher")
  private String cipher = null;

  @SerializedName("ClientIpPool")
  private String clientIpPool = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Compress")
  private Boolean compress = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("LocalSubnets")
  private List<String> localSubnets = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Protocol")
  private String protocol = null;

  @SerializedName("SslVpnServerName")
  private String sslVpnServerName = null;

  @SerializedName("VpnGatewayId")
  private String vpnGatewayId = null;

  public CreateSslVpnServerRequest auth(String auth) {
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @Schema(description = "")
  public String getAuth() {
    return auth;
  }

  public void setAuth(String auth) {
    this.auth = auth;
  }

  public CreateSslVpnServerRequest cipher(String cipher) {
    this.cipher = cipher;
    return this;
  }

   /**
   * Get cipher
   * @return cipher
  **/
  @Schema(description = "")
  public String getCipher() {
    return cipher;
  }

  public void setCipher(String cipher) {
    this.cipher = cipher;
  }

  public CreateSslVpnServerRequest clientIpPool(String clientIpPool) {
    this.clientIpPool = clientIpPool;
    return this;
  }

   /**
   * Get clientIpPool
   * @return clientIpPool
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getClientIpPool() {
    return clientIpPool;
  }

  public void setClientIpPool(String clientIpPool) {
    this.clientIpPool = clientIpPool;
  }

  public CreateSslVpnServerRequest clientToken(String clientToken) {
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

  public CreateSslVpnServerRequest compress(Boolean compress) {
    this.compress = compress;
    return this;
  }

   /**
   * Get compress
   * @return compress
  **/
  @Schema(description = "")
  public Boolean isCompress() {
    return compress;
  }

  public void setCompress(Boolean compress) {
    this.compress = compress;
  }

  public CreateSslVpnServerRequest description(String description) {
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

  public CreateSslVpnServerRequest localSubnets(List<String> localSubnets) {
    this.localSubnets = localSubnets;
    return this;
  }

  public CreateSslVpnServerRequest addLocalSubnetsItem(String localSubnetsItem) {
    if (this.localSubnets == null) {
      this.localSubnets = new ArrayList<String>();
    }
    this.localSubnets.add(localSubnetsItem);
    return this;
  }

   /**
   * Get localSubnets
   * @return localSubnets
  **/
  @Schema(description = "")
  public List<String> getLocalSubnets() {
    return localSubnets;
  }

  public void setLocalSubnets(List<String> localSubnets) {
    this.localSubnets = localSubnets;
  }

  public CreateSslVpnServerRequest port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public CreateSslVpnServerRequest projectName(String projectName) {
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

  public CreateSslVpnServerRequest protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public CreateSslVpnServerRequest sslVpnServerName(String sslVpnServerName) {
    this.sslVpnServerName = sslVpnServerName;
    return this;
  }

   /**
   * Get sslVpnServerName
   * @return sslVpnServerName
  **/
  @Schema(description = "")
  public String getSslVpnServerName() {
    return sslVpnServerName;
  }

  public void setSslVpnServerName(String sslVpnServerName) {
    this.sslVpnServerName = sslVpnServerName;
  }

  public CreateSslVpnServerRequest vpnGatewayId(String vpnGatewayId) {
    this.vpnGatewayId = vpnGatewayId;
    return this;
  }

   /**
   * Get vpnGatewayId
   * @return vpnGatewayId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVpnGatewayId() {
    return vpnGatewayId;
  }

  public void setVpnGatewayId(String vpnGatewayId) {
    this.vpnGatewayId = vpnGatewayId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSslVpnServerRequest createSslVpnServerRequest = (CreateSslVpnServerRequest) o;
    return Objects.equals(this.auth, createSslVpnServerRequest.auth) &&
        Objects.equals(this.cipher, createSslVpnServerRequest.cipher) &&
        Objects.equals(this.clientIpPool, createSslVpnServerRequest.clientIpPool) &&
        Objects.equals(this.clientToken, createSslVpnServerRequest.clientToken) &&
        Objects.equals(this.compress, createSslVpnServerRequest.compress) &&
        Objects.equals(this.description, createSslVpnServerRequest.description) &&
        Objects.equals(this.localSubnets, createSslVpnServerRequest.localSubnets) &&
        Objects.equals(this.port, createSslVpnServerRequest.port) &&
        Objects.equals(this.projectName, createSslVpnServerRequest.projectName) &&
        Objects.equals(this.protocol, createSslVpnServerRequest.protocol) &&
        Objects.equals(this.sslVpnServerName, createSslVpnServerRequest.sslVpnServerName) &&
        Objects.equals(this.vpnGatewayId, createSslVpnServerRequest.vpnGatewayId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, cipher, clientIpPool, clientToken, compress, description, localSubnets, port, projectName, protocol, sslVpnServerName, vpnGatewayId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSslVpnServerRequest {\n");
    
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    cipher: ").append(toIndentedString(cipher)).append("\n");
    sb.append("    clientIpPool: ").append(toIndentedString(clientIpPool)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    compress: ").append(toIndentedString(compress)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    localSubnets: ").append(toIndentedString(localSubnets)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    sslVpnServerName: ").append(toIndentedString(sslVpnServerName)).append("\n");
    sb.append("    vpnGatewayId: ").append(toIndentedString(vpnGatewayId)).append("\n");
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
