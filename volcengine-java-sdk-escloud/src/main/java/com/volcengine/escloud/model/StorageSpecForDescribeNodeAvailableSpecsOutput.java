/*
 * escloud
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.escloud.model;

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
 * StorageSpecForDescribeNodeAvailableSpecsOutput
 */



public class StorageSpecForDescribeNodeAvailableSpecsOutput {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("MaxSize")
  private Integer maxSize = null;

  @SerializedName("MinSize")
  private Integer minSize = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Size")
  private Integer size = null;

  public StorageSpecForDescribeNodeAvailableSpecsOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StorageSpecForDescribeNodeAvailableSpecsOutput displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public StorageSpecForDescribeNodeAvailableSpecsOutput maxSize(Integer maxSize) {
    this.maxSize = maxSize;
    return this;
  }

   /**
   * Get maxSize
   * @return maxSize
  **/
  @Schema(description = "")
  public Integer getMaxSize() {
    return maxSize;
  }

  public void setMaxSize(Integer maxSize) {
    this.maxSize = maxSize;
  }

  public StorageSpecForDescribeNodeAvailableSpecsOutput minSize(Integer minSize) {
    this.minSize = minSize;
    return this;
  }

   /**
   * Get minSize
   * @return minSize
  **/
  @Schema(description = "")
  public Integer getMinSize() {
    return minSize;
  }

  public void setMinSize(Integer minSize) {
    this.minSize = minSize;
  }

  public StorageSpecForDescribeNodeAvailableSpecsOutput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StorageSpecForDescribeNodeAvailableSpecsOutput size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageSpecForDescribeNodeAvailableSpecsOutput storageSpecForDescribeNodeAvailableSpecsOutput = (StorageSpecForDescribeNodeAvailableSpecsOutput) o;
    return Objects.equals(this.description, storageSpecForDescribeNodeAvailableSpecsOutput.description) &&
        Objects.equals(this.displayName, storageSpecForDescribeNodeAvailableSpecsOutput.displayName) &&
        Objects.equals(this.maxSize, storageSpecForDescribeNodeAvailableSpecsOutput.maxSize) &&
        Objects.equals(this.minSize, storageSpecForDescribeNodeAvailableSpecsOutput.minSize) &&
        Objects.equals(this.name, storageSpecForDescribeNodeAvailableSpecsOutput.name) &&
        Objects.equals(this.size, storageSpecForDescribeNodeAvailableSpecsOutput.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, maxSize, minSize, name, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageSpecForDescribeNodeAvailableSpecsOutput {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
