/*
 * acep
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.acep.model;

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
 * RowForListCustomRouteOutput
 */



public class RowForListCustomRouteOutput {
  @SerializedName("CreateAt")
  private Long createAt = null;

  @SerializedName("CustomRouteId")
  private String customRouteId = null;

  @SerializedName("CustomRouteName")
  private String customRouteName = null;

  @SerializedName("DstIP")
  private String dstIP = null;

  @SerializedName("ProxyCipher")
  private String proxyCipher = null;

  @SerializedName("ProxyPort")
  private Integer proxyPort = null;

  @SerializedName("ProxyProtocol")
  private String proxyProtocol = null;

  @SerializedName("UpdateAt")
  private Long updateAt = null;

  @SerializedName("Zone")
  private String zone = null;

  public RowForListCustomRouteOutput createAt(Long createAt) {
    this.createAt = createAt;
    return this;
  }

   /**
   * Get createAt
   * @return createAt
  **/
  @Schema(description = "")
  public Long getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Long createAt) {
    this.createAt = createAt;
  }

  public RowForListCustomRouteOutput customRouteId(String customRouteId) {
    this.customRouteId = customRouteId;
    return this;
  }

   /**
   * Get customRouteId
   * @return customRouteId
  **/
  @Schema(description = "")
  public String getCustomRouteId() {
    return customRouteId;
  }

  public void setCustomRouteId(String customRouteId) {
    this.customRouteId = customRouteId;
  }

  public RowForListCustomRouteOutput customRouteName(String customRouteName) {
    this.customRouteName = customRouteName;
    return this;
  }

   /**
   * Get customRouteName
   * @return customRouteName
  **/
  @Schema(description = "")
  public String getCustomRouteName() {
    return customRouteName;
  }

  public void setCustomRouteName(String customRouteName) {
    this.customRouteName = customRouteName;
  }

  public RowForListCustomRouteOutput dstIP(String dstIP) {
    this.dstIP = dstIP;
    return this;
  }

   /**
   * Get dstIP
   * @return dstIP
  **/
  @Schema(description = "")
  public String getDstIP() {
    return dstIP;
  }

  public void setDstIP(String dstIP) {
    this.dstIP = dstIP;
  }

  public RowForListCustomRouteOutput proxyCipher(String proxyCipher) {
    this.proxyCipher = proxyCipher;
    return this;
  }

   /**
   * Get proxyCipher
   * @return proxyCipher
  **/
  @Schema(description = "")
  public String getProxyCipher() {
    return proxyCipher;
  }

  public void setProxyCipher(String proxyCipher) {
    this.proxyCipher = proxyCipher;
  }

  public RowForListCustomRouteOutput proxyPort(Integer proxyPort) {
    this.proxyPort = proxyPort;
    return this;
  }

   /**
   * Get proxyPort
   * @return proxyPort
  **/
  @Schema(description = "")
  public Integer getProxyPort() {
    return proxyPort;
  }

  public void setProxyPort(Integer proxyPort) {
    this.proxyPort = proxyPort;
  }

  public RowForListCustomRouteOutput proxyProtocol(String proxyProtocol) {
    this.proxyProtocol = proxyProtocol;
    return this;
  }

   /**
   * Get proxyProtocol
   * @return proxyProtocol
  **/
  @Schema(description = "")
  public String getProxyProtocol() {
    return proxyProtocol;
  }

  public void setProxyProtocol(String proxyProtocol) {
    this.proxyProtocol = proxyProtocol;
  }

  public RowForListCustomRouteOutput updateAt(Long updateAt) {
    this.updateAt = updateAt;
    return this;
  }

   /**
   * Get updateAt
   * @return updateAt
  **/
  @Schema(description = "")
  public Long getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Long updateAt) {
    this.updateAt = updateAt;
  }

  public RowForListCustomRouteOutput zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Get zone
   * @return zone
  **/
  @Schema(description = "")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RowForListCustomRouteOutput rowForListCustomRouteOutput = (RowForListCustomRouteOutput) o;
    return Objects.equals(this.createAt, rowForListCustomRouteOutput.createAt) &&
        Objects.equals(this.customRouteId, rowForListCustomRouteOutput.customRouteId) &&
        Objects.equals(this.customRouteName, rowForListCustomRouteOutput.customRouteName) &&
        Objects.equals(this.dstIP, rowForListCustomRouteOutput.dstIP) &&
        Objects.equals(this.proxyCipher, rowForListCustomRouteOutput.proxyCipher) &&
        Objects.equals(this.proxyPort, rowForListCustomRouteOutput.proxyPort) &&
        Objects.equals(this.proxyProtocol, rowForListCustomRouteOutput.proxyProtocol) &&
        Objects.equals(this.updateAt, rowForListCustomRouteOutput.updateAt) &&
        Objects.equals(this.zone, rowForListCustomRouteOutput.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createAt, customRouteId, customRouteName, dstIP, proxyCipher, proxyPort, proxyProtocol, updateAt, zone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RowForListCustomRouteOutput {\n");
    
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    customRouteId: ").append(toIndentedString(customRouteId)).append("\n");
    sb.append("    customRouteName: ").append(toIndentedString(customRouteName)).append("\n");
    sb.append("    dstIP: ").append(toIndentedString(dstIP)).append("\n");
    sb.append("    proxyCipher: ").append(toIndentedString(proxyCipher)).append("\n");
    sb.append("    proxyPort: ").append(toIndentedString(proxyPort)).append("\n");
    sb.append("    proxyProtocol: ").append(toIndentedString(proxyProtocol)).append("\n");
    sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
