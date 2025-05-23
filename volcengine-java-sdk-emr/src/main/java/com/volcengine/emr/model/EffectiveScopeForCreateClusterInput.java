/*
 * emr
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.emr.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * EffectiveScopeForCreateClusterInput
 */



public class EffectiveScopeForCreateClusterInput {
  @SerializedName("ComponentNames")
  private List<String> componentNames = null;

  /**
   * Gets or Sets effectiveType
   */
  @JsonAdapter(EffectiveTypeEnum.Adapter.class)
  public enum EffectiveTypeEnum {
    @SerializedName("CLUSTER")
    CLUSTER("CLUSTER"),
    @SerializedName("NODE_GROUP_NAME")
    NODE_GROUP_NAME("NODE_GROUP_NAME"),
    @SerializedName("NODE_GROUP_ID")
    NODE_GROUP_ID("NODE_GROUP_ID"),
    @SerializedName("NODE_GROUP_TYPE")
    NODE_GROUP_TYPE("NODE_GROUP_TYPE"),
    @SerializedName("NODE_NAME")
    NODE_NAME("NODE_NAME"),
    @SerializedName("NODE_ID")
    NODE_ID("NODE_ID"),
    @SerializedName("COMPONENT_NAME")
    COMPONENT_NAME("COMPONENT_NAME");

    private String value;

    EffectiveTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EffectiveTypeEnum fromValue(String input) {
      for (EffectiveTypeEnum b : EffectiveTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EffectiveTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EffectiveTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EffectiveTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EffectiveTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("EffectiveType")
  private EffectiveTypeEnum effectiveType = null;

  @SerializedName("NodeGroupIds")
  private List<String> nodeGroupIds = null;

  @SerializedName("NodeGroupNames")
  private List<String> nodeGroupNames = null;

  @SerializedName("NodeGroupTypes")
  private List<String> nodeGroupTypes = null;

  @SerializedName("NodeIds")
  private List<String> nodeIds = null;

  @SerializedName("NodeNames")
  private List<String> nodeNames = null;

  public EffectiveScopeForCreateClusterInput componentNames(List<String> componentNames) {
    this.componentNames = componentNames;
    return this;
  }

  public EffectiveScopeForCreateClusterInput addComponentNamesItem(String componentNamesItem) {
    if (this.componentNames == null) {
      this.componentNames = new ArrayList<String>();
    }
    this.componentNames.add(componentNamesItem);
    return this;
  }

   /**
   * Get componentNames
   * @return componentNames
  **/
  @Schema(description = "")
  public List<String> getComponentNames() {
    return componentNames;
  }

  public void setComponentNames(List<String> componentNames) {
    this.componentNames = componentNames;
  }

  public EffectiveScopeForCreateClusterInput effectiveType(EffectiveTypeEnum effectiveType) {
    this.effectiveType = effectiveType;
    return this;
  }

   /**
   * Get effectiveType
   * @return effectiveType
  **/
  @Schema(description = "")
  public EffectiveTypeEnum getEffectiveType() {
    return effectiveType;
  }

  public void setEffectiveType(EffectiveTypeEnum effectiveType) {
    this.effectiveType = effectiveType;
  }

  public EffectiveScopeForCreateClusterInput nodeGroupIds(List<String> nodeGroupIds) {
    this.nodeGroupIds = nodeGroupIds;
    return this;
  }

  public EffectiveScopeForCreateClusterInput addNodeGroupIdsItem(String nodeGroupIdsItem) {
    if (this.nodeGroupIds == null) {
      this.nodeGroupIds = new ArrayList<String>();
    }
    this.nodeGroupIds.add(nodeGroupIdsItem);
    return this;
  }

   /**
   * Get nodeGroupIds
   * @return nodeGroupIds
  **/
  @Schema(description = "")
  public List<String> getNodeGroupIds() {
    return nodeGroupIds;
  }

  public void setNodeGroupIds(List<String> nodeGroupIds) {
    this.nodeGroupIds = nodeGroupIds;
  }

  public EffectiveScopeForCreateClusterInput nodeGroupNames(List<String> nodeGroupNames) {
    this.nodeGroupNames = nodeGroupNames;
    return this;
  }

  public EffectiveScopeForCreateClusterInput addNodeGroupNamesItem(String nodeGroupNamesItem) {
    if (this.nodeGroupNames == null) {
      this.nodeGroupNames = new ArrayList<String>();
    }
    this.nodeGroupNames.add(nodeGroupNamesItem);
    return this;
  }

   /**
   * Get nodeGroupNames
   * @return nodeGroupNames
  **/
  @Schema(description = "")
  public List<String> getNodeGroupNames() {
    return nodeGroupNames;
  }

  public void setNodeGroupNames(List<String> nodeGroupNames) {
    this.nodeGroupNames = nodeGroupNames;
  }

  public EffectiveScopeForCreateClusterInput nodeGroupTypes(List<String> nodeGroupTypes) {
    this.nodeGroupTypes = nodeGroupTypes;
    return this;
  }

  public EffectiveScopeForCreateClusterInput addNodeGroupTypesItem(String nodeGroupTypesItem) {
    if (this.nodeGroupTypes == null) {
      this.nodeGroupTypes = new ArrayList<String>();
    }
    this.nodeGroupTypes.add(nodeGroupTypesItem);
    return this;
  }

   /**
   * Get nodeGroupTypes
   * @return nodeGroupTypes
  **/
  @Schema(description = "")
  public List<String> getNodeGroupTypes() {
    return nodeGroupTypes;
  }

  public void setNodeGroupTypes(List<String> nodeGroupTypes) {
    this.nodeGroupTypes = nodeGroupTypes;
  }

  public EffectiveScopeForCreateClusterInput nodeIds(List<String> nodeIds) {
    this.nodeIds = nodeIds;
    return this;
  }

  public EffectiveScopeForCreateClusterInput addNodeIdsItem(String nodeIdsItem) {
    if (this.nodeIds == null) {
      this.nodeIds = new ArrayList<String>();
    }
    this.nodeIds.add(nodeIdsItem);
    return this;
  }

   /**
   * Get nodeIds
   * @return nodeIds
  **/
  @Schema(description = "")
  public List<String> getNodeIds() {
    return nodeIds;
  }

  public void setNodeIds(List<String> nodeIds) {
    this.nodeIds = nodeIds;
  }

  public EffectiveScopeForCreateClusterInput nodeNames(List<String> nodeNames) {
    this.nodeNames = nodeNames;
    return this;
  }

  public EffectiveScopeForCreateClusterInput addNodeNamesItem(String nodeNamesItem) {
    if (this.nodeNames == null) {
      this.nodeNames = new ArrayList<String>();
    }
    this.nodeNames.add(nodeNamesItem);
    return this;
  }

   /**
   * Get nodeNames
   * @return nodeNames
  **/
  @Schema(description = "")
  public List<String> getNodeNames() {
    return nodeNames;
  }

  public void setNodeNames(List<String> nodeNames) {
    this.nodeNames = nodeNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EffectiveScopeForCreateClusterInput effectiveScopeForCreateClusterInput = (EffectiveScopeForCreateClusterInput) o;
    return Objects.equals(this.componentNames, effectiveScopeForCreateClusterInput.componentNames) &&
        Objects.equals(this.effectiveType, effectiveScopeForCreateClusterInput.effectiveType) &&
        Objects.equals(this.nodeGroupIds, effectiveScopeForCreateClusterInput.nodeGroupIds) &&
        Objects.equals(this.nodeGroupNames, effectiveScopeForCreateClusterInput.nodeGroupNames) &&
        Objects.equals(this.nodeGroupTypes, effectiveScopeForCreateClusterInput.nodeGroupTypes) &&
        Objects.equals(this.nodeIds, effectiveScopeForCreateClusterInput.nodeIds) &&
        Objects.equals(this.nodeNames, effectiveScopeForCreateClusterInput.nodeNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentNames, effectiveType, nodeGroupIds, nodeGroupNames, nodeGroupTypes, nodeIds, nodeNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EffectiveScopeForCreateClusterInput {\n");
    
    sb.append("    componentNames: ").append(toIndentedString(componentNames)).append("\n");
    sb.append("    effectiveType: ").append(toIndentedString(effectiveType)).append("\n");
    sb.append("    nodeGroupIds: ").append(toIndentedString(nodeGroupIds)).append("\n");
    sb.append("    nodeGroupNames: ").append(toIndentedString(nodeGroupNames)).append("\n");
    sb.append("    nodeGroupTypes: ").append(toIndentedString(nodeGroupTypes)).append("\n");
    sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
    sb.append("    nodeNames: ").append(toIndentedString(nodeNames)).append("\n");
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
