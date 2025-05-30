/*
 * resourcecenter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.resourcecenter.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.resourcecenter.model.ResourceForSearchResourcesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SearchResourcesResponse
 */



public class SearchResourcesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("Resources")
  private List<ResourceForSearchResourcesOutput> resources = null;

  public SearchResourcesResponse nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @Schema(description = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public SearchResourcesResponse resources(List<ResourceForSearchResourcesOutput> resources) {
    this.resources = resources;
    return this;
  }

  public SearchResourcesResponse addResourcesItem(ResourceForSearchResourcesOutput resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<ResourceForSearchResourcesOutput>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @Valid
  @Schema(description = "")
  public List<ResourceForSearchResourcesOutput> getResources() {
    return resources;
  }

  public void setResources(List<ResourceForSearchResourcesOutput> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResourcesResponse searchResourcesResponse = (SearchResourcesResponse) o;
    return Objects.equals(this.nextToken, searchResourcesResponse.nextToken) &&
        Objects.equals(this.resources, searchResourcesResponse.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResourcesResponse {\n");
    
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
