/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cdn.model.QueryStringComponentsForUpdateCdnConfigInput;
import com.volcengine.cdn.model.QueryStringInstanceForUpdateCdnConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * QueryStringRulesForUpdateCdnConfigInput
 */



public class QueryStringRulesForUpdateCdnConfigInput {
  @SerializedName("QueryStringComponents")
  private QueryStringComponentsForUpdateCdnConfigInput queryStringComponents = null;

  @SerializedName("QueryStringInstances")
  private List<QueryStringInstanceForUpdateCdnConfigInput> queryStringInstances = null;

  public QueryStringRulesForUpdateCdnConfigInput queryStringComponents(QueryStringComponentsForUpdateCdnConfigInput queryStringComponents) {
    this.queryStringComponents = queryStringComponents;
    return this;
  }

   /**
   * Get queryStringComponents
   * @return queryStringComponents
  **/
  @Valid
  @Schema(description = "")
  public QueryStringComponentsForUpdateCdnConfigInput getQueryStringComponents() {
    return queryStringComponents;
  }

  public void setQueryStringComponents(QueryStringComponentsForUpdateCdnConfigInput queryStringComponents) {
    this.queryStringComponents = queryStringComponents;
  }

  public QueryStringRulesForUpdateCdnConfigInput queryStringInstances(List<QueryStringInstanceForUpdateCdnConfigInput> queryStringInstances) {
    this.queryStringInstances = queryStringInstances;
    return this;
  }

  public QueryStringRulesForUpdateCdnConfigInput addQueryStringInstancesItem(QueryStringInstanceForUpdateCdnConfigInput queryStringInstancesItem) {
    if (this.queryStringInstances == null) {
      this.queryStringInstances = new ArrayList<QueryStringInstanceForUpdateCdnConfigInput>();
    }
    this.queryStringInstances.add(queryStringInstancesItem);
    return this;
  }

   /**
   * Get queryStringInstances
   * @return queryStringInstances
  **/
  @Valid
  @Schema(description = "")
  public List<QueryStringInstanceForUpdateCdnConfigInput> getQueryStringInstances() {
    return queryStringInstances;
  }

  public void setQueryStringInstances(List<QueryStringInstanceForUpdateCdnConfigInput> queryStringInstances) {
    this.queryStringInstances = queryStringInstances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryStringRulesForUpdateCdnConfigInput queryStringRulesForUpdateCdnConfigInput = (QueryStringRulesForUpdateCdnConfigInput) o;
    return Objects.equals(this.queryStringComponents, queryStringRulesForUpdateCdnConfigInput.queryStringComponents) &&
        Objects.equals(this.queryStringInstances, queryStringRulesForUpdateCdnConfigInput.queryStringInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryStringComponents, queryStringInstances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryStringRulesForUpdateCdnConfigInput {\n");
    
    sb.append("    queryStringComponents: ").append(toIndentedString(queryStringComponents)).append("\n");
    sb.append("    queryStringInstances: ").append(toIndentedString(queryStringInstances)).append("\n");
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