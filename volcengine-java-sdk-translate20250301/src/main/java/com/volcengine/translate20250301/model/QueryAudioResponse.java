/*
 * translate20250301
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.translate20250301.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.translate20250301.model.SubtitleForQueryAudioOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * QueryAudioResponse
 */



public class QueryAudioResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Confidence")
  private Float confidence = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Subtitles")
  private List<SubtitleForQueryAudioOutput> subtitles = null;

  public QueryAudioResponse confidence(Float confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @Schema(description = "")
  public Float getConfidence() {
    return confidence;
  }

  public void setConfidence(Float confidence) {
    this.confidence = confidence;
  }

  public QueryAudioResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public QueryAudioResponse subtitles(List<SubtitleForQueryAudioOutput> subtitles) {
    this.subtitles = subtitles;
    return this;
  }

  public QueryAudioResponse addSubtitlesItem(SubtitleForQueryAudioOutput subtitlesItem) {
    if (this.subtitles == null) {
      this.subtitles = new ArrayList<SubtitleForQueryAudioOutput>();
    }
    this.subtitles.add(subtitlesItem);
    return this;
  }

   /**
   * Get subtitles
   * @return subtitles
  **/
  @Valid
  @Schema(description = "")
  public List<SubtitleForQueryAudioOutput> getSubtitles() {
    return subtitles;
  }

  public void setSubtitles(List<SubtitleForQueryAudioOutput> subtitles) {
    this.subtitles = subtitles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryAudioResponse queryAudioResponse = (QueryAudioResponse) o;
    return Objects.equals(this.confidence, queryAudioResponse.confidence) &&
        Objects.equals(this.status, queryAudioResponse.status) &&
        Objects.equals(this.subtitles, queryAudioResponse.subtitles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, status, subtitles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAudioResponse {\n");
    
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subtitles: ").append(toIndentedString(subtitles)).append("\n");
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
