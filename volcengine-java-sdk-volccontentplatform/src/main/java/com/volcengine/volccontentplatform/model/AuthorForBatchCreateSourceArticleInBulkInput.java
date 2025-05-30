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
 * AuthorForBatchCreateSourceArticleInBulkInput
 */



public class AuthorForBatchCreateSourceArticleInBulkInput {
  @SerializedName("AuthorAvatarUrl")
  private String authorAvatarUrl = null;

  @SerializedName("AuthorName")
  private String authorName = null;

  @SerializedName("AuthorOpenId")
  private String authorOpenId = null;

  @SerializedName("AuthorTags")
  private List<String> authorTags = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("FollowerCount")
  private Long followerCount = null;

  public AuthorForBatchCreateSourceArticleInBulkInput authorAvatarUrl(String authorAvatarUrl) {
    this.authorAvatarUrl = authorAvatarUrl;
    return this;
  }

   /**
   * Get authorAvatarUrl
   * @return authorAvatarUrl
  **/
  @Schema(description = "")
  public String getAuthorAvatarUrl() {
    return authorAvatarUrl;
  }

  public void setAuthorAvatarUrl(String authorAvatarUrl) {
    this.authorAvatarUrl = authorAvatarUrl;
  }

  public AuthorForBatchCreateSourceArticleInBulkInput authorName(String authorName) {
    this.authorName = authorName;
    return this;
  }

   /**
   * Get authorName
   * @return authorName
  **/
  @Schema(description = "")
  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public AuthorForBatchCreateSourceArticleInBulkInput authorOpenId(String authorOpenId) {
    this.authorOpenId = authorOpenId;
    return this;
  }

   /**
   * Get authorOpenId
   * @return authorOpenId
  **/
  @Schema(description = "")
  public String getAuthorOpenId() {
    return authorOpenId;
  }

  public void setAuthorOpenId(String authorOpenId) {
    this.authorOpenId = authorOpenId;
  }

  public AuthorForBatchCreateSourceArticleInBulkInput authorTags(List<String> authorTags) {
    this.authorTags = authorTags;
    return this;
  }

  public AuthorForBatchCreateSourceArticleInBulkInput addAuthorTagsItem(String authorTagsItem) {
    if (this.authorTags == null) {
      this.authorTags = new ArrayList<String>();
    }
    this.authorTags.add(authorTagsItem);
    return this;
  }

   /**
   * Get authorTags
   * @return authorTags
  **/
  @Schema(description = "")
  public List<String> getAuthorTags() {
    return authorTags;
  }

  public void setAuthorTags(List<String> authorTags) {
    this.authorTags = authorTags;
  }

  public AuthorForBatchCreateSourceArticleInBulkInput description(String description) {
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

  public AuthorForBatchCreateSourceArticleInBulkInput followerCount(Long followerCount) {
    this.followerCount = followerCount;
    return this;
  }

   /**
   * Get followerCount
   * @return followerCount
  **/
  @Schema(description = "")
  public Long getFollowerCount() {
    return followerCount;
  }

  public void setFollowerCount(Long followerCount) {
    this.followerCount = followerCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorForBatchCreateSourceArticleInBulkInput authorForBatchCreateSourceArticleInBulkInput = (AuthorForBatchCreateSourceArticleInBulkInput) o;
    return Objects.equals(this.authorAvatarUrl, authorForBatchCreateSourceArticleInBulkInput.authorAvatarUrl) &&
        Objects.equals(this.authorName, authorForBatchCreateSourceArticleInBulkInput.authorName) &&
        Objects.equals(this.authorOpenId, authorForBatchCreateSourceArticleInBulkInput.authorOpenId) &&
        Objects.equals(this.authorTags, authorForBatchCreateSourceArticleInBulkInput.authorTags) &&
        Objects.equals(this.description, authorForBatchCreateSourceArticleInBulkInput.description) &&
        Objects.equals(this.followerCount, authorForBatchCreateSourceArticleInBulkInput.followerCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorAvatarUrl, authorName, authorOpenId, authorTags, description, followerCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorForBatchCreateSourceArticleInBulkInput {\n");
    
    sb.append("    authorAvatarUrl: ").append(toIndentedString(authorAvatarUrl)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    authorOpenId: ").append(toIndentedString(authorOpenId)).append("\n");
    sb.append("    authorTags: ").append(toIndentedString(authorTags)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    followerCount: ").append(toIndentedString(followerCount)).append("\n");
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
