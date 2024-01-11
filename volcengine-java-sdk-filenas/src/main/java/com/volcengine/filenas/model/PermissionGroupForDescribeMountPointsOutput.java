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
import com.volcengine.filenas.model.MountPointForDescribeMountPointsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PermissionGroupForDescribeMountPointsOutput
 */


public class PermissionGroupForDescribeMountPointsOutput {
  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("FileSystemCount")
  private Integer fileSystemCount = null;

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

  @SerializedName("MountPoints")
  private List<MountPointForDescribeMountPointsOutput> mountPoints = null;

  @SerializedName("PermissionGroupId")
  private String permissionGroupId = null;

  @SerializedName("PermissionGroupName")
  private String permissionGroupName = null;

  @SerializedName("PermissionRuleCount")
  private Integer permissionRuleCount = null;

  public PermissionGroupForDescribeMountPointsOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public PermissionGroupForDescribeMountPointsOutput description(String description) {
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

  public PermissionGroupForDescribeMountPointsOutput fileSystemCount(Integer fileSystemCount) {
    this.fileSystemCount = fileSystemCount;
    return this;
  }

   /**
   * Get fileSystemCount
   * @return fileSystemCount
  **/
  @Schema(description = "")
  public Integer getFileSystemCount() {
    return fileSystemCount;
  }

  public void setFileSystemCount(Integer fileSystemCount) {
    this.fileSystemCount = fileSystemCount;
  }

  public PermissionGroupForDescribeMountPointsOutput fileSystemType(FileSystemTypeEnum fileSystemType) {
    this.fileSystemType = fileSystemType;
    return this;
  }

   /**
   * Get fileSystemType
   * @return fileSystemType
  **/
  @Schema(description = "")
  public FileSystemTypeEnum getFileSystemType() {
    return fileSystemType;
  }

  public void setFileSystemType(FileSystemTypeEnum fileSystemType) {
    this.fileSystemType = fileSystemType;
  }

  public PermissionGroupForDescribeMountPointsOutput mountPoints(List<MountPointForDescribeMountPointsOutput> mountPoints) {
    this.mountPoints = mountPoints;
    return this;
  }

  public PermissionGroupForDescribeMountPointsOutput addMountPointsItem(MountPointForDescribeMountPointsOutput mountPointsItem) {
    if (this.mountPoints == null) {
      this.mountPoints = new ArrayList<MountPointForDescribeMountPointsOutput>();
    }
    this.mountPoints.add(mountPointsItem);
    return this;
  }

   /**
   * Get mountPoints
   * @return mountPoints
  **/
  @Valid
  @Schema(description = "")
  public List<MountPointForDescribeMountPointsOutput> getMountPoints() {
    return mountPoints;
  }

  public void setMountPoints(List<MountPointForDescribeMountPointsOutput> mountPoints) {
    this.mountPoints = mountPoints;
  }

  public PermissionGroupForDescribeMountPointsOutput permissionGroupId(String permissionGroupId) {
    this.permissionGroupId = permissionGroupId;
    return this;
  }

   /**
   * Get permissionGroupId
   * @return permissionGroupId
  **/
  @Schema(description = "")
  public String getPermissionGroupId() {
    return permissionGroupId;
  }

  public void setPermissionGroupId(String permissionGroupId) {
    this.permissionGroupId = permissionGroupId;
  }

  public PermissionGroupForDescribeMountPointsOutput permissionGroupName(String permissionGroupName) {
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

  public PermissionGroupForDescribeMountPointsOutput permissionRuleCount(Integer permissionRuleCount) {
    this.permissionRuleCount = permissionRuleCount;
    return this;
  }

   /**
   * Get permissionRuleCount
   * @return permissionRuleCount
  **/
  @Schema(description = "")
  public Integer getPermissionRuleCount() {
    return permissionRuleCount;
  }

  public void setPermissionRuleCount(Integer permissionRuleCount) {
    this.permissionRuleCount = permissionRuleCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionGroupForDescribeMountPointsOutput permissionGroupForDescribeMountPointsOutput = (PermissionGroupForDescribeMountPointsOutput) o;
    return Objects.equals(this.createTime, permissionGroupForDescribeMountPointsOutput.createTime) &&
        Objects.equals(this.description, permissionGroupForDescribeMountPointsOutput.description) &&
        Objects.equals(this.fileSystemCount, permissionGroupForDescribeMountPointsOutput.fileSystemCount) &&
        Objects.equals(this.fileSystemType, permissionGroupForDescribeMountPointsOutput.fileSystemType) &&
        Objects.equals(this.mountPoints, permissionGroupForDescribeMountPointsOutput.mountPoints) &&
        Objects.equals(this.permissionGroupId, permissionGroupForDescribeMountPointsOutput.permissionGroupId) &&
        Objects.equals(this.permissionGroupName, permissionGroupForDescribeMountPointsOutput.permissionGroupName) &&
        Objects.equals(this.permissionRuleCount, permissionGroupForDescribeMountPointsOutput.permissionRuleCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, description, fileSystemCount, fileSystemType, mountPoints, permissionGroupId, permissionGroupName, permissionRuleCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionGroupForDescribeMountPointsOutput {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fileSystemCount: ").append(toIndentedString(fileSystemCount)).append("\n");
    sb.append("    fileSystemType: ").append(toIndentedString(fileSystemType)).append("\n");
    sb.append("    mountPoints: ").append(toIndentedString(mountPoints)).append("\n");
    sb.append("    permissionGroupId: ").append(toIndentedString(permissionGroupId)).append("\n");
    sb.append("    permissionGroupName: ").append(toIndentedString(permissionGroupName)).append("\n");
    sb.append("    permissionRuleCount: ").append(toIndentedString(permissionRuleCount)).append("\n");
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
