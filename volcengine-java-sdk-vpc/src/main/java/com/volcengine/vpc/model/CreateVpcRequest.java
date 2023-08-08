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
import com.volcengine.vpc.model.TagForCreateVpcInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateVpcRequest
 */


public class CreateVpcRequest {
  @SerializedName("CidrBlock")
  private String cidrBlock = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DnsServers")
  private List<String> dnsServers = null;

  @SerializedName("EnableIpv6")
  private String enableIpv6 = null;

  @SerializedName("Ipv6CidrBlock")
  private String ipv6CidrBlock = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Tags")
  private List<TagForCreateVpcInput> tags = null;

  @SerializedName("VpcName")
  private String vpcName = null;

  public CreateVpcRequest cidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
    return this;
  }

   /**
   * Get cidrBlock
   * @return cidrBlock
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCidrBlock() {
    return cidrBlock;
  }

  public void setCidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
  }

  public CreateVpcRequest clientToken(String clientToken) {
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

  public CreateVpcRequest description(String description) {
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

  public CreateVpcRequest dnsServers(List<String> dnsServers) {
    this.dnsServers = dnsServers;
    return this;
  }

  public CreateVpcRequest addDnsServersItem(String dnsServersItem) {
    if (this.dnsServers == null) {
      this.dnsServers = new ArrayList<String>();
    }
    this.dnsServers.add(dnsServersItem);
    return this;
  }

   /**
   * Get dnsServers
   * @return dnsServers
  **/
  @Schema(description = "")
  public List<String> getDnsServers() {
    return dnsServers;
  }

  public void setDnsServers(List<String> dnsServers) {
    this.dnsServers = dnsServers;
  }

  public CreateVpcRequest enableIpv6(String enableIpv6) {
    this.enableIpv6 = enableIpv6;
    return this;
  }

   /**
   * Get enableIpv6
   * @return enableIpv6
  **/
  @Schema(description = "")
  public String getEnableIpv6() {
    return enableIpv6;
  }

  public void setEnableIpv6(String enableIpv6) {
    this.enableIpv6 = enableIpv6;
  }

  public CreateVpcRequest ipv6CidrBlock(String ipv6CidrBlock) {
    this.ipv6CidrBlock = ipv6CidrBlock;
    return this;
  }

   /**
   * Get ipv6CidrBlock
   * @return ipv6CidrBlock
  **/
  @Schema(description = "")
  public String getIpv6CidrBlock() {
    return ipv6CidrBlock;
  }

  public void setIpv6CidrBlock(String ipv6CidrBlock) {
    this.ipv6CidrBlock = ipv6CidrBlock;
  }

  public CreateVpcRequest projectName(String projectName) {
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

  public CreateVpcRequest tags(List<TagForCreateVpcInput> tags) {
    this.tags = tags;
    return this;
  }

  public CreateVpcRequest addTagsItem(TagForCreateVpcInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCreateVpcInput>();
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
  public List<TagForCreateVpcInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCreateVpcInput> tags) {
    this.tags = tags;
  }

  public CreateVpcRequest vpcName(String vpcName) {
    this.vpcName = vpcName;
    return this;
  }

   /**
   * Get vpcName
   * @return vpcName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getVpcName() {
    return vpcName;
  }

  public void setVpcName(String vpcName) {
    this.vpcName = vpcName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVpcRequest createVpcRequest = (CreateVpcRequest) o;
    return Objects.equals(this.cidrBlock, createVpcRequest.cidrBlock) &&
        Objects.equals(this.clientToken, createVpcRequest.clientToken) &&
        Objects.equals(this.description, createVpcRequest.description) &&
        Objects.equals(this.dnsServers, createVpcRequest.dnsServers) &&
        Objects.equals(this.enableIpv6, createVpcRequest.enableIpv6) &&
        Objects.equals(this.ipv6CidrBlock, createVpcRequest.ipv6CidrBlock) &&
        Objects.equals(this.projectName, createVpcRequest.projectName) &&
        Objects.equals(this.tags, createVpcRequest.tags) &&
        Objects.equals(this.vpcName, createVpcRequest.vpcName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrBlock, clientToken, description, dnsServers, enableIpv6, ipv6CidrBlock, projectName, tags, vpcName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVpcRequest {\n");
    
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
    sb.append("    enableIpv6: ").append(toIndentedString(enableIpv6)).append("\n");
    sb.append("    ipv6CidrBlock: ").append(toIndentedString(ipv6CidrBlock)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
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
