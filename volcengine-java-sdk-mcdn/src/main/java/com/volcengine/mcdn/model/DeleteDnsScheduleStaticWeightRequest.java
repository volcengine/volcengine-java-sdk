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
 * DeleteDnsScheduleStaticWeightRequest
 */



public class DeleteDnsScheduleStaticWeightRequest {
  @SerializedName("DnsScheduleId")
  private String dnsScheduleId = null;

  @SerializedName("WeightId")
  private String weightId = null;

  public DeleteDnsScheduleStaticWeightRequest dnsScheduleId(String dnsScheduleId) {
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

  public DeleteDnsScheduleStaticWeightRequest weightId(String weightId) {
    this.weightId = weightId;
    return this;
  }

   /**
   * Get weightId
   * @return weightId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getWeightId() {
    return weightId;
  }

  public void setWeightId(String weightId) {
    this.weightId = weightId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDnsScheduleStaticWeightRequest deleteDnsScheduleStaticWeightRequest = (DeleteDnsScheduleStaticWeightRequest) o;
    return Objects.equals(this.dnsScheduleId, deleteDnsScheduleStaticWeightRequest.dnsScheduleId) &&
        Objects.equals(this.weightId, deleteDnsScheduleStaticWeightRequest.weightId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsScheduleId, weightId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDnsScheduleStaticWeightRequest {\n");
    
    sb.append("    dnsScheduleId: ").append(toIndentedString(dnsScheduleId)).append("\n");
    sb.append("    weightId: ").append(toIndentedString(weightId)).append("\n");
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