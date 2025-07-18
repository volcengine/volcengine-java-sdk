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
 * AIForGetStreamOutput
 */



public class AIForGetStreamOutput {
  @SerializedName("TemplateID")
  private String templateID = null;

  @SerializedName("TemplateName")
  private String templateName = null;

  public AIForGetStreamOutput templateID(String templateID) {
    this.templateID = templateID;
    return this;
  }

   /**
   * Get templateID
   * @return templateID
  **/
  @Schema(description = "")
  public String getTemplateID() {
    return templateID;
  }

  public void setTemplateID(String templateID) {
    this.templateID = templateID;
  }

  public AIForGetStreamOutput templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * Get templateName
   * @return templateName
  **/
  @Schema(description = "")
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AIForGetStreamOutput aiForGetStreamOutput = (AIForGetStreamOutput) o;
    return Objects.equals(this.templateID, aiForGetStreamOutput.templateID) &&
        Objects.equals(this.templateName, aiForGetStreamOutput.templateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateID, templateName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AIForGetStreamOutput {\n");
    
    sb.append("    templateID: ").append(toIndentedString(templateID)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
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
