/*
 * bio
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.bio.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ClonePublicWorkspaceRequest
 */



public class ClonePublicWorkspaceRequest {
  @SerializedName("CoverPath")
  private String coverPath = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Labels")
  private List<String> labels = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("WorkspaceID")
  private String workspaceID = null;

  public ClonePublicWorkspaceRequest coverPath(String coverPath) {
    this.coverPath = coverPath;
    return this;
  }

   /**
   * Get coverPath
   * @return coverPath
  **/
  @Schema(description = "")
  public String getCoverPath() {
    return coverPath;
  }

  public void setCoverPath(String coverPath) {
    this.coverPath = coverPath;
  }

  public ClonePublicWorkspaceRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @NotNull
 @Size(min=1,max=1000)  @Schema(required = true, description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ClonePublicWorkspaceRequest labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public ClonePublicWorkspaceRequest addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<String>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @Schema(description = "")
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public ClonePublicWorkspaceRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @NotNull
 @Size(min=1,max=200)  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClonePublicWorkspaceRequest workspaceID(String workspaceID) {
    this.workspaceID = workspaceID;
    return this;
  }

   /**
   * Get workspaceID
   * @return workspaceID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getWorkspaceID() {
    return workspaceID;
  }

  public void setWorkspaceID(String workspaceID) {
    this.workspaceID = workspaceID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClonePublicWorkspaceRequest clonePublicWorkspaceRequest = (ClonePublicWorkspaceRequest) o;
    return Objects.equals(this.coverPath, clonePublicWorkspaceRequest.coverPath) &&
        Objects.equals(this.description, clonePublicWorkspaceRequest.description) &&
        Objects.equals(this.labels, clonePublicWorkspaceRequest.labels) &&
        Objects.equals(this.name, clonePublicWorkspaceRequest.name) &&
        Objects.equals(this.workspaceID, clonePublicWorkspaceRequest.workspaceID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverPath, description, labels, name, workspaceID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClonePublicWorkspaceRequest {\n");
    
    sb.append("    coverPath: ").append(toIndentedString(coverPath)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    workspaceID: ").append(toIndentedString(workspaceID)).append("\n");
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
