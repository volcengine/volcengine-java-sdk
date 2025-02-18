/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysqlv2.model.ParameterForModifyDBInstanceParametersInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyDBInstanceParametersRequest
 */



public class ModifyDBInstanceParametersRequest {
  @SerializedName("CustomNodeIds")
  private List<String> customNodeIds = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  /**
   * Gets or Sets paramApplyScope
   */
  @JsonAdapter(ParamApplyScopeEnum.Adapter.class)
  public enum ParamApplyScopeEnum {
    @SerializedName("AllNode")
    ALLNODE("AllNode"),
    @SerializedName("OnlyMasterSlaveNode")
    ONLYMASTERSLAVENODE("OnlyMasterSlaveNode"),
    @SerializedName("OnlyReadOnlyNode")
    ONLYREADONLYNODE("OnlyReadOnlyNode"),
    @SerializedName("CustomNode")
    CUSTOMNODE("CustomNode");

    private String value;

    ParamApplyScopeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ParamApplyScopeEnum fromValue(String input) {
      for (ParamApplyScopeEnum b : ParamApplyScopeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ParamApplyScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ParamApplyScopeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ParamApplyScopeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ParamApplyScopeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ParamApplyScope")
  private ParamApplyScopeEnum paramApplyScope = null;

  @SerializedName("Parameters")
  private List<ParameterForModifyDBInstanceParametersInput> parameters = null;

  public ModifyDBInstanceParametersRequest customNodeIds(List<String> customNodeIds) {
    this.customNodeIds = customNodeIds;
    return this;
  }

  public ModifyDBInstanceParametersRequest addCustomNodeIdsItem(String customNodeIdsItem) {
    if (this.customNodeIds == null) {
      this.customNodeIds = new ArrayList<String>();
    }
    this.customNodeIds.add(customNodeIdsItem);
    return this;
  }

   /**
   * Get customNodeIds
   * @return customNodeIds
  **/
  @Schema(description = "")
  public List<String> getCustomNodeIds() {
    return customNodeIds;
  }

  public void setCustomNodeIds(List<String> customNodeIds) {
    this.customNodeIds = customNodeIds;
  }

  public ModifyDBInstanceParametersRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ModifyDBInstanceParametersRequest paramApplyScope(ParamApplyScopeEnum paramApplyScope) {
    this.paramApplyScope = paramApplyScope;
    return this;
  }

   /**
   * Get paramApplyScope
   * @return paramApplyScope
  **/
  @Schema(description = "")
  public ParamApplyScopeEnum getParamApplyScope() {
    return paramApplyScope;
  }

  public void setParamApplyScope(ParamApplyScopeEnum paramApplyScope) {
    this.paramApplyScope = paramApplyScope;
  }

  public ModifyDBInstanceParametersRequest parameters(List<ParameterForModifyDBInstanceParametersInput> parameters) {
    this.parameters = parameters;
    return this;
  }

  public ModifyDBInstanceParametersRequest addParametersItem(ParameterForModifyDBInstanceParametersInput parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<ParameterForModifyDBInstanceParametersInput>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @Valid
  @Schema(description = "")
  public List<ParameterForModifyDBInstanceParametersInput> getParameters() {
    return parameters;
  }

  public void setParameters(List<ParameterForModifyDBInstanceParametersInput> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyDBInstanceParametersRequest modifyDBInstanceParametersRequest = (ModifyDBInstanceParametersRequest) o;
    return Objects.equals(this.customNodeIds, modifyDBInstanceParametersRequest.customNodeIds) &&
        Objects.equals(this.instanceId, modifyDBInstanceParametersRequest.instanceId) &&
        Objects.equals(this.paramApplyScope, modifyDBInstanceParametersRequest.paramApplyScope) &&
        Objects.equals(this.parameters, modifyDBInstanceParametersRequest.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customNodeIds, instanceId, paramApplyScope, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDBInstanceParametersRequest {\n");
    
    sb.append("    customNodeIds: ").append(toIndentedString(customNodeIds)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    paramApplyScope: ").append(toIndentedString(paramApplyScope)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
