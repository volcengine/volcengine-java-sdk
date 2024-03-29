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
 * DataForListInstanceParamsHistoryOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-19T16:52:50.262695+08:00[Asia/Shanghai]")
public class DataForListInstanceParamsHistoryOutput {
  @SerializedName("ModifyTime")
  private String modifyTime = null;

  @SerializedName("NewParameterValue")
  private String newParameterValue = null;

  @SerializedName("OldParameterValue")
  private String oldParameterValue = null;

  @SerializedName("ParameterName")
  private String parameterName = null;

  /**
   * Gets or Sets paramsStatus
   */
  @JsonAdapter(ParamsStatusEnum.Adapter.class)
  public enum ParamsStatusEnum {
    APPLIED("Applied"),
    FAILED("Failed"),
    SYNCING("Syncing");

    private String value;

    ParamsStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ParamsStatusEnum fromValue(String input) {
      for (ParamsStatusEnum b : ParamsStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ParamsStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ParamsStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ParamsStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ParamsStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ParamsStatus")
  private ParamsStatusEnum paramsStatus = null;

  public DataForListInstanceParamsHistoryOutput modifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * Get modifyTime
   * @return modifyTime
  **/
  @Schema(description = "")
  public String getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }

  public DataForListInstanceParamsHistoryOutput newParameterValue(String newParameterValue) {
    this.newParameterValue = newParameterValue;
    return this;
  }

   /**
   * Get newParameterValue
   * @return newParameterValue
  **/
  @Schema(description = "")
  public String getNewParameterValue() {
    return newParameterValue;
  }

  public void setNewParameterValue(String newParameterValue) {
    this.newParameterValue = newParameterValue;
  }

  public DataForListInstanceParamsHistoryOutput oldParameterValue(String oldParameterValue) {
    this.oldParameterValue = oldParameterValue;
    return this;
  }

   /**
   * Get oldParameterValue
   * @return oldParameterValue
  **/
  @Schema(description = "")
  public String getOldParameterValue() {
    return oldParameterValue;
  }

  public void setOldParameterValue(String oldParameterValue) {
    this.oldParameterValue = oldParameterValue;
  }

  public DataForListInstanceParamsHistoryOutput parameterName(String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

   /**
   * Get parameterName
   * @return parameterName
  **/
  @Schema(description = "")
  public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }

  public DataForListInstanceParamsHistoryOutput paramsStatus(ParamsStatusEnum paramsStatus) {
    this.paramsStatus = paramsStatus;
    return this;
  }

   /**
   * Get paramsStatus
   * @return paramsStatus
  **/
  @Schema(description = "")
  public ParamsStatusEnum getParamsStatus() {
    return paramsStatus;
  }

  public void setParamsStatus(ParamsStatusEnum paramsStatus) {
    this.paramsStatus = paramsStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForListInstanceParamsHistoryOutput dataForListInstanceParamsHistoryOutput = (DataForListInstanceParamsHistoryOutput) o;
    return Objects.equals(this.modifyTime, dataForListInstanceParamsHistoryOutput.modifyTime) &&
        Objects.equals(this.newParameterValue, dataForListInstanceParamsHistoryOutput.newParameterValue) &&
        Objects.equals(this.oldParameterValue, dataForListInstanceParamsHistoryOutput.oldParameterValue) &&
        Objects.equals(this.parameterName, dataForListInstanceParamsHistoryOutput.parameterName) &&
        Objects.equals(this.paramsStatus, dataForListInstanceParamsHistoryOutput.paramsStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifyTime, newParameterValue, oldParameterValue, parameterName, paramsStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForListInstanceParamsHistoryOutput {\n");
    
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    newParameterValue: ").append(toIndentedString(newParameterValue)).append("\n");
    sb.append("    oldParameterValue: ").append(toIndentedString(oldParameterValue)).append("\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    paramsStatus: ").append(toIndentedString(paramsStatus)).append("\n");
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
