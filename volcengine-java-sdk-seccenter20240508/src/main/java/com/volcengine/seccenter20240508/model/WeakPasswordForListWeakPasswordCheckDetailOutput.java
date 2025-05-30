/*
 * seccenter20240508
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.seccenter20240508.model;

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
 * WeakPasswordForListWeakPasswordCheckDetailOutput
 */



public class WeakPasswordForListWeakPasswordCheckDetailOutput {
  @SerializedName("AgentID")
  private String agentID = null;

  @SerializedName("CheckNameCn")
  private String checkNameCn = null;

  @SerializedName("EipAddress")
  private String eipAddress = null;

  @SerializedName("Hostname")
  private String hostname = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("PrimaryIpAddress")
  private String primaryIpAddress = null;

  @SerializedName("WeakPassword")
  private String weakPassword = null;

  @SerializedName("WeakUsername")
  private String weakUsername = null;

  @SerializedName("check_id")
  private Integer checkId = null;

  @SerializedName("description_cn")
  private String descriptionCn = null;

  public WeakPasswordForListWeakPasswordCheckDetailOutput agentID(String agentID) {
    this.agentID = agentID;
    return this;
  }

   /**
   * Get agentID
   * @return agentID
  **/
  @Schema(description = "")
  public String getAgentID() {
    return agentID;
  }

  public void setAgentID(String agentID) {
    this.agentID = agentID;
  }

  public WeakPasswordForListWeakPasswordCheckDetailOutput checkNameCn(String checkNameCn) {
    this.checkNameCn = checkNameCn;
    return this;
  }

   /**
   * Get checkNameCn
   * @return checkNameCn
  **/
  @Schema(description = "")
  public String getCheckNameCn() {
    return checkNameCn;
  }

  public void setCheckNameCn(String checkNameCn) {
    this.checkNameCn = checkNameCn;
  }

  public WeakPasswordForListWeakPasswordCheckDetailOutput eipAddress(String eipAddress) {
    this.eipAddress = eipAddress;
    return this;
  }

   /**
   * Get eipAddress
   * @return eipAddress
  **/
  @Schema(description = "")
  public String getEipAddress() {
    return eipAddress;
  }

  public void setEipAddress(String eipAddress) {
    this.eipAddress = eipAddress;
  }

  public WeakPasswordForListWeakPasswordCheckDetailOutput hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @Schema(description = "")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public WeakPasswordForListWeakPasswordCheckDetailOutput ID(String ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @Schema(description = "")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public WeakPasswordForListWeakPasswordCheckDetailOutput primaryIpAddress(String primaryIpAddress) {
    this.primaryIpAddress = primaryIpAddress;
    return this;
  }

   /**
   * Get primaryIpAddress
   * @return primaryIpAddress
  **/
  @Schema(description = "")
  public String getPrimaryIpAddress() {
    return primaryIpAddress;
  }

  public void setPrimaryIpAddress(String primaryIpAddress) {
    this.primaryIpAddress = primaryIpAddress;
  }

  public WeakPasswordForListWeakPasswordCheckDetailOutput weakPassword(String weakPassword) {
    this.weakPassword = weakPassword;
    return this;
  }

   /**
   * Get weakPassword
   * @return weakPassword
  **/
  @Schema(description = "")
  public String getWeakPassword() {
    return weakPassword;
  }

  public void setWeakPassword(String weakPassword) {
    this.weakPassword = weakPassword;
  }

  public WeakPasswordForListWeakPasswordCheckDetailOutput weakUsername(String weakUsername) {
    this.weakUsername = weakUsername;
    return this;
  }

   /**
   * Get weakUsername
   * @return weakUsername
  **/
  @Schema(description = "")
  public String getWeakUsername() {
    return weakUsername;
  }

  public void setWeakUsername(String weakUsername) {
    this.weakUsername = weakUsername;
  }

  public WeakPasswordForListWeakPasswordCheckDetailOutput checkId(Integer checkId) {
    this.checkId = checkId;
    return this;
  }

   /**
   * Get checkId
   * @return checkId
  **/
  @Schema(description = "")
  public Integer getCheckId() {
    return checkId;
  }

  public void setCheckId(Integer checkId) {
    this.checkId = checkId;
  }

  public WeakPasswordForListWeakPasswordCheckDetailOutput descriptionCn(String descriptionCn) {
    this.descriptionCn = descriptionCn;
    return this;
  }

   /**
   * Get descriptionCn
   * @return descriptionCn
  **/
  @Schema(description = "")
  public String getDescriptionCn() {
    return descriptionCn;
  }

  public void setDescriptionCn(String descriptionCn) {
    this.descriptionCn = descriptionCn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeakPasswordForListWeakPasswordCheckDetailOutput weakPasswordForListWeakPasswordCheckDetailOutput = (WeakPasswordForListWeakPasswordCheckDetailOutput) o;
    return Objects.equals(this.agentID, weakPasswordForListWeakPasswordCheckDetailOutput.agentID) &&
        Objects.equals(this.checkNameCn, weakPasswordForListWeakPasswordCheckDetailOutput.checkNameCn) &&
        Objects.equals(this.eipAddress, weakPasswordForListWeakPasswordCheckDetailOutput.eipAddress) &&
        Objects.equals(this.hostname, weakPasswordForListWeakPasswordCheckDetailOutput.hostname) &&
        Objects.equals(this.ID, weakPasswordForListWeakPasswordCheckDetailOutput.ID) &&
        Objects.equals(this.primaryIpAddress, weakPasswordForListWeakPasswordCheckDetailOutput.primaryIpAddress) &&
        Objects.equals(this.weakPassword, weakPasswordForListWeakPasswordCheckDetailOutput.weakPassword) &&
        Objects.equals(this.weakUsername, weakPasswordForListWeakPasswordCheckDetailOutput.weakUsername) &&
        Objects.equals(this.checkId, weakPasswordForListWeakPasswordCheckDetailOutput.checkId) &&
        Objects.equals(this.descriptionCn, weakPasswordForListWeakPasswordCheckDetailOutput.descriptionCn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentID, checkNameCn, eipAddress, hostname, ID, primaryIpAddress, weakPassword, weakUsername, checkId, descriptionCn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeakPasswordForListWeakPasswordCheckDetailOutput {\n");
    
    sb.append("    agentID: ").append(toIndentedString(agentID)).append("\n");
    sb.append("    checkNameCn: ").append(toIndentedString(checkNameCn)).append("\n");
    sb.append("    eipAddress: ").append(toIndentedString(eipAddress)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    primaryIpAddress: ").append(toIndentedString(primaryIpAddress)).append("\n");
    sb.append("    weakPassword: ").append(toIndentedString(weakPassword)).append("\n");
    sb.append("    weakUsername: ").append(toIndentedString(weakUsername)).append("\n");
    sb.append("    checkId: ").append(toIndentedString(checkId)).append("\n");
    sb.append("    descriptionCn: ").append(toIndentedString(descriptionCn)).append("\n");
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
