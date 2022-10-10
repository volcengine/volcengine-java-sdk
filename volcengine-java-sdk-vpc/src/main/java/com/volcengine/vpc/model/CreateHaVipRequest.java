/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

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
 * CreateHaVipRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-10T12:08:25.743848+08:00[Asia/Shanghai]")
public class CreateHaVipRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("HaVipName")
  private String haVipName = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  public CreateHaVipRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 @Size(min=1,max=255)  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateHaVipRequest haVipName(String haVipName) {
    this.haVipName = haVipName;
    return this;
  }

   /**
   * Get haVipName
   * @return haVipName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getHaVipName() {
    return haVipName;
  }

  public void setHaVipName(String haVipName) {
    this.haVipName = haVipName;
  }

  public CreateHaVipRequest ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @Schema(description = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public CreateHaVipRequest subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateHaVipRequest createHaVipRequest = (CreateHaVipRequest) o;
    return Objects.equals(this.description, createHaVipRequest.description) &&
        Objects.equals(this.haVipName, createHaVipRequest.haVipName) &&
        Objects.equals(this.ipAddress, createHaVipRequest.ipAddress) &&
        Objects.equals(this.subnetId, createHaVipRequest.subnetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, haVipName, ipAddress, subnetId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateHaVipRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    haVipName: ").append(toIndentedString(haVipName)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
