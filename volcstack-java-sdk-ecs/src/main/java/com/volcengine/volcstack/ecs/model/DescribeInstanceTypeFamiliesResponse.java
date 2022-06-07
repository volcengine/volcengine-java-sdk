/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcstack.ecs.model.InstanceTypeFamilyForDescribeInstanceTypeFamiliesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeInstanceTypeFamiliesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class DescribeInstanceTypeFamiliesResponse {
  @SerializedName("InstanceTypeFamilies")
  private List<InstanceTypeFamilyForDescribeInstanceTypeFamiliesOutput> instanceTypeFamilies = null;

  public DescribeInstanceTypeFamiliesResponse instanceTypeFamilies(List<InstanceTypeFamilyForDescribeInstanceTypeFamiliesOutput> instanceTypeFamilies) {
    this.instanceTypeFamilies = instanceTypeFamilies;
    return this;
  }

  public DescribeInstanceTypeFamiliesResponse addInstanceTypeFamiliesItem(InstanceTypeFamilyForDescribeInstanceTypeFamiliesOutput instanceTypeFamiliesItem) {
    if (this.instanceTypeFamilies == null) {
      this.instanceTypeFamilies = new ArrayList<InstanceTypeFamilyForDescribeInstanceTypeFamiliesOutput>();
    }
    this.instanceTypeFamilies.add(instanceTypeFamiliesItem);
    return this;
  }

   /**
   * Get instanceTypeFamilies
   * @return instanceTypeFamilies
  **/
  @Valid
  @Schema(description = "")
  public List<InstanceTypeFamilyForDescribeInstanceTypeFamiliesOutput> getInstanceTypeFamilies() {
    return instanceTypeFamilies;
  }

  public void setInstanceTypeFamilies(List<InstanceTypeFamilyForDescribeInstanceTypeFamiliesOutput> instanceTypeFamilies) {
    this.instanceTypeFamilies = instanceTypeFamilies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeInstanceTypeFamiliesResponse describeInstanceTypeFamiliesResponse = (DescribeInstanceTypeFamiliesResponse) o;
    return Objects.equals(this.instanceTypeFamilies, describeInstanceTypeFamiliesResponse.instanceTypeFamilies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceTypeFamilies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeInstanceTypeFamiliesResponse {\n");
    
    sb.append("    instanceTypeFamilies: ").append(toIndentedString(instanceTypeFamilies)).append("\n");
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