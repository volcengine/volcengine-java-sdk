/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.ecs.model.ParameterDefinitionForCreateCommandInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateCommandRequest
 */


public class CreateCommandRequest {
  @SerializedName("CommandContent")
  private String commandContent = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("EnableParameter")
  private Boolean enableParameter = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("ParameterDefinitions")
  private List<ParameterDefinitionForCreateCommandInput> parameterDefinitions = null;

  @SerializedName("Timeout")
  private Integer timeout = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("Username")
  private String username = null;

  @SerializedName("WorkingDir")
  private String workingDir = null;

  public CreateCommandRequest commandContent(String commandContent) {
    this.commandContent = commandContent;
    return this;
  }

   /**
   * Get commandContent
   * @return commandContent
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCommandContent() {
    return commandContent;
  }

  public void setCommandContent(String commandContent) {
    this.commandContent = commandContent;
  }

  public CreateCommandRequest description(String description) {
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

  public CreateCommandRequest enableParameter(Boolean enableParameter) {
    this.enableParameter = enableParameter;
    return this;
  }

   /**
   * Get enableParameter
   * @return enableParameter
  **/
  @Schema(description = "")
  public Boolean isEnableParameter() {
    return enableParameter;
  }

  public void setEnableParameter(Boolean enableParameter) {
    this.enableParameter = enableParameter;
  }

  public CreateCommandRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateCommandRequest parameterDefinitions(List<ParameterDefinitionForCreateCommandInput> parameterDefinitions) {
    this.parameterDefinitions = parameterDefinitions;
    return this;
  }

  public CreateCommandRequest addParameterDefinitionsItem(ParameterDefinitionForCreateCommandInput parameterDefinitionsItem) {
    if (this.parameterDefinitions == null) {
      this.parameterDefinitions = new ArrayList<ParameterDefinitionForCreateCommandInput>();
    }
    this.parameterDefinitions.add(parameterDefinitionsItem);
    return this;
  }

   /**
   * Get parameterDefinitions
   * @return parameterDefinitions
  **/
  @Valid
  @Schema(description = "")
  public List<ParameterDefinitionForCreateCommandInput> getParameterDefinitions() {
    return parameterDefinitions;
  }

  public void setParameterDefinitions(List<ParameterDefinitionForCreateCommandInput> parameterDefinitions) {
    this.parameterDefinitions = parameterDefinitions;
  }

  public CreateCommandRequest timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @Schema(description = "")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public CreateCommandRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CreateCommandRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public CreateCommandRequest workingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }

   /**
   * Get workingDir
   * @return workingDir
  **/
  @Schema(description = "")
  public String getWorkingDir() {
    return workingDir;
  }

  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCommandRequest createCommandRequest = (CreateCommandRequest) o;
    return Objects.equals(this.commandContent, createCommandRequest.commandContent) &&
        Objects.equals(this.description, createCommandRequest.description) &&
        Objects.equals(this.enableParameter, createCommandRequest.enableParameter) &&
        Objects.equals(this.name, createCommandRequest.name) &&
        Objects.equals(this.parameterDefinitions, createCommandRequest.parameterDefinitions) &&
        Objects.equals(this.timeout, createCommandRequest.timeout) &&
        Objects.equals(this.type, createCommandRequest.type) &&
        Objects.equals(this.username, createCommandRequest.username) &&
        Objects.equals(this.workingDir, createCommandRequest.workingDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandContent, description, enableParameter, name, parameterDefinitions, timeout, type, username, workingDir);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCommandRequest {\n");
    
    sb.append("    commandContent: ").append(toIndentedString(commandContent)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enableParameter: ").append(toIndentedString(enableParameter)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameterDefinitions: ").append(toIndentedString(parameterDefinitions)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
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
