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
 * DataForListTagsDetailOutput
 */



public class DataForListTagsDetailOutput {
  @SerializedName("TagHostNum")
  private Integer tagHostNum = null;

  @SerializedName("TagName")
  private String tagName = null;

  public DataForListTagsDetailOutput tagHostNum(Integer tagHostNum) {
    this.tagHostNum = tagHostNum;
    return this;
  }

   /**
   * Get tagHostNum
   * @return tagHostNum
  **/
  @Schema(description = "")
  public Integer getTagHostNum() {
    return tagHostNum;
  }

  public void setTagHostNum(Integer tagHostNum) {
    this.tagHostNum = tagHostNum;
  }

  public DataForListTagsDetailOutput tagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

   /**
   * Get tagName
   * @return tagName
  **/
  @Schema(description = "")
  public String getTagName() {
    return tagName;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForListTagsDetailOutput dataForListTagsDetailOutput = (DataForListTagsDetailOutput) o;
    return Objects.equals(this.tagHostNum, dataForListTagsDetailOutput.tagHostNum) &&
        Objects.equals(this.tagName, dataForListTagsDetailOutput.tagName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagHostNum, tagName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForListTagsDetailOutput {\n");
    
    sb.append("    tagHostNum: ").append(toIndentedString(tagHostNum)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
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
