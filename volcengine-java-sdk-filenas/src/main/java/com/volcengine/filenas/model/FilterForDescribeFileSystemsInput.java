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
 * FilterForDescribeFileSystemsInput
 */


public class FilterForDescribeFileSystemsInput {
  /**
   * Gets or Sets key
   */
  @JsonAdapter(KeyEnum.Adapter.class)
  public enum KeyEnum {
    STATUS("Status"),
    FILESYSTEMNAME("FileSystemName"),
    ZONEID("ZoneId"),
    PROTOCOLTYPE("ProtocolType"),
    STORAGETYPE("StorageType"),
    CHARGETYPE("ChargeType"),
    PERMISSIONGROUPID("PermissionGroupId"),
    MOUNTPOINTID("MountPointId");

    private String value;

    KeyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static KeyEnum fromValue(String input) {
      for (KeyEnum b : KeyEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<KeyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public KeyEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return KeyEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Key")
  private KeyEnum key = null;

  @SerializedName("Value")
  private String value = null;

  public FilterForDescribeFileSystemsInput key(KeyEnum key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public KeyEnum getKey() {
    return key;
  }

  public void setKey(KeyEnum key) {
    this.key = key;
  }

  public FilterForDescribeFileSystemsInput value(String value) {
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
    FilterForDescribeFileSystemsInput filterForDescribeFileSystemsInput = (FilterForDescribeFileSystemsInput) o;
    return Objects.equals(this.key, filterForDescribeFileSystemsInput.key) &&
        Objects.equals(this.value, filterForDescribeFileSystemsInput.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterForDescribeFileSystemsInput {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
