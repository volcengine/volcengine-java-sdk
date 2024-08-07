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
import com.volcengine.cdn.model.RequestHeaderComponentsForUpdateCdnConfigInput;
import com.volcengine.cdn.model.RequestHeaderInstanceForUpdateCdnConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RequestHeaderRulesForUpdateCdnConfigInput
 */



public class RequestHeaderRulesForUpdateCdnConfigInput {
  @SerializedName("RequestHeaderComponents")
  private RequestHeaderComponentsForUpdateCdnConfigInput requestHeaderComponents = null;

  @SerializedName("RequestHeaderInstances")
  private List<RequestHeaderInstanceForUpdateCdnConfigInput> requestHeaderInstances = null;

  @SerializedName("RequestHost")
  private String requestHost = null;

  public RequestHeaderRulesForUpdateCdnConfigInput requestHeaderComponents(RequestHeaderComponentsForUpdateCdnConfigInput requestHeaderComponents) {
    this.requestHeaderComponents = requestHeaderComponents;
    return this;
  }

   /**
   * Get requestHeaderComponents
   * @return requestHeaderComponents
  **/
  @Valid
  @Schema(description = "")
  public RequestHeaderComponentsForUpdateCdnConfigInput getRequestHeaderComponents() {
    return requestHeaderComponents;
  }

  public void setRequestHeaderComponents(RequestHeaderComponentsForUpdateCdnConfigInput requestHeaderComponents) {
    this.requestHeaderComponents = requestHeaderComponents;
  }

  public RequestHeaderRulesForUpdateCdnConfigInput requestHeaderInstances(List<RequestHeaderInstanceForUpdateCdnConfigInput> requestHeaderInstances) {
    this.requestHeaderInstances = requestHeaderInstances;
    return this;
  }

  public RequestHeaderRulesForUpdateCdnConfigInput addRequestHeaderInstancesItem(RequestHeaderInstanceForUpdateCdnConfigInput requestHeaderInstancesItem) {
    if (this.requestHeaderInstances == null) {
      this.requestHeaderInstances = new ArrayList<RequestHeaderInstanceForUpdateCdnConfigInput>();
    }
    this.requestHeaderInstances.add(requestHeaderInstancesItem);
    return this;
  }

   /**
   * Get requestHeaderInstances
   * @return requestHeaderInstances
  **/
  @Valid
  @Schema(description = "")
  public List<RequestHeaderInstanceForUpdateCdnConfigInput> getRequestHeaderInstances() {
    return requestHeaderInstances;
  }

  public void setRequestHeaderInstances(List<RequestHeaderInstanceForUpdateCdnConfigInput> requestHeaderInstances) {
    this.requestHeaderInstances = requestHeaderInstances;
  }

  public RequestHeaderRulesForUpdateCdnConfigInput requestHost(String requestHost) {
    this.requestHost = requestHost;
    return this;
  }

   /**
   * Get requestHost
   * @return requestHost
  **/
  @Schema(description = "")
  public String getRequestHost() {
    return requestHost;
  }

  public void setRequestHost(String requestHost) {
    this.requestHost = requestHost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestHeaderRulesForUpdateCdnConfigInput requestHeaderRulesForUpdateCdnConfigInput = (RequestHeaderRulesForUpdateCdnConfigInput) o;
    return Objects.equals(this.requestHeaderComponents, requestHeaderRulesForUpdateCdnConfigInput.requestHeaderComponents) &&
        Objects.equals(this.requestHeaderInstances, requestHeaderRulesForUpdateCdnConfigInput.requestHeaderInstances) &&
        Objects.equals(this.requestHost, requestHeaderRulesForUpdateCdnConfigInput.requestHost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeaderComponents, requestHeaderInstances, requestHost);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestHeaderRulesForUpdateCdnConfigInput {\n");
    
    sb.append("    requestHeaderComponents: ").append(toIndentedString(requestHeaderComponents)).append("\n");
    sb.append("    requestHeaderInstances: ").append(toIndentedString(requestHeaderInstances)).append("\n");
    sb.append("    requestHost: ").append(toIndentedString(requestHost)).append("\n");
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
