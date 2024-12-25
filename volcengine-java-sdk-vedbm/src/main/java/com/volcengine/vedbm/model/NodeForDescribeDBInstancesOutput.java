/*
 * vedbm
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vedbm.model;

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
 * NodeForDescribeDBInstancesOutput
 */



public class NodeForDescribeDBInstancesOutput {
  @SerializedName("Memory")
  private Integer memory = null;

  @SerializedName("NodeId")
  private String nodeId = null;

  /**
   * Gets or Sets nodeSpec
   */
  @JsonAdapter(NodeSpecEnum.Adapter.class)
  public enum NodeSpecEnum {
    @SerializedName("vedb.mysql.x4.large")
    VEDB_MYSQL_X4_LARGE("vedb.mysql.x4.large"),
    @SerializedName("vedb.mysql.x8.large")
    VEDB_MYSQL_X8_LARGE("vedb.mysql.x8.large"),
    @SerializedName("vedb.mysql.x4.xlarge")
    VEDB_MYSQL_X4_XLARGE("vedb.mysql.x4.xlarge"),
    @SerializedName("vedb.mysql.x8.xlarge")
    VEDB_MYSQL_X8_XLARGE("vedb.mysql.x8.xlarge"),
    @SerializedName("vedb.mysql.x4.2xlarge")
    VEDB_MYSQL_X4_2XLARGE("vedb.mysql.x4.2xlarge"),
    @SerializedName("vedb.mysql.x8.2xlarge")
    VEDB_MYSQL_X8_2XLARGE("vedb.mysql.x8.2xlarge"),
    @SerializedName("vedb.mysql.x4.4xlarge")
    VEDB_MYSQL_X4_4XLARGE("vedb.mysql.x4.4xlarge"),
    @SerializedName("vedb.mysql.x8.4xlarge")
    VEDB_MYSQL_X8_4XLARGE("vedb.mysql.x8.4xlarge"),
    @SerializedName("vedb.mysql.x8.6xlarge")
    VEDB_MYSQL_X8_6XLARGE("vedb.mysql.x8.6xlarge"),
    @SerializedName("vedb.mysql.x4.8xlarge")
    VEDB_MYSQL_X4_8XLARGE("vedb.mysql.x4.8xlarge"),
    @SerializedName("vedb.mysql.x8.8xlarge")
    VEDB_MYSQL_X8_8XLARGE("vedb.mysql.x8.8xlarge"),
    @SerializedName("vedb.mysql.g4.large")
    VEDB_MYSQL_G4_LARGE("vedb.mysql.g4.large"),
    @SerializedName("vedb.mysql.g4.xlarge")
    VEDB_MYSQL_G4_XLARGE("vedb.mysql.g4.xlarge"),
    @SerializedName("vedb.mysql.g4.2xlarge")
    VEDB_MYSQL_G4_2XLARGE("vedb.mysql.g4.2xlarge"),
    @SerializedName("vedb.mysql.g8.2xlarge")
    VEDB_MYSQL_G8_2XLARGE("vedb.mysql.g8.2xlarge"),
    @SerializedName("vedb.mysql.g4.4xlarge")
    VEDB_MYSQL_G4_4XLARGE("vedb.mysql.g4.4xlarge");

    private String value;

    NodeSpecEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static NodeSpecEnum fromValue(String input) {
      for (NodeSpecEnum b : NodeSpecEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<NodeSpecEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NodeSpecEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public NodeSpecEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return NodeSpecEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("NodeSpec")
  private NodeSpecEnum nodeSpec = null;

  /**
   * Gets or Sets nodeType
   */
  @JsonAdapter(NodeTypeEnum.Adapter.class)
  public enum NodeTypeEnum {
    @SerializedName("Primary")
    PRIMARY("Primary"),
    @SerializedName("ReadOnly")
    READONLY("ReadOnly");

    private String value;

    NodeTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static NodeTypeEnum fromValue(String input) {
      for (NodeTypeEnum b : NodeTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<NodeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NodeTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public NodeTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return NodeTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("NodeType")
  private NodeTypeEnum nodeType = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  @SerializedName("vCPU")
  private Integer vCPU = null;

  public NodeForDescribeDBInstancesOutput memory(Integer memory) {
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @Schema(description = "")
  public Integer getMemory() {
    return memory;
  }

  public void setMemory(Integer memory) {
    this.memory = memory;
  }

  public NodeForDescribeDBInstancesOutput nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @Schema(description = "")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public NodeForDescribeDBInstancesOutput nodeSpec(NodeSpecEnum nodeSpec) {
    this.nodeSpec = nodeSpec;
    return this;
  }

   /**
   * Get nodeSpec
   * @return nodeSpec
  **/
  @Schema(description = "")
  public NodeSpecEnum getNodeSpec() {
    return nodeSpec;
  }

  public void setNodeSpec(NodeSpecEnum nodeSpec) {
    this.nodeSpec = nodeSpec;
  }

  public NodeForDescribeDBInstancesOutput nodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @Schema(description = "")
  public NodeTypeEnum getNodeType() {
    return nodeType;
  }

  public void setNodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
  }

  public NodeForDescribeDBInstancesOutput zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }

  public NodeForDescribeDBInstancesOutput vCPU(Integer vCPU) {
    this.vCPU = vCPU;
    return this;
  }

   /**
   * Get vCPU
   * @return vCPU
  **/
  @Schema(description = "")
  public Integer getVCPU() {
    return vCPU;
  }

  public void setVCPU(Integer vCPU) {
    this.vCPU = vCPU;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeForDescribeDBInstancesOutput nodeForDescribeDBInstancesOutput = (NodeForDescribeDBInstancesOutput) o;
    return Objects.equals(this.memory, nodeForDescribeDBInstancesOutput.memory) &&
        Objects.equals(this.nodeId, nodeForDescribeDBInstancesOutput.nodeId) &&
        Objects.equals(this.nodeSpec, nodeForDescribeDBInstancesOutput.nodeSpec) &&
        Objects.equals(this.nodeType, nodeForDescribeDBInstancesOutput.nodeType) &&
        Objects.equals(this.zoneId, nodeForDescribeDBInstancesOutput.zoneId) &&
        Objects.equals(this.vCPU, nodeForDescribeDBInstancesOutput.vCPU);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memory, nodeId, nodeSpec, nodeType, zoneId, vCPU);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeForDescribeDBInstancesOutput {\n");
    
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    nodeSpec: ").append(toIndentedString(nodeSpec)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    vCPU: ").append(toIndentedString(vCPU)).append("\n");
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
