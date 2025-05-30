/*
 * kafka
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.kafka.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.kafka.model.TagResourceForDescribeTagsByResourceOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeTagsByResourceResponse
 */



public class DescribeTagsByResourceResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("TagResources")
  private List<TagResourceForDescribeTagsByResourceOutput> tagResources = null;

  @SerializedName("Total")
  private Integer total = null;

  public DescribeTagsByResourceResponse tagResources(List<TagResourceForDescribeTagsByResourceOutput> tagResources) {
    this.tagResources = tagResources;
    return this;
  }

  public DescribeTagsByResourceResponse addTagResourcesItem(TagResourceForDescribeTagsByResourceOutput tagResourcesItem) {
    if (this.tagResources == null) {
      this.tagResources = new ArrayList<TagResourceForDescribeTagsByResourceOutput>();
    }
    this.tagResources.add(tagResourcesItem);
    return this;
  }

   /**
   * Get tagResources
   * @return tagResources
  **/
  @Valid
  @Schema(description = "")
  public List<TagResourceForDescribeTagsByResourceOutput> getTagResources() {
    return tagResources;
  }

  public void setTagResources(List<TagResourceForDescribeTagsByResourceOutput> tagResources) {
    this.tagResources = tagResources;
  }

  public DescribeTagsByResourceResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTagsByResourceResponse describeTagsByResourceResponse = (DescribeTagsByResourceResponse) o;
    return Objects.equals(this.tagResources, describeTagsByResourceResponse.tagResources) &&
        Objects.equals(this.total, describeTagsByResourceResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagResources, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTagsByResourceResponse {\n");
    
    sb.append("    tagResources: ").append(toIndentedString(tagResources)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
