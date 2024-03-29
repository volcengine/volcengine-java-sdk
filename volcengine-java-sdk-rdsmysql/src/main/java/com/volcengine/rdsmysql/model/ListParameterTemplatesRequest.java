/*
 * rds_mysql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysql.model;

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
 * ListParameterTemplatesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-19T16:52:50.262695+08:00[Asia/Shanghai]")
public class ListParameterTemplatesRequest {
  /**
   * Gets or Sets templateCategory
   */
  @JsonAdapter(TemplateCategoryEnum.Adapter.class)
  public enum TemplateCategoryEnum {
    DBENGINE("DBEngine"),
    PROXY("Proxy");

    private String value;

    TemplateCategoryEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TemplateCategoryEnum fromValue(String input) {
      for (TemplateCategoryEnum b : TemplateCategoryEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TemplateCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TemplateCategoryEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TemplateCategoryEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TemplateCategoryEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("TemplateCategory")
  private TemplateCategoryEnum templateCategory = null;

  /**
   * Gets or Sets templateSource
   */
  @JsonAdapter(TemplateSourceEnum.Adapter.class)
  public enum TemplateSourceEnum {
    SYSTEM("System"),
    USER("User");

    private String value;

    TemplateSourceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TemplateSourceEnum fromValue(String input) {
      for (TemplateSourceEnum b : TemplateSourceEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TemplateSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TemplateSourceEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TemplateSourceEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TemplateSourceEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("TemplateSource")
  private TemplateSourceEnum templateSource = null;

  /**
   * Gets or Sets templateType
   */
  @JsonAdapter(TemplateTypeEnum.Adapter.class)
  public enum TemplateTypeEnum {
    MYSQL("MySQL");

    private String value;

    TemplateTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TemplateTypeEnum fromValue(String input) {
      for (TemplateTypeEnum b : TemplateTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TemplateTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TemplateTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TemplateTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TemplateTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("TemplateType")
  private TemplateTypeEnum templateType = null;

  /**
   * Gets or Sets templateTypeVersion
   */
  @JsonAdapter(TemplateTypeVersionEnum.Adapter.class)
  public enum TemplateTypeVersionEnum {
    _8_0("MySQL_8_0"),
    COMMUNITY_5_7("MySQL_Community_5_7");

    private String value;

    TemplateTypeVersionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TemplateTypeVersionEnum fromValue(String input) {
      for (TemplateTypeVersionEnum b : TemplateTypeVersionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TemplateTypeVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TemplateTypeVersionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TemplateTypeVersionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TemplateTypeVersionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("TemplateTypeVersion")
  private TemplateTypeVersionEnum templateTypeVersion = null;

  public ListParameterTemplatesRequest templateCategory(TemplateCategoryEnum templateCategory) {
    this.templateCategory = templateCategory;
    return this;
  }

   /**
   * Get templateCategory
   * @return templateCategory
  **/
  @Schema(description = "")
  public TemplateCategoryEnum getTemplateCategory() {
    return templateCategory;
  }

  public void setTemplateCategory(TemplateCategoryEnum templateCategory) {
    this.templateCategory = templateCategory;
  }

  public ListParameterTemplatesRequest templateSource(TemplateSourceEnum templateSource) {
    this.templateSource = templateSource;
    return this;
  }

   /**
   * Get templateSource
   * @return templateSource
  **/
  @Schema(description = "")
  public TemplateSourceEnum getTemplateSource() {
    return templateSource;
  }

  public void setTemplateSource(TemplateSourceEnum templateSource) {
    this.templateSource = templateSource;
  }

  public ListParameterTemplatesRequest templateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
    return this;
  }

   /**
   * Get templateType
   * @return templateType
  **/
  @Schema(description = "")
  public TemplateTypeEnum getTemplateType() {
    return templateType;
  }

  public void setTemplateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
  }

  public ListParameterTemplatesRequest templateTypeVersion(TemplateTypeVersionEnum templateTypeVersion) {
    this.templateTypeVersion = templateTypeVersion;
    return this;
  }

   /**
   * Get templateTypeVersion
   * @return templateTypeVersion
  **/
  @Schema(description = "")
  public TemplateTypeVersionEnum getTemplateTypeVersion() {
    return templateTypeVersion;
  }

  public void setTemplateTypeVersion(TemplateTypeVersionEnum templateTypeVersion) {
    this.templateTypeVersion = templateTypeVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListParameterTemplatesRequest listParameterTemplatesRequest = (ListParameterTemplatesRequest) o;
    return Objects.equals(this.templateCategory, listParameterTemplatesRequest.templateCategory) &&
        Objects.equals(this.templateSource, listParameterTemplatesRequest.templateSource) &&
        Objects.equals(this.templateType, listParameterTemplatesRequest.templateType) &&
        Objects.equals(this.templateTypeVersion, listParameterTemplatesRequest.templateTypeVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateCategory, templateSource, templateType, templateTypeVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListParameterTemplatesRequest {\n");
    
    sb.append("    templateCategory: ").append(toIndentedString(templateCategory)).append("\n");
    sb.append("    templateSource: ").append(toIndentedString(templateSource)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
    sb.append("    templateTypeVersion: ").append(toIndentedString(templateTypeVersion)).append("\n");
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
