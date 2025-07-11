/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysqlv2.model.NodeParameterValueDetailForDescribeDBNodeParameterDifferencesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NodeDifferentParameterForDescribeDBNodeParameterDifferencesOutput
 */



public class NodeDifferentParameterForDescribeDBNodeParameterDifferencesOutput {
  @SerializedName("NodeParameterValueDetails")
  private List<NodeParameterValueDetailForDescribeDBNodeParameterDifferencesOutput> nodeParameterValueDetails = null;

  @SerializedName("ParameterName")
  private String parameterName = null;

  public NodeDifferentParameterForDescribeDBNodeParameterDifferencesOutput nodeParameterValueDetails(List<NodeParameterValueDetailForDescribeDBNodeParameterDifferencesOutput> nodeParameterValueDetails) {
    this.nodeParameterValueDetails = nodeParameterValueDetails;
    return this;
  }

  public NodeDifferentParameterForDescribeDBNodeParameterDifferencesOutput addNodeParameterValueDetailsItem(NodeParameterValueDetailForDescribeDBNodeParameterDifferencesOutput nodeParameterValueDetailsItem) {
    if (this.nodeParameterValueDetails == null) {
      this.nodeParameterValueDetails = new ArrayList<NodeParameterValueDetailForDescribeDBNodeParameterDifferencesOutput>();
    }
    this.nodeParameterValueDetails.add(nodeParameterValueDetailsItem);
    return this;
  }

   /**
   * Get nodeParameterValueDetails
   * @return nodeParameterValueDetails
  **/
  @Valid
  @Schema(description = "")
  public List<NodeParameterValueDetailForDescribeDBNodeParameterDifferencesOutput> getNodeParameterValueDetails() {
    return nodeParameterValueDetails;
  }

  public void setNodeParameterValueDetails(List<NodeParameterValueDetailForDescribeDBNodeParameterDifferencesOutput> nodeParameterValueDetails) {
    this.nodeParameterValueDetails = nodeParameterValueDetails;
  }

  public NodeDifferentParameterForDescribeDBNodeParameterDifferencesOutput parameterName(String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

   /**
   * Get parameterName
   * @return parameterName
  **/
  @Schema(description = "")
  public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeDifferentParameterForDescribeDBNodeParameterDifferencesOutput nodeDifferentParameterForDescribeDBNodeParameterDifferencesOutput = (NodeDifferentParameterForDescribeDBNodeParameterDifferencesOutput) o;
    return Objects.equals(this.nodeParameterValueDetails, nodeDifferentParameterForDescribeDBNodeParameterDifferencesOutput.nodeParameterValueDetails) &&
        Objects.equals(this.parameterName, nodeDifferentParameterForDescribeDBNodeParameterDifferencesOutput.parameterName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeParameterValueDetails, parameterName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeDifferentParameterForDescribeDBNodeParameterDifferencesOutput {\n");
    
    sb.append("    nodeParameterValueDetails: ").append(toIndentedString(nodeParameterValueDetails)).append("\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
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
