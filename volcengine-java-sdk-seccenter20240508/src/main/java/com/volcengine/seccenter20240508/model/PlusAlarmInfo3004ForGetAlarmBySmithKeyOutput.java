/*
 * seccenter20240508
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.seccenter20240508.model;

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
 * PlusAlarmInfo3004ForGetAlarmBySmithKeyOutput
 */



public class PlusAlarmInfo3004ForGetAlarmBySmithKeyOutput {
  @SerializedName("Path")
  private String path = null;

  public PlusAlarmInfo3004ForGetAlarmBySmithKeyOutput path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlusAlarmInfo3004ForGetAlarmBySmithKeyOutput plusAlarmInfo3004ForGetAlarmBySmithKeyOutput = (PlusAlarmInfo3004ForGetAlarmBySmithKeyOutput) o;
    return Objects.equals(this.path, plusAlarmInfo3004ForGetAlarmBySmithKeyOutput.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlusAlarmInfo3004ForGetAlarmBySmithKeyOutput {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
