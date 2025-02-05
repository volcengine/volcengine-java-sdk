/*
 * bio
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.bio.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.bio.model.ExposedOptionsForCreateSubmissionInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateSubmissionRequest
 */



public class CreateSubmissionRequest {
  @SerializedName("ClusterID")
  private String clusterID = null;

  @SerializedName("DataModelID")
  private String dataModelID = null;

  @SerializedName("DataModelRowIDs")
  private List<String> dataModelRowIDs = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ExposedOptions")
  private ExposedOptionsForCreateSubmissionInput exposedOptions = null;

  @SerializedName("Inputs")
  private String inputs = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Outputs")
  private String outputs = null;

  @SerializedName("WorkflowID")
  private String workflowID = null;

  @SerializedName("WorkspaceID")
  private String workspaceID = null;

  public CreateSubmissionRequest clusterID(String clusterID) {
    this.clusterID = clusterID;
    return this;
  }

   /**
   * Get clusterID
   * @return clusterID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getClusterID() {
    return clusterID;
  }

  public void setClusterID(String clusterID) {
    this.clusterID = clusterID;
  }

  public CreateSubmissionRequest dataModelID(String dataModelID) {
    this.dataModelID = dataModelID;
    return this;
  }

   /**
   * Get dataModelID
   * @return dataModelID
  **/
  @Schema(description = "")
  public String getDataModelID() {
    return dataModelID;
  }

  public void setDataModelID(String dataModelID) {
    this.dataModelID = dataModelID;
  }

  public CreateSubmissionRequest dataModelRowIDs(List<String> dataModelRowIDs) {
    this.dataModelRowIDs = dataModelRowIDs;
    return this;
  }

  public CreateSubmissionRequest addDataModelRowIDsItem(String dataModelRowIDsItem) {
    if (this.dataModelRowIDs == null) {
      this.dataModelRowIDs = new ArrayList<String>();
    }
    this.dataModelRowIDs.add(dataModelRowIDsItem);
    return this;
  }

   /**
   * Get dataModelRowIDs
   * @return dataModelRowIDs
  **/
  @Schema(description = "")
  public List<String> getDataModelRowIDs() {
    return dataModelRowIDs;
  }

  public void setDataModelRowIDs(List<String> dataModelRowIDs) {
    this.dataModelRowIDs = dataModelRowIDs;
  }

  public CreateSubmissionRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 @Size(max=1000)  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateSubmissionRequest exposedOptions(ExposedOptionsForCreateSubmissionInput exposedOptions) {
    this.exposedOptions = exposedOptions;
    return this;
  }

   /**
   * Get exposedOptions
   * @return exposedOptions
  **/
  @Valid
  @Schema(description = "")
  public ExposedOptionsForCreateSubmissionInput getExposedOptions() {
    return exposedOptions;
  }

  public void setExposedOptions(ExposedOptionsForCreateSubmissionInput exposedOptions) {
    this.exposedOptions = exposedOptions;
  }

  public CreateSubmissionRequest inputs(String inputs) {
    this.inputs = inputs;
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInputs() {
    return inputs;
  }

  public void setInputs(String inputs) {
    this.inputs = inputs;
  }

  public CreateSubmissionRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @NotNull
 @Size(min=11,max=409)  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateSubmissionRequest outputs(String outputs) {
    this.outputs = outputs;
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getOutputs() {
    return outputs;
  }

  public void setOutputs(String outputs) {
    this.outputs = outputs;
  }

  public CreateSubmissionRequest workflowID(String workflowID) {
    this.workflowID = workflowID;
    return this;
  }

   /**
   * Get workflowID
   * @return workflowID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getWorkflowID() {
    return workflowID;
  }

  public void setWorkflowID(String workflowID) {
    this.workflowID = workflowID;
  }

  public CreateSubmissionRequest workspaceID(String workspaceID) {
    this.workspaceID = workspaceID;
    return this;
  }

   /**
   * Get workspaceID
   * @return workspaceID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getWorkspaceID() {
    return workspaceID;
  }

  public void setWorkspaceID(String workspaceID) {
    this.workspaceID = workspaceID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubmissionRequest createSubmissionRequest = (CreateSubmissionRequest) o;
    return Objects.equals(this.clusterID, createSubmissionRequest.clusterID) &&
        Objects.equals(this.dataModelID, createSubmissionRequest.dataModelID) &&
        Objects.equals(this.dataModelRowIDs, createSubmissionRequest.dataModelRowIDs) &&
        Objects.equals(this.description, createSubmissionRequest.description) &&
        Objects.equals(this.exposedOptions, createSubmissionRequest.exposedOptions) &&
        Objects.equals(this.inputs, createSubmissionRequest.inputs) &&
        Objects.equals(this.name, createSubmissionRequest.name) &&
        Objects.equals(this.outputs, createSubmissionRequest.outputs) &&
        Objects.equals(this.workflowID, createSubmissionRequest.workflowID) &&
        Objects.equals(this.workspaceID, createSubmissionRequest.workspaceID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterID, dataModelID, dataModelRowIDs, description, exposedOptions, inputs, name, outputs, workflowID, workspaceID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubmissionRequest {\n");
    
    sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
    sb.append("    dataModelID: ").append(toIndentedString(dataModelID)).append("\n");
    sb.append("    dataModelRowIDs: ").append(toIndentedString(dataModelRowIDs)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    exposedOptions: ").append(toIndentedString(exposedOptions)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    workflowID: ").append(toIndentedString(workflowID)).append("\n");
    sb.append("    workspaceID: ").append(toIndentedString(workspaceID)).append("\n");
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
