/*
 * iam
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam.model;

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
 * AccessKeyLastUsedForGetAccessKeyLastUsedOutput
 */



public class AccessKeyLastUsedForGetAccessKeyLastUsedOutput {
  @SerializedName("Region")
  private String region = null;

  @SerializedName("RequestTime")
  private String requestTime = null;

  @SerializedName("Service")
  private String service = null;

  public AccessKeyLastUsedForGetAccessKeyLastUsedOutput region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public AccessKeyLastUsedForGetAccessKeyLastUsedOutput requestTime(String requestTime) {
    this.requestTime = requestTime;
    return this;
  }

   /**
   * Get requestTime
   * @return requestTime
  **/
  @Schema(description = "")
  public String getRequestTime() {
    return requestTime;
  }

  public void setRequestTime(String requestTime) {
    this.requestTime = requestTime;
  }

  public AccessKeyLastUsedForGetAccessKeyLastUsedOutput service(String service) {
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @Schema(description = "")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessKeyLastUsedForGetAccessKeyLastUsedOutput accessKeyLastUsedForGetAccessKeyLastUsedOutput = (AccessKeyLastUsedForGetAccessKeyLastUsedOutput) o;
    return Objects.equals(this.region, accessKeyLastUsedForGetAccessKeyLastUsedOutput.region) &&
        Objects.equals(this.requestTime, accessKeyLastUsedForGetAccessKeyLastUsedOutput.requestTime) &&
        Objects.equals(this.service, accessKeyLastUsedForGetAccessKeyLastUsedOutput.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, requestTime, service);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessKeyLastUsedForGetAccessKeyLastUsedOutput {\n");
    
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
