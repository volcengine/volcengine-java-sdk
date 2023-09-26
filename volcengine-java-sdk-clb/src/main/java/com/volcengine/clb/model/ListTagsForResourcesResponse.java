/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.clb.model.ResourceTagForListTagsForResourcesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListTagsForResourcesResponse
 */


public class ListTagsForResourcesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("ResourceTags")
  private List<ResourceTagForListTagsForResourcesOutput> resourceTags = null;

  public ListTagsForResourcesResponse nextToken(String nextToken) {
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

  public ListTagsForResourcesResponse requestId(String requestId) {
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

  public ListTagsForResourcesResponse resourceTags(List<ResourceTagForListTagsForResourcesOutput> resourceTags) {
    this.resourceTags = resourceTags;
    return this;
  }

  public ListTagsForResourcesResponse addResourceTagsItem(ResourceTagForListTagsForResourcesOutput resourceTagsItem) {
    if (this.resourceTags == null) {
      this.resourceTags = new ArrayList<ResourceTagForListTagsForResourcesOutput>();
    }
    this.resourceTags.add(resourceTagsItem);
    return this;
  }

   /**
   * Get resourceTags
   * @return resourceTags
  **/
  @Valid
  @Schema(description = "")
  public List<ResourceTagForListTagsForResourcesOutput> getResourceTags() {
    return resourceTags;
  }

  public void setResourceTags(List<ResourceTagForListTagsForResourcesOutput> resourceTags) {
    this.resourceTags = resourceTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTagsForResourcesResponse listTagsForResourcesResponse = (ListTagsForResourcesResponse) o;
    return Objects.equals(this.nextToken, listTagsForResourcesResponse.nextToken) &&
        Objects.equals(this.requestId, listTagsForResourcesResponse.requestId) &&
        Objects.equals(this.resourceTags, listTagsForResourcesResponse.resourceTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, requestId, resourceTags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTagsForResourcesResponse {\n");
    
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    resourceTags: ").append(toIndentedString(resourceTags)).append("\n");
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
