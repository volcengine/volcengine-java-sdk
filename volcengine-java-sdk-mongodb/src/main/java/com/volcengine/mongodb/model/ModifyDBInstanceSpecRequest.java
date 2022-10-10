/*
 * mongodb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mongodb.model;

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
 * ModifyDBInstanceSpecRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-10T12:08:21.110021+08:00[Asia/Shanghai]")
public class ModifyDBInstanceSpecRequest {
  @SerializedName("InstanceId")
  private String instanceId = null;

  /**
   * Gets or Sets instanceType
   */
  @JsonAdapter(InstanceTypeEnum.Adapter.class)
  public enum InstanceTypeEnum {
    REPLICASET("ReplicaSet"),
    SHARDEDCLUSTER("ShardedCluster");

    private String value;

    InstanceTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static InstanceTypeEnum fromValue(String input) {
      for (InstanceTypeEnum b : InstanceTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<InstanceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstanceTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public InstanceTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return InstanceTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("InstanceType")
  private InstanceTypeEnum instanceType = null;

  @SerializedName("MongosNodeNumber")
  private Integer mongosNodeNumber = null;

  @SerializedName("MongosNodeSpec")
  private String mongosNodeSpec = null;

  @SerializedName("NodeSpec")
  private String nodeSpec = null;

  @SerializedName("ShardNumber")
  private Integer shardNumber = null;

  @SerializedName("StorageSpaceGB")
  private Integer storageSpaceGB = null;

  public ModifyDBInstanceSpecRequest instanceId(String instanceId) {
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

  public ModifyDBInstanceSpecRequest instanceType(InstanceTypeEnum instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public InstanceTypeEnum getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(InstanceTypeEnum instanceType) {
    this.instanceType = instanceType;
  }

  public ModifyDBInstanceSpecRequest mongosNodeNumber(Integer mongosNodeNumber) {
    this.mongosNodeNumber = mongosNodeNumber;
    return this;
  }

   /**
   * Get mongosNodeNumber
   * @return mongosNodeNumber
  **/
  @Schema(description = "")
  public Integer getMongosNodeNumber() {
    return mongosNodeNumber;
  }

  public void setMongosNodeNumber(Integer mongosNodeNumber) {
    this.mongosNodeNumber = mongosNodeNumber;
  }

  public ModifyDBInstanceSpecRequest mongosNodeSpec(String mongosNodeSpec) {
    this.mongosNodeSpec = mongosNodeSpec;
    return this;
  }

   /**
   * Get mongosNodeSpec
   * @return mongosNodeSpec
  **/
  @Schema(description = "")
  public String getMongosNodeSpec() {
    return mongosNodeSpec;
  }

  public void setMongosNodeSpec(String mongosNodeSpec) {
    this.mongosNodeSpec = mongosNodeSpec;
  }

  public ModifyDBInstanceSpecRequest nodeSpec(String nodeSpec) {
    this.nodeSpec = nodeSpec;
    return this;
  }

   /**
   * Get nodeSpec
   * @return nodeSpec
  **/
  @Schema(description = "")
  public String getNodeSpec() {
    return nodeSpec;
  }

  public void setNodeSpec(String nodeSpec) {
    this.nodeSpec = nodeSpec;
  }

  public ModifyDBInstanceSpecRequest shardNumber(Integer shardNumber) {
    this.shardNumber = shardNumber;
    return this;
  }

   /**
   * Get shardNumber
   * @return shardNumber
  **/
  @Schema(description = "")
  public Integer getShardNumber() {
    return shardNumber;
  }

  public void setShardNumber(Integer shardNumber) {
    this.shardNumber = shardNumber;
  }

  public ModifyDBInstanceSpecRequest storageSpaceGB(Integer storageSpaceGB) {
    this.storageSpaceGB = storageSpaceGB;
    return this;
  }

   /**
   * Get storageSpaceGB
   * @return storageSpaceGB
  **/
  @Schema(description = "")
  public Integer getStorageSpaceGB() {
    return storageSpaceGB;
  }

  public void setStorageSpaceGB(Integer storageSpaceGB) {
    this.storageSpaceGB = storageSpaceGB;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyDBInstanceSpecRequest modifyDBInstanceSpecRequest = (ModifyDBInstanceSpecRequest) o;
    return Objects.equals(this.instanceId, modifyDBInstanceSpecRequest.instanceId) &&
        Objects.equals(this.instanceType, modifyDBInstanceSpecRequest.instanceType) &&
        Objects.equals(this.mongosNodeNumber, modifyDBInstanceSpecRequest.mongosNodeNumber) &&
        Objects.equals(this.mongosNodeSpec, modifyDBInstanceSpecRequest.mongosNodeSpec) &&
        Objects.equals(this.nodeSpec, modifyDBInstanceSpecRequest.nodeSpec) &&
        Objects.equals(this.shardNumber, modifyDBInstanceSpecRequest.shardNumber) &&
        Objects.equals(this.storageSpaceGB, modifyDBInstanceSpecRequest.storageSpaceGB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, instanceType, mongosNodeNumber, mongosNodeSpec, nodeSpec, shardNumber, storageSpaceGB);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDBInstanceSpecRequest {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    mongosNodeNumber: ").append(toIndentedString(mongosNodeNumber)).append("\n");
    sb.append("    mongosNodeSpec: ").append(toIndentedString(mongosNodeSpec)).append("\n");
    sb.append("    nodeSpec: ").append(toIndentedString(nodeSpec)).append("\n");
    sb.append("    shardNumber: ").append(toIndentedString(shardNumber)).append("\n");
    sb.append("    storageSpaceGB: ").append(toIndentedString(storageSpaceGB)).append("\n");
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