/*
 * vmp
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vmp.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vmp.model.TagForListWorkspacesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ItemForListWorkspacesOutput
 */



public class ItemForListWorkspacesOutput {
  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("DeleteProtectionEnabled")
  private Boolean deleteProtectionEnabled = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("InstanceTypeId")
  private String instanceTypeId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("OverdueReclaimTime")
  private String overdueReclaimTime = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("PrometheusQueryIntranetEndpoint")
  private String prometheusQueryIntranetEndpoint = null;

  @SerializedName("PrometheusWriteIntranetEndpoint")
  private String prometheusWriteIntranetEndpoint = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForListWorkspacesOutput> tags = null;

  @SerializedName("Username")
  private String username = null;

  public ItemForListWorkspacesOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public ItemForListWorkspacesOutput deleteProtectionEnabled(Boolean deleteProtectionEnabled) {
    this.deleteProtectionEnabled = deleteProtectionEnabled;
    return this;
  }

   /**
   * Get deleteProtectionEnabled
   * @return deleteProtectionEnabled
  **/
  @Schema(description = "")
  public Boolean isDeleteProtectionEnabled() {
    return deleteProtectionEnabled;
  }

  public void setDeleteProtectionEnabled(Boolean deleteProtectionEnabled) {
    this.deleteProtectionEnabled = deleteProtectionEnabled;
  }

  public ItemForListWorkspacesOutput description(String description) {
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

  public ItemForListWorkspacesOutput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ItemForListWorkspacesOutput instanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
    return this;
  }

   /**
   * Get instanceTypeId
   * @return instanceTypeId
  **/
  @Schema(description = "")
  public String getInstanceTypeId() {
    return instanceTypeId;
  }

  public void setInstanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
  }

  public ItemForListWorkspacesOutput name(String name) {
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

  public ItemForListWorkspacesOutput overdueReclaimTime(String overdueReclaimTime) {
    this.overdueReclaimTime = overdueReclaimTime;
    return this;
  }

   /**
   * Get overdueReclaimTime
   * @return overdueReclaimTime
  **/
  @Schema(description = "")
  public String getOverdueReclaimTime() {
    return overdueReclaimTime;
  }

  public void setOverdueReclaimTime(String overdueReclaimTime) {
    this.overdueReclaimTime = overdueReclaimTime;
  }

  public ItemForListWorkspacesOutput projectName(String projectName) {
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

  public ItemForListWorkspacesOutput prometheusQueryIntranetEndpoint(String prometheusQueryIntranetEndpoint) {
    this.prometheusQueryIntranetEndpoint = prometheusQueryIntranetEndpoint;
    return this;
  }

   /**
   * Get prometheusQueryIntranetEndpoint
   * @return prometheusQueryIntranetEndpoint
  **/
  @Schema(description = "")
  public String getPrometheusQueryIntranetEndpoint() {
    return prometheusQueryIntranetEndpoint;
  }

  public void setPrometheusQueryIntranetEndpoint(String prometheusQueryIntranetEndpoint) {
    this.prometheusQueryIntranetEndpoint = prometheusQueryIntranetEndpoint;
  }

  public ItemForListWorkspacesOutput prometheusWriteIntranetEndpoint(String prometheusWriteIntranetEndpoint) {
    this.prometheusWriteIntranetEndpoint = prometheusWriteIntranetEndpoint;
    return this;
  }

   /**
   * Get prometheusWriteIntranetEndpoint
   * @return prometheusWriteIntranetEndpoint
  **/
  @Schema(description = "")
  public String getPrometheusWriteIntranetEndpoint() {
    return prometheusWriteIntranetEndpoint;
  }

  public void setPrometheusWriteIntranetEndpoint(String prometheusWriteIntranetEndpoint) {
    this.prometheusWriteIntranetEndpoint = prometheusWriteIntranetEndpoint;
  }

  public ItemForListWorkspacesOutput status(String status) {
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

  public ItemForListWorkspacesOutput tags(List<TagForListWorkspacesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public ItemForListWorkspacesOutput addTagsItem(TagForListWorkspacesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForListWorkspacesOutput>();
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
  public List<TagForListWorkspacesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForListWorkspacesOutput> tags) {
    this.tags = tags;
  }

  public ItemForListWorkspacesOutput username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemForListWorkspacesOutput itemForListWorkspacesOutput = (ItemForListWorkspacesOutput) o;
    return Objects.equals(this.createTime, itemForListWorkspacesOutput.createTime) &&
        Objects.equals(this.deleteProtectionEnabled, itemForListWorkspacesOutput.deleteProtectionEnabled) &&
        Objects.equals(this.description, itemForListWorkspacesOutput.description) &&
        Objects.equals(this.id, itemForListWorkspacesOutput.id) &&
        Objects.equals(this.instanceTypeId, itemForListWorkspacesOutput.instanceTypeId) &&
        Objects.equals(this.name, itemForListWorkspacesOutput.name) &&
        Objects.equals(this.overdueReclaimTime, itemForListWorkspacesOutput.overdueReclaimTime) &&
        Objects.equals(this.projectName, itemForListWorkspacesOutput.projectName) &&
        Objects.equals(this.prometheusQueryIntranetEndpoint, itemForListWorkspacesOutput.prometheusQueryIntranetEndpoint) &&
        Objects.equals(this.prometheusWriteIntranetEndpoint, itemForListWorkspacesOutput.prometheusWriteIntranetEndpoint) &&
        Objects.equals(this.status, itemForListWorkspacesOutput.status) &&
        Objects.equals(this.tags, itemForListWorkspacesOutput.tags) &&
        Objects.equals(this.username, itemForListWorkspacesOutput.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, deleteProtectionEnabled, description, id, instanceTypeId, name, overdueReclaimTime, projectName, prometheusQueryIntranetEndpoint, prometheusWriteIntranetEndpoint, status, tags, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemForListWorkspacesOutput {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    deleteProtectionEnabled: ").append(toIndentedString(deleteProtectionEnabled)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceTypeId: ").append(toIndentedString(instanceTypeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overdueReclaimTime: ").append(toIndentedString(overdueReclaimTime)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    prometheusQueryIntranetEndpoint: ").append(toIndentedString(prometheusQueryIntranetEndpoint)).append("\n");
    sb.append("    prometheusWriteIntranetEndpoint: ").append(toIndentedString(prometheusWriteIntranetEndpoint)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
