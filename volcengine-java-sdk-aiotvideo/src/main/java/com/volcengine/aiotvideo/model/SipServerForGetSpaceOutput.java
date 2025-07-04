/*
 * aiotvideo
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.aiotvideo.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.aiotvideo.model.SipPortForGetSpaceOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SipServerForGetSpaceOutput
 */



public class SipServerForGetSpaceOutput {
  @SerializedName("SipDomain")
  private String sipDomain = null;

  @SerializedName("SipId")
  private String sipId = null;

  @SerializedName("SipIp")
  private String sipIp = null;

  @SerializedName("SipPort")
  private SipPortForGetSpaceOutput sipPort = null;

  public SipServerForGetSpaceOutput sipDomain(String sipDomain) {
    this.sipDomain = sipDomain;
    return this;
  }

   /**
   * Get sipDomain
   * @return sipDomain
  **/
  @Schema(description = "")
  public String getSipDomain() {
    return sipDomain;
  }

  public void setSipDomain(String sipDomain) {
    this.sipDomain = sipDomain;
  }

  public SipServerForGetSpaceOutput sipId(String sipId) {
    this.sipId = sipId;
    return this;
  }

   /**
   * Get sipId
   * @return sipId
  **/
  @Schema(description = "")
  public String getSipId() {
    return sipId;
  }

  public void setSipId(String sipId) {
    this.sipId = sipId;
  }

  public SipServerForGetSpaceOutput sipIp(String sipIp) {
    this.sipIp = sipIp;
    return this;
  }

   /**
   * Get sipIp
   * @return sipIp
  **/
  @Schema(description = "")
  public String getSipIp() {
    return sipIp;
  }

  public void setSipIp(String sipIp) {
    this.sipIp = sipIp;
  }

  public SipServerForGetSpaceOutput sipPort(SipPortForGetSpaceOutput sipPort) {
    this.sipPort = sipPort;
    return this;
  }

   /**
   * Get sipPort
   * @return sipPort
  **/
  @Valid
  @Schema(description = "")
  public SipPortForGetSpaceOutput getSipPort() {
    return sipPort;
  }

  public void setSipPort(SipPortForGetSpaceOutput sipPort) {
    this.sipPort = sipPort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SipServerForGetSpaceOutput sipServerForGetSpaceOutput = (SipServerForGetSpaceOutput) o;
    return Objects.equals(this.sipDomain, sipServerForGetSpaceOutput.sipDomain) &&
        Objects.equals(this.sipId, sipServerForGetSpaceOutput.sipId) &&
        Objects.equals(this.sipIp, sipServerForGetSpaceOutput.sipIp) &&
        Objects.equals(this.sipPort, sipServerForGetSpaceOutput.sipPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sipDomain, sipId, sipIp, sipPort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SipServerForGetSpaceOutput {\n");
    
    sb.append("    sipDomain: ").append(toIndentedString(sipDomain)).append("\n");
    sb.append("    sipId: ").append(toIndentedString(sipId)).append("\n");
    sb.append("    sipIp: ").append(toIndentedString(sipIp)).append("\n");
    sb.append("    sipPort: ").append(toIndentedString(sipPort)).append("\n");
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
