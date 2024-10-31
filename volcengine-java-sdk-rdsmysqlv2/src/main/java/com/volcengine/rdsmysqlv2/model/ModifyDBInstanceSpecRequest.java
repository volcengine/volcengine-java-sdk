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
import com.volcengine.rdsmysqlv2.model.NodeInfoForModifyDBInstanceSpecInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyDBInstanceSpecRequest
 */



public class ModifyDBInstanceSpecRequest {
  @SerializedName("InstanceId")
  private String instanceId = null;

  /**
   * Gets or Sets modifyType
   */
  @JsonAdapter(ModifyTypeEnum.Adapter.class)
  public enum ModifyTypeEnum {
    @SerializedName("Usually")
    USUALLY("Usually"),
    @SerializedName("Temporary")
    TEMPORARY("Temporary");

    private String value;

    ModifyTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ModifyTypeEnum fromValue(String input) {
      for (ModifyTypeEnum b : ModifyTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ModifyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModifyTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ModifyTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ModifyTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ModifyType")
  private ModifyTypeEnum modifyType = null;

  @SerializedName("NodeInfo")
  private List<NodeInfoForModifyDBInstanceSpecInput> nodeInfo = null;

  @SerializedName("StorageSpace")
  private Integer storageSpace = null;

  /**
   * Gets or Sets storageType
   */
  @JsonAdapter(StorageTypeEnum.Adapter.class)
  public enum StorageTypeEnum {
    @SerializedName("LocalSSD")
    LOCALSSD("LocalSSD"),
    @SerializedName("CloudStorage")
    CLOUDSTORAGE("CloudStorage"),
    @SerializedName("ESSDPL1")
    ESSDPL1("ESSDPL1"),
    @SerializedName("ESSDPL2")
    ESSDPL2("ESSDPL2");

    private String value;

    StorageTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StorageTypeEnum fromValue(String input) {
      for (StorageTypeEnum b : StorageTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StorageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StorageTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StorageTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StorageTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("StorageType")
  private StorageTypeEnum storageType = null;

  /**
   * Gets or Sets switchType
   */
  @JsonAdapter(SwitchTypeEnum.Adapter.class)
  public enum SwitchTypeEnum {
    @SerializedName("Immediate")
    IMMEDIATE("Immediate"),
    @SerializedName("MaintainTime")
    MAINTAINTIME("MaintainTime"),
    @SerializedName("SpecifiedTime")
    SPECIFIEDTIME("SpecifiedTime");

    private String value;

    SwitchTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SwitchTypeEnum fromValue(String input) {
      for (SwitchTypeEnum b : SwitchTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SwitchTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SwitchTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SwitchTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SwitchTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("SwitchType")
  private SwitchTypeEnum switchType = null;

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

  public ModifyDBInstanceSpecRequest modifyType(ModifyTypeEnum modifyType) {
    this.modifyType = modifyType;
    return this;
  }

   /**
   * Get modifyType
   * @return modifyType
  **/
  @Schema(description = "")
  public ModifyTypeEnum getModifyType() {
    return modifyType;
  }

  public void setModifyType(ModifyTypeEnum modifyType) {
    this.modifyType = modifyType;
  }

  public ModifyDBInstanceSpecRequest nodeInfo(List<NodeInfoForModifyDBInstanceSpecInput> nodeInfo) {
    this.nodeInfo = nodeInfo;
    return this;
  }

  public ModifyDBInstanceSpecRequest addNodeInfoItem(NodeInfoForModifyDBInstanceSpecInput nodeInfoItem) {
    if (this.nodeInfo == null) {
      this.nodeInfo = new ArrayList<NodeInfoForModifyDBInstanceSpecInput>();
    }
    this.nodeInfo.add(nodeInfoItem);
    return this;
  }

   /**
   * Get nodeInfo
   * @return nodeInfo
  **/
  @Valid
  @Schema(description = "")
  public List<NodeInfoForModifyDBInstanceSpecInput> getNodeInfo() {
    return nodeInfo;
  }

  public void setNodeInfo(List<NodeInfoForModifyDBInstanceSpecInput> nodeInfo) {
    this.nodeInfo = nodeInfo;
  }

  public ModifyDBInstanceSpecRequest storageSpace(Integer storageSpace) {
    this.storageSpace = storageSpace;
    return this;
  }

   /**
   * Get storageSpace
   * @return storageSpace
  **/
  @Schema(description = "")
  public Integer getStorageSpace() {
    return storageSpace;
  }

  public void setStorageSpace(Integer storageSpace) {
    this.storageSpace = storageSpace;
  }

  public ModifyDBInstanceSpecRequest storageType(StorageTypeEnum storageType) {
    this.storageType = storageType;
    return this;
  }

   /**
   * Get storageType
   * @return storageType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public StorageTypeEnum getStorageType() {
    return storageType;
  }

  public void setStorageType(StorageTypeEnum storageType) {
    this.storageType = storageType;
  }

  public ModifyDBInstanceSpecRequest switchType(SwitchTypeEnum switchType) {
    this.switchType = switchType;
    return this;
  }

   /**
   * Get switchType
   * @return switchType
  **/
  @Schema(description = "")
  public SwitchTypeEnum getSwitchType() {
    return switchType;
  }

  public void setSwitchType(SwitchTypeEnum switchType) {
    this.switchType = switchType;
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
        Objects.equals(this.modifyType, modifyDBInstanceSpecRequest.modifyType) &&
        Objects.equals(this.nodeInfo, modifyDBInstanceSpecRequest.nodeInfo) &&
        Objects.equals(this.storageSpace, modifyDBInstanceSpecRequest.storageSpace) &&
        Objects.equals(this.storageType, modifyDBInstanceSpecRequest.storageType) &&
        Objects.equals(this.switchType, modifyDBInstanceSpecRequest.switchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, modifyType, nodeInfo, storageSpace, storageType, switchType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDBInstanceSpecRequest {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    modifyType: ").append(toIndentedString(modifyType)).append("\n");
    sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
    sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    switchType: ").append(toIndentedString(switchType)).append("\n");
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
