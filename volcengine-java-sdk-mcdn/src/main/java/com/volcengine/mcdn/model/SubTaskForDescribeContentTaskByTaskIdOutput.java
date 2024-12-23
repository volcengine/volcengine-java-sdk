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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SubTaskForDescribeContentTaskByTaskIdOutput
 */



public class SubTaskForDescribeContentTaskByTaskIdOutput {
  @SerializedName("CloudAccountId")
  private String cloudAccountId = null;

  @SerializedName("CloudAccountName")
  private String cloudAccountName = null;

  @SerializedName("CreatedAt")
  private Long createdAt = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ProductType")
  private String productType = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubProduct")
  private String subProduct = null;

  @SerializedName("TaskId")
  private String taskId = null;

  @SerializedName("TaskType")
  private String taskType = null;

  @SerializedName("Url")
  private String url = null;

  @SerializedName("Vendor")
  private String vendor = null;

  @SerializedName("VendorTaskIds")
  private List<String> vendorTaskIds = null;

  public SubTaskForDescribeContentTaskByTaskIdOutput cloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * Get cloudAccountId
   * @return cloudAccountId
  **/
  @Schema(description = "")
  public String getCloudAccountId() {
    return cloudAccountId;
  }

  public void setCloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }

  public SubTaskForDescribeContentTaskByTaskIdOutput cloudAccountName(String cloudAccountName) {
    this.cloudAccountName = cloudAccountName;
    return this;
  }

   /**
   * Get cloudAccountName
   * @return cloudAccountName
  **/
  @Schema(description = "")
  public String getCloudAccountName() {
    return cloudAccountName;
  }

  public void setCloudAccountName(String cloudAccountName) {
    this.cloudAccountName = cloudAccountName;
  }

  public SubTaskForDescribeContentTaskByTaskIdOutput createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public SubTaskForDescribeContentTaskByTaskIdOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SubTaskForDescribeContentTaskByTaskIdOutput productType(String productType) {
    this.productType = productType;
    return this;
  }

   /**
   * Get productType
   * @return productType
  **/
  @Schema(description = "")
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public SubTaskForDescribeContentTaskByTaskIdOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SubTaskForDescribeContentTaskByTaskIdOutput subProduct(String subProduct) {
    this.subProduct = subProduct;
    return this;
  }

   /**
   * Get subProduct
   * @return subProduct
  **/
  @Schema(description = "")
  public String getSubProduct() {
    return subProduct;
  }

  public void setSubProduct(String subProduct) {
    this.subProduct = subProduct;
  }

  public SubTaskForDescribeContentTaskByTaskIdOutput taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @Schema(description = "")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public SubTaskForDescribeContentTaskByTaskIdOutput taskType(String taskType) {
    this.taskType = taskType;
    return this;
  }

   /**
   * Get taskType
   * @return taskType
  **/
  @Schema(description = "")
  public String getTaskType() {
    return taskType;
  }

  public void setTaskType(String taskType) {
    this.taskType = taskType;
  }

  public SubTaskForDescribeContentTaskByTaskIdOutput url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SubTaskForDescribeContentTaskByTaskIdOutput vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @Schema(description = "")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public SubTaskForDescribeContentTaskByTaskIdOutput vendorTaskIds(List<String> vendorTaskIds) {
    this.vendorTaskIds = vendorTaskIds;
    return this;
  }

  public SubTaskForDescribeContentTaskByTaskIdOutput addVendorTaskIdsItem(String vendorTaskIdsItem) {
    if (this.vendorTaskIds == null) {
      this.vendorTaskIds = new ArrayList<String>();
    }
    this.vendorTaskIds.add(vendorTaskIdsItem);
    return this;
  }

   /**
   * Get vendorTaskIds
   * @return vendorTaskIds
  **/
  @Schema(description = "")
  public List<String> getVendorTaskIds() {
    return vendorTaskIds;
  }

  public void setVendorTaskIds(List<String> vendorTaskIds) {
    this.vendorTaskIds = vendorTaskIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubTaskForDescribeContentTaskByTaskIdOutput subTaskForDescribeContentTaskByTaskIdOutput = (SubTaskForDescribeContentTaskByTaskIdOutput) o;
    return Objects.equals(this.cloudAccountId, subTaskForDescribeContentTaskByTaskIdOutput.cloudAccountId) &&
        Objects.equals(this.cloudAccountName, subTaskForDescribeContentTaskByTaskIdOutput.cloudAccountName) &&
        Objects.equals(this.createdAt, subTaskForDescribeContentTaskByTaskIdOutput.createdAt) &&
        Objects.equals(this.description, subTaskForDescribeContentTaskByTaskIdOutput.description) &&
        Objects.equals(this.productType, subTaskForDescribeContentTaskByTaskIdOutput.productType) &&
        Objects.equals(this.status, subTaskForDescribeContentTaskByTaskIdOutput.status) &&
        Objects.equals(this.subProduct, subTaskForDescribeContentTaskByTaskIdOutput.subProduct) &&
        Objects.equals(this.taskId, subTaskForDescribeContentTaskByTaskIdOutput.taskId) &&
        Objects.equals(this.taskType, subTaskForDescribeContentTaskByTaskIdOutput.taskType) &&
        Objects.equals(this.url, subTaskForDescribeContentTaskByTaskIdOutput.url) &&
        Objects.equals(this.vendor, subTaskForDescribeContentTaskByTaskIdOutput.vendor) &&
        Objects.equals(this.vendorTaskIds, subTaskForDescribeContentTaskByTaskIdOutput.vendorTaskIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAccountId, cloudAccountName, createdAt, description, productType, status, subProduct, taskId, taskType, url, vendor, vendorTaskIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubTaskForDescribeContentTaskByTaskIdOutput {\n");
    
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    cloudAccountName: ").append(toIndentedString(cloudAccountName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subProduct: ").append(toIndentedString(subProduct)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    vendorTaskIds: ").append(toIndentedString(vendorTaskIds)).append("\n");
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
