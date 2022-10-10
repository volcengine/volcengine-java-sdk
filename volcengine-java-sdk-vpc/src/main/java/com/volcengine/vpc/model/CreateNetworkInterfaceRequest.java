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
import com.volcengine.vpc.model.TagForCreateNetworkInterfaceInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateNetworkInterfaceRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-10T12:08:25.743848+08:00[Asia/Shanghai]")
public class CreateNetworkInterfaceRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("NetworkInterfaceName")
  private String networkInterfaceName = null;

  @SerializedName("PortSecurityEnabled")
  private Boolean portSecurityEnabled = null;

  @SerializedName("PrimaryIpAddress")
  private String primaryIpAddress = null;

  @SerializedName("PrivateIpAddress")
  private List<String> privateIpAddress = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("SecondaryPrivateIpAddressCount")
  private Integer secondaryPrivateIpAddressCount = null;

  @SerializedName("SecurityGroupIds")
  private List<String> securityGroupIds = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("Tags")
  private List<TagForCreateNetworkInterfaceInput> tags = null;

  public CreateNetworkInterfaceRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public CreateNetworkInterfaceRequest description(String description) {
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

  public CreateNetworkInterfaceRequest networkInterfaceName(String networkInterfaceName) {
    this.networkInterfaceName = networkInterfaceName;
    return this;
  }

   /**
   * Get networkInterfaceName
   * @return networkInterfaceName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getNetworkInterfaceName() {
    return networkInterfaceName;
  }

  public void setNetworkInterfaceName(String networkInterfaceName) {
    this.networkInterfaceName = networkInterfaceName;
  }

  public CreateNetworkInterfaceRequest portSecurityEnabled(Boolean portSecurityEnabled) {
    this.portSecurityEnabled = portSecurityEnabled;
    return this;
  }

   /**
   * Get portSecurityEnabled
   * @return portSecurityEnabled
  **/
  @Schema(description = "")
  public Boolean isPortSecurityEnabled() {
    return portSecurityEnabled;
  }

  public void setPortSecurityEnabled(Boolean portSecurityEnabled) {
    this.portSecurityEnabled = portSecurityEnabled;
  }

  public CreateNetworkInterfaceRequest primaryIpAddress(String primaryIpAddress) {
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

  public CreateNetworkInterfaceRequest privateIpAddress(List<String> privateIpAddress) {
    this.privateIpAddress = privateIpAddress;
    return this;
  }

  public CreateNetworkInterfaceRequest addPrivateIpAddressItem(String privateIpAddressItem) {
    if (this.privateIpAddress == null) {
      this.privateIpAddress = new ArrayList<String>();
    }
    this.privateIpAddress.add(privateIpAddressItem);
    return this;
  }

   /**
   * Get privateIpAddress
   * @return privateIpAddress
  **/
  @Schema(description = "")
  public List<String> getPrivateIpAddress() {
    return privateIpAddress;
  }

  public void setPrivateIpAddress(List<String> privateIpAddress) {
    this.privateIpAddress = privateIpAddress;
  }

  public CreateNetworkInterfaceRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public CreateNetworkInterfaceRequest secondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
    this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
    return this;
  }

   /**
   * Get secondaryPrivateIpAddressCount
   * @return secondaryPrivateIpAddressCount
  **/
  @Schema(description = "")
  public Integer getSecondaryPrivateIpAddressCount() {
    return secondaryPrivateIpAddressCount;
  }

  public void setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
    this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
  }

  public CreateNetworkInterfaceRequest securityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public CreateNetworkInterfaceRequest addSecurityGroupIdsItem(String securityGroupIdsItem) {
    if (this.securityGroupIds == null) {
      this.securityGroupIds = new ArrayList<String>();
    }
    this.securityGroupIds.add(securityGroupIdsItem);
    return this;
  }

   /**
   * Get securityGroupIds
   * @return securityGroupIds
  **/
  @Schema(description = "")
  public List<String> getSecurityGroupIds() {
    return securityGroupIds;
  }

  public void setSecurityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
  }

  public CreateNetworkInterfaceRequest subnetId(String subnetId) {
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

  public CreateNetworkInterfaceRequest tags(List<TagForCreateNetworkInterfaceInput> tags) {
    this.tags = tags;
    return this;
  }

  public CreateNetworkInterfaceRequest addTagsItem(TagForCreateNetworkInterfaceInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCreateNetworkInterfaceInput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForCreateNetworkInterfaceInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCreateNetworkInterfaceInput> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateNetworkInterfaceRequest createNetworkInterfaceRequest = (CreateNetworkInterfaceRequest) o;
    return Objects.equals(this.clientToken, createNetworkInterfaceRequest.clientToken) &&
        Objects.equals(this.description, createNetworkInterfaceRequest.description) &&
        Objects.equals(this.networkInterfaceName, createNetworkInterfaceRequest.networkInterfaceName) &&
        Objects.equals(this.portSecurityEnabled, createNetworkInterfaceRequest.portSecurityEnabled) &&
        Objects.equals(this.primaryIpAddress, createNetworkInterfaceRequest.primaryIpAddress) &&
        Objects.equals(this.privateIpAddress, createNetworkInterfaceRequest.privateIpAddress) &&
        Objects.equals(this.projectName, createNetworkInterfaceRequest.projectName) &&
        Objects.equals(this.secondaryPrivateIpAddressCount, createNetworkInterfaceRequest.secondaryPrivateIpAddressCount) &&
        Objects.equals(this.securityGroupIds, createNetworkInterfaceRequest.securityGroupIds) &&
        Objects.equals(this.subnetId, createNetworkInterfaceRequest.subnetId) &&
        Objects.equals(this.tags, createNetworkInterfaceRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, description, networkInterfaceName, portSecurityEnabled, primaryIpAddress, privateIpAddress, projectName, secondaryPrivateIpAddressCount, securityGroupIds, subnetId, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateNetworkInterfaceRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    networkInterfaceName: ").append(toIndentedString(networkInterfaceName)).append("\n");
    sb.append("    portSecurityEnabled: ").append(toIndentedString(portSecurityEnabled)).append("\n");
    sb.append("    primaryIpAddress: ").append(toIndentedString(primaryIpAddress)).append("\n");
    sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    secondaryPrivateIpAddressCount: ").append(toIndentedString(secondaryPrivateIpAddressCount)).append("\n");
    sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
