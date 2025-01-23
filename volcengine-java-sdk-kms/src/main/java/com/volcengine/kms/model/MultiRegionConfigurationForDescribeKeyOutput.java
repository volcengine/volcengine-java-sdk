/*
 * kms
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.kms.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.kms.model.PrimaryKeyForDescribeKeyOutput;
import com.volcengine.kms.model.ReplicaKeyForDescribeKeyOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MultiRegionConfigurationForDescribeKeyOutput
 */



public class MultiRegionConfigurationForDescribeKeyOutput {
  /**
   * Gets or Sets multiRegionKeyType
   */
  @JsonAdapter(MultiRegionKeyTypeEnum.Adapter.class)
  public enum MultiRegionKeyTypeEnum {
    @SerializedName("PRIMARY")
    PRIMARY("PRIMARY"),
    @SerializedName("REPLICA")
    REPLICA("REPLICA");

    private String value;

    MultiRegionKeyTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MultiRegionKeyTypeEnum fromValue(String input) {
      for (MultiRegionKeyTypeEnum b : MultiRegionKeyTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MultiRegionKeyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MultiRegionKeyTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public MultiRegionKeyTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return MultiRegionKeyTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("MultiRegionKeyType")
  private MultiRegionKeyTypeEnum multiRegionKeyType = null;

  @SerializedName("PrimaryKey")
  private PrimaryKeyForDescribeKeyOutput primaryKey = null;

  @SerializedName("ReplicaKeys")
  private List<ReplicaKeyForDescribeKeyOutput> replicaKeys = null;

  public MultiRegionConfigurationForDescribeKeyOutput multiRegionKeyType(MultiRegionKeyTypeEnum multiRegionKeyType) {
    this.multiRegionKeyType = multiRegionKeyType;
    return this;
  }

   /**
   * Get multiRegionKeyType
   * @return multiRegionKeyType
  **/
  @Schema(description = "")
  public MultiRegionKeyTypeEnum getMultiRegionKeyType() {
    return multiRegionKeyType;
  }

  public void setMultiRegionKeyType(MultiRegionKeyTypeEnum multiRegionKeyType) {
    this.multiRegionKeyType = multiRegionKeyType;
  }

  public MultiRegionConfigurationForDescribeKeyOutput primaryKey(PrimaryKeyForDescribeKeyOutput primaryKey) {
    this.primaryKey = primaryKey;
    return this;
  }

   /**
   * Get primaryKey
   * @return primaryKey
  **/
  @Valid
  @Schema(description = "")
  public PrimaryKeyForDescribeKeyOutput getPrimaryKey() {
    return primaryKey;
  }

  public void setPrimaryKey(PrimaryKeyForDescribeKeyOutput primaryKey) {
    this.primaryKey = primaryKey;
  }

  public MultiRegionConfigurationForDescribeKeyOutput replicaKeys(List<ReplicaKeyForDescribeKeyOutput> replicaKeys) {
    this.replicaKeys = replicaKeys;
    return this;
  }

  public MultiRegionConfigurationForDescribeKeyOutput addReplicaKeysItem(ReplicaKeyForDescribeKeyOutput replicaKeysItem) {
    if (this.replicaKeys == null) {
      this.replicaKeys = new ArrayList<ReplicaKeyForDescribeKeyOutput>();
    }
    this.replicaKeys.add(replicaKeysItem);
    return this;
  }

   /**
   * Get replicaKeys
   * @return replicaKeys
  **/
  @Valid
  @Schema(description = "")
  public List<ReplicaKeyForDescribeKeyOutput> getReplicaKeys() {
    return replicaKeys;
  }

  public void setReplicaKeys(List<ReplicaKeyForDescribeKeyOutput> replicaKeys) {
    this.replicaKeys = replicaKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiRegionConfigurationForDescribeKeyOutput multiRegionConfigurationForDescribeKeyOutput = (MultiRegionConfigurationForDescribeKeyOutput) o;
    return Objects.equals(this.multiRegionKeyType, multiRegionConfigurationForDescribeKeyOutput.multiRegionKeyType) &&
        Objects.equals(this.primaryKey, multiRegionConfigurationForDescribeKeyOutput.primaryKey) &&
        Objects.equals(this.replicaKeys, multiRegionConfigurationForDescribeKeyOutput.replicaKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multiRegionKeyType, primaryKey, replicaKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiRegionConfigurationForDescribeKeyOutput {\n");
    
    sb.append("    multiRegionKeyType: ").append(toIndentedString(multiRegionKeyType)).append("\n");
    sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
    sb.append("    replicaKeys: ").append(toIndentedString(replicaKeys)).append("\n");
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
