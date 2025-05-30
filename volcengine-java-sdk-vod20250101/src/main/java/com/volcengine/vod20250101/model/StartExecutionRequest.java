/*
 * vod20250101
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vod20250101.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vod20250101.model.ControlForStartExecutionInput;
import com.volcengine.vod20250101.model.InputForStartExecutionInput;
import com.volcengine.vod20250101.model.MultiInputForStartExecutionInput;
import com.volcengine.vod20250101.model.OperationForStartExecutionInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * StartExecutionRequest
 */



public class StartExecutionRequest {
  @SerializedName("Control")
  private ControlForStartExecutionInput control = null;

  @SerializedName("Input")
  private InputForStartExecutionInput input = null;

  @SerializedName("MultiInputs")
  private List<MultiInputForStartExecutionInput> multiInputs = null;

  @SerializedName("Operation")
  private OperationForStartExecutionInput operation = null;

  public StartExecutionRequest control(ControlForStartExecutionInput control) {
    this.control = control;
    return this;
  }

   /**
   * Get control
   * @return control
  **/
  @Valid
  @Schema(description = "")
  public ControlForStartExecutionInput getControl() {
    return control;
  }

  public void setControl(ControlForStartExecutionInput control) {
    this.control = control;
  }

  public StartExecutionRequest input(InputForStartExecutionInput input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @Valid
  @Schema(description = "")
  public InputForStartExecutionInput getInput() {
    return input;
  }

  public void setInput(InputForStartExecutionInput input) {
    this.input = input;
  }

  public StartExecutionRequest multiInputs(List<MultiInputForStartExecutionInput> multiInputs) {
    this.multiInputs = multiInputs;
    return this;
  }

  public StartExecutionRequest addMultiInputsItem(MultiInputForStartExecutionInput multiInputsItem) {
    if (this.multiInputs == null) {
      this.multiInputs = new ArrayList<MultiInputForStartExecutionInput>();
    }
    this.multiInputs.add(multiInputsItem);
    return this;
  }

   /**
   * Get multiInputs
   * @return multiInputs
  **/
  @Valid
  @Schema(description = "")
  public List<MultiInputForStartExecutionInput> getMultiInputs() {
    return multiInputs;
  }

  public void setMultiInputs(List<MultiInputForStartExecutionInput> multiInputs) {
    this.multiInputs = multiInputs;
  }

  public StartExecutionRequest operation(OperationForStartExecutionInput operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @Valid
  @Schema(description = "")
  public OperationForStartExecutionInput getOperation() {
    return operation;
  }

  public void setOperation(OperationForStartExecutionInput operation) {
    this.operation = operation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartExecutionRequest startExecutionRequest = (StartExecutionRequest) o;
    return Objects.equals(this.control, startExecutionRequest.control) &&
        Objects.equals(this.input, startExecutionRequest.input) &&
        Objects.equals(this.multiInputs, startExecutionRequest.multiInputs) &&
        Objects.equals(this.operation, startExecutionRequest.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(control, input, multiInputs, operation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartExecutionRequest {\n");
    
    sb.append("    control: ").append(toIndentedString(control)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    multiInputs: ").append(toIndentedString(multiInputs)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
