/*
 * privatelink
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.privatelink.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.privatelink.model.TagForDescribeVpcEndpointAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * EndpointForDescribeVpcEndpointAttributesOutput
 */



public class EndpointForDescribeVpcEndpointAttributesOutput {
  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("ConnectionStatus")
  private String connectionStatus = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("EndpointDomain")
  private String endpointDomain = null;

  @SerializedName("EndpointId")
  private String endpointId = null;

  @SerializedName("EndpointIndex")
  private Integer endpointIndex = null;

  @SerializedName("EndpointName")
  private String endpointName = null;

  @SerializedName("EndpointType")
  private String endpointType = null;

  @SerializedName("IpAddressVersions")
  private List<String> ipAddressVersions = null;

  @SerializedName("Payer")
  private String payer = null;

  @SerializedName("PrivateDNSEnabled")
  private Boolean privateDNSEnabled = null;

  @SerializedName("PrivateDNSName")
  private String privateDNSName = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("ServiceId")
  private String serviceId = null;

  @SerializedName("ServiceManaged")
  private Boolean serviceManaged = null;

  @SerializedName("ServiceName")
  private String serviceName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeVpcEndpointAttributesOutput> tags = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public EndpointForDescribeVpcEndpointAttributesOutput businessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
    return this;
  }

   /**
   * Get businessStatus
   * @return businessStatus
  **/
  @Schema(description = "")
  public String getBusinessStatus() {
    return businessStatus;
  }

  public void setBusinessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput connectionStatus(String connectionStatus) {
    this.connectionStatus = connectionStatus;
    return this;
  }

   /**
   * Get connectionStatus
   * @return connectionStatus
  **/
  @Schema(description = "")
  public String getConnectionStatus() {
    return connectionStatus;
  }

  public void setConnectionStatus(String connectionStatus) {
    this.connectionStatus = connectionStatus;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput deletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
    return this;
  }

   /**
   * Get deletedTime
   * @return deletedTime
  **/
  @Schema(description = "")
  public String getDeletedTime() {
    return deletedTime;
  }

  public void setDeletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput endpointDomain(String endpointDomain) {
    this.endpointDomain = endpointDomain;
    return this;
  }

   /**
   * Get endpointDomain
   * @return endpointDomain
  **/
  @Schema(description = "")
  public String getEndpointDomain() {
    return endpointDomain;
  }

  public void setEndpointDomain(String endpointDomain) {
    this.endpointDomain = endpointDomain;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput endpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

   /**
   * Get endpointId
   * @return endpointId
  **/
  @Schema(description = "")
  public String getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput endpointIndex(Integer endpointIndex) {
    this.endpointIndex = endpointIndex;
    return this;
  }

   /**
   * Get endpointIndex
   * @return endpointIndex
  **/
  @Schema(description = "")
  public Integer getEndpointIndex() {
    return endpointIndex;
  }

  public void setEndpointIndex(Integer endpointIndex) {
    this.endpointIndex = endpointIndex;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * Get endpointName
   * @return endpointName
  **/
  @Schema(description = "")
  public String getEndpointName() {
    return endpointName;
  }

  public void setEndpointName(String endpointName) {
    this.endpointName = endpointName;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput endpointType(String endpointType) {
    this.endpointType = endpointType;
    return this;
  }

   /**
   * Get endpointType
   * @return endpointType
  **/
  @Schema(description = "")
  public String getEndpointType() {
    return endpointType;
  }

  public void setEndpointType(String endpointType) {
    this.endpointType = endpointType;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput ipAddressVersions(List<String> ipAddressVersions) {
    this.ipAddressVersions = ipAddressVersions;
    return this;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput addIpAddressVersionsItem(String ipAddressVersionsItem) {
    if (this.ipAddressVersions == null) {
      this.ipAddressVersions = new ArrayList<String>();
    }
    this.ipAddressVersions.add(ipAddressVersionsItem);
    return this;
  }

   /**
   * Get ipAddressVersions
   * @return ipAddressVersions
  **/
  @Schema(description = "")
  public List<String> getIpAddressVersions() {
    return ipAddressVersions;
  }

  public void setIpAddressVersions(List<String> ipAddressVersions) {
    this.ipAddressVersions = ipAddressVersions;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput payer(String payer) {
    this.payer = payer;
    return this;
  }

   /**
   * Get payer
   * @return payer
  **/
  @Schema(description = "")
  public String getPayer() {
    return payer;
  }

  public void setPayer(String payer) {
    this.payer = payer;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput privateDNSEnabled(Boolean privateDNSEnabled) {
    this.privateDNSEnabled = privateDNSEnabled;
    return this;
  }

   /**
   * Get privateDNSEnabled
   * @return privateDNSEnabled
  **/
  @Schema(description = "")
  public Boolean isPrivateDNSEnabled() {
    return privateDNSEnabled;
  }

  public void setPrivateDNSEnabled(Boolean privateDNSEnabled) {
    this.privateDNSEnabled = privateDNSEnabled;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput privateDNSName(String privateDNSName) {
    this.privateDNSName = privateDNSName;
    return this;
  }

   /**
   * Get privateDNSName
   * @return privateDNSName
  **/
  @Schema(description = "")
  public String getPrivateDNSName() {
    return privateDNSName;
  }

  public void setPrivateDNSName(String privateDNSName) {
    this.privateDNSName = privateDNSName;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput projectName(String projectName) {
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

  public EndpointForDescribeVpcEndpointAttributesOutput serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @Schema(description = "")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput serviceManaged(Boolean serviceManaged) {
    this.serviceManaged = serviceManaged;
    return this;
  }

   /**
   * Get serviceManaged
   * @return serviceManaged
  **/
  @Schema(description = "")
  public Boolean isServiceManaged() {
    return serviceManaged;
  }

  public void setServiceManaged(Boolean serviceManaged) {
    this.serviceManaged = serviceManaged;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @Schema(description = "")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput tags(List<TagForDescribeVpcEndpointAttributesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput addTagsItem(TagForDescribeVpcEndpointAttributesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeVpcEndpointAttributesOutput>();
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
  public List<TagForDescribeVpcEndpointAttributesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeVpcEndpointAttributesOutput> tags) {
    this.tags = tags;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public EndpointForDescribeVpcEndpointAttributesOutput vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointForDescribeVpcEndpointAttributesOutput endpointForDescribeVpcEndpointAttributesOutput = (EndpointForDescribeVpcEndpointAttributesOutput) o;
    return Objects.equals(this.businessStatus, endpointForDescribeVpcEndpointAttributesOutput.businessStatus) &&
        Objects.equals(this.connectionStatus, endpointForDescribeVpcEndpointAttributesOutput.connectionStatus) &&
        Objects.equals(this.creationTime, endpointForDescribeVpcEndpointAttributesOutput.creationTime) &&
        Objects.equals(this.deletedTime, endpointForDescribeVpcEndpointAttributesOutput.deletedTime) &&
        Objects.equals(this.description, endpointForDescribeVpcEndpointAttributesOutput.description) &&
        Objects.equals(this.endpointDomain, endpointForDescribeVpcEndpointAttributesOutput.endpointDomain) &&
        Objects.equals(this.endpointId, endpointForDescribeVpcEndpointAttributesOutput.endpointId) &&
        Objects.equals(this.endpointIndex, endpointForDescribeVpcEndpointAttributesOutput.endpointIndex) &&
        Objects.equals(this.endpointName, endpointForDescribeVpcEndpointAttributesOutput.endpointName) &&
        Objects.equals(this.endpointType, endpointForDescribeVpcEndpointAttributesOutput.endpointType) &&
        Objects.equals(this.ipAddressVersions, endpointForDescribeVpcEndpointAttributesOutput.ipAddressVersions) &&
        Objects.equals(this.payer, endpointForDescribeVpcEndpointAttributesOutput.payer) &&
        Objects.equals(this.privateDNSEnabled, endpointForDescribeVpcEndpointAttributesOutput.privateDNSEnabled) &&
        Objects.equals(this.privateDNSName, endpointForDescribeVpcEndpointAttributesOutput.privateDNSName) &&
        Objects.equals(this.projectName, endpointForDescribeVpcEndpointAttributesOutput.projectName) &&
        Objects.equals(this.serviceId, endpointForDescribeVpcEndpointAttributesOutput.serviceId) &&
        Objects.equals(this.serviceManaged, endpointForDescribeVpcEndpointAttributesOutput.serviceManaged) &&
        Objects.equals(this.serviceName, endpointForDescribeVpcEndpointAttributesOutput.serviceName) &&
        Objects.equals(this.status, endpointForDescribeVpcEndpointAttributesOutput.status) &&
        Objects.equals(this.tags, endpointForDescribeVpcEndpointAttributesOutput.tags) &&
        Objects.equals(this.updateTime, endpointForDescribeVpcEndpointAttributesOutput.updateTime) &&
        Objects.equals(this.vpcId, endpointForDescribeVpcEndpointAttributesOutput.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessStatus, connectionStatus, creationTime, deletedTime, description, endpointDomain, endpointId, endpointIndex, endpointName, endpointType, ipAddressVersions, payer, privateDNSEnabled, privateDNSName, projectName, serviceId, serviceManaged, serviceName, status, tags, updateTime, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointForDescribeVpcEndpointAttributesOutput {\n");
    
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endpointDomain: ").append(toIndentedString(endpointDomain)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    endpointIndex: ").append(toIndentedString(endpointIndex)).append("\n");
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    ipAddressVersions: ").append(toIndentedString(ipAddressVersions)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    privateDNSEnabled: ").append(toIndentedString(privateDNSEnabled)).append("\n");
    sb.append("    privateDNSName: ").append(toIndentedString(privateDNSName)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceManaged: ").append(toIndentedString(serviceManaged)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
