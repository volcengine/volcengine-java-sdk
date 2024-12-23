/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TlsVersionsForDescribeDomainDetailOutput
 */



public class TlsVersionsForDescribeDomainDetailOutput {
  @SerializedName("Enable")
  private Boolean enable = null;

  @SerializedName("TlsVersion")
  private List<String> tlsVersion = null;

  public TlsVersionsForDescribeDomainDetailOutput enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Schema(description = "")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public TlsVersionsForDescribeDomainDetailOutput tlsVersion(List<String> tlsVersion) {
    this.tlsVersion = tlsVersion;
    return this;
  }

  public TlsVersionsForDescribeDomainDetailOutput addTlsVersionItem(String tlsVersionItem) {
    if (this.tlsVersion == null) {
      this.tlsVersion = new ArrayList<String>();
    }
    this.tlsVersion.add(tlsVersionItem);
    return this;
  }

   /**
   * Get tlsVersion
   * @return tlsVersion
  **/
  @Schema(description = "")
  public List<String> getTlsVersion() {
    return tlsVersion;
  }

  public void setTlsVersion(List<String> tlsVersion) {
    this.tlsVersion = tlsVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TlsVersionsForDescribeDomainDetailOutput tlsVersionsForDescribeDomainDetailOutput = (TlsVersionsForDescribeDomainDetailOutput) o;
    return Objects.equals(this.enable, tlsVersionsForDescribeDomainDetailOutput.enable) &&
        Objects.equals(this.tlsVersion, tlsVersionsForDescribeDomainDetailOutput.tlsVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, tlsVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TlsVersionsForDescribeDomainDetailOutput {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    tlsVersion: ").append(toIndentedString(tlsVersion)).append("\n");
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
