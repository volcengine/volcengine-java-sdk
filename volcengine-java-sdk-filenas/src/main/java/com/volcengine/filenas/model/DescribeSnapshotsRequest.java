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
 * DescribeSnapshotsRequest
 */


public class DescribeSnapshotsRequest {
  @SerializedName("FileSystemId")
  private String fileSystemId = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("SnapshotIds")
  private String snapshotIds = null;

  @SerializedName("SnapshotName")
  private String snapshotName = null;

  /**
   * Gets or Sets snapshotType
   */
  @JsonAdapter(SnapshotTypeEnum.Adapter.class)
  public enum SnapshotTypeEnum {
    MANUAL("Manual"),
    AUTO("Auto");

    private String value;

    SnapshotTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SnapshotTypeEnum fromValue(String input) {
      for (SnapshotTypeEnum b : SnapshotTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SnapshotTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SnapshotTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SnapshotTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SnapshotTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("SnapshotType")
  private SnapshotTypeEnum snapshotType = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PROGRESSING("Progressing"),
    ACCOMPLISHED("Accomplished"),
    FAILED("Failed"),
    DELETING("Deleting");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Status")
  private StatusEnum status = null;

  public DescribeSnapshotsRequest fileSystemId(String fileSystemId) {
    this.fileSystemId = fileSystemId;
    return this;
  }

   /**
   * Get fileSystemId
   * @return fileSystemId
  **/
  @Schema(description = "")
  public String getFileSystemId() {
    return fileSystemId;
  }

  public void setFileSystemId(String fileSystemId) {
    this.fileSystemId = fileSystemId;
  }

  public DescribeSnapshotsRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeSnapshotsRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeSnapshotsRequest snapshotIds(String snapshotIds) {
    this.snapshotIds = snapshotIds;
    return this;
  }

   /**
   * Get snapshotIds
   * @return snapshotIds
  **/
  @Schema(description = "")
  public String getSnapshotIds() {
    return snapshotIds;
  }

  public void setSnapshotIds(String snapshotIds) {
    this.snapshotIds = snapshotIds;
  }

  public DescribeSnapshotsRequest snapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
    return this;
  }

   /**
   * Get snapshotName
   * @return snapshotName
  **/
  @Schema(description = "")
  public String getSnapshotName() {
    return snapshotName;
  }

  public void setSnapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
  }

  public DescribeSnapshotsRequest snapshotType(SnapshotTypeEnum snapshotType) {
    this.snapshotType = snapshotType;
    return this;
  }

   /**
   * Get snapshotType
   * @return snapshotType
  **/
  @Schema(description = "")
  public SnapshotTypeEnum getSnapshotType() {
    return snapshotType;
  }

  public void setSnapshotType(SnapshotTypeEnum snapshotType) {
    this.snapshotType = snapshotType;
  }

  public DescribeSnapshotsRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeSnapshotsRequest describeSnapshotsRequest = (DescribeSnapshotsRequest) o;
    return Objects.equals(this.fileSystemId, describeSnapshotsRequest.fileSystemId) &&
        Objects.equals(this.pageNumber, describeSnapshotsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeSnapshotsRequest.pageSize) &&
        Objects.equals(this.snapshotIds, describeSnapshotsRequest.snapshotIds) &&
        Objects.equals(this.snapshotName, describeSnapshotsRequest.snapshotName) &&
        Objects.equals(this.snapshotType, describeSnapshotsRequest.snapshotType) &&
        Objects.equals(this.status, describeSnapshotsRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSystemId, pageNumber, pageSize, snapshotIds, snapshotName, snapshotType, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSnapshotsRequest {\n");
    
    sb.append("    fileSystemId: ").append(toIndentedString(fileSystemId)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    snapshotIds: ").append(toIndentedString(snapshotIds)).append("\n");
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
    sb.append("    snapshotType: ").append(toIndentedString(snapshotType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
