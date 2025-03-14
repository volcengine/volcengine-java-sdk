/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

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
 * ModifyCustomizedCfgAttributesRequest
 */



public class ModifyCustomizedCfgAttributesRequest {
  @SerializedName("CustomizedCfgContent")
  private String customizedCfgContent = null;

  @SerializedName("CustomizedCfgId")
  private String customizedCfgId = null;

  @SerializedName("CustomizedCfgName")
  private String customizedCfgName = null;

  @SerializedName("Description")
  private String description = null;

  public ModifyCustomizedCfgAttributesRequest customizedCfgContent(String customizedCfgContent) {
    this.customizedCfgContent = customizedCfgContent;
    return this;
  }

   /**
   * Get customizedCfgContent
   * @return customizedCfgContent
  **/
 @Size(min=1,max=4096)  @Schema(description = "")
  public String getCustomizedCfgContent() {
    return customizedCfgContent;
  }

  public void setCustomizedCfgContent(String customizedCfgContent) {
    this.customizedCfgContent = customizedCfgContent;
  }

  public ModifyCustomizedCfgAttributesRequest customizedCfgId(String customizedCfgId) {
    this.customizedCfgId = customizedCfgId;
    return this;
  }

   /**
   * Get customizedCfgId
   * @return customizedCfgId
  **/
  @Schema(description = "")
  public String getCustomizedCfgId() {
    return customizedCfgId;
  }

  public void setCustomizedCfgId(String customizedCfgId) {
    this.customizedCfgId = customizedCfgId;
  }

  public ModifyCustomizedCfgAttributesRequest customizedCfgName(String customizedCfgName) {
    this.customizedCfgName = customizedCfgName;
    return this;
  }

   /**
   * Get customizedCfgName
   * @return customizedCfgName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getCustomizedCfgName() {
    return customizedCfgName;
  }

  public void setCustomizedCfgName(String customizedCfgName) {
    this.customizedCfgName = customizedCfgName;
  }

  public ModifyCustomizedCfgAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 @Size(min=1,max=255)  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyCustomizedCfgAttributesRequest modifyCustomizedCfgAttributesRequest = (ModifyCustomizedCfgAttributesRequest) o;
    return Objects.equals(this.customizedCfgContent, modifyCustomizedCfgAttributesRequest.customizedCfgContent) &&
        Objects.equals(this.customizedCfgId, modifyCustomizedCfgAttributesRequest.customizedCfgId) &&
        Objects.equals(this.customizedCfgName, modifyCustomizedCfgAttributesRequest.customizedCfgName) &&
        Objects.equals(this.description, modifyCustomizedCfgAttributesRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customizedCfgContent, customizedCfgId, customizedCfgName, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyCustomizedCfgAttributesRequest {\n");
    
    sb.append("    customizedCfgContent: ").append(toIndentedString(customizedCfgContent)).append("\n");
    sb.append("    customizedCfgId: ").append(toIndentedString(customizedCfgId)).append("\n");
    sb.append("    customizedCfgName: ").append(toIndentedString(customizedCfgName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
