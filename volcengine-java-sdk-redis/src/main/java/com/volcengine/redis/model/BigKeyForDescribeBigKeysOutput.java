/*
 * redis
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.redis.model;

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
 * BigKeyForDescribeBigKeysOutput
 */



public class BigKeyForDescribeBigKeysOutput {
  @SerializedName("DBName")
  private String dbName = null;

  @SerializedName("KeyInfo")
  private String keyInfo = null;

  @SerializedName("KeyType")
  private String keyType = null;

  @SerializedName("ValueLen")
  private String valueLen = null;

  @SerializedName("ValueSize")
  private String valueSize = null;

  public BigKeyForDescribeBigKeysOutput dbName(String dbName) {
    this.dbName = dbName;
    return this;
  }

   /**
   * Get dbName
   * @return dbName
  **/
  @Schema(description = "")
  public String getDbName() {
    return dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  public BigKeyForDescribeBigKeysOutput keyInfo(String keyInfo) {
    this.keyInfo = keyInfo;
    return this;
  }

   /**
   * Get keyInfo
   * @return keyInfo
  **/
  @Schema(description = "")
  public String getKeyInfo() {
    return keyInfo;
  }

  public void setKeyInfo(String keyInfo) {
    this.keyInfo = keyInfo;
  }

  public BigKeyForDescribeBigKeysOutput keyType(String keyType) {
    this.keyType = keyType;
    return this;
  }

   /**
   * Get keyType
   * @return keyType
  **/
  @Schema(description = "")
  public String getKeyType() {
    return keyType;
  }

  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }

  public BigKeyForDescribeBigKeysOutput valueLen(String valueLen) {
    this.valueLen = valueLen;
    return this;
  }

   /**
   * Get valueLen
   * @return valueLen
  **/
  @Schema(description = "")
  public String getValueLen() {
    return valueLen;
  }

  public void setValueLen(String valueLen) {
    this.valueLen = valueLen;
  }

  public BigKeyForDescribeBigKeysOutput valueSize(String valueSize) {
    this.valueSize = valueSize;
    return this;
  }

   /**
   * Get valueSize
   * @return valueSize
  **/
  @Schema(description = "")
  public String getValueSize() {
    return valueSize;
  }

  public void setValueSize(String valueSize) {
    this.valueSize = valueSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BigKeyForDescribeBigKeysOutput bigKeyForDescribeBigKeysOutput = (BigKeyForDescribeBigKeysOutput) o;
    return Objects.equals(this.dbName, bigKeyForDescribeBigKeysOutput.dbName) &&
        Objects.equals(this.keyInfo, bigKeyForDescribeBigKeysOutput.keyInfo) &&
        Objects.equals(this.keyType, bigKeyForDescribeBigKeysOutput.keyType) &&
        Objects.equals(this.valueLen, bigKeyForDescribeBigKeysOutput.valueLen) &&
        Objects.equals(this.valueSize, bigKeyForDescribeBigKeysOutput.valueSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbName, keyInfo, keyType, valueLen, valueSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BigKeyForDescribeBigKeysOutput {\n");
    
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
    sb.append("    keyInfo: ").append(toIndentedString(keyInfo)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    valueLen: ").append(toIndentedString(valueLen)).append("\n");
    sb.append("    valueSize: ").append(toIndentedString(valueSize)).append("\n");
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
