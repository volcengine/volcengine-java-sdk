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
 * CloudAccessConfigForCreateDomainInput
 */



public class CloudAccessConfigForCreateDomainInput {
  @SerializedName("AccessProtocol")
  private String accessProtocol = null;

  @SerializedName("DefenceMode")
  private Integer defenceMode = null;

  @SerializedName("InstanceID")
  private String instanceID = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("ListenerID")
  private String listenerID = null;

  @SerializedName("LostAssociationFromALB")
  private Integer lostAssociationFromALB = null;

  @SerializedName("Port")
  private String port = null;

  @SerializedName("Protocol")
  private String protocol = null;

  public CloudAccessConfigForCreateDomainInput accessProtocol(String accessProtocol) {
    this.accessProtocol = accessProtocol;
    return this;
  }

   /**
   * Get accessProtocol
   * @return accessProtocol
  **/
  @Schema(description = "")
  public String getAccessProtocol() {
    return accessProtocol;
  }

  public void setAccessProtocol(String accessProtocol) {
    this.accessProtocol = accessProtocol;
  }

  public CloudAccessConfigForCreateDomainInput defenceMode(Integer defenceMode) {
    this.defenceMode = defenceMode;
    return this;
  }

   /**
   * Get defenceMode
   * @return defenceMode
  **/
  @Schema(description = "")
  public Integer getDefenceMode() {
    return defenceMode;
  }

  public void setDefenceMode(Integer defenceMode) {
    this.defenceMode = defenceMode;
  }

  public CloudAccessConfigForCreateDomainInput instanceID(String instanceID) {
    this.instanceID = instanceID;
    return this;
  }

   /**
   * Get instanceID
   * @return instanceID
  **/
  @Schema(description = "")
  public String getInstanceID() {
    return instanceID;
  }

  public void setInstanceID(String instanceID) {
    this.instanceID = instanceID;
  }

  public CloudAccessConfigForCreateDomainInput instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * Get instanceName
   * @return instanceName
  **/
  @Schema(description = "")
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public CloudAccessConfigForCreateDomainInput listenerID(String listenerID) {
    this.listenerID = listenerID;
    return this;
  }

   /**
   * Get listenerID
   * @return listenerID
  **/
  @Schema(description = "")
  public String getListenerID() {
    return listenerID;
  }

  public void setListenerID(String listenerID) {
    this.listenerID = listenerID;
  }

  public CloudAccessConfigForCreateDomainInput lostAssociationFromALB(Integer lostAssociationFromALB) {
    this.lostAssociationFromALB = lostAssociationFromALB;
    return this;
  }

   /**
   * Get lostAssociationFromALB
   * @return lostAssociationFromALB
  **/
  @Schema(description = "")
  public Integer getLostAssociationFromALB() {
    return lostAssociationFromALB;
  }

  public void setLostAssociationFromALB(Integer lostAssociationFromALB) {
    this.lostAssociationFromALB = lostAssociationFromALB;
  }

  public CloudAccessConfigForCreateDomainInput port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public CloudAccessConfigForCreateDomainInput protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudAccessConfigForCreateDomainInput cloudAccessConfigForCreateDomainInput = (CloudAccessConfigForCreateDomainInput) o;
    return Objects.equals(this.accessProtocol, cloudAccessConfigForCreateDomainInput.accessProtocol) &&
        Objects.equals(this.defenceMode, cloudAccessConfigForCreateDomainInput.defenceMode) &&
        Objects.equals(this.instanceID, cloudAccessConfigForCreateDomainInput.instanceID) &&
        Objects.equals(this.instanceName, cloudAccessConfigForCreateDomainInput.instanceName) &&
        Objects.equals(this.listenerID, cloudAccessConfigForCreateDomainInput.listenerID) &&
        Objects.equals(this.lostAssociationFromALB, cloudAccessConfigForCreateDomainInput.lostAssociationFromALB) &&
        Objects.equals(this.port, cloudAccessConfigForCreateDomainInput.port) &&
        Objects.equals(this.protocol, cloudAccessConfigForCreateDomainInput.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessProtocol, defenceMode, instanceID, instanceName, listenerID, lostAssociationFromALB, port, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudAccessConfigForCreateDomainInput {\n");
    
    sb.append("    accessProtocol: ").append(toIndentedString(accessProtocol)).append("\n");
    sb.append("    defenceMode: ").append(toIndentedString(defenceMode)).append("\n");
    sb.append("    instanceID: ").append(toIndentedString(instanceID)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    listenerID: ").append(toIndentedString(listenerID)).append("\n");
    sb.append("    lostAssociationFromALB: ").append(toIndentedString(lostAssociationFromALB)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
