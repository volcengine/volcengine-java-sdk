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
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ExtraForListCloudAccountsOutput
 */



public class ExtraForListCloudAccountsOutput {
  @SerializedName("AccessToken")
  private String accessToken = null;

  @SerializedName("AkamaiEndpoint")
  private String akamaiEndpoint = null;

  @SerializedName("GcpType")
  private String gcpType = null;

  @SerializedName("ProductId")
  private String productId = null;

  @SerializedName("RefreshToken")
  private String refreshToken = null;

  @SerializedName("TenantId")
  private String tenantId = null;

  @SerializedName("WangsuAkSkEnabled")
  private Boolean wangsuAkSkEnabled = null;

  public ExtraForListCloudAccountsOutput accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @Schema(description = "")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public ExtraForListCloudAccountsOutput akamaiEndpoint(String akamaiEndpoint) {
    this.akamaiEndpoint = akamaiEndpoint;
    return this;
  }

   /**
   * Get akamaiEndpoint
   * @return akamaiEndpoint
  **/
  @Schema(description = "")
  public String getAkamaiEndpoint() {
    return akamaiEndpoint;
  }

  public void setAkamaiEndpoint(String akamaiEndpoint) {
    this.akamaiEndpoint = akamaiEndpoint;
  }

  public ExtraForListCloudAccountsOutput gcpType(String gcpType) {
    this.gcpType = gcpType;
    return this;
  }

   /**
   * Get gcpType
   * @return gcpType
  **/
  @Schema(description = "")
  public String getGcpType() {
    return gcpType;
  }

  public void setGcpType(String gcpType) {
    this.gcpType = gcpType;
  }

  public ExtraForListCloudAccountsOutput productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @Schema(description = "")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public ExtraForListCloudAccountsOutput refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  @Schema(description = "")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public ExtraForListCloudAccountsOutput tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @Schema(description = "")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public ExtraForListCloudAccountsOutput wangsuAkSkEnabled(Boolean wangsuAkSkEnabled) {
    this.wangsuAkSkEnabled = wangsuAkSkEnabled;
    return this;
  }

   /**
   * Get wangsuAkSkEnabled
   * @return wangsuAkSkEnabled
  **/
  @Schema(description = "")
  public Boolean isWangsuAkSkEnabled() {
    return wangsuAkSkEnabled;
  }

  public void setWangsuAkSkEnabled(Boolean wangsuAkSkEnabled) {
    this.wangsuAkSkEnabled = wangsuAkSkEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraForListCloudAccountsOutput extraForListCloudAccountsOutput = (ExtraForListCloudAccountsOutput) o;
    return Objects.equals(this.accessToken, extraForListCloudAccountsOutput.accessToken) &&
        Objects.equals(this.akamaiEndpoint, extraForListCloudAccountsOutput.akamaiEndpoint) &&
        Objects.equals(this.gcpType, extraForListCloudAccountsOutput.gcpType) &&
        Objects.equals(this.productId, extraForListCloudAccountsOutput.productId) &&
        Objects.equals(this.refreshToken, extraForListCloudAccountsOutput.refreshToken) &&
        Objects.equals(this.tenantId, extraForListCloudAccountsOutput.tenantId) &&
        Objects.equals(this.wangsuAkSkEnabled, extraForListCloudAccountsOutput.wangsuAkSkEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, akamaiEndpoint, gcpType, productId, refreshToken, tenantId, wangsuAkSkEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraForListCloudAccountsOutput {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    akamaiEndpoint: ").append(toIndentedString(akamaiEndpoint)).append("\n");
    sb.append("    gcpType: ").append(toIndentedString(gcpType)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    wangsuAkSkEnabled: ").append(toIndentedString(wangsuAkSkEnabled)).append("\n");
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