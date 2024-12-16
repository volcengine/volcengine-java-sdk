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
import com.volcengine.ecs.model.ParameterDefinitionForRunCommandInput;
import com.volcengine.ecs.model.TagForRunCommandInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RunCommandRequest
 */



public class RunCommandRequest {
  @SerializedName("CommandContent")
  private String commandContent = null;

  @SerializedName("ContentEncoding")
  private String contentEncoding = null;

  @SerializedName("EnableParameter")
  private Boolean enableParameter = null;

  @SerializedName("Frequency")
  private String frequency = null;

  @SerializedName("InstanceIds")
  private List<String> instanceIds = null;

  @SerializedName("InvocationDescription")
  private String invocationDescription = null;

  @SerializedName("InvocationName")
  private String invocationName = null;

  @SerializedName("LaunchTime")
  private String launchTime = null;

  @SerializedName("ParameterDefinitions")
  private List<ParameterDefinitionForRunCommandInput> parameterDefinitions = null;

  @SerializedName("Parameters")
  private String parameters = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RecurrenceEndTime")
  private String recurrenceEndTime = null;

  @SerializedName("RepeatMode")
  private String repeatMode = null;

  @SerializedName("Tags")
  private List<TagForRunCommandInput> tags = null;

  @SerializedName("Timeout")
  private Integer timeout = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("Username")
  private String username = null;

  @SerializedName("WorkingDir")
  private String workingDir = null;

  public RunCommandRequest commandContent(String commandContent) {
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

  public RunCommandRequest contentEncoding(String contentEncoding) {
    this.contentEncoding = contentEncoding;
    return this;
  }

   /**
   * Get contentEncoding
   * @return contentEncoding
  **/
  @Schema(description = "")
  public String getContentEncoding() {
    return contentEncoding;
  }

  public void setContentEncoding(String contentEncoding) {
    this.contentEncoding = contentEncoding;
  }

  public RunCommandRequest enableParameter(Boolean enableParameter) {
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

  public RunCommandRequest frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @Schema(description = "")
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public RunCommandRequest instanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
    return this;
  }

  public RunCommandRequest addInstanceIdsItem(String instanceIdsItem) {
    if (this.instanceIds == null) {
      this.instanceIds = new ArrayList<String>();
    }
    this.instanceIds.add(instanceIdsItem);
    return this;
  }

   /**
   * Get instanceIds
   * @return instanceIds
  **/
  @Schema(description = "")
  public List<String> getInstanceIds() {
    return instanceIds;
  }

  public void setInstanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
  }

  public RunCommandRequest invocationDescription(String invocationDescription) {
    this.invocationDescription = invocationDescription;
    return this;
  }

   /**
   * Get invocationDescription
   * @return invocationDescription
  **/
  @Schema(description = "")
  public String getInvocationDescription() {
    return invocationDescription;
  }

  public void setInvocationDescription(String invocationDescription) {
    this.invocationDescription = invocationDescription;
  }

  public RunCommandRequest invocationName(String invocationName) {
    this.invocationName = invocationName;
    return this;
  }

   /**
   * Get invocationName
   * @return invocationName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInvocationName() {
    return invocationName;
  }

  public void setInvocationName(String invocationName) {
    this.invocationName = invocationName;
  }

  public RunCommandRequest launchTime(String launchTime) {
    this.launchTime = launchTime;
    return this;
  }

   /**
   * Get launchTime
   * @return launchTime
  **/
  @Schema(description = "")
  public String getLaunchTime() {
    return launchTime;
  }

  public void setLaunchTime(String launchTime) {
    this.launchTime = launchTime;
  }

  public RunCommandRequest parameterDefinitions(List<ParameterDefinitionForRunCommandInput> parameterDefinitions) {
    this.parameterDefinitions = parameterDefinitions;
    return this;
  }

  public RunCommandRequest addParameterDefinitionsItem(ParameterDefinitionForRunCommandInput parameterDefinitionsItem) {
    if (this.parameterDefinitions == null) {
      this.parameterDefinitions = new ArrayList<ParameterDefinitionForRunCommandInput>();
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
  public List<ParameterDefinitionForRunCommandInput> getParameterDefinitions() {
    return parameterDefinitions;
  }

  public void setParameterDefinitions(List<ParameterDefinitionForRunCommandInput> parameterDefinitions) {
    this.parameterDefinitions = parameterDefinitions;
  }

  public RunCommandRequest parameters(String parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @Schema(description = "")
  public String getParameters() {
    return parameters;
  }

  public void setParameters(String parameters) {
    this.parameters = parameters;
  }

  public RunCommandRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public RunCommandRequest recurrenceEndTime(String recurrenceEndTime) {
    this.recurrenceEndTime = recurrenceEndTime;
    return this;
  }

   /**
   * Get recurrenceEndTime
   * @return recurrenceEndTime
  **/
  @Schema(description = "")
  public String getRecurrenceEndTime() {
    return recurrenceEndTime;
  }

  public void setRecurrenceEndTime(String recurrenceEndTime) {
    this.recurrenceEndTime = recurrenceEndTime;
  }

  public RunCommandRequest repeatMode(String repeatMode) {
    this.repeatMode = repeatMode;
    return this;
  }

   /**
   * Get repeatMode
   * @return repeatMode
  **/
  @Schema(description = "")
  public String getRepeatMode() {
    return repeatMode;
  }

  public void setRepeatMode(String repeatMode) {
    this.repeatMode = repeatMode;
  }

  public RunCommandRequest tags(List<TagForRunCommandInput> tags) {
    this.tags = tags;
    return this;
  }

  public RunCommandRequest addTagsItem(TagForRunCommandInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForRunCommandInput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForRunCommandInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForRunCommandInput> tags) {
    this.tags = tags;
  }

  public RunCommandRequest timeout(Integer timeout) {
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

  public RunCommandRequest type(String type) {
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

  public RunCommandRequest username(String username) {
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

  public RunCommandRequest workingDir(String workingDir) {
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
    RunCommandRequest runCommandRequest = (RunCommandRequest) o;
    return Objects.equals(this.commandContent, runCommandRequest.commandContent) &&
        Objects.equals(this.contentEncoding, runCommandRequest.contentEncoding) &&
        Objects.equals(this.enableParameter, runCommandRequest.enableParameter) &&
        Objects.equals(this.frequency, runCommandRequest.frequency) &&
        Objects.equals(this.instanceIds, runCommandRequest.instanceIds) &&
        Objects.equals(this.invocationDescription, runCommandRequest.invocationDescription) &&
        Objects.equals(this.invocationName, runCommandRequest.invocationName) &&
        Objects.equals(this.launchTime, runCommandRequest.launchTime) &&
        Objects.equals(this.parameterDefinitions, runCommandRequest.parameterDefinitions) &&
        Objects.equals(this.parameters, runCommandRequest.parameters) &&
        Objects.equals(this.projectName, runCommandRequest.projectName) &&
        Objects.equals(this.recurrenceEndTime, runCommandRequest.recurrenceEndTime) &&
        Objects.equals(this.repeatMode, runCommandRequest.repeatMode) &&
        Objects.equals(this.tags, runCommandRequest.tags) &&
        Objects.equals(this.timeout, runCommandRequest.timeout) &&
        Objects.equals(this.type, runCommandRequest.type) &&
        Objects.equals(this.username, runCommandRequest.username) &&
        Objects.equals(this.workingDir, runCommandRequest.workingDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandContent, contentEncoding, enableParameter, frequency, instanceIds, invocationDescription, invocationName, launchTime, parameterDefinitions, parameters, projectName, recurrenceEndTime, repeatMode, tags, timeout, type, username, workingDir);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunCommandRequest {\n");
    
    sb.append("    commandContent: ").append(toIndentedString(commandContent)).append("\n");
    sb.append("    contentEncoding: ").append(toIndentedString(contentEncoding)).append("\n");
    sb.append("    enableParameter: ").append(toIndentedString(enableParameter)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
    sb.append("    invocationDescription: ").append(toIndentedString(invocationDescription)).append("\n");
    sb.append("    invocationName: ").append(toIndentedString(invocationName)).append("\n");
    sb.append("    launchTime: ").append(toIndentedString(launchTime)).append("\n");
    sb.append("    parameterDefinitions: ").append(toIndentedString(parameterDefinitions)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    recurrenceEndTime: ").append(toIndentedString(recurrenceEndTime)).append("\n");
    sb.append("    repeatMode: ").append(toIndentedString(repeatMode)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
