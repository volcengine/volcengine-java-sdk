/*
 * tag
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.tag.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.tag.model.TagForGetTagValuesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetTagValuesResponse
 */



public class GetTagValuesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("Tags")
  private List<TagForGetTagValuesOutput> tags = null;

  public GetTagValuesResponse nextToken(String nextToken) {
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

  public GetTagValuesResponse tags(List<TagForGetTagValuesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public GetTagValuesResponse addTagsItem(TagForGetTagValuesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForGetTagValuesOutput>();
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
  public List<TagForGetTagValuesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForGetTagValuesOutput> tags) {
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
    GetTagValuesResponse getTagValuesResponse = (GetTagValuesResponse) o;
    return Objects.equals(this.nextToken, getTagValuesResponse.nextToken) &&
        Objects.equals(this.tags, getTagValuesResponse.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTagValuesResponse {\n");
    
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
