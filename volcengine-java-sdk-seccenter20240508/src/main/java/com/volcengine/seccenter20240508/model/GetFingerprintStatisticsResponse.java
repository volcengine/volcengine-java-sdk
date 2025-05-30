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
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetFingerprintStatisticsResponse
 */



public class GetFingerprintStatisticsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("App")
  private Integer app = null;

  @SerializedName("Container")
  private Integer container = null;

  @SerializedName("Cron")
  private Integer cron = null;

  @SerializedName("Integrity")
  private Integer integrity = null;

  @SerializedName("Kmod")
  private Integer kmod = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("Process")
  private Integer process = null;

  @SerializedName("Service")
  private Integer service = null;

  @SerializedName("Software")
  private Integer software = null;

  @SerializedName("User")
  private Integer user = null;

  @SerializedName("Web")
  private Integer web = null;

  public GetFingerprintStatisticsResponse app(Integer app) {
    this.app = app;
    return this;
  }

   /**
   * Get app
   * @return app
  **/
  @Schema(description = "")
  public Integer getApp() {
    return app;
  }

  public void setApp(Integer app) {
    this.app = app;
  }

  public GetFingerprintStatisticsResponse container(Integer container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @Schema(description = "")
  public Integer getContainer() {
    return container;
  }

  public void setContainer(Integer container) {
    this.container = container;
  }

  public GetFingerprintStatisticsResponse cron(Integer cron) {
    this.cron = cron;
    return this;
  }

   /**
   * Get cron
   * @return cron
  **/
  @Schema(description = "")
  public Integer getCron() {
    return cron;
  }

  public void setCron(Integer cron) {
    this.cron = cron;
  }

  public GetFingerprintStatisticsResponse integrity(Integer integrity) {
    this.integrity = integrity;
    return this;
  }

   /**
   * Get integrity
   * @return integrity
  **/
  @Schema(description = "")
  public Integer getIntegrity() {
    return integrity;
  }

  public void setIntegrity(Integer integrity) {
    this.integrity = integrity;
  }

  public GetFingerprintStatisticsResponse kmod(Integer kmod) {
    this.kmod = kmod;
    return this;
  }

   /**
   * Get kmod
   * @return kmod
  **/
  @Schema(description = "")
  public Integer getKmod() {
    return kmod;
  }

  public void setKmod(Integer kmod) {
    this.kmod = kmod;
  }

  public GetFingerprintStatisticsResponse port(Integer port) {
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

  public GetFingerprintStatisticsResponse process(Integer process) {
    this.process = process;
    return this;
  }

   /**
   * Get process
   * @return process
  **/
  @Schema(description = "")
  public Integer getProcess() {
    return process;
  }

  public void setProcess(Integer process) {
    this.process = process;
  }

  public GetFingerprintStatisticsResponse service(Integer service) {
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @Schema(description = "")
  public Integer getService() {
    return service;
  }

  public void setService(Integer service) {
    this.service = service;
  }

  public GetFingerprintStatisticsResponse software(Integer software) {
    this.software = software;
    return this;
  }

   /**
   * Get software
   * @return software
  **/
  @Schema(description = "")
  public Integer getSoftware() {
    return software;
  }

  public void setSoftware(Integer software) {
    this.software = software;
  }

  public GetFingerprintStatisticsResponse user(Integer user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public Integer getUser() {
    return user;
  }

  public void setUser(Integer user) {
    this.user = user;
  }

  public GetFingerprintStatisticsResponse web(Integer web) {
    this.web = web;
    return this;
  }

   /**
   * Get web
   * @return web
  **/
  @Schema(description = "")
  public Integer getWeb() {
    return web;
  }

  public void setWeb(Integer web) {
    this.web = web;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFingerprintStatisticsResponse getFingerprintStatisticsResponse = (GetFingerprintStatisticsResponse) o;
    return Objects.equals(this.app, getFingerprintStatisticsResponse.app) &&
        Objects.equals(this.container, getFingerprintStatisticsResponse.container) &&
        Objects.equals(this.cron, getFingerprintStatisticsResponse.cron) &&
        Objects.equals(this.integrity, getFingerprintStatisticsResponse.integrity) &&
        Objects.equals(this.kmod, getFingerprintStatisticsResponse.kmod) &&
        Objects.equals(this.port, getFingerprintStatisticsResponse.port) &&
        Objects.equals(this.process, getFingerprintStatisticsResponse.process) &&
        Objects.equals(this.service, getFingerprintStatisticsResponse.service) &&
        Objects.equals(this.software, getFingerprintStatisticsResponse.software) &&
        Objects.equals(this.user, getFingerprintStatisticsResponse.user) &&
        Objects.equals(this.web, getFingerprintStatisticsResponse.web);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, container, cron, integrity, kmod, port, process, service, software, user, web);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFingerprintStatisticsResponse {\n");
    
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
    sb.append("    integrity: ").append(toIndentedString(integrity)).append("\n");
    sb.append("    kmod: ").append(toIndentedString(kmod)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    software: ").append(toIndentedString(software)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
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
