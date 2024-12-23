/*
 * mcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcdn.model;

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
 * ContactRobotForDescribeAlertStrategyOutput
 */



public class ContactRobotForDescribeAlertStrategyOutput {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("RobotType")
  private String robotType = null;

  public ContactRobotForDescribeAlertStrategyOutput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ContactRobotForDescribeAlertStrategyOutput name(String name) {
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

  public ContactRobotForDescribeAlertStrategyOutput robotType(String robotType) {
    this.robotType = robotType;
    return this;
  }

   /**
   * Get robotType
   * @return robotType
  **/
  @Schema(description = "")
  public String getRobotType() {
    return robotType;
  }

  public void setRobotType(String robotType) {
    this.robotType = robotType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactRobotForDescribeAlertStrategyOutput contactRobotForDescribeAlertStrategyOutput = (ContactRobotForDescribeAlertStrategyOutput) o;
    return Objects.equals(this.id, contactRobotForDescribeAlertStrategyOutput.id) &&
        Objects.equals(this.name, contactRobotForDescribeAlertStrategyOutput.name) &&
        Objects.equals(this.robotType, contactRobotForDescribeAlertStrategyOutput.robotType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, robotType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactRobotForDescribeAlertStrategyOutput {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    robotType: ").append(toIndentedString(robotType)).append("\n");
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
