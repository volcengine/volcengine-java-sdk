/*
 * mcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcdn.model;

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
 * EnableDnsScheduleDomainRequest
 */



public class EnableDnsScheduleDomainRequest {
  @SerializedName("DnsScheduleId")
  private String dnsScheduleId = null;

  @SerializedName("DomainId")
  private String domainId = null;

  public EnableDnsScheduleDomainRequest dnsScheduleId(String dnsScheduleId) {
    this.dnsScheduleId = dnsScheduleId;
    return this;
  }

   /**
   * Get dnsScheduleId
   * @return dnsScheduleId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDnsScheduleId() {
    return dnsScheduleId;
  }

  public void setDnsScheduleId(String dnsScheduleId) {
    this.dnsScheduleId = dnsScheduleId;
  }

  public EnableDnsScheduleDomainRequest domainId(String domainId) {
    this.domainId = domainId;
    return this;
  }

   /**
   * Get domainId
   * @return domainId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDomainId() {
    return domainId;
  }

  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnableDnsScheduleDomainRequest enableDnsScheduleDomainRequest = (EnableDnsScheduleDomainRequest) o;
    return Objects.equals(this.dnsScheduleId, enableDnsScheduleDomainRequest.dnsScheduleId) &&
        Objects.equals(this.domainId, enableDnsScheduleDomainRequest.domainId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsScheduleId, domainId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnableDnsScheduleDomainRequest {\n");
    
    sb.append("    dnsScheduleId: ").append(toIndentedString(dnsScheduleId)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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
