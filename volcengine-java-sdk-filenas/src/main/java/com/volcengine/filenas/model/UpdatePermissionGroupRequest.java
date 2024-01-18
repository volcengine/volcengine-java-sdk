/*
 * filenas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.filenas.model;

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
 * UpdatePermissionGroupRequest
 */


public class UpdatePermissionGroupRequest {
  @SerializedName("Description")
  private String description = null;

  /**
   * Gets or Sets fileSystemType
   */
  @JsonAdapter(FileSystemTypeEnum.Adapter.class)
  public enum FileSystemTypeEnum {
    EXTREME("Extreme");

    private String value;

    FileSystemTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FileSystemTypeEnum fromValue(String input) {
      for (FileSystemTypeEnum b : FileSystemTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FileSystemTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FileSystemTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public FileSystemTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FileSystemTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("FileSystemType")
  private FileSystemTypeEnum fileSystemType = null;

  @SerializedName("PermissionGroupId")
  private String permissionGroupId = null;

  @SerializedName("PermissionGroupName")
  private String permissionGroupName = null;

  public UpdatePermissionGroupRequest description(String description) {
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

  public UpdatePermissionGroupRequest fileSystemType(FileSystemTypeEnum fileSystemType) {
    this.fileSystemType = fileSystemType;
    return this;
  }

   /**
   * Get fileSystemType
   * @return fileSystemType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public FileSystemTypeEnum getFileSystemType() {
    return fileSystemType;
  }

  public void setFileSystemType(FileSystemTypeEnum fileSystemType) {
    this.fileSystemType = fileSystemType;
  }

  public UpdatePermissionGroupRequest permissionGroupId(String permissionGroupId) {
    this.permissionGroupId = permissionGroupId;
    return this;
  }

   /**
   * Get permissionGroupId
   * @return permissionGroupId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPermissionGroupId() {
    return permissionGroupId;
  }

  public void setPermissionGroupId(String permissionGroupId) {
    this.permissionGroupId = permissionGroupId;
  }

  public UpdatePermissionGroupRequest permissionGroupName(String permissionGroupName) {
    this.permissionGroupName = permissionGroupName;
    return this;
  }

   /**
   * Get permissionGroupName
   * @return permissionGroupName
  **/
  @Schema(description = "")
  public String getPermissionGroupName() {
    return permissionGroupName;
  }

  public void setPermissionGroupName(String permissionGroupName) {
    this.permissionGroupName = permissionGroupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePermissionGroupRequest updatePermissionGroupRequest = (UpdatePermissionGroupRequest) o;
    return Objects.equals(this.description, updatePermissionGroupRequest.description) &&
        Objects.equals(this.fileSystemType, updatePermissionGroupRequest.fileSystemType) &&
        Objects.equals(this.permissionGroupId, updatePermissionGroupRequest.permissionGroupId) &&
        Objects.equals(this.permissionGroupName, updatePermissionGroupRequest.permissionGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, fileSystemType, permissionGroupId, permissionGroupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePermissionGroupRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fileSystemType: ").append(toIndentedString(fileSystemType)).append("\n");
    sb.append("    permissionGroupId: ").append(toIndentedString(permissionGroupId)).append("\n");
    sb.append("    permissionGroupName: ").append(toIndentedString(permissionGroupName)).append("\n");
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