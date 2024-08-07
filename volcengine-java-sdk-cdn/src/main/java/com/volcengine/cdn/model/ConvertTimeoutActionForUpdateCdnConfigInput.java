/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

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
 * ConvertTimeoutActionForUpdateCdnConfigInput
 */



public class ConvertTimeoutActionForUpdateCdnConfigInput {
  @SerializedName("HttpTimeout")
  private Long httpTimeout = null;

  @SerializedName("TcpTimeout")
  private Long tcpTimeout = null;

  public ConvertTimeoutActionForUpdateCdnConfigInput httpTimeout(Long httpTimeout) {
    this.httpTimeout = httpTimeout;
    return this;
  }

   /**
   * Get httpTimeout
   * @return httpTimeout
  **/
  @Schema(description = "")
  public Long getHttpTimeout() {
    return httpTimeout;
  }

  public void setHttpTimeout(Long httpTimeout) {
    this.httpTimeout = httpTimeout;
  }

  public ConvertTimeoutActionForUpdateCdnConfigInput tcpTimeout(Long tcpTimeout) {
    this.tcpTimeout = tcpTimeout;
    return this;
  }

   /**
   * Get tcpTimeout
   * @return tcpTimeout
  **/
  @Schema(description = "")
  public Long getTcpTimeout() {
    return tcpTimeout;
  }

  public void setTcpTimeout(Long tcpTimeout) {
    this.tcpTimeout = tcpTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertTimeoutActionForUpdateCdnConfigInput convertTimeoutActionForUpdateCdnConfigInput = (ConvertTimeoutActionForUpdateCdnConfigInput) o;
    return Objects.equals(this.httpTimeout, convertTimeoutActionForUpdateCdnConfigInput.httpTimeout) &&
        Objects.equals(this.tcpTimeout, convertTimeoutActionForUpdateCdnConfigInput.tcpTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpTimeout, tcpTimeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertTimeoutActionForUpdateCdnConfigInput {\n");
    
    sb.append("    httpTimeout: ").append(toIndentedString(httpTimeout)).append("\n");
    sb.append("    tcpTimeout: ").append(toIndentedString(tcpTimeout)).append("\n");
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
