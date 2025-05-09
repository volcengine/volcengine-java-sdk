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
import com.volcengine.waf.model.AccurateForCreateAllowRuleInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateAllowRuleRequest
 */



public class CreateAllowRuleRequest {
  @SerializedName("Accurate")
  private AccurateForCreateAllowRuleInput accurate = null;

  @SerializedName("Advanced")
  private Integer advanced = null;

  @SerializedName("ClientIp")
  private String clientIp = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Enable")
  private Integer enable = null;

  @SerializedName("Host")
  private String host = null;

  @SerializedName("IpAddType")
  private Integer ipAddType = null;

  @SerializedName("IpGroupId")
  private List<Integer> ipGroupId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Url")
  private String url = null;

  public CreateAllowRuleRequest accurate(AccurateForCreateAllowRuleInput accurate) {
    this.accurate = accurate;
    return this;
  }

   /**
   * Get accurate
   * @return accurate
  **/
  @Valid
  @Schema(description = "")
  public AccurateForCreateAllowRuleInput getAccurate() {
    return accurate;
  }

  public void setAccurate(AccurateForCreateAllowRuleInput accurate) {
    this.accurate = accurate;
  }

  public CreateAllowRuleRequest advanced(Integer advanced) {
    this.advanced = advanced;
    return this;
  }

   /**
   * Get advanced
   * @return advanced
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getAdvanced() {
    return advanced;
  }

  public void setAdvanced(Integer advanced) {
    this.advanced = advanced;
  }

  public CreateAllowRuleRequest clientIp(String clientIp) {
    this.clientIp = clientIp;
    return this;
  }

   /**
   * Get clientIp
   * @return clientIp
  **/
  @Schema(description = "")
  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  public CreateAllowRuleRequest description(String description) {
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

  public CreateAllowRuleRequest enable(Integer enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Schema(description = "")
  public Integer getEnable() {
    return enable;
  }

  public void setEnable(Integer enable) {
    this.enable = enable;
  }

  public CreateAllowRuleRequest host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public CreateAllowRuleRequest ipAddType(Integer ipAddType) {
    this.ipAddType = ipAddType;
    return this;
  }

   /**
   * Get ipAddType
   * @return ipAddType
  **/
  @Schema(description = "")
  public Integer getIpAddType() {
    return ipAddType;
  }

  public void setIpAddType(Integer ipAddType) {
    this.ipAddType = ipAddType;
  }

  public CreateAllowRuleRequest ipGroupId(List<Integer> ipGroupId) {
    this.ipGroupId = ipGroupId;
    return this;
  }

  public CreateAllowRuleRequest addIpGroupIdItem(Integer ipGroupIdItem) {
    if (this.ipGroupId == null) {
      this.ipGroupId = new ArrayList<Integer>();
    }
    this.ipGroupId.add(ipGroupIdItem);
    return this;
  }

   /**
   * Get ipGroupId
   * @return ipGroupId
  **/
  @Schema(description = "")
  public List<Integer> getIpGroupId() {
    return ipGroupId;
  }

  public void setIpGroupId(List<Integer> ipGroupId) {
    this.ipGroupId = ipGroupId;
  }

  public CreateAllowRuleRequest name(String name) {
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

  public CreateAllowRuleRequest projectName(String projectName) {
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

  public CreateAllowRuleRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAllowRuleRequest createAllowRuleRequest = (CreateAllowRuleRequest) o;
    return Objects.equals(this.accurate, createAllowRuleRequest.accurate) &&
        Objects.equals(this.advanced, createAllowRuleRequest.advanced) &&
        Objects.equals(this.clientIp, createAllowRuleRequest.clientIp) &&
        Objects.equals(this.description, createAllowRuleRequest.description) &&
        Objects.equals(this.enable, createAllowRuleRequest.enable) &&
        Objects.equals(this.host, createAllowRuleRequest.host) &&
        Objects.equals(this.ipAddType, createAllowRuleRequest.ipAddType) &&
        Objects.equals(this.ipGroupId, createAllowRuleRequest.ipGroupId) &&
        Objects.equals(this.name, createAllowRuleRequest.name) &&
        Objects.equals(this.projectName, createAllowRuleRequest.projectName) &&
        Objects.equals(this.url, createAllowRuleRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accurate, advanced, clientIp, description, enable, host, ipAddType, ipGroupId, name, projectName, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAllowRuleRequest {\n");
    
    sb.append("    accurate: ").append(toIndentedString(accurate)).append("\n");
    sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    ipAddType: ").append(toIndentedString(ipAddType)).append("\n");
    sb.append("    ipGroupId: ").append(toIndentedString(ipGroupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
