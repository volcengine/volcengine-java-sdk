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
 * SetStreamTemplateRequest
 */



public class SetStreamTemplateRequest {
  @SerializedName("SpaceID")
  private String spaceID = null;

  @SerializedName("StreamID")
  private String streamID = null;

  @SerializedName("TemplateID")
  private String templateID = null;

  public SetStreamTemplateRequest spaceID(String spaceID) {
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

  public SetStreamTemplateRequest streamID(String streamID) {
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

  public SetStreamTemplateRequest templateID(String templateID) {
    this.templateID = templateID;
    return this;
  }

   /**
   * Get templateID
   * @return templateID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTemplateID() {
    return templateID;
  }

  public void setTemplateID(String templateID) {
    this.templateID = templateID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetStreamTemplateRequest setStreamTemplateRequest = (SetStreamTemplateRequest) o;
    return Objects.equals(this.spaceID, setStreamTemplateRequest.spaceID) &&
        Objects.equals(this.streamID, setStreamTemplateRequest.streamID) &&
        Objects.equals(this.templateID, setStreamTemplateRequest.templateID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spaceID, streamID, templateID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetStreamTemplateRequest {\n");
    
    sb.append("    spaceID: ").append(toIndentedString(spaceID)).append("\n");
    sb.append("    streamID: ").append(toIndentedString(streamID)).append("\n");
    sb.append("    templateID: ").append(toIndentedString(templateID)).append("\n");
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
