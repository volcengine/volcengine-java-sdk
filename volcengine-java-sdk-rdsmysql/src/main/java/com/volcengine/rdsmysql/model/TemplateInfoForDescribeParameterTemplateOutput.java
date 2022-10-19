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
import com.volcengine.rdsmysql.model.TemplateParamForDescribeParameterTemplateOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TemplateInfoForDescribeParameterTemplateOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-19T10:12:05.954803+08:00[Asia/Shanghai]")
public class TemplateInfoForDescribeParameterTemplateOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("NeedRestart")
  private Boolean needRestart = null;

  @SerializedName("ParameterNum")
  private Long parameterNum = null;

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

  @SerializedName("TemplateDesc")
  private String templateDesc = null;

  @SerializedName("TemplateId")
  private String templateId = null;

  @SerializedName("TemplateName")
  private String templateName = null;

  @SerializedName("TemplateParams")
  private List<TemplateParamForDescribeParameterTemplateOutput> templateParams = null;

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

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public TemplateInfoForDescribeParameterTemplateOutput accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public TemplateInfoForDescribeParameterTemplateOutput createTime(String createTime) {
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

  public TemplateInfoForDescribeParameterTemplateOutput needRestart(Boolean needRestart) {
    this.needRestart = needRestart;
    return this;
  }

   /**
   * Get needRestart
   * @return needRestart
  **/
  @Schema(description = "")
  public Boolean isNeedRestart() {
    return needRestart;
  }

  public void setNeedRestart(Boolean needRestart) {
    this.needRestart = needRestart;
  }

  public TemplateInfoForDescribeParameterTemplateOutput parameterNum(Long parameterNum) {
    this.parameterNum = parameterNum;
    return this;
  }

   /**
   * Get parameterNum
   * @return parameterNum
  **/
  @Schema(description = "")
  public Long getParameterNum() {
    return parameterNum;
  }

  public void setParameterNum(Long parameterNum) {
    this.parameterNum = parameterNum;
  }

  public TemplateInfoForDescribeParameterTemplateOutput templateCategory(TemplateCategoryEnum templateCategory) {
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

  public TemplateInfoForDescribeParameterTemplateOutput templateDesc(String templateDesc) {
    this.templateDesc = templateDesc;
    return this;
  }

   /**
   * Get templateDesc
   * @return templateDesc
  **/
  @Schema(description = "")
  public String getTemplateDesc() {
    return templateDesc;
  }

  public void setTemplateDesc(String templateDesc) {
    this.templateDesc = templateDesc;
  }

  public TemplateInfoForDescribeParameterTemplateOutput templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @Schema(description = "")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public TemplateInfoForDescribeParameterTemplateOutput templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * Get templateName
   * @return templateName
  **/
  @Schema(description = "")
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public TemplateInfoForDescribeParameterTemplateOutput templateParams(List<TemplateParamForDescribeParameterTemplateOutput> templateParams) {
    this.templateParams = templateParams;
    return this;
  }

  public TemplateInfoForDescribeParameterTemplateOutput addTemplateParamsItem(TemplateParamForDescribeParameterTemplateOutput templateParamsItem) {
    if (this.templateParams == null) {
      this.templateParams = new ArrayList<TemplateParamForDescribeParameterTemplateOutput>();
    }
    this.templateParams.add(templateParamsItem);
    return this;
  }

   /**
   * Get templateParams
   * @return templateParams
  **/
  @Valid
  @Schema(description = "")
  public List<TemplateParamForDescribeParameterTemplateOutput> getTemplateParams() {
    return templateParams;
  }

  public void setTemplateParams(List<TemplateParamForDescribeParameterTemplateOutput> templateParams) {
    this.templateParams = templateParams;
  }

  public TemplateInfoForDescribeParameterTemplateOutput templateSource(TemplateSourceEnum templateSource) {
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

  public TemplateInfoForDescribeParameterTemplateOutput templateType(TemplateTypeEnum templateType) {
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

  public TemplateInfoForDescribeParameterTemplateOutput templateTypeVersion(TemplateTypeVersionEnum templateTypeVersion) {
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

  public TemplateInfoForDescribeParameterTemplateOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateInfoForDescribeParameterTemplateOutput templateInfoForDescribeParameterTemplateOutput = (TemplateInfoForDescribeParameterTemplateOutput) o;
    return Objects.equals(this.accountId, templateInfoForDescribeParameterTemplateOutput.accountId) &&
        Objects.equals(this.createTime, templateInfoForDescribeParameterTemplateOutput.createTime) &&
        Objects.equals(this.needRestart, templateInfoForDescribeParameterTemplateOutput.needRestart) &&
        Objects.equals(this.parameterNum, templateInfoForDescribeParameterTemplateOutput.parameterNum) &&
        Objects.equals(this.templateCategory, templateInfoForDescribeParameterTemplateOutput.templateCategory) &&
        Objects.equals(this.templateDesc, templateInfoForDescribeParameterTemplateOutput.templateDesc) &&
        Objects.equals(this.templateId, templateInfoForDescribeParameterTemplateOutput.templateId) &&
        Objects.equals(this.templateName, templateInfoForDescribeParameterTemplateOutput.templateName) &&
        Objects.equals(this.templateParams, templateInfoForDescribeParameterTemplateOutput.templateParams) &&
        Objects.equals(this.templateSource, templateInfoForDescribeParameterTemplateOutput.templateSource) &&
        Objects.equals(this.templateType, templateInfoForDescribeParameterTemplateOutput.templateType) &&
        Objects.equals(this.templateTypeVersion, templateInfoForDescribeParameterTemplateOutput.templateTypeVersion) &&
        Objects.equals(this.updateTime, templateInfoForDescribeParameterTemplateOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, createTime, needRestart, parameterNum, templateCategory, templateDesc, templateId, templateName, templateParams, templateSource, templateType, templateTypeVersion, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateInfoForDescribeParameterTemplateOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    needRestart: ").append(toIndentedString(needRestart)).append("\n");
    sb.append("    parameterNum: ").append(toIndentedString(parameterNum)).append("\n");
    sb.append("    templateCategory: ").append(toIndentedString(templateCategory)).append("\n");
    sb.append("    templateDesc: ").append(toIndentedString(templateDesc)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    templateParams: ").append(toIndentedString(templateParams)).append("\n");
    sb.append("    templateSource: ").append(toIndentedString(templateSource)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
    sb.append("    templateTypeVersion: ").append(toIndentedString(templateTypeVersion)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
