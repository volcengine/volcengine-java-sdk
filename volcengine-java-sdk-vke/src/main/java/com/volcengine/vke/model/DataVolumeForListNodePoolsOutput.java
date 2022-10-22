/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

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
 * DataVolumeForListNodePoolsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-22T17:04:04.290377+08:00[Asia/Shanghai]")
public class DataVolumeForListNodePoolsOutput {
  @SerializedName("MountPoint")
  private String mountPoint = null;

  @SerializedName("Size")
  private Integer size = null;

  @SerializedName("Type")
  private String type = null;

  public DataVolumeForListNodePoolsOutput mountPoint(String mountPoint) {
    this.mountPoint = mountPoint;
    return this;
  }

   /**
   * Get mountPoint
   * @return mountPoint
  **/
  @Schema(description = "")
  public String getMountPoint() {
    return mountPoint;
  }

  public void setMountPoint(String mountPoint) {
    this.mountPoint = mountPoint;
  }

  public DataVolumeForListNodePoolsOutput size(Integer size) {
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

  public DataVolumeForListNodePoolsOutput type(String type) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataVolumeForListNodePoolsOutput dataVolumeForListNodePoolsOutput = (DataVolumeForListNodePoolsOutput) o;
    return Objects.equals(this.mountPoint, dataVolumeForListNodePoolsOutput.mountPoint) &&
        Objects.equals(this.size, dataVolumeForListNodePoolsOutput.size) &&
        Objects.equals(this.type, dataVolumeForListNodePoolsOutput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountPoint, size, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataVolumeForListNodePoolsOutput {\n");
    
    sb.append("    mountPoint: ").append(toIndentedString(mountPoint)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
