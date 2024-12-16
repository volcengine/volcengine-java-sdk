/*
 * mcs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcs.model;

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
 * SSHKeyPairInfoForGetRiskOutput
 */



public class SSHKeyPairInfoForGetRiskOutput {
  @SerializedName("CreateTimeMilli")
  private Long createTimeMilli = null;

  @SerializedName("FingerPrint")
  private String fingerPrint = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("UID")
  private String UID = null;

  public SSHKeyPairInfoForGetRiskOutput createTimeMilli(Long createTimeMilli) {
    this.createTimeMilli = createTimeMilli;
    return this;
  }

   /**
   * Get createTimeMilli
   * @return createTimeMilli
  **/
  @Schema(description = "")
  public Long getCreateTimeMilli() {
    return createTimeMilli;
  }

  public void setCreateTimeMilli(Long createTimeMilli) {
    this.createTimeMilli = createTimeMilli;
  }

  public SSHKeyPairInfoForGetRiskOutput fingerPrint(String fingerPrint) {
    this.fingerPrint = fingerPrint;
    return this;
  }

   /**
   * Get fingerPrint
   * @return fingerPrint
  **/
  @Schema(description = "")
  public String getFingerPrint() {
    return fingerPrint;
  }

  public void setFingerPrint(String fingerPrint) {
    this.fingerPrint = fingerPrint;
  }

  public SSHKeyPairInfoForGetRiskOutput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SSHKeyPairInfoForGetRiskOutput UID(String UID) {
    this.UID = UID;
    return this;
  }

   /**
   * Get UID
   * @return UID
  **/
  @Schema(description = "")
  public String getUID() {
    return UID;
  }

  public void setUID(String UID) {
    this.UID = UID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSHKeyPairInfoForGetRiskOutput ssHKeyPairInfoForGetRiskOutput = (SSHKeyPairInfoForGetRiskOutput) o;
    return Objects.equals(this.createTimeMilli, ssHKeyPairInfoForGetRiskOutput.createTimeMilli) &&
        Objects.equals(this.fingerPrint, ssHKeyPairInfoForGetRiskOutput.fingerPrint) &&
        Objects.equals(this.name, ssHKeyPairInfoForGetRiskOutput.name) &&
        Objects.equals(this.UID, ssHKeyPairInfoForGetRiskOutput.UID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTimeMilli, fingerPrint, name, UID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSHKeyPairInfoForGetRiskOutput {\n");
    
    sb.append("    createTimeMilli: ").append(toIndentedString(createTimeMilli)).append("\n");
    sb.append("    fingerPrint: ").append(toIndentedString(fingerPrint)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    UID: ").append(toIndentedString(UID)).append("\n");
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