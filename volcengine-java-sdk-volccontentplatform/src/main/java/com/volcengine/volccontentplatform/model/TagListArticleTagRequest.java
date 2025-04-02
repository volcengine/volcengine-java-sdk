/*
 * volc_content_platform
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volccontentplatform.model;

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
 * TagListArticleTagRequest
 */



public class TagListArticleTagRequest {
  @SerializedName("GroupIds")
  private List<String> groupIds = null;

  @SerializedName("TagType")
  private String tagType = null;

  public TagListArticleTagRequest groupIds(List<String> groupIds) {
    this.groupIds = groupIds;
    return this;
  }

  public TagListArticleTagRequest addGroupIdsItem(String groupIdsItem) {
    if (this.groupIds == null) {
      this.groupIds = new ArrayList<String>();
    }
    this.groupIds.add(groupIdsItem);
    return this;
  }

   /**
   * Get groupIds
   * @return groupIds
  **/
  @Schema(description = "")
  public List<String> getGroupIds() {
    return groupIds;
  }

  public void setGroupIds(List<String> groupIds) {
    this.groupIds = groupIds;
  }

  public TagListArticleTagRequest tagType(String tagType) {
    this.tagType = tagType;
    return this;
  }

   /**
   * Get tagType
   * @return tagType
  **/
  @Schema(description = "")
  public String getTagType() {
    return tagType;
  }

  public void setTagType(String tagType) {
    this.tagType = tagType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagListArticleTagRequest tagListArticleTagRequest = (TagListArticleTagRequest) o;
    return Objects.equals(this.groupIds, tagListArticleTagRequest.groupIds) &&
        Objects.equals(this.tagType, tagListArticleTagRequest.tagType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupIds, tagType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagListArticleTagRequest {\n");
    
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
    sb.append("    tagType: ").append(toIndentedString(tagType)).append("\n");
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
