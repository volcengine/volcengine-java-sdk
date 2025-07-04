/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

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
 * EnableAccessLogRequest
 */



public class EnableAccessLogRequest {
  @SerializedName("BucketName")
  private String bucketName = null;

  @SerializedName("DeliveryType")
  private String deliveryType = null;

  @SerializedName("LoadBalancerId")
  private String loadBalancerId = null;

  @SerializedName("TlsProjectId")
  private String tlsProjectId = null;

  @SerializedName("TlsTopicId")
  private String tlsTopicId = null;

  public EnableAccessLogRequest bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

   /**
   * Get bucketName
   * @return bucketName
  **/
  @Schema(description = "")
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }

  public EnableAccessLogRequest deliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

   /**
   * Get deliveryType
   * @return deliveryType
  **/
  @Schema(description = "")
  public String getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
  }

  public EnableAccessLogRequest loadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
    return this;
  }

   /**
   * Get loadBalancerId
   * @return loadBalancerId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getLoadBalancerId() {
    return loadBalancerId;
  }

  public void setLoadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
  }

  public EnableAccessLogRequest tlsProjectId(String tlsProjectId) {
    this.tlsProjectId = tlsProjectId;
    return this;
  }

   /**
   * Get tlsProjectId
   * @return tlsProjectId
  **/
  @Schema(description = "")
  public String getTlsProjectId() {
    return tlsProjectId;
  }

  public void setTlsProjectId(String tlsProjectId) {
    this.tlsProjectId = tlsProjectId;
  }

  public EnableAccessLogRequest tlsTopicId(String tlsTopicId) {
    this.tlsTopicId = tlsTopicId;
    return this;
  }

   /**
   * Get tlsTopicId
   * @return tlsTopicId
  **/
  @Schema(description = "")
  public String getTlsTopicId() {
    return tlsTopicId;
  }

  public void setTlsTopicId(String tlsTopicId) {
    this.tlsTopicId = tlsTopicId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnableAccessLogRequest enableAccessLogRequest = (EnableAccessLogRequest) o;
    return Objects.equals(this.bucketName, enableAccessLogRequest.bucketName) &&
        Objects.equals(this.deliveryType, enableAccessLogRequest.deliveryType) &&
        Objects.equals(this.loadBalancerId, enableAccessLogRequest.loadBalancerId) &&
        Objects.equals(this.tlsProjectId, enableAccessLogRequest.tlsProjectId) &&
        Objects.equals(this.tlsTopicId, enableAccessLogRequest.tlsTopicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketName, deliveryType, loadBalancerId, tlsProjectId, tlsTopicId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnableAccessLogRequest {\n");
    
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    loadBalancerId: ").append(toIndentedString(loadBalancerId)).append("\n");
    sb.append("    tlsProjectId: ").append(toIndentedString(tlsProjectId)).append("\n");
    sb.append("    tlsTopicId: ").append(toIndentedString(tlsTopicId)).append("\n");
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
