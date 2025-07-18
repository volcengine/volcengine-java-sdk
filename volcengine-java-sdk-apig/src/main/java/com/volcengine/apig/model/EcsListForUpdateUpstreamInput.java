/*
 * apig
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.apig.model;

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
 * EcsListForUpdateUpstreamInput
 */



public class EcsListForUpdateUpstreamInput {
  @SerializedName("EcsId")
  private String ecsId = null;

  @SerializedName("IP")
  private String IP = null;

  @SerializedName("Port")
  private Integer port = null;

  public EcsListForUpdateUpstreamInput ecsId(String ecsId) {
    this.ecsId = ecsId;
    return this;
  }

   /**
   * Get ecsId
   * @return ecsId
  **/
  @Schema(description = "")
  public String getEcsId() {
    return ecsId;
  }

  public void setEcsId(String ecsId) {
    this.ecsId = ecsId;
  }

  public EcsListForUpdateUpstreamInput IP(String IP) {
    this.IP = IP;
    return this;
  }

   /**
   * Get IP
   * @return IP
  **/
  @Schema(description = "")
  public String getIP() {
    return IP;
  }

  public void setIP(String IP) {
    this.IP = IP;
  }

  public EcsListForUpdateUpstreamInput port(Integer port) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EcsListForUpdateUpstreamInput ecsListForUpdateUpstreamInput = (EcsListForUpdateUpstreamInput) o;
    return Objects.equals(this.ecsId, ecsListForUpdateUpstreamInput.ecsId) &&
        Objects.equals(this.IP, ecsListForUpdateUpstreamInput.IP) &&
        Objects.equals(this.port, ecsListForUpdateUpstreamInput.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ecsId, IP, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcsListForUpdateUpstreamInput {\n");
    
    sb.append("    ecsId: ").append(toIndentedString(ecsId)).append("\n");
    sb.append("    IP: ").append(toIndentedString(IP)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
