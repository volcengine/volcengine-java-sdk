/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.alb.model.TagForCreateAclInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateAclRequest
 */



public class CreateAclRequest {
  @SerializedName("AclName")
  private String aclName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Tags")
  private List<TagForCreateAclInput> tags = null;

  public CreateAclRequest aclName(String aclName) {
    this.aclName = aclName;
    return this;
  }

   /**
   * Get aclName
   * @return aclName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getAclName() {
    return aclName;
  }

  public void setAclName(String aclName) {
    this.aclName = aclName;
  }

  public CreateAclRequest description(String description) {
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

  public CreateAclRequest projectName(String projectName) {
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

  public CreateAclRequest tags(List<TagForCreateAclInput> tags) {
    this.tags = tags;
    return this;
  }

  public CreateAclRequest addTagsItem(TagForCreateAclInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCreateAclInput>();
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
  public List<TagForCreateAclInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCreateAclInput> tags) {
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
    CreateAclRequest createAclRequest = (CreateAclRequest) o;
    return Objects.equals(this.aclName, createAclRequest.aclName) &&
        Objects.equals(this.description, createAclRequest.description) &&
        Objects.equals(this.projectName, createAclRequest.projectName) &&
        Objects.equals(this.tags, createAclRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aclName, description, projectName, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAclRequest {\n");
    
    sb.append("    aclName: ").append(toIndentedString(aclName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
