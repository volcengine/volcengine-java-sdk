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
 * AssociatedInstanceForDescribeAllowListDetailOutput
 */



public class AssociatedInstanceForDescribeAllowListDetailOutput {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("VPC")
  private String VPC = null;

  public AssociatedInstanceForDescribeAllowListDetailOutput instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public AssociatedInstanceForDescribeAllowListDetailOutput instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * Get instanceName
   * @return instanceName
  **/
  @Schema(description = "")
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public AssociatedInstanceForDescribeAllowListDetailOutput projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public AssociatedInstanceForDescribeAllowListDetailOutput VPC(String VPC) {
    this.VPC = VPC;
    return this;
  }

   /**
   * Get VPC
   * @return VPC
  **/
  @Schema(description = "")
  public String getVPC() {
    return VPC;
  }

  public void setVPC(String VPC) {
    this.VPC = VPC;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociatedInstanceForDescribeAllowListDetailOutput associatedInstanceForDescribeAllowListDetailOutput = (AssociatedInstanceForDescribeAllowListDetailOutput) o;
    return Objects.equals(this.instanceId, associatedInstanceForDescribeAllowListDetailOutput.instanceId) &&
        Objects.equals(this.instanceName, associatedInstanceForDescribeAllowListDetailOutput.instanceName) &&
        Objects.equals(this.projectName, associatedInstanceForDescribeAllowListDetailOutput.projectName) &&
        Objects.equals(this.VPC, associatedInstanceForDescribeAllowListDetailOutput.VPC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, instanceName, projectName, VPC);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociatedInstanceForDescribeAllowListDetailOutput {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    VPC: ").append(toIndentedString(VPC)).append("\n");
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
