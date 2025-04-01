/*
 * edx
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.edx.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.edx.model.ModuleListForListDXPSpecificationsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DXPSpecificationForListDXPSpecificationsOutput
 */



public class DXPSpecificationForListDXPSpecificationsOutput {
  @SerializedName("ModuleList")
  private ModuleListForListDXPSpecificationsOutput moduleList = null;

  @SerializedName("ModuleType")
  private List<String> moduleType = null;

  @SerializedName("PortType")
  private String portType = null;

  public DXPSpecificationForListDXPSpecificationsOutput moduleList(ModuleListForListDXPSpecificationsOutput moduleList) {
    this.moduleList = moduleList;
    return this;
  }

   /**
   * Get moduleList
   * @return moduleList
  **/
  @Valid
  @Schema(description = "")
  public ModuleListForListDXPSpecificationsOutput getModuleList() {
    return moduleList;
  }

  public void setModuleList(ModuleListForListDXPSpecificationsOutput moduleList) {
    this.moduleList = moduleList;
  }

  public DXPSpecificationForListDXPSpecificationsOutput moduleType(List<String> moduleType) {
    this.moduleType = moduleType;
    return this;
  }

  public DXPSpecificationForListDXPSpecificationsOutput addModuleTypeItem(String moduleTypeItem) {
    if (this.moduleType == null) {
      this.moduleType = new ArrayList<String>();
    }
    this.moduleType.add(moduleTypeItem);
    return this;
  }

   /**
   * Get moduleType
   * @return moduleType
  **/
  @Schema(description = "")
  public List<String> getModuleType() {
    return moduleType;
  }

  public void setModuleType(List<String> moduleType) {
    this.moduleType = moduleType;
  }

  public DXPSpecificationForListDXPSpecificationsOutput portType(String portType) {
    this.portType = portType;
    return this;
  }

   /**
   * Get portType
   * @return portType
  **/
  @Schema(description = "")
  public String getPortType() {
    return portType;
  }

  public void setPortType(String portType) {
    this.portType = portType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DXPSpecificationForListDXPSpecificationsOutput dxPSpecificationForListDXPSpecificationsOutput = (DXPSpecificationForListDXPSpecificationsOutput) o;
    return Objects.equals(this.moduleList, dxPSpecificationForListDXPSpecificationsOutput.moduleList) &&
        Objects.equals(this.moduleType, dxPSpecificationForListDXPSpecificationsOutput.moduleType) &&
        Objects.equals(this.portType, dxPSpecificationForListDXPSpecificationsOutput.portType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moduleList, moduleType, portType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DXPSpecificationForListDXPSpecificationsOutput {\n");
    
    sb.append("    moduleList: ").append(toIndentedString(moduleList)).append("\n");
    sb.append("    moduleType: ").append(toIndentedString(moduleType)).append("\n");
    sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
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
