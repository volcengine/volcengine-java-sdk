/*
 * vod20250101
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vod20250101.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vod20250101.model.VoiceForGetExecutionOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConvertSegmentForGetExecutionOutput
 */



public class ConvertSegmentForGetExecutionOutput {
  @SerializedName("End")
  private Double end = null;

  @SerializedName("File")
  private VoiceForGetExecutionOutput file = null;

  @SerializedName("Frames")
  private List<Integer> frames = null;

  @SerializedName("Start")
  private Double start = null;

  public ConvertSegmentForGetExecutionOutput end(Double end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @Schema(description = "")
  public Double getEnd() {
    return end;
  }

  public void setEnd(Double end) {
    this.end = end;
  }

  public ConvertSegmentForGetExecutionOutput file(VoiceForGetExecutionOutput file) {
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @Valid
  @Schema(description = "")
  public VoiceForGetExecutionOutput getFile() {
    return file;
  }

  public void setFile(VoiceForGetExecutionOutput file) {
    this.file = file;
  }

  public ConvertSegmentForGetExecutionOutput frames(List<Integer> frames) {
    this.frames = frames;
    return this;
  }

  public ConvertSegmentForGetExecutionOutput addFramesItem(Integer framesItem) {
    if (this.frames == null) {
      this.frames = new ArrayList<Integer>();
    }
    this.frames.add(framesItem);
    return this;
  }

   /**
   * Get frames
   * @return frames
  **/
  @Schema(description = "")
  public List<Integer> getFrames() {
    return frames;
  }

  public void setFrames(List<Integer> frames) {
    this.frames = frames;
  }

  public ConvertSegmentForGetExecutionOutput start(Double start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @Schema(description = "")
  public Double getStart() {
    return start;
  }

  public void setStart(Double start) {
    this.start = start;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertSegmentForGetExecutionOutput convertSegmentForGetExecutionOutput = (ConvertSegmentForGetExecutionOutput) o;
    return Objects.equals(this.end, convertSegmentForGetExecutionOutput.end) &&
        Objects.equals(this.file, convertSegmentForGetExecutionOutput.file) &&
        Objects.equals(this.frames, convertSegmentForGetExecutionOutput.frames) &&
        Objects.equals(this.start, convertSegmentForGetExecutionOutput.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, file, frames, start);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertSegmentForGetExecutionOutput {\n");
    
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    frames: ").append(toIndentedString(frames)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
