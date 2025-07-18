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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CheckDetailForDescribeTaskDetailOutput
 */



public class CheckDetailForDescribeTaskDetailOutput {
  @SerializedName("Impact")
  private String impact = null;

  @SerializedName("Issue")
  private String issue = null;

  public CheckDetailForDescribeTaskDetailOutput impact(String impact) {
    this.impact = impact;
    return this;
  }

   /**
   * Get impact
   * @return impact
  **/
  @Schema(description = "")
  public String getImpact() {
    return impact;
  }

  public void setImpact(String impact) {
    this.impact = impact;
  }

  public CheckDetailForDescribeTaskDetailOutput issue(String issue) {
    this.issue = issue;
    return this;
  }

   /**
   * Get issue
   * @return issue
  **/
  @Schema(description = "")
  public String getIssue() {
    return issue;
  }

  public void setIssue(String issue) {
    this.issue = issue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckDetailForDescribeTaskDetailOutput checkDetailForDescribeTaskDetailOutput = (CheckDetailForDescribeTaskDetailOutput) o;
    return Objects.equals(this.impact, checkDetailForDescribeTaskDetailOutput.impact) &&
        Objects.equals(this.issue, checkDetailForDescribeTaskDetailOutput.issue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impact, issue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckDetailForDescribeTaskDetailOutput {\n");
    
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
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
