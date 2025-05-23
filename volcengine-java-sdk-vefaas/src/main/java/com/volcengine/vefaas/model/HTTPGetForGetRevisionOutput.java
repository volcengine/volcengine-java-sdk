/*
 * vefaas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vefaas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vefaas.model.HTTPHeaderForGetRevisionOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * HTTPGetForGetRevisionOutput
 */



public class HTTPGetForGetRevisionOutput {
  @SerializedName("HTTPHeaders")
  private List<HTTPHeaderForGetRevisionOutput> htTPHeaders = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("Scheme")
  private String scheme = null;

  public HTTPGetForGetRevisionOutput htTPHeaders(List<HTTPHeaderForGetRevisionOutput> htTPHeaders) {
    this.htTPHeaders = htTPHeaders;
    return this;
  }

  public HTTPGetForGetRevisionOutput addHtTPHeadersItem(HTTPHeaderForGetRevisionOutput htTPHeadersItem) {
    if (this.htTPHeaders == null) {
      this.htTPHeaders = new ArrayList<HTTPHeaderForGetRevisionOutput>();
    }
    this.htTPHeaders.add(htTPHeadersItem);
    return this;
  }

   /**
   * Get htTPHeaders
   * @return htTPHeaders
  **/
  @Valid
  @Schema(description = "")
  public List<HTTPHeaderForGetRevisionOutput> getHtTPHeaders() {
    return htTPHeaders;
  }

  public void setHtTPHeaders(List<HTTPHeaderForGetRevisionOutput> htTPHeaders) {
    this.htTPHeaders = htTPHeaders;
  }

  public HTTPGetForGetRevisionOutput path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public HTTPGetForGetRevisionOutput port(Integer port) {
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

  public HTTPGetForGetRevisionOutput scheme(String scheme) {
    this.scheme = scheme;
    return this;
  }

   /**
   * Get scheme
   * @return scheme
  **/
  @Schema(description = "")
  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPGetForGetRevisionOutput htTPGetForGetRevisionOutput = (HTTPGetForGetRevisionOutput) o;
    return Objects.equals(this.htTPHeaders, htTPGetForGetRevisionOutput.htTPHeaders) &&
        Objects.equals(this.path, htTPGetForGetRevisionOutput.path) &&
        Objects.equals(this.port, htTPGetForGetRevisionOutput.port) &&
        Objects.equals(this.scheme, htTPGetForGetRevisionOutput.scheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htTPHeaders, path, port, scheme);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPGetForGetRevisionOutput {\n");
    
    sb.append("    htTPHeaders: ").append(toIndentedString(htTPHeaders)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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
