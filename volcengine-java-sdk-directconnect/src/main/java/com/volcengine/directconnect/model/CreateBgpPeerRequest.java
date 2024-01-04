/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.directconnect.model;

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
 * CreateBgpPeerRequest
 */


public class CreateBgpPeerRequest {
  @SerializedName("AuthKey")
  private String authKey = null;

  @SerializedName("BgpPeerName")
  private String bgpPeerName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("IpVersion")
  private String ipVersion = null;

  @SerializedName("RemoteAsn")
  private Integer remoteAsn = null;

  @SerializedName("VirtualInterfaceId")
  private String virtualInterfaceId = null;

  public CreateBgpPeerRequest authKey(String authKey) {
    this.authKey = authKey;
    return this;
  }

   /**
   * Get authKey
   * @return authKey
  **/
  @Schema(description = "")
  public String getAuthKey() {
    return authKey;
  }

  public void setAuthKey(String authKey) {
    this.authKey = authKey;
  }

  public CreateBgpPeerRequest bgpPeerName(String bgpPeerName) {
    this.bgpPeerName = bgpPeerName;
    return this;
  }

   /**
   * Get bgpPeerName
   * @return bgpPeerName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getBgpPeerName() {
    return bgpPeerName;
  }

  public void setBgpPeerName(String bgpPeerName) {
    this.bgpPeerName = bgpPeerName;
  }

  public CreateBgpPeerRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 @Size(min=1,max=255)  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateBgpPeerRequest ipVersion(String ipVersion) {
    this.ipVersion = ipVersion;
    return this;
  }

   /**
   * Get ipVersion
   * @return ipVersion
  **/
  @Schema(description = "")
  public String getIpVersion() {
    return ipVersion;
  }

  public void setIpVersion(String ipVersion) {
    this.ipVersion = ipVersion;
  }

  public CreateBgpPeerRequest remoteAsn(Integer remoteAsn) {
    this.remoteAsn = remoteAsn;
    return this;
  }

   /**
   * Get remoteAsn
   * @return remoteAsn
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getRemoteAsn() {
    return remoteAsn;
  }

  public void setRemoteAsn(Integer remoteAsn) {
    this.remoteAsn = remoteAsn;
  }

  public CreateBgpPeerRequest virtualInterfaceId(String virtualInterfaceId) {
    this.virtualInterfaceId = virtualInterfaceId;
    return this;
  }

   /**
   * Get virtualInterfaceId
   * @return virtualInterfaceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVirtualInterfaceId() {
    return virtualInterfaceId;
  }

  public void setVirtualInterfaceId(String virtualInterfaceId) {
    this.virtualInterfaceId = virtualInterfaceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBgpPeerRequest createBgpPeerRequest = (CreateBgpPeerRequest) o;
    return Objects.equals(this.authKey, createBgpPeerRequest.authKey) &&
        Objects.equals(this.bgpPeerName, createBgpPeerRequest.bgpPeerName) &&
        Objects.equals(this.description, createBgpPeerRequest.description) &&
        Objects.equals(this.ipVersion, createBgpPeerRequest.ipVersion) &&
        Objects.equals(this.remoteAsn, createBgpPeerRequest.remoteAsn) &&
        Objects.equals(this.virtualInterfaceId, createBgpPeerRequest.virtualInterfaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authKey, bgpPeerName, description, ipVersion, remoteAsn, virtualInterfaceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBgpPeerRequest {\n");
    
    sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
    sb.append("    bgpPeerName: ").append(toIndentedString(bgpPeerName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
    sb.append("    remoteAsn: ").append(toIndentedString(remoteAsn)).append("\n");
    sb.append("    virtualInterfaceId: ").append(toIndentedString(virtualInterfaceId)).append("\n");
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
