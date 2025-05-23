/*
 * tag
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.tag.model;

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
 * TagForGetTagsOutput
 */



public class TagForGetTagsOutput {
  @SerializedName("Key")
  private String key = null;

  @SerializedName("ResourcesNum")
  private Integer resourcesNum = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("Value")
  private String value = null;

  public TagForGetTagsOutput key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public TagForGetTagsOutput resourcesNum(Integer resourcesNum) {
    this.resourcesNum = resourcesNum;
    return this;
  }

   /**
   * Get resourcesNum
   * @return resourcesNum
  **/
  @Schema(description = "")
  public Integer getResourcesNum() {
    return resourcesNum;
  }

  public void setResourcesNum(Integer resourcesNum) {
    this.resourcesNum = resourcesNum;
  }

  public TagForGetTagsOutput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TagForGetTagsOutput value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagForGetTagsOutput tagForGetTagsOutput = (TagForGetTagsOutput) o;
    return Objects.equals(this.key, tagForGetTagsOutput.key) &&
        Objects.equals(this.resourcesNum, tagForGetTagsOutput.resourcesNum) &&
        Objects.equals(this.type, tagForGetTagsOutput.type) &&
        Objects.equals(this.value, tagForGetTagsOutput.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, resourcesNum, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagForGetTagsOutput {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    resourcesNum: ").append(toIndentedString(resourcesNum)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
