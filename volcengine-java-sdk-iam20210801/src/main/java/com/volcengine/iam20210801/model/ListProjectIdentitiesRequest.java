/*
 * iam20210801
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam20210801.model;

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
 * ListProjectIdentitiesRequest
 */



public class ListProjectIdentitiesRequest {
  /**
   * Gets or Sets identityType
   */
  @JsonAdapter(IdentityTypeEnum.Adapter.class)
  public enum IdentityTypeEnum {
    @SerializedName("User")
    USER("User"),
    @SerializedName("Role")
    ROLE("Role"),
    @SerializedName("UserGroup")
    USERGROUP("UserGroup");

    private String value;

    IdentityTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static IdentityTypeEnum fromValue(String input) {
      for (IdentityTypeEnum b : IdentityTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<IdentityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IdentityTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public IdentityTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return IdentityTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("IdentityType")
  private IdentityTypeEnum identityType = null;

  @SerializedName("Limit")
  private Integer limit = null;

  @SerializedName("Offset")
  private Integer offset = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Query")
  private String query = null;

  public ListProjectIdentitiesRequest identityType(IdentityTypeEnum identityType) {
    this.identityType = identityType;
    return this;
  }

   /**
   * Get identityType
   * @return identityType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public IdentityTypeEnum getIdentityType() {
    return identityType;
  }

  public void setIdentityType(IdentityTypeEnum identityType) {
    this.identityType = identityType;
  }

  public ListProjectIdentitiesRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @Schema(description = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ListProjectIdentitiesRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @Schema(description = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public ListProjectIdentitiesRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public ListProjectIdentitiesRequest query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @Schema(description = "")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListProjectIdentitiesRequest listProjectIdentitiesRequest = (ListProjectIdentitiesRequest) o;
    return Objects.equals(this.identityType, listProjectIdentitiesRequest.identityType) &&
        Objects.equals(this.limit, listProjectIdentitiesRequest.limit) &&
        Objects.equals(this.offset, listProjectIdentitiesRequest.offset) &&
        Objects.equals(this.projectName, listProjectIdentitiesRequest.projectName) &&
        Objects.equals(this.query, listProjectIdentitiesRequest.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityType, limit, offset, projectName, query);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListProjectIdentitiesRequest {\n");
    
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
