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
 * CancelStreamTemplateRequest
 */



public class CancelStreamTemplateRequest {
  @SerializedName("SpaceID")
  private String spaceID = null;

  @SerializedName("StreamID")
  private String streamID = null;

  @SerializedName("TemplateType")
  private String templateType = null;

  public CancelStreamTemplateRequest spaceID(String spaceID) {
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

  public CancelStreamTemplateRequest streamID(String streamID) {
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

  public CancelStreamTemplateRequest templateType(String templateType) {
    this.templateType = templateType;
    return this;
  }

   /**
   * Get templateType
   * @return templateType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTemplateType() {
    return templateType;
  }

  public void setTemplateType(String templateType) {
    this.templateType = templateType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelStreamTemplateRequest cancelStreamTemplateRequest = (CancelStreamTemplateRequest) o;
    return Objects.equals(this.spaceID, cancelStreamTemplateRequest.spaceID) &&
        Objects.equals(this.streamID, cancelStreamTemplateRequest.streamID) &&
        Objects.equals(this.templateType, cancelStreamTemplateRequest.templateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spaceID, streamID, templateType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelStreamTemplateRequest {\n");
    
    sb.append("    spaceID: ").append(toIndentedString(spaceID)).append("\n");
    sb.append("    streamID: ").append(toIndentedString(streamID)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
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
