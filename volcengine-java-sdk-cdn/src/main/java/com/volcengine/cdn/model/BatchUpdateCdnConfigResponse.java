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
import com.volcengine.cdn.model.DeployResultForBatchUpdateCdnConfigOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BatchUpdateCdnConfigResponse
 */



public class BatchUpdateCdnConfigResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("DeployResult")
  private List<DeployResultForBatchUpdateCdnConfigOutput> deployResult = null;

  public BatchUpdateCdnConfigResponse deployResult(List<DeployResultForBatchUpdateCdnConfigOutput> deployResult) {
    this.deployResult = deployResult;
    return this;
  }

  public BatchUpdateCdnConfigResponse addDeployResultItem(DeployResultForBatchUpdateCdnConfigOutput deployResultItem) {
    if (this.deployResult == null) {
      this.deployResult = new ArrayList<DeployResultForBatchUpdateCdnConfigOutput>();
    }
    this.deployResult.add(deployResultItem);
    return this;
  }

   /**
   * Get deployResult
   * @return deployResult
  **/
  @Valid
  @Schema(description = "")
  public List<DeployResultForBatchUpdateCdnConfigOutput> getDeployResult() {
    return deployResult;
  }

  public void setDeployResult(List<DeployResultForBatchUpdateCdnConfigOutput> deployResult) {
    this.deployResult = deployResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchUpdateCdnConfigResponse batchUpdateCdnConfigResponse = (BatchUpdateCdnConfigResponse) o;
    return Objects.equals(this.deployResult, batchUpdateCdnConfigResponse.deployResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchUpdateCdnConfigResponse {\n");
    
    sb.append("    deployResult: ").append(toIndentedString(deployResult)).append("\n");
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
