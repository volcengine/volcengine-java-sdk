/*
 * vedbm
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vedbm.model;

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
 * CreateBackupRequest
 */



public class CreateBackupRequest {
  /**
   * Gets or Sets backupMethod
   */
  @JsonAdapter(BackupMethodEnum.Adapter.class)
  public enum BackupMethodEnum {
    @SerializedName("Physical")
    PHYSICAL("Physical");

    private String value;

    BackupMethodEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static BackupMethodEnum fromValue(String input) {
      for (BackupMethodEnum b : BackupMethodEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<BackupMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BackupMethodEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public BackupMethodEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return BackupMethodEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("BackupMethod")
  private BackupMethodEnum backupMethod = null;

  /**
   * Gets or Sets backupType
   */
  @JsonAdapter(BackupTypeEnum.Adapter.class)
  public enum BackupTypeEnum {
    @SerializedName("Full")
    FULL("Full");

    private String value;

    BackupTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static BackupTypeEnum fromValue(String input) {
      for (BackupTypeEnum b : BackupTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<BackupTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BackupTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public BackupTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return BackupTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("BackupType")
  private BackupTypeEnum backupType = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  public CreateBackupRequest backupMethod(BackupMethodEnum backupMethod) {
    this.backupMethod = backupMethod;
    return this;
  }

   /**
   * Get backupMethod
   * @return backupMethod
  **/
  @Schema(description = "")
  public BackupMethodEnum getBackupMethod() {
    return backupMethod;
  }

  public void setBackupMethod(BackupMethodEnum backupMethod) {
    this.backupMethod = backupMethod;
  }

  public CreateBackupRequest backupType(BackupTypeEnum backupType) {
    this.backupType = backupType;
    return this;
  }

   /**
   * Get backupType
   * @return backupType
  **/
  @Schema(description = "")
  public BackupTypeEnum getBackupType() {
    return backupType;
  }

  public void setBackupType(BackupTypeEnum backupType) {
    this.backupType = backupType;
  }

  public CreateBackupRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBackupRequest createBackupRequest = (CreateBackupRequest) o;
    return Objects.equals(this.backupMethod, createBackupRequest.backupMethod) &&
        Objects.equals(this.backupType, createBackupRequest.backupType) &&
        Objects.equals(this.instanceId, createBackupRequest.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupMethod, backupType, instanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBackupRequest {\n");
    
    sb.append("    backupMethod: ").append(toIndentedString(backupMethod)).append("\n");
    sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
