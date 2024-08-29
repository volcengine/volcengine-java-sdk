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
import com.volcengine.privatelink.model.EndpointForDescribeVpcEndpointAttributesOutput;
import com.volcengine.privatelink.model.TagForDescribeVpcEndpointAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeVpcEndpointAttributesResponse
 */



public class DescribeVpcEndpointAttributesResponse extends com.volcengine.model.AbstractResponse {
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

  @SerializedName("Endpoint")
  private EndpointForDescribeVpcEndpointAttributesOutput endpoint = null;

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

  @SerializedName("IpAddressVersions.N")
  private List<String> ipAddressVersionsN = null;

  @SerializedName("Payer")
  private String payer = null;

  @SerializedName("PrivateDNSEnabled")
  private Boolean privateDNSEnabled = null;

  @SerializedName("PrivateDNSName")
  private String privateDNSName = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("ServiceId")
  private String serviceId = null;

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

  public DescribeVpcEndpointAttributesResponse businessStatus(String businessStatus) {
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

  public DescribeVpcEndpointAttributesResponse connectionStatus(String connectionStatus) {
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

  public DescribeVpcEndpointAttributesResponse creationTime(String creationTime) {
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

  public DescribeVpcEndpointAttributesResponse deletedTime(String deletedTime) {
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

  public DescribeVpcEndpointAttributesResponse description(String description) {
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

  public DescribeVpcEndpointAttributesResponse endpoint(EndpointForDescribeVpcEndpointAttributesOutput endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @Valid
  @Schema(description = "")
  public EndpointForDescribeVpcEndpointAttributesOutput getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(EndpointForDescribeVpcEndpointAttributesOutput endpoint) {
    this.endpoint = endpoint;
  }

  public DescribeVpcEndpointAttributesResponse endpointDomain(String endpointDomain) {
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

  public DescribeVpcEndpointAttributesResponse endpointId(String endpointId) {
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

  public DescribeVpcEndpointAttributesResponse endpointIndex(Integer endpointIndex) {
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

  public DescribeVpcEndpointAttributesResponse endpointName(String endpointName) {
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

  public DescribeVpcEndpointAttributesResponse endpointType(String endpointType) {
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

  public DescribeVpcEndpointAttributesResponse ipAddressVersions(List<String> ipAddressVersions) {
    this.ipAddressVersions = ipAddressVersions;
    return this;
  }

  public DescribeVpcEndpointAttributesResponse addIpAddressVersionsItem(String ipAddressVersionsItem) {
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

  public DescribeVpcEndpointAttributesResponse ipAddressVersionsN(List<String> ipAddressVersionsN) {
    this.ipAddressVersionsN = ipAddressVersionsN;
    return this;
  }

  public DescribeVpcEndpointAttributesResponse addIpAddressVersionsNItem(String ipAddressVersionsNItem) {
    if (this.ipAddressVersionsN == null) {
      this.ipAddressVersionsN = new ArrayList<String>();
    }
    this.ipAddressVersionsN.add(ipAddressVersionsNItem);
    return this;
  }

   /**
   * Get ipAddressVersionsN
   * @return ipAddressVersionsN
  **/
  @Schema(description = "")
  public List<String> getIpAddressVersionsN() {
    return ipAddressVersionsN;
  }

  public void setIpAddressVersionsN(List<String> ipAddressVersionsN) {
    this.ipAddressVersionsN = ipAddressVersionsN;
  }

  public DescribeVpcEndpointAttributesResponse payer(String payer) {
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

  public DescribeVpcEndpointAttributesResponse privateDNSEnabled(Boolean privateDNSEnabled) {
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

  public DescribeVpcEndpointAttributesResponse privateDNSName(String privateDNSName) {
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

  public DescribeVpcEndpointAttributesResponse projectName(String projectName) {
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

  public DescribeVpcEndpointAttributesResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DescribeVpcEndpointAttributesResponse serviceId(String serviceId) {
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

  public DescribeVpcEndpointAttributesResponse serviceName(String serviceName) {
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

  public DescribeVpcEndpointAttributesResponse status(String status) {
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

  public DescribeVpcEndpointAttributesResponse tags(List<TagForDescribeVpcEndpointAttributesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public DescribeVpcEndpointAttributesResponse addTagsItem(TagForDescribeVpcEndpointAttributesOutput tagsItem) {
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

  public DescribeVpcEndpointAttributesResponse updateTime(String updateTime) {
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

  public DescribeVpcEndpointAttributesResponse vpcId(String vpcId) {
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
    DescribeVpcEndpointAttributesResponse describeVpcEndpointAttributesResponse = (DescribeVpcEndpointAttributesResponse) o;
    return Objects.equals(this.businessStatus, describeVpcEndpointAttributesResponse.businessStatus) &&
        Objects.equals(this.connectionStatus, describeVpcEndpointAttributesResponse.connectionStatus) &&
        Objects.equals(this.creationTime, describeVpcEndpointAttributesResponse.creationTime) &&
        Objects.equals(this.deletedTime, describeVpcEndpointAttributesResponse.deletedTime) &&
        Objects.equals(this.description, describeVpcEndpointAttributesResponse.description) &&
        Objects.equals(this.endpoint, describeVpcEndpointAttributesResponse.endpoint) &&
        Objects.equals(this.endpointDomain, describeVpcEndpointAttributesResponse.endpointDomain) &&
        Objects.equals(this.endpointId, describeVpcEndpointAttributesResponse.endpointId) &&
        Objects.equals(this.endpointIndex, describeVpcEndpointAttributesResponse.endpointIndex) &&
        Objects.equals(this.endpointName, describeVpcEndpointAttributesResponse.endpointName) &&
        Objects.equals(this.endpointType, describeVpcEndpointAttributesResponse.endpointType) &&
        Objects.equals(this.ipAddressVersions, describeVpcEndpointAttributesResponse.ipAddressVersions) &&
        Objects.equals(this.ipAddressVersionsN, describeVpcEndpointAttributesResponse.ipAddressVersionsN) &&
        Objects.equals(this.payer, describeVpcEndpointAttributesResponse.payer) &&
        Objects.equals(this.privateDNSEnabled, describeVpcEndpointAttributesResponse.privateDNSEnabled) &&
        Objects.equals(this.privateDNSName, describeVpcEndpointAttributesResponse.privateDNSName) &&
        Objects.equals(this.projectName, describeVpcEndpointAttributesResponse.projectName) &&
        Objects.equals(this.requestId, describeVpcEndpointAttributesResponse.requestId) &&
        Objects.equals(this.serviceId, describeVpcEndpointAttributesResponse.serviceId) &&
        Objects.equals(this.serviceName, describeVpcEndpointAttributesResponse.serviceName) &&
        Objects.equals(this.status, describeVpcEndpointAttributesResponse.status) &&
        Objects.equals(this.tags, describeVpcEndpointAttributesResponse.tags) &&
        Objects.equals(this.updateTime, describeVpcEndpointAttributesResponse.updateTime) &&
        Objects.equals(this.vpcId, describeVpcEndpointAttributesResponse.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessStatus, connectionStatus, creationTime, deletedTime, description, endpoint, endpointDomain, endpointId, endpointIndex, endpointName, endpointType, ipAddressVersions, ipAddressVersionsN, payer, privateDNSEnabled, privateDNSName, projectName, requestId, serviceId, serviceName, status, tags, updateTime, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVpcEndpointAttributesResponse {\n");
    
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    endpointDomain: ").append(toIndentedString(endpointDomain)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    endpointIndex: ").append(toIndentedString(endpointIndex)).append("\n");
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    ipAddressVersions: ").append(toIndentedString(ipAddressVersions)).append("\n");
    sb.append("    ipAddressVersionsN: ").append(toIndentedString(ipAddressVersionsN)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    privateDNSEnabled: ").append(toIndentedString(privateDNSEnabled)).append("\n");
    sb.append("    privateDNSName: ").append(toIndentedString(privateDNSName)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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
