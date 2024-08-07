/*
 * transitrouter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.transitrouter.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.transitrouter.model.TagForCreateTransitRouterInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateTransitRouterRequest
 */



public class CreateTransitRouterRequest {
  @SerializedName("Asn")
  private Long asn = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Tags")
  private List<TagForCreateTransitRouterInput> tags = null;

  @SerializedName("TransitRouterName")
  private String transitRouterName = null;

  public CreateTransitRouterRequest asn(Long asn) {
    this.asn = asn;
    return this;
  }

   /**
   * Get asn
   * @return asn
  **/
  @Schema(description = "")
  public Long getAsn() {
    return asn;
  }

  public void setAsn(Long asn) {
    this.asn = asn;
  }

  public CreateTransitRouterRequest clientToken(String clientToken) {
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

  public CreateTransitRouterRequest description(String description) {
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

  public CreateTransitRouterRequest projectName(String projectName) {
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

  public CreateTransitRouterRequest tags(List<TagForCreateTransitRouterInput> tags) {
    this.tags = tags;
    return this;
  }

  public CreateTransitRouterRequest addTagsItem(TagForCreateTransitRouterInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCreateTransitRouterInput>();
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
  public List<TagForCreateTransitRouterInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCreateTransitRouterInput> tags) {
    this.tags = tags;
  }

  public CreateTransitRouterRequest transitRouterName(String transitRouterName) {
    this.transitRouterName = transitRouterName;
    return this;
  }

   /**
   * Get transitRouterName
   * @return transitRouterName
  **/
  @Schema(description = "")
  public String getTransitRouterName() {
    return transitRouterName;
  }

  public void setTransitRouterName(String transitRouterName) {
    this.transitRouterName = transitRouterName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTransitRouterRequest createTransitRouterRequest = (CreateTransitRouterRequest) o;
    return Objects.equals(this.asn, createTransitRouterRequest.asn) &&
        Objects.equals(this.clientToken, createTransitRouterRequest.clientToken) &&
        Objects.equals(this.description, createTransitRouterRequest.description) &&
        Objects.equals(this.projectName, createTransitRouterRequest.projectName) &&
        Objects.equals(this.tags, createTransitRouterRequest.tags) &&
        Objects.equals(this.transitRouterName, createTransitRouterRequest.transitRouterName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asn, clientToken, description, projectName, tags, transitRouterName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransitRouterRequest {\n");
    
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    transitRouterName: ").append(toIndentedString(transitRouterName)).append("\n");
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
