/*
 * apig20221112
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.apig20221112.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.apig20221112.model.PercentForCreateRouteInput;
import com.volcengine.apig20221112.model.UpstreamForCreateRouteInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MirrorPolicyForCreateRouteInput
 */



public class MirrorPolicyForCreateRouteInput {
  @SerializedName("Percent")
  private PercentForCreateRouteInput percent = null;

  @SerializedName("Upstream")
  private UpstreamForCreateRouteInput upstream = null;

  public MirrorPolicyForCreateRouteInput percent(PercentForCreateRouteInput percent) {
    this.percent = percent;
    return this;
  }

   /**
   * Get percent
   * @return percent
  **/
  @Valid
  @Schema(description = "")
  public PercentForCreateRouteInput getPercent() {
    return percent;
  }

  public void setPercent(PercentForCreateRouteInput percent) {
    this.percent = percent;
  }

  public MirrorPolicyForCreateRouteInput upstream(UpstreamForCreateRouteInput upstream) {
    this.upstream = upstream;
    return this;
  }

   /**
   * Get upstream
   * @return upstream
  **/
  @Valid
  @Schema(description = "")
  public UpstreamForCreateRouteInput getUpstream() {
    return upstream;
  }

  public void setUpstream(UpstreamForCreateRouteInput upstream) {
    this.upstream = upstream;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MirrorPolicyForCreateRouteInput mirrorPolicyForCreateRouteInput = (MirrorPolicyForCreateRouteInput) o;
    return Objects.equals(this.percent, mirrorPolicyForCreateRouteInput.percent) &&
        Objects.equals(this.upstream, mirrorPolicyForCreateRouteInput.upstream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percent, upstream);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MirrorPolicyForCreateRouteInput {\n");
    
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    upstream: ").append(toIndentedString(upstream)).append("\n");
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
