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
 * ZoneNodeInfoForCreateDBInstanceInput
 */


public class ZoneNodeInfoForCreateDBInstanceInput {
  @SerializedName("ZoneId")
  private String zoneId = null;

  @SerializedName("ZoneNodeNumber")
  private Integer zoneNodeNumber = null;

  public ZoneNodeInfoForCreateDBInstanceInput zoneId(String zoneId) {
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

  public ZoneNodeInfoForCreateDBInstanceInput zoneNodeNumber(Integer zoneNodeNumber) {
    this.zoneNodeNumber = zoneNodeNumber;
    return this;
  }

   /**
   * Get zoneNodeNumber
   * @return zoneNodeNumber
  **/
  @Schema(description = "")
  public Integer getZoneNodeNumber() {
    return zoneNodeNumber;
  }

  public void setZoneNodeNumber(Integer zoneNodeNumber) {
    this.zoneNodeNumber = zoneNodeNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZoneNodeInfoForCreateDBInstanceInput zoneNodeInfoForCreateDBInstanceInput = (ZoneNodeInfoForCreateDBInstanceInput) o;
    return Objects.equals(this.zoneId, zoneNodeInfoForCreateDBInstanceInput.zoneId) &&
        Objects.equals(this.zoneNodeNumber, zoneNodeInfoForCreateDBInstanceInput.zoneNodeNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zoneId, zoneNodeNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZoneNodeInfoForCreateDBInstanceInput {\n");
    
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    zoneNodeNumber: ").append(toIndentedString(zoneNodeNumber)).append("\n");
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
