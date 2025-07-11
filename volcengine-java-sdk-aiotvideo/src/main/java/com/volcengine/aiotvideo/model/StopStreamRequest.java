/*
 * aiotvideo
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.aiotvideo.model;

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
 * StopStreamRequest
 */



public class StopStreamRequest {
  @SerializedName("IsSmart")
  private Boolean isSmart = null;

  @SerializedName("Resolution")
  private String resolution = null;

  @SerializedName("SpaceID")
  private String spaceID = null;

  @SerializedName("StreamID")
  private String streamID = null;

  @SerializedName("StreamingIndex")
  private Integer streamingIndex = null;

  public StopStreamRequest isSmart(Boolean isSmart) {
    this.isSmart = isSmart;
    return this;
  }

   /**
   * Get isSmart
   * @return isSmart
  **/
  @Schema(description = "")
  public Boolean isIsSmart() {
    return isSmart;
  }

  public void setIsSmart(Boolean isSmart) {
    this.isSmart = isSmart;
  }

  public StopStreamRequest resolution(String resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  @Schema(description = "")
  public String getResolution() {
    return resolution;
  }

  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  public StopStreamRequest spaceID(String spaceID) {
    this.spaceID = spaceID;
    return this;
  }

   /**
   * Get spaceID
   * @return spaceID
  **/
  @Schema(description = "")
  public String getSpaceID() {
    return spaceID;
  }

  public void setSpaceID(String spaceID) {
    this.spaceID = spaceID;
  }

  public StopStreamRequest streamID(String streamID) {
    this.streamID = streamID;
    return this;
  }

   /**
   * Get streamID
   * @return streamID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getStreamID() {
    return streamID;
  }

  public void setStreamID(String streamID) {
    this.streamID = streamID;
  }

  public StopStreamRequest streamingIndex(Integer streamingIndex) {
    this.streamingIndex = streamingIndex;
    return this;
  }

   /**
   * Get streamingIndex
   * @return streamingIndex
  **/
  @Schema(description = "")
  public Integer getStreamingIndex() {
    return streamingIndex;
  }

  public void setStreamingIndex(Integer streamingIndex) {
    this.streamingIndex = streamingIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopStreamRequest stopStreamRequest = (StopStreamRequest) o;
    return Objects.equals(this.isSmart, stopStreamRequest.isSmart) &&
        Objects.equals(this.resolution, stopStreamRequest.resolution) &&
        Objects.equals(this.spaceID, stopStreamRequest.spaceID) &&
        Objects.equals(this.streamID, stopStreamRequest.streamID) &&
        Objects.equals(this.streamingIndex, stopStreamRequest.streamingIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSmart, resolution, spaceID, streamID, streamingIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopStreamRequest {\n");
    
    sb.append("    isSmart: ").append(toIndentedString(isSmart)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    spaceID: ").append(toIndentedString(spaceID)).append("\n");
    sb.append("    streamID: ").append(toIndentedString(streamID)).append("\n");
    sb.append("    streamingIndex: ").append(toIndentedString(streamingIndex)).append("\n");
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
