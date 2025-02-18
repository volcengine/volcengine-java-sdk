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
import com.volcengine.waf.model.AccurateForUpdateAllowRuleInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateAllowRuleRequest
 */



public class UpdateAllowRuleRequest {
  @SerializedName("Accurate")
  private AccurateForUpdateAllowRuleInput accurate = null;

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

  @SerializedName("Id")
  private Integer id = null;

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

  public UpdateAllowRuleRequest accurate(AccurateForUpdateAllowRuleInput accurate) {
    this.accurate = accurate;
    return this;
  }

   /**
   * Get accurate
   * @return accurate
  **/
  @Valid
  @Schema(description = "")
  public AccurateForUpdateAllowRuleInput getAccurate() {
    return accurate;
  }

  public void setAccurate(AccurateForUpdateAllowRuleInput accurate) {
    this.accurate = accurate;
  }

  public UpdateAllowRuleRequest advanced(Integer advanced) {
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

  public UpdateAllowRuleRequest clientIp(String clientIp) {
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

  public UpdateAllowRuleRequest description(String description) {
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

  public UpdateAllowRuleRequest enable(Integer enable) {
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

  public UpdateAllowRuleRequest host(String host) {
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

  public UpdateAllowRuleRequest id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UpdateAllowRuleRequest ipAddType(Integer ipAddType) {
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

  public UpdateAllowRuleRequest ipGroupId(List<Integer> ipGroupId) {
    this.ipGroupId = ipGroupId;
    return this;
  }

  public UpdateAllowRuleRequest addIpGroupIdItem(Integer ipGroupIdItem) {
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

  public UpdateAllowRuleRequest name(String name) {
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

  public UpdateAllowRuleRequest projectName(String projectName) {
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

  public UpdateAllowRuleRequest url(String url) {
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
    UpdateAllowRuleRequest updateAllowRuleRequest = (UpdateAllowRuleRequest) o;
    return Objects.equals(this.accurate, updateAllowRuleRequest.accurate) &&
        Objects.equals(this.advanced, updateAllowRuleRequest.advanced) &&
        Objects.equals(this.clientIp, updateAllowRuleRequest.clientIp) &&
        Objects.equals(this.description, updateAllowRuleRequest.description) &&
        Objects.equals(this.enable, updateAllowRuleRequest.enable) &&
        Objects.equals(this.host, updateAllowRuleRequest.host) &&
        Objects.equals(this.id, updateAllowRuleRequest.id) &&
        Objects.equals(this.ipAddType, updateAllowRuleRequest.ipAddType) &&
        Objects.equals(this.ipGroupId, updateAllowRuleRequest.ipGroupId) &&
        Objects.equals(this.name, updateAllowRuleRequest.name) &&
        Objects.equals(this.projectName, updateAllowRuleRequest.projectName) &&
        Objects.equals(this.url, updateAllowRuleRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accurate, advanced, clientIp, description, enable, host, id, ipAddType, ipGroupId, name, projectName, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAllowRuleRequest {\n");
    
    sb.append("    accurate: ").append(toIndentedString(accurate)).append("\n");
    sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
