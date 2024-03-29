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
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * IkeConfigForDescribeVpnConnectionsOutput
 */



public class IkeConfigForDescribeVpnConnectionsOutput {
  @SerializedName("AuthAlg")
  private String authAlg = null;

  @SerializedName("DhGroup")
  private String dhGroup = null;

  @SerializedName("EncAlg")
  private String encAlg = null;

  @SerializedName("Lifetime")
  private Integer lifetime = null;

  @SerializedName("LocalId")
  private String localId = null;

  @SerializedName("Mode")
  private String mode = null;

  @SerializedName("Psk")
  private String psk = null;

  @SerializedName("RemoteId")
  private String remoteId = null;

  @SerializedName("Version")
  private String version = null;

  public IkeConfigForDescribeVpnConnectionsOutput authAlg(String authAlg) {
    this.authAlg = authAlg;
    return this;
  }

   /**
   * Get authAlg
   * @return authAlg
  **/
  @Schema(description = "")
  public String getAuthAlg() {
    return authAlg;
  }

  public void setAuthAlg(String authAlg) {
    this.authAlg = authAlg;
  }

  public IkeConfigForDescribeVpnConnectionsOutput dhGroup(String dhGroup) {
    this.dhGroup = dhGroup;
    return this;
  }

   /**
   * Get dhGroup
   * @return dhGroup
  **/
  @Schema(description = "")
  public String getDhGroup() {
    return dhGroup;
  }

  public void setDhGroup(String dhGroup) {
    this.dhGroup = dhGroup;
  }

  public IkeConfigForDescribeVpnConnectionsOutput encAlg(String encAlg) {
    this.encAlg = encAlg;
    return this;
  }

   /**
   * Get encAlg
   * @return encAlg
  **/
  @Schema(description = "")
  public String getEncAlg() {
    return encAlg;
  }

  public void setEncAlg(String encAlg) {
    this.encAlg = encAlg;
  }

  public IkeConfigForDescribeVpnConnectionsOutput lifetime(Integer lifetime) {
    this.lifetime = lifetime;
    return this;
  }

   /**
   * Get lifetime
   * @return lifetime
  **/
  @Schema(description = "")
  public Integer getLifetime() {
    return lifetime;
  }

  public void setLifetime(Integer lifetime) {
    this.lifetime = lifetime;
  }

  public IkeConfigForDescribeVpnConnectionsOutput localId(String localId) {
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @Schema(description = "")
  public String getLocalId() {
    return localId;
  }

  public void setLocalId(String localId) {
    this.localId = localId;
  }

  public IkeConfigForDescribeVpnConnectionsOutput mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @Schema(description = "")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public IkeConfigForDescribeVpnConnectionsOutput psk(String psk) {
    this.psk = psk;
    return this;
  }

   /**
   * Get psk
   * @return psk
  **/
  @Schema(description = "")
  public String getPsk() {
    return psk;
  }

  public void setPsk(String psk) {
    this.psk = psk;
  }

  public IkeConfigForDescribeVpnConnectionsOutput remoteId(String remoteId) {
    this.remoteId = remoteId;
    return this;
  }

   /**
   * Get remoteId
   * @return remoteId
  **/
  @Schema(description = "")
  public String getRemoteId() {
    return remoteId;
  }

  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }

  public IkeConfigForDescribeVpnConnectionsOutput version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IkeConfigForDescribeVpnConnectionsOutput ikeConfigForDescribeVpnConnectionsOutput = (IkeConfigForDescribeVpnConnectionsOutput) o;
    return Objects.equals(this.authAlg, ikeConfigForDescribeVpnConnectionsOutput.authAlg) &&
        Objects.equals(this.dhGroup, ikeConfigForDescribeVpnConnectionsOutput.dhGroup) &&
        Objects.equals(this.encAlg, ikeConfigForDescribeVpnConnectionsOutput.encAlg) &&
        Objects.equals(this.lifetime, ikeConfigForDescribeVpnConnectionsOutput.lifetime) &&
        Objects.equals(this.localId, ikeConfigForDescribeVpnConnectionsOutput.localId) &&
        Objects.equals(this.mode, ikeConfigForDescribeVpnConnectionsOutput.mode) &&
        Objects.equals(this.psk, ikeConfigForDescribeVpnConnectionsOutput.psk) &&
        Objects.equals(this.remoteId, ikeConfigForDescribeVpnConnectionsOutput.remoteId) &&
        Objects.equals(this.version, ikeConfigForDescribeVpnConnectionsOutput.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authAlg, dhGroup, encAlg, lifetime, localId, mode, psk, remoteId, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IkeConfigForDescribeVpnConnectionsOutput {\n");
    
    sb.append("    authAlg: ").append(toIndentedString(authAlg)).append("\n");
    sb.append("    dhGroup: ").append(toIndentedString(dhGroup)).append("\n");
    sb.append("    encAlg: ").append(toIndentedString(encAlg)).append("\n");
    sb.append("    lifetime: ").append(toIndentedString(lifetime)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    psk: ").append(toIndentedString(psk)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
