/*
 * ml_platform20240701
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mlplatform20240701.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mlplatform20240701.model.OptionsForUpdateDevInstanceInput;
import com.volcengine.mlplatform20240701.model.TosForUpdateDevInstanceInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CfsForUpdateDevInstanceInput
 */



public class CfsForUpdateDevInstanceInput {
  @SerializedName("FileSystemName")
  private String fileSystemName = null;

  @SerializedName("NamespaceId")
  private String namespaceId = null;

  @SerializedName("Options")
  private OptionsForUpdateDevInstanceInput options = null;

  @SerializedName("Tos")
  private TosForUpdateDevInstanceInput tos = null;

  public CfsForUpdateDevInstanceInput fileSystemName(String fileSystemName) {
    this.fileSystemName = fileSystemName;
    return this;
  }

   /**
   * Get fileSystemName
   * @return fileSystemName
  **/
  @Schema(description = "")
  public String getFileSystemName() {
    return fileSystemName;
  }

  public void setFileSystemName(String fileSystemName) {
    this.fileSystemName = fileSystemName;
  }

  public CfsForUpdateDevInstanceInput namespaceId(String namespaceId) {
    this.namespaceId = namespaceId;
    return this;
  }

   /**
   * Get namespaceId
   * @return namespaceId
  **/
  @Schema(description = "")
  public String getNamespaceId() {
    return namespaceId;
  }

  public void setNamespaceId(String namespaceId) {
    this.namespaceId = namespaceId;
  }

  public CfsForUpdateDevInstanceInput options(OptionsForUpdateDevInstanceInput options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @Valid
  @Schema(description = "")
  public OptionsForUpdateDevInstanceInput getOptions() {
    return options;
  }

  public void setOptions(OptionsForUpdateDevInstanceInput options) {
    this.options = options;
  }

  public CfsForUpdateDevInstanceInput tos(TosForUpdateDevInstanceInput tos) {
    this.tos = tos;
    return this;
  }

   /**
   * Get tos
   * @return tos
  **/
  @Valid
  @Schema(description = "")
  public TosForUpdateDevInstanceInput getTos() {
    return tos;
  }

  public void setTos(TosForUpdateDevInstanceInput tos) {
    this.tos = tos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CfsForUpdateDevInstanceInput cfsForUpdateDevInstanceInput = (CfsForUpdateDevInstanceInput) o;
    return Objects.equals(this.fileSystemName, cfsForUpdateDevInstanceInput.fileSystemName) &&
        Objects.equals(this.namespaceId, cfsForUpdateDevInstanceInput.namespaceId) &&
        Objects.equals(this.options, cfsForUpdateDevInstanceInput.options) &&
        Objects.equals(this.tos, cfsForUpdateDevInstanceInput.tos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSystemName, namespaceId, options, tos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CfsForUpdateDevInstanceInput {\n");
    
    sb.append("    fileSystemName: ").append(toIndentedString(fileSystemName)).append("\n");
    sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    tos: ").append(toIndentedString(tos)).append("\n");
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
