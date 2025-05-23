/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

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
 * DomainForGetDomainInfoOutput
 */



public class DomainForGetDomainInfoOutput {
  @SerializedName("APIEnableAutoLearning")
  private Integer apIEnableAutoLearning = null;

  @SerializedName("AccessMode")
  private Integer accessMode = null;

  @SerializedName("ApiEnable")
  private Integer apiEnable = null;

  @SerializedName("BotSequenceEnable")
  private Integer botSequenceEnable = null;

  @SerializedName("Domain")
  private String domain = null;

  public DomainForGetDomainInfoOutput apIEnableAutoLearning(Integer apIEnableAutoLearning) {
    this.apIEnableAutoLearning = apIEnableAutoLearning;
    return this;
  }

   /**
   * Get apIEnableAutoLearning
   * @return apIEnableAutoLearning
  **/
  @Schema(description = "")
  public Integer getApIEnableAutoLearning() {
    return apIEnableAutoLearning;
  }

  public void setApIEnableAutoLearning(Integer apIEnableAutoLearning) {
    this.apIEnableAutoLearning = apIEnableAutoLearning;
  }

  public DomainForGetDomainInfoOutput accessMode(Integer accessMode) {
    this.accessMode = accessMode;
    return this;
  }

   /**
   * Get accessMode
   * @return accessMode
  **/
  @Schema(description = "")
  public Integer getAccessMode() {
    return accessMode;
  }

  public void setAccessMode(Integer accessMode) {
    this.accessMode = accessMode;
  }

  public DomainForGetDomainInfoOutput apiEnable(Integer apiEnable) {
    this.apiEnable = apiEnable;
    return this;
  }

   /**
   * Get apiEnable
   * @return apiEnable
  **/
  @Schema(description = "")
  public Integer getApiEnable() {
    return apiEnable;
  }

  public void setApiEnable(Integer apiEnable) {
    this.apiEnable = apiEnable;
  }

  public DomainForGetDomainInfoOutput botSequenceEnable(Integer botSequenceEnable) {
    this.botSequenceEnable = botSequenceEnable;
    return this;
  }

   /**
   * Get botSequenceEnable
   * @return botSequenceEnable
  **/
  @Schema(description = "")
  public Integer getBotSequenceEnable() {
    return botSequenceEnable;
  }

  public void setBotSequenceEnable(Integer botSequenceEnable) {
    this.botSequenceEnable = botSequenceEnable;
  }

  public DomainForGetDomainInfoOutput domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @Schema(description = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainForGetDomainInfoOutput domainForGetDomainInfoOutput = (DomainForGetDomainInfoOutput) o;
    return Objects.equals(this.apIEnableAutoLearning, domainForGetDomainInfoOutput.apIEnableAutoLearning) &&
        Objects.equals(this.accessMode, domainForGetDomainInfoOutput.accessMode) &&
        Objects.equals(this.apiEnable, domainForGetDomainInfoOutput.apiEnable) &&
        Objects.equals(this.botSequenceEnable, domainForGetDomainInfoOutput.botSequenceEnable) &&
        Objects.equals(this.domain, domainForGetDomainInfoOutput.domain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apIEnableAutoLearning, accessMode, apiEnable, botSequenceEnable, domain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainForGetDomainInfoOutput {\n");
    
    sb.append("    apIEnableAutoLearning: ").append(toIndentedString(apIEnableAutoLearning)).append("\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    apiEnable: ").append(toIndentedString(apiEnable)).append("\n");
    sb.append("    botSequenceEnable: ").append(toIndentedString(botSequenceEnable)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
