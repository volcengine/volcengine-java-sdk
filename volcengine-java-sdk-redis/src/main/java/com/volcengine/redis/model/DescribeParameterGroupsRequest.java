/*
 * redis
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.redis.model;

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
 * DescribeParameterGroupsRequest
 */



public class DescribeParameterGroupsRequest {
  @SerializedName("EngineVersion")
  private String engineVersion = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  /**
   * Gets or Sets source
   */
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    @SerializedName("System")
    SYSTEM("System"),
    @SerializedName("User")
    USER("User");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SourceEnum fromValue(String input) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SourceEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SourceEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Source")
  private SourceEnum source = null;

  public DescribeParameterGroupsRequest engineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
    return this;
  }

   /**
   * Get engineVersion
   * @return engineVersion
  **/
  @Schema(description = "")
  public String getEngineVersion() {
    return engineVersion;
  }

  public void setEngineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
  }

  public DescribeParameterGroupsRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeParameterGroupsRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeParameterGroupsRequest source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeParameterGroupsRequest describeParameterGroupsRequest = (DescribeParameterGroupsRequest) o;
    return Objects.equals(this.engineVersion, describeParameterGroupsRequest.engineVersion) &&
        Objects.equals(this.pageNumber, describeParameterGroupsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeParameterGroupsRequest.pageSize) &&
        Objects.equals(this.source, describeParameterGroupsRequest.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineVersion, pageNumber, pageSize, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeParameterGroupsRequest {\n");
    
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
