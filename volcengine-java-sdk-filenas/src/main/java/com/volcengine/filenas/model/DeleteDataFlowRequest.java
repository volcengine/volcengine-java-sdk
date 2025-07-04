/*
 * filenas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.filenas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.filenas.model.PolicyForDeleteDataFlowInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DeleteDataFlowRequest
 */



public class DeleteDataFlowRequest {
  @SerializedName("EnableDeleteTlsLogTopic")
  private Boolean enableDeleteTlsLogTopic = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Policy")
  private PolicyForDeleteDataFlowInput policy = null;

  public DeleteDataFlowRequest enableDeleteTlsLogTopic(Boolean enableDeleteTlsLogTopic) {
    this.enableDeleteTlsLogTopic = enableDeleteTlsLogTopic;
    return this;
  }

   /**
   * Get enableDeleteTlsLogTopic
   * @return enableDeleteTlsLogTopic
  **/
  @Schema(description = "")
  public Boolean isEnableDeleteTlsLogTopic() {
    return enableDeleteTlsLogTopic;
  }

  public void setEnableDeleteTlsLogTopic(Boolean enableDeleteTlsLogTopic) {
    this.enableDeleteTlsLogTopic = enableDeleteTlsLogTopic;
  }

  public DeleteDataFlowRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DeleteDataFlowRequest policy(PolicyForDeleteDataFlowInput policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @Valid
  @Schema(description = "")
  public PolicyForDeleteDataFlowInput getPolicy() {
    return policy;
  }

  public void setPolicy(PolicyForDeleteDataFlowInput policy) {
    this.policy = policy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDataFlowRequest deleteDataFlowRequest = (DeleteDataFlowRequest) o;
    return Objects.equals(this.enableDeleteTlsLogTopic, deleteDataFlowRequest.enableDeleteTlsLogTopic) &&
        Objects.equals(this.id, deleteDataFlowRequest.id) &&
        Objects.equals(this.policy, deleteDataFlowRequest.policy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableDeleteTlsLogTopic, id, policy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDataFlowRequest {\n");
    
    sb.append("    enableDeleteTlsLogTopic: ").append(toIndentedString(enableDeleteTlsLogTopic)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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
