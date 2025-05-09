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
import com.volcengine.volccontentplatform.model.SimilarArticleForGetSimilarArticleBySimIdOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetSimilarArticleBySimIdResponse
 */



public class GetSimilarArticleBySimIdResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Cursor")
  private String cursor = null;

  @SerializedName("SimilarArticles")
  private List<SimilarArticleForGetSimilarArticleBySimIdOutput> similarArticles = null;

  @SerializedName("Total")
  private Integer total = null;

  public GetSimilarArticleBySimIdResponse cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @Schema(description = "")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public GetSimilarArticleBySimIdResponse similarArticles(List<SimilarArticleForGetSimilarArticleBySimIdOutput> similarArticles) {
    this.similarArticles = similarArticles;
    return this;
  }

  public GetSimilarArticleBySimIdResponse addSimilarArticlesItem(SimilarArticleForGetSimilarArticleBySimIdOutput similarArticlesItem) {
    if (this.similarArticles == null) {
      this.similarArticles = new ArrayList<SimilarArticleForGetSimilarArticleBySimIdOutput>();
    }
    this.similarArticles.add(similarArticlesItem);
    return this;
  }

   /**
   * Get similarArticles
   * @return similarArticles
  **/
  @Valid
  @Schema(description = "")
  public List<SimilarArticleForGetSimilarArticleBySimIdOutput> getSimilarArticles() {
    return similarArticles;
  }

  public void setSimilarArticles(List<SimilarArticleForGetSimilarArticleBySimIdOutput> similarArticles) {
    this.similarArticles = similarArticles;
  }

  public GetSimilarArticleBySimIdResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSimilarArticleBySimIdResponse getSimilarArticleBySimIdResponse = (GetSimilarArticleBySimIdResponse) o;
    return Objects.equals(this.cursor, getSimilarArticleBySimIdResponse.cursor) &&
        Objects.equals(this.similarArticles, getSimilarArticleBySimIdResponse.similarArticles) &&
        Objects.equals(this.total, getSimilarArticleBySimIdResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, similarArticles, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSimilarArticleBySimIdResponse {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    similarArticles: ").append(toIndentedString(similarArticles)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
