/*
 * cloud_detect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clouddetect.model;

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
 * DNSConfigForCreateTaskInput
 */



public class DNSConfigForCreateTaskInput {
  @SerializedName("EnableDig")
  private Boolean enableDig = null;

  @SerializedName("RecordType")
  private Integer recordType = null;

  @SerializedName("SearchType")
  private Integer searchType = null;

  @SerializedName("Server")
  private String server = null;

  @SerializedName("ServerType")
  private Integer serverType = null;

  @SerializedName("Timeout")
  private Integer timeout = null;

  public DNSConfigForCreateTaskInput enableDig(Boolean enableDig) {
    this.enableDig = enableDig;
    return this;
  }

   /**
   * Get enableDig
   * @return enableDig
  **/
  @Schema(description = "")
  public Boolean isEnableDig() {
    return enableDig;
  }

  public void setEnableDig(Boolean enableDig) {
    this.enableDig = enableDig;
  }

  public DNSConfigForCreateTaskInput recordType(Integer recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @Schema(description = "")
  public Integer getRecordType() {
    return recordType;
  }

  public void setRecordType(Integer recordType) {
    this.recordType = recordType;
  }

  public DNSConfigForCreateTaskInput searchType(Integer searchType) {
    this.searchType = searchType;
    return this;
  }

   /**
   * Get searchType
   * @return searchType
  **/
  @Schema(description = "")
  public Integer getSearchType() {
    return searchType;
  }

  public void setSearchType(Integer searchType) {
    this.searchType = searchType;
  }

  public DNSConfigForCreateTaskInput server(String server) {
    this.server = server;
    return this;
  }

   /**
   * Get server
   * @return server
  **/
  @Schema(description = "")
  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }

  public DNSConfigForCreateTaskInput serverType(Integer serverType) {
    this.serverType = serverType;
    return this;
  }

   /**
   * Get serverType
   * @return serverType
  **/
  @Schema(description = "")
  public Integer getServerType() {
    return serverType;
  }

  public void setServerType(Integer serverType) {
    this.serverType = serverType;
  }

  public DNSConfigForCreateTaskInput timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @Schema(description = "")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNSConfigForCreateTaskInput dnSConfigForCreateTaskInput = (DNSConfigForCreateTaskInput) o;
    return Objects.equals(this.enableDig, dnSConfigForCreateTaskInput.enableDig) &&
        Objects.equals(this.recordType, dnSConfigForCreateTaskInput.recordType) &&
        Objects.equals(this.searchType, dnSConfigForCreateTaskInput.searchType) &&
        Objects.equals(this.server, dnSConfigForCreateTaskInput.server) &&
        Objects.equals(this.serverType, dnSConfigForCreateTaskInput.serverType) &&
        Objects.equals(this.timeout, dnSConfigForCreateTaskInput.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableDig, recordType, searchType, server, serverType, timeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNSConfigForCreateTaskInput {\n");
    
    sb.append("    enableDig: ").append(toIndentedString(enableDig)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
