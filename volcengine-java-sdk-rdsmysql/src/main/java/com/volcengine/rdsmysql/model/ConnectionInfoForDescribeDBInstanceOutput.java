/*
 * rds_mysql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysql.model;

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
 * ConnectionInfoForDescribeDBInstanceOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:46.453185+08:00[Asia/Shanghai]")
public class ConnectionInfoForDescribeDBInstanceOutput {
  @SerializedName("EnableReadOnly")
  private String enableReadOnly = null;

  @SerializedName("EnableReadWriteSplitting")
  private String enableReadWriteSplitting = null;

  @SerializedName("InternalDomain")
  private String internalDomain = null;

  @SerializedName("InternalPort")
  private String internalPort = null;

  @SerializedName("PublicDomain")
  private String publicDomain = null;

  @SerializedName("PublicPort")
  private String publicPort = null;

  public ConnectionInfoForDescribeDBInstanceOutput enableReadOnly(String enableReadOnly) {
    this.enableReadOnly = enableReadOnly;
    return this;
  }

   /**
   * Get enableReadOnly
   * @return enableReadOnly
  **/
  @Schema(description = "")
  public String getEnableReadOnly() {
    return enableReadOnly;
  }

  public void setEnableReadOnly(String enableReadOnly) {
    this.enableReadOnly = enableReadOnly;
  }

  public ConnectionInfoForDescribeDBInstanceOutput enableReadWriteSplitting(String enableReadWriteSplitting) {
    this.enableReadWriteSplitting = enableReadWriteSplitting;
    return this;
  }

   /**
   * Get enableReadWriteSplitting
   * @return enableReadWriteSplitting
  **/
  @Schema(description = "")
  public String getEnableReadWriteSplitting() {
    return enableReadWriteSplitting;
  }

  public void setEnableReadWriteSplitting(String enableReadWriteSplitting) {
    this.enableReadWriteSplitting = enableReadWriteSplitting;
  }

  public ConnectionInfoForDescribeDBInstanceOutput internalDomain(String internalDomain) {
    this.internalDomain = internalDomain;
    return this;
  }

   /**
   * Get internalDomain
   * @return internalDomain
  **/
  @Schema(description = "")
  public String getInternalDomain() {
    return internalDomain;
  }

  public void setInternalDomain(String internalDomain) {
    this.internalDomain = internalDomain;
  }

  public ConnectionInfoForDescribeDBInstanceOutput internalPort(String internalPort) {
    this.internalPort = internalPort;
    return this;
  }

   /**
   * Get internalPort
   * @return internalPort
  **/
  @Schema(description = "")
  public String getInternalPort() {
    return internalPort;
  }

  public void setInternalPort(String internalPort) {
    this.internalPort = internalPort;
  }

  public ConnectionInfoForDescribeDBInstanceOutput publicDomain(String publicDomain) {
    this.publicDomain = publicDomain;
    return this;
  }

   /**
   * Get publicDomain
   * @return publicDomain
  **/
  @Schema(description = "")
  public String getPublicDomain() {
    return publicDomain;
  }

  public void setPublicDomain(String publicDomain) {
    this.publicDomain = publicDomain;
  }

  public ConnectionInfoForDescribeDBInstanceOutput publicPort(String publicPort) {
    this.publicPort = publicPort;
    return this;
  }

   /**
   * Get publicPort
   * @return publicPort
  **/
  @Schema(description = "")
  public String getPublicPort() {
    return publicPort;
  }

  public void setPublicPort(String publicPort) {
    this.publicPort = publicPort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionInfoForDescribeDBInstanceOutput connectionInfoForDescribeDBInstanceOutput = (ConnectionInfoForDescribeDBInstanceOutput) o;
    return Objects.equals(this.enableReadOnly, connectionInfoForDescribeDBInstanceOutput.enableReadOnly) &&
        Objects.equals(this.enableReadWriteSplitting, connectionInfoForDescribeDBInstanceOutput.enableReadWriteSplitting) &&
        Objects.equals(this.internalDomain, connectionInfoForDescribeDBInstanceOutput.internalDomain) &&
        Objects.equals(this.internalPort, connectionInfoForDescribeDBInstanceOutput.internalPort) &&
        Objects.equals(this.publicDomain, connectionInfoForDescribeDBInstanceOutput.publicDomain) &&
        Objects.equals(this.publicPort, connectionInfoForDescribeDBInstanceOutput.publicPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableReadOnly, enableReadWriteSplitting, internalDomain, internalPort, publicDomain, publicPort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionInfoForDescribeDBInstanceOutput {\n");
    
    sb.append("    enableReadOnly: ").append(toIndentedString(enableReadOnly)).append("\n");
    sb.append("    enableReadWriteSplitting: ").append(toIndentedString(enableReadWriteSplitting)).append("\n");
    sb.append("    internalDomain: ").append(toIndentedString(internalDomain)).append("\n");
    sb.append("    internalPort: ").append(toIndentedString(internalPort)).append("\n");
    sb.append("    publicDomain: ").append(toIndentedString(publicDomain)).append("\n");
    sb.append("    publicPort: ").append(toIndentedString(publicPort)).append("\n");
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
