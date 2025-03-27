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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LangDetectRequest
 */



public class LangDetectRequest {
  @SerializedName("TextList")
  private List<String> textList = null;

  public LangDetectRequest textList(List<String> textList) {
    this.textList = textList;
    return this;
  }

  public LangDetectRequest addTextListItem(String textListItem) {
    if (this.textList == null) {
      this.textList = new ArrayList<String>();
    }
    this.textList.add(textListItem);
    return this;
  }

   /**
   * Get textList
   * @return textList
  **/
  @Schema(description = "")
  public List<String> getTextList() {
    return textList;
  }

  public void setTextList(List<String> textList) {
    this.textList = textList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LangDetectRequest langDetectRequest = (LangDetectRequest) o;
    return Objects.equals(this.textList, langDetectRequest.textList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LangDetectRequest {\n");
    
    sb.append("    textList: ").append(toIndentedString(textList)).append("\n");
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
