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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * AvailableResourceForDescribeAvailableResourceOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-04-11T19:55:49.837979+08:00[Asia/Shanghai]")
public class AvailableResourceForDescribeAvailableResourceOutput {
  @SerializedName("SupportedResources")
  private List<SupportedResourceForDescribeAvailableResourceOutput> supportedResources = null;

  @SerializedName("Type")
  private String type = null;

  public AvailableResourceForDescribeAvailableResourceOutput supportedResources(List<SupportedResourceForDescribeAvailableResourceOutput> supportedResources) {
    this.supportedResources = supportedResources;
    return this;
  }

  public AvailableResourceForDescribeAvailableResourceOutput addSupportedResourcesItem(SupportedResourceForDescribeAvailableResourceOutput supportedResourcesItem) {
    if (this.supportedResources == null) {
      this.supportedResources = new ArrayList<SupportedResourceForDescribeAvailableResourceOutput>();
    }
    this.supportedResources.add(supportedResourcesItem);
    return this;
  }

   /**
   * Get supportedResources
   * @return supportedResources
  **/
  @Valid
  @Schema(description = "")
  public List<SupportedResourceForDescribeAvailableResourceOutput> getSupportedResources() {
    return supportedResources;
  }

  public void setSupportedResources(List<SupportedResourceForDescribeAvailableResourceOutput> supportedResources) {
    this.supportedResources = supportedResources;
  }

  public AvailableResourceForDescribeAvailableResourceOutput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableResourceForDescribeAvailableResourceOutput availableResourceForDescribeAvailableResourceOutput = (AvailableResourceForDescribeAvailableResourceOutput) o;
    return Objects.equals(this.supportedResources, availableResourceForDescribeAvailableResourceOutput.supportedResources) &&
        Objects.equals(this.type, availableResourceForDescribeAvailableResourceOutput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedResources, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableResourceForDescribeAvailableResourceOutput {\n");
    
    sb.append("    supportedResources: ").append(toIndentedString(supportedResources)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
