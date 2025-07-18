/*
 * sec_agent
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.secagent.model;

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
 * FindingForGetAlarmDetailOutput
 */



public class FindingForGetAlarmDetailOutput {
  @SerializedName("AdoptReason")
  private String adoptReason = null;

  @SerializedName("Name")
  private String name = null;

  public FindingForGetAlarmDetailOutput adoptReason(String adoptReason) {
    this.adoptReason = adoptReason;
    return this;
  }

   /**
   * Get adoptReason
   * @return adoptReason
  **/
  @Schema(description = "")
  public String getAdoptReason() {
    return adoptReason;
  }

  public void setAdoptReason(String adoptReason) {
    this.adoptReason = adoptReason;
  }

  public FindingForGetAlarmDetailOutput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindingForGetAlarmDetailOutput findingForGetAlarmDetailOutput = (FindingForGetAlarmDetailOutput) o;
    return Objects.equals(this.adoptReason, findingForGetAlarmDetailOutput.adoptReason) &&
        Objects.equals(this.name, findingForGetAlarmDetailOutput.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adoptReason, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindingForGetAlarmDetailOutput {\n");
    
    sb.append("    adoptReason: ").append(toIndentedString(adoptReason)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
