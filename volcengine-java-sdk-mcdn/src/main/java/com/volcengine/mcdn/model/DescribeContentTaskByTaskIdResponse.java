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
import com.volcengine.mcdn.model.SubTaskForDescribeContentTaskByTaskIdOutput;
import com.volcengine.mcdn.model.VendorsMetaDataForDescribeContentTaskByTaskIdOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeContentTaskByTaskIdResponse
 */



public class DescribeContentTaskByTaskIdResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("SubTasks")
  private List<SubTaskForDescribeContentTaskByTaskIdOutput> subTasks = null;

  @SerializedName("VendorsMetaData")
  private List<VendorsMetaDataForDescribeContentTaskByTaskIdOutput> vendorsMetaData = null;

  public DescribeContentTaskByTaskIdResponse subTasks(List<SubTaskForDescribeContentTaskByTaskIdOutput> subTasks) {
    this.subTasks = subTasks;
    return this;
  }

  public DescribeContentTaskByTaskIdResponse addSubTasksItem(SubTaskForDescribeContentTaskByTaskIdOutput subTasksItem) {
    if (this.subTasks == null) {
      this.subTasks = new ArrayList<SubTaskForDescribeContentTaskByTaskIdOutput>();
    }
    this.subTasks.add(subTasksItem);
    return this;
  }

   /**
   * Get subTasks
   * @return subTasks
  **/
  @Valid
  @Schema(description = "")
  public List<SubTaskForDescribeContentTaskByTaskIdOutput> getSubTasks() {
    return subTasks;
  }

  public void setSubTasks(List<SubTaskForDescribeContentTaskByTaskIdOutput> subTasks) {
    this.subTasks = subTasks;
  }

  public DescribeContentTaskByTaskIdResponse vendorsMetaData(List<VendorsMetaDataForDescribeContentTaskByTaskIdOutput> vendorsMetaData) {
    this.vendorsMetaData = vendorsMetaData;
    return this;
  }

  public DescribeContentTaskByTaskIdResponse addVendorsMetaDataItem(VendorsMetaDataForDescribeContentTaskByTaskIdOutput vendorsMetaDataItem) {
    if (this.vendorsMetaData == null) {
      this.vendorsMetaData = new ArrayList<VendorsMetaDataForDescribeContentTaskByTaskIdOutput>();
    }
    this.vendorsMetaData.add(vendorsMetaDataItem);
    return this;
  }

   /**
   * Get vendorsMetaData
   * @return vendorsMetaData
  **/
  @Valid
  @Schema(description = "")
  public List<VendorsMetaDataForDescribeContentTaskByTaskIdOutput> getVendorsMetaData() {
    return vendorsMetaData;
  }

  public void setVendorsMetaData(List<VendorsMetaDataForDescribeContentTaskByTaskIdOutput> vendorsMetaData) {
    this.vendorsMetaData = vendorsMetaData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeContentTaskByTaskIdResponse describeContentTaskByTaskIdResponse = (DescribeContentTaskByTaskIdResponse) o;
    return Objects.equals(this.subTasks, describeContentTaskByTaskIdResponse.subTasks) &&
        Objects.equals(this.vendorsMetaData, describeContentTaskByTaskIdResponse.vendorsMetaData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subTasks, vendorsMetaData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeContentTaskByTaskIdResponse {\n");
    
    sb.append("    subTasks: ").append(toIndentedString(subTasks)).append("\n");
    sb.append("    vendorsMetaData: ").append(toIndentedString(vendorsMetaData)).append("\n");
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