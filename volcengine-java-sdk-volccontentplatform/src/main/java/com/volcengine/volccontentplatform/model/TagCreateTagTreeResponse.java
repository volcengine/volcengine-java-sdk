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
import com.volcengine.volccontentplatform.model.UploadRetForTagCreateTagTreeOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TagCreateTagTreeResponse
 */



public class TagCreateTagTreeResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("UploadRet")
  private UploadRetForTagCreateTagTreeOutput uploadRet = null;

  public TagCreateTagTreeResponse uploadRet(UploadRetForTagCreateTagTreeOutput uploadRet) {
    this.uploadRet = uploadRet;
    return this;
  }

   /**
   * Get uploadRet
   * @return uploadRet
  **/
  @Valid
  @Schema(description = "")
  public UploadRetForTagCreateTagTreeOutput getUploadRet() {
    return uploadRet;
  }

  public void setUploadRet(UploadRetForTagCreateTagTreeOutput uploadRet) {
    this.uploadRet = uploadRet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagCreateTagTreeResponse tagCreateTagTreeResponse = (TagCreateTagTreeResponse) o;
    return Objects.equals(this.uploadRet, tagCreateTagTreeResponse.uploadRet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadRet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagCreateTagTreeResponse {\n");
    
    sb.append("    uploadRet: ").append(toIndentedString(uploadRet)).append("\n");
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
