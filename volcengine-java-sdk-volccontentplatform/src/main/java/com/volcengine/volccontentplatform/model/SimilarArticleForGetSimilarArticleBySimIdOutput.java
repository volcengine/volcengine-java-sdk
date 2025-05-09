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
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SimilarArticleForGetSimilarArticleBySimIdOutput
 */



public class SimilarArticleForGetSimilarArticleBySimIdOutput {
  @SerializedName("GenerateType")
  private String generateType = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("OpenId")
  private String openId = null;

  @SerializedName("PublishTime")
  private String publishTime = null;

  public SimilarArticleForGetSimilarArticleBySimIdOutput generateType(String generateType) {
    this.generateType = generateType;
    return this;
  }

   /**
   * Get generateType
   * @return generateType
  **/
  @Schema(description = "")
  public String getGenerateType() {
    return generateType;
  }

  public void setGenerateType(String generateType) {
    this.generateType = generateType;
  }

  public SimilarArticleForGetSimilarArticleBySimIdOutput id(String id) {
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

  public SimilarArticleForGetSimilarArticleBySimIdOutput openId(String openId) {
    this.openId = openId;
    return this;
  }

   /**
   * Get openId
   * @return openId
  **/
  @Schema(description = "")
  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public SimilarArticleForGetSimilarArticleBySimIdOutput publishTime(String publishTime) {
    this.publishTime = publishTime;
    return this;
  }

   /**
   * Get publishTime
   * @return publishTime
  **/
  @Schema(description = "")
  public String getPublishTime() {
    return publishTime;
  }

  public void setPublishTime(String publishTime) {
    this.publishTime = publishTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimilarArticleForGetSimilarArticleBySimIdOutput similarArticleForGetSimilarArticleBySimIdOutput = (SimilarArticleForGetSimilarArticleBySimIdOutput) o;
    return Objects.equals(this.generateType, similarArticleForGetSimilarArticleBySimIdOutput.generateType) &&
        Objects.equals(this.id, similarArticleForGetSimilarArticleBySimIdOutput.id) &&
        Objects.equals(this.openId, similarArticleForGetSimilarArticleBySimIdOutput.openId) &&
        Objects.equals(this.publishTime, similarArticleForGetSimilarArticleBySimIdOutput.publishTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generateType, id, openId, publishTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarArticleForGetSimilarArticleBySimIdOutput {\n");
    
    sb.append("    generateType: ").append(toIndentedString(generateType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
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
