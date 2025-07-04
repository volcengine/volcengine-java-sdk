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
 * AIForListSpacesOutput
 */



public class AIForListSpacesOutput {
  @SerializedName("BindTime")
  private String bindTime = null;

  @SerializedName("TemplateID")
  private String templateID = null;

  @SerializedName("TemplateName")
  private String templateName = null;

  public AIForListSpacesOutput bindTime(String bindTime) {
    this.bindTime = bindTime;
    return this;
  }

   /**
   * Get bindTime
   * @return bindTime
  **/
  @Schema(description = "")
  public String getBindTime() {
    return bindTime;
  }

  public void setBindTime(String bindTime) {
    this.bindTime = bindTime;
  }

  public AIForListSpacesOutput templateID(String templateID) {
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

  public AIForListSpacesOutput templateName(String templateName) {
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
    AIForListSpacesOutput aiForListSpacesOutput = (AIForListSpacesOutput) o;
    return Objects.equals(this.bindTime, aiForListSpacesOutput.bindTime) &&
        Objects.equals(this.templateID, aiForListSpacesOutput.templateID) &&
        Objects.equals(this.templateName, aiForListSpacesOutput.templateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindTime, templateID, templateName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AIForListSpacesOutput {\n");
    
    sb.append("    bindTime: ").append(toIndentedString(bindTime)).append("\n");
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
